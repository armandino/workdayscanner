
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request element to add or update Work Status Rule Set
 * 
 * <p>Java class for Put_Work_Status_Rule_Set_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Work_Status_Rule_Set_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Work_Status_Rule_Set_Reference" type="{urn:com.workday/bsvc}Work_Status_Rule_SetObjectType" minOccurs="0"/>
 *         &lt;element name="Work_Status_Rule_Set_Data" type="{urn:com.workday/bsvc}Work_Status_Rule_Set_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Add_Only" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute ref="{urn:com.workday/bsvc}version"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Put_Work_Status_Rule_Set_RequestType", propOrder = {
    "workStatusRuleSetReference",
    "workStatusRuleSetData"
})
public class PutWorkStatusRuleSetRequestType {

    @XmlElement(name = "Work_Status_Rule_Set_Reference")
    protected WorkStatusRuleSetObjectType workStatusRuleSetReference;
    @XmlElement(name = "Work_Status_Rule_Set_Data")
    protected WorkStatusRuleSetDataType workStatusRuleSetData;
    @XmlAttribute(name = "Add_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean addOnly;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the workStatusRuleSetReference property.
     * 
     * @return
     *     possible object is
     *     {@link WorkStatusRuleSetObjectType }
     *     
     */
    public WorkStatusRuleSetObjectType getWorkStatusRuleSetReference() {
        return workStatusRuleSetReference;
    }

    /**
     * Sets the value of the workStatusRuleSetReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkStatusRuleSetObjectType }
     *     
     */
    public void setWorkStatusRuleSetReference(WorkStatusRuleSetObjectType value) {
        this.workStatusRuleSetReference = value;
    }

    /**
     * Gets the value of the workStatusRuleSetData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkStatusRuleSetDataType }
     *     
     */
    public WorkStatusRuleSetDataType getWorkStatusRuleSetData() {
        return workStatusRuleSetData;
    }

    /**
     * Sets the value of the workStatusRuleSetData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkStatusRuleSetDataType }
     *     
     */
    public void setWorkStatusRuleSetData(WorkStatusRuleSetDataType value) {
        this.workStatusRuleSetData = value;
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

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
