
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Work Status Rule Set Response from Put Request
 * 
 * <p>Java class for Put_Work_Status_Rule_Set_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Work_Status_Rule_Set_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Work_Status_Rule_Set_Reference" type="{urn:com.workday/bsvc}Work_Status_Rule_SetObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{urn:com.workday/bsvc}version"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Put_Work_Status_Rule_Set_ResponseType", propOrder = {
    "workStatusRuleSetReference"
})
public class PutWorkStatusRuleSetResponseType {

    @XmlElement(name = "Work_Status_Rule_Set_Reference")
    protected WorkStatusRuleSetObjectType workStatusRuleSetReference;
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
