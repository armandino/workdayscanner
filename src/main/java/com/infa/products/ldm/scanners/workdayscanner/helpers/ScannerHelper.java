package com.infa.products.ldm.scanners.workdayscanner.helpers;

import com.infa.products.ldm.framework.jobexec.common.OperationOutcome;
import com.infa.products.ldm.framework.jobexec.common.TaskStat;
import com.infa.products.ldm.ingestion.DataExchangeDocBuilder;
import com.infa.products.ldm.scanner.api.IScannerCallback;
import com.infa.products.ldm.scanner.api.ScannerExecutionException;
import com.infa.products.ldm.scanner.common.config.ResourceConfiguration;
import com.infa.products.ldm.scanner.common.config.ScannerConfiguration;


import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import static com.infa.products.ldm.framework.jobexec.common.TaskProgress.Builder;
import static com.infa.products.ldm.scanners.workdayscanner.model.Constants.*;

public class ScannerHelper {

    private static IScannerCallback scannerCallback;

    public ScannerHelper() {

    }

    public ScannerHelper(IScannerCallback scannerCallback) {

        this.scannerCallback = scannerCallback;
    }


    public static class OperationPublisher {

        private long startTime;
        private long endTime;
        private String operationName;
        private OperationOutcome outcome;

        public long getStartTime() {
            return startTime;
        }

        public void setStartTime(long startTime) {
            this.startTime = startTime;
        }

        public long getEndTime() {
            return endTime;
        }

        public void setEndTime(long endTime) {
            this.endTime = endTime;
        }

        public String getOperationName() {
            return operationName;
        }

        public void setOperationName(String operationName) {
            this.operationName = operationName;
        }

        public OperationOutcome getOutcome() {
            return outcome;
        }

        public void setOutcome(OperationOutcome outcome) {
            this.outcome = outcome;
        }

        public void publishOperation() throws ScannerExecutionException {
            Builder taskProgressBuilder = new Builder();
            taskProgressBuilder
                    .setOperationName(operationName)
                    .setStartTime(startTime)
                    .setEndTime(endTime)
                    .setOperationOutcome(outcome)
                    .build();


            scannerCallback.updateProgress(taskProgressBuilder.build());
        }
    }

    public Map<String, String> createResourceMap(ResourceConfiguration resourceConfig) {

        ScannerConfiguration scannerConfiguration = null;
        if (resourceConfig.getScannerConfigurations() == null) {
            return null;
        }

        scannerConfiguration = resourceConfig.getScannerConfigurations().get(0);
        System.out.println(scannerConfiguration);

        Map<String, String> resourceMap = null;

        resourceMap = scannerConfiguration.getConfigOptions()
                .stream()
                .filter(c -> c.getOptionValues().size() > 0 && c.getOptionValues().get(0) != null)
                .collect(Collectors.toMap(c -> c.getOptionId(), c -> c.getOptionValues().get(0).toString()));


        populateAdditionalInfo(resourceMap, resourceConfig);

        return resourceMap;
    }

    public void updateTask(String name, String value) throws ScannerExecutionException {
        TaskStat.Builder taskStatBuilder = new TaskStat.Builder();
        scannerCallback.updateStats(Arrays.asList(taskStatBuilder.setName(name).setValue(value).build()));

    }

    private void populateAdditionalInfo(Map<String, String> resourceMap, ResourceConfiguration configuration) {

        resourceMap.put(RESOURCE_NAME, configuration.getResourceIdentifier().getResourceName());
        resourceMap.put(RESOURCE_TYPE, configuration.getResourceIdentifier().getResourceTypeId());
        resourceMap.put(SCANNER_ID, configuration.getScannerConfigurations().get(0).getScanner().getScannerId());

    }

    public void addResourceProperties(Map<String, String> resourceMap, DataExchangeDocBuilder docBuilder, String objectID) {

        docBuilder.addProperty(objectID, CORE_RESOURCE_NAME, resourceMap.get(RESOURCE_NAME));
        docBuilder.addProperty(objectID, CORE_RESOURCE_TYPE, resourceMap.get(RESOURCE_TYPE));

    }

}