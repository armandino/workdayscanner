
package com.workday.sources;

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
 * Encapsulating element for all Address data.
 * 
 * <p>Java class for Address_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Address_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Country_Reference" type="{urn:com.workday/bsvc}Country_ReferenceType"/>
 *         &lt;element name="Address_Line" type="{urn:com.workday/bsvc}Address_Line_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Municipality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Submunicipality" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Subregion" type="{urn:com.workday/bsvc}Subregion_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Postal_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Usage_Data" type="{urn:com.workday/bsvc}Communication_Method_Usage_DataType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Last_Modified" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Effective_Date" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address_DataType", propOrder = {
    "countryReference",
    "addressLine",
    "municipality",
    "submunicipality",
    "region",
    "subregion",
    "postalCode",
    "usageData"
})
public class AddressDataType {

    @XmlElement(name = "Country_Reference", required = true)
    protected CountryReferenceType countryReference;
    @XmlElement(name = "Address_Line")
    protected List<AddressLineDataType> addressLine;
    @XmlElement(name = "Municipality")
    protected String municipality;
    @XmlElement(name = "Submunicipality")
    protected List<String> submunicipality;
    @XmlElement(name = "Region")
    protected String region;
    @XmlElement(name = "Subregion")
    protected List<SubregionDataType> subregion;
    @XmlElement(name = "Postal_Code")
    protected String postalCode;
    @XmlElement(name = "Usage_Data", required = true)
    protected CommunicationMethodUsageDataType usageData;
    @XmlAttribute(name = "Last_Modified", namespace = "urn:com.workday/bsvc")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModified;
    @XmlAttribute(name = "Effective_Date", namespace = "urn:com.workday/bsvc")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;

    /**
     * Gets the value of the countryReference property.
     * 
     * @return
     *     possible object is
     *     {@link CountryReferenceType }
     *     
     */
    public CountryReferenceType getCountryReference() {
        return countryReference;
    }

    /**
     * Sets the value of the countryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryReferenceType }
     *     
     */
    public void setCountryReference(CountryReferenceType value) {
        this.countryReference = value;
    }

    /**
     * Gets the value of the addressLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressLineDataType }
     * 
     * 
     */
    public List<AddressLineDataType> getAddressLine() {
        if (addressLine == null) {
            addressLine = new ArrayList<AddressLineDataType>();
        }
        return this.addressLine;
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
     * Gets the value of the submunicipality property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the submunicipality property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubmunicipality().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubmunicipality() {
        if (submunicipality == null) {
            submunicipality = new ArrayList<String>();
        }
        return this.submunicipality;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the subregion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subregion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubregion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubregionDataType }
     * 
     * 
     */
    public List<SubregionDataType> getSubregion() {
        if (subregion == null) {
            subregion = new ArrayList<SubregionDataType>();
        }
        return this.subregion;
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
     * @return
     *     possible object is
     *     {@link CommunicationMethodUsageDataType }
     *     
     */
    public CommunicationMethodUsageDataType getUsageData() {
        return usageData;
    }

    /**
     * Sets the value of the usageData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationMethodUsageDataType }
     *     
     */
    public void setUsageData(CommunicationMethodUsageDataType value) {
        this.usageData = value;
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
