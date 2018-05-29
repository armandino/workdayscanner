
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference element representing a unique instance of LGBT Identification
 * 
 * <p>Java class for LGBT_IdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LGBT_IdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LGBT_Identification_Reference" type="{urn:com.workday/bsvc}LGBT_IdentificationObjectType" minOccurs="0"/>
 *         &lt;element name="LGBT_Identification_Data" type="{urn:com.workday/bsvc}LGBT_Identification_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LGBT_IdentificationType", propOrder = {
    "lgbtIdentificationReference",
    "lgbtIdentificationData"
})
public class LGBTIdentificationType {

    @XmlElement(name = "LGBT_Identification_Reference")
    protected LGBTIdentificationObjectType lgbtIdentificationReference;
    @XmlElement(name = "LGBT_Identification_Data")
    protected LGBTIdentificationDataType lgbtIdentificationData;

    /**
     * Gets the value of the lgbtIdentificationReference property.
     * 
     * @return
     *     possible object is
     *     {@link LGBTIdentificationObjectType }
     *     
     */
    public LGBTIdentificationObjectType getLGBTIdentificationReference() {
        return lgbtIdentificationReference;
    }

    /**
     * Sets the value of the lgbtIdentificationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LGBTIdentificationObjectType }
     *     
     */
    public void setLGBTIdentificationReference(LGBTIdentificationObjectType value) {
        this.lgbtIdentificationReference = value;
    }

    /**
     * Gets the value of the lgbtIdentificationData property.
     * 
     * @return
     *     possible object is
     *     {@link LGBTIdentificationDataType }
     *     
     */
    public LGBTIdentificationDataType getLGBTIdentificationData() {
        return lgbtIdentificationData;
    }

    /**
     * Sets the value of the lgbtIdentificationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LGBTIdentificationDataType }
     *     
     */
    public void setLGBTIdentificationData(LGBTIdentificationDataType value) {
        this.lgbtIdentificationData = value;
    }

}
