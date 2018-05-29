
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Encapsulating element for all Custom Identifier data.
 * 
 * <p>Java class for Custom_Identifier_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Custom_Identifier_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Custom_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Custom_ID_Type_Reference" type="{urn:com.workday/bsvc}Custom_ID_Type_ReferenceType"/>
 *         &lt;element name="Issued_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Expiration_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Organization_Reference" type="{urn:com.workday/bsvc}Organization_ReferenceType" minOccurs="0"/>
 *         &lt;element name="Custom_Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Custom_Identifier_DataType", propOrder = {
    "customID",
    "customIDTypeReference",
    "issuedDate",
    "expirationDate",
    "organizationReference",
    "customDescription"
})
public class CustomIdentifierDataType {

    @XmlElement(name = "Custom_ID", required = true)
    protected String customID;
    @XmlElement(name = "Custom_ID_Type_Reference", required = true)
    protected CustomIDTypeReferenceType customIDTypeReference;
    @XmlElement(name = "Issued_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issuedDate;
    @XmlElement(name = "Expiration_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expirationDate;
    @XmlElement(name = "Organization_Reference")
    protected OrganizationReferenceType organizationReference;
    @XmlElement(name = "Custom_Description")
    protected String customDescription;

    /**
     * Gets the value of the customID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomID() {
        return customID;
    }

    /**
     * Sets the value of the customID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomID(String value) {
        this.customID = value;
    }

    /**
     * Gets the value of the customIDTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link CustomIDTypeReferenceType }
     *     
     */
    public CustomIDTypeReferenceType getCustomIDTypeReference() {
        return customIDTypeReference;
    }

    /**
     * Sets the value of the customIDTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomIDTypeReferenceType }
     *     
     */
    public void setCustomIDTypeReference(CustomIDTypeReferenceType value) {
        this.customIDTypeReference = value;
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
     * Gets the value of the organizationReference property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationReferenceType }
     *     
     */
    public OrganizationReferenceType getOrganizationReference() {
        return organizationReference;
    }

    /**
     * Sets the value of the organizationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationReferenceType }
     *     
     */
    public void setOrganizationReference(OrganizationReferenceType value) {
        this.organizationReference = value;
    }

    /**
     * Gets the value of the customDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomDescription() {
        return customDescription;
    }

    /**
     * Sets the value of the customDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomDescription(String value) {
        this.customDescription = value;
    }

}
