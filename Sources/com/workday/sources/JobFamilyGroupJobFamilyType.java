
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Job Family Data.  Contains the references to Job Families contained in the group.  Optionally contains other data about the contained families, however this extra data is for information only and cannot be updated here.
 * 
 * <p>Java class for Job_Family_Group_Job_FamilyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job_Family_Group_Job_FamilyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Job_Family_Reference" type="{urn:com.workday/bsvc}Job_FamilyObjectType"/>
 *         &lt;element name="Job_Family_Info_Data" type="{urn:com.workday/bsvc}Job_Family_Group_Job_Family_DataType" minOccurs="0"/>
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
@XmlType(name = "Job_Family_Group_Job_FamilyType", propOrder = {
    "jobFamilyReference",
    "jobFamilyInfoData"
})
public class JobFamilyGroupJobFamilyType {

    @XmlElement(name = "Job_Family_Reference", required = true)
    protected JobFamilyObjectType jobFamilyReference;
    @XmlElement(name = "Job_Family_Info_Data")
    protected JobFamilyGroupJobFamilyDataType jobFamilyInfoData;
    @XmlAttribute(name = "Delete", namespace = "urn:com.workday/bsvc")
    protected Boolean delete;

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
     * Gets the value of the jobFamilyInfoData property.
     * 
     * @return
     *     possible object is
     *     {@link JobFamilyGroupJobFamilyDataType }
     *     
     */
    public JobFamilyGroupJobFamilyDataType getJobFamilyInfoData() {
        return jobFamilyInfoData;
    }

    /**
     * Sets the value of the jobFamilyInfoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobFamilyGroupJobFamilyDataType }
     *     
     */
    public void setJobFamilyInfoData(JobFamilyGroupJobFamilyDataType value) {
        this.jobFamilyInfoData = value;
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
