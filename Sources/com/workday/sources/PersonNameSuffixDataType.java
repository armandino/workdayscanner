
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the suffixes for a name.
 * 
 * <p>Java class for Person_Name_Suffix_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Person_Name_Suffix_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Social_Suffix_Reference" type="{urn:com.workday/bsvc}Country_Predefined_Person_Name_Component_ValueObjectType" minOccurs="0"/>
 *         &lt;element name="Social_Suffix_Descriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Academic_Suffix_Reference" type="{urn:com.workday/bsvc}Country_Predefined_Person_Name_Component_ValueObjectType" minOccurs="0"/>
 *         &lt;element name="Hereditary_Suffix_Reference" type="{urn:com.workday/bsvc}Country_Predefined_Person_Name_Component_ValueObjectType" minOccurs="0"/>
 *         &lt;element name="Honorary_Suffix_Reference" type="{urn:com.workday/bsvc}Country_Predefined_Person_Name_Component_ValueObjectType" minOccurs="0"/>
 *         &lt;element name="Professional_Suffix_Reference" type="{urn:com.workday/bsvc}Country_Predefined_Person_Name_Component_ValueObjectType" minOccurs="0"/>
 *         &lt;element name="Religious_Suffix_Reference" type="{urn:com.workday/bsvc}Country_Predefined_Person_Name_Component_ValueObjectType" minOccurs="0"/>
 *         &lt;element name="Royal_Suffix_Reference" type="{urn:com.workday/bsvc}Country_Predefined_Person_Name_Component_ValueObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person_Name_Suffix_DataType", propOrder = {
    "socialSuffixReference",
    "socialSuffixDescriptor",
    "academicSuffixReference",
    "hereditarySuffixReference",
    "honorarySuffixReference",
    "professionalSuffixReference",
    "religiousSuffixReference",
    "royalSuffixReference"
})
public class PersonNameSuffixDataType {

    @XmlElement(name = "Social_Suffix_Reference")
    protected CountryPredefinedPersonNameComponentValueObjectType socialSuffixReference;
    @XmlElement(name = "Social_Suffix_Descriptor")
    protected String socialSuffixDescriptor;
    @XmlElement(name = "Academic_Suffix_Reference")
    protected CountryPredefinedPersonNameComponentValueObjectType academicSuffixReference;
    @XmlElement(name = "Hereditary_Suffix_Reference")
    protected CountryPredefinedPersonNameComponentValueObjectType hereditarySuffixReference;
    @XmlElement(name = "Honorary_Suffix_Reference")
    protected CountryPredefinedPersonNameComponentValueObjectType honorarySuffixReference;
    @XmlElement(name = "Professional_Suffix_Reference")
    protected CountryPredefinedPersonNameComponentValueObjectType professionalSuffixReference;
    @XmlElement(name = "Religious_Suffix_Reference")
    protected CountryPredefinedPersonNameComponentValueObjectType religiousSuffixReference;
    @XmlElement(name = "Royal_Suffix_Reference")
    protected CountryPredefinedPersonNameComponentValueObjectType royalSuffixReference;

    /**
     * Gets the value of the socialSuffixReference property.
     * 
     * @return
     *     possible object is
     *     {@link CountryPredefinedPersonNameComponentValueObjectType }
     *     
     */
    public CountryPredefinedPersonNameComponentValueObjectType getSocialSuffixReference() {
        return socialSuffixReference;
    }

    /**
     * Sets the value of the socialSuffixReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryPredefinedPersonNameComponentValueObjectType }
     *     
     */
    public void setSocialSuffixReference(CountryPredefinedPersonNameComponentValueObjectType value) {
        this.socialSuffixReference = value;
    }

    /**
     * Gets the value of the socialSuffixDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialSuffixDescriptor() {
        return socialSuffixDescriptor;
    }

    /**
     * Sets the value of the socialSuffixDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialSuffixDescriptor(String value) {
        this.socialSuffixDescriptor = value;
    }

    /**
     * Gets the value of the academicSuffixReference property.
     * 
     * @return
     *     possible object is
     *     {@link CountryPredefinedPersonNameComponentValueObjectType }
     *     
     */
    public CountryPredefinedPersonNameComponentValueObjectType getAcademicSuffixReference() {
        return academicSuffixReference;
    }

    /**
     * Sets the value of the academicSuffixReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryPredefinedPersonNameComponentValueObjectType }
     *     
     */
    public void setAcademicSuffixReference(CountryPredefinedPersonNameComponentValueObjectType value) {
        this.academicSuffixReference = value;
    }

    /**
     * Gets the value of the hereditarySuffixReference property.
     * 
     * @return
     *     possible object is
     *     {@link CountryPredefinedPersonNameComponentValueObjectType }
     *     
     */
    public CountryPredefinedPersonNameComponentValueObjectType getHereditarySuffixReference() {
        return hereditarySuffixReference;
    }

    /**
     * Sets the value of the hereditarySuffixReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryPredefinedPersonNameComponentValueObjectType }
     *     
     */
    public void setHereditarySuffixReference(CountryPredefinedPersonNameComponentValueObjectType value) {
        this.hereditarySuffixReference = value;
    }

    /**
     * Gets the value of the honorarySuffixReference property.
     * 
     * @return
     *     possible object is
     *     {@link CountryPredefinedPersonNameComponentValueObjectType }
     *     
     */
    public CountryPredefinedPersonNameComponentValueObjectType getHonorarySuffixReference() {
        return honorarySuffixReference;
    }

    /**
     * Sets the value of the honorarySuffixReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryPredefinedPersonNameComponentValueObjectType }
     *     
     */
    public void setHonorarySuffixReference(CountryPredefinedPersonNameComponentValueObjectType value) {
        this.honorarySuffixReference = value;
    }

    /**
     * Gets the value of the professionalSuffixReference property.
     * 
     * @return
     *     possible object is
     *     {@link CountryPredefinedPersonNameComponentValueObjectType }
     *     
     */
    public CountryPredefinedPersonNameComponentValueObjectType getProfessionalSuffixReference() {
        return professionalSuffixReference;
    }

    /**
     * Sets the value of the professionalSuffixReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryPredefinedPersonNameComponentValueObjectType }
     *     
     */
    public void setProfessionalSuffixReference(CountryPredefinedPersonNameComponentValueObjectType value) {
        this.professionalSuffixReference = value;
    }

    /**
     * Gets the value of the religiousSuffixReference property.
     * 
     * @return
     *     possible object is
     *     {@link CountryPredefinedPersonNameComponentValueObjectType }
     *     
     */
    public CountryPredefinedPersonNameComponentValueObjectType getReligiousSuffixReference() {
        return religiousSuffixReference;
    }

    /**
     * Sets the value of the religiousSuffixReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryPredefinedPersonNameComponentValueObjectType }
     *     
     */
    public void setReligiousSuffixReference(CountryPredefinedPersonNameComponentValueObjectType value) {
        this.religiousSuffixReference = value;
    }

    /**
     * Gets the value of the royalSuffixReference property.
     * 
     * @return
     *     possible object is
     *     {@link CountryPredefinedPersonNameComponentValueObjectType }
     *     
     */
    public CountryPredefinedPersonNameComponentValueObjectType getRoyalSuffixReference() {
        return royalSuffixReference;
    }

    /**
     * Sets the value of the royalSuffixReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryPredefinedPersonNameComponentValueObjectType }
     *     
     */
    public void setRoyalSuffixReference(CountryPredefinedPersonNameComponentValueObjectType value) {
        this.royalSuffixReference = value;
    }

}
