
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Wrapper element for the job history information.
 * 
 * <p>Java class for Job_History_Achievement_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job_History_Achievement_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Job_History_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remove_Job_History" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Job_Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Job_History_Company_Reference" type="{urn:com.workday/bsvc}Job_History_CompanyObjectType" minOccurs="0"/>
 *         &lt;element name="Start_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="End_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Responsibilities_and_Achievements" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Job_Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job_History_Achievement_DataType", propOrder = {
    "jobHistoryID",
    "removeJobHistory",
    "jobTitle",
    "company",
    "jobHistoryCompanyReference",
    "startDate",
    "endDate",
    "responsibilitiesAndAchievements",
    "location",
    "jobReference",
    "contact"
})
public class JobHistoryAchievementDataType {

    @XmlElement(name = "Job_History_ID")
    protected String jobHistoryID;
    @XmlElement(name = "Remove_Job_History")
    protected Boolean removeJobHistory;
    @XmlElement(name = "Job_Title")
    protected String jobTitle;
    @XmlElement(name = "Company")
    protected String company;
    @XmlElement(name = "Job_History_Company_Reference")
    protected JobHistoryCompanyObjectType jobHistoryCompanyReference;
    @XmlElement(name = "Start_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "End_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "Responsibilities_and_Achievements")
    protected String responsibilitiesAndAchievements;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "Job_Reference")
    protected String jobReference;
    @XmlElement(name = "Contact")
    protected String contact;

    /**
     * Gets the value of the jobHistoryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobHistoryID() {
        return jobHistoryID;
    }

    /**
     * Sets the value of the jobHistoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobHistoryID(String value) {
        this.jobHistoryID = value;
    }

    /**
     * Gets the value of the removeJobHistory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoveJobHistory() {
        return removeJobHistory;
    }

    /**
     * Sets the value of the removeJobHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoveJobHistory(Boolean value) {
        this.removeJobHistory = value;
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
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the jobHistoryCompanyReference property.
     * 
     * @return
     *     possible object is
     *     {@link JobHistoryCompanyObjectType }
     *     
     */
    public JobHistoryCompanyObjectType getJobHistoryCompanyReference() {
        return jobHistoryCompanyReference;
    }

    /**
     * Sets the value of the jobHistoryCompanyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobHistoryCompanyObjectType }
     *     
     */
    public void setJobHistoryCompanyReference(JobHistoryCompanyObjectType value) {
        this.jobHistoryCompanyReference = value;
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
     * Gets the value of the responsibilitiesAndAchievements property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsibilitiesAndAchievements() {
        return responsibilitiesAndAchievements;
    }

    /**
     * Sets the value of the responsibilitiesAndAchievements property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsibilitiesAndAchievements(String value) {
        this.responsibilitiesAndAchievements = value;
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
     * Gets the value of the jobReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobReference() {
        return jobReference;
    }

    /**
     * Sets the value of the jobReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobReference(String value) {
        this.jobReference = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact(String value) {
        this.contact = value;
    }

}
