
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * All of the personal data. This includes name, contact information (Email, Phone, Address, Web, Instant Messenger), Visa and ID information, Biographic, Demographic, and Background Check Information.
 * 
 * <p>Java class for Person_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Person_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name_Data" type="{urn:com.workday/bsvc}Name_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Contact_Data" type="{urn:com.workday/bsvc}Contact_DataType" minOccurs="0"/>
 *         &lt;element name="Demographic_Data" type="{urn:com.workday/bsvc}Demographic_DataType" minOccurs="0"/>
 *         &lt;element name="Biographic_Data" type="{urn:com.workday/bsvc}Biographic_DataType" minOccurs="0"/>
 *         &lt;element name="Visa_ID_Data" type="{urn:com.workday/bsvc}Visa_Identifier_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Custom_ID_Data" type="{urn:com.workday/bsvc}Custom_Identifier_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Government_ID_Data" type="{urn:com.workday/bsvc}Government_Identifier_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="License_ID_Data" type="{urn:com.workday/bsvc}License_Identifier_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Passport_ID_Data" type="{urn:com.workday/bsvc}Passport_Identifier_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Personal_Preferences_Data" type="{urn:com.workday/bsvc}Personal_Preferences_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person_DataType", propOrder = {
    "nameData",
    "contactData",
    "demographicData",
    "biographicData",
    "visaIDData",
    "customIDData",
    "governmentIDData",
    "licenseIDData",
    "passportIDData",
    "personalPreferencesData"
})
public class PersonDataType {

    @XmlElement(name = "Name_Data")
    protected List<NameDataType> nameData;
    @XmlElement(name = "Contact_Data")
    protected ContactDataType contactData;
    @XmlElement(name = "Demographic_Data")
    protected DemographicDataType demographicData;
    @XmlElement(name = "Biographic_Data")
    protected BiographicDataType biographicData;
    @XmlElement(name = "Visa_ID_Data")
    protected List<VisaIdentifierDataType> visaIDData;
    @XmlElement(name = "Custom_ID_Data")
    protected List<CustomIdentifierDataType> customIDData;
    @XmlElement(name = "Government_ID_Data")
    protected List<GovernmentIdentifierDataType> governmentIDData;
    @XmlElement(name = "License_ID_Data")
    protected List<LicenseIdentifierDataType> licenseIDData;
    @XmlElement(name = "Passport_ID_Data")
    protected List<PassportIdentifierDataType> passportIDData;
    @XmlElement(name = "Personal_Preferences_Data")
    protected PersonalPreferencesDataType personalPreferencesData;

    /**
     * Gets the value of the nameData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameDataType }
     * 
     * 
     */
    public List<NameDataType> getNameData() {
        if (nameData == null) {
            nameData = new ArrayList<NameDataType>();
        }
        return this.nameData;
    }

    /**
     * Gets the value of the contactData property.
     * 
     * @return
     *     possible object is
     *     {@link ContactDataType }
     *     
     */
    public ContactDataType getContactData() {
        return contactData;
    }

    /**
     * Sets the value of the contactData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDataType }
     *     
     */
    public void setContactData(ContactDataType value) {
        this.contactData = value;
    }

    /**
     * Gets the value of the demographicData property.
     * 
     * @return
     *     possible object is
     *     {@link DemographicDataType }
     *     
     */
    public DemographicDataType getDemographicData() {
        return demographicData;
    }

    /**
     * Sets the value of the demographicData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DemographicDataType }
     *     
     */
    public void setDemographicData(DemographicDataType value) {
        this.demographicData = value;
    }

    /**
     * Gets the value of the biographicData property.
     * 
     * @return
     *     possible object is
     *     {@link BiographicDataType }
     *     
     */
    public BiographicDataType getBiographicData() {
        return biographicData;
    }

    /**
     * Sets the value of the biographicData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiographicDataType }
     *     
     */
    public void setBiographicData(BiographicDataType value) {
        this.biographicData = value;
    }

    /**
     * Gets the value of the visaIDData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the visaIDData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVisaIDData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VisaIdentifierDataType }
     * 
     * 
     */
    public List<VisaIdentifierDataType> getVisaIDData() {
        if (visaIDData == null) {
            visaIDData = new ArrayList<VisaIdentifierDataType>();
        }
        return this.visaIDData;
    }

    /**
     * Gets the value of the customIDData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customIDData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomIDData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomIdentifierDataType }
     * 
     * 
     */
    public List<CustomIdentifierDataType> getCustomIDData() {
        if (customIDData == null) {
            customIDData = new ArrayList<CustomIdentifierDataType>();
        }
        return this.customIDData;
    }

    /**
     * Gets the value of the governmentIDData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the governmentIDData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGovernmentIDData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GovernmentIdentifierDataType }
     * 
     * 
     */
    public List<GovernmentIdentifierDataType> getGovernmentIDData() {
        if (governmentIDData == null) {
            governmentIDData = new ArrayList<GovernmentIdentifierDataType>();
        }
        return this.governmentIDData;
    }

    /**
     * Gets the value of the licenseIDData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the licenseIDData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLicenseIDData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LicenseIdentifierDataType }
     * 
     * 
     */
    public List<LicenseIdentifierDataType> getLicenseIDData() {
        if (licenseIDData == null) {
            licenseIDData = new ArrayList<LicenseIdentifierDataType>();
        }
        return this.licenseIDData;
    }

    /**
     * Gets the value of the passportIDData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passportIDData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassportIDData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassportIdentifierDataType }
     * 
     * 
     */
    public List<PassportIdentifierDataType> getPassportIDData() {
        if (passportIDData == null) {
            passportIDData = new ArrayList<PassportIdentifierDataType>();
        }
        return this.passportIDData;
    }

    /**
     * Gets the value of the personalPreferencesData property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalPreferencesDataType }
     *     
     */
    public PersonalPreferencesDataType getPersonalPreferencesData() {
        return personalPreferencesData;
    }

    /**
     * Sets the value of the personalPreferencesData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalPreferencesDataType }
     *     
     */
    public void setPersonalPreferencesData(PersonalPreferencesDataType value) {
        this.personalPreferencesData = value;
    }

}
