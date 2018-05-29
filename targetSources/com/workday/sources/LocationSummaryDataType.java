
package com.workday.sources;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing a brief summary of Location data.
 * 
 * <p>Java class for Location_Summary_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Location_Summary_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Location_Reference" type="{urn:com.workday/bsvc}LocationObjectType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location_Type_Reference" type="{urn:com.workday/bsvc}Location_TypeObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Local_Reference" type="{urn:com.workday/bsvc}LocaleObjectType" minOccurs="0"/>
 *         &lt;element name="Display_Language_Reference" type="{urn:com.workday/bsvc}User_LanguageObjectType" minOccurs="0"/>
 *         &lt;element name="Time_Profile_Reference" type="{urn:com.workday/bsvc}Time_ProfileObjectType" minOccurs="0"/>
 *         &lt;element name="Scheduled_Weekly_Hours" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="14"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Address_Data" type="{urn:com.workday/bsvc}Address_Information_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location_Summary_DataType", propOrder = {
    "locationReference",
    "name",
    "locationTypeReference",
    "localReference",
    "displayLanguageReference",
    "timeProfileReference",
    "scheduledWeeklyHours",
    "addressData"
})
public class LocationSummaryDataType {

    @XmlElement(name = "Location_Reference")
    protected LocationObjectType locationReference;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Location_Type_Reference")
    protected List<LocationTypeObjectType> locationTypeReference;
    @XmlElement(name = "Local_Reference")
    protected LocaleObjectType localReference;
    @XmlElement(name = "Display_Language_Reference")
    protected UserLanguageObjectType displayLanguageReference;
    @XmlElement(name = "Time_Profile_Reference")
    protected TimeProfileObjectType timeProfileReference;
    @XmlElement(name = "Scheduled_Weekly_Hours")
    protected BigDecimal scheduledWeeklyHours;
    @XmlElement(name = "Address_Data")
    protected List<AddressInformationDataType> addressData;

    /**
     * Gets the value of the locationReference property.
     * 
     * @return
     *     possible object is
     *     {@link LocationObjectType }
     *     
     */
    public LocationObjectType getLocationReference() {
        return locationReference;
    }

    /**
     * Sets the value of the locationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationObjectType }
     *     
     */
    public void setLocationReference(LocationObjectType value) {
        this.locationReference = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the locationTypeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationTypeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationTypeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationTypeObjectType }
     * 
     * 
     */
    public List<LocationTypeObjectType> getLocationTypeReference() {
        if (locationTypeReference == null) {
            locationTypeReference = new ArrayList<LocationTypeObjectType>();
        }
        return this.locationTypeReference;
    }

    /**
     * Gets the value of the localReference property.
     * 
     * @return
     *     possible object is
     *     {@link LocaleObjectType }
     *     
     */
    public LocaleObjectType getLocalReference() {
        return localReference;
    }

    /**
     * Sets the value of the localReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocaleObjectType }
     *     
     */
    public void setLocalReference(LocaleObjectType value) {
        this.localReference = value;
    }

    /**
     * Gets the value of the displayLanguageReference property.
     * 
     * @return
     *     possible object is
     *     {@link UserLanguageObjectType }
     *     
     */
    public UserLanguageObjectType getDisplayLanguageReference() {
        return displayLanguageReference;
    }

    /**
     * Sets the value of the displayLanguageReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserLanguageObjectType }
     *     
     */
    public void setDisplayLanguageReference(UserLanguageObjectType value) {
        this.displayLanguageReference = value;
    }

    /**
     * Gets the value of the timeProfileReference property.
     * 
     * @return
     *     possible object is
     *     {@link TimeProfileObjectType }
     *     
     */
    public TimeProfileObjectType getTimeProfileReference() {
        return timeProfileReference;
    }

    /**
     * Sets the value of the timeProfileReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeProfileObjectType }
     *     
     */
    public void setTimeProfileReference(TimeProfileObjectType value) {
        this.timeProfileReference = value;
    }

    /**
     * Gets the value of the scheduledWeeklyHours property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScheduledWeeklyHours() {
        return scheduledWeeklyHours;
    }

    /**
     * Sets the value of the scheduledWeeklyHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScheduledWeeklyHours(BigDecimal value) {
        this.scheduledWeeklyHours = value;
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

}
