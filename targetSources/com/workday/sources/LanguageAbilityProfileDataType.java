
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element containing the language ability type and proficiency for a Job Profile Language Qualfication language.
 * 
 * <p>Java class for Language_Ability_Profile_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Language_Ability_Profile_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Language_Ability_Type_Reference" type="{urn:com.workday/bsvc}Language_Ability_TypeObjectType"/>
 *         &lt;element name="Language_Proficiency_Reference" type="{urn:com.workday/bsvc}Language_ProficiencyObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Language_Ability_Profile_DataType", propOrder = {
    "languageAbilityTypeReference",
    "languageProficiencyReference"
})
public class LanguageAbilityProfileDataType {

    @XmlElement(name = "Language_Ability_Type_Reference", required = true)
    protected LanguageAbilityTypeObjectType languageAbilityTypeReference;
    @XmlElement(name = "Language_Proficiency_Reference")
    protected LanguageProficiencyObjectType languageProficiencyReference;

    /**
     * Gets the value of the languageAbilityTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageAbilityTypeObjectType }
     *     
     */
    public LanguageAbilityTypeObjectType getLanguageAbilityTypeReference() {
        return languageAbilityTypeReference;
    }

    /**
     * Sets the value of the languageAbilityTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageAbilityTypeObjectType }
     *     
     */
    public void setLanguageAbilityTypeReference(LanguageAbilityTypeObjectType value) {
        this.languageAbilityTypeReference = value;
    }

    /**
     * Gets the value of the languageProficiencyReference property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageProficiencyObjectType }
     *     
     */
    public LanguageProficiencyObjectType getLanguageProficiencyReference() {
        return languageProficiencyReference;
    }

    /**
     * Sets the value of the languageProficiencyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageProficiencyObjectType }
     *     
     */
    public void setLanguageProficiencyReference(LanguageProficiencyObjectType value) {
        this.languageProficiencyReference = value;
    }

}
