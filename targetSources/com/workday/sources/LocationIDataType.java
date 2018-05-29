
package com.workday.sources;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Element containing all Location data.
 * 
 * <p>Java class for Location_iDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Location_iDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Location_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Effective_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Location_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Location_Usage_Reference" type="{urn:com.workday/bsvc}Location_UsageObjectType" maxOccurs="unbounded"/>
 *         &lt;element name="Location_Type_Reference" type="{urn:com.workday/bsvc}Location_TypeObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Location_Attribute_Reference" type="{urn:com.workday/bsvc}Location_AttributeObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Superior_Location_Reference" type="{urn:com.workday/bsvc}LocationObjectType" minOccurs="0"/>
 *         &lt;element name="Inactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Latitude" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="8"/>
 *               &lt;fractionDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Longitude" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="9"/>
 *               &lt;fractionDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Altitude" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="10"/>
 *               &lt;fractionDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Time_Profile_Reference" type="{urn:com.workday/bsvc}Time_ProfileObjectType" minOccurs="0"/>
 *         &lt;element name="Locale_Reference" type="{urn:com.workday/bsvc}LocaleObjectType" minOccurs="0"/>
 *         &lt;element name="Display_Language_Reference" type="{urn:com.workday/bsvc}User_LanguageObjectType" minOccurs="0"/>
 *         &lt;element name="Time_Zone_Reference" type="{urn:com.workday/bsvc}Time_ZoneObjectType" minOccurs="0"/>
 *         &lt;element name="Default_Currency_Reference" type="{urn:com.workday/bsvc}CurrencyObjectType" minOccurs="0"/>
 *         &lt;element name="External_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Default_Job_Posting_Location_Reference" type="{urn:com.workday/bsvc}LocationObjectType" minOccurs="0"/>
 *         &lt;element name="Trade_Name" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Worksite_ID_Code" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="21"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Global_Location_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location_Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Instructional_Site_Data" type="{urn:com.workday/bsvc}Location_Instructional_Site_DataType" minOccurs="0"/>
 *         &lt;element name="Contact_Data" type="{urn:com.workday/bsvc}Contact_Information_DataType" minOccurs="0"/>
 *         &lt;element name="Integration_ID_Data" type="{urn:com.workday/bsvc}External_Integration_ID_DataType" minOccurs="0"/>
 *         &lt;element name="Location_Hierarchy_Reference" type="{urn:com.workday/bsvc}Location_HierarchyObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Integration_Field_Override_Data" type="{urn:com.workday/bsvc}Document_Field_Result_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location_iDataType", propOrder = {
    "locationID",
    "effectiveDate",
    "locationName",
    "locationUsageReference",
    "locationTypeReference",
    "locationAttributeReference",
    "superiorLocationReference",
    "inactive",
    "latitude",
    "longitude",
    "altitude",
    "timeProfileReference",
    "localeReference",
    "displayLanguageReference",
    "timeZoneReference",
    "defaultCurrencyReference",
    "externalName",
    "defaultJobPostingLocationReference",
    "tradeName",
    "worksiteIDCode",
    "globalLocationNumber",
    "locationIdentifier",
    "instructionalSiteData",
    "contactData",
    "integrationIDData",
    "locationHierarchyReference",
    "integrationFieldOverrideData"
})
public class LocationIDataType {

    @XmlElement(name = "Location_ID")
    protected String locationID;
    @XmlElement(name = "Effective_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "Location_Name", required = true)
    protected String locationName;
    @XmlElement(name = "Location_Usage_Reference", required = true)
    protected List<LocationUsageObjectType> locationUsageReference;
    @XmlElement(name = "Location_Type_Reference")
    protected List<LocationTypeObjectType> locationTypeReference;
    @XmlElement(name = "Location_Attribute_Reference")
    protected List<LocationAttributeObjectType> locationAttributeReference;
    @XmlElement(name = "Superior_Location_Reference")
    protected LocationObjectType superiorLocationReference;
    @XmlElement(name = "Inactive")
    protected Boolean inactive;
    @XmlElement(name = "Latitude")
    protected BigDecimal latitude;
    @XmlElement(name = "Longitude")
    protected BigDecimal longitude;
    @XmlElement(name = "Altitude")
    protected BigDecimal altitude;
    @XmlElement(name = "Time_Profile_Reference")
    protected TimeProfileObjectType timeProfileReference;
    @XmlElement(name = "Locale_Reference")
    protected LocaleObjectType localeReference;
    @XmlElement(name = "Display_Language_Reference")
    protected UserLanguageObjectType displayLanguageReference;
    @XmlElement(name = "Time_Zone_Reference")
    protected TimeZoneObjectType timeZoneReference;
    @XmlElement(name = "Default_Currency_Reference")
    protected CurrencyObjectType defaultCurrencyReference;
    @XmlElement(name = "External_Name")
    protected String externalName;
    @XmlElement(name = "Default_Job_Posting_Location_Reference")
    protected LocationObjectType defaultJobPostingLocationReference;
    @XmlElement(name = "Trade_Name")
    protected String tradeName;
    @XmlElement(name = "Worksite_ID_Code")
    protected String worksiteIDCode;
    @XmlElement(name = "Global_Location_Number")
    protected String globalLocationNumber;
    @XmlElement(name = "Location_Identifier")
    protected String locationIdentifier;
    @XmlElement(name = "Instructional_Site_Data")
    protected LocationInstructionalSiteDataType instructionalSiteData;
    @XmlElement(name = "Contact_Data")
    protected ContactInformationDataType contactData;
    @XmlElement(name = "Integration_ID_Data")
    protected ExternalIntegrationIDDataType integrationIDData;
    @XmlElement(name = "Location_Hierarchy_Reference")
    protected List<LocationHierarchyObjectType> locationHierarchyReference;
    @XmlElement(name = "Integration_Field_Override_Data")
    protected List<DocumentFieldResultDataType> integrationFieldOverrideData;

    /**
     * Gets the value of the locationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationID() {
        return locationID;
    }

    /**
     * Sets the value of the locationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationID(String value) {
        this.locationID = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationName(String value) {
        this.locationName = value;
    }

    /**
     * Gets the value of the locationUsageReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationUsageReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationUsageReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationUsageObjectType }
     * 
     * 
     */
    public List<LocationUsageObjectType> getLocationUsageReference() {
        if (locationUsageReference == null) {
            locationUsageReference = new ArrayList<LocationUsageObjectType>();
        }
        return this.locationUsageReference;
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
     * Gets the value of the locationAttributeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationAttributeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationAttributeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationAttributeObjectType }
     * 
     * 
     */
    public List<LocationAttributeObjectType> getLocationAttributeReference() {
        if (locationAttributeReference == null) {
            locationAttributeReference = new ArrayList<LocationAttributeObjectType>();
        }
        return this.locationAttributeReference;
    }

    /**
     * Gets the value of the superiorLocationReference property.
     * 
     * @return
     *     possible object is
     *     {@link LocationObjectType }
     *     
     */
    public LocationObjectType getSuperiorLocationReference() {
        return superiorLocationReference;
    }

    /**
     * Sets the value of the superiorLocationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationObjectType }
     *     
     */
    public void setSuperiorLocationReference(LocationObjectType value) {
        this.superiorLocationReference = value;
    }

    /**
     * Gets the value of the inactive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInactive() {
        return inactive;
    }

    /**
     * Sets the value of the inactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInactive(Boolean value) {
        this.inactive = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLatitude(BigDecimal value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLongitude(BigDecimal value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the altitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAltitude() {
        return altitude;
    }

    /**
     * Sets the value of the altitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAltitude(BigDecimal value) {
        this.altitude = value;
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
     * Gets the value of the defaultCurrencyReference property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyObjectType }
     *     
     */
    public CurrencyObjectType getDefaultCurrencyReference() {
        return defaultCurrencyReference;
    }

    /**
     * Sets the value of the defaultCurrencyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyObjectType }
     *     
     */
    public void setDefaultCurrencyReference(CurrencyObjectType value) {
        this.defaultCurrencyReference = value;
    }

    /**
     * Gets the value of the externalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalName() {
        return externalName;
    }

    /**
     * Sets the value of the externalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalName(String value) {
        this.externalName = value;
    }

    /**
     * Gets the value of the defaultJobPostingLocationReference property.
     * 
     * @return
     *     possible object is
     *     {@link LocationObjectType }
     *     
     */
    public LocationObjectType getDefaultJobPostingLocationReference() {
        return defaultJobPostingLocationReference;
    }

    /**
     * Sets the value of the defaultJobPostingLocationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationObjectType }
     *     
     */
    public void setDefaultJobPostingLocationReference(LocationObjectType value) {
        this.defaultJobPostingLocationReference = value;
    }

    /**
     * Gets the value of the tradeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeName() {
        return tradeName;
    }

    /**
     * Sets the value of the tradeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeName(String value) {
        this.tradeName = value;
    }

    /**
     * Gets the value of the worksiteIDCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorksiteIDCode() {
        return worksiteIDCode;
    }

    /**
     * Sets the value of the worksiteIDCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorksiteIDCode(String value) {
        this.worksiteIDCode = value;
    }

    /**
     * Gets the value of the globalLocationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalLocationNumber() {
        return globalLocationNumber;
    }

    /**
     * Sets the value of the globalLocationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalLocationNumber(String value) {
        this.globalLocationNumber = value;
    }

    /**
     * Gets the value of the locationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationIdentifier() {
        return locationIdentifier;
    }

    /**
     * Sets the value of the locationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationIdentifier(String value) {
        this.locationIdentifier = value;
    }

    /**
     * Gets the value of the instructionalSiteData property.
     * 
     * @return
     *     possible object is
     *     {@link LocationInstructionalSiteDataType }
     *     
     */
    public LocationInstructionalSiteDataType getInstructionalSiteData() {
        return instructionalSiteData;
    }

    /**
     * Sets the value of the instructionalSiteData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationInstructionalSiteDataType }
     *     
     */
    public void setInstructionalSiteData(LocationInstructionalSiteDataType value) {
        this.instructionalSiteData = value;
    }

    /**
     * Gets the value of the contactData property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformationDataType }
     *     
     */
    public ContactInformationDataType getContactData() {
        return contactData;
    }

    /**
     * Sets the value of the contactData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformationDataType }
     *     
     */
    public void setContactData(ContactInformationDataType value) {
        this.contactData = value;
    }

    /**
     * Gets the value of the integrationIDData property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalIntegrationIDDataType }
     *     
     */
    public ExternalIntegrationIDDataType getIntegrationIDData() {
        return integrationIDData;
    }

    /**
     * Sets the value of the integrationIDData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalIntegrationIDDataType }
     *     
     */
    public void setIntegrationIDData(ExternalIntegrationIDDataType value) {
        this.integrationIDData = value;
    }

    /**
     * Gets the value of the locationHierarchyReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationHierarchyReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationHierarchyReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationHierarchyObjectType }
     * 
     * 
     */
    public List<LocationHierarchyObjectType> getLocationHierarchyReference() {
        if (locationHierarchyReference == null) {
            locationHierarchyReference = new ArrayList<LocationHierarchyObjectType>();
        }
        return this.locationHierarchyReference;
    }

    /**
     * Gets the value of the integrationFieldOverrideData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the integrationFieldOverrideData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntegrationFieldOverrideData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentFieldResultDataType }
     * 
     * 
     */
    public List<DocumentFieldResultDataType> getIntegrationFieldOverrideData() {
        if (integrationFieldOverrideData == null) {
            integrationFieldOverrideData = new ArrayList<DocumentFieldResultDataType>();
        }
        return this.integrationFieldOverrideData;
    }

}
