package com.infa.products.ldm.scanners.workdayscanner.model;

public enum WorkdayAPI {

    HUMAN_RESOURCES("Human Resources (Public)", "Human_Resources"),
    FINANCIAL_MANAGEMENT("Financial Management (Public)", "Financial_Management"),
    ABSENCE_MANAGEMENT("Absence Management (Public)", "Absence_Management"),
    ACADEMIC_ADVISING("Academic Advising (Public)", "Academic_Advising"),
    ADMISSIONS("Admissions (Public)", "Admissions"),
    ADOPTION("Adoption (Public)", "Adoption"),
   // BLOBITORY_DOCUMENT_CONFIRMATION("Blobitory Document Confirmation (Public)", "Blobitory_Document_Confirmation"),
    CAMPUS_ENGAGEMENT("Campus Engagement (Public)", "Campus_Engagement"),
    CASH_MANAGEMENT("Cash Management (Public)", "Cash_Management"),
    COMPENSATION("Compensation (Public)", "Compensation"),
    COMPENSATION_REVIEW("Compensation Review (Public)", "Compensation_Review"),
    DYNAMIC_DOCUMENT_GENERATION("Dynamic Document Generation (Public)", "Dynamic_Document_Generation"),
    EXTERNAL_INTEGRATIONS("External Integrations (Public)", "External_Integrations"),
    FINANCIAL_AID("Financial Aid (Public)", "Financial_Aid"),
    IDENTITY_MANAGEMENT("Identity Management (Public)", "Identity_Management"),
    INTEGRATIONS("Integrations (Public)", "Integrations"),
    INTERVIEW_FEEDBACK("Interview Feedback (Public)", "Interview_Feedback"),
    INVENTORY("Inventory (Public)", "Inventory"),
    LEARNING("Learning (Public)", "Learning"),
    NOTIFICATION("Notification (Public)", "Notification"),
    PAYROLL("Payroll (Public)", "Payroll"),
    PAYROLL_CAN("Payroll CAN (Public)", "Payroll_CAN"),
    PAYROLL_GBR("Payroll GBR (Public)", "Payroll_GBR"),
    PAYROLL_INTERFACE("Payroll Interface (Public)", "Payroll_Interface"),
    PERFORMANCE_MANAGEMENT("Performance Management (Public)", "Performance_Management"),
    PROFESSIONAL_SERVICES_AUTOMATION("Professional Services Automation (Public)", "Professional_Services_Automation"),
    RECRUITING("Recruiting (Public)", "Recruiting"),
    RESOURCE_MANAGEMENT("Resource Management (Public)", "Resource_Management");
    /*REVENUE_MANAGEMENT("Revenue Management (Public)", "Revenue_Management"),
    SETTLEMENT_SERVICES("Settlement Services (Public)", "Settlement_Services"),
    STAFFING("Staffing (Public)", "Staffing"),
    STUDENT_FINANCE("Student Finance (Public)", "Student_Finance"),
    STUDENT_RECORDS("Student Records (Public)", "Student_Records"),
    STUDENT_RECRUITING("Student Recruiting (Public)", "Student_Recruiting"),
    TALENT("Talent (Public)", "Talent"),
    TENANT_DATA_TRANSALATION("Tenant Data Translation (Public)", "Tenant_Data_Translation"),
    TIME_TRACKING("Time Tracking (Public)", "Time_Tracking"),
    WORDAY_CONNECT("Workday Connect (Public)", "Workday_Connect"),
    WORKDAY_EXTENSIBILITY("Workday Extensibility (Public)", "Workday_Extensibility"),
    WORKFORCE_PLANNING("Workforce Planning (Public)", "Workforce_Planning");*/


    private String commonName;
    private String serviceName;

    WorkdayAPI(String commonName, String serviceName) {

        this.commonName = commonName;
        this.serviceName = serviceName;
    }


    public String getServiceName() {
        return serviceName;
    }

    public static WorkdayAPI getByCommonName(String cName) {
        for (WorkdayAPI wApi : WorkdayAPI.values()) {
            if (wApi.commonName.equals(cName)) {
                return wApi;
            }
        }
        return null;
    }
}
