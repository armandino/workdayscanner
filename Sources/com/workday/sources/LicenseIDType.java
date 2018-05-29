
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element for all License Identifier data.
 * 
 * <p>Java class for License_IDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="License_IDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="License_ID_Reference" type="{urn:com.workday/bsvc}License_IdentifierObjectType" minOccurs="0"/>
 *         &lt;element name="License_ID_Data" type="{urn:com.workday/bsvc}License_ID_DataType" minOccurs="0"/>
 *         &lt;element name="License_ID_Shared_Reference" type="{urn:com.workday/bsvc}License_Identifier_ReferenceObjectType" minOccurs="0"/>
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
@XmlType(name = "License_IDType", propOrder = {
    "licenseIDReference",
    "licenseIDData",
    "licenseIDSharedReference"
})
public class LicenseIDType {

    @XmlElement(name = "License_ID_Reference")
    protected LicenseIdentifierObjectType licenseIDReference;
    @XmlElement(name = "License_ID_Data")
    protected LicenseIDDataType licenseIDData;
    @XmlElement(name = "License_ID_Shared_Reference")
    protected LicenseIdentifierReferenceObjectType licenseIDSharedReference;
    @XmlAttribute(name = "Delete", namespace = "urn:com.workday/bsvc")
    protected Boolean delete;

    /**
     * Gets the value of the licenseIDReference property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseIdentifierObjectType }
     *     
     */
    public LicenseIdentifierObjectType getLicenseIDReference() {
        return licenseIDReference;
    }

    /**
     * Sets the value of the licenseIDReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseIdentifierObjectType }
     *     
     */
    public void setLicenseIDReference(LicenseIdentifierObjectType value) {
        this.licenseIDReference = value;
    }

    /**
     * Gets the value of the licenseIDData property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseIDDataType }
     *     
     */
    public LicenseIDDataType getLicenseIDData() {
        return licenseIDData;
    }

    /**
     * Sets the value of the licenseIDData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseIDDataType }
     *     
     */
    public void setLicenseIDData(LicenseIDDataType value) {
        this.licenseIDData = value;
    }

    /**
     * Gets the value of the licenseIDSharedReference property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseIdentifierReferenceObjectType }
     *     
     */
    public LicenseIdentifierReferenceObjectType getLicenseIDSharedReference() {
        return licenseIDSharedReference;
    }

    /**
     * Sets the value of the licenseIDSharedReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseIdentifierReferenceObjectType }
     *     
     */
    public void setLicenseIDSharedReference(LicenseIdentifierReferenceObjectType value) {
        this.licenseIDSharedReference = value;
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
