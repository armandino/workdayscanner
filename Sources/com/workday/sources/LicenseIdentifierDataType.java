
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Encapsulating element for all License Identifier data.
 * 
 * <p>Java class for License_Identifier_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="License_Identifier_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="License_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="License_Type_Reference" type="{urn:com.workday/bsvc}License_Type_ReferenceType"/>
 *         &lt;element name="License_Class" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Issued_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Expiration_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Verification_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="Country_Reference" type="{urn:com.workday/bsvc}Country_ReferenceType" minOccurs="0"/>
 *           &lt;element name="Country_Region_Reference" type="{urn:com.workday/bsvc}Country_Region_ReferenceType" minOccurs="0"/>
 *           &lt;element name="Authority_Reference" type="{urn:com.workday/bsvc}Authority_ReferenceType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "License_Identifier_DataType", propOrder = {
    "licenseID",
    "licenseTypeReference",
    "licenseClass",
    "issuedDate",
    "expirationDate",
    "verificationDate",
    "countryReference",
    "countryRegionReference",
    "authorityReference"
})
public class LicenseIdentifierDataType {

    @XmlElement(name = "License_ID", required = true)
    protected String licenseID;
    @XmlElement(name = "License_Type_Reference", required = true)
    protected LicenseTypeReferenceType licenseTypeReference;
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
    @XmlElement(name = "Country_Reference")
    protected CountryReferenceType countryReference;
    @XmlElement(name = "Country_Region_Reference")
    protected CountryRegionReferenceType countryRegionReference;
    @XmlElement(name = "Authority_Reference")
    protected AuthorityReferenceType authorityReference;

    /**
     * Gets the value of the licenseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseID() {
        return licenseID;
    }

    /**
     * Sets the value of the licenseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseID(String value) {
        this.licenseID = value;
    }

    /**
     * Gets the value of the licenseTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseTypeReferenceType }
     *     
     */
    public LicenseTypeReferenceType getLicenseTypeReference() {
        return licenseTypeReference;
    }

    /**
     * Sets the value of the licenseTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseTypeReferenceType }
     *     
     */
    public void setLicenseTypeReference(LicenseTypeReferenceType value) {
        this.licenseTypeReference = value;
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
     * Gets the value of the countryRegionReference property.
     * 
     * @return
     *     possible object is
     *     {@link CountryRegionReferenceType }
     *     
     */
    public CountryRegionReferenceType getCountryRegionReference() {
        return countryRegionReference;
    }

    /**
     * Sets the value of the countryRegionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryRegionReferenceType }
     *     
     */
    public void setCountryRegionReference(CountryRegionReferenceType value) {
        this.countryRegionReference = value;
    }

    /**
     * Gets the value of the authorityReference property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorityReferenceType }
     *     
     */
    public AuthorityReferenceType getAuthorityReference() {
        return authorityReference;
    }

    /**
     * Sets the value of the authorityReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorityReferenceType }
     *     
     */
    public void setAuthorityReference(AuthorityReferenceType value) {
        this.authorityReference = value;
    }

}
