
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the primary and secondary Questionnaires for internal and external career site for Job Profile.
 * 
 * <p>Java class for Job_Profile_Questionnaire_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job_Profile_Questionnaire_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Questionnaire_for_Internal_Career_Site_Reference" type="{urn:com.workday/bsvc}QuestionnaireObjectType" minOccurs="0"/>
 *         &lt;element name="Secondary_Questionnaire_for_Internal_Career_Site_Reference" type="{urn:com.workday/bsvc}QuestionnaireObjectType" minOccurs="0"/>
 *         &lt;element name="Questionnaire_for_External_Career_Sites_Reference" type="{urn:com.workday/bsvc}QuestionnaireObjectType" minOccurs="0"/>
 *         &lt;element name="Secondary_Questionnaire_for_External_Career_Sites_Reference" type="{urn:com.workday/bsvc}QuestionnaireObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job_Profile_Questionnaire_DataType", propOrder = {
    "questionnaireForInternalCareerSiteReference",
    "secondaryQuestionnaireForInternalCareerSiteReference",
    "questionnaireForExternalCareerSitesReference",
    "secondaryQuestionnaireForExternalCareerSitesReference"
})
public class JobProfileQuestionnaireDataType {

    @XmlElement(name = "Questionnaire_for_Internal_Career_Site_Reference")
    protected QuestionnaireObjectType questionnaireForInternalCareerSiteReference;
    @XmlElement(name = "Secondary_Questionnaire_for_Internal_Career_Site_Reference")
    protected QuestionnaireObjectType secondaryQuestionnaireForInternalCareerSiteReference;
    @XmlElement(name = "Questionnaire_for_External_Career_Sites_Reference")
    protected QuestionnaireObjectType questionnaireForExternalCareerSitesReference;
    @XmlElement(name = "Secondary_Questionnaire_for_External_Career_Sites_Reference")
    protected QuestionnaireObjectType secondaryQuestionnaireForExternalCareerSitesReference;

    /**
     * Gets the value of the questionnaireForInternalCareerSiteReference property.
     * 
     * @return
     *     possible object is
     *     {@link QuestionnaireObjectType }
     *     
     */
    public QuestionnaireObjectType getQuestionnaireForInternalCareerSiteReference() {
        return questionnaireForInternalCareerSiteReference;
    }

    /**
     * Sets the value of the questionnaireForInternalCareerSiteReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuestionnaireObjectType }
     *     
     */
    public void setQuestionnaireForInternalCareerSiteReference(QuestionnaireObjectType value) {
        this.questionnaireForInternalCareerSiteReference = value;
    }

    /**
     * Gets the value of the secondaryQuestionnaireForInternalCareerSiteReference property.
     * 
     * @return
     *     possible object is
     *     {@link QuestionnaireObjectType }
     *     
     */
    public QuestionnaireObjectType getSecondaryQuestionnaireForInternalCareerSiteReference() {
        return secondaryQuestionnaireForInternalCareerSiteReference;
    }

    /**
     * Sets the value of the secondaryQuestionnaireForInternalCareerSiteReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuestionnaireObjectType }
     *     
     */
    public void setSecondaryQuestionnaireForInternalCareerSiteReference(QuestionnaireObjectType value) {
        this.secondaryQuestionnaireForInternalCareerSiteReference = value;
    }

    /**
     * Gets the value of the questionnaireForExternalCareerSitesReference property.
     * 
     * @return
     *     possible object is
     *     {@link QuestionnaireObjectType }
     *     
     */
    public QuestionnaireObjectType getQuestionnaireForExternalCareerSitesReference() {
        return questionnaireForExternalCareerSitesReference;
    }

    /**
     * Sets the value of the questionnaireForExternalCareerSitesReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuestionnaireObjectType }
     *     
     */
    public void setQuestionnaireForExternalCareerSitesReference(QuestionnaireObjectType value) {
        this.questionnaireForExternalCareerSitesReference = value;
    }

    /**
     * Gets the value of the secondaryQuestionnaireForExternalCareerSitesReference property.
     * 
     * @return
     *     possible object is
     *     {@link QuestionnaireObjectType }
     *     
     */
    public QuestionnaireObjectType getSecondaryQuestionnaireForExternalCareerSitesReference() {
        return secondaryQuestionnaireForExternalCareerSitesReference;
    }

    /**
     * Sets the value of the secondaryQuestionnaireForExternalCareerSitesReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuestionnaireObjectType }
     *     
     */
    public void setSecondaryQuestionnaireForExternalCareerSitesReference(QuestionnaireObjectType value) {
        this.secondaryQuestionnaireForExternalCareerSitesReference = value;
    }

}
