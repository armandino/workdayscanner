
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains address information.
 * 
 * <p>Java class for Global_Address_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Global_Address_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address_Line_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address_Line_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address_Line_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address_Line_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address_Line_5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address_Line_6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address_Line_7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address_Line_8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address_Line_9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City_Subdivision_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City_Subdivision_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country_Region_Reference" type="{urn:com.workday/bsvc}Country_RegionObjectType" minOccurs="0"/>
 *         &lt;element name="Region_Subdivision_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Region_Subdivision_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Postal_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country_Reference" type="{urn:com.workday/bsvc}CountryObjectType" minOccurs="0"/>
 *         &lt;element name="Address_Line_1_-_Local" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address_Line_2_-_Local" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address_Line_3_-_Local" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address_Line_4_-_Local" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address_Line_5_-_Local" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address_Line_6_-_Local" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address_Line_7_-_Local" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address_Line_8_-_Local" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address_Line_9_-_Local" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City_-_Local" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City_Subdivision_1_-_Local" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City_Subdivision_2_-_Local" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Region_Subdivision_1_-_Local" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Region_Subdivision_2_-_Local" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Global_Address_DataType", propOrder = {
    "addressLine1",
    "addressLine2",
    "addressLine3",
    "addressLine4",
    "addressLine5",
    "addressLine6",
    "addressLine7",
    "addressLine8",
    "addressLine9",
    "city",
    "citySubdivision1",
    "citySubdivision2",
    "countryRegionReference",
    "regionSubdivision1",
    "regionSubdivision2",
    "postalCode",
    "countryReference",
    "addressLine1Local",
    "addressLine2Local",
    "addressLine3Local",
    "addressLine4Local",
    "addressLine5Local",
    "addressLine6Local",
    "addressLine7Local",
    "addressLine8Local",
    "addressLine9Local",
    "cityLocal",
    "citySubdivision1Local",
    "citySubdivision2Local",
    "regionSubdivision1Local",
    "regionSubdivision2Local"
})
public class GlobalAddressDataType {

    @XmlElement(name = "Address_Line_1")
    protected String addressLine1;
    @XmlElement(name = "Address_Line_2")
    protected String addressLine2;
    @XmlElement(name = "Address_Line_3")
    protected String addressLine3;
    @XmlElement(name = "Address_Line_4")
    protected String addressLine4;
    @XmlElement(name = "Address_Line_5")
    protected String addressLine5;
    @XmlElement(name = "Address_Line_6")
    protected String addressLine6;
    @XmlElement(name = "Address_Line_7")
    protected String addressLine7;
    @XmlElement(name = "Address_Line_8")
    protected String addressLine8;
    @XmlElement(name = "Address_Line_9")
    protected String addressLine9;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "City_Subdivision_1")
    protected String citySubdivision1;
    @XmlElement(name = "City_Subdivision_2")
    protected String citySubdivision2;
    @XmlElement(name = "Country_Region_Reference")
    protected CountryRegionObjectType countryRegionReference;
    @XmlElement(name = "Region_Subdivision_1")
    protected String regionSubdivision1;
    @XmlElement(name = "Region_Subdivision_2")
    protected String regionSubdivision2;
    @XmlElement(name = "Postal_Code")
    protected String postalCode;
    @XmlElement(name = "Country_Reference")
    protected CountryObjectType countryReference;
    @XmlElement(name = "Address_Line_1_-_Local")
    protected String addressLine1Local;
    @XmlElement(name = "Address_Line_2_-_Local")
    protected String addressLine2Local;
    @XmlElement(name = "Address_Line_3_-_Local")
    protected String addressLine3Local;
    @XmlElement(name = "Address_Line_4_-_Local")
    protected String addressLine4Local;
    @XmlElement(name = "Address_Line_5_-_Local")
    protected String addressLine5Local;
    @XmlElement(name = "Address_Line_6_-_Local")
    protected String addressLine6Local;
    @XmlElement(name = "Address_Line_7_-_Local")
    protected String addressLine7Local;
    @XmlElement(name = "Address_Line_8_-_Local")
    protected String addressLine8Local;
    @XmlElement(name = "Address_Line_9_-_Local")
    protected String addressLine9Local;
    @XmlElement(name = "City_-_Local")
    protected String cityLocal;
    @XmlElement(name = "City_Subdivision_1_-_Local")
    protected String citySubdivision1Local;
    @XmlElement(name = "City_Subdivision_2_-_Local")
    protected String citySubdivision2Local;
    @XmlElement(name = "Region_Subdivision_1_-_Local")
    protected String regionSubdivision1Local;
    @XmlElement(name = "Region_Subdivision_2_-_Local")
    protected String regionSubdivision2Local;

    /**
     * Gets the value of the addressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the value of the addressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine1(String value) {
        this.addressLine1 = value;
    }

    /**
     * Gets the value of the addressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Sets the value of the addressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine2(String value) {
        this.addressLine2 = value;
    }

    /**
     * Gets the value of the addressLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine3() {
        return addressLine3;
    }

    /**
     * Sets the value of the addressLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine3(String value) {
        this.addressLine3 = value;
    }

    /**
     * Gets the value of the addressLine4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine4() {
        return addressLine4;
    }

    /**
     * Sets the value of the addressLine4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine4(String value) {
        this.addressLine4 = value;
    }

    /**
     * Gets the value of the addressLine5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine5() {
        return addressLine5;
    }

    /**
     * Sets the value of the addressLine5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine5(String value) {
        this.addressLine5 = value;
    }

    /**
     * Gets the value of the addressLine6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine6() {
        return addressLine6;
    }

    /**
     * Sets the value of the addressLine6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine6(String value) {
        this.addressLine6 = value;
    }

    /**
     * Gets the value of the addressLine7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine7() {
        return addressLine7;
    }

    /**
     * Sets the value of the addressLine7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine7(String value) {
        this.addressLine7 = value;
    }

    /**
     * Gets the value of the addressLine8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine8() {
        return addressLine8;
    }

    /**
     * Sets the value of the addressLine8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine8(String value) {
        this.addressLine8 = value;
    }

    /**
     * Gets the value of the addressLine9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine9() {
        return addressLine9;
    }

    /**
     * Sets the value of the addressLine9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine9(String value) {
        this.addressLine9 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the citySubdivision1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitySubdivision1() {
        return citySubdivision1;
    }

    /**
     * Sets the value of the citySubdivision1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitySubdivision1(String value) {
        this.citySubdivision1 = value;
    }

    /**
     * Gets the value of the citySubdivision2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitySubdivision2() {
        return citySubdivision2;
    }

    /**
     * Sets the value of the citySubdivision2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitySubdivision2(String value) {
        this.citySubdivision2 = value;
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
     * Gets the value of the regionSubdivision1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionSubdivision1() {
        return regionSubdivision1;
    }

    /**
     * Sets the value of the regionSubdivision1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionSubdivision1(String value) {
        this.regionSubdivision1 = value;
    }

    /**
     * Gets the value of the regionSubdivision2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionSubdivision2() {
        return regionSubdivision2;
    }

    /**
     * Sets the value of the regionSubdivision2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionSubdivision2(String value) {
        this.regionSubdivision2 = value;
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
     * Gets the value of the addressLine1Local property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine1Local() {
        return addressLine1Local;
    }

    /**
     * Sets the value of the addressLine1Local property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine1Local(String value) {
        this.addressLine1Local = value;
    }

    /**
     * Gets the value of the addressLine2Local property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine2Local() {
        return addressLine2Local;
    }

    /**
     * Sets the value of the addressLine2Local property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine2Local(String value) {
        this.addressLine2Local = value;
    }

    /**
     * Gets the value of the addressLine3Local property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine3Local() {
        return addressLine3Local;
    }

    /**
     * Sets the value of the addressLine3Local property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine3Local(String value) {
        this.addressLine3Local = value;
    }

    /**
     * Gets the value of the addressLine4Local property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine4Local() {
        return addressLine4Local;
    }

    /**
     * Sets the value of the addressLine4Local property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine4Local(String value) {
        this.addressLine4Local = value;
    }

    /**
     * Gets the value of the addressLine5Local property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine5Local() {
        return addressLine5Local;
    }

    /**
     * Sets the value of the addressLine5Local property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine5Local(String value) {
        this.addressLine5Local = value;
    }

    /**
     * Gets the value of the addressLine6Local property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine6Local() {
        return addressLine6Local;
    }

    /**
     * Sets the value of the addressLine6Local property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine6Local(String value) {
        this.addressLine6Local = value;
    }

    /**
     * Gets the value of the addressLine7Local property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine7Local() {
        return addressLine7Local;
    }

    /**
     * Sets the value of the addressLine7Local property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine7Local(String value) {
        this.addressLine7Local = value;
    }

    /**
     * Gets the value of the addressLine8Local property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine8Local() {
        return addressLine8Local;
    }

    /**
     * Sets the value of the addressLine8Local property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine8Local(String value) {
        this.addressLine8Local = value;
    }

    /**
     * Gets the value of the addressLine9Local property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine9Local() {
        return addressLine9Local;
    }

    /**
     * Sets the value of the addressLine9Local property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine9Local(String value) {
        this.addressLine9Local = value;
    }

    /**
     * Gets the value of the cityLocal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityLocal() {
        return cityLocal;
    }

    /**
     * Sets the value of the cityLocal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityLocal(String value) {
        this.cityLocal = value;
    }

    /**
     * Gets the value of the citySubdivision1Local property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitySubdivision1Local() {
        return citySubdivision1Local;
    }

    /**
     * Sets the value of the citySubdivision1Local property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitySubdivision1Local(String value) {
        this.citySubdivision1Local = value;
    }

    /**
     * Gets the value of the citySubdivision2Local property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitySubdivision2Local() {
        return citySubdivision2Local;
    }

    /**
     * Sets the value of the citySubdivision2Local property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitySubdivision2Local(String value) {
        this.citySubdivision2Local = value;
    }

    /**
     * Gets the value of the regionSubdivision1Local property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionSubdivision1Local() {
        return regionSubdivision1Local;
    }

    /**
     * Sets the value of the regionSubdivision1Local property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionSubdivision1Local(String value) {
        this.regionSubdivision1Local = value;
    }

    /**
     * Gets the value of the regionSubdivision2Local property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionSubdivision2Local() {
        return regionSubdivision2Local;
    }

    /**
     * Sets the value of the regionSubdivision2Local property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionSubdivision2Local(String value) {
        this.regionSubdivision2Local = value;
    }

}
