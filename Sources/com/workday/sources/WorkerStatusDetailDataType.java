
package com.workday.sources;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Encapsulating element containing all Status data for a Worker.
 * 
 * <p>Java class for Worker_Status_Detail_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Status_Detail_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Active_Status_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Hire_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Original_Hire_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Hire_Reason_Reference" type="{urn:com.workday/bsvc}General_Event_SubcategoryObjectType" minOccurs="0"/>
 *         &lt;element name="End_Employment_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Continuous_Service_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="First_Day_of_Work" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Expected_Retirement_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Retirement_Eligibility_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Retired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Retirement_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Seniority_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Severance_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Benefits_Service_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Company_Service_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Time_Off_Service_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Vesting_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Date_Entered_Workforce" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Days_Unemployed" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="12"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Months_Continuous_Prior_Employment" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="14"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Terminated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Termination_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Pay_Through_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Primary_Termination_Reason_Reference" type="{urn:com.workday/bsvc}Termination_SubcategoryObjectType" minOccurs="0"/>
 *         &lt;element name="Primary_Termination_Category_Reference" type="{urn:com.workday/bsvc}Event_Classification_CategoryObjectType" minOccurs="0"/>
 *         &lt;element name="Termination_Involuntary" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Secondary_Termination_Reasons_Data" type="{urn:com.workday/bsvc}Secondary_Termination_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Local_Termination_Reason_Reference" type="{urn:com.workday/bsvc}Local_Termination_ReasonObjectType" minOccurs="0"/>
 *         &lt;element name="Not_Eligible_for_Hire" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Regrettable_Termination" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Not_Eligible_for_Rehire" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Hire_Rescinded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Termination_Last_Day_of_Work" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Resignation_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Last_Date_for_Which_Paid" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Expected_Date_of_Return" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Not_Returning" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Return_Unknown" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Probation_Start_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Probation_End_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Leave_Status_Data" type="{urn:com.workday/bsvc}Leave_Status_Detail_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Leave_Requests_Corrected_Data" type="{urn:com.workday/bsvc}Leave_Requests_Corrected_Detail_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Academic_Tenure_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Rehire" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Status_Detail_DataType", propOrder = {
    "active",
    "activeStatusDate",
    "hireDate",
    "originalHireDate",
    "hireReasonReference",
    "endEmploymentDate",
    "continuousServiceDate",
    "firstDayOfWork",
    "expectedRetirementDate",
    "retirementEligibilityDate",
    "retired",
    "retirementDate",
    "seniorityDate",
    "severanceDate",
    "benefitsServiceDate",
    "companyServiceDate",
    "timeOffServiceDate",
    "vestingDate",
    "dateEnteredWorkforce",
    "daysUnemployed",
    "monthsContinuousPriorEmployment",
    "terminated",
    "terminationDate",
    "payThroughDate",
    "primaryTerminationReasonReference",
    "primaryTerminationCategoryReference",
    "terminationInvoluntary",
    "secondaryTerminationReasonsData",
    "localTerminationReasonReference",
    "notEligibleForHire",
    "regrettableTermination",
    "notEligibleForRehire",
    "hireRescinded",
    "terminationLastDayOfWork",
    "resignationDate",
    "lastDateForWhichPaid",
    "expectedDateOfReturn",
    "notReturning",
    "returnUnknown",
    "probationStartDate",
    "probationEndDate",
    "leaveStatusData",
    "leaveRequestsCorrectedData",
    "academicTenureDate",
    "rehire"
})
public class WorkerStatusDetailDataType {

    @XmlElement(name = "Active")
    protected Boolean active;
    @XmlElement(name = "Active_Status_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar activeStatusDate;
    @XmlElement(name = "Hire_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar hireDate;
    @XmlElement(name = "Original_Hire_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar originalHireDate;
    @XmlElement(name = "Hire_Reason_Reference")
    protected GeneralEventSubcategoryObjectType hireReasonReference;
    @XmlElement(name = "End_Employment_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endEmploymentDate;
    @XmlElement(name = "Continuous_Service_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar continuousServiceDate;
    @XmlElement(name = "First_Day_of_Work")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstDayOfWork;
    @XmlElement(name = "Expected_Retirement_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expectedRetirementDate;
    @XmlElement(name = "Retirement_Eligibility_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar retirementEligibilityDate;
    @XmlElement(name = "Retired")
    protected Boolean retired;
    @XmlElement(name = "Retirement_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar retirementDate;
    @XmlElement(name = "Seniority_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar seniorityDate;
    @XmlElement(name = "Severance_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar severanceDate;
    @XmlElement(name = "Benefits_Service_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar benefitsServiceDate;
    @XmlElement(name = "Company_Service_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar companyServiceDate;
    @XmlElement(name = "Time_Off_Service_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar timeOffServiceDate;
    @XmlElement(name = "Vesting_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vestingDate;
    @XmlElement(name = "Date_Entered_Workforce")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateEnteredWorkforce;
    @XmlElement(name = "Days_Unemployed")
    protected BigDecimal daysUnemployed;
    @XmlElement(name = "Months_Continuous_Prior_Employment")
    protected BigDecimal monthsContinuousPriorEmployment;
    @XmlElement(name = "Terminated")
    protected Boolean terminated;
    @XmlElement(name = "Termination_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar terminationDate;
    @XmlElement(name = "Pay_Through_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar payThroughDate;
    @XmlElement(name = "Primary_Termination_Reason_Reference")
    protected TerminationSubcategoryObjectType primaryTerminationReasonReference;
    @XmlElement(name = "Primary_Termination_Category_Reference")
    protected EventClassificationCategoryObjectType primaryTerminationCategoryReference;
    @XmlElement(name = "Termination_Involuntary")
    protected Boolean terminationInvoluntary;
    @XmlElement(name = "Secondary_Termination_Reasons_Data")
    protected List<SecondaryTerminationDataType> secondaryTerminationReasonsData;
    @XmlElement(name = "Local_Termination_Reason_Reference")
    protected LocalTerminationReasonObjectType localTerminationReasonReference;
    @XmlElement(name = "Not_Eligible_for_Hire")
    protected Boolean notEligibleForHire;
    @XmlElement(name = "Regrettable_Termination")
    protected Boolean regrettableTermination;
    @XmlElement(name = "Not_Eligible_for_Rehire")
    protected Boolean notEligibleForRehire;
    @XmlElement(name = "Hire_Rescinded")
    protected Boolean hireRescinded;
    @XmlElement(name = "Termination_Last_Day_of_Work")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar terminationLastDayOfWork;
    @XmlElement(name = "Resignation_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar resignationDate;
    @XmlElement(name = "Last_Date_for_Which_Paid")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastDateForWhichPaid;
    @XmlElement(name = "Expected_Date_of_Return")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expectedDateOfReturn;
    @XmlElement(name = "Not_Returning")
    protected Boolean notReturning;
    @XmlElement(name = "Return_Unknown")
    protected Boolean returnUnknown;
    @XmlElement(name = "Probation_Start_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar probationStartDate;
    @XmlElement(name = "Probation_End_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar probationEndDate;
    @XmlElement(name = "Leave_Status_Data")
    protected List<LeaveStatusDetailDataType> leaveStatusData;
    @XmlElement(name = "Leave_Requests_Corrected_Data")
    protected List<LeaveRequestsCorrectedDetailDataType> leaveRequestsCorrectedData;
    @XmlElement(name = "Academic_Tenure_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar academicTenureDate;
    @XmlElement(name = "Rehire")
    protected Boolean rehire;

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the activeStatusDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActiveStatusDate() {
        return activeStatusDate;
    }

    /**
     * Sets the value of the activeStatusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActiveStatusDate(XMLGregorianCalendar value) {
        this.activeStatusDate = value;
    }

    /**
     * Gets the value of the hireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHireDate() {
        return hireDate;
    }

    /**
     * Sets the value of the hireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHireDate(XMLGregorianCalendar value) {
        this.hireDate = value;
    }

    /**
     * Gets the value of the originalHireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginalHireDate() {
        return originalHireDate;
    }

    /**
     * Sets the value of the originalHireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginalHireDate(XMLGregorianCalendar value) {
        this.originalHireDate = value;
    }

    /**
     * Gets the value of the hireReasonReference property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralEventSubcategoryObjectType }
     *     
     */
    public GeneralEventSubcategoryObjectType getHireReasonReference() {
        return hireReasonReference;
    }

    /**
     * Sets the value of the hireReasonReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralEventSubcategoryObjectType }
     *     
     */
    public void setHireReasonReference(GeneralEventSubcategoryObjectType value) {
        this.hireReasonReference = value;
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
     * Gets the value of the continuousServiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContinuousServiceDate() {
        return continuousServiceDate;
    }

    /**
     * Sets the value of the continuousServiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContinuousServiceDate(XMLGregorianCalendar value) {
        this.continuousServiceDate = value;
    }

    /**
     * Gets the value of the firstDayOfWork property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstDayOfWork() {
        return firstDayOfWork;
    }

    /**
     * Sets the value of the firstDayOfWork property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstDayOfWork(XMLGregorianCalendar value) {
        this.firstDayOfWork = value;
    }

    /**
     * Gets the value of the expectedRetirementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedRetirementDate() {
        return expectedRetirementDate;
    }

    /**
     * Sets the value of the expectedRetirementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedRetirementDate(XMLGregorianCalendar value) {
        this.expectedRetirementDate = value;
    }

    /**
     * Gets the value of the retirementEligibilityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRetirementEligibilityDate() {
        return retirementEligibilityDate;
    }

    /**
     * Sets the value of the retirementEligibilityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRetirementEligibilityDate(XMLGregorianCalendar value) {
        this.retirementEligibilityDate = value;
    }

    /**
     * Gets the value of the retired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetired() {
        return retired;
    }

    /**
     * Sets the value of the retired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetired(Boolean value) {
        this.retired = value;
    }

    /**
     * Gets the value of the retirementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRetirementDate() {
        return retirementDate;
    }

    /**
     * Sets the value of the retirementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRetirementDate(XMLGregorianCalendar value) {
        this.retirementDate = value;
    }

    /**
     * Gets the value of the seniorityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSeniorityDate() {
        return seniorityDate;
    }

    /**
     * Sets the value of the seniorityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSeniorityDate(XMLGregorianCalendar value) {
        this.seniorityDate = value;
    }

    /**
     * Gets the value of the severanceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSeveranceDate() {
        return severanceDate;
    }

    /**
     * Sets the value of the severanceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSeveranceDate(XMLGregorianCalendar value) {
        this.severanceDate = value;
    }

    /**
     * Gets the value of the benefitsServiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBenefitsServiceDate() {
        return benefitsServiceDate;
    }

    /**
     * Sets the value of the benefitsServiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBenefitsServiceDate(XMLGregorianCalendar value) {
        this.benefitsServiceDate = value;
    }

    /**
     * Gets the value of the companyServiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompanyServiceDate() {
        return companyServiceDate;
    }

    /**
     * Sets the value of the companyServiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompanyServiceDate(XMLGregorianCalendar value) {
        this.companyServiceDate = value;
    }

    /**
     * Gets the value of the timeOffServiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeOffServiceDate() {
        return timeOffServiceDate;
    }

    /**
     * Sets the value of the timeOffServiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeOffServiceDate(XMLGregorianCalendar value) {
        this.timeOffServiceDate = value;
    }

    /**
     * Gets the value of the vestingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVestingDate() {
        return vestingDate;
    }

    /**
     * Sets the value of the vestingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVestingDate(XMLGregorianCalendar value) {
        this.vestingDate = value;
    }

    /**
     * Gets the value of the dateEnteredWorkforce property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateEnteredWorkforce() {
        return dateEnteredWorkforce;
    }

    /**
     * Sets the value of the dateEnteredWorkforce property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateEnteredWorkforce(XMLGregorianCalendar value) {
        this.dateEnteredWorkforce = value;
    }

    /**
     * Gets the value of the daysUnemployed property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDaysUnemployed() {
        return daysUnemployed;
    }

    /**
     * Sets the value of the daysUnemployed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDaysUnemployed(BigDecimal value) {
        this.daysUnemployed = value;
    }

    /**
     * Gets the value of the monthsContinuousPriorEmployment property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonthsContinuousPriorEmployment() {
        return monthsContinuousPriorEmployment;
    }

    /**
     * Sets the value of the monthsContinuousPriorEmployment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonthsContinuousPriorEmployment(BigDecimal value) {
        this.monthsContinuousPriorEmployment = value;
    }

    /**
     * Gets the value of the terminated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTerminated() {
        return terminated;
    }

    /**
     * Sets the value of the terminated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTerminated(Boolean value) {
        this.terminated = value;
    }

    /**
     * Gets the value of the terminationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTerminationDate() {
        return terminationDate;
    }

    /**
     * Sets the value of the terminationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTerminationDate(XMLGregorianCalendar value) {
        this.terminationDate = value;
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
     * Gets the value of the primaryTerminationReasonReference property.
     * 
     * @return
     *     possible object is
     *     {@link TerminationSubcategoryObjectType }
     *     
     */
    public TerminationSubcategoryObjectType getPrimaryTerminationReasonReference() {
        return primaryTerminationReasonReference;
    }

    /**
     * Sets the value of the primaryTerminationReasonReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationSubcategoryObjectType }
     *     
     */
    public void setPrimaryTerminationReasonReference(TerminationSubcategoryObjectType value) {
        this.primaryTerminationReasonReference = value;
    }

    /**
     * Gets the value of the primaryTerminationCategoryReference property.
     * 
     * @return
     *     possible object is
     *     {@link EventClassificationCategoryObjectType }
     *     
     */
    public EventClassificationCategoryObjectType getPrimaryTerminationCategoryReference() {
        return primaryTerminationCategoryReference;
    }

    /**
     * Sets the value of the primaryTerminationCategoryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventClassificationCategoryObjectType }
     *     
     */
    public void setPrimaryTerminationCategoryReference(EventClassificationCategoryObjectType value) {
        this.primaryTerminationCategoryReference = value;
    }

    /**
     * Gets the value of the terminationInvoluntary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTerminationInvoluntary() {
        return terminationInvoluntary;
    }

    /**
     * Sets the value of the terminationInvoluntary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTerminationInvoluntary(Boolean value) {
        this.terminationInvoluntary = value;
    }

    /**
     * Gets the value of the secondaryTerminationReasonsData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondaryTerminationReasonsData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondaryTerminationReasonsData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecondaryTerminationDataType }
     * 
     * 
     */
    public List<SecondaryTerminationDataType> getSecondaryTerminationReasonsData() {
        if (secondaryTerminationReasonsData == null) {
            secondaryTerminationReasonsData = new ArrayList<SecondaryTerminationDataType>();
        }
        return this.secondaryTerminationReasonsData;
    }

    /**
     * Gets the value of the localTerminationReasonReference property.
     * 
     * @return
     *     possible object is
     *     {@link LocalTerminationReasonObjectType }
     *     
     */
    public LocalTerminationReasonObjectType getLocalTerminationReasonReference() {
        return localTerminationReasonReference;
    }

    /**
     * Sets the value of the localTerminationReasonReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalTerminationReasonObjectType }
     *     
     */
    public void setLocalTerminationReasonReference(LocalTerminationReasonObjectType value) {
        this.localTerminationReasonReference = value;
    }

    /**
     * Gets the value of the notEligibleForHire property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotEligibleForHire() {
        return notEligibleForHire;
    }

    /**
     * Sets the value of the notEligibleForHire property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotEligibleForHire(Boolean value) {
        this.notEligibleForHire = value;
    }

    /**
     * Gets the value of the regrettableTermination property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegrettableTermination() {
        return regrettableTermination;
    }

    /**
     * Sets the value of the regrettableTermination property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegrettableTermination(Boolean value) {
        this.regrettableTermination = value;
    }

    /**
     * Gets the value of the notEligibleForRehire property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotEligibleForRehire() {
        return notEligibleForRehire;
    }

    /**
     * Sets the value of the notEligibleForRehire property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotEligibleForRehire(Boolean value) {
        this.notEligibleForRehire = value;
    }

    /**
     * Gets the value of the hireRescinded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHireRescinded() {
        return hireRescinded;
    }

    /**
     * Sets the value of the hireRescinded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHireRescinded(Boolean value) {
        this.hireRescinded = value;
    }

    /**
     * Gets the value of the terminationLastDayOfWork property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTerminationLastDayOfWork() {
        return terminationLastDayOfWork;
    }

    /**
     * Sets the value of the terminationLastDayOfWork property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTerminationLastDayOfWork(XMLGregorianCalendar value) {
        this.terminationLastDayOfWork = value;
    }

    /**
     * Gets the value of the resignationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResignationDate() {
        return resignationDate;
    }

    /**
     * Sets the value of the resignationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResignationDate(XMLGregorianCalendar value) {
        this.resignationDate = value;
    }

    /**
     * Gets the value of the lastDateForWhichPaid property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastDateForWhichPaid() {
        return lastDateForWhichPaid;
    }

    /**
     * Sets the value of the lastDateForWhichPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastDateForWhichPaid(XMLGregorianCalendar value) {
        this.lastDateForWhichPaid = value;
    }

    /**
     * Gets the value of the expectedDateOfReturn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedDateOfReturn() {
        return expectedDateOfReturn;
    }

    /**
     * Sets the value of the expectedDateOfReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedDateOfReturn(XMLGregorianCalendar value) {
        this.expectedDateOfReturn = value;
    }

    /**
     * Gets the value of the notReturning property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotReturning() {
        return notReturning;
    }

    /**
     * Sets the value of the notReturning property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotReturning(Boolean value) {
        this.notReturning = value;
    }

    /**
     * Gets the value of the returnUnknown property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnUnknown() {
        return returnUnknown;
    }

    /**
     * Sets the value of the returnUnknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnUnknown(Boolean value) {
        this.returnUnknown = value;
    }

    /**
     * Gets the value of the probationStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProbationStartDate() {
        return probationStartDate;
    }

    /**
     * Sets the value of the probationStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProbationStartDate(XMLGregorianCalendar value) {
        this.probationStartDate = value;
    }

    /**
     * Gets the value of the probationEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProbationEndDate() {
        return probationEndDate;
    }

    /**
     * Sets the value of the probationEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProbationEndDate(XMLGregorianCalendar value) {
        this.probationEndDate = value;
    }

    /**
     * Gets the value of the leaveStatusData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leaveStatusData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeaveStatusData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LeaveStatusDetailDataType }
     * 
     * 
     */
    public List<LeaveStatusDetailDataType> getLeaveStatusData() {
        if (leaveStatusData == null) {
            leaveStatusData = new ArrayList<LeaveStatusDetailDataType>();
        }
        return this.leaveStatusData;
    }

    /**
     * Gets the value of the leaveRequestsCorrectedData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leaveRequestsCorrectedData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeaveRequestsCorrectedData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LeaveRequestsCorrectedDetailDataType }
     * 
     * 
     */
    public List<LeaveRequestsCorrectedDetailDataType> getLeaveRequestsCorrectedData() {
        if (leaveRequestsCorrectedData == null) {
            leaveRequestsCorrectedData = new ArrayList<LeaveRequestsCorrectedDetailDataType>();
        }
        return this.leaveRequestsCorrectedData;
    }

    /**
     * Gets the value of the academicTenureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcademicTenureDate() {
        return academicTenureDate;
    }

    /**
     * Sets the value of the academicTenureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcademicTenureDate(XMLGregorianCalendar value) {
        this.academicTenureDate = value;
    }

    /**
     * Gets the value of the rehire property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRehire() {
        return rehire;
    }

    /**
     * Sets the value of the rehire property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRehire(Boolean value) {
        this.rehire = value;
    }

}
