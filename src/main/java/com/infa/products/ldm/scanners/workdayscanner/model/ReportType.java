package com.infa.products.ldm.scanners.workdayscanner.model;

public enum ReportType {

    ADVANCED("Advanced"),
    STANDARD("Standard"),
    MATRIX("Matrix");

    private String reportType;

    public String getReportType() {
        return reportType;
    }

    ReportType(String reportType) {
        this.reportType = reportType;

    }
}
