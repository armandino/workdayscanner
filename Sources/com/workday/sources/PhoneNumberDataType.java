
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element for all Phone Number data.
 * 
 * <p>Java class for Phone_Number_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Phone_Number_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Country_ISO_Code" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="International_Phone_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Area_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone_Number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Phone_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone_Device_Type_Reference" type="{urn:com.workday/bsvc}Phone_Device_Type_ReferenceType"/>
 *         &lt;element name="Usage_Data" type="{urn:com.workday/bsvc}Communication_Method_Usage_DataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Phone_Number_DataType", propOrder = {
    "countryISOCode",
    "internationalPhoneCode",
    "areaCode",
    "phoneNumber",
    "phoneExtension",
    "phoneDeviceTypeReference",
    "usageData"
})
public class PhoneNumberDataType {

    @XmlElement(name = "Country_ISO_Code")
    protected String countryISOCode;
    @XmlElement(name = "International_Phone_Code")
    protected String internationalPhoneCode;
    @XmlElement(name = "Area_Code")
    protected String areaCode;
    @XmlElement(name = "Phone_Number", required = true)
    protected String phoneNumber;
    @XmlElement(name = "Phone_Extension")
    protected String phoneExtension;
    @XmlElement(name = "Phone_Device_Type_Reference", required = true)
    protected PhoneDeviceTypeReferenceType phoneDeviceTypeReference;
    @XmlElement(name = "Usage_Data", required = true)
    protected CommunicationMethodUsageDataType usageData;

    /**
     * Gets the value of the countryISOCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryISOCode() {
        return countryISOCode;
    }

    /**
     * Sets the value of the countryISOCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryISOCode(String value) {
        this.countryISOCode = value;
    }

    /**
     * Gets the value of the internationalPhoneCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalPhoneCode() {
        return internationalPhoneCode;
    }

    /**
     * Sets the value of the internationalPhoneCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalPhoneCode(String value) {
        this.internationalPhoneCode = value;
    }

    /**
     * Gets the value of the areaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Sets the value of the areaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaCode(String value) {
        this.areaCode = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the phoneExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneExtension() {
        return phoneExtension;
    }

    /**
     * Sets the value of the phoneExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneExtension(String value) {
        this.phoneExtension = value;
    }

    /**
     * Gets the value of the phoneDeviceTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneDeviceTypeReferenceType }
     *     
     */
    public PhoneDeviceTypeReferenceType getPhoneDeviceTypeReference() {
        return phoneDeviceTypeReference;
    }

    /**
     * Sets the value of the phoneDeviceTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneDeviceTypeReferenceType }
     *     
     */
    public void setPhoneDeviceTypeReference(PhoneDeviceTypeReferenceType value) {
        this.phoneDeviceTypeReference = value;
    }

    /**
     * Gets the value of the usageData property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationMethodUsageDataType }
     *     
     */
    public CommunicationMethodUsageDataType getUsageData() {
        return usageData;
    }

    /**
     * Sets the value of the usageData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationMethodUsageDataType }
     *     
     */
    public void setUsageData(CommunicationMethodUsageDataType value) {
        this.usageData = value;
    }

}
