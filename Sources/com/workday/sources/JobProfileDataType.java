
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Element containing all Job Profile Data.
 * 
 * <p>Java class for Job_Profile_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job_Profile_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Job_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Effective_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Job_Profile_Basic_Data" type="{urn:com.workday/bsvc}Job_Profile_Basic_DataType" minOccurs="0"/>
 *         &lt;element name="Job_Classification_Data" type="{urn:com.workday/bsvc}Job_Profile_Job_Classification_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Job_Profile_Pay_Rate_Data" type="{urn:com.workday/bsvc}Job_Profile_Pay_Rate_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Job_Profile_Exempt_Data" type="{urn:com.workday/bsvc}Job_Profile_Exempt_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Workers_Compensation_Code_Replacement_Data" type="{urn:com.workday/bsvc}Workers_Compensation_Replacement_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Qualification_Replacement_Data" type="{urn:com.workday/bsvc}Qualification_Data_for_Position_Restriction_or_Job_ProfileType" minOccurs="0"/>
 *         &lt;element name="Integration_Field_Override_Data" type="{urn:com.workday/bsvc}Document_Field_Result_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Job_Profile_Compensation_Data" type="{urn:com.workday/bsvc}Job_Profile_Compensation_DataType" minOccurs="0"/>
 *         &lt;element name="Unions_Data" type="{urn:com.workday/bsvc}Job_Profile_Union_Membership_DataType" minOccurs="0"/>
 *         &lt;element name="Questionnaire_Data" type="{urn:com.workday/bsvc}Job_Profile_Questionnaire_DataType" minOccurs="0"/>
 *         &lt;element name="Work-Study_Data" type="{urn:com.workday/bsvc}Job_Profile_Work-Study_DataType" minOccurs="0"/>
 *         &lt;element name="Job_Profile_Assessment_Data" type="{urn:com.workday/bsvc}Job_Profile_Assessment_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job_Profile_DataType", propOrder = {
    "jobCode",
    "effectiveDate",
    "jobProfileBasicData",
    "jobClassificationData",
    "jobProfilePayRateData",
    "jobProfileExemptData",
    "workersCompensationCodeReplacementData",
    "qualificationReplacementData",
    "integrationFieldOverrideData",
    "jobProfileCompensationData",
    "unionsData",
    "questionnaireData",
    "workStudyData",
    "jobProfileAssessmentData"
})
public class JobProfileDataType {

    @XmlElement(name = "Job_Code")
    protected String jobCode;
    @XmlElement(name = "Effective_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "Job_Profile_Basic_Data")
    protected JobProfileBasicDataType jobProfileBasicData;
    @XmlElement(name = "Job_Classification_Data")
    protected List<JobProfileJobClassificationDataType> jobClassificationData;
    @XmlElement(name = "Job_Profile_Pay_Rate_Data")
    protected List<JobProfilePayRateDataType> jobProfilePayRateData;
    @XmlElement(name = "Job_Profile_Exempt_Data")
    protected List<JobProfileExemptDataType> jobProfileExemptData;
    @XmlElement(name = "Workers_Compensation_Code_Replacement_Data")
    protected List<WorkersCompensationReplacementDataType> workersCompensationCodeReplacementData;
    @XmlElement(name = "Qualification_Replacement_Data")
    protected QualificationDataForPositionRestrictionOrJobProfileType qualificationReplacementData;
    @XmlElement(name = "Integration_Field_Override_Data")
    protected List<DocumentFieldResultDataType> integrationFieldOverrideData;
    @XmlElement(name = "Job_Profile_Compensation_Data")
    protected JobProfileCompensationDataType jobProfileCompensationData;
    @XmlElement(name = "Unions_Data")
    protected JobProfileUnionMembershipDataType unionsData;
    @XmlElement(name = "Questionnaire_Data")
    protected JobProfileQuestionnaireDataType questionnaireData;
    @XmlElement(name = "Work-Study_Data")
    protected JobProfileWorkStudyDataType workStudyData;
    @XmlElement(name = "Job_Profile_Assessment_Data")
    protected JobProfileAssessmentDataType jobProfileAssessmentData;

    /**
     * Gets the value of the jobCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobCode() {
        return jobCode;
    }

    /**
     * Sets the value of the jobCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobCode(String value) {
        this.jobCode = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the jobProfileBasicData property.
     * 
     * @return
     *     possible object is
     *     {@link JobProfileBasicDataType }
     *     
     */
    public JobProfileBasicDataType getJobProfileBasicData() {
        return jobProfileBasicData;
    }

    /**
     * Sets the value of the jobProfileBasicData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobProfileBasicDataType }
     *     
     */
    public void setJobProfileBasicData(JobProfileBasicDataType value) {
        this.jobProfileBasicData = value;
    }

    /**
     * Gets the value of the jobClassificationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobClassificationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobClassificationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobProfileJobClassificationDataType }
     * 
     * 
     */
    public List<JobProfileJobClassificationDataType> getJobClassificationData() {
        if (jobClassificationData == null) {
            jobClassificationData = new ArrayList<JobProfileJobClassificationDataType>();
        }
        return this.jobClassificationData;
    }

    /**
     * Gets the value of the jobProfilePayRateData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobProfilePayRateData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobProfilePayRateData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobProfilePayRateDataType }
     * 
     * 
     */
    public List<JobProfilePayRateDataType> getJobProfilePayRateData() {
        if (jobProfilePayRateData == null) {
            jobProfilePayRateData = new ArrayList<JobProfilePayRateDataType>();
        }
        return this.jobProfilePayRateData;
    }

    /**
     * Gets the value of the jobProfileExemptData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobProfileExemptData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobProfileExemptData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobProfileExemptDataType }
     * 
     * 
     */
    public List<JobProfileExemptDataType> getJobProfileExemptData() {
        if (jobProfileExemptData == null) {
            jobProfileExemptData = new ArrayList<JobProfileExemptDataType>();
        }
        return this.jobProfileExemptData;
    }

    /**
     * Gets the value of the workersCompensationCodeReplacementData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workersCompensationCodeReplacementData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkersCompensationCodeReplacementData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkersCompensationReplacementDataType }
     * 
     * 
     */
    public List<WorkersCompensationReplacementDataType> getWorkersCompensationCodeReplacementData() {
        if (workersCompensationCodeReplacementData == null) {
            workersCompensationCodeReplacementData = new ArrayList<WorkersCompensationReplacementDataType>();
        }
        return this.workersCompensationCodeReplacementData;
    }

    /**
     * Gets the value of the qualificationReplacementData property.
     * 
     * @return
     *     possible object is
     *     {@link QualificationDataForPositionRestrictionOrJobProfileType }
     *     
     */
    public QualificationDataForPositionRestrictionOrJobProfileType getQualificationReplacementData() {
        return qualificationReplacementData;
    }

    /**
     * Sets the value of the qualificationReplacementData property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualificationDataForPositionRestrictionOrJobProfileType }
     *     
     */
    public void setQualificationReplacementData(QualificationDataForPositionRestrictionOrJobProfileType value) {
        this.qualificationReplacementData = value;
    }

    /**
     * Gets the value of the integrationFieldOverrideData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the integrationFieldOverrideData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntegrationFieldOverrideData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentFieldResultDataType }
     * 
     * 
     */
    public List<DocumentFieldResultDataType> getIntegrationFieldOverrideData() {
        if (integrationFieldOverrideData == null) {
            integrationFieldOverrideData = new ArrayList<DocumentFieldResultDataType>();
        }
        return this.integrationFieldOverrideData;
    }

    /**
     * Gets the value of the jobProfileCompensationData property.
     * 
     * @return
     *     possible object is
     *     {@link JobProfileCompensationDataType }
     *     
     */
    public JobProfileCompensationDataType getJobProfileCompensationData() {
        return jobProfileCompensationData;
    }

    /**
     * Sets the value of the jobProfileCompensationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobProfileCompensationDataType }
     *     
     */
    public void setJobProfileCompensationData(JobProfileCompensationDataType value) {
        this.jobProfileCompensationData = value;
    }

    /**
     * Gets the value of the unionsData property.
     * 
     * @return
     *     possible object is
     *     {@link JobProfileUnionMembershipDataType }
     *     
     */
    public JobProfileUnionMembershipDataType getUnionsData() {
        return unionsData;
    }

    /**
     * Sets the value of the unionsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobProfileUnionMembershipDataType }
     *     
     */
    public void setUnionsData(JobProfileUnionMembershipDataType value) {
        this.unionsData = value;
    }

    /**
     * Gets the value of the questionnaireData property.
     * 
     * @return
     *     possible object is
     *     {@link JobProfileQuestionnaireDataType }
     *     
     */
    public JobProfileQuestionnaireDataType getQuestionnaireData() {
        return questionnaireData;
    }

    /**
     * Sets the value of the questionnaireData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobProfileQuestionnaireDataType }
     *     
     */
    public void setQuestionnaireData(JobProfileQuestionnaireDataType value) {
        this.questionnaireData = value;
    }

    /**
     * Gets the value of the workStudyData property.
     * 
     * @return
     *     possible object is
     *     {@link JobProfileWorkStudyDataType }
     *     
     */
    public JobProfileWorkStudyDataType getWorkStudyData() {
        return workStudyData;
    }

    /**
     * Sets the value of the workStudyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobProfileWorkStudyDataType }
     *     
     */
    public void setWorkStudyData(JobProfileWorkStudyDataType value) {
        this.workStudyData = value;
    }

    /**
     * Gets the value of the jobProfileAssessmentData property.
     * 
     * @return
     *     possible object is
     *     {@link JobProfileAssessmentDataType }
     *     
     */
    public JobProfileAssessmentDataType getJobProfileAssessmentData() {
        return jobProfileAssessmentData;
    }

    /**
     * Sets the value of the jobProfileAssessmentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobProfileAssessmentDataType }
     *     
     */
    public void setJobProfileAssessmentData(JobProfileAssessmentDataType value) {
        this.jobProfileAssessmentData = value;
    }

}
