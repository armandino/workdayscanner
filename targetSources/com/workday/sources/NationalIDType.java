
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for all National Identifier Data.
 * 
 * <p>Java class for National_IDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="National_IDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="National_ID_Reference" type="{urn:com.workday/bsvc}Unique_IdentifierObjectType" minOccurs="0"/>
 *         &lt;element name="National_ID_Data" type="{urn:com.workday/bsvc}National_ID_DataType" minOccurs="0"/>
 *         &lt;element name="National_ID_Shared_Reference" type="{urn:com.workday/bsvc}National_Identifier_ReferenceObjectType" minOccurs="0"/>
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
@XmlType(name = "National_IDType", propOrder = {
    "nationalIDReference",
    "nationalIDData",
    "nationalIDSharedReference"
})
public class NationalIDType {

    @XmlElement(name = "National_ID_Reference")
    protected UniqueIdentifierObjectType nationalIDReference;
    @XmlElement(name = "National_ID_Data")
    protected NationalIDDataType nationalIDData;
    @XmlElement(name = "National_ID_Shared_Reference")
    protected NationalIdentifierReferenceObjectType nationalIDSharedReference;
    @XmlAttribute(name = "Delete", namespace = "urn:com.workday/bsvc")
    protected Boolean delete;

    /**
     * Gets the value of the nationalIDReference property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public UniqueIdentifierObjectType getNationalIDReference() {
        return nationalIDReference;
    }

    /**
     * Sets the value of the nationalIDReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public void setNationalIDReference(UniqueIdentifierObjectType value) {
        this.nationalIDReference = value;
    }

    /**
     * Gets the value of the nationalIDData property.
     * 
     * @return
     *     possible object is
     *     {@link NationalIDDataType }
     *     
     */
    public NationalIDDataType getNationalIDData() {
        return nationalIDData;
    }

    /**
     * Sets the value of the nationalIDData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NationalIDDataType }
     *     
     */
    public void setNationalIDData(NationalIDDataType value) {
        this.nationalIDData = value;
    }

    /**
     * Gets the value of the nationalIDSharedReference property.
     * 
     * @return
     *     possible object is
     *     {@link NationalIdentifierReferenceObjectType }
     *     
     */
    public NationalIdentifierReferenceObjectType getNationalIDSharedReference() {
        return nationalIDSharedReference;
    }

    /**
     * Sets the value of the nationalIDSharedReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link NationalIdentifierReferenceObjectType }
     *     
     */
    public void setNationalIDSharedReference(NationalIdentifierReferenceObjectType value) {
        this.nationalIDSharedReference = value;
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
