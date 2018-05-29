
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element for all Custom Identifier data.
 * 
 * <p>Java class for Custom_IDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Custom_IDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Custom_ID_Reference" type="{urn:com.workday/bsvc}Unique_IdentifierObjectType" minOccurs="0"/>
 *         &lt;element name="Custom_ID_Data" type="{urn:com.workday/bsvc}Custom_ID_DataType" minOccurs="0"/>
 *         &lt;element name="Custom_ID_Shared_Reference" type="{urn:com.workday/bsvc}Custom_Identifier_ReferenceObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Delete" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Custom_IDType", propOrder = {
    "customIDReference",
    "customIDData",
    "customIDSharedReference"
})
public class CustomIDType {

    @XmlElement(name = "Custom_ID_Reference")
    protected UniqueIdentifierObjectType customIDReference;
    @XmlElement(name = "Custom_ID_Data")
    protected CustomIDDataType customIDData;
    @XmlElement(name = "Custom_ID_Shared_Reference")
    protected CustomIdentifierReferenceObjectType customIDSharedReference;
    @XmlAttribute(name = "Delete", namespace = "urn:com.workday/bsvc")
    protected Boolean delete;

    /**
     * Gets the value of the customIDReference property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public UniqueIdentifierObjectType getCustomIDReference() {
        return customIDReference;
    }

    /**
     * Sets the value of the customIDReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public void setCustomIDReference(UniqueIdentifierObjectType value) {
        this.customIDReference = value;
    }

    /**
     * Gets the value of the customIDData property.
     * 
     * @return
     *     possible object is
     *     {@link CustomIDDataType }
     *     
     */
    public CustomIDDataType getCustomIDData() {
        return customIDData;
    }

    /**
     * Sets the value of the customIDData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomIDDataType }
     *     
     */
    public void setCustomIDData(CustomIDDataType value) {
        this.customIDData = value;
    }

    /**
     * Gets the value of the customIDSharedReference property.
     * 
     * @return
     *     possible object is
     *     {@link CustomIdentifierReferenceObjectType }
     *     
     */
    public CustomIdentifierReferenceObjectType getCustomIDSharedReference() {
        return customIDSharedReference;
    }

    /**
     * Sets the value of the customIDSharedReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomIdentifierReferenceObjectType }
     *     
     */
    public void setCustomIDSharedReference(CustomIdentifierReferenceObjectType value) {
        this.customIDSharedReference = value;
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

}
