
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Encapsulating element for all Government Identifier data.
 * 
 * <p>Java class for Government_Identifier_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Government_Identifier_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Government_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Government_ID_Type_Reference" type="{urn:com.workday/bsvc}Government_ID_Type_ReferenceType"/>
 *         &lt;element name="Country_Reference" type="{urn:com.workday/bsvc}Country_ReferenceType"/>
 *         &lt;element name="Issued_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Expiration_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Verification_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Government_Identifier_DataType", propOrder = {
    "governmentID",
    "governmentIDTypeReference",
    "countryReference",
    "issuedDate",
    "expirationDate",
    "verificationDate"
})
public class GovernmentIdentifierDataType {

    @XmlElement(name = "Government_ID", required = true)
    protected String governmentID;
    @XmlElement(name = "Government_ID_Type_Reference", required = true)
    protected GovernmentIDTypeReferenceType governmentIDTypeReference;
    @XmlElement(name = "Country_Reference", required = true)
    protected CountryReferenceType countryReference;
    @XmlElement(name = "Issued_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issuedDate;
    @XmlElement(name = "Expiration_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expirationDate;
    @XmlElement(name = "Verification_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar verificationDate;

    /**
     * Gets the value of the governmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovernmentID() {
        return governmentID;
    }

    /**
     * Sets the value of the governmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovernmentID(String value) {
        this.governmentID = value;
    }

    /**
     * Gets the value of the governmentIDTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link GovernmentIDTypeReferenceType }
     *     
     */
    public GovernmentIDTypeReferenceType getGovernmentIDTypeReference() {
        return governmentIDTypeReference;
    }

    /**
     * Sets the value of the governmentIDTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link GovernmentIDTypeReferenceType }
     *     
     */
    public void setGovernmentIDTypeReference(GovernmentIDTypeReferenceType value) {
        this.governmentIDTypeReference = value;
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

}
