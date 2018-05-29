
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response element containing an instance of Job Profile and its associated data.
 * 
 * <p>Java class for Job_Profile_Get_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job_Profile_Get_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Job_Profile_Reference" type="{urn:com.workday/bsvc}Job_ProfileObjectType" minOccurs="0"/>
 *         &lt;element name="Job_Profile_Data" type="{urn:com.workday/bsvc}Job_Profile_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job_Profile_Get_DataType", propOrder = {
    "jobProfileReference",
    "jobProfileData"
})
public class JobProfileGetDataType {

    @XmlElement(name = "Job_Profile_Reference")
    protected JobProfileObjectType jobProfileReference;
    @XmlElement(name = "Job_Profile_Data")
    protected JobProfileDataType jobProfileData;

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

}
