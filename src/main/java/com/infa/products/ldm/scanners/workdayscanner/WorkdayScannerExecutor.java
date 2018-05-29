package com.infa.products.ldm.scanners.workdayscanner;

import com.infa.products.ldm.framework.jobexec.common.EventObject;
import com.infa.products.ldm.framework.jobexec.common.OperationOutcome;
import com.infa.products.ldm.ingestion.BulkExchangeDocumentPublisher;
import com.infa.products.ldm.ingestion.model.DataExchangeDocument;
import com.infa.products.ldm.ingestion.model.PublishStatusKey;
import com.infa.products.ldm.scanner.api.*;
import com.infa.products.ldm.scanner.common.config.ResourceConfiguration;
import com.infa.products.ldm.scanners.workdayscanner.client.WorkdayRestClient;
import com.infa.products.ldm.scanners.workdayscanner.executors.DocExecutor;
import com.infa.products.ldm.scanners.workdayscanner.executors.ReportDocExecutor;
import com.infa.products.ldm.scanners.workdayscanner.helpers.ScannerHelper;
import com.infa.products.ldm.scanners.workdayscanner.model.WService;
import com.infa.products.ldm.scanners.workdayscanner.utils.ExDocBuilderUtil3;
import com.infa.products.ldm.scanners.workdayscanner.utils.WorkdayUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestClientException;
import report.workday.com.all_custom_reports.CustomReportEntryType;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

import static com.infa.products.ldm.scanners.workdayscanner.helpers.ScannerHelper.OperationPublisher;
import static com.infa.products.ldm.scanners.workdayscanner.model.Constants.*;

public class WorkdayScannerExecutor implements IScannerExecutor {

    private Logger logger = LoggerFactory.getLogger(WorkdayScannerExecutor.class);


    private ScannerHelper scannerHelper;
    private WorkdayRestClient workdayRestClient;
    private IScannerIngestionClientSession ingestionClient;
    private ObjectPathBuilder objectIdBuilder;
    private OperationPublisher publisher;

    private ExecutorService executorService = Executors.newFixedThreadPool(1);

    private Map<String, String> resourceMap;
    private List<String> objectPaths = new ArrayList<>();

    public static int noOfXDocPublished = 0;

    public WorkdayScannerExecutor() {


    }

    @Override
    public void init(IScannerCallback scannerCallback) throws ScannerExecutionException {

        ResourceConfiguration resourceConfiguration = scannerCallback.getResourceConfiguration();

        scannerHelper = new ScannerHelper(scannerCallback);
        resourceMap = scannerHelper.createResourceMap(resourceConfiguration);
        workdayRestClient = new WorkdayRestClient(resourceMap);
        ingestionClient = scannerCallback.getScannerIngestionClientSession();
        publisher = new OperationPublisher();

    }

    @Override
    public void execute() throws ScannerExecutionException {

        BulkExchangeDocumentPublisher bulkExchangeDocumentPublisher = ingestionClient.createBulkExchangeDocumentPublisher();


        Map<String, Map<String, String>> entityClassMapping = new HashMap<>();

        WorkdayUtil workdayUtil = new WorkdayUtil();

        File target = new File(System.getProperty("java.io.tmpdir"));
        String domain = resourceMap.get(WORKDAY_DOMAIN);
        String tenant = resourceMap.get(TENANT);
        String packageName = "com.workday.sources";
        List<Future<List<DataExchangeDocument>>> docList = new ArrayList<>();


        publisher.setOperationName(FETCH_PUBLIC_WEBSERVICES);
        publisher.setStartTime(System.currentTimeMillis());

        List<WService> publicWebServicesList;
        try {
            publicWebServicesList = workdayRestClient.fetchPublicWebServices(domain, tenant);
            publisher.setEndTime(System.currentTimeMillis());
            publisher.setOutcome(OperationOutcome.SUCCESS);
            publisher.publishOperation();

        } catch (RestClientException re) {
            publisher.setEndTime(System.currentTimeMillis());
            publisher.setOutcome(OperationOutcome.FAILURE);
            publisher.publishOperation();

            logger.error("Unable to fetch public webservices for the workday tenant");
            throw new ScannerExecutionException("Unable to fetch public webservices for the workday tenant");
        }

        for (WService service : publicWebServicesList) {
            System.out.println(service.getName());

        }


        for (WService service : publicWebServicesList) {

            Future<List<DataExchangeDocument>> dataExchangeDocuments = executorService.submit(new DocExecutor(resourceMap, service, entityClassMapping.get(service.getName()), bulkExchangeDocumentPublisher, ingestionClient, target));
            docList.add(dataExchangeDocuments);
            continue;

        }

        workdayUtil.waitForExecutorService(executorService);

        List<report.workday.com.data_sources.ReportEntryType> dataSourceReportEntries = workdayRestClient.fetchAllDataSources(resourceMap.get(WORKDAY_DOMAIN), resourceMap.get(TENANT));

        ExDocBuilderUtil3 exDocBuilderUtil3 = new ExDocBuilderUtil3(ingestionClient, resourceMap, bulkExchangeDocumentPublisher);

        List<DataExchangeDocument> dataSourceExchangeDocuments = exDocBuilderUtil3.buildDataSourceExDocs(dataSourceReportEntries);

        List<CustomReportEntryType> reportEntries = workdayRestClient.fetchCustomReports(resourceMap.get(WORKDAY_DOMAIN), resourceMap.get(TENANT));


        int reportsSize = reportEntries.size();
        int availableCores = Runtime.getRuntime().availableProcessors();
        int batchSize = (int) Math.ceil((double) reportsSize / availableCores);


        executorService = Executors.newFixedThreadPool(1);

        for (int i = 0; i < availableCores; i++) {
            Future<List<DataExchangeDocument>> dataExchangeDocuments = executorService.submit(new ReportDocExecutor(bulkExchangeDocumentPublisher, workdayUtil, target, packageName, reportEntries, i * batchSize, (i + 1) * batchSize, ingestionClient, resourceMap));
            docList.add(dataExchangeDocuments);
        }

        workdayUtil.waitForExecutorService(executorService);

        for (Future<List<DataExchangeDocument>> future : docList) {
            try {
                List<DataExchangeDocument> dataExchangeDocuments = future.get();
                for (DataExchangeDocument dataExchangeDocument : dataExchangeDocuments) {
                    try {
                        bulkExchangeDocumentPublisher.addExchangeDocument(dataExchangeDocument);
                    } catch (IOException e) {
                        throw new ScannerExecutionException(e.getMessage());
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        for (DataExchangeDocument dataExchangeDocument : dataSourceExchangeDocuments) {
            try {
                bulkExchangeDocumentPublisher.addExchangeDocument(dataExchangeDocument);
            } catch (IOException e) {
                throw new ScannerExecutionException(e.getMessage());
            }
        }

        PublishStatusKey key;

        publisher.setOperationName(PUBLISHING_XDOCS);
        publisher.setStartTime(System.currentTimeMillis());
        try {
            key = ingestionClient.publish(bulkExchangeDocumentPublisher);
            publisher.setEndTime(System.currentTimeMillis());
            publisher.setOutcome(OperationOutcome.SUCCESS);
            publisher.publishOperation();

            scannerHelper.updateTask("Number of ExDocs published", noOfXDocPublished + "");

        } catch (Exception e) {

            publisher.setEndTime(System.currentTimeMillis());
            publisher.setOutcome(OperationOutcome.FAILURE);
            publisher.publishOperation();

            logger.error(e.getMessage());
            throw new ScannerExecutionException("Publishing XDocs failed with exception " + e.getMessage());
        }

        if (!(isSkipWaitForIngestion())) {
            waitForIngestion(key, ingestionClient);
        }

    }

    private boolean isSkipWaitForIngestion() {
        String skipWaitForIngestion = System.getProperty("SKIP_WAIT_FOR_INGESTION");
        if (skipWaitForIngestion == null || skipWaitForIngestion.equals(""))
            skipWaitForIngestion = System.getenv("SKIP_WAIT_FOR_INGESTION");
        if (skipWaitForIngestion != null && skipWaitForIngestion.equalsIgnoreCase("true"))
            return true;
        return false;
    }


    protected void waitForIngestion(PublishStatusKey key, IScannerIngestionClientSession ingestionClient) {

        while (!ingestionClient.checkPublishStatus(key).isIngested()) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void pause() throws ScannerExecutionException {
        //logger.info(LoggerMsg.getText(LoggerMsg.PAUSE_REQUESTED));
    }

    @Override
    public void resume() throws ScannerExecutionException {
        //logger.info(LoggerMsg.getText(LoggerMsg.RESUME_REQUESTED));
    }

    @Override
    public void cancel() throws ScannerExecutionException {
        //logger.info(LoggerMsg.getText(LoggerMsg.CANCEL_REQUESTED));
    }

    @Override
    public void deinit() throws ScannerExecutionException {

    }

    @Override
    public void handleEvent(EventObject event) throws ScannerExecutionException {

    }
}
