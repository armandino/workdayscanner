
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element for tracking a person's contact information.
 * 
 * <p>Java class for Person_Contact_Information_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Person_Contact_Information_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Person_Address_Information_Data" type="{urn:com.workday/bsvc}Person_Address_Information_DataType" minOccurs="0"/>
 *         &lt;element name="Person_Phone_Information_Data" type="{urn:com.workday/bsvc}Person_Phone_Information_DataType" minOccurs="0"/>
 *         &lt;element name="Person_Email_Information_Data" type="{urn:com.workday/bsvc}Person_Email_Information_DataType" minOccurs="0"/>
 *         &lt;element name="Person_Instant_Messenger_Information_Data" type="{urn:com.workday/bsvc}Person_Instant_Messenger_Information_DataType" minOccurs="0"/>
 *         &lt;element name="Person_Web_Address_Information_Data" type="{urn:com.workday/bsvc}Person_Web_Address_Information_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person_Contact_Information_DataType", propOrder = {
    "personAddressInformationData",
    "personPhoneInformationData",
    "personEmailInformationData",
    "personInstantMessengerInformationData",
    "personWebAddressInformationData"
})
public class PersonContactInformationDataType {

    @XmlElement(name = "Person_Address_Information_Data")
    protected PersonAddressInformationDataType personAddressInformationData;
    @XmlElement(name = "Person_Phone_Information_Data")
    protected PersonPhoneInformationDataType personPhoneInformationData;
    @XmlElement(name = "Person_Email_Information_Data")
    protected PersonEmailInformationDataType personEmailInformationData;
    @XmlElement(name = "Person_Instant_Messenger_Information_Data")
    protected PersonInstantMessengerInformationDataType personInstantMessengerInformationData;
    @XmlElement(name = "Person_Web_Address_Information_Data")
    protected PersonWebAddressInformationDataType personWebAddressInformationData;

    /**
     * Gets the value of the personAddressInformationData property.
     * 
     * @return
     *     possible object is
     *     {@link PersonAddressInformationDataType }
     *     
     */
    public PersonAddressInformationDataType getPersonAddressInformationData() {
        return personAddressInformationData;
    }

    /**
     * Sets the value of the personAddressInformationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonAddressInformationDataType }
     *     
     */
    public void setPersonAddressInformationData(PersonAddressInformationDataType value) {
        this.personAddressInformationData = value;
    }

    /**
     * Gets the value of the personPhoneInformationData property.
     * 
     * @return
     *     possible object is
     *     {@link PersonPhoneInformationDataType }
     *     
     */
    public PersonPhoneInformationDataType getPersonPhoneInformationData() {
        return personPhoneInformationData;
    }

    /**
     * Sets the value of the personPhoneInformationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonPhoneInformationDataType }
     *     
     */
    public void setPersonPhoneInformationData(PersonPhoneInformationDataType value) {
        this.personPhoneInformationData = value;
    }

    /**
     * Gets the value of the personEmailInformationData property.
     * 
     * @return
     *     possible object is
     *     {@link PersonEmailInformationDataType }
     *     
     */
    public PersonEmailInformationDataType getPersonEmailInformationData() {
        return personEmailInformationData;
    }

    /**
     * Sets the value of the personEmailInformationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonEmailInformationDataType }
     *     
     */
    public void setPersonEmailInformationData(PersonEmailInformationDataType value) {
        this.personEmailInformationData = value;
    }

    /**
     * Gets the value of the personInstantMessengerInformationData property.
     * 
     * @return
     *     possible object is
     *     {@link PersonInstantMessengerInformationDataType }
     *     
     */
    public PersonInstantMessengerInformationDataType getPersonInstantMessengerInformationData() {
        return personInstantMessengerInformationData;
    }

    /**
     * Sets the value of the personInstantMessengerInformationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonInstantMessengerInformationDataType }
     *     
     */
    public void setPersonInstantMessengerInformationData(PersonInstantMessengerInformationDataType value) {
        this.personInstantMessengerInformationData = value;
    }

    /**
     * Gets the value of the personWebAddressInformationData property.
     * 
     * @return
     *     possible object is
     *     {@link PersonWebAddressInformationDataType }
     *     
     */
    public PersonWebAddressInformationDataType getPersonWebAddressInformationData() {
        return personWebAddressInformationData;
    }

    /**
     * Sets the value of the personWebAddressInformationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonWebAddressInformationDataType }
     *     
     */
    public void setPersonWebAddressInformationData(PersonWebAddressInformationDataType value) {
        this.personWebAddressInformationData = value;
    }

}
