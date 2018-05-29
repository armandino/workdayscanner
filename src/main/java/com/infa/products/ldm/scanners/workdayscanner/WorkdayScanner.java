package com.infa.products.ldm.scanners.workdayscanner;

import com.infa.products.ldm.scanner.api.BaseScanner;
import com.infa.products.ldm.scanner.api.ScannerException;
import com.infa.products.ldm.scanner.common.config.ResourceConfiguration;
import com.infa.products.ldm.scanner.common.config.registry.DynamicAttributeValue;
import com.infa.products.ldm.scanners.workdayscanner.client.WorkdayRestClient;
import com.infa.products.ldm.scanners.workdayscanner.helpers.ScannerHelper;
import com.infa.products.ldm.scanners.workdayscanner.model.WService;
import com.infa.products.ldm.scanners.workdayscanner.model.Constants;

import java.util.List;
import java.util.Map;

public class WorkdayScanner extends BaseScanner {


    private ScannerHelper scannerHelper;
    private WorkdayRestClient workdayRestClient;

    public WorkdayScanner() {
        scannerHelper = new ScannerHelper();

    }

    @Override
    public void testConnection(ResourceConfiguration resourceConfig) throws ScannerException {


        Map<String, String> resourceMap = scannerHelper.createResourceMap(resourceConfig);

        workdayRestClient = new WorkdayRestClient(resourceMap);

        List<WService> wServices = workdayRestClient.fetchPublicWebServices(
                resourceMap.get(Constants.WORKDAY_DOMAIN), resourceMap.get(Constants.TENANT));

        if (wServices.isEmpty()) {
            throw new ScannerException("No Public Services available for the Workday Tenant");
        }
    }

    @Override
    public void validateConfiguration(ResourceConfiguration resourceConfig) throws ScannerException {

    }

    @Override
    public List<DynamicAttributeValue> getDynamicOptionValues(ResourceConfiguration resourceConfig, String optionId) throws ScannerException {
        return null;
    }

    @Override
    public Boolean hasLicense(ResourceConfiguration resourceConfig) {
        return null;
    }
}
