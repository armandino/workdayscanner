
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains data for adding or updating a Job Profile.
 * 
 * <p>Java class for Put_Job_Profile_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Job_Profile_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Job_Profile_Reference" type="{urn:com.workday/bsvc}Job_ProfileObjectType" minOccurs="0"/>
 *         &lt;element name="Job_Profile_Data" type="{urn:com.workday/bsvc}Job_Profile_DataType"/>
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
@XmlType(name = "Put_Job_Profile_RequestType", propOrder = {
    "jobProfileReference",
    "jobProfileData"
})
public class PutJobProfileRequestType {

    @XmlElement(name = "Job_Profile_Reference")
    protected JobProfileObjectType jobProfileReference;
    @XmlElement(name = "Job_Profile_Data", required = true)
    protected JobProfileDataType jobProfileData;
    @XmlAttribute(name = "Add_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean addOnly;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the jobProfileReference property.
     * 
     * @return
     *     possible object is
     *     {@link JobProfileObjectType }
     *     
     */
    public JobProfileObjectType getJobProfileReference() {
        return jobProfileReference;
    }

    /**
     * Sets the value of the jobProfileReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobProfileObjectType }
     *     
     */
    public void setJobProfileReference(JobProfileObjectType value) {
        this.jobProfileReference = value;
    }

    /**
     * Gets the value of the jobProfileData property.
     * 
     * @return
     *     possible object is
     *     {@link JobProfileDataType }
     *     
     */
    public JobProfileDataType getJobProfileData() {
        return jobProfileData;
    }

    /**
     * Sets the value of the jobProfileData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobProfileDataType }
     *     
     */
    public void setJobProfileData(JobProfileDataType value) {
        this.jobProfileData = value;
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
