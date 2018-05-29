
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains Job Family information
 * 
 * <p>Java class for Job_FamilyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job_FamilyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Job_Family_Reference" type="{urn:com.workday/bsvc}Job_FamilyObjectType" minOccurs="0"/>
 *         &lt;element name="Job_Family_Data" type="{urn:com.workday/bsvc}Job_Family_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job_FamilyType", propOrder = {
    "jobFamilyReference",
    "jobFamilyData"
})
public class JobFamilyType {

    @XmlElement(name = "Job_Family_Reference")
    protected JobFamilyObjectType jobFamilyReference;
    @XmlElement(name = "Job_Family_Data")
    protected JobFamilyDataType jobFamilyData;

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

}
