
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing all Professional Experience data.
 * 
 * <p>Java class for Professional_Experience_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Professional_Experience_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Professional_Experience" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Professional_Experience_Rating_Reference" type="{urn:com.workday/bsvc}Professional_Experience_Rating_ReferenceType" minOccurs="0"/>
 *         &lt;element name="Professional_Experience_Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Professional_Experience_DataType", propOrder = {
    "professionalExperience",
    "professionalExperienceRatingReference",
    "professionalExperienceComment"
})
public class ProfessionalExperienceDataType {

    @XmlElement(name = "Professional_Experience", required = true)
    protected String professionalExperience;
    @XmlElement(name = "Professional_Experience_Rating_Reference")
    protected ProfessionalExperienceRatingReferenceType professionalExperienceRatingReference;
    @XmlElement(name = "Professional_Experience_Comment")
    protected String professionalExperienceComment;

    /**
     * Gets the value of the professionalExperience property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessionalExperience() {
        return professionalExperience;
    }

    /**
     * Sets the value of the professionalExperience property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessionalExperience(String value) {
        this.professionalExperience = value;
    }

    /**
     * Gets the value of the professionalExperienceRatingReference property.
     * 
     * @return
     *     possible object is
     *     {@link ProfessionalExperienceRatingReferenceType }
     *     
     */
    public ProfessionalExperienceRatingReferenceType getProfessionalExperienceRatingReference() {
        return professionalExperienceRatingReference;
    }

    /**
     * Sets the value of the professionalExperienceRatingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfessionalExperienceRatingReferenceType }
     *     
     */
    public void setProfessionalExperienceRatingReference(ProfessionalExperienceRatingReferenceType value) {
        this.professionalExperienceRatingReference = value;
    }

    /**
     * Gets the value of the professionalExperienceComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessionalExperienceComment() {
        return professionalExperienceComment;
    }

    /**
     * Sets the value of the professionalExperienceComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessionalExperienceComment(String value) {
        this.professionalExperienceComment = value;
    }

}
