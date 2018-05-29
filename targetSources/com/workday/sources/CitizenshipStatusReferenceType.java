
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference element representing a unique instance of Citizenship Status.
 * 
 * <p>Java class for Citizenship_Status_ReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Citizenship_Status_ReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Citizenship_Status_Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Country_Reference" type="{urn:com.workday/bsvc}Country_ReferenceType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Citizenship_Status_ReferenceType", propOrder = {
    "citizenshipStatusDescription",
    "countryReference"
})
public class CitizenshipStatusReferenceType {

    @XmlElement(name = "Citizenship_Status_Description", required = true)
    protected String citizenshipStatusDescription;
    @XmlElement(name = "Country_Reference", required = true)
    protected CountryReferenceType countryReference;

    /**
     * Gets the value of the citizenshipStatusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitizenshipStatusDescription() {
        return citizenshipStatusDescription;
    }

    /**
     * Sets the value of the citizenshipStatusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitizenshipStatusDescription(String value) {
        this.citizenshipStatusDescription = value;
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

}
