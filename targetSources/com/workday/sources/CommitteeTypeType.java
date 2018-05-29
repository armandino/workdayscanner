
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Committee Type
 * 
 * <p>Java class for Committee_TypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Committee_TypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Committee_Type_Reference" type="{urn:com.workday/bsvc}Committee_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Committee_Type_Data" type="{urn:com.workday/bsvc}Committee_Type_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Committee_TypeType", propOrder = {
    "committeeTypeReference",
    "committeeTypeData"
})
public class CommitteeTypeType {

    @XmlElement(name = "Committee_Type_Reference")
    protected CommitteeTypeObjectType committeeTypeReference;
    @XmlElement(name = "Committee_Type_Data")
    protected CommitteeTypeDataType committeeTypeData;

    /**
     * Gets the value of the committeeTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeTypeObjectType }
     *     
     */
    public CommitteeTypeObjectType getCommitteeTypeReference() {
        return committeeTypeReference;
    }

    /**
     * Sets the value of the committeeTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeTypeObjectType }
     *     
     */
    public void setCommitteeTypeReference(CommitteeTypeObjectType value) {
        this.committeeTypeReference = value;
    }

    /**
     * Gets the value of the committeeTypeData property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeTypeDataType }
     *     
     */
    public CommitteeTypeDataType getCommitteeTypeData() {
        return committeeTypeData;
    }

    /**
     * Sets the value of the committeeTypeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeTypeDataType }
     *     
     */
    public void setCommitteeTypeData(CommitteeTypeDataType value) {
        this.committeeTypeData = value;
    }

}
