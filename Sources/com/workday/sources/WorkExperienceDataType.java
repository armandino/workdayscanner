
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for the work experience.
 * 
 * <p>Java class for Work_Experience_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Work_Experience_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Experience_Reference" type="{urn:com.workday/bsvc}Work_Experience_SkillObjectType" minOccurs="0"/>
 *         &lt;element name="Remove_Experience" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Experience_Rating_Reference" type="{urn:com.workday/bsvc}Work_Experience_RatingObjectType" minOccurs="0"/>
 *         &lt;element name="Experience_Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Work_Experience_DataType", propOrder = {
    "experienceReference",
    "removeExperience",
    "experienceRatingReference",
    "experienceComment"
})
public class WorkExperienceDataType {

    @XmlElement(name = "Experience_Reference")
    protected WorkExperienceSkillObjectType experienceReference;
    @XmlElement(name = "Remove_Experience")
    protected Boolean removeExperience;
    @XmlElement(name = "Experience_Rating_Reference")
    protected WorkExperienceRatingObjectType experienceRatingReference;
    @XmlElement(name = "Experience_Comment")
    protected String experienceComment;

    /**
     * Gets the value of the experienceReference property.
     * 
     * @return
     *     possible object is
     *     {@link WorkExperienceSkillObjectType }
     *     
     */
    public WorkExperienceSkillObjectType getExperienceReference() {
        return experienceReference;
    }

    /**
     * Sets the value of the experienceReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkExperienceSkillObjectType }
     *     
     */
    public void setExperienceReference(WorkExperienceSkillObjectType value) {
        this.experienceReference = value;
    }

    /**
     * Gets the value of the removeExperience property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoveExperience() {
        return removeExperience;
    }

    /**
     * Sets the value of the removeExperience property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoveExperience(Boolean value) {
        this.removeExperience = value;
    }

    /**
     * Gets the value of the experienceRatingReference property.
     * 
     * @return
     *     possible object is
     *     {@link WorkExperienceRatingObjectType }
     *     
     */
    public WorkExperienceRatingObjectType getExperienceRatingReference() {
        return experienceRatingReference;
    }

    /**
     * Sets the value of the experienceRatingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkExperienceRatingObjectType }
     *     
     */
    public void setExperienceRatingReference(WorkExperienceRatingObjectType value) {
        this.experienceRatingReference = value;
    }

    /**
     * Gets the value of the experienceComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExperienceComment() {
        return experienceComment;
    }

    /**
     * Sets the value of the experienceComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExperienceComment(String value) {
        this.experienceComment = value;
    }

}
