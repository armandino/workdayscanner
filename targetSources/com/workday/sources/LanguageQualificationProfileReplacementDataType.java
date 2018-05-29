
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Replacement element containing Language Qualifications for the Job Profile. When updating a Job Profile, all Languages for the Job Profile will be replaced by the submitted data. If no data is submitted, then the existing Languages are not changed.
 * 
 * <p>Java class for Language_Qualification_Profile_Replacement_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Language_Qualification_Profile_Replacement_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Language_Reference" type="{urn:com.workday/bsvc}LanguageObjectType"/>
 *         &lt;element name="Language_Ability_Profile_Data" type="{urn:com.workday/bsvc}Language_Ability_Profile_DataType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Language_Qualification_Profile_Replacement_DataType", propOrder = {
    "languageReference",
    "languageAbilityProfileData",
    "required"
})
public class LanguageQualificationProfileReplacementDataType {

    @XmlElement(name = "Language_Reference", required = true)
    protected LanguageObjectType languageReference;
    @XmlElement(name = "Language_Ability_Profile_Data")
    protected List<LanguageAbilityProfileDataType> languageAbilityProfileData;
    @XmlElement(name = "Required")
    protected Boolean required;

    /**
     * Gets the value of the languageReference property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageObjectType }
     *     
     */
    public LanguageObjectType getLanguageReference() {
        return languageReference;
    }

    /**
     * Sets the value of the languageReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageObjectType }
     *     
     */
    public void setLanguageReference(LanguageObjectType value) {
        this.languageReference = value;
    }

    /**
     * Gets the value of the languageAbilityProfileData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languageAbilityProfileData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguageAbilityProfileData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageAbilityProfileDataType }
     * 
     * 
     */
    public List<LanguageAbilityProfileDataType> getLanguageAbilityProfileData() {
        if (languageAbilityProfileData == null) {
            languageAbilityProfileData = new ArrayList<LanguageAbilityProfileDataType>();
        }
        return this.languageAbilityProfileData;
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
