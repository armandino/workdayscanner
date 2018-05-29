
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the additional names for a person, other than their legal and preferred names.  Additional names are not valid for applicants.
 * 
 * <p>Java class for Additional_Name_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Additional_Name_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name_Detail_Data" type="{urn:com.workday/bsvc}Person_Name_Detail_DataType"/>
 *         &lt;element name="Name_Type_Reference" type="{urn:com.workday/bsvc}Additional_Name_TypeObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Additional_Name_DataType", propOrder = {
    "nameDetailData",
    "nameTypeReference"
})
public class AdditionalNameDataType {

    @XmlElement(name = "Name_Detail_Data", required = true)
    protected PersonNameDetailDataType nameDetailData;
    @XmlElement(name = "Name_Type_Reference")
    protected AdditionalNameTypeObjectType nameTypeReference;

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
     * Gets the value of the nameTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalNameTypeObjectType }
     *     
     */
    public AdditionalNameTypeObjectType getNameTypeReference() {
        return nameTypeReference;
    }

    /**
     * Sets the value of the nameTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalNameTypeObjectType }
     *     
     */
    public void setNameTypeReference(AdditionalNameTypeObjectType value) {
        this.nameTypeReference = value;
    }

}
