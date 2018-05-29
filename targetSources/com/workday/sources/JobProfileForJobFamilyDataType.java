
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element containing the Job Profile reference for a Job Family.
 * 
 * <p>Java class for Job_Profile_for_Job_Family_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job_Profile_for_Job_Family_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Job_Profile_Reference" type="{urn:com.workday/bsvc}Job_ProfileObjectType" minOccurs="0"/>
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
@XmlType(name = "Job_Profile_for_Job_Family_DataType", propOrder = {
    "jobProfileReference"
})
public class JobProfileForJobFamilyDataType {

    @XmlElement(name = "Job_Profile_Reference")
    protected JobProfileObjectType jobProfileReference;
    @XmlAttribute(name = "Delete", namespace = "urn:com.workday/bsvc")
    protected Boolean delete;

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
