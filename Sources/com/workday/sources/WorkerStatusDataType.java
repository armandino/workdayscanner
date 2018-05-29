
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
 * <p>Java class for Worker_Status_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Status_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Hire_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Original_Hire_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="End_Employment_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Hire_Reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="Leave_Status_Data" type="{urn:com.workday/bsvc}Leave_Status_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Termination_Status_Data" type="{urn:com.workday/bsvc}Termination_Status_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Probation_Status_Data" type="{urn:com.workday/bsvc}Probation_Status_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Status_DataType", propOrder = {
    "active",
    "hireDate",
    "originalHireDate",
    "endEmploymentDate",
    "hireReason",
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
    "leaveStatusData",
    "terminationStatusData",
    "probationStatusData"
})
public class WorkerStatusDataType {

    @XmlElement(name = "Active")
    protected Boolean active;
    @XmlElement(name = "Hire_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar hireDate;
    @XmlElement(name = "Original_Hire_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar originalHireDate;
    @XmlElement(name = "End_Employment_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endEmploymentDate;
    @XmlElement(name = "Hire_Reason")
    protected String hireReason;
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
    @XmlElement(name = "Leave_Status_Data")
    protected List<LeaveStatusDataType> leaveStatusData;
    @XmlElement(name = "Termination_Status_Data")
    protected List<TerminationStatusDataType> terminationStatusData;
    @XmlElement(name = "Probation_Status_Data")
    protected List<ProbationStatusDataType> probationStatusData;

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
     * Gets the value of the hireReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHireReason() {
        return hireReason;
    }

    /**
     * Sets the value of the hireReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHireReason(String value) {
        this.hireReason = value;
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
     * {@link LeaveStatusDataType }
     * 
     * 
     */
    public List<LeaveStatusDataType> getLeaveStatusData() {
        if (leaveStatusData == null) {
            leaveStatusData = new ArrayList<LeaveStatusDataType>();
        }
        return this.leaveStatusData;
    }

    /**
     * Gets the value of the terminationStatusData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the terminationStatusData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerminationStatusData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TerminationStatusDataType }
     * 
     * 
     */
    public List<TerminationStatusDataType> getTerminationStatusData() {
        if (terminationStatusData == null) {
            terminationStatusData = new ArrayList<TerminationStatusDataType>();
        }
        return this.terminationStatusData;
    }

    /**
     * Gets the value of the probationStatusData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the probationStatusData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProbationStatusData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProbationStatusDataType }
     * 
     * 
     */
    public List<ProbationStatusDataType> getProbationStatusData() {
        if (probationStatusData == null) {
            probationStatusData = new ArrayList<ProbationStatusDataType>();
        }
        return this.probationStatusData;
    }

}
