
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for Skill Qualifications. Allows all Skill Qualifications for a Job Profile or Position Restriction to be removed - or to replace all existing Skill Qualifications with those sent in the web service.
 * 
 * <p>Java class for Skill_Qualification_Profile_Replacement_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Skill_Qualification_Profile_Replacement_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Skill_Reference" type="{urn:com.workday/bsvc}Skill_ItemObjectType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Skill_Qualification_Profile_Replacement_DataType", propOrder = {
    "skillReference",
    "name",
    "required"
})
public class SkillQualificationProfileReplacementDataType {

    @XmlElement(name = "Skill_Reference")
    protected SkillItemObjectType skillReference;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Required")
    protected Boolean required;

    /**
     * Gets the value of the skillReference property.
     * 
     * @return
     *     possible object is
     *     {@link SkillItemObjectType }
     *     
     */
    public SkillItemObjectType getSkillReference() {
        return skillReference;
    }

    /**
     * Sets the value of the skillReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SkillItemObjectType }
     *     
     */
    public void setSkillReference(SkillItemObjectType value) {
        this.skillReference = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
