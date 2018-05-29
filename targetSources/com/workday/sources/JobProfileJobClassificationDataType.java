
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element containing Job Classification data for a Job Profile.
 * 
 * <p>Java class for Job_Profile_Job_Classification_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job_Profile_Job_Classification_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Job_Classification_Reference" type="{urn:com.workday/bsvc}Job_ClassificationObjectType"/>
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
@XmlType(name = "Job_Profile_Job_Classification_DataType", propOrder = {
    "jobClassificationReference"
})
public class JobProfileJobClassificationDataType {

    @XmlElement(name = "Job_Classification_Reference", required = true)
    protected JobClassificationObjectType jobClassificationReference;
    @XmlAttribute(name = "Delete", namespace = "urn:com.workday/bsvc")
    protected Boolean delete;

    /**
     * Gets the value of the jobClassificationReference property.
     * 
     * @return
     *     possible object is
     *     {@link JobClassificationObjectType }
     *     
     */
    public JobClassificationObjectType getJobClassificationReference() {
        return jobClassificationReference;
    }

    /**
     * Sets the value of the jobClassificationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobClassificationObjectType }
     *     
     */
    public void setJobClassificationReference(JobClassificationObjectType value) {
        this.jobClassificationReference = value;
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
