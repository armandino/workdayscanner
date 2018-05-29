
package com.workday.sources;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Address information
 * 
 * <p>Java class for Address_Information_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Address_Information_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Country_Reference" type="{urn:com.workday/bsvc}CountryObjectType" minOccurs="0"/>
 *         &lt;element name="Last_Modified" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Address_Line_Data" type="{urn:com.workday/bsvc}Address_Line_Information_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Municipality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country_City_Reference" type="{urn:com.workday/bsvc}Country_CityObjectType" minOccurs="0"/>
 *         &lt;element name="Submunicipality_Data" type="{urn:com.workday/bsvc}Submunicipality_Information_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Country_Region_Reference" type="{urn:com.workday/bsvc}Country_RegionObjectType" minOccurs="0"/>
 *         &lt;element name="Country_Region_Descriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Subregion_Data" type="{urn:com.workday/bsvc}Subregion_Information_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Postal_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Usage_Data" type="{urn:com.workday/bsvc}Communication_Method_Usage_Information_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Number_of_Days" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="1"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Municipality_Local" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address_Reference" type="{urn:com.workday/bsvc}Address_ReferenceObjectType" minOccurs="0"/>
 *         &lt;element name="Address_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Formatted_Address" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Address_Format_Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Defaulted_Business_Site_Address" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Delete" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Do_Not_Replace_All" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Effective_Date" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address_Information_DataType", propOrder = {
    "countryReference",
    "lastModified",
    "addressLineData",
    "municipality",
    "countryCityReference",
    "submunicipalityData",
    "countryRegionReference",
    "countryRegionDescriptor",
    "subregionData",
    "postalCode",
    "usageData",
    "numberOfDays",
    "municipalityLocal",
    "addressReference",
    "addressID"
})
public class AddressInformationDataType {

    @XmlElement(name = "Country_Reference")
    protected CountryObjectType countryReference;
    @XmlElement(name = "Last_Modified")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModified;
    @XmlElement(name = "Address_Line_Data")
    protected List<AddressLineInformationDataType> addressLineData;
    @XmlElement(name = "Municipality")
    protected String municipality;
    @XmlElement(name = "Country_City_Reference")
    protected CountryCityObjectType countryCityReference;
    @XmlElement(name = "Submunicipality_Data")
    protected List<SubmunicipalityInformationDataType> submunicipalityData;
    @XmlElement(name = "Country_Region_Reference")
    protected CountryRegionObjectType countryRegionReference;
    @XmlElement(name = "Country_Region_Descriptor")
    protected String countryRegionDescriptor;
    @XmlElement(name = "Subregion_Data")
    protected List<SubregionInformationDataType> subregionData;
    @XmlElement(name = "Postal_Code")
    protected String postalCode;
    @XmlElement(name = "Usage_Data")
    protected List<CommunicationMethodUsageInformationDataType> usageData;
    @XmlElement(name = "Number_of_Days")
    protected BigDecimal numberOfDays;
    @XmlElement(name = "Municipality_Local")
    protected String municipalityLocal;
    @XmlElement(name = "Address_Reference")
    protected AddressReferenceObjectType addressReference;
    @XmlElement(name = "Address_ID")
    protected String addressID;
    @XmlAttribute(name = "Formatted_Address", namespace = "urn:com.workday/bsvc")
    protected String formattedAddress;
    @XmlAttribute(name = "Address_Format_Type", namespace = "urn:com.workday/bsvc")
    protected String addressFormatType;
    @XmlAttribute(name = "Defaulted_Business_Site_Address", namespace = "urn:com.workday/bsvc")
    protected Boolean defaultedBusinessSiteAddress;
    @XmlAttribute(name = "Delete", namespace = "urn:com.workday/bsvc")
    protected Boolean delete;
    @XmlAttribute(name = "Do_Not_Replace_All", namespace = "urn:com.workday/bsvc")
    protected Boolean doNotReplaceAll;
    @XmlAttribute(name = "Effective_Date", namespace = "urn:com.workday/bsvc")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;

    /**
     * Gets the value of the countryReference property.
     * 
     * @return
     *     possible object is
     *     {@link CountryObjectType }
     *     
     */
    public CountryObjectType getCountryReference() {
        return countryReference;
    }

    /**
     * Sets the value of the countryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryObjectType }
     *     
     */
    public void setCountryReference(CountryObjectType value) {
        this.countryReference = value;
    }

    /**
     * Gets the value of the lastModified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModified() {
        return lastModified;
    }

    /**
     * Sets the value of the lastModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModified(XMLGregorianCalendar value) {
        this.lastModified = value;
    }

    /**
     * Gets the value of the addressLineData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressLineData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressLineData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressLineInformationDataType }
     * 
     * 
     */
    public List<AddressLineInformationDataType> getAddressLineData() {
        if (addressLineData == null) {
            addressLineData = new ArrayList<AddressLineInformationDataType>();
        }
        return this.addressLineData;
    }

    /**
     * Gets the value of the municipality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipality() {
        return municipality;
    }

    /**
     * Sets the value of the municipality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipality(String value) {
        this.municipality = value;
    }

    /**
     * Gets the value of the countryCityReference property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCityObjectType }
     *     
     */
    public CountryCityObjectType getCountryCityReference() {
        return countryCityReference;
    }

    /**
     * Sets the value of the countryCityReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCityObjectType }
     *     
     */
    public void setCountryCityReference(CountryCityObjectType value) {
        this.countryCityReference = value;
    }

    /**
     * Gets the value of the submunicipalityData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the submunicipalityData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubmunicipalityData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubmunicipalityInformationDataType }
     * 
     * 
     */
    public List<SubmunicipalityInformationDataType> getSubmunicipalityData() {
        if (submunicipalityData == null) {
            submunicipalityData = new ArrayList<SubmunicipalityInformationDataType>();
        }
        return this.submunicipalityData;
    }

    /**
     * Gets the value of the countryRegionReference property.
     * 
     * @return
     *     possible object is
     *     {@link CountryRegionObjectType }
     *     
     */
    public CountryRegionObjectType getCountryRegionReference() {
        return countryRegionReference;
    }

    /**
     * Sets the value of the countryRegionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryRegionObjectType }
     *     
     */
    public void setCountryRegionReference(CountryRegionObjectType value) {
        this.countryRegionReference = value;
    }

    /**
     * Gets the value of the countryRegionDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryRegionDescriptor() {
        return countryRegionDescriptor;
    }

    /**
     * Sets the value of the countryRegionDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryRegionDescriptor(String value) {
        this.countryRegionDescriptor = value;
    }

    /**
     * Gets the value of the subregionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subregionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubregionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubregionInformationDataType }
     * 
     * 
     */
    public List<SubregionInformationDataType> getSubregionData() {
        if (subregionData == null) {
            subregionData = new ArrayList<SubregionInformationDataType>();
        }
        return this.subregionData;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
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
     * Gets the value of the numberOfDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumberOfDays() {
        return numberOfDays;
    }

    /**
     * Sets the value of the numberOfDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumberOfDays(BigDecimal value) {
        this.numberOfDays = value;
    }

    /**
     * Gets the value of the municipalityLocal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipalityLocal() {
        return municipalityLocal;
    }

    /**
     * Sets the value of the municipalityLocal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipalityLocal(String value) {
        this.municipalityLocal = value;
    }

    /**
     * Gets the value of the addressReference property.
     * 
     * @return
     *     possible object is
     *     {@link AddressReferenceObjectType }
     *     
     */
    public AddressReferenceObjectType getAddressReference() {
        return addressReference;
    }

    /**
     * Sets the value of the addressReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressReferenceObjectType }
     *     
     */
    public void setAddressReference(AddressReferenceObjectType value) {
        this.addressReference = value;
    }

    /**
     * Gets the value of the addressID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressID() {
        return addressID;
    }

    /**
     * Sets the value of the addressID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressID(String value) {
        this.addressID = value;
    }

    /**
     * Gets the value of the formattedAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedAddress() {
        return formattedAddress;
    }

    /**
     * Sets the value of the formattedAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedAddress(String value) {
        this.formattedAddress = value;
    }

    /**
     * Gets the value of the addressFormatType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressFormatType() {
        return addressFormatType;
    }

    /**
     * Sets the value of the addressFormatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressFormatType(String value) {
        this.addressFormatType = value;
    }

    /**
     * Gets the value of the defaultedBusinessSiteAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultedBusinessSiteAddress() {
        return defaultedBusinessSiteAddress;
    }

    /**
     * Sets the value of the defaultedBusinessSiteAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultedBusinessSiteAddress(Boolean value) {
        this.defaultedBusinessSiteAddress = value;
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

}
