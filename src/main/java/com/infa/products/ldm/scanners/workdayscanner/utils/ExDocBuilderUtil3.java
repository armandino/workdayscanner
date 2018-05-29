package com.infa.products.ldm.scanners.workdayscanner.utils;


import com.infa.products.ldm.ingestion.BulkExchangeDocumentPublisher;
import com.infa.products.ldm.ingestion.DataExchangeDocBuilder;
import com.infa.products.ldm.ingestion.model.DataExchangeDocument;
import com.infa.products.ldm.ingestion.model.Link;
import com.infa.products.ldm.scanner.api.IScannerIngestionClientSession;
import com.infa.products.ldm.scanner.api.ObjectPathBuilder;
import com.infa.products.ldm.scanner.api.ScannerExecutionException;
import com.infa.products.ldm.scanners.workdayscanner.WorkdayScannerExecutor;
import com.infa.products.ldm.scanners.workdayscanner.helpers.ScannerHelper;
import org.apache.commons.lang3.ClassUtils;
import report.workday.com.data_sources.ReportDataType;
import report.workday.com.data_sources.UniqueIdentifierObjectType;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import static com.infa.products.ldm.scanners.workdayscanner.model.Constants.*;

public class ExDocBuilderUtil3 {

    private DataExchangeDocBuilder docBuilder;
    private IScannerIngestionClientSession ingestionClient;
    private BulkExchangeDocumentPublisher bulkExchangeDocumentPublisher;
    private ObjectPathBuilder objectIdBuilder;
    private ObjectPathBuilder exDocIdBuilder;
    private List<String> paths;
    private static Map<String, Integer> xDocNames = new HashMap<>();
    private ScannerHelper scannerHelper;
    private Map<String, String> resourceMap;


    private List<DataExchangeDocument> dataExchangeDocuments = new ArrayList<>();

    private WorkdayUtil workdayUtil = new WorkdayUtil();

    public ExDocBuilderUtil3(){}


    public ExDocBuilderUtil3(IScannerIngestionClientSession ingestionClient, Map<String, String> resourceMap, BulkExchangeDocumentPublisher bulkExchangeDocumentPublisher) {
        this.ingestionClient = ingestionClient;
        this.resourceMap = resourceMap;
        this.scannerHelper = new ScannerHelper();
        this.bulkExchangeDocumentPublisher = bulkExchangeDocumentPublisher;

    }


    public ExDocBuilderUtil3(DataExchangeDocBuilder docBuilder, IScannerIngestionClientSession ingestionClient, BulkExchangeDocumentPublisher bulkExchangeDocumentPublisher, ObjectPathBuilder objectIdBuilder, ObjectPathBuilder exDocIdBuilder,
                             List<String> objectPaths, Map<String, String> resourceMap) {

        this.docBuilder = docBuilder;
        this.ingestionClient = ingestionClient;
        this.bulkExchangeDocumentPublisher = bulkExchangeDocumentPublisher;
        this.exDocIdBuilder = exDocIdBuilder;
        this.objectIdBuilder = objectIdBuilder;
        this.paths = objectPaths;
        this.scannerHelper = new ScannerHelper();
        this.resourceMap = resourceMap;


    }

    public DataExchangeDocBuilder getDocBuilder() {
        return docBuilder;
    }

    public List<DataExchangeDocument> getDataExchangeDocuments() {
        return dataExchangeDocuments;
    }

    private String generateExDocName(String name) {

        Integer count = xDocNames.get(name);

        xDocNames.put(name, count == null ? 1 : count + 1);
        if (count == null) {
            return name;
        } else {
            return name + (count + 1);
        }
    }

    public static boolean isCollectionField(Field field) {

        return Collection.class.isAssignableFrom(field.getType());
    }

    public void buildMetaData(Class clazz, DataExchangeDocBuilder docBuilder) throws IOException {

        for (Field field : clazz.getDeclaredFields()) {

            if (!(ClassUtils.isPrimitiveOrWrapper(field.getType()) || workdayUtil.isAnySpecialWrapperClass(field.getType()))) {

                if (field.getType().getSimpleName().contains("[]")) {
                    String arrayType = field.getType().getComponentType().getSimpleName();

                    try {
                        Class clazzz = Class.forName(arrayType);
                        if (clazz.equals(clazzz)) {
                            return;
                        }
                        DataExchangeDocBuilder dataExchangeDocBuilder = ingestionClient.createDataExchangeDocBuilder(exDocIdBuilder.append(ENTITY, generateExDocName(clazzz.getSimpleName())).build());

                        addEntityToXDoc(field, dataExchangeDocBuilder);
                        buildMetaData(clazzz, dataExchangeDocBuilder);
                        paths.remove(paths.size() - 1);

                    } catch (ClassNotFoundException e) {
                        addPropertyToXDoc(field, docBuilder);
                        paths.remove(paths.size() - 1);
                    }
                } else if (isCollectionField(field)) {
                    Class clazzz = getElementType(field);

                    if (ClassUtils.isPrimitiveOrWrapper(clazzz) || workdayUtil.isAnySpecialWrapperClass(clazz)) {
                        addPropertyToXDoc(field, docBuilder);
                        paths.remove(paths.size() - 1);
                        continue;
                    }

                    if (clazz.equals(clazzz)) {
                        return;
                    }

                    DataExchangeDocBuilder dataExchangeDocBuilder = ingestionClient.createDataExchangeDocBuilder(exDocIdBuilder.append(ENTITY, generateExDocName(clazzz.getSimpleName())).build());
                    addEntityToXDoc(field, dataExchangeDocBuilder);
                    buildMetaData(clazzz, dataExchangeDocBuilder);
                    paths.remove(paths.size() - 1);
                } else {

                    if (clazz.equals(field.getType())) {
                        return;
                    }

                    DataExchangeDocBuilder dataExchangeDocBuilder = ingestionClient.createDataExchangeDocBuilder(exDocIdBuilder.append(ENTITY, generateExDocName(field.getType().getSimpleName())).build());
                    addEntityToXDoc(field, dataExchangeDocBuilder);
                    buildMetaData(field.getType(), dataExchangeDocBuilder);
                    paths.remove(paths.size() - 1);
                }

            } else {
                addPropertyToXDoc(field, docBuilder);
                paths.remove(paths.size() - 1);
            }
        }

        DataExchangeDocument dataExchangeDocument = docBuilder.build();
        dataExchangeDocuments.add(dataExchangeDocument);
        WorkdayScannerExecutor.noOfXDocPublished++;
    }


    private void addEntityToXDoc(Field field, DataExchangeDocBuilder docBuilder) {

        String s[] = new String[]{};
        s = paths.toArray(s);
        String entityParentObjectID = objectIdBuilder.append(s).build();

        String fieldName = workdayUtil.capitalize(field.getName());
        paths.add(fieldName);
        s = paths.toArray(s);
        String entityChildObjectID = objectIdBuilder.append(s).build();

        docBuilder.addObject(entityChildObjectID, ENTITY_CLASS_NAME);
        scannerHelper.addResourceProperties(resourceMap, docBuilder, entityChildObjectID);
        docBuilder.addProperty(entityChildObjectID, CORE_NAME_ATTR, fieldName);

        Link link = new Link(entityParentObjectID, entityChildObjectID, ENTITY_ENTITY_ASSOCIATION);
        docBuilder.addLink(link);
    }

    private void addPropertyToXDoc(Field field, DataExchangeDocBuilder docBuilder) {

        String s[] = new String[]{};
        s = paths.toArray(s);
        String entityObjectID = objectIdBuilder.append(s).build();

        paths.add(field.getName());
        s = paths.toArray(s);
        String propertyObjectID = objectIdBuilder.append(s).build();

        docBuilder.addObject(propertyObjectID, PROPERTY_CLASS_NAME);
        scannerHelper.addResourceProperties(resourceMap, docBuilder, propertyObjectID);
        docBuilder.addProperty(propertyObjectID, CORE_NAME_ATTR, field.getName());
        docBuilder.addProperty(propertyObjectID, DATA_TYPE_ATTR, field.getType().getSimpleName());

        Link link = new Link(entityObjectID, propertyObjectID, ENTITY_PROPERTY_ASSOCIATION);
        docBuilder.addLink(link);
    }

    public static Class getElementType(Field field) {

        ParameterizedType stringListType = (ParameterizedType) field.getGenericType();
        return (Class<?>) stringListType.getActualTypeArguments()[0];
    }


    public void extractAndAddDocuments(List<Future<List<DataExchangeDocument>>> docList) throws ScannerExecutionException {
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
    }


    public List<DataExchangeDocument> buildDataSourceExDocs(List<report.workday.com.data_sources.ReportEntryType> reportEntries) {

        List<DataExchangeDocument> dataExchangeDocuments = new ArrayList<>();

        String resourceName = resourceMap.get(RESOURCE_NAME);
        for (report.workday.com.data_sources.ReportEntryType reportEntry : reportEntries) {
            ObjectPathBuilder objectIdBuilder = ObjectPathBuilder.createObjectIdBuilder(resourceName);
            ObjectPathBuilder exDocIdBuilder = ObjectPathBuilder.createObjectIdBuilder(resourceName);
            String dataSourceName = reportEntry.getDataSource().getDescriptor();

            dataSourceName = dataSourceName.replaceAll(" ", "_") + "_DS";
            DataExchangeDocBuilder dataExchangeDocBuilder = ingestionClient.createDataExchangeDocBuilder(exDocIdBuilder.append(dataSourceName).build());

            String dataSourceObjectId = objectIdBuilder.append(dataSourceName).build();

            dataExchangeDocBuilder.addObject(dataSourceObjectId, DATA_SOURCE_CLASS_NAME);
            scannerHelper.addResourceProperties(resourceMap, dataExchangeDocBuilder, dataSourceObjectId);
            dataExchangeDocBuilder.addProperty(dataSourceObjectId, CORE_NAME_ATTR, reportEntry.getDataSource().getDescriptor());
            dataExchangeDocBuilder.addProperty(dataSourceObjectId, CORE_DESC_ATTR, reportEntry.getDescription());
            dataExchangeDocBuilder.addProperty(dataSourceObjectId, DATA_SOURCE_TYPE_ATTR, reportEntry.getDataSourceType());
            for (UniqueIdentifierObjectType identifier : reportEntry.getCategory()) {
                dataExchangeDocBuilder.addProperty(dataSourceObjectId, DATA_SOURCE_CATEGORY_ATTR, identifier.getDescriptor());
            }

            dataExchangeDocBuilder.addProperty(dataSourceObjectId, DATA_SOURCE_BUSINESS_OBJECT_ATTR, reportEntry.getPrimaryBusinessObject());


            String resourceObjectId = ObjectPathBuilder.createObjectIdBuilder(resourceName).append(resourceName).build();
            dataExchangeDocBuilder.addLink(new Link(resourceObjectId, dataSourceObjectId, "core.ResourceParentChild"));

            DataExchangeDocument dataExchangeDocument = dataExchangeDocBuilder.build();
            dataExchangeDocuments.add(dataExchangeDocument);
            WorkdayScannerExecutor.noOfXDocPublished++;

        }

        return dataExchangeDocuments;

    }


}
