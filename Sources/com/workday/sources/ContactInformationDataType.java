
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * All of the person's contact data (address, phone, email, instant messenger, web address).
 * 
 * <p>Java class for Contact_Information_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contact_Information_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address_Data" type="{urn:com.workday/bsvc}Address_Information_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Phone_Data" type="{urn:com.workday/bsvc}Phone_Information_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Email_Address_Data" type="{urn:com.workday/bsvc}Email_Address_Information_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Instant_Messenger_Data" type="{urn:com.workday/bsvc}Instant_Messenger_Information_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Web_Address_Data" type="{urn:com.workday/bsvc}Web_address_Information_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact_Information_DataType", propOrder = {
    "addressData",
    "phoneData",
    "emailAddressData",
    "instantMessengerData",
    "webAddressData"
})
public class ContactInformationDataType {

    @XmlElement(name = "Address_Data")
    protected List<AddressInformationDataType> addressData;
    @XmlElement(name = "Phone_Data")
    protected List<PhoneInformationDataType> phoneData;
    @XmlElement(name = "Email_Address_Data")
    protected List<EmailAddressInformationDataType> emailAddressData;
    @XmlElement(name = "Instant_Messenger_Data")
    protected List<InstantMessengerInformationDataType> instantMessengerData;
    @XmlElement(name = "Web_Address_Data")
    protected List<WebAddressInformationDataType> webAddressData;

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
     * {@link AddressInformationDataType }
     * 
     * 
     */
    public List<AddressInformationDataType> getAddressData() {
        if (addressData == null) {
            addressData = new ArrayList<AddressInformationDataType>();
        }
        return this.addressData;
    }

    /**
     * Gets the value of the phoneData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoneData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoneData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneInformationDataType }
     * 
     * 
     */
    public List<PhoneInformationDataType> getPhoneData() {
        if (phoneData == null) {
            phoneData = new ArrayList<PhoneInformationDataType>();
        }
        return this.phoneData;
    }

    /**
     * Gets the value of the emailAddressData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailAddressData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailAddressData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailAddressInformationDataType }
     * 
     * 
     */
    public List<EmailAddressInformationDataType> getEmailAddressData() {
        if (emailAddressData == null) {
            emailAddressData = new ArrayList<EmailAddressInformationDataType>();
        }
        return this.emailAddressData;
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
     * {@link InstantMessengerInformationDataType }
     * 
     * 
     */
    public List<InstantMessengerInformationDataType> getInstantMessengerData() {
        if (instantMessengerData == null) {
            instantMessengerData = new ArrayList<InstantMessengerInformationDataType>();
        }
        return this.instantMessengerData;
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
     * {@link WebAddressInformationDataType }
     * 
     * 
     */
    public List<WebAddressInformationDataType> getWebAddressData() {
        if (webAddressData == null) {
            webAddressData = new ArrayList<WebAddressInformationDataType>();
        }
        return this.webAddressData;
    }

}
