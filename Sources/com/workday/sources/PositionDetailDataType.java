
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
 * Encapsulating element containg all Payroll Interface Processing data.
 * 
 * <p>Java class for Position_Detail_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Position_Detail_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Position_Reference" type="{urn:com.workday/bsvc}Position_ElementObjectType" minOccurs="0"/>
 *         &lt;element name="Headcount_Reference" type="{urn:com.workday/bsvc}Headcount_RestrictionsObjectType" minOccurs="0"/>
 *         &lt;element name="Position_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Position_Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Business_Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Start_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="End_Employment_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="End_Employment_Reason_Reference" type="{urn:com.workday/bsvc}Event_Classification_SubcategoryObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Worker_Type_Reference" type="{urn:com.workday/bsvc}Position_Worker_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Position_Time_Type_Reference" type="{urn:com.workday/bsvc}Position_Time_TypeObjectType" minOccurs="0"/>
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
 *         &lt;element name="Working_Time_Frequency_Reference" type="{urn:com.workday/bsvc}FrequencyObjectType" minOccurs="0"/>
 *         &lt;element name="Working_Time_Unit_Reference" type="{urn:com.workday/bsvc}Working_Time_UnitObjectType" minOccurs="0"/>
 *         &lt;element name="Working_Time_Value" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="6"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Full_Time_Equivalent_Percentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="12"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Exclude_from_Headcount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Pay_Rate_Type_Reference" type="{urn:com.workday/bsvc}Pay_Rate_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Job_Classification_Summary_Data" type="{urn:com.workday/bsvc}Job_Classification_Summary_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Company_Insider_Reference" type="{urn:com.workday/bsvc}Company_Insider_TypeObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Work_Shift_Reference" type="{urn:com.workday/bsvc}Work_ShiftObjectType" minOccurs="0"/>
 *         &lt;element name="Work_Hours_Profiles_Reference" type="{urn:com.workday/bsvc}Work_Hours_ProfileObjectType" minOccurs="0"/>
 *         &lt;element name="Federal_Withholding_FEIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Worker_Compensation_Code_Data" type="{urn:com.workday/bsvc}Worker_Compensation_Code_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Position_Payroll_Reporting_Code_Data" type="{urn:com.workday/bsvc}Position_Payroll_Reporting_Code_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Job_Profile_Summary_Data" type="{urn:com.workday/bsvc}Job_Profile_in_Position_Summary_DataType" minOccurs="0"/>
 *         &lt;element name="Business_Site_Summary_Data" type="{urn:com.workday/bsvc}Location_Summary_DataType" minOccurs="0"/>
 *         &lt;element name="Payroll_Interface_Processing_Data" type="{urn:com.workday/bsvc}Position_Payroll_Interface_Detail_DataType" minOccurs="0"/>
 *         &lt;element name="Regular_Paid_Equivalent_Hours" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Worker_Hours_Profile_Classification" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="International_Assignment_Data" type="{urn:com.workday/bsvc}International_Assignment_DataType" minOccurs="0"/>
 *         &lt;element name="Work_Space__Reference" type="{urn:com.workday/bsvc}LocationObjectType" minOccurs="0"/>
 *         &lt;element name="Academic_Pay_Setup_Data" type="{urn:com.workday/bsvc}Academic_Pay_Setup_DataType" minOccurs="0"/>
 *         &lt;element name="End_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Pay_Through_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Collective_Agreement_Summary_Data" type="{urn:com.workday/bsvc}Collective_Agreement_Summary_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Employee_Probation_Period_Summary_Data" type="{urn:com.workday/bsvc}Employee_Probation_Period_Summary_DataType" minOccurs="0"/>
 *         &lt;element name="Manager_as_of_last_detected_manager_change_Reference" type="{urn:com.workday/bsvc}WorkerObjectType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Position_Detail_DataType", propOrder = {
    "positionReference",
    "headcountReference",
    "positionID",
    "positionTitle",
    "businessTitle",
    "startDate",
    "endEmploymentDate",
    "endEmploymentReasonReference",
    "workerTypeReference",
    "positionTimeTypeReference",
    "jobExempt",
    "scheduledWeeklyHours",
    "defaultWeeklyHours",
    "workingTimeFrequencyReference",
    "workingTimeUnitReference",
    "workingTimeValue",
    "fullTimeEquivalentPercentage",
    "excludeFromHeadcount",
    "payRateTypeReference",
    "jobClassificationSummaryData",
    "companyInsiderReference",
    "workShiftReference",
    "workHoursProfilesReference",
    "federalWithholdingFEIN",
    "workerCompensationCodeData",
    "positionPayrollReportingCodeData",
    "jobProfileSummaryData",
    "businessSiteSummaryData",
    "payrollInterfaceProcessingData",
    "regularPaidEquivalentHours",
    "workerHoursProfileClassification",
    "internationalAssignmentData",
    "workSpaceReference",
    "academicPaySetupData",
    "endDate",
    "payThroughDate",
    "collectiveAgreementSummaryData",
    "employeeProbationPeriodSummaryData",
    "managerAsOfLastDetectedManagerChangeReference"
})
public class PositionDetailDataType {

    @XmlElement(name = "Position_Reference")
    protected PositionElementObjectType positionReference;
    @XmlElement(name = "Headcount_Reference")
    protected HeadcountRestrictionsObjectType headcountReference;
    @XmlElement(name = "Position_ID")
    protected String positionID;
    @XmlElement(name = "Position_Title")
    protected String positionTitle;
    @XmlElement(name = "Business_Title")
    protected String businessTitle;
    @XmlElement(name = "Start_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "End_Employment_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endEmploymentDate;
    @XmlElement(name = "End_Employment_Reason_Reference")
    protected List<EventClassificationSubcategoryObjectType> endEmploymentReasonReference;
    @XmlElement(name = "Worker_Type_Reference")
    protected PositionWorkerTypeObjectType workerTypeReference;
    @XmlElement(name = "Position_Time_Type_Reference")
    protected PositionTimeTypeObjectType positionTimeTypeReference;
    @XmlElement(name = "Job_Exempt")
    protected Boolean jobExempt;
    @XmlElement(name = "Scheduled_Weekly_Hours")
    protected BigDecimal scheduledWeeklyHours;
    @XmlElement(name = "Default_Weekly_Hours")
    protected BigDecimal defaultWeeklyHours;
    @XmlElement(name = "Working_Time_Frequency_Reference")
    protected FrequencyObjectType workingTimeFrequencyReference;
    @XmlElement(name = "Working_Time_Unit_Reference")
    protected WorkingTimeUnitObjectType workingTimeUnitReference;
    @XmlElement(name = "Working_Time_Value")
    protected BigDecimal workingTimeValue;
    @XmlElement(name = "Full_Time_Equivalent_Percentage")
    protected BigDecimal fullTimeEquivalentPercentage;
    @XmlElement(name = "Exclude_from_Headcount")
    protected Boolean excludeFromHeadcount;
    @XmlElement(name = "Pay_Rate_Type_Reference")
    protected PayRateTypeObjectType payRateTypeReference;
    @XmlElement(name = "Job_Classification_Summary_Data")
    protected List<JobClassificationSummaryDataType> jobClassificationSummaryData;
    @XmlElement(name = "Company_Insider_Reference")
    protected List<CompanyInsiderTypeObjectType> companyInsiderReference;
    @XmlElement(name = "Work_Shift_Reference")
    protected WorkShiftObjectType workShiftReference;
    @XmlElement(name = "Work_Hours_Profiles_Reference")
    protected WorkHoursProfileObjectType workHoursProfilesReference;
    @XmlElement(name = "Federal_Withholding_FEIN")
    protected String federalWithholdingFEIN;
    @XmlElement(name = "Worker_Compensation_Code_Data")
    protected List<WorkerCompensationCodeDataType> workerCompensationCodeData;
    @XmlElement(name = "Position_Payroll_Reporting_Code_Data")
    protected List<PositionPayrollReportingCodeDataType> positionPayrollReportingCodeData;
    @XmlElement(name = "Job_Profile_Summary_Data")
    protected JobProfileInPositionSummaryDataType jobProfileSummaryData;
    @XmlElement(name = "Business_Site_Summary_Data")
    protected LocationSummaryDataType businessSiteSummaryData;
    @XmlElement(name = "Payroll_Interface_Processing_Data")
    protected PositionPayrollInterfaceDetailDataType payrollInterfaceProcessingData;
    @XmlElement(name = "Regular_Paid_Equivalent_Hours")
    protected BigDecimal regularPaidEquivalentHours;
    @XmlElement(name = "Worker_Hours_Profile_Classification")
    protected String workerHoursProfileClassification;
    @XmlElement(name = "International_Assignment_Data")
    protected InternationalAssignmentDataType internationalAssignmentData;
    @XmlElement(name = "Work_Space__Reference")
    protected LocationObjectType workSpaceReference;
    @XmlElement(name = "Academic_Pay_Setup_Data")
    protected AcademicPaySetupDataType academicPaySetupData;
    @XmlElement(name = "End_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "Pay_Through_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar payThroughDate;
    @XmlElement(name = "Collective_Agreement_Summary_Data")
    protected List<CollectiveAgreementSummaryDataType> collectiveAgreementSummaryData;
    @XmlElement(name = "Employee_Probation_Period_Summary_Data")
    protected EmployeeProbationPeriodSummaryDataType employeeProbationPeriodSummaryData;
    @XmlElement(name = "Manager_as_of_last_detected_manager_change_Reference")
    protected List<WorkerObjectType> managerAsOfLastDetectedManagerChangeReference;
    @XmlAttribute(name = "Effective_Date", namespace = "urn:com.workday/bsvc")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;

    /**
     * Gets the value of the positionReference property.
     * 
     * @return
     *     possible object is
     *     {@link PositionElementObjectType }
     *     
     */
    public PositionElementObjectType getPositionReference() {
        return positionReference;
    }

    /**
     * Sets the value of the positionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionElementObjectType }
     *     
     */
    public void setPositionReference(PositionElementObjectType value) {
        this.positionReference = value;
    }

    /**
     * Gets the value of the headcountReference property.
     * 
     * @return
     *     possible object is
     *     {@link HeadcountRestrictionsObjectType }
     *     
     */
    public HeadcountRestrictionsObjectType getHeadcountReference() {
        return headcountReference;
    }

    /**
     * Sets the value of the headcountReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeadcountRestrictionsObjectType }
     *     
     */
    public void setHeadcountReference(HeadcountRestrictionsObjectType value) {
        this.headcountReference = value;
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
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endEmploymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndEmploymentDate() {
        return endEmploymentDate;
    }

    /**
     * Sets the value of the endEmploymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndEmploymentDate(XMLGregorianCalendar value) {
        this.endEmploymentDate = value;
    }

    /**
     * Gets the value of the endEmploymentReasonReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endEmploymentReasonReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndEmploymentReasonReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventClassificationSubcategoryObjectType }
     * 
     * 
     */
    public List<EventClassificationSubcategoryObjectType> getEndEmploymentReasonReference() {
        if (endEmploymentReasonReference == null) {
            endEmploymentReasonReference = new ArrayList<EventClassificationSubcategoryObjectType>();
        }
        return this.endEmploymentReasonReference;
    }

    /**
     * Gets the value of the workerTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link PositionWorkerTypeObjectType }
     *     
     */
    public PositionWorkerTypeObjectType getWorkerTypeReference() {
        return workerTypeReference;
    }

    /**
     * Sets the value of the workerTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionWorkerTypeObjectType }
     *     
     */
    public void setWorkerTypeReference(PositionWorkerTypeObjectType value) {
        this.workerTypeReference = value;
    }

    /**
     * Gets the value of the positionTimeTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link PositionTimeTypeObjectType }
     *     
     */
    public PositionTimeTypeObjectType getPositionTimeTypeReference() {
        return positionTimeTypeReference;
    }

    /**
     * Sets the value of the positionTimeTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionTimeTypeObjectType }
     *     
     */
    public void setPositionTimeTypeReference(PositionTimeTypeObjectType value) {
        this.positionTimeTypeReference = value;
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
     * Gets the value of the workingTimeFrequencyReference property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyObjectType }
     *     
     */
    public FrequencyObjectType getWorkingTimeFrequencyReference() {
        return workingTimeFrequencyReference;
    }

    /**
     * Sets the value of the workingTimeFrequencyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyObjectType }
     *     
     */
    public void setWorkingTimeFrequencyReference(FrequencyObjectType value) {
        this.workingTimeFrequencyReference = value;
    }

    /**
     * Gets the value of the workingTimeUnitReference property.
     * 
     * @return
     *     possible object is
     *     {@link WorkingTimeUnitObjectType }
     *     
     */
    public WorkingTimeUnitObjectType getWorkingTimeUnitReference() {
        return workingTimeUnitReference;
    }

    /**
     * Sets the value of the workingTimeUnitReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkingTimeUnitObjectType }
     *     
     */
    public void setWorkingTimeUnitReference(WorkingTimeUnitObjectType value) {
        this.workingTimeUnitReference = value;
    }

    /**
     * Gets the value of the workingTimeValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWorkingTimeValue() {
        return workingTimeValue;
    }

    /**
     * Sets the value of the workingTimeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWorkingTimeValue(BigDecimal value) {
        this.workingTimeValue = value;
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
     * Gets the value of the excludeFromHeadcount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeFromHeadcount() {
        return excludeFromHeadcount;
    }

    /**
     * Sets the value of the excludeFromHeadcount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeFromHeadcount(Boolean value) {
        this.excludeFromHeadcount = value;
    }

    /**
     * Gets the value of the payRateTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link PayRateTypeObjectType }
     *     
     */
    public PayRateTypeObjectType getPayRateTypeReference() {
        return payRateTypeReference;
    }

    /**
     * Sets the value of the payRateTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayRateTypeObjectType }
     *     
     */
    public void setPayRateTypeReference(PayRateTypeObjectType value) {
        this.payRateTypeReference = value;
    }

    /**
     * Gets the value of the jobClassificationSummaryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobClassificationSummaryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobClassificationSummaryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobClassificationSummaryDataType }
     * 
     * 
     */
    public List<JobClassificationSummaryDataType> getJobClassificationSummaryData() {
        if (jobClassificationSummaryData == null) {
            jobClassificationSummaryData = new ArrayList<JobClassificationSummaryDataType>();
        }
        return this.jobClassificationSummaryData;
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
     * {@link CompanyInsiderTypeObjectType }
     * 
     * 
     */
    public List<CompanyInsiderTypeObjectType> getCompanyInsiderReference() {
        if (companyInsiderReference == null) {
            companyInsiderReference = new ArrayList<CompanyInsiderTypeObjectType>();
        }
        return this.companyInsiderReference;
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
     * Gets the value of the workHoursProfilesReference property.
     * 
     * @return
     *     possible object is
     *     {@link WorkHoursProfileObjectType }
     *     
     */
    public WorkHoursProfileObjectType getWorkHoursProfilesReference() {
        return workHoursProfilesReference;
    }

    /**
     * Sets the value of the workHoursProfilesReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkHoursProfileObjectType }
     *     
     */
    public void setWorkHoursProfilesReference(WorkHoursProfileObjectType value) {
        this.workHoursProfilesReference = value;
    }

    /**
     * Gets the value of the federalWithholdingFEIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFederalWithholdingFEIN() {
        return federalWithholdingFEIN;
    }

    /**
     * Sets the value of the federalWithholdingFEIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFederalWithholdingFEIN(String value) {
        this.federalWithholdingFEIN = value;
    }

    /**
     * Gets the value of the workerCompensationCodeData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workerCompensationCodeData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkerCompensationCodeData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkerCompensationCodeDataType }
     * 
     * 
     */
    public List<WorkerCompensationCodeDataType> getWorkerCompensationCodeData() {
        if (workerCompensationCodeData == null) {
            workerCompensationCodeData = new ArrayList<WorkerCompensationCodeDataType>();
        }
        return this.workerCompensationCodeData;
    }

    /**
     * Gets the value of the positionPayrollReportingCodeData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the positionPayrollReportingCodeData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositionPayrollReportingCodeData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionPayrollReportingCodeDataType }
     * 
     * 
     */
    public List<PositionPayrollReportingCodeDataType> getPositionPayrollReportingCodeData() {
        if (positionPayrollReportingCodeData == null) {
            positionPayrollReportingCodeData = new ArrayList<PositionPayrollReportingCodeDataType>();
        }
        return this.positionPayrollReportingCodeData;
    }

    /**
     * Gets the value of the jobProfileSummaryData property.
     * 
     * @return
     *     possible object is
     *     {@link JobProfileInPositionSummaryDataType }
     *     
     */
    public JobProfileInPositionSummaryDataType getJobProfileSummaryData() {
        return jobProfileSummaryData;
    }

    /**
     * Sets the value of the jobProfileSummaryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobProfileInPositionSummaryDataType }
     *     
     */
    public void setJobProfileSummaryData(JobProfileInPositionSummaryDataType value) {
        this.jobProfileSummaryData = value;
    }

    /**
     * Gets the value of the businessSiteSummaryData property.
     * 
     * @return
     *     possible object is
     *     {@link LocationSummaryDataType }
     *     
     */
    public LocationSummaryDataType getBusinessSiteSummaryData() {
        return businessSiteSummaryData;
    }

    /**
     * Sets the value of the businessSiteSummaryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSummaryDataType }
     *     
     */
    public void setBusinessSiteSummaryData(LocationSummaryDataType value) {
        this.businessSiteSummaryData = value;
    }

    /**
     * Gets the value of the payrollInterfaceProcessingData property.
     * 
     * @return
     *     possible object is
     *     {@link PositionPayrollInterfaceDetailDataType }
     *     
     */
    public PositionPayrollInterfaceDetailDataType getPayrollInterfaceProcessingData() {
        return payrollInterfaceProcessingData;
    }

    /**
     * Sets the value of the payrollInterfaceProcessingData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionPayrollInterfaceDetailDataType }
     *     
     */
    public void setPayrollInterfaceProcessingData(PositionPayrollInterfaceDetailDataType value) {
        this.payrollInterfaceProcessingData = value;
    }

    /**
     * Gets the value of the regularPaidEquivalentHours property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRegularPaidEquivalentHours() {
        return regularPaidEquivalentHours;
    }

    /**
     * Sets the value of the regularPaidEquivalentHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRegularPaidEquivalentHours(BigDecimal value) {
        this.regularPaidEquivalentHours = value;
    }

    /**
     * Gets the value of the workerHoursProfileClassification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkerHoursProfileClassification() {
        return workerHoursProfileClassification;
    }

    /**
     * Sets the value of the workerHoursProfileClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkerHoursProfileClassification(String value) {
        this.workerHoursProfileClassification = value;
    }

    /**
     * Gets the value of the internationalAssignmentData property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalAssignmentDataType }
     *     
     */
    public InternationalAssignmentDataType getInternationalAssignmentData() {
        return internationalAssignmentData;
    }

    /**
     * Sets the value of the internationalAssignmentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalAssignmentDataType }
     *     
     */
    public void setInternationalAssignmentData(InternationalAssignmentDataType value) {
        this.internationalAssignmentData = value;
    }

    /**
     * Gets the value of the workSpaceReference property.
     * 
     * @return
     *     possible object is
     *     {@link LocationObjectType }
     *     
     */
    public LocationObjectType getWorkSpaceReference() {
        return workSpaceReference;
    }

    /**
     * Sets the value of the workSpaceReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationObjectType }
     *     
     */
    public void setWorkSpaceReference(LocationObjectType value) {
        this.workSpaceReference = value;
    }

    /**
     * Gets the value of the academicPaySetupData property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicPaySetupDataType }
     *     
     */
    public AcademicPaySetupDataType getAcademicPaySetupData() {
        return academicPaySetupData;
    }

    /**
     * Sets the value of the academicPaySetupData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicPaySetupDataType }
     *     
     */
    public void setAcademicPaySetupData(AcademicPaySetupDataType value) {
        this.academicPaySetupData = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the payThroughDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPayThroughDate() {
        return payThroughDate;
    }

    /**
     * Sets the value of the payThroughDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPayThroughDate(XMLGregorianCalendar value) {
        this.payThroughDate = value;
    }

    /**
     * Gets the value of the collectiveAgreementSummaryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collectiveAgreementSummaryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollectiveAgreementSummaryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollectiveAgreementSummaryDataType }
     * 
     * 
     */
    public List<CollectiveAgreementSummaryDataType> getCollectiveAgreementSummaryData() {
        if (collectiveAgreementSummaryData == null) {
            collectiveAgreementSummaryData = new ArrayList<CollectiveAgreementSummaryDataType>();
        }
        return this.collectiveAgreementSummaryData;
    }

    /**
     * Gets the value of the employeeProbationPeriodSummaryData property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeProbationPeriodSummaryDataType }
     *     
     */
    public EmployeeProbationPeriodSummaryDataType getEmployeeProbationPeriodSummaryData() {
        return employeeProbationPeriodSummaryData;
    }

    /**
     * Sets the value of the employeeProbationPeriodSummaryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeProbationPeriodSummaryDataType }
     *     
     */
    public void setEmployeeProbationPeriodSummaryData(EmployeeProbationPeriodSummaryDataType value) {
        this.employeeProbationPeriodSummaryData = value;
    }

    /**
     * Gets the value of the managerAsOfLastDetectedManagerChangeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the managerAsOfLastDetectedManagerChangeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManagerAsOfLastDetectedManagerChangeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkerObjectType }
     * 
     * 
     */
    public List<WorkerObjectType> getManagerAsOfLastDetectedManagerChangeReference() {
        if (managerAsOfLastDetectedManagerChangeReference == null) {
            managerAsOfLastDetectedManagerChangeReference = new ArrayList<WorkerObjectType>();
        }
        return this.managerAsOfLastDetectedManagerChangeReference;
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
