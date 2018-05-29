
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Wrapper for License Identifier Data.
 * 
 * <p>Java class for License_ID_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="License_ID_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_Type_Reference" type="{urn:com.workday/bsvc}License_ID_Type__All_ObjectType" minOccurs="0"/>
 *         &lt;element name="Country_Reference" type="{urn:com.workday/bsvc}CountryObjectType" minOccurs="0"/>
 *         &lt;element name="Country_Region_Reference" type="{urn:com.workday/bsvc}Country_RegionObjectType" minOccurs="0"/>
 *         &lt;element name="Country_Region_Descriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Authority_Reference" type="{urn:com.workday/bsvc}AuthorityObjectType" minOccurs="0"/>
 *         &lt;element name="License_Class" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Issued_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Expiration_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Verification_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Verified_By_Reference" type="{urn:com.workday/bsvc}WorkerObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "License_ID_DataType", propOrder = {
    "id",
    "idTypeReference",
    "countryReference",
    "countryRegionReference",
    "countryRegionDescriptor",
    "authorityReference",
    "licenseClass",
    "issuedDate",
    "expirationDate",
    "verificationDate",
    "verifiedByReference"
})
public class LicenseIDDataType {

    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "ID_Type_Reference")
    protected LicenseIDTypeAllObjectType idTypeReference;
    @XmlElement(name = "Country_Reference")
    protected CountryObjectType countryReference;
    @XmlElement(name = "Country_Region_Reference")
    protected CountryRegionObjectType countryRegionReference;
    @XmlElement(name = "Country_Region_Descriptor")
    protected String countryRegionDescriptor;
    @XmlElement(name = "Authority_Reference")
    protected AuthorityObjectType authorityReference;
    @XmlElement(name = "License_Class")
    protected String licenseClass;
    @XmlElement(name = "Issued_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issuedDate;
    @XmlElement(name = "Expiration_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expirationDate;
    @XmlElement(name = "Verification_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar verificationDate;
    @XmlElement(name = "Verified_By_Reference")
    protected WorkerObjectType verifiedByReference;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the idTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseIDTypeAllObjectType }
     *     
     */
    public LicenseIDTypeAllObjectType getIDTypeReference() {
        return idTypeReference;
    }

    /**
     * Sets the value of the idTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseIDTypeAllObjectType }
     *     
     */
    public void setIDTypeReference(LicenseIDTypeAllObjectType value) {
        this.idTypeReference = value;
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
     * Gets the value of the authorityReference property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorityObjectType }
     *     
     */
    public AuthorityObjectType getAuthorityReference() {
        return authorityReference;
    }

    /**
     * Sets the value of the authorityReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorityObjectType }
     *     
     */
    public void setAuthorityReference(AuthorityObjectType value) {
        this.authorityReference = value;
    }

    /**
     * Gets the value of the licenseClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseClass() {
        return licenseClass;
    }

    /**
     * Sets the value of the licenseClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseClass(String value) {
        this.licenseClass = value;
    }

    /**
     * Gets the value of the issuedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssuedDate() {
        return issuedDate;
    }

    /**
     * Sets the value of the issuedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssuedDate(XMLGregorianCalendar value) {
        this.issuedDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the verificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVerificationDate() {
        return verificationDate;
    }

    /**
     * Sets the value of the verificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVerificationDate(XMLGregorianCalendar value) {
        this.verificationDate = value;
    }

    /**
     * Gets the value of the verifiedByReference property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerObjectType }
     *     
     */
    public WorkerObjectType getVerifiedByReference() {
        return verifiedByReference;
    }

    /**
     * Sets the value of the verifiedByReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerObjectType }
     *     
     */
    public void setVerifiedByReference(WorkerObjectType value) {
        this.verifiedByReference = value;
    }

}
