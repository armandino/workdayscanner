
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains all the information about the Skill Item.
 * 
 * <p>Java class for Skill_Item_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Skill_Item_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Category_Reference" type="{urn:com.workday/bsvc}Skill_Item_CategoryObjectType" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Inactive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Skill_Item_DataType", propOrder = {
    "categoryReference",
    "id"
})
public class SkillItemDataType {

    @XmlElement(name = "Category_Reference")
    protected SkillItemCategoryObjectType categoryReference;
    @XmlElement(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name", namespace = "urn:com.workday/bsvc")
    protected String name;
    @XmlAttribute(name = "Inactive", namespace = "urn:com.workday/bsvc")
    protected Boolean inactive;

    /**
     * Gets the value of the categoryReference property.
     * 
     * @return
     *     possible object is
     *     {@link SkillItemCategoryObjectType }
     *     
     */
    public SkillItemCategoryObjectType getCategoryReference() {
        return categoryReference;
    }

    /**
     * Sets the value of the categoryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SkillItemCategoryObjectType }
     *     
     */
    public void setCategoryReference(SkillItemCategoryObjectType value) {
        this.categoryReference = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
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
     * Gets the value of the inactive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInactive() {
        return inactive;
    }

    /**
     * Sets the value of the inactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInactive(Boolean value) {
        this.inactive = value;
    }

}
