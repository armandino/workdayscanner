
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element for all of the contact methods for the person. Contact methods in workday represents methods to contact an entity. For example these methods include: Address (via post), Phone, Email, Instant Messenger and/or Web.
 * 
 * <p>Java class for Contact_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contact_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Internet_Email_Address_Data" type="{urn:com.workday/bsvc}Internet_Email_Address_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Phone_Number_Data" type="{urn:com.workday/bsvc}Phone_Number_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Address_Data" type="{urn:com.workday/bsvc}Address_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Web_Address_Data" type="{urn:com.workday/bsvc}Web_Address_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Instant_Messenger_Data" type="{urn:com.workday/bsvc}Instant_Messenger_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact_DataType", propOrder = {
    "internetEmailAddressData",
    "phoneNumberData",
    "addressData",
    "webAddressData",
    "instantMessengerData"
})
public class ContactDataType {

    @XmlElement(name = "Internet_Email_Address_Data")
    protected List<InternetEmailAddressDataType> internetEmailAddressData;
    @XmlElement(name = "Phone_Number_Data")
    protected List<PhoneNumberDataType> phoneNumberData;
    @XmlElement(name = "Address_Data")
    protected List<AddressDataType> addressData;
    @XmlElement(name = "Web_Address_Data")
    protected List<WebAddressDataType> webAddressData;
    @XmlElement(name = "Instant_Messenger_Data")
    protected List<InstantMessengerDataType> instantMessengerData;

    /**
     * Gets the value of the internetEmailAddressData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internetEmailAddressData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternetEmailAddressData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternetEmailAddressDataType }
     * 
     * 
     */
    public List<InternetEmailAddressDataType> getInternetEmailAddressData() {
        if (internetEmailAddressData == null) {
            internetEmailAddressData = new ArrayList<InternetEmailAddressDataType>();
        }
        return this.internetEmailAddressData;
    }

    /**
     * Gets the value of the phoneNumberData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoneNumberData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoneNumberData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneNumberDataType }
     * 
     * 
     */
    public List<PhoneNumberDataType> getPhoneNumberData() {
        if (phoneNumberData == null) {
            phoneNumberData = new ArrayList<PhoneNumberDataType>();
        }
        return this.phoneNumberData;
    }

    /**
     * Gets the value of the addressData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressDataType }
     * 
     * 
     */
    public List<AddressDataType> getAddressData() {
        if (addressData == null) {
            addressData = new ArrayList<AddressDataType>();
        }
        return this.addressData;
    }

    /**
     * Gets the value of the webAddressData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the webAddressData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWebAddressData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WebAddressDataType }
     * 
     * 
     */
    public List<WebAddressDataType> getWebAddressData() {
        if (webAddressData == null) {
            webAddressData = new ArrayList<WebAddressDataType>();
        }
        return this.webAddressData;
    }

    /**
     * Gets the value of the instantMessengerData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instantMessengerData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstantMessengerData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstantMessengerDataType }
     * 
     * 
     */
    public List<InstantMessengerDataType> getInstantMessengerData() {
        if (instantMessengerData == null) {
            instantMessengerData = new ArrayList<InstantMessengerDataType>();
        }
        return this.instantMessengerData;
    }

}
