
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element for all Visa Identifier data.
 * 
 * <p>Java class for Visa_IDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Visa_IDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Visa_ID_Reference" type="{urn:com.workday/bsvc}Unique_IdentifierObjectType" minOccurs="0"/>
 *         &lt;element name="Visa_ID_Data" type="{urn:com.workday/bsvc}Visa_ID_DataType" minOccurs="0"/>
 *         &lt;element name="Visa_ID_Shared_Reference" type="{urn:com.workday/bsvc}Visa_Identifier_ReferenceObjectType" minOccurs="0"/>
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
@XmlType(name = "Visa_IDType", propOrder = {
    "visaIDReference",
    "visaIDData",
    "visaIDSharedReference"
})
public class VisaIDType {

    @XmlElement(name = "Visa_ID_Reference")
    protected UniqueIdentifierObjectType visaIDReference;
    @XmlElement(name = "Visa_ID_Data")
    protected VisaIDDataType visaIDData;
    @XmlElement(name = "Visa_ID_Shared_Reference")
    protected VisaIdentifierReferenceObjectType visaIDSharedReference;
    @XmlAttribute(name = "Delete", namespace = "urn:com.workday/bsvc")
    protected Boolean delete;

    /**
     * Gets the value of the visaIDReference property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public UniqueIdentifierObjectType getVisaIDReference() {
        return visaIDReference;
    }

    /**
     * Sets the value of the visaIDReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public void setVisaIDReference(UniqueIdentifierObjectType value) {
        this.visaIDReference = value;
    }

    /**
     * Gets the value of the visaIDData property.
     * 
     * @return
     *     possible object is
     *     {@link VisaIDDataType }
     *     
     */
    public VisaIDDataType getVisaIDData() {
        return visaIDData;
    }

    /**
     * Sets the value of the visaIDData property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisaIDDataType }
     *     
     */
    public void setVisaIDData(VisaIDDataType value) {
        this.visaIDData = value;
    }

    /**
     * Gets the value of the visaIDSharedReference property.
     * 
     * @return
     *     possible object is
     *     {@link VisaIdentifierReferenceObjectType }
     *     
     */
    public VisaIdentifierReferenceObjectType getVisaIDSharedReference() {
        return visaIDSharedReference;
    }

    /**
     * Sets the value of the visaIDSharedReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisaIdentifierReferenceObjectType }
     *     
     */
    public void setVisaIDSharedReference(VisaIdentifierReferenceObjectType value) {
        this.visaIDSharedReference = value;
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
