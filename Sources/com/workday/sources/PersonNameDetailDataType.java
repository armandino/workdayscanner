
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the components of a name, such as the First Name and Last Name.
 * 
 * <p>Java class for Person_Name_Detail_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Person_Name_Detail_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Country_Reference" type="{urn:com.workday/bsvc}CountryObjectType"/>
 *         &lt;element name="Prefix_Data" type="{urn:com.workday/bsvc}Person_Name_Prefix_DataType" minOccurs="0"/>
 *         &lt;element name="First_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Middle_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Last_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Secondary_Last_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tertiary_Last_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Local_Name_Detail_Data" type="{urn:com.workday/bsvc}Local_Person_Name_Detail_DataType" minOccurs="0"/>
 *         &lt;element name="Suffix_Data" type="{urn:com.workday/bsvc}Person_Name_Suffix_DataType" minOccurs="0"/>
 *         &lt;element name="Full_Name_for_Singapore_and_Malaysia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Formatted_Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Reporting_Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person_Name_Detail_DataType", propOrder = {
    "countryReference",
    "prefixData",
    "firstName",
    "middleName",
    "lastName",
    "secondaryLastName",
    "tertiaryLastName",
    "localNameDetailData",
    "suffixData",
    "fullNameForSingaporeAndMalaysia"
})
public class PersonNameDetailDataType {

    @XmlElement(name = "Country_Reference", required = true)
    protected CountryObjectType countryReference;
    @XmlElement(name = "Prefix_Data")
    protected PersonNamePrefixDataType prefixData;
    @XmlElement(name = "First_Name")
    protected String firstName;
    @XmlElement(name = "Middle_Name")
    protected String middleName;
    @XmlElement(name = "Last_Name")
    protected String lastName;
    @XmlElement(name = "Secondary_Last_Name")
    protected String secondaryLastName;
    @XmlElement(name = "Tertiary_Last_Name")
    protected String tertiaryLastName;
    @XmlElement(name = "Local_Name_Detail_Data")
    protected LocalPersonNameDetailDataType localNameDetailData;
    @XmlElement(name = "Suffix_Data")
    protected PersonNameSuffixDataType suffixData;
    @XmlElement(name = "Full_Name_for_Singapore_and_Malaysia")
    protected String fullNameForSingaporeAndMalaysia;
    @XmlAttribute(name = "Formatted_Name", namespace = "urn:com.workday/bsvc")
    protected String formattedName;
    @XmlAttribute(name = "Reporting_Name", namespace = "urn:com.workday/bsvc")
    protected String reportingName;

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
     * Gets the value of the prefixData property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNamePrefixDataType }
     *     
     */
    public PersonNamePrefixDataType getPrefixData() {
        return prefixData;
    }

    /**
     * Sets the value of the prefixData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNamePrefixDataType }
     *     
     */
    public void setPrefixData(PersonNamePrefixDataType value) {
        this.prefixData = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the secondaryLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryLastName() {
        return secondaryLastName;
    }

    /**
     * Sets the value of the secondaryLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryLastName(String value) {
        this.secondaryLastName = value;
    }

    /**
     * Gets the value of the tertiaryLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTertiaryLastName() {
        return tertiaryLastName;
    }

    /**
     * Sets the value of the tertiaryLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTertiaryLastName(String value) {
        this.tertiaryLastName = value;
    }

    /**
     * Gets the value of the localNameDetailData property.
     * 
     * @return
     *     possible object is
     *     {@link LocalPersonNameDetailDataType }
     *     
     */
    public LocalPersonNameDetailDataType getLocalNameDetailData() {
        return localNameDetailData;
    }

    /**
     * Sets the value of the localNameDetailData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalPersonNameDetailDataType }
     *     
     */
    public void setLocalNameDetailData(LocalPersonNameDetailDataType value) {
        this.localNameDetailData = value;
    }

    /**
     * Gets the value of the suffixData property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameSuffixDataType }
     *     
     */
    public PersonNameSuffixDataType getSuffixData() {
        return suffixData;
    }

    /**
     * Sets the value of the suffixData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameSuffixDataType }
     *     
     */
    public void setSuffixData(PersonNameSuffixDataType value) {
        this.suffixData = value;
    }

    /**
     * Gets the value of the fullNameForSingaporeAndMalaysia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullNameForSingaporeAndMalaysia() {
        return fullNameForSingaporeAndMalaysia;
    }

    /**
     * Sets the value of the fullNameForSingaporeAndMalaysia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullNameForSingaporeAndMalaysia(String value) {
        this.fullNameForSingaporeAndMalaysia = value;
    }

    /**
     * Gets the value of the formattedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedName() {
        return formattedName;
    }

    /**
     * Sets the value of the formattedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedName(String value) {
        this.formattedName = value;
    }

    /**
     * Gets the value of the reportingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingName() {
        return reportingName;
    }

    /**
     * Sets the value of the reportingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingName(String value) {
        this.reportingName = value;
    }

}
