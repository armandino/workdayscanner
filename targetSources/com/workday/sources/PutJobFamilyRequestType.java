
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request element for Put Job Family
 * 
 * <p>Java class for Put_Job_Family_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Job_Family_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Job_Family_Reference" type="{urn:com.workday/bsvc}Job_FamilyObjectType" minOccurs="0"/>
 *         &lt;element name="Job_Family_Data" type="{urn:com.workday/bsvc}Job_Family_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Add_Only" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute ref="{urn:com.workday/bsvc}version"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Put_Job_Family_RequestType", propOrder = {
    "jobFamilyReference",
    "jobFamilyData"
})
public class PutJobFamilyRequestType {

    @XmlElement(name = "Job_Family_Reference")
    protected JobFamilyObjectType jobFamilyReference;
    @XmlElement(name = "Job_Family_Data")
    protected JobFamilyDataType jobFamilyData;
    @XmlAttribute(name = "Add_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean addOnly;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the jobFamilyReference property.
     * 
     * @return
     *     possible object is
     *     {@link JobFamilyObjectType }
     *     
     */
    public JobFamilyObjectType getJobFamilyReference() {
        return jobFamilyReference;
    }

    /**
     * Sets the value of the jobFamilyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobFamilyObjectType }
     *     
     */
    public void setJobFamilyReference(JobFamilyObjectType value) {
        this.jobFamilyReference = value;
    }

    /**
     * Gets the value of the jobFamilyData property.
     * 
     * @return
     *     possible object is
     *     {@link JobFamilyDataType }
     *     
     */
    public JobFamilyDataType getJobFamilyData() {
        return jobFamilyData;
    }

    /**
     * Sets the value of the jobFamilyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobFamilyDataType }
     *     
     */
    public void setJobFamilyData(JobFamilyDataType value) {
        this.jobFamilyData = value;
    }

    /**
     * Gets the value of the addOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddOnly() {
        return addOnly;
    }

    /**
     * Sets the value of the addOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddOnly(Boolean value) {
        this.addOnly = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
