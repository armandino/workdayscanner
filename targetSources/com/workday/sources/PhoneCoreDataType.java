
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Phone core data.
 * 
 * <p>Java class for Phone_Core_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Phone_Core_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Device_Type_Reference" type="{urn:com.workday/bsvc}Phone_Device_TypeObjectType"/>
 *         &lt;element name="Country_Code_Reference" type="{urn:com.workday/bsvc}Unique_IdentifierObjectType" minOccurs="0"/>
 *         &lt;element name="Complete_Phone_Number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Formatted_Phone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Phone_Core_DataType", propOrder = {
    "deviceTypeReference",
    "countryCodeReference",
    "completePhoneNumber",
    "extension"
})
public class PhoneCoreDataType {

    @XmlElement(name = "Device_Type_Reference", required = true)
    protected PhoneDeviceTypeObjectType deviceTypeReference;
    @XmlElement(name = "Country_Code_Reference")
    protected UniqueIdentifierObjectType countryCodeReference;
    @XmlElement(name = "Complete_Phone_Number", required = true)
    protected String completePhoneNumber;
    @XmlElement(name = "Extension")
    protected String extension;
    @XmlAttribute(name = "Formatted_Phone", namespace = "urn:com.workday/bsvc")
    protected String formattedPhone;

    /**
     * Gets the value of the deviceTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneDeviceTypeObjectType }
     *     
     */
    public PhoneDeviceTypeObjectType getDeviceTypeReference() {
        return deviceTypeReference;
    }

    /**
     * Sets the value of the deviceTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneDeviceTypeObjectType }
     *     
     */
    public void setDeviceTypeReference(PhoneDeviceTypeObjectType value) {
        this.deviceTypeReference = value;
    }

    /**
     * Gets the value of the countryCodeReference property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public UniqueIdentifierObjectType getCountryCodeReference() {
        return countryCodeReference;
    }

    /**
     * Sets the value of the countryCodeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public void setCountryCodeReference(UniqueIdentifierObjectType value) {
        this.countryCodeReference = value;
    }

    /**
     * Gets the value of the completePhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompletePhoneNumber() {
        return completePhoneNumber;
    }

    /**
     * Sets the value of the completePhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompletePhoneNumber(String value) {
        this.completePhoneNumber = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

    /**
     * Gets the value of the formattedPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedPhone() {
        return formattedPhone;
    }

    /**
     * Sets the value of the formattedPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedPhone(String value) {
        this.formattedPhone = value;
    }

}
