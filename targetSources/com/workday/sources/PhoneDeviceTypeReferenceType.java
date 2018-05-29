
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference element representing a unique instance of Phone Device Type.
 * 
 * <p>Java class for Phone_Device_Type_ReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Phone_Device_Type_ReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Phone_Device_Type_Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Phone_Device_Type_ReferenceType", propOrder = {
    "phoneDeviceTypeDescription"
})
public class PhoneDeviceTypeReferenceType {

    @XmlElement(name = "Phone_Device_Type_Description", required = true)
    protected String phoneDeviceTypeDescription;

    /**
     * Gets the value of the phoneDeviceTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneDeviceTypeDescription() {
        return phoneDeviceTypeDescription;
    }

    /**
     * Sets the value of the phoneDeviceTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneDeviceTypeDescription(String value) {
        this.phoneDeviceTypeDescription = value;
    }

}
