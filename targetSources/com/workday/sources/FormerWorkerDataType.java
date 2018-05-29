
package com.workday.sources;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Data for a Former Worker.
 * 
 * <p>Java class for Former_Worker_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Former_Worker_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Former_Worker_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Worker_Type_Reference" type="{urn:com.workday/bsvc}Worker_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Last_Termination_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Most_Recent_Hire_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Original_Hire_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Continuous_Service_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Personal_Information_Data" type="{urn:com.workday/bsvc}Former_Worker_Personal_Information_DataType" minOccurs="0"/>
 *         &lt;element name="Last_Termination_Reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Manager" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cost_Center" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Job_Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Job_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Job_Profile_Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Job_Level" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Time_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Base_Pay" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="21"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Currency_Reference" type="{urn:com.workday/bsvc}CurrencyObjectType" minOccurs="0"/>
 *         &lt;element name="Frequency_Reference" type="{urn:com.workday/bsvc}FrequencyObjectType" minOccurs="0"/>
 *         &lt;element name="Scheduled_Weekly_Hours" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="14"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Eligible_for_Rehire" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Performance_Rating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Former_Worker_Related_Data" type="{urn:com.workday/bsvc}Former_Worker_Related_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Former_Worker_DataType", propOrder = {
    "id",
    "formerWorkerID",
    "workerTypeReference",
    "lastTerminationDate",
    "mostRecentHireDate",
    "originalHireDate",
    "continuousServiceDate",
    "personalInformationData",
    "lastTerminationReason",
    "manager",
    "costCenter",
    "jobTitle",
    "jobCode",
    "jobProfileText",
    "jobLevel",
    "timeType",
    "location",
    "basePay",
    "currencyReference",
    "frequencyReference",
    "scheduledWeeklyHours",
    "eligibleForRehire",
    "performanceRating",
    "formerWorkerRelatedData"
})
public class FormerWorkerDataType {

    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "Former_Worker_ID")
    protected String formerWorkerID;
    @XmlElement(name = "Worker_Type_Reference")
    protected WorkerTypeObjectType workerTypeReference;
    @XmlElement(name = "Last_Termination_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastTerminationDate;
    @XmlElement(name = "Most_Recent_Hire_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mostRecentHireDate;
    @XmlElement(name = "Original_Hire_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar originalHireDate;
    @XmlElement(name = "Continuous_Service_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar continuousServiceDate;
    @XmlElement(name = "Personal_Information_Data")
    protected FormerWorkerPersonalInformationDataType personalInformationData;
    @XmlElement(name = "Last_Termination_Reason")
    protected String lastTerminationReason;
    @XmlElement(name = "Manager")
    protected String manager;
    @XmlElement(name = "Cost_Center")
    protected String costCenter;
    @XmlElement(name = "Job_Title")
    protected String jobTitle;
    @XmlElement(name = "Job_Code")
    protected String jobCode;
    @XmlElement(name = "Job_Profile_Text")
    protected String jobProfileText;
    @XmlElement(name = "Job_Level")
    protected String jobLevel;
    @XmlElement(name = "Time_Type")
    protected String timeType;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "Base_Pay")
    protected BigDecimal basePay;
    @XmlElement(name = "Currency_Reference")
    protected CurrencyObjectType currencyReference;
    @XmlElement(name = "Frequency_Reference")
    protected FrequencyObjectType frequencyReference;
    @XmlElement(name = "Scheduled_Weekly_Hours")
    protected BigDecimal scheduledWeeklyHours;
    @XmlElement(name = "Eligible_for_Rehire")
    protected Boolean eligibleForRehire;
    @XmlElement(name = "Performance_Rating")
    protected String performanceRating;
    @XmlElement(name = "Former_Worker_Related_Data")
    protected FormerWorkerRelatedDataType formerWorkerRelatedData;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the formerWorkerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormerWorkerID() {
        return formerWorkerID;
    }

    /**
     * Sets the value of the formerWorkerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormerWorkerID(String value) {
        this.formerWorkerID = value;
    }

    /**
     * Gets the value of the workerTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerTypeObjectType }
     *     
     */
    public WorkerTypeObjectType getWorkerTypeReference() {
        return workerTypeReference;
    }

    /**
     * Sets the value of the workerTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerTypeObjectType }
     *     
     */
    public void setWorkerTypeReference(WorkerTypeObjectType value) {
        this.workerTypeReference = value;
    }

    /**
     * Gets the value of the lastTerminationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastTerminationDate() {
        return lastTerminationDate;
    }

    /**
     * Sets the value of the lastTerminationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastTerminationDate(XMLGregorianCalendar value) {
        this.lastTerminationDate = value;
    }

    /**
     * Gets the value of the mostRecentHireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMostRecentHireDate() {
        return mostRecentHireDate;
    }

    /**
     * Sets the value of the mostRecentHireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMostRecentHireDate(XMLGregorianCalendar value) {
        this.mostRecentHireDate = value;
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
     * Gets the value of the personalInformationData property.
     * 
     * @return
     *     possible object is
     *     {@link FormerWorkerPersonalInformationDataType }
     *     
     */
    public FormerWorkerPersonalInformationDataType getPersonalInformationData() {
        return personalInformationData;
    }

    /**
     * Sets the value of the personalInformationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormerWorkerPersonalInformationDataType }
     *     
     */
    public void setPersonalInformationData(FormerWorkerPersonalInformationDataType value) {
        this.personalInformationData = value;
    }

    /**
     * Gets the value of the lastTerminationReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastTerminationReason() {
        return lastTerminationReason;
    }

    /**
     * Sets the value of the lastTerminationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastTerminationReason(String value) {
        this.lastTerminationReason = value;
    }

    /**
     * Gets the value of the manager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManager() {
        return manager;
    }

    /**
     * Sets the value of the manager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManager(String value) {
        this.manager = value;
    }

    /**
     * Gets the value of the costCenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCenter() {
        return costCenter;
    }

    /**
     * Sets the value of the costCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCenter(String value) {
        this.costCenter = value;
    }

    /**
     * Gets the value of the jobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the value of the jobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTitle(String value) {
        this.jobTitle = value;
    }

    /**
     * Gets the value of the jobCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobCode() {
        return jobCode;
    }

    /**
     * Sets the value of the jobCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobCode(String value) {
        this.jobCode = value;
    }

    /**
     * Gets the value of the jobProfileText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobProfileText() {
        return jobProfileText;
    }

    /**
     * Sets the value of the jobProfileText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobProfileText(String value) {
        this.jobProfileText = value;
    }

    /**
     * Gets the value of the jobLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobLevel() {
        return jobLevel;
    }

    /**
     * Sets the value of the jobLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobLevel(String value) {
        this.jobLevel = value;
    }

    /**
     * Gets the value of the timeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeType() {
        return timeType;
    }

    /**
     * Sets the value of the timeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeType(String value) {
        this.timeType = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the basePay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBasePay() {
        return basePay;
    }

    /**
     * Sets the value of the basePay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBasePay(BigDecimal value) {
        this.basePay = value;
    }

    /**
     * Gets the value of the currencyReference property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyObjectType }
     *     
     */
    public CurrencyObjectType getCurrencyReference() {
        return currencyReference;
    }

    /**
     * Sets the value of the currencyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyObjectType }
     *     
     */
    public void setCurrencyReference(CurrencyObjectType value) {
        this.currencyReference = value;
    }

    /**
     * Gets the value of the frequencyReference property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyObjectType }
     *     
     */
    public FrequencyObjectType getFrequencyReference() {
        return frequencyReference;
    }

    /**
     * Sets the value of the frequencyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyObjectType }
     *     
     */
    public void setFrequencyReference(FrequencyObjectType value) {
        this.frequencyReference = value;
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
     * Gets the value of the eligibleForRehire property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEligibleForRehire() {
        return eligibleForRehire;
    }

    /**
     * Sets the value of the eligibleForRehire property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEligibleForRehire(Boolean value) {
        this.eligibleForRehire = value;
    }

    /**
     * Gets the value of the performanceRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerformanceRating() {
        return performanceRating;
    }

    /**
     * Sets the value of the performanceRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerformanceRating(String value) {
        this.performanceRating = value;
    }

    /**
     * Gets the value of the formerWorkerRelatedData property.
     * 
     * @return
     *     possible object is
     *     {@link FormerWorkerRelatedDataType }
     *     
     */
    public FormerWorkerRelatedDataType getFormerWorkerRelatedData() {
        return formerWorkerRelatedData;
    }

    /**
     * Sets the value of the formerWorkerRelatedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormerWorkerRelatedDataType }
     *     
     */
    public void setFormerWorkerRelatedData(FormerWorkerRelatedDataType value) {
        this.formerWorkerRelatedData = value;
    }

}
