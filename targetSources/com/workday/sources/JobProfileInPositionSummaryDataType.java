
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the job profile for the position.
 * 
 * <p>Java class for Job_Profile_in_Position_Summary_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job_Profile_in_Position_Summary_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Job_Profile_Reference" type="{urn:com.workday/bsvc}Job_ProfileObjectType" minOccurs="0"/>
 *         &lt;element name="Job_Exempt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Management_Level_Reference" type="{urn:com.workday/bsvc}Management_LevelObjectType" minOccurs="0"/>
 *         &lt;element name="Job_Category_Reference" type="{urn:com.workday/bsvc}Job_CategoryObjectType" minOccurs="0"/>
 *         &lt;element name="Job_Family_Reference" type="{urn:com.workday/bsvc}Job_Family_BaseObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Job_Profile_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Work_Shift_Required" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Critical_Job" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Difficulty_to_Fill_Reference" type="{urn:com.workday/bsvc}Difficulty_to_FillObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job_Profile_in_Position_Summary_DataType", propOrder = {
    "jobProfileReference",
    "jobExempt",
    "managementLevelReference",
    "jobCategoryReference",
    "jobFamilyReference",
    "jobProfileName",
    "workShiftRequired",
    "criticalJob",
    "difficultyToFillReference"
})
public class JobProfileInPositionSummaryDataType {

    @XmlElement(name = "Job_Profile_Reference")
    protected JobProfileObjectType jobProfileReference;
    @XmlElement(name = "Job_Exempt")
    protected Boolean jobExempt;
    @XmlElement(name = "Management_Level_Reference")
    protected ManagementLevelObjectType managementLevelReference;
    @XmlElement(name = "Job_Category_Reference")
    protected JobCategoryObjectType jobCategoryReference;
    @XmlElement(name = "Job_Family_Reference")
    protected List<JobFamilyBaseObjectType> jobFamilyReference;
    @XmlElement(name = "Job_Profile_Name")
    protected String jobProfileName;
    @XmlElement(name = "Work_Shift_Required")
    protected Boolean workShiftRequired;
    @XmlElement(name = "Critical_Job")
    protected Boolean criticalJob;
    @XmlElement(name = "Difficulty_to_Fill_Reference")
    protected DifficultyToFillObjectType difficultyToFillReference;

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
     * Gets the value of the jobExempt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isJobExempt() {
        return jobExempt;
    }

    /**
     * Sets the value of the jobExempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJobExempt(Boolean value) {
        this.jobExempt = value;
    }

    /**
     * Gets the value of the managementLevelReference property.
     * 
     * @return
     *     possible object is
     *     {@link ManagementLevelObjectType }
     *     
     */
    public ManagementLevelObjectType getManagementLevelReference() {
        return managementLevelReference;
    }

    /**
     * Sets the value of the managementLevelReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagementLevelObjectType }
     *     
     */
    public void setManagementLevelReference(ManagementLevelObjectType value) {
        this.managementLevelReference = value;
    }

    /**
     * Gets the value of the jobCategoryReference property.
     * 
     * @return
     *     possible object is
     *     {@link JobCategoryObjectType }
     *     
     */
    public JobCategoryObjectType getJobCategoryReference() {
        return jobCategoryReference;
    }

    /**
     * Sets the value of the jobCategoryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobCategoryObjectType }
     *     
     */
    public void setJobCategoryReference(JobCategoryObjectType value) {
        this.jobCategoryReference = value;
    }

    /**
     * Gets the value of the jobFamilyReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobFamilyReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobFamilyReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobFamilyBaseObjectType }
     * 
     * 
     */
    public List<JobFamilyBaseObjectType> getJobFamilyReference() {
        if (jobFamilyReference == null) {
            jobFamilyReference = new ArrayList<JobFamilyBaseObjectType>();
        }
        return this.jobFamilyReference;
    }

    /**
     * Gets the value of the jobProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobProfileName() {
        return jobProfileName;
    }

    /**
     * Sets the value of the jobProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobProfileName(String value) {
        this.jobProfileName = value;
    }

    /**
     * Gets the value of the workShiftRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkShiftRequired() {
        return workShiftRequired;
    }

    /**
     * Sets the value of the workShiftRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkShiftRequired(Boolean value) {
        this.workShiftRequired = value;
    }

    /**
     * Gets the value of the criticalJob property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCriticalJob() {
        return criticalJob;
    }

    /**
     * Sets the value of the criticalJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCriticalJob(Boolean value) {
        this.criticalJob = value;
    }

    /**
     * Gets the value of the difficultyToFillReference property.
     * 
     * @return
     *     possible object is
     *     {@link DifficultyToFillObjectType }
     *     
     */
    public DifficultyToFillObjectType getDifficultyToFillReference() {
        return difficultyToFillReference;
    }

    /**
     * Sets the value of the difficultyToFillReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DifficultyToFillObjectType }
     *     
     */
    public void setDifficultyToFillReference(DifficultyToFillObjectType value) {
        this.difficultyToFillReference = value;
    }

}
