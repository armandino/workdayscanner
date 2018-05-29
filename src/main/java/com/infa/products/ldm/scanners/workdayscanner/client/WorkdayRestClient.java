package com.infa.products.ldm.scanners.workdayscanner.client;

import com.infa.products.ldm.scanners.workdayscanner.model.WService;
import com.infa.products.ldm.scanners.workdayscanner.model.WorkdayAPI;

import org.restlet.engine.util.Base64;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import report.workday.com.all_custom_reports.CustomReportDataType;
import report.workday.com.all_custom_reports.CustomReportEntryType;
import report.workday.com.public_web_services.ReportDataType;
import report.workday.com.public_web_services.ReportEntryType;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.infa.products.ldm.scanners.workdayscanner.model.Constants.*;
//import java.util.stream.Collectors;

public class WorkdayRestClient {

    RestTemplate restTemplate;

    public final String PUBLIC_WEB_SERVICES_URL = "https://%s/ccx/service/systemreport/%s/Public_Web_Services";
    public final String ALL_CUSTOM_REPORTS_URL = "https://%s/ccx/service/systemreport2/%s/All_Custom_Reports";
    public final String ALL_DATA_SOURCES_URL = "https://%s/ccx/service/systemreport2/%s/Data_Sources";
    private Map<String, String> resourceMap;

    private final String BASIC_AUTH_SEPARATOR = ":";


    public WorkdayRestClient(Map<String, String> resourceMap) {
        this.resourceMap = resourceMap;

        List<HttpMessageConverter<?>> list = new ArrayList<>();
        list.add(new Jaxb2RootElementHttpMessageConverter());

        restTemplate = new RestTemplate();
        List<HttpMessageConverter<?>> currentMessageConverters = restTemplate.getMessageConverters();
        List<HttpMessageConverter<?>> overriddenMessageConverters = new ArrayList<>();

        overriddenMessageConverters.add(new Jaxb2RootElementHttpMessageConverter());
        overriddenMessageConverters.addAll(currentMessageConverters);

        restTemplate.setMessageConverters(overriddenMessageConverters);

    }

    private HttpHeaders getAuthHeaders(String username, String password) {

        HttpHeaders headers = new HttpHeaders();

        String plainString = username + BASIC_AUTH_SEPARATOR + password;
        String token = Base64.encode(plainString.getBytes(), false);

        headers.add("Authorization", "Basic " + token);
        headers.add("Accept", "text/xml");

        return headers;
    }

    public List<CustomReportEntryType> fetchCustomReports(String domain, String tenant) {

        HttpEntity<String> entity = createHTTPEntity();
        System.out.println(String.format(ALL_CUSTOM_REPORTS_URL, domain, tenant));
        ResponseEntity<CustomReportDataType> customReportData = restTemplate.exchange(String.format(ALL_CUSTOM_REPORTS_URL, domain, tenant), HttpMethod.GET, entity, CustomReportDataType.class);

        return customReportData.getBody().getReportEntry();

    }

    public List<report.workday.com.data_sources.ReportEntryType> fetchAllDataSources(String domain, String tenant) {


        HttpEntity<String> entity = createHTTPEntity();

        System.out.println(String.format(ALL_DATA_SOURCES_URL, domain, tenant));
        ResponseEntity<report.workday.com.data_sources.ReportDataType> dataSourceData =
                restTemplate.exchange(String.format(ALL_DATA_SOURCES_URL, domain, tenant), HttpMethod.GET, entity, report.workday.com.data_sources.ReportDataType.class);
//
//        Map<String, String> dataSourceMap;
//        dataSourceMap = dataSourceData.getBody().getReportEntry()
//                .stream().
//                        collect(Collectors.
//                                toMap(ds -> ds.getDataSource().getDescriptor().replace(" ", "_") + "_DS",
//                                        ds -> ds.getDescription(), (val1, val2) -> val1));
//        return dataSourceMap;

        return dataSourceData.getBody().getReportEntry();

    }

    public HttpEntity<String> createHTTPEntity() {
        HttpHeaders httpHeaders = getAuthHeaders(resourceMap.get(USERNAME), resourceMap.get(PASSWORD));
        return new HttpEntity<>("HEADERS", httpHeaders);
    }

//    public static void main(String args[]) {
//
//        WorkdayRestClient client = new WorkdayRestClient();
//        client.fetchAllDataSources("wd2-impl-services1.workday.com", "informatica_pt1");
//
//    }

    public List<WService> fetchPublicWebServices(String domain, String tenant) throws RestClientException {


        HttpEntity<String> entity = createHTTPEntity();
        List<WService> publicWebServices = new ArrayList<>();

        ResponseEntity<ReportDataType> report = restTemplate.exchange(String.format(PUBLIC_WEB_SERVICES_URL, domain, tenant), HttpMethod.GET, entity, ReportDataType.class);

        for (ReportEntryType r : report.getBody().getReportEntry()) {

            String webServiceCommonName = r.getWebService().getInstance().get(0).getValue();
            String webServiceDescription = r.getDocumentation();
            WorkdayAPI wApi = WorkdayAPI.getByCommonName(webServiceCommonName);

            if (wApi != null) {
                publicWebServices.add(new WService(wApi.getServiceName(), webServiceDescription));
            }

        }

        return publicWebServices;

    }

}
