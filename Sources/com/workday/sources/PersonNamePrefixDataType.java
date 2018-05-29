
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the prefixes for a name.
 * 
 * <p>Java class for Person_Name_Prefix_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Person_Name_Prefix_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Title_Reference" type="{urn:com.workday/bsvc}Country_Predefined_Person_Name_Component_ValueObjectType" minOccurs="0"/>
 *         &lt;element name="Title_Descriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Salutation_Reference" type="{urn:com.workday/bsvc}Country_Predefined_Person_Name_Component_ValueObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person_Name_Prefix_DataType", propOrder = {
    "titleReference",
    "titleDescriptor",
    "salutationReference"
})
public class PersonNamePrefixDataType {

    @XmlElement(name = "Title_Reference")
    protected CountryPredefinedPersonNameComponentValueObjectType titleReference;
    @XmlElement(name = "Title_Descriptor")
    protected String titleDescriptor;
    @XmlElement(name = "Salutation_Reference")
    protected CountryPredefinedPersonNameComponentValueObjectType salutationReference;

    /**
     * Gets the value of the titleReference property.
     * 
     * @return
     *     possible object is
     *     {@link CountryPredefinedPersonNameComponentValueObjectType }
     *     
     */
    public CountryPredefinedPersonNameComponentValueObjectType getTitleReference() {
        return titleReference;
    }

    /**
     * Sets the value of the titleReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryPredefinedPersonNameComponentValueObjectType }
     *     
     */
    public void setTitleReference(CountryPredefinedPersonNameComponentValueObjectType value) {
        this.titleReference = value;
    }

    /**
     * Gets the value of the titleDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleDescriptor() {
        return titleDescriptor;
    }

    /**
     * Sets the value of the titleDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleDescriptor(String value) {
        this.titleDescriptor = value;
    }

    /**
     * Gets the value of the salutationReference property.
     * 
     * @return
     *     possible object is
     *     {@link CountryPredefinedPersonNameComponentValueObjectType }
     *     
     */
    public CountryPredefinedPersonNameComponentValueObjectType getSalutationReference() {
        return salutationReference;
    }

    /**
     * Sets the value of the salutationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryPredefinedPersonNameComponentValueObjectType }
     *     
     */
    public void setSalutationReference(CountryPredefinedPersonNameComponentValueObjectType value) {
        this.salutationReference = value;
    }

}
