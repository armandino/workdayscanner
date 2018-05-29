
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element containing the Job Family data for a job profile.
 * 
 * <p>Java class for Job_Profile_Job_Family_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job_Profile_Job_Family_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Job_Family_Reference" type="{urn:com.workday/bsvc}Job_Family_BaseObjectType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Delete" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job_Profile_Job_Family_DataType", propOrder = {
    "jobFamilyReference"
})
public class JobProfileJobFamilyDataType {

    @XmlElement(name = "Job_Family_Reference", required = true)
    protected JobFamilyBaseObjectType jobFamilyReference;
    @XmlAttribute(name = "Delete", namespace = "urn:com.workday/bsvc")
    protected Boolean delete;

    /**
     * Gets the value of the jobFamilyReference property.
     * 
     * @return
     *     possible object is
     *     {@link JobFamilyBaseObjectType }
     *     
     */
    public JobFamilyBaseObjectType getJobFamilyReference() {
        return jobFamilyReference;
    }

    /**
     * Sets the value of the jobFamilyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobFamilyBaseObjectType }
     *     
     */
    public void setJobFamilyReference(JobFamilyBaseObjectType value) {
        this.jobFamilyReference = value;
    }

    /**
     * Gets the value of the delete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelete() {
        return delete;
    }

    /**
     * Sets the value of the delete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelete(Boolean value) {
        this.delete = value;
    }

}
