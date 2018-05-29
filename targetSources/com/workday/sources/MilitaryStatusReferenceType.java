
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference element representing a unique instance of Military Status.
 * 
 * <p>Java class for Military_Status_ReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Military_Status_ReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Military_Status_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "Military_Status_ReferenceType", propOrder = {
    "militaryStatusName",
    "countryReference"
})
public class MilitaryStatusReferenceType {

    @XmlElement(name = "Military_Status_Name", required = true)
    protected String militaryStatusName;
    @XmlElement(name = "Country_Reference", required = true)
    protected CountryReferenceType countryReference;

    /**
     * Gets the value of the militaryStatusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMilitaryStatusName() {
        return militaryStatusName;
    }

    /**
     * Sets the value of the militaryStatusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMilitaryStatusName(String value) {
        this.militaryStatusName = value;
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
