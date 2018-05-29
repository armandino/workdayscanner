
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * contains relative names for a relative of a person
 * 
 * <p>Java class for Relative_Name_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Relative_Name_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Relative_Name_Reference_Reference" type="{urn:com.workday/bsvc}Relative_Name_ReferenceObjectType" minOccurs="0"/>
 *         &lt;element name="Relative_Type_Reference" type="{urn:com.workday/bsvc}Relative_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Name_Detail_Data" type="{urn:com.workday/bsvc}Person_Name_Detail_DataType" minOccurs="0"/>
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
@XmlType(name = "Relative_Name_DataType", propOrder = {
    "relativeNameReferenceReference",
    "relativeTypeReference",
    "nameDetailData"
})
public class RelativeNameDataType {

    @XmlElement(name = "Relative_Name_Reference_Reference")
    protected RelativeNameReferenceObjectType relativeNameReferenceReference;
    @XmlElement(name = "Relative_Type_Reference")
    protected RelativeTypeObjectType relativeTypeReference;
    @XmlElement(name = "Name_Detail_Data")
    protected PersonNameDetailDataType nameDetailData;
    @XmlAttribute(name = "Delete", namespace = "urn:com.workday/bsvc")
    protected Boolean delete;

    /**
     * Gets the value of the relativeNameReferenceReference property.
     * 
     * @return
     *     possible object is
     *     {@link RelativeNameReferenceObjectType }
     *     
     */
    public RelativeNameReferenceObjectType getRelativeNameReferenceReference() {
        return relativeNameReferenceReference;
    }

    /**
     * Sets the value of the relativeNameReferenceReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeNameReferenceObjectType }
     *     
     */
    public void setRelativeNameReferenceReference(RelativeNameReferenceObjectType value) {
        this.relativeNameReferenceReference = value;
    }

    /**
     * Gets the value of the relativeTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link RelativeTypeObjectType }
     *     
     */
    public RelativeTypeObjectType getRelativeTypeReference() {
        return relativeTypeReference;
    }

    /**
     * Sets the value of the relativeTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeTypeObjectType }
     *     
     */
    public void setRelativeTypeReference(RelativeTypeObjectType value) {
        this.relativeTypeReference = value;
    }

    /**
     * Gets the value of the nameDetailData property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameDetailDataType }
     *     
     */
    public PersonNameDetailDataType getNameDetailData() {
        return nameDetailData;
    }

    /**
     * Sets the value of the nameDetailData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameDetailDataType }
     *     
     */
    public void setNameDetailData(PersonNameDetailDataType value) {
        this.nameDetailData = value;
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
