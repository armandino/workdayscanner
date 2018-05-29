package com.infa.products.ldm.scanners.workdayscanner.executors;

import com.infa.products.ldm.framework.jobexec.common.OperationOutcome;
import com.infa.products.ldm.ingestion.BulkExchangeDocumentPublisher;
import com.infa.products.ldm.ingestion.DataExchangeDocBuilder;
import com.infa.products.ldm.ingestion.model.DataExchangeDocument;
import com.infa.products.ldm.ingestion.model.Link;
import com.infa.products.ldm.scanner.api.IScannerIngestionClientSession;
import com.infa.products.ldm.scanner.api.ObjectPathBuilder;
import com.infa.products.ldm.scanner.api.ScannerExecutionException;
import com.infa.products.ldm.scanners.workdayscanner.WorkdayScannerExecutor;
import com.infa.products.ldm.scanners.workdayscanner.helpers.ScannerHelper;
import com.infa.products.ldm.scanners.workdayscanner.model.WService;
import com.infa.products.ldm.scanners.workdayscanner.utils.ExDocBuilderUtil3;
import com.infa.products.ldm.scanners.workdayscanner.utils.WorkdayUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.wsdl.Operation;
import javax.xml.bind.annotation.XmlElement;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

import static com.infa.products.ldm.scanners.workdayscanner.model.Constants.*;

public class DocExecutor implements Callable<List<DataExchangeDocument>> {

    Logger logger = LoggerFactory.getLogger(DocExecutor.class);

    WorkdayUtil workdayUtil = new WorkdayUtil();
    private Map<String, String> resourceMap;
    private WService service;
    private Map<String, String> entityClassMapping;
    private BulkExchangeDocumentPublisher bulkExchangeDocumentPublisher;
    private IScannerIngestionClientSession ingestionClient;
    private String packageName = "com.workday.sources";
    private File target;
    private ObjectPathBuilder objectIdBuilder;
    private List<String> objectPaths = new ArrayList<>();
    private DataExchangeDocBuilder docBuilder;
    private ScannerHelper.OperationPublisher publisher;
    private ScannerHelper scannerHelper;


    public DocExecutor(Map<String, String> resourceMap, WService service, Map<String, String> entityClassMapping, BulkExchangeDocumentPublisher bulkExchangeDocumentPublisher, IScannerIngestionClientSession ingestionClient, File target) {
        this.resourceMap = resourceMap;
        this.service = service;
        this.entityClassMapping = entityClassMapping != null ? entityClassMapping : new HashMap<>();
        this.bulkExchangeDocumentPublisher = bulkExchangeDocumentPublisher;
        this.ingestionClient = ingestionClient;
        this.target = new File(target.getPath());
        this.publisher = new ScannerHelper.OperationPublisher();
        this.scannerHelper = new ScannerHelper();
    }

    @Override
    public List<DataExchangeDocument> call() throws ScannerExecutionException {

        String xsdEndpoint = workdayUtil.buildXSDEndPoint(resourceMap.get(WORKDAY_DOMAIN), resourceMap.get(TENANT), service.getName(), resourceMap.get(VERSION));

        try {
            target = workdayUtil.createFile(target + "/Workday_" + service.getName());
            logger.info("Target Path for Service: " + target.getPath());

        } catch (IOException e) {
            logger.info("Error creating a folder for Service:" + target.getPath());
            throw new ScannerExecutionException("Error creating a folder for Service");
        }

        File sourcesDirectory = new File(target.getPath());
        if (sourcesDirectory.exists()) {
            workdayUtil.deleteDirectory(sourcesDirectory);
        }
        sourcesDirectory.mkdir();

        File xsdFile = null;
        try {
            xsdFile = workdayUtil.createFile(target.getAbsolutePath() + "/" + service.getName() + ".xsd");
        } catch (IOException e) {
            logger.info("Error creating xsd file:" + xsdFile.getPath());
            throw new ScannerExecutionException("Error creating xsd file");
        }

        publisher.setOperationName(service.getName() + "_" + FETCH_XSD_FILE);
        publisher.setStartTime(System.currentTimeMillis());

        try {
            workdayUtil.fetchFile(xsdEndpoint, xsdFile);
            publisher.setEndTime(System.currentTimeMillis());
            publisher.setOutcome(OperationOutcome.SUCCESS);
            publisher.publishOperation();

        } catch (IOException e) {
            publisher.setEndTime(System.currentTimeMillis());
            publisher.setOutcome(OperationOutcome.FAILURE);
            publisher.publishOperation();

            logger.error(e.getMessage());
            throw new ScannerExecutionException("Exception fetching the XSD File");
        }

        publisher.setOperationName(service.getName() + "_" + GENERATE_SOURCES);
        publisher.setStartTime(System.currentTimeMillis());


        String outputDirectory = null;
        try {
            outputDirectory = workdayUtil.generateSourcesFromXSD(service.getName(), target, packageName);
            publisher.setEndTime(System.currentTimeMillis());
            publisher.setOutcome(OperationOutcome.SUCCESS);
            publisher.publishOperation();
        } catch (IOException e) {
            publisher.setEndTime(System.currentTimeMillis());
            publisher.setOutcome(OperationOutcome.FAILURE);
            publisher.publishOperation();
            throw new ScannerExecutionException(" Exception in generating sources from XSD");
        }

        ClassLoader classLoader;

        publisher.setOperationName(service.getName() + "_" + COMPILE_AND_LOAD_CLASSES);
        publisher.setStartTime(System.currentTimeMillis());

        try {

            classLoader = workdayUtil.compileSourcesAndLoadClasses(outputDirectory, packageName);
            publisher.setEndTime(System.currentTimeMillis());
            publisher.setOutcome(OperationOutcome.SUCCESS);
            publisher.publishOperation();

        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | MalformedURLException e) {

            publisher.setEndTime(System.currentTimeMillis());
            publisher.setOutcome(OperationOutcome.FAILURE);
            publisher.publishOperation();

            logger.error(e.getMessage());
            throw new ScannerExecutionException(" Exception in compiling the sources and loading the classes");
        }

        String wsdlEndpoint = workdayUtil.buildWSDLEndPoint(resourceMap.get(WORKDAY_DOMAIN), resourceMap.get(TENANT), service.getName(), resourceMap.get(VERSION));
        File wsdlFile = null;
        try {
            wsdlFile = workdayUtil.createFile(target.getPath() + "/" + service.getName() + ".wsdl");
        } catch (IOException e) {
            logger.error("Error creating wsdl file:" + wsdlFile.getPath());
            throw new ScannerExecutionException("Error creating wsdl file");
        }
        try {
            workdayUtil.fetchFile(wsdlEndpoint, wsdlFile);
            publisher.setEndTime(System.currentTimeMillis());
            publisher.setOutcome(OperationOutcome.SUCCESS);
            publisher.publishOperation();

        } catch (IOException e) {
            publisher.setEndTime(System.currentTimeMillis());
            publisher.setOutcome(OperationOutcome.FAILURE);
            publisher.publishOperation();

            logger.error(e.getMessage());
            throw new ScannerExecutionException("Exception fetching the XSD File");
        }


        List<Operation> operations = workdayUtil.getPortTypeOperations(wsdlFile.getPath());

        Map<String, String> mapping = operations.stream()
                .filter(operation -> operation.getName().toUpperCase().startsWith("GET"))
                .collect(Collectors.toMap(op -> {
                    String operationName = op.getName();
                    return operationName.substring(4, operationName.length());
                }, op -> {
                    String operationName = op.getName();
                    operationName = operationName.substring(0, operationName.length());
                    operationName = (operationName + "ResponseType").replaceAll("_", "");
                    return operationName;
                }));


        mapping.forEach(entityClassMapping::put);

        publisher.setOperationName(service.getName() + "_" + GENERATING_XDOCS);
        publisher.setStartTime(System.currentTimeMillis());

        List<DataExchangeDocument> dataExchangeDocuments = new ArrayList<>();

        objectIdBuilder = ObjectPathBuilder.createObjectIdBuilder(resourceMap.get("resourceName"));

        ObjectPathBuilder exDocIdBuilder = ObjectPathBuilder.createExDocIdBuilder(resourceMap.get("resourceName"));
        DataExchangeDocBuilder dataExchangeDocBuilder = ingestionClient.createDataExchangeDocBuilder(exDocIdBuilder.append(SERVICE, service.getName()).build());
        objectIdBuilder = ObjectPathBuilder.createObjectIdBuilder(resourceMap.get("resourceName"));

        String serviceObjectID;
        String entityObjectID;

        String resourceObjectId = objectIdBuilder.append(resourceMap.get("resourceName")).build();

        objectPaths.clear();
        serviceObjectID = objectIdBuilder.append(service.getName()).build();
        objectPaths.add(service.getName());

        dataExchangeDocBuilder.addLink(new Link(resourceObjectId, serviceObjectID, "core.ResourceParentChild"));

        dataExchangeDocBuilder.addObject(serviceObjectID, SERVICE_CLASS_NAME);
        scannerHelper.addResourceProperties(resourceMap, dataExchangeDocBuilder, serviceObjectID);
        dataExchangeDocBuilder.addProperty(serviceObjectID, CORE_NAME_ATTR, service.getName());
        dataExchangeDocBuilder.addProperty(serviceObjectID, CORE_DESC_ATTR, service.getDescription());
        dataExchangeDocBuilder.addProperty(serviceObjectID, VERSION_ATTR, resourceMap.get(VERSION));

        DataExchangeDocument serviceDocument = dataExchangeDocBuilder.build();
        dataExchangeDocuments.add(serviceDocument);
        WorkdayScannerExecutor.noOfXDocPublished++;


        for (Operation op : operations) {

            dataExchangeDocBuilder = ingestionClient.createDataExchangeDocBuilder(exDocIdBuilder.append(OPERATION, op.getName()).build());
            String operationObjectID = objectIdBuilder.append(op.getName()).build();

            dataExchangeDocBuilder.addObject(operationObjectID, OPERATION_CLASS_NAME);
            scannerHelper.addResourceProperties(resourceMap, dataExchangeDocBuilder, operationObjectID);
            dataExchangeDocBuilder.addProperty(operationObjectID, CORE_NAME_ATTR, op.getName());
            dataExchangeDocBuilder.addProperty(operationObjectID, CORE_DESC_ATTR, op.getName());
            dataExchangeDocBuilder.addLink(new Link(serviceObjectID, operationObjectID, SERVICE_OPERATION_ASSOCIATION));

            DataExchangeDocument dataExchangeDocument = dataExchangeDocBuilder.build();
            dataExchangeDocuments.add(dataExchangeDocument);
            WorkdayScannerExecutor.noOfXDocPublished++;
        }


        for (String entity : entityClassMapping.keySet()) {

            String className = entityClassMapping.get(entity);

            Class<?> clazz;
            try {
                clazz = Class.forName(packageName + "." + className, true, classLoader);

            } catch (Throwable ex) {

                logger.error(ex.getMessage());
                continue;
                //throw new ScannerExecutionException("Class not found for the workday entity ");
            }

            for (Field field : clazz.getDeclaredFields()) {
                XmlElement xmlElement = field.getAnnotation(XmlElement.class);
                if (xmlElement != null && xmlElement.name().equals("Response_Data")) {
                    clazz = field.getType();
                    if (clazz.equals(List.class)) {
                        clazz = ExDocBuilderUtil3.getElementType(field);
                    }
                    break;
                }
            }


            dataExchangeDocBuilder = ingestionClient.createDataExchangeDocBuilder(exDocIdBuilder.append(MAIN_ENTITY, entity).build());

            String clazzName = workdayUtil.sanitizeEntityName(clazz.getSimpleName());
            objectPaths.clear();
            objectPaths.add(service.getName());
            objectPaths.add(clazzName);
            String[] ps = new String[]{};
            ps = objectPaths.toArray(ps);

            entityObjectID = objectIdBuilder.append(ps).build();

            dataExchangeDocBuilder.addObject(entityObjectID, ENTITY_CLASS_NAME);
            scannerHelper.addResourceProperties(resourceMap, dataExchangeDocBuilder, entityObjectID);
            dataExchangeDocBuilder.addProperty(entityObjectID, CORE_NAME_ATTR, clazzName);
            dataExchangeDocBuilder.addLink(new Link(serviceObjectID, entityObjectID, SERVICE_ENTITY_ASSOCIATION));

            // ExDocBuilderUtil exDocBuilderUtil = new ExDocBuilderUtil(objectPaths, objectIdBuilder, dataExchangeDocBuilder);

            ExDocBuilderUtil3 exDocBuilderUtil = new ExDocBuilderUtil3(dataExchangeDocBuilder, ingestionClient, bulkExchangeDocumentPublisher, objectIdBuilder, exDocIdBuilder, objectPaths, resourceMap);

            try {
                exDocBuilderUtil.buildMetaData(clazz, dataExchangeDocBuilder);
                dataExchangeDocuments.addAll(exDocBuilderUtil.getDataExchangeDocuments());
                publisher.setEndTime(System.currentTimeMillis());
                publisher.setOutcome(OperationOutcome.SUCCESS);
                publisher.publishOperation();
            } catch (IOException e) {

                publisher.setEndTime(System.currentTimeMillis());
                publisher.setOutcome(OperationOutcome.SUCCESS);
                publisher.publishOperation();
                throw new ScannerExecutionException(e.getMessage());

            }

        }

        workdayUtil.deleteDirectory(target);
        return dataExchangeDocuments;

    }


}
