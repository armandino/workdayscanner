package com.infa.products.ldm.scanners.workdayscanner.model;


import javax.swing.plaf.PanelUI;

public class Constants {


    private Constants() {

    }

    public static final String RESOURCE_NAME = "resourceName";
    public static final String RESOURCE_TYPE = "resourceType";
    public static final String SCANNER_ID = "scannerID";

    public static final String USERNAME = "Username";
    public static final String PASSWORD = "Password";
    public static final String TENANT = "Tenant";
    public static final String WORKDAY_DOMAIN = "WorkdayDomain";
    public static final String VERSION = "Version";
    public static final String MEMORY = "Memory";
    public static final String CUSTOM_JVM_OPTIONS = "CustomJVMOptions";

    public static final String SERVICE_CLASS_NAME = "com.infa.workday.connector.Service";
    public static final String ENTITY_CLASS_NAME = "com.infa.workday.connector.Entity";
    public static final String OPERATION_CLASS_NAME = "com.infa.workday.connector.Operation";
    public static final String PROPERTY_CLASS_NAME = "com.infa.workday.connector.Property";
    public static final String REPORT_CLASS_NAME = "com.infa.workday.connector.Report";
    public static final String DATA_SOURCE_CLASS_NAME = "com.infa.workday.connector.DataSource";


    public static final String SERVICE_ENTITY_ASSOCIATION = "com.infa.workday.connector.ServiceEntity";
    public static final String SERVICE_OPERATION_ASSOCIATION = "com.infa.workday.connector.ServiceOperation";
    public static final String ENTITY_ENTITY_ASSOCIATION = "com.infa.workday.connector.Entity2Entity";
    public static final String ENTITY_PROPERTY_ASSOCIATION = "com.infa.workday.connector.EntityProperty";
    public static final String REPORT_PROPERTY_ASSOCIATION = "com.infa.workday.connector.ReportProperty";
    public static final String DATASOURCE_REPORT_ASSOCIATION = "com.infa.workday.connector.DataSourceReport";


    public static final String DATA_TYPE_ATTR = "com.infa.workday.connector.DataType";
    public static final String VERSION_ATTR = "com.infa.workday.connector.version";
    public static final String REPORT_TYPE_ATTR = "com.infa.workday.connector.ReportType";
    public static final String DATA_SOURCE_TYPE_ATTR = "com.infa.workday.connector.DataSourceType";
    public static final String DATA_SOURCE_CATEGORY_ATTR = "com.infa.workday.connector.Category";
    public static final String DATA_SOURCE_BUSINESS_OBJECT_ATTR = "com.infa.workday.connector.BusinessObject";
    public static final String REPORT_TAG_ATTR = "com.infa.workday.connector.ReportTag";
    public static final String REPORT_OWNER_ATTR = "com.infa.workday.connector.ReportOwner";


    public static final String CORE_NAME_ATTR = "core.name";
    public static final String CORE_DESC_ATTR = "core.description";
    public static final String CORE_RESOURCE_NAME = "core.resourceName";
    public static final String CORE_RESOURCE_TYPE = "core.resourceType";


    //Statistical Operation Names
    public static final String FETCH_PUBLIC_WEBSERVICES = "FETCH_PUBLIC_WEBSERVICES";
    public static final String FETCH_XSD_FILE = "FETCH_XSD_FILE";
    public static final String GENERATE_SOURCES = "GENERATE_SOURCES";
    public static final String COMPILE_AND_LOAD_CLASSES = "COMPILE_AND_LOAD_CLASSES";
    public static final String GENERATING_XDOCS = "GENERATING_XDOCS";
    public static final String PUBLISHING_XDOCS = "PUBLISHING_XDOCS";
    public static final String PUBLISHING_FINISHED = "PUBLISHING_FINISHED";


    public static final String ENTITY = "ENTITY";
    public static final String MAIN_ENTITY = "MAINENTITY";
    public static final String OPERATION = "OPERATION";
    public static final String SERVICE = "SERVICE";

    public static  final String CUSTOM_REPORT_XSD_URL = "https://%s/ccx/service/customreport2/%s/%s/%s?xsds";
}
