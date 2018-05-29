
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference element representing a unique instance of Visa Type.
 * 
 * <p>Java class for Visa_Type_ReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Visa_Type_ReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Visa_Type_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Visa_Type_ReferenceType", propOrder = {
    "visaTypeName"
})
public class VisaTypeReferenceType {

    @XmlElement(name = "Visa_Type_Name", required = true)
    protected String visaTypeName;

    /**
     * Gets the value of the visaTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaTypeName() {
        return visaTypeName;
    }

    /**
     * Sets the value of the visaTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaTypeName(String value) {
        this.visaTypeName = value;
    }

}
