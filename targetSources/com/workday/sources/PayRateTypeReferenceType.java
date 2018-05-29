
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference element representing a unique instance of Pay Rate Type.
 * 
 * <p>Java class for Pay_Rate_Type_ReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pay_Rate_Type_ReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pay_Type_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pay_Rate_Type_ReferenceType", propOrder = {
    "payTypeName"
})
public class PayRateTypeReferenceType {

    @XmlElement(name = "Pay_Type_Name")
    protected String payTypeName;

    /**
     * Gets the value of the payTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayTypeName() {
        return payTypeName;
    }

    /**
     * Sets the value of the payTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayTypeName(String value) {
        this.payTypeName = value;
    }

}
