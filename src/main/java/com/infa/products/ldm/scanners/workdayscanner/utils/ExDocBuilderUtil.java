package com.infa.products.ldm.scanners.workdayscanner.utils;

import com.infa.products.ldm.ingestion.DataExchangeDocBuilder;
import com.infa.products.ldm.ingestion.model.Link;
import com.infa.products.ldm.scanner.api.ObjectPathBuilder;
import org.apache.commons.lang3.ClassUtils;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import static com.infa.products.ldm.scanners.workdayscanner.model.Constants.*;

public class ExDocBuilderUtil {

    private List<String> paths;
    private ObjectPathBuilder objectIdBuilder;
    private DataExchangeDocBuilder docBuilder;

    private WorkdayUtil workdayUtil = new WorkdayUtil();

    String s1[] = new String[]{};
    String s2[] = new String[]{};

    public ExDocBuilderUtil(List<String> objectPaths, ObjectPathBuilder objectIdBuilder, DataExchangeDocBuilder docBuilder) {

        this.objectIdBuilder = objectIdBuilder;
        this.paths = objectPaths;
        this.docBuilder = docBuilder;

    }

    public DataExchangeDocBuilder getDocBuilder() {
        return docBuilder;
    }

    public void buildMetaData(Class clazz) {

        for (Field field : clazz.getDeclaredFields()) {

            if (!(ClassUtils.isPrimitiveOrWrapper(field.getType()) || workdayUtil.isAnySpecialWrapperClass(field.getType()))) {

                if (field.getType().getSimpleName().contains("[]")) {
                    String arrayType = field.getType().getComponentType().getSimpleName();

                    try {
                        Class clazzz = Class.forName(arrayType);

                        if(clazz.equals(clazzz)){
                            return;
                        }

                        addEntityToXDoc(field);
                        buildMetaData(clazzz);
                        paths.remove(paths.size() - 1);

                    } catch (ClassNotFoundException e) {
                        addPropertyToXDoc(field);
                        paths.remove(paths.size() - 1);
                    }
                } else if (field.getType().equals(List.class)) {
                    Class clazzz = getElementType(field);

                    if(clazz.equals(clazzz)){
                        return;
                    }


                    if (ClassUtils.isPrimitiveOrWrapper(clazzz) || workdayUtil.isAnySpecialWrapperClass(clazz)) {
                        addPropertyToXDoc(field);
                        paths.remove(paths.size() - 1);
                        continue;
                    }
                    addEntityToXDoc(field);
                    buildMetaData(clazzz);
                    paths.remove(paths.size() - 1);
                } else {

                    if(clazz.equals(field.getType())){
                        return;
                    }

                    addEntityToXDoc(field);
                    buildMetaData(field.getType());
                    paths.remove(paths.size() - 1);
                }

            } else {
                addPropertyToXDoc(field);
                paths.remove(paths.size() - 1);
            }
        }
    }

    private void addEntityToXDoc(Field field) {


        s1 = paths.toArray(s1);
        String entityParentObjectID = objectIdBuilder.append(s1).build();

        paths.add(field.getName());
        s1 = paths.toArray(s1);
        String entityChildObjectID = objectIdBuilder.append(s1).build();

        docBuilder.addObject(entityChildObjectID, ENTITY_CLASS_NAME);
        docBuilder.addProperty(entityChildObjectID, CORE_NAME_ATTR, field.getName());

        Link link = new Link(entityParentObjectID, entityChildObjectID, ENTITY_ENTITY_ASSOCIATION);
        docBuilder.addLink(link);
    }

    private void addPropertyToXDoc(Field field) {

        s1 = paths.toArray(s1);
        String entityObjectID = objectIdBuilder.append(s1).build();

        paths.add(field.getName());
        s1 = paths.toArray(s1);
        String propertyObjectID = null;
        try {
             propertyObjectID = objectIdBuilder.append(s1).build();
        }
        catch (Throwable t){

            System.out.println(t);
        }
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
