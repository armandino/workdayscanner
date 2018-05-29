
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Preferred Communication Language
 * 
 * <p>Java class for Preferred_Communication_LanguagesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Preferred_Communication_LanguagesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Delete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Country_Reference" type="{urn:com.workday/bsvc}CountryObjectType"/>
 *         &lt;element name="Preferred_Communication_Language_Data" type="{urn:com.workday/bsvc}Preferred_Communication_Language_DataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Preferred_Communication_LanguagesType", propOrder = {
    "delete",
    "countryReference",
    "preferredCommunicationLanguageData"
})
public class PreferredCommunicationLanguagesType {

    @XmlElement(name = "Delete")
    protected Boolean delete;
    @XmlElement(name = "Country_Reference", required = true)
    protected CountryObjectType countryReference;
    @XmlElement(name = "Preferred_Communication_Language_Data", required = true)
    protected PreferredCommunicationLanguageDataType preferredCommunicationLanguageData;

    /**
     * Gets the value of the delete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelete() {
        return delete;
    }

    /**
     * Sets the value of the delete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelete(Boolean value) {
        this.delete = value;
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
     * Gets the value of the preferredCommunicationLanguageData property.
     * 
     * @return
     *     possible object is
     *     {@link PreferredCommunicationLanguageDataType }
     *     
     */
    public PreferredCommunicationLanguageDataType getPreferredCommunicationLanguageData() {
        return preferredCommunicationLanguageData;
    }

    /**
     * Sets the value of the preferredCommunicationLanguageData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferredCommunicationLanguageDataType }
     *     
     */
    public void setPreferredCommunicationLanguageData(PreferredCommunicationLanguageDataType value) {
        this.preferredCommunicationLanguageData = value;
    }

}
