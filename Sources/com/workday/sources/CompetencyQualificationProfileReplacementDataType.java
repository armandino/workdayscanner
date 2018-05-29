
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Replacement element containing Competency Qualifications for the Job Profile
 * When updating a Job Profile, all Competencies for the Job Profile will be replaced by the submitted data. If no data is submitted, then the existing Competencies are not changed.
 * 
 * <p>Java class for Competency_Qualification_Profile_Replacement_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Competency_Qualification_Profile_Replacement_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Competency_Reference" type="{urn:com.workday/bsvc}SkillObjectType"/>
 *         &lt;element name="Proficiency_Rating_Reference" type="{urn:com.workday/bsvc}Proficiency_RatingObjectType" minOccurs="0"/>
 *         &lt;element name="Required" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Competency_Qualification_Profile_Replacement_DataType", propOrder = {
    "competencyReference",
    "proficiencyRatingReference",
    "required"
})
public class CompetencyQualificationProfileReplacementDataType {

    @XmlElement(name = "Competency_Reference", required = true)
    protected SkillObjectType competencyReference;
    @XmlElement(name = "Proficiency_Rating_Reference")
    protected ProficiencyRatingObjectType proficiencyRatingReference;
    @XmlElement(name = "Required")
    protected Boolean required;

    /**
     * Gets the value of the competencyReference property.
     * 
     * @return
     *     possible object is
     *     {@link SkillObjectType }
     *     
     */
    public SkillObjectType getCompetencyReference() {
        return competencyReference;
    }

    /**
     * Sets the value of the competencyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SkillObjectType }
     *     
     */
    public void setCompetencyReference(SkillObjectType value) {
        this.competencyReference = value;
    }

    /**
     * Gets the value of the proficiencyRatingReference property.
     * 
     * @return
     *     possible object is
     *     {@link ProficiencyRatingObjectType }
     *     
     */
    public ProficiencyRatingObjectType getProficiencyRatingReference() {
        return proficiencyRatingReference;
    }

    /**
     * Sets the value of the proficiencyRatingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProficiencyRatingObjectType }
     *     
     */
    public void setProficiencyRatingReference(ProficiencyRatingObjectType value) {
        this.proficiencyRatingReference = value;
    }

    /**
     * Gets the value of the required property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequired(Boolean value) {
        this.required = value;
    }

}
