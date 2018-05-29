
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The response group allows for the response data to be tailored to only included elements that the user is looking for.  If no response group is provided in the request, then all groups will be returned. If the Response Group element is returned, you can select which sections of data to include in the response.
 * 
 * <p>Java class for Job_Profile_Response_GroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job_Profile_Response_GroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Include_Reference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Job_Profile_Basic_Data" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Job_Classification_Data" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Job_Profile_Pay_Rate_Data" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Job_Profile_Exempt_Data" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Workers_Compensation_Data" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Responsibility_Qualifications" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Work_Experience_Qualifications" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Education_Qualifications" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Language_Qualifications" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Competency_Qualifications" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Certification_Qualifications" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Certification_Reference_Only" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Training_Qualifications" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Job_Profile_Compensation_Data" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Skill_Qualifications" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Questionnaires" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Assessments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job_Profile_Response_GroupType", propOrder = {
    "includeReference",
    "includeJobProfileBasicData",
    "includeJobClassificationData",
    "includeJobProfilePayRateData",
    "includeJobProfileExemptData",
    "includeWorkersCompensationData",
    "includeResponsibilityQualifications",
    "includeWorkExperienceQualifications",
    "includeEducationQualifications",
    "includeLanguageQualifications",
    "includeCompetencyQualifications",
    "includeCertificationQualifications",
    "includeCertificationReferenceOnly",
    "includeTrainingQualifications",
    "includeJobProfileCompensationData",
    "includeSkillQualifications",
    "includeQuestionnaires",
    "includeAssessments"
})
public class JobProfileResponseGroupType {

    @XmlElement(name = "Include_Reference")
    protected Boolean includeReference;
    @XmlElement(name = "Include_Job_Profile_Basic_Data")
    protected Boolean includeJobProfileBasicData;
    @XmlElement(name = "Include_Job_Classification_Data")
    protected Boolean includeJobClassificationData;
    @XmlElement(name = "Include_Job_Profile_Pay_Rate_Data")
    protected Boolean includeJobProfilePayRateData;
    @XmlElement(name = "Include_Job_Profile_Exempt_Data")
    protected Boolean includeJobProfileExemptData;
    @XmlElement(name = "Include_Workers_Compensation_Data")
    protected Boolean includeWorkersCompensationData;
    @XmlElement(name = "Include_Responsibility_Qualifications")
    protected Boolean includeResponsibilityQualifications;
    @XmlElement(name = "Include_Work_Experience_Qualifications")
    protected Boolean includeWorkExperienceQualifications;
    @XmlElement(name = "Include_Education_Qualifications")
    protected Boolean includeEducationQualifications;
    @XmlElement(name = "Include_Language_Qualifications")
    protected Boolean includeLanguageQualifications;
    @XmlElement(name = "Include_Competency_Qualifications")
    protected Boolean includeCompetencyQualifications;
    @XmlElement(name = "Include_Certification_Qualifications")
    protected Boolean includeCertificationQualifications;
    @XmlElement(name = "Include_Certification_Reference_Only")
    protected Boolean includeCertificationReferenceOnly;
    @XmlElement(name = "Include_Training_Qualifications")
    protected Boolean includeTrainingQualifications;
    @XmlElement(name = "Include_Job_Profile_Compensation_Data")
    protected Boolean includeJobProfileCompensationData;
    @XmlElement(name = "Include_Skill_Qualifications")
    protected Boolean includeSkillQualifications;
    @XmlElement(name = "Include_Questionnaires")
    protected Boolean includeQuestionnaires;
    @XmlElement(name = "Include_Assessments")
    protected Boolean includeAssessments;

    /**
     * Gets the value of the includeReference property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeReference() {
        return includeReference;
    }

    /**
     * Sets the value of the includeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeReference(Boolean value) {
        this.includeReference = value;
    }

    /**
     * Gets the value of the includeJobProfileBasicData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeJobProfileBasicData() {
        return includeJobProfileBasicData;
    }

    /**
     * Sets the value of the includeJobProfileBasicData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeJobProfileBasicData(Boolean value) {
        this.includeJobProfileBasicData = value;
    }

    /**
     * Gets the value of the includeJobClassificationData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeJobClassificationData() {
        return includeJobClassificationData;
    }

    /**
     * Sets the value of the includeJobClassificationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeJobClassificationData(Boolean value) {
        this.includeJobClassificationData = value;
    }

    /**
     * Gets the value of the includeJobProfilePayRateData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeJobProfilePayRateData() {
        return includeJobProfilePayRateData;
    }

    /**
     * Sets the value of the includeJobProfilePayRateData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeJobProfilePayRateData(Boolean value) {
        this.includeJobProfilePayRateData = value;
    }

    /**
     * Gets the value of the includeJobProfileExemptData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeJobProfileExemptData() {
        return includeJobProfileExemptData;
    }

    /**
     * Sets the value of the includeJobProfileExemptData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeJobProfileExemptData(Boolean value) {
        this.includeJobProfileExemptData = value;
    }

    /**
     * Gets the value of the includeWorkersCompensationData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeWorkersCompensationData() {
        return includeWorkersCompensationData;
    }

    /**
     * Sets the value of the includeWorkersCompensationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeWorkersCompensationData(Boolean value) {
        this.includeWorkersCompensationData = value;
    }

    /**
     * Gets the value of the includeResponsibilityQualifications property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeResponsibilityQualifications() {
        return includeResponsibilityQualifications;
    }

    /**
     * Sets the value of the includeResponsibilityQualifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeResponsibilityQualifications(Boolean value) {
        this.includeResponsibilityQualifications = value;
    }

    /**
     * Gets the value of the includeWorkExperienceQualifications property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeWorkExperienceQualifications() {
        return includeWorkExperienceQualifications;
    }

    /**
     * Sets the value of the includeWorkExperienceQualifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeWorkExperienceQualifications(Boolean value) {
        this.includeWorkExperienceQualifications = value;
    }

    /**
     * Gets the value of the includeEducationQualifications property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeEducationQualifications() {
        return includeEducationQualifications;
    }

    /**
     * Sets the value of the includeEducationQualifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeEducationQualifications(Boolean value) {
        this.includeEducationQualifications = value;
    }

    /**
     * Gets the value of the includeLanguageQualifications property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeLanguageQualifications() {
        return includeLanguageQualifications;
    }

    /**
     * Sets the value of the includeLanguageQualifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeLanguageQualifications(Boolean value) {
        this.includeLanguageQualifications = value;
    }

    /**
     * Gets the value of the includeCompetencyQualifications property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeCompetencyQualifications() {
        return includeCompetencyQualifications;
    }

    /**
     * Sets the value of the includeCompetencyQualifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeCompetencyQualifications(Boolean value) {
        this.includeCompetencyQualifications = value;
    }

    /**
     * Gets the value of the includeCertificationQualifications property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeCertificationQualifications() {
        return includeCertificationQualifications;
    }

    /**
     * Sets the value of the includeCertificationQualifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeCertificationQualifications(Boolean value) {
        this.includeCertificationQualifications = value;
    }

    /**
     * Gets the value of the includeCertificationReferenceOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeCertificationReferenceOnly() {
        return includeCertificationReferenceOnly;
    }

    /**
     * Sets the value of the includeCertificationReferenceOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeCertificationReferenceOnly(Boolean value) {
        this.includeCertificationReferenceOnly = value;
    }

    /**
     * Gets the value of the includeTrainingQualifications property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeTrainingQualifications() {
        return includeTrainingQualifications;
    }

    /**
     * Sets the value of the includeTrainingQualifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeTrainingQualifications(Boolean value) {
        this.includeTrainingQualifications = value;
    }

    /**
     * Gets the value of the includeJobProfileCompensationData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeJobProfileCompensationData() {
        return includeJobProfileCompensationData;
    }

    /**
     * Sets the value of the includeJobProfileCompensationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeJobProfileCompensationData(Boolean value) {
        this.includeJobProfileCompensationData = value;
    }

    /**
     * Gets the value of the includeSkillQualifications property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeSkillQualifications() {
        return includeSkillQualifications;
    }

    /**
     * Sets the value of the includeSkillQualifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeSkillQualifications(Boolean value) {
        this.includeSkillQualifications = value;
    }

    /**
     * Gets the value of the includeQuestionnaires property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeQuestionnaires() {
        return includeQuestionnaires;
    }

    /**
     * Sets the value of the includeQuestionnaires property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeQuestionnaires(Boolean value) {
        this.includeQuestionnaires = value;
    }

    /**
     * Gets the value of the includeAssessments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeAssessments() {
        return includeAssessments;
    }

    /**
     * Sets the value of the includeAssessments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeAssessments(Boolean value) {
        this.includeAssessments = value;
    }

}
