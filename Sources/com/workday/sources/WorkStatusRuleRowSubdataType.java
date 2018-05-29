
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Container Element for all Attributes and Relationships associated to the Work Status Rule Row
 * 
 * <p>Java class for Work_Status_Rule_Row_SubdataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Work_Status_Rule_Row_SubdataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Work_Status_Rule_Row_Reference" type="{urn:com.workday/bsvc}Work_Status_Rule_RowObjectType" minOccurs="0"/>
 *         &lt;element name="Order">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Work_Status_Rule_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Work_Status_Reference" type="{urn:com.workday/bsvc}Work_StatusObjectType"/>
 *         &lt;element name="Work_Status_Rule_Reference" type="{urn:com.workday/bsvc}Work_Status_RuleObjectType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Delete" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Add_Only" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Work_Status_Rule_Row_SubdataType", propOrder = {
    "workStatusRuleRowReference",
    "order",
    "workStatusRuleName",
    "workStatusReference",
    "workStatusRuleReference"
})
public class WorkStatusRuleRowSubdataType {

    @XmlElement(name = "Work_Status_Rule_Row_Reference")
    protected WorkStatusRuleRowObjectType workStatusRuleRowReference;
    @XmlElement(name = "Order", required = true)
    protected String order;
    @XmlElement(name = "Work_Status_Rule_Name", required = true)
    protected String workStatusRuleName;
    @XmlElement(name = "Work_Status_Reference", required = true)
    protected WorkStatusObjectType workStatusReference;
    @XmlElement(name = "Work_Status_Rule_Reference", required = true)
    protected WorkStatusRuleObjectType workStatusRuleReference;
    @XmlAttribute(name = "Delete", namespace = "urn:com.workday/bsvc")
    protected Boolean delete;
    @XmlAttribute(name = "Add_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean addOnly;

    /**
     * Gets the value of the workStatusRuleRowReference property.
     * 
     * @return
     *     possible object is
     *     {@link WorkStatusRuleRowObjectType }
     *     
     */
    public WorkStatusRuleRowObjectType getWorkStatusRuleRowReference() {
        return workStatusRuleRowReference;
    }

    /**
     * Sets the value of the workStatusRuleRowReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkStatusRuleRowObjectType }
     *     
     */
    public void setWorkStatusRuleRowReference(WorkStatusRuleRowObjectType value) {
        this.workStatusRuleRowReference = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrder(String value) {
        this.order = value;
    }

    /**
     * Gets the value of the workStatusRuleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkStatusRuleName() {
        return workStatusRuleName;
    }

    /**
     * Sets the value of the workStatusRuleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkStatusRuleName(String value) {
        this.workStatusRuleName = value;
    }

    /**
     * Gets the value of the workStatusReference property.
     * 
     * @return
     *     possible object is
     *     {@link WorkStatusObjectType }
     *     
     */
    public WorkStatusObjectType getWorkStatusReference() {
        return workStatusReference;
    }

    /**
     * Sets the value of the workStatusReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkStatusObjectType }
     *     
     */
    public void setWorkStatusReference(WorkStatusObjectType value) {
        this.workStatusReference = value;
    }

    /**
     * Gets the value of the workStatusRuleReference property.
     * 
     * @return
     *     possible object is
     *     {@link WorkStatusRuleObjectType }
     *     
     */
    public WorkStatusRuleObjectType getWorkStatusRuleReference() {
        return workStatusRuleReference;
    }

    /**
     * Sets the value of the workStatusRuleReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkStatusRuleObjectType }
     *     
     */
    public void setWorkStatusRuleReference(WorkStatusRuleObjectType value) {
        this.workStatusRuleReference = value;
    }

    /**
     * Gets the value of the delete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelete() {
        return delete;
    }

    /**
     * Sets the value of the delete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelete(Boolean value) {
        this.delete = value;
    }

    /**
     * Gets the value of the addOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddOnly() {
        return addOnly;
    }

    /**
     * Sets the value of the addOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddOnly(Boolean value) {
        this.addOnly = value;
    }

}
