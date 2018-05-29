
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for Skill Items.
 * 
 * <p>Java class for SkillType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SkillType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Skill_Reference" type="{urn:com.workday/bsvc}Skill_ItemObjectType" minOccurs="0"/>
 *         &lt;element name="Skill_Data" type="{urn:com.workday/bsvc}Skill_Item_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SkillType", propOrder = {
    "skillReference",
    "skillData"
})
public class SkillType {

    @XmlElement(name = "Skill_Reference")
    protected SkillItemObjectType skillReference;
    @XmlElement(name = "Skill_Data")
    protected SkillItemDataType skillData;

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
     * Gets the value of the skillData property.
     * 
     * @return
     *     possible object is
     *     {@link SkillItemDataType }
     *     
     */
    public SkillItemDataType getSkillData() {
        return skillData;
    }

    /**
     * Sets the value of the skillData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SkillItemDataType }
     *     
     */
    public void setSkillData(SkillItemDataType value) {
        this.skillData = value;
    }

}
