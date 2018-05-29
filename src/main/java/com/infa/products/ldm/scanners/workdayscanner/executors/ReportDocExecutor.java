package com.infa.products.ldm.scanners.workdayscanner.executors;

import com.infa.products.ldm.ingestion.BulkExchangeDocumentPublisher;
import com.infa.products.ldm.ingestion.DataExchangeDocBuilder;
import com.infa.products.ldm.ingestion.model.DataExchangeDocument;
import com.infa.products.ldm.ingestion.model.Link;
import com.infa.products.ldm.scanner.api.IScannerIngestionClientSession;
import com.infa.products.ldm.scanner.api.ObjectPathBuilder;
import com.infa.products.ldm.scanners.workdayscanner.WorkdayScannerExecutor;
import com.infa.products.ldm.scanners.workdayscanner.helpers.ScannerHelper;
import com.infa.products.ldm.scanners.workdayscanner.model.ReportType;
import com.infa.products.ldm.scanners.workdayscanner.utils.ExDocBuilderUtil3;
import com.infa.products.ldm.scanners.workdayscanner.utils.WorkdayUtil;
import org.apache.commons.lang3.ClassUtils;
import report.workday.com.all_custom_reports.CustomReportEntryType;
import report.workday.com.all_custom_reports.DataSourceObjectType;
import report.workday.com.all_custom_reports.ReportTagObjectType;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

import static com.infa.products.ldm.scanners.workdayscanner.model.Constants.*;

public class ReportDocExecutor implements Callable<List<DataExchangeDocument>> {

    private BulkExchangeDocumentPublisher bulkExchangeDocumentPublisher;
    private WorkdayUtil workdayUtil;
    private File target;
    private String packageName;
    private List<CustomReportEntryType> reportEntries;
    private IScannerIngestionClientSession ingestionClient;
    private ScannerHelper scannerHelper;
    private Map<String, String> resourceMap;
    private int startIndex;
    private int endIndex;

    private String resourceObjectId;
    List<DataExchangeDocument> dataExchangeDocuments = new ArrayList<>();


    public ReportDocExecutor(BulkExchangeDocumentPublisher bulkExchangeDocumentPublisher, WorkdayUtil workdayUtil, File target,
                             String packageName, List<CustomReportEntryType> reportEntries,
                             int startIndex, int endIndex, IScannerIngestionClientSession ingestionClient, Map<String, String> resourceMap) {

        this.scannerHelper = new ScannerHelper();
        this.bulkExchangeDocumentPublisher = bulkExchangeDocumentPublisher;
        this.workdayUtil = workdayUtil;
        this.target = target;
        this.reportEntries = reportEntries;
        this.ingestionClient = ingestionClient;
        this.resourceMap = resourceMap;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.packageName = packageName;
        this.resourceObjectId = ObjectPathBuilder.createObjectIdBuilder(resourceMap.get(RESOURCE_NAME)).append(resourceMap.get(RESOURCE_NAME)).build();

    }


    private void addExDocs(DataExchangeDocBuilder dataExchangeDocBuilder) {
        DataExchangeDocument dataExchangeDocument = dataExchangeDocBuilder.build();
        dataExchangeDocuments.add(dataExchangeDocument);
        WorkdayScannerExecutor.noOfXDocPublished++;
    }


    @Override
    public List<DataExchangeDocument> call() throws Exception {


        for (int i = startIndex; i < endIndex && i < reportEntries.size(); i++) {

            CustomReportEntryType customReport = reportEntries.get(i);

            String reportName = customReport.getCustomReport().getDescriptor();
            reportName = reportName.replaceAll(" ", "_");
            String reportOwner = customReport.getReportOwner().getDescriptor();
            reportOwner = reportOwner.split("/")[0];
            reportOwner = reportOwner.trim();

            DataSourceObjectType dataSource = customReport.getDataSource();

            ObjectPathBuilder objectIdBuilder = ObjectPathBuilder.createObjectIdBuilder(resourceMap.get(RESOURCE_NAME));
            ObjectPathBuilder exDocIdBuilder = ObjectPathBuilder.createObjectIdBuilder(resourceMap.get(RESOURCE_NAME));
            DataExchangeDocBuilder dataExchangeDocBuilder = ingestionClient.createDataExchangeDocBuilder(exDocIdBuilder.append(reportName).build());


            String reportObjectId = objectIdBuilder.append(reportName).build();
            dataExchangeDocBuilder.addObject(reportObjectId, REPORT_CLASS_NAME);
            scannerHelper.addResourceProperties(resourceMap, dataExchangeDocBuilder, reportObjectId);
            dataExchangeDocBuilder.addProperty(reportObjectId, CORE_NAME_ATTR, customReport.getCustomReport().getDescriptor());
            dataExchangeDocBuilder.addProperty(reportObjectId, CORE_DESC_ATTR, customReport.getDescription());
            dataExchangeDocBuilder.addProperty(reportObjectId, REPORT_TYPE_ATTR, customReport.getReportType().getDescriptor());
            for (ReportTagObjectType reportTagObject : customReport.getReportTags()) {
                dataExchangeDocBuilder.addProperty(reportObjectId, REPORT_TAG_ATTR, reportTagObject.getDescriptor());
            }
            dataExchangeDocBuilder.addProperty(reportObjectId, REPORT_OWNER_ATTR, customReport.getReportOwner().getDescriptor());

            dataExchangeDocBuilder.addLink(new Link(resourceObjectId, reportObjectId, "core.ResourceParentChild"));

            String dataSourceObjectId = objectIdBuilder.append(dataSource.getDescriptor().replaceAll(" ", "_")).build() + "_DS";
            dataExchangeDocBuilder.addLink(new Link(dataSourceObjectId, reportObjectId, DATASOURCE_REPORT_ASSOCIATION));


            if (!customReport.getReportType().getDescriptor().equals(ReportType.ADVANCED.getReportType())) {
                addExDocs(dataExchangeDocBuilder);
                continue;
            }

            File reportDirectory = new File(target.getPath() + "/" + reportName);
            if (reportDirectory.exists()) {
                workdayUtil.deleteDirectory(reportDirectory);
            }

            reportDirectory.mkdir();

            String reportXSDUrl = String.format(CUSTOM_REPORT_XSD_URL, resourceMap.get(WORKDAY_DOMAIN), resourceMap.get(TENANT), reportOwner, reportName);

            File reportFile = null;
            try {
                reportFile = workdayUtil.createFile(reportDirectory + "/" + reportName + ".xsd");
            } catch (Exception e) {
                addExDocs(dataExchangeDocBuilder);
                continue;
            }

            try {
                workdayUtil.fetchFile(reportXSDUrl, reportFile);
            } catch (Exception e) {
                addExDocs(dataExchangeDocBuilder);
                continue;
            }

            String outputDirectory = null;
            try {
                outputDirectory = workdayUtil.generateSourcesFromXSD(reportName, reportDirectory, packageName);
            } catch (Exception e) {
                addExDocs(dataExchangeDocBuilder);
                continue;
            }

            ClassLoader classLoader = null;
            try {
                classLoader = workdayUtil.compileSourcesAndLoadClasses(outputDirectory, packageName);
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | MalformedURLException e) {
                addExDocs(dataExchangeDocBuilder);
                continue;
            }

            Class clazz = null;
            try {
                clazz = Class.forName(packageName + ".ReportEntryType", true, classLoader);
            } catch (ClassNotFoundException e) {
                addExDocs(dataExchangeDocBuilder);
                continue;
            }

            for (Field field : clazz.getDeclaredFields()) {


                //  ExDocBuilderUtil3 exDocBuilderUtil = new ExDocBuilderUtil3();

                // if (ClassUtils.isPrimitiveOrWrapper(field.getType()) || workdayUtil.isAnySpecialWrapperClass(field.getType())) {
                String propertyObjectId = objectIdBuilder.append(reportName, field.getName()).build();
                dataExchangeDocBuilder.addObject(propertyObjectId, PROPERTY_CLASS_NAME);
                scannerHelper.addResourceProperties(resourceMap, dataExchangeDocBuilder, propertyObjectId);
                dataExchangeDocBuilder.addProperty(propertyObjectId, CORE_NAME_ATTR, field.getName());
                dataExchangeDocBuilder.addProperty(propertyObjectId, CORE_DESC_ATTR, field.getName());
                dataExchangeDocBuilder.addProperty(propertyObjectId, DATA_TYPE_ATTR, field.getType().getSimpleName());
                dataExchangeDocBuilder.addLink(new Link(reportObjectId, propertyObjectId, REPORT_PROPERTY_ASSOCIATION));
//
//                } else if (ExDocBuilderUtil3.isCollectionField(field)) {
//                    Class clazzz = ExDocBuilderUtil3.getElementType(field);
//                    exDocBuilderUtil.buildMetaData(clazz, dataExchangeDocBuilder);
//                    dataExchangeDocuments.addAll(exDocBuilderUtil.getDataExchangeDocuments());
//
//                }
//                else {
//                     exDocBuilderUtil.buildMetaData(field.getType(),dataExchangeDocBuilder);
//                    dataExchangeDocuments.addAll(exDocBuilderUtil.getDataExchangeDocuments());
//                }

            }

            addExDocs(dataExchangeDocBuilder);

            workdayUtil.deleteDirectory(reportDirectory);
        }


        return dataExchangeDocuments;
    }


}
