
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Encapsulating element for all Biographical data (e.g. DOB, Gender, etc.) associated with a person.
 * 
 * <p>Java class for Biographic_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Biographic_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Country_Of_Birth_Reference" type="{urn:com.workday/bsvc}Country_Of_Birth_ReferenceType" minOccurs="0"/>
 *         &lt;element name="Place_Of_Birth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Date_Of_Birth" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Gender_Reference" type="{urn:com.workday/bsvc}Gender_ReferenceType" minOccurs="0"/>
 *         &lt;element name="Disability_Reference" type="{urn:com.workday/bsvc}Disability_ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Uses_Tobacco" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Biographic_DataType", propOrder = {
    "countryOfBirthReference",
    "placeOfBirth",
    "dateOfBirth",
    "genderReference",
    "disabilityReference",
    "usesTobacco"
})
public class BiographicDataType {

    @XmlElement(name = "Country_Of_Birth_Reference")
    protected CountryOfBirthReferenceType countryOfBirthReference;
    @XmlElement(name = "Place_Of_Birth")
    protected String placeOfBirth;
    @XmlElement(name = "Date_Of_Birth")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElement(name = "Gender_Reference")
    protected GenderReferenceType genderReference;
    @XmlElement(name = "Disability_Reference")
    protected List<DisabilityReferenceType> disabilityReference;
    @XmlElement(name = "Uses_Tobacco")
    protected Boolean usesTobacco;

    /**
     * Gets the value of the countryOfBirthReference property.
     * 
     * @return
     *     possible object is
     *     {@link CountryOfBirthReferenceType }
     *     
     */
    public CountryOfBirthReferenceType getCountryOfBirthReference() {
        return countryOfBirthReference;
    }

    /**
     * Sets the value of the countryOfBirthReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryOfBirthReferenceType }
     *     
     */
    public void setCountryOfBirthReference(CountryOfBirthReferenceType value) {
        this.countryOfBirthReference = value;
    }

    /**
     * Gets the value of the placeOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    /**
     * Sets the value of the placeOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceOfBirth(String value) {
        this.placeOfBirth = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the genderReference property.
     * 
     * @return
     *     possible object is
     *     {@link GenderReferenceType }
     *     
     */
    public GenderReferenceType getGenderReference() {
        return genderReference;
    }

    /**
     * Sets the value of the genderReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderReferenceType }
     *     
     */
    public void setGenderReference(GenderReferenceType value) {
        this.genderReference = value;
    }

    /**
     * Gets the value of the disabilityReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disabilityReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisabilityReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisabilityReferenceType }
     * 
     * 
     */
    public List<DisabilityReferenceType> getDisabilityReference() {
        if (disabilityReference == null) {
            disabilityReference = new ArrayList<DisabilityReferenceType>();
        }
        return this.disabilityReference;
    }

    /**
     * Gets the value of the usesTobacco property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsesTobacco() {
        return usesTobacco;
    }

    /**
     * Sets the value of the usesTobacco property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsesTobacco(Boolean value) {
        this.usesTobacco = value;
    }

}
