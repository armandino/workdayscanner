
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element for all Government Identifier data.
 * 
 * <p>Java class for Government_IDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Government_IDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Government_ID_Reference" type="{urn:com.workday/bsvc}Unique_IdentifierObjectType" minOccurs="0"/>
 *         &lt;element name="Government_ID_Data" type="{urn:com.workday/bsvc}Government_ID_DataType" minOccurs="0"/>
 *         &lt;element name="Government_ID_Shared_Reference" type="{urn:com.workday/bsvc}Government_Identifier_ReferenceObjectType" minOccurs="0"/>
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
@XmlType(name = "Government_IDType", propOrder = {
    "governmentIDReference",
    "governmentIDData",
    "governmentIDSharedReference"
})
public class GovernmentIDType {

    @XmlElement(name = "Government_ID_Reference")
    protected UniqueIdentifierObjectType governmentIDReference;
    @XmlElement(name = "Government_ID_Data")
    protected GovernmentIDDataType governmentIDData;
    @XmlElement(name = "Government_ID_Shared_Reference")
    protected GovernmentIdentifierReferenceObjectType governmentIDSharedReference;
    @XmlAttribute(name = "Delete", namespace = "urn:com.workday/bsvc")
    protected Boolean delete;

    /**
     * Gets the value of the governmentIDReference property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public UniqueIdentifierObjectType getGovernmentIDReference() {
        return governmentIDReference;
    }

    /**
     * Sets the value of the governmentIDReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public void setGovernmentIDReference(UniqueIdentifierObjectType value) {
        this.governmentIDReference = value;
    }

    /**
     * Gets the value of the governmentIDData property.
     * 
     * @return
     *     possible object is
     *     {@link GovernmentIDDataType }
     *     
     */
    public GovernmentIDDataType getGovernmentIDData() {
        return governmentIDData;
    }

    /**
     * Sets the value of the governmentIDData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GovernmentIDDataType }
     *     
     */
    public void setGovernmentIDData(GovernmentIDDataType value) {
        this.governmentIDData = value;
    }

    /**
     * Gets the value of the governmentIDSharedReference property.
     * 
     * @return
     *     possible object is
     *     {@link GovernmentIdentifierReferenceObjectType }
     *     
     */
    public GovernmentIdentifierReferenceObjectType getGovernmentIDSharedReference() {
        return governmentIDSharedReference;
    }

    /**
     * Sets the value of the governmentIDSharedReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link GovernmentIdentifierReferenceObjectType }
     *     
     */
    public void setGovernmentIDSharedReference(GovernmentIdentifierReferenceObjectType value) {
        this.governmentIDSharedReference = value;
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
