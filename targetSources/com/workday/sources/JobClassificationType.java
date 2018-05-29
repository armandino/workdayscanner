
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Job Classification Group Data
 * 
 * <p>Java class for Job_ClassificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job_ClassificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Job_Classification_Reference" type="{urn:com.workday/bsvc}Job_ClassificationObjectType" minOccurs="0"/>
 *         &lt;element name="Job_Classification_Data" type="{urn:com.workday/bsvc}Job_Classification_DataType" minOccurs="0"/>
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
@XmlType(name = "Job_ClassificationType", propOrder = {
    "jobClassificationReference",
    "jobClassificationData"
})
public class JobClassificationType {

    @XmlElement(name = "Job_Classification_Reference")
    protected JobClassificationObjectType jobClassificationReference;
    @XmlElement(name = "Job_Classification_Data")
    protected JobClassificationDataType jobClassificationData;
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
     * Gets the value of the jobClassificationData property.
     * 
     * @return
     *     possible object is
     *     {@link JobClassificationDataType }
     *     
     */
    public JobClassificationDataType getJobClassificationData() {
        return jobClassificationData;
    }

    /**
     * Sets the value of the jobClassificationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobClassificationDataType }
     *     
     */
    public void setJobClassificationData(JobClassificationDataType value) {
        this.jobClassificationData = value;
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
