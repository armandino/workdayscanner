
package com.workday.sources;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Encapsulating element containg all Position data.
 * 
 * <p>Java class for Worker_Position_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Position_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Position_Reference" type="{urn:com.workday/bsvc}Position_ReferenceType" minOccurs="0"/>
 *         &lt;element name="Position_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Position_Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Business_Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Employee_Type_Reference" type="{urn:com.workday/bsvc}Employee_Type_ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Position_Time_Type_Reference" type="{urn:com.workday/bsvc}Position_Time_Type_ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Job_Exempt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Scheduled_Weekly_Hours" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Default_Weekly_Hours" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Full_Time_Equivalent_Percentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="14"/>
 *               &lt;fractionDigits value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Pay_Rate_Type_Reference" type="{urn:com.workday/bsvc}Pay_Rate_Type_ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Job_Classification_Reference" type="{urn:com.workday/bsvc}Job_Classification_ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Company_Insider_Reference" type="{urn:com.workday/bsvc}Company_Insider_Type_ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Job_Profile_Summary_Data" type="{urn:com.workday/bsvc}Job_Profile_in_Position_Summary_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Organization_Content_Data" type="{urn:com.workday/bsvc}Organization_Content_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Business_Site_Content_Data" type="{urn:com.workday/bsvc}Location_Content_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Payroll_Processing_Data" type="{urn:com.workday/bsvc}Payroll_Interface_Processing_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Supervisor_Reference" type="{urn:com.workday/bsvc}Supervisor_ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Work_Shift_Reference" type="{urn:com.workday/bsvc}Work_ShiftObjectType" minOccurs="0"/>
 *         &lt;element name="Work_Hours_Profile_Reference" type="{urn:com.workday/bsvc}Work_Hours_ProfileObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Effective_Date" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Position_DataType", propOrder = {
    "positionReference",
    "positionID",
    "positionTitle",
    "businessTitle",
    "employeeTypeReference",
    "positionTimeTypeReference",
    "jobExempt",
    "scheduledWeeklyHours",
    "defaultWeeklyHours",
    "fullTimeEquivalentPercentage",
    "payRateTypeReference",
    "jobClassificationReference",
    "companyInsiderReference",
    "jobProfileSummaryData",
    "organizationContentData",
    "businessSiteContentData",
    "payrollProcessingData",
    "supervisorReference",
    "workShiftReference",
    "workHoursProfileReference"
})
public class WorkerPositionDataType {

    @XmlElement(name = "Position_Reference")
    protected PositionReferenceType positionReference;
    @XmlElement(name = "Position_ID")
    protected String positionID;
    @XmlElement(name = "Position_Title")
    protected String positionTitle;
    @XmlElement(name = "Business_Title")
    protected String businessTitle;
    @XmlElement(name = "Employee_Type_Reference")
    protected List<EmployeeTypeReferenceType> employeeTypeReference;
    @XmlElement(name = "Position_Time_Type_Reference")
    protected List<PositionTimeTypeReferenceType> positionTimeTypeReference;
    @XmlElement(name = "Job_Exempt")
    protected Boolean jobExempt;
    @XmlElement(name = "Scheduled_Weekly_Hours")
    protected BigDecimal scheduledWeeklyHours;
    @XmlElement(name = "Default_Weekly_Hours")
    protected BigDecimal defaultWeeklyHours;
    @XmlElement(name = "Full_Time_Equivalent_Percentage")
    protected BigDecimal fullTimeEquivalentPercentage;
    @XmlElement(name = "Pay_Rate_Type_Reference")
    protected List<PayRateTypeReferenceType> payRateTypeReference;
    @XmlElement(name = "Job_Classification_Reference")
    protected List<JobClassificationReferenceType> jobClassificationReference;
    @XmlElement(name = "Company_Insider_Reference")
    protected List<CompanyInsiderTypeReferenceType> companyInsiderReference;
    @XmlElement(name = "Job_Profile_Summary_Data")
    protected List<JobProfileInPositionSummaryDataType> jobProfileSummaryData;
    @XmlElement(name = "Organization_Content_Data")
    protected List<OrganizationContentDataType> organizationContentData;
    @XmlElement(name = "Business_Site_Content_Data")
    protected List<LocationContentDataType> businessSiteContentData;
    @XmlElement(name = "Payroll_Processing_Data")
    protected List<PayrollInterfaceProcessingDataType> payrollProcessingData;
    @XmlElement(name = "Supervisor_Reference")
    protected List<SupervisorReferenceType> supervisorReference;
    @XmlElement(name = "Work_Shift_Reference")
    protected WorkShiftObjectType workShiftReference;
    @XmlElement(name = "Work_Hours_Profile_Reference")
    protected WorkHoursProfileObjectType workHoursProfileReference;
    @XmlAttribute(name = "Effective_Date", namespace = "urn:com.workday/bsvc")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;

    /**
     * Gets the value of the positionReference property.
     * 
     * @return
     *     possible object is
     *     {@link PositionReferenceType }
     *     
     */
    public PositionReferenceType getPositionReference() {
        return positionReference;
    }

    /**
     * Sets the value of the positionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionReferenceType }
     *     
     */
    public void setPositionReference(PositionReferenceType value) {
        this.positionReference = value;
    }

    /**
     * Gets the value of the positionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionID() {
        return positionID;
    }

    /**
     * Sets the value of the positionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionID(String value) {
        this.positionID = value;
    }

    /**
     * Gets the value of the positionTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionTitle() {
        return positionTitle;
    }

    /**
     * Sets the value of the positionTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionTitle(String value) {
        this.positionTitle = value;
    }

    /**
     * Gets the value of the businessTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessTitle() {
        return businessTitle;
    }

    /**
     * Sets the value of the businessTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessTitle(String value) {
        this.businessTitle = value;
    }

    /**
     * Gets the value of the employeeTypeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employeeTypeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployeeTypeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeTypeReferenceType }
     * 
     * 
     */
    public List<EmployeeTypeReferenceType> getEmployeeTypeReference() {
        if (employeeTypeReference == null) {
            employeeTypeReference = new ArrayList<EmployeeTypeReferenceType>();
        }
        return this.employeeTypeReference;
    }

    /**
     * Gets the value of the positionTimeTypeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the positionTimeTypeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositionTimeTypeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionTimeTypeReferenceType }
     * 
     * 
     */
    public List<PositionTimeTypeReferenceType> getPositionTimeTypeReference() {
        if (positionTimeTypeReference == null) {
            positionTimeTypeReference = new ArrayList<PositionTimeTypeReferenceType>();
        }
        return this.positionTimeTypeReference;
    }

    /**
     * Gets the value of the jobExempt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isJobExempt() {
        return jobExempt;
    }

    /**
     * Sets the value of the jobExempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJobExempt(Boolean value) {
        this.jobExempt = value;
    }

    /**
     * Gets the value of the scheduledWeeklyHours property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScheduledWeeklyHours() {
        return scheduledWeeklyHours;
    }

    /**
     * Sets the value of the scheduledWeeklyHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScheduledWeeklyHours(BigDecimal value) {
        this.scheduledWeeklyHours = value;
    }

    /**
     * Gets the value of the defaultWeeklyHours property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDefaultWeeklyHours() {
        return defaultWeeklyHours;
    }

    /**
     * Sets the value of the defaultWeeklyHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDefaultWeeklyHours(BigDecimal value) {
        this.defaultWeeklyHours = value;
    }

    /**
     * Gets the value of the fullTimeEquivalentPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFullTimeEquivalentPercentage() {
        return fullTimeEquivalentPercentage;
    }

    /**
     * Sets the value of the fullTimeEquivalentPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFullTimeEquivalentPercentage(BigDecimal value) {
        this.fullTimeEquivalentPercentage = value;
    }

    /**
     * Gets the value of the payRateTypeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payRateTypeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayRateTypeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PayRateTypeReferenceType }
     * 
     * 
     */
    public List<PayRateTypeReferenceType> getPayRateTypeReference() {
        if (payRateTypeReference == null) {
            payRateTypeReference = new ArrayList<PayRateTypeReferenceType>();
        }
        return this.payRateTypeReference;
    }

    /**
     * Gets the value of the jobClassificationReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobClassificationReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobClassificationReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobClassificationReferenceType }
     * 
     * 
     */
    public List<JobClassificationReferenceType> getJobClassificationReference() {
        if (jobClassificationReference == null) {
            jobClassificationReference = new ArrayList<JobClassificationReferenceType>();
        }
        return this.jobClassificationReference;
    }

    /**
     * Gets the value of the companyInsiderReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the companyInsiderReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompanyInsiderReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyInsiderTypeReferenceType }
     * 
     * 
     */
    public List<CompanyInsiderTypeReferenceType> getCompanyInsiderReference() {
        if (companyInsiderReference == null) {
            companyInsiderReference = new ArrayList<CompanyInsiderTypeReferenceType>();
        }
        return this.companyInsiderReference;
    }

    /**
     * Gets the value of the jobProfileSummaryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobProfileSummaryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobProfileSummaryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobProfileInPositionSummaryDataType }
     * 
     * 
     */
    public List<JobProfileInPositionSummaryDataType> getJobProfileSummaryData() {
        if (jobProfileSummaryData == null) {
            jobProfileSummaryData = new ArrayList<JobProfileInPositionSummaryDataType>();
        }
        return this.jobProfileSummaryData;
    }

    /**
     * Gets the value of the organizationContentData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationContentData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationContentData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationContentDataType }
     * 
     * 
     */
    public List<OrganizationContentDataType> getOrganizationContentData() {
        if (organizationContentData == null) {
            organizationContentData = new ArrayList<OrganizationContentDataType>();
        }
        return this.organizationContentData;
    }

    /**
     * Gets the value of the businessSiteContentData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessSiteContentData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessSiteContentData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationContentDataType }
     * 
     * 
     */
    public List<LocationContentDataType> getBusinessSiteContentData() {
        if (businessSiteContentData == null) {
            businessSiteContentData = new ArrayList<LocationContentDataType>();
        }
        return this.businessSiteContentData;
    }

    /**
     * Gets the value of the payrollProcessingData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payrollProcessingData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayrollProcessingData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PayrollInterfaceProcessingDataType }
     * 
     * 
     */
    public List<PayrollInterfaceProcessingDataType> getPayrollProcessingData() {
        if (payrollProcessingData == null) {
            payrollProcessingData = new ArrayList<PayrollInterfaceProcessingDataType>();
        }
        return this.payrollProcessingData;
    }

    /**
     * Gets the value of the supervisorReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supervisorReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupervisorReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupervisorReferenceType }
     * 
     * 
     */
    public List<SupervisorReferenceType> getSupervisorReference() {
        if (supervisorReference == null) {
            supervisorReference = new ArrayList<SupervisorReferenceType>();
        }
        return this.supervisorReference;
    }

    /**
     * Gets the value of the workShiftReference property.
     * 
     * @return
     *     possible object is
     *     {@link WorkShiftObjectType }
     *     
     */
    public WorkShiftObjectType getWorkShiftReference() {
        return workShiftReference;
    }

    /**
     * Sets the value of the workShiftReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkShiftObjectType }
     *     
     */
    public void setWorkShiftReference(WorkShiftObjectType value) {
        this.workShiftReference = value;
    }

    /**
     * Gets the value of the workHoursProfileReference property.
     * 
     * @return
     *     possible object is
     *     {@link WorkHoursProfileObjectType }
     *     
     */
    public WorkHoursProfileObjectType getWorkHoursProfileReference() {
        return workHoursProfileReference;
    }

    /**
     * Sets the value of the workHoursProfileReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkHoursProfileObjectType }
     *     
     */
    public void setWorkHoursProfileReference(WorkHoursProfileObjectType value) {
        this.workHoursProfileReference = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

}
