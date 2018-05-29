
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element encapsulating the core address information.
 * 
 * <p>Java class for Address_Core_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Address_Core_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Country_Reference" type="{urn:com.workday/bsvc}CountryObjectType" minOccurs="0"/>
 *         &lt;element name="Country_Region_Reference" type="{urn:com.workday/bsvc}Country_RegionObjectType" minOccurs="0"/>
 *         &lt;element name="Country_Region_Descriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address_Line_Data" type="{urn:com.workday/bsvc}Address_Line_Information_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Subregion_Data" type="{urn:com.workday/bsvc}Subregion_Information_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Submunicipality_Data" type="{urn:com.workday/bsvc}Submunicipality_Information_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Postal_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Municipality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Municipality_Local" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country_City_Reference" type="{urn:com.workday/bsvc}Country_CityObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Formatted_Address" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Default_Address" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address_Core_DataType", propOrder = {
    "countryReference",
    "countryRegionReference",
    "countryRegionDescriptor",
    "addressLineData",
    "subregionData",
    "submunicipalityData",
    "postalCode",
    "municipality",
    "municipalityLocal",
    "countryCityReference"
})
public class AddressCoreDataType {

    @XmlElement(name = "Country_Reference")
    protected CountryObjectType countryReference;
    @XmlElement(name = "Country_Region_Reference")
    protected CountryRegionObjectType countryRegionReference;
    @XmlElement(name = "Country_Region_Descriptor")
    protected String countryRegionDescriptor;
    @XmlElement(name = "Address_Line_Data")
    protected List<AddressLineInformationDataType> addressLineData;
    @XmlElement(name = "Subregion_Data")
    protected List<SubregionInformationDataType> subregionData;
    @XmlElement(name = "Submunicipality_Data")
    protected List<SubmunicipalityInformationDataType> submunicipalityData;
    @XmlElement(name = "Postal_Code")
    protected String postalCode;
    @XmlElement(name = "Municipality")
    protected String municipality;
    @XmlElement(name = "Municipality_Local")
    protected String municipalityLocal;
    @XmlElement(name = "Country_City_Reference")
    protected CountryCityObjectType countryCityReference;
    @XmlAttribute(name = "Formatted_Address", namespace = "urn:com.workday/bsvc")
    protected String formattedAddress;
    @XmlAttribute(name = "Default_Address", namespace = "urn:com.workday/bsvc")
    protected Boolean defaultAddress;

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
     * Gets the value of the defaultAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultAddress() {
        return defaultAddress;
    }

    /**
     * Sets the value of the defaultAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultAddress(Boolean value) {
        this.defaultAddress = value;
    }

}
