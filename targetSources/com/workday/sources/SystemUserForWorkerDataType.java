
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the worker's user account information (user name, preferred language).
 * 
 * <p>Java class for System_User_for_Worker_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="System_User_for_Worker_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="User_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="User_Language__Reference" type="{urn:com.workday/bsvc}User_LanguageObjectType" minOccurs="0"/>
 *         &lt;element name="Locale__Reference" type="{urn:com.workday/bsvc}LocaleObjectType" minOccurs="0"/>
 *         &lt;element name="Currency_Reference" type="{urn:com.workday/bsvc}CurrencyObjectType" minOccurs="0"/>
 *         &lt;element name="Time_Zone_Reference" type="{urn:com.workday/bsvc}Time_ZoneObjectType" minOccurs="0"/>
 *         &lt;element name="Default_Display_Language_Reference" type="{urn:com.workday/bsvc}User_LanguageObjectType" minOccurs="0"/>
 *         &lt;element name="Simplified_View" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "System_User_for_Worker_DataType", propOrder = {
    "userName",
    "userLanguageReference",
    "localeReference",
    "currencyReference",
    "timeZoneReference",
    "defaultDisplayLanguageReference",
    "simplifiedView"
})
public class SystemUserForWorkerDataType {

    @XmlElement(name = "User_Name", required = true)
    protected String userName;
    @XmlElement(name = "User_Language__Reference")
    protected UserLanguageObjectType userLanguageReference;
    @XmlElement(name = "Locale__Reference")
    protected LocaleObjectType localeReference;
    @XmlElement(name = "Currency_Reference")
    protected CurrencyObjectType currencyReference;
    @XmlElement(name = "Time_Zone_Reference")
    protected TimeZoneObjectType timeZoneReference;
    @XmlElement(name = "Default_Display_Language_Reference")
    protected UserLanguageObjectType defaultDisplayLanguageReference;
    @XmlElement(name = "Simplified_View")
    protected Boolean simplifiedView;

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the userLanguageReference property.
     * 
     * @return
     *     possible object is
     *     {@link UserLanguageObjectType }
     *     
     */
    public UserLanguageObjectType getUserLanguageReference() {
        return userLanguageReference;
    }

    /**
     * Sets the value of the userLanguageReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserLanguageObjectType }
     *     
     */
    public void setUserLanguageReference(UserLanguageObjectType value) {
        this.userLanguageReference = value;
    }

    /**
     * Gets the value of the localeReference property.
     * 
     * @return
     *     possible object is
     *     {@link LocaleObjectType }
     *     
     */
    public LocaleObjectType getLocaleReference() {
        return localeReference;
    }

    /**
     * Sets the value of the localeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocaleObjectType }
     *     
     */
    public void setLocaleReference(LocaleObjectType value) {
        this.localeReference = value;
    }

    /**
     * Gets the value of the currencyReference property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyObjectType }
     *     
     */
    public CurrencyObjectType getCurrencyReference() {
        return currencyReference;
    }

    /**
     * Sets the value of the currencyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyObjectType }
     *     
     */
    public void setCurrencyReference(CurrencyObjectType value) {
        this.currencyReference = value;
    }

    /**
     * Gets the value of the timeZoneReference property.
     * 
     * @return
     *     possible object is
     *     {@link TimeZoneObjectType }
     *     
     */
    public TimeZoneObjectType getTimeZoneReference() {
        return timeZoneReference;
    }

    /**
     * Sets the value of the timeZoneReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeZoneObjectType }
     *     
     */
    public void setTimeZoneReference(TimeZoneObjectType value) {
        this.timeZoneReference = value;
    }

    /**
     * Gets the value of the defaultDisplayLanguageReference property.
     * 
     * @return
     *     possible object is
     *     {@link UserLanguageObjectType }
     *     
     */
    public UserLanguageObjectType getDefaultDisplayLanguageReference() {
        return defaultDisplayLanguageReference;
    }

    /**
     * Sets the value of the defaultDisplayLanguageReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserLanguageObjectType }
     *     
     */
    public void setDefaultDisplayLanguageReference(UserLanguageObjectType value) {
        this.defaultDisplayLanguageReference = value;
    }

    /**
     * Gets the value of the simplifiedView property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSimplifiedView() {
        return simplifiedView;
    }

    /**
     * Sets the value of the simplifiedView property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSimplifiedView(Boolean value) {
        this.simplifiedView = value;
    }

}
