package com.infa.products.ldm.scanners.workdayscanner.utils;

import com.infa.products.ldm.ingestion.BulkExchangeDocumentPublisher;
import com.infa.products.ldm.ingestion.DataExchangeDocBuilder;
import com.infa.products.ldm.ingestion.model.DataExchangeDocument;
import com.infa.products.ldm.ingestion.model.Link;
import com.infa.products.ldm.scanner.api.IScannerIngestionClientSession;
import com.infa.products.ldm.scanner.api.ObjectPathBuilder;
import com.infa.products.ldm.scanners.workdayscanner.WorkdayScannerExecutor;
import org.apache.commons.lang3.ClassUtils;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.infa.products.ldm.scanners.workdayscanner.model.Constants.*;

public class ExDocBuilderUtil2 {

    private DataExchangeDocBuilder docBuilder;
    private IScannerIngestionClientSession ingestionClient;
    private BulkExchangeDocumentPublisher bulkExchangeDocumentPublisher;
    private ObjectPathBuilder objectIdBuilder;
    private ObjectPathBuilder exDocIdBuilder;
    private List<String> paths;
    private static Map<String, Integer> xDocNames = new HashMap<>();


    private WorkdayUtil workdayUtil = new WorkdayUtil();

    public ExDocBuilderUtil2(DataExchangeDocBuilder docBuilder, IScannerIngestionClientSession ingestionClient, BulkExchangeDocumentPublisher bulkExchangeDocumentPublisher, ObjectPathBuilder objectIdBuilder, ObjectPathBuilder exDocIdBuilder, List<String> objectPaths) {

        this.docBuilder = docBuilder;
        this.ingestionClient = ingestionClient;
        this.bulkExchangeDocumentPublisher = bulkExchangeDocumentPublisher;
        this.exDocIdBuilder = exDocIdBuilder;
        this.objectIdBuilder = objectIdBuilder;
        this.paths = objectPaths;


    }

    public DataExchangeDocBuilder getDocBuilder() {
        return docBuilder;
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

    public void buildMetaData(Class clazz, DataExchangeDocBuilder docBuilder) throws IOException {

        for (Field field : clazz.getDeclaredFields()) {

            if (!(ClassUtils.isPrimitiveOrWrapper(field.getType()) || workdayUtil.isAnySpecialWrapperClass(field.getType()))) {

                if (field.getType().getSimpleName().contains("[]")) {
                    String arrayType = field.getType().getComponentType().getSimpleName();

                    try {
                        Class clazzz = Class.forName(arrayType);
                        DataExchangeDocBuilder dataExchangeDocBuilder = ingestionClient.createDataExchangeDocBuilder(exDocIdBuilder.append(ENTITY, generateExDocName(clazzz.getSimpleName())).build());

                        addEntityToXDoc(field, dataExchangeDocBuilder);
                        buildMetaData(clazzz, dataExchangeDocBuilder);
                        paths.remove(paths.size() - 1);

                    } catch (ClassNotFoundException e) {
                        addPropertyToXDoc(field, docBuilder);
                        paths.remove(paths.size() - 1);
                    }
                } else if (field.getType().equals(List.class)) {
                    Class clazzz = getElementType(field);

                    if (ClassUtils.isPrimitiveOrWrapper(clazzz) || workdayUtil.isAnySpecialWrapperClass(clazz)) {
                        addPropertyToXDoc(field, docBuilder);
                        paths.remove(paths.size() - 1);
                        continue;
                    }
                    DataExchangeDocBuilder dataExchangeDocBuilder = ingestionClient.createDataExchangeDocBuilder(exDocIdBuilder.append(ENTITY, generateExDocName(clazzz.getSimpleName())).build());
                    addEntityToXDoc(field, dataExchangeDocBuilder);
                    buildMetaData(clazzz, dataExchangeDocBuilder);
                    paths.remove(paths.size() - 1);
                } else {

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
        try{
            bulkExchangeDocumentPublisher.addExchangeDocument(dataExchangeDocument);
        }
        catch (Throwable e){
            System.out.println(e);
        }

        WorkdayScannerExecutor.noOfXDocPublished++;
    }


    private void addEntityToXDoc(Field field, DataExchangeDocBuilder docBuilder) {

        String s[] = new String[]{};
        s = paths.toArray(s);
        String entityParentObjectID = objectIdBuilder.append(s).build();

        paths.add(field.getName());
        s = paths.toArray(s);
        String entityChildObjectID = objectIdBuilder.append(s).build();

        docBuilder.addObject(entityChildObjectID, ENTITY_CLASS_NAME);
        docBuilder.addProperty(entityChildObjectID, CORE_NAME_ATTR, field.getName());

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
        docBuilder.addProperty(propertyObjectID, CORE_NAME_ATTR, field.getName());
        docBuilder.addProperty(propertyObjectID, DATA_TYPE_ATTR, field.getType().getSimpleName());

        Link link = new Link(entityObjectID, propertyObjectID, ENTITY_PROPERTY_ASSOCIATION);
        docBuilder.addLink(link);
    }

    private Class getElementType(Field field) {

        ParameterizedType stringListType = (ParameterizedType) field.getGenericType();
        return (Class<?>) stringListType.getActualTypeArguments()[0];
    }
}
