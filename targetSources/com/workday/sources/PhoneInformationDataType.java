
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Phone Information
 * 
 * <p>Java class for Phone_Information_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Phone_Information_DataType">
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
 *         &lt;element name="Phone_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone_Device_Type_Reference" type="{urn:com.workday/bsvc}Phone_Device_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Usage_Data" type="{urn:com.workday/bsvc}Communication_Method_Usage_Information_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Phone_Reference" type="{urn:com.workday/bsvc}Phone_ReferenceObjectType" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Formatted_Phone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Delete" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Do_Not_Replace_All" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Phone_Information_DataType", propOrder = {
    "countryISOCode",
    "internationalPhoneCode",
    "areaCode",
    "phoneNumber",
    "phoneExtension",
    "phoneDeviceTypeReference",
    "usageData",
    "phoneReference",
    "id"
})
public class PhoneInformationDataType {

    @XmlElement(name = "Country_ISO_Code")
    protected String countryISOCode;
    @XmlElement(name = "International_Phone_Code")
    protected String internationalPhoneCode;
    @XmlElement(name = "Area_Code")
    protected String areaCode;
    @XmlElement(name = "Phone_Number")
    protected String phoneNumber;
    @XmlElement(name = "Phone_Extension")
    protected String phoneExtension;
    @XmlElement(name = "Phone_Device_Type_Reference")
    protected PhoneDeviceTypeObjectType phoneDeviceTypeReference;
    @XmlElement(name = "Usage_Data")
    protected List<CommunicationMethodUsageInformationDataType> usageData;
    @XmlElement(name = "Phone_Reference")
    protected PhoneReferenceObjectType phoneReference;
    @XmlElement(name = "ID")
    protected String id;
    @XmlAttribute(name = "Formatted_Phone", namespace = "urn:com.workday/bsvc")
    protected String formattedPhone;
    @XmlAttribute(name = "Delete", namespace = "urn:com.workday/bsvc")
    protected Boolean delete;
    @XmlAttribute(name = "Do_Not_Replace_All", namespace = "urn:com.workday/bsvc")
    protected Boolean doNotReplaceAll;

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
     *     {@link PhoneDeviceTypeObjectType }
     *     
     */
    public PhoneDeviceTypeObjectType getPhoneDeviceTypeReference() {
        return phoneDeviceTypeReference;
    }

    /**
     * Sets the value of the phoneDeviceTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneDeviceTypeObjectType }
     *     
     */
    public void setPhoneDeviceTypeReference(PhoneDeviceTypeObjectType value) {
        this.phoneDeviceTypeReference = value;
    }

    /**
     * Gets the value of the usageData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usageData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsageData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicationMethodUsageInformationDataType }
     * 
     * 
     */
    public List<CommunicationMethodUsageInformationDataType> getUsageData() {
        if (usageData == null) {
            usageData = new ArrayList<CommunicationMethodUsageInformationDataType>();
        }
        return this.usageData;
    }

    /**
     * Gets the value of the phoneReference property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneReferenceObjectType }
     *     
     */
    public PhoneReferenceObjectType getPhoneReference() {
        return phoneReference;
    }

    /**
     * Sets the value of the phoneReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneReferenceObjectType }
     *     
     */
    public void setPhoneReference(PhoneReferenceObjectType value) {
        this.phoneReference = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
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

    /**
     * Gets the value of the doNotReplaceAll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDoNotReplaceAll() {
        return doNotReplaceAll;
    }

    /**
     * Sets the value of the doNotReplaceAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDoNotReplaceAll(Boolean value) {
        this.doNotReplaceAll = value;
    }

}
