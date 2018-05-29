
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the basic job profile information.
 * 
 * <p>Java class for Job_Profile_Basic_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job_Profile_Basic_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Inactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Job_Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Include_Job_Code_in_Name" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Job_Profile_Private_Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Job_Profile_Summary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Job_Description" type="{urn:com.workday/bsvc}RichText" minOccurs="0"/>
 *         &lt;element name="Additional_Job_Description" type="{urn:com.workday/bsvc}RichText" minOccurs="0"/>
 *         &lt;element name="Work_Shift_Required" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Public_Job" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Management_Level_Reference" type="{urn:com.workday/bsvc}Management_LevelObjectType" minOccurs="0"/>
 *         &lt;element name="Job_Category_Reference" type="{urn:com.workday/bsvc}Job_CategoryObjectType" minOccurs="0"/>
 *         &lt;element name="Job_Level_Reference" type="{urn:com.workday/bsvc}Job_LevelObjectType" minOccurs="0"/>
 *         &lt;element name="Job_Family_Data" type="{urn:com.workday/bsvc}Job_Profile_Job_Family_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Company_Insider_Data" type="{urn:com.workday/bsvc}Company_Insider_Job_Profile_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Referral_Payment_Plan_Reference" type="{urn:com.workday/bsvc}One-Time_Payment_PlanObjectType" minOccurs="0"/>
 *         &lt;element name="Critical_Job" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Difficulty_to_Fill_Reference" type="{urn:com.workday/bsvc}Difficulty_to_FillObjectType" minOccurs="0"/>
 *         &lt;element name="Restrict_to_Country_Reference" type="{urn:com.workday/bsvc}CountryObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job_Profile_Basic_DataType", propOrder = {
    "inactive",
    "jobTitle",
    "includeJobCodeInName",
    "jobProfilePrivateTitle",
    "jobProfileSummary",
    "jobDescription",
    "additionalJobDescription",
    "workShiftRequired",
    "publicJob",
    "managementLevelReference",
    "jobCategoryReference",
    "jobLevelReference",
    "jobFamilyData",
    "companyInsiderData",
    "referralPaymentPlanReference",
    "criticalJob",
    "difficultyToFillReference",
    "restrictToCountryReference"
})
public class JobProfileBasicDataType {

    @XmlElement(name = "Inactive")
    protected Boolean inactive;
    @XmlElement(name = "Job_Title")
    protected String jobTitle;
    @XmlElement(name = "Include_Job_Code_in_Name")
    protected Boolean includeJobCodeInName;
    @XmlElement(name = "Job_Profile_Private_Title")
    protected String jobProfilePrivateTitle;
    @XmlElement(name = "Job_Profile_Summary")
    protected String jobProfileSummary;
    @XmlElement(name = "Job_Description")
    protected String jobDescription;
    @XmlElement(name = "Additional_Job_Description")
    protected String additionalJobDescription;
    @XmlElement(name = "Work_Shift_Required")
    protected Boolean workShiftRequired;
    @XmlElement(name = "Public_Job")
    protected Boolean publicJob;
    @XmlElement(name = "Management_Level_Reference")
    protected ManagementLevelObjectType managementLevelReference;
    @XmlElement(name = "Job_Category_Reference")
    protected JobCategoryObjectType jobCategoryReference;
    @XmlElement(name = "Job_Level_Reference")
    protected JobLevelObjectType jobLevelReference;
    @XmlElement(name = "Job_Family_Data")
    protected List<JobProfileJobFamilyDataType> jobFamilyData;
    @XmlElement(name = "Company_Insider_Data")
    protected List<CompanyInsiderJobProfileDataType> companyInsiderData;
    @XmlElement(name = "Referral_Payment_Plan_Reference")
    protected OneTimePaymentPlanObjectType referralPaymentPlanReference;
    @XmlElement(name = "Critical_Job")
    protected Boolean criticalJob;
    @XmlElement(name = "Difficulty_to_Fill_Reference")
    protected DifficultyToFillObjectType difficultyToFillReference;
    @XmlElement(name = "Restrict_to_Country_Reference")
    protected List<CountryObjectType> restrictToCountryReference;

    /**
     * Gets the value of the inactive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInactive() {
        return inactive;
    }

    /**
     * Sets the value of the inactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInactive(Boolean value) {
        this.inactive = value;
    }

    /**
     * Gets the value of the jobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the value of the jobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTitle(String value) {
        this.jobTitle = value;
    }

    /**
     * Gets the value of the includeJobCodeInName property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeJobCodeInName() {
        return includeJobCodeInName;
    }

    /**
     * Sets the value of the includeJobCodeInName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeJobCodeInName(Boolean value) {
        this.includeJobCodeInName = value;
    }

    /**
     * Gets the value of the jobProfilePrivateTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobProfilePrivateTitle() {
        return jobProfilePrivateTitle;
    }

    /**
     * Sets the value of the jobProfilePrivateTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobProfilePrivateTitle(String value) {
        this.jobProfilePrivateTitle = value;
    }

    /**
     * Gets the value of the jobProfileSummary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobProfileSummary() {
        return jobProfileSummary;
    }

    /**
     * Sets the value of the jobProfileSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobProfileSummary(String value) {
        this.jobProfileSummary = value;
    }

    /**
     * Gets the value of the jobDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobDescription() {
        return jobDescription;
    }

    /**
     * Sets the value of the jobDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobDescription(String value) {
        this.jobDescription = value;
    }

    /**
     * Gets the value of the additionalJobDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalJobDescription() {
        return additionalJobDescription;
    }

    /**
     * Sets the value of the additionalJobDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalJobDescription(String value) {
        this.additionalJobDescription = value;
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
     * Gets the value of the publicJob property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPublicJob() {
        return publicJob;
    }

    /**
     * Sets the value of the publicJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPublicJob(Boolean value) {
        this.publicJob = value;
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
     * Gets the value of the jobLevelReference property.
     * 
     * @return
     *     possible object is
     *     {@link JobLevelObjectType }
     *     
     */
    public JobLevelObjectType getJobLevelReference() {
        return jobLevelReference;
    }

    /**
     * Sets the value of the jobLevelReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobLevelObjectType }
     *     
     */
    public void setJobLevelReference(JobLevelObjectType value) {
        this.jobLevelReference = value;
    }

    /**
     * Gets the value of the jobFamilyData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobFamilyData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobFamilyData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobProfileJobFamilyDataType }
     * 
     * 
     */
    public List<JobProfileJobFamilyDataType> getJobFamilyData() {
        if (jobFamilyData == null) {
            jobFamilyData = new ArrayList<JobProfileJobFamilyDataType>();
        }
        return this.jobFamilyData;
    }

    /**
     * Gets the value of the companyInsiderData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the companyInsiderData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompanyInsiderData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyInsiderJobProfileDataType }
     * 
     * 
     */
    public List<CompanyInsiderJobProfileDataType> getCompanyInsiderData() {
        if (companyInsiderData == null) {
            companyInsiderData = new ArrayList<CompanyInsiderJobProfileDataType>();
        }
        return this.companyInsiderData;
    }

    /**
     * Gets the value of the referralPaymentPlanReference property.
     * 
     * @return
     *     possible object is
     *     {@link OneTimePaymentPlanObjectType }
     *     
     */
    public OneTimePaymentPlanObjectType getReferralPaymentPlanReference() {
        return referralPaymentPlanReference;
    }

    /**
     * Sets the value of the referralPaymentPlanReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OneTimePaymentPlanObjectType }
     *     
     */
    public void setReferralPaymentPlanReference(OneTimePaymentPlanObjectType value) {
        this.referralPaymentPlanReference = value;
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

    /**
     * Gets the value of the restrictToCountryReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restrictToCountryReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestrictToCountryReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryObjectType }
     * 
     * 
     */
    public List<CountryObjectType> getRestrictToCountryReference() {
        if (restrictToCountryReference == null) {
            restrictToCountryReference = new ArrayList<CountryObjectType>();
        }
        return this.restrictToCountryReference;
    }

}
