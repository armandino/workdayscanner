
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response for the change licenses web service.
 * 
 * <p>Java class for Change_Licenses_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Change_Licenses_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="License_Identifier_Event_Reference" type="{urn:com.workday/bsvc}Unique_IdentifierObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{urn:com.workday/bsvc}version"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Change_Licenses_ResponseType", propOrder = {
    "licenseIdentifierEventReference"
})
public class ChangeLicensesResponseType {

    @XmlElement(name = "License_Identifier_Event_Reference")
    protected UniqueIdentifierObjectType licenseIdentifierEventReference;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the licenseIdentifierEventReference property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public UniqueIdentifierObjectType getLicenseIdentifierEventReference() {
        return licenseIdentifierEventReference;
    }

    /**
     * Sets the value of the licenseIdentifierEventReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public void setLicenseIdentifierEventReference(UniqueIdentifierObjectType value) {
        this.licenseIdentifierEventReference = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
