
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element for all Passport Identifier data.
 * 
 * <p>Java class for Passport_IDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Passport_IDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Passport_ID_Reference" type="{urn:com.workday/bsvc}Unique_IdentifierObjectType" minOccurs="0"/>
 *         &lt;element name="Passport_ID_Data" type="{urn:com.workday/bsvc}Passport_ID_DataType" minOccurs="0"/>
 *         &lt;element name="Passport_ID_Shared_Reference" type="{urn:com.workday/bsvc}Passport_Identifier_ReferenceObjectType" minOccurs="0"/>
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
@XmlType(name = "Passport_IDType", propOrder = {
    "passportIDReference",
    "passportIDData",
    "passportIDSharedReference"
})
public class PassportIDType {

    @XmlElement(name = "Passport_ID_Reference")
    protected UniqueIdentifierObjectType passportIDReference;
    @XmlElement(name = "Passport_ID_Data")
    protected PassportIDDataType passportIDData;
    @XmlElement(name = "Passport_ID_Shared_Reference")
    protected PassportIdentifierReferenceObjectType passportIDSharedReference;
    @XmlAttribute(name = "Delete", namespace = "urn:com.workday/bsvc")
    protected Boolean delete;

    /**
     * Gets the value of the passportIDReference property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public UniqueIdentifierObjectType getPassportIDReference() {
        return passportIDReference;
    }

    /**
     * Sets the value of the passportIDReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public void setPassportIDReference(UniqueIdentifierObjectType value) {
        this.passportIDReference = value;
    }

    /**
     * Gets the value of the passportIDData property.
     * 
     * @return
     *     possible object is
     *     {@link PassportIDDataType }
     *     
     */
    public PassportIDDataType getPassportIDData() {
        return passportIDData;
    }

    /**
     * Sets the value of the passportIDData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassportIDDataType }
     *     
     */
    public void setPassportIDData(PassportIDDataType value) {
        this.passportIDData = value;
    }

    /**
     * Gets the value of the passportIDSharedReference property.
     * 
     * @return
     *     possible object is
     *     {@link PassportIdentifierReferenceObjectType }
     *     
     */
    public PassportIdentifierReferenceObjectType getPassportIDSharedReference() {
        return passportIDSharedReference;
    }

    /**
     * Sets the value of the passportIDSharedReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassportIdentifierReferenceObjectType }
     *     
     */
    public void setPassportIDSharedReference(PassportIdentifierReferenceObjectType value) {
        this.passportIDSharedReference = value;
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
