
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the job classifications from the job profile for the position and the additional job classifications specified for the position.
 * 
 * <p>Java class for Job_Classification_Summary_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job_Classification_Summary_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Job_Classification_Reference" type="{urn:com.workday/bsvc}Job_ClassificationObjectType" minOccurs="0"/>
 *         &lt;element name="Job_Group_Reference" type="{urn:com.workday/bsvc}Job_Classification_GroupObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Additional" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job_Classification_Summary_DataType", propOrder = {
    "jobClassificationReference",
    "jobGroupReference"
})
public class JobClassificationSummaryDataType {

    @XmlElement(name = "Job_Classification_Reference")
    protected JobClassificationObjectType jobClassificationReference;
    @XmlElement(name = "Job_Group_Reference")
    protected JobClassificationGroupObjectType jobGroupReference;
    @XmlAttribute(name = "Additional", namespace = "urn:com.workday/bsvc")
    protected Boolean additional;

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
     * Gets the value of the jobGroupReference property.
     * 
     * @return
     *     possible object is
     *     {@link JobClassificationGroupObjectType }
     *     
     */
    public JobClassificationGroupObjectType getJobGroupReference() {
        return jobGroupReference;
    }

    /**
     * Sets the value of the jobGroupReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobClassificationGroupObjectType }
     *     
     */
    public void setJobGroupReference(JobClassificationGroupObjectType value) {
        this.jobGroupReference = value;
    }

    /**
     * Gets the value of the additional property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdditional() {
        return additional;
    }

    /**
     * Sets the value of the additional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdditional(Boolean value) {
        this.additional = value;
    }

}
