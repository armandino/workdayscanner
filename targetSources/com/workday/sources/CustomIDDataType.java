
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Wrapper for Custom Identifier Data.
 * 
 * <p>Java class for Custom_ID_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Custom_ID_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_Type_Reference" type="{urn:com.workday/bsvc}Custom_ID_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Issued_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Expiration_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Organization_ID_Reference" type="{urn:com.workday/bsvc}OrganizationObjectType" minOccurs="0"/>
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
@XmlType(name = "Custom_ID_DataType", propOrder = {
    "id",
    "idTypeReference",
    "issuedDate",
    "expirationDate",
    "organizationIDReference",
    "customDescription"
})
public class CustomIDDataType {

    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "ID_Type_Reference")
    protected CustomIDTypeObjectType idTypeReference;
    @XmlElement(name = "Issued_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issuedDate;
    @XmlElement(name = "Expiration_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expirationDate;
    @XmlElement(name = "Organization_ID_Reference")
    protected OrganizationObjectType organizationIDReference;
    @XmlElement(name = "Custom_Description")
    protected String customDescription;

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
     *     {@link CustomIDTypeObjectType }
     *     
     */
    public CustomIDTypeObjectType getIDTypeReference() {
        return idTypeReference;
    }

    /**
     * Sets the value of the idTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomIDTypeObjectType }
     *     
     */
    public void setIDTypeReference(CustomIDTypeObjectType value) {
        this.idTypeReference = value;
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
     * Gets the value of the organizationIDReference property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationObjectType }
     *     
     */
    public OrganizationObjectType getOrganizationIDReference() {
        return organizationIDReference;
    }

    /**
     * Sets the value of the organizationIDReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationObjectType }
     *     
     */
    public void setOrganizationIDReference(OrganizationObjectType value) {
        this.organizationIDReference = value;
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
