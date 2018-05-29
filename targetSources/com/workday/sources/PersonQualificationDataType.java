
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the worker's skills and experience.
 * 
 * Security Note: This element is secured to the following domains:  Self Service: Skills and Experience; Worker: Skills and Experience
 * 
 * <p>Java class for Person_Qualification_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Person_Qualification_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="External_Job_History" type="{urn:com.workday/bsvc}Job_HistoryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Competency" type="{urn:com.workday/bsvc}Competency_Achievement_Data__v10_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Certification" type="{urn:com.workday/bsvc}Certification_AchievementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Training" type="{urn:com.workday/bsvc}TrainingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Award_and_Activity" type="{urn:com.workday/bsvc}Award_and_ActivityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Organization_Membership" type="{urn:com.workday/bsvc}Professional_Affiliation_SkillType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Education" type="{urn:com.workday/bsvc}EducationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Work_Experience" type="{urn:com.workday/bsvc}Work_Experience_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Language" type="{urn:com.workday/bsvc}Language_Achievement_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Internal_Project_Experience" type="{urn:com.workday/bsvc}Internal_Project_ExperienceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person_Qualification_DataType", propOrder = {
    "externalJobHistory",
    "competency",
    "certification",
    "training",
    "awardAndActivity",
    "organizationMembership",
    "education",
    "workExperience",
    "language",
    "internalProjectExperience"
})
public class PersonQualificationDataType {

    @XmlElement(name = "External_Job_History")
    protected List<JobHistoryType> externalJobHistory;
    @XmlElement(name = "Competency")
    protected List<CompetencyAchievementDataV10Type> competency;
    @XmlElement(name = "Certification")
    protected List<CertificationAchievementType> certification;
    @XmlElement(name = "Training")
    protected List<TrainingType> training;
    @XmlElement(name = "Award_and_Activity")
    protected List<AwardAndActivityType> awardAndActivity;
    @XmlElement(name = "Organization_Membership")
    protected List<ProfessionalAffiliationSkillType> organizationMembership;
    @XmlElement(name = "Education")
    protected List<EducationType> education;
    @XmlElement(name = "Work_Experience")
    protected List<WorkExperienceDataType> workExperience;
    @XmlElement(name = "Language")
    protected List<LanguageAchievementDataType> language;
    @XmlElement(name = "Internal_Project_Experience")
    protected List<InternalProjectExperienceType> internalProjectExperience;

    /**
     * Gets the value of the externalJobHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalJobHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalJobHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobHistoryType }
     * 
     * 
     */
    public List<JobHistoryType> getExternalJobHistory() {
        if (externalJobHistory == null) {
            externalJobHistory = new ArrayList<JobHistoryType>();
        }
        return this.externalJobHistory;
    }

    /**
     * Gets the value of the competency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the competency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompetency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompetencyAchievementDataV10Type }
     * 
     * 
     */
    public List<CompetencyAchievementDataV10Type> getCompetency() {
        if (competency == null) {
            competency = new ArrayList<CompetencyAchievementDataV10Type>();
        }
        return this.competency;
    }

    /**
     * Gets the value of the certification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CertificationAchievementType }
     * 
     * 
     */
    public List<CertificationAchievementType> getCertification() {
        if (certification == null) {
            certification = new ArrayList<CertificationAchievementType>();
        }
        return this.certification;
    }

    /**
     * Gets the value of the training property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the training property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTraining().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrainingType }
     * 
     * 
     */
    public List<TrainingType> getTraining() {
        if (training == null) {
            training = new ArrayList<TrainingType>();
        }
        return this.training;
    }

    /**
     * Gets the value of the awardAndActivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the awardAndActivity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAwardAndActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AwardAndActivityType }
     * 
     * 
     */
    public List<AwardAndActivityType> getAwardAndActivity() {
        if (awardAndActivity == null) {
            awardAndActivity = new ArrayList<AwardAndActivityType>();
        }
        return this.awardAndActivity;
    }

    /**
     * Gets the value of the organizationMembership property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationMembership property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationMembership().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfessionalAffiliationSkillType }
     * 
     * 
     */
    public List<ProfessionalAffiliationSkillType> getOrganizationMembership() {
        if (organizationMembership == null) {
            organizationMembership = new ArrayList<ProfessionalAffiliationSkillType>();
        }
        return this.organizationMembership;
    }

    /**
     * Gets the value of the education property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the education property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEducation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EducationType }
     * 
     * 
     */
    public List<EducationType> getEducation() {
        if (education == null) {
            education = new ArrayList<EducationType>();
        }
        return this.education;
    }

    /**
     * Gets the value of the workExperience property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workExperience property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkExperience().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkExperienceDataType }
     * 
     * 
     */
    public List<WorkExperienceDataType> getWorkExperience() {
        if (workExperience == null) {
            workExperience = new ArrayList<WorkExperienceDataType>();
        }
        return this.workExperience;
    }

    /**
     * Gets the value of the language property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the language property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageAchievementDataType }
     * 
     * 
     */
    public List<LanguageAchievementDataType> getLanguage() {
        if (language == null) {
            language = new ArrayList<LanguageAchievementDataType>();
        }
        return this.language;
    }

    /**
     * Gets the value of the internalProjectExperience property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internalProjectExperience property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternalProjectExperience().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternalProjectExperienceType }
     * 
     * 
     */
    public List<InternalProjectExperienceType> getInternalProjectExperience() {
        if (internalProjectExperience == null) {
            internalProjectExperience = new ArrayList<InternalProjectExperienceType>();
        }
        return this.internalProjectExperience;
    }

}
