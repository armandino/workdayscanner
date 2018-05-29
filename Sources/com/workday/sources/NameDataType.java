
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Encapsulating element for all of the name data such as first and last name
 * 
 * <p>Java class for Name_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Name_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Country_Reference" type="{urn:com.workday/bsvc}Country_ReferenceType"/>
 *         &lt;element name="Additional_Name_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Prefix" type="{urn:com.workday/bsvc}Prefix_Name_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="First_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Middle_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Last_Name" type="{urn:com.workday/bsvc}Last_Name_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Local_Name_Data" type="{urn:com.workday/bsvc}Local_Name_DataType" minOccurs="0"/>
 *         &lt;element name="Suffix" type="{urn:com.workday/bsvc}Suffix_Name_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Is_Legal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Is_Preferred" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Effective_Date" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="Last_Modified" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Name_DataType", propOrder = {
    "countryReference",
    "additionalNameType",
    "prefix",
    "firstName",
    "middleName",
    "lastName",
    "localNameData",
    "suffix"
})
public class NameDataType {

    @XmlElement(name = "Country_Reference", required = true)
    protected CountryReferenceType countryReference;
    @XmlElement(name = "Additional_Name_Type")
    protected String additionalNameType;
    @XmlElement(name = "Prefix")
    protected List<PrefixNameDataType> prefix;
    @XmlElement(name = "First_Name")
    protected String firstName;
    @XmlElement(name = "Middle_Name")
    protected String middleName;
    @XmlElement(name = "Last_Name")
    protected List<LastNameDataType> lastName;
    @XmlElement(name = "Local_Name_Data")
    protected LocalNameDataType localNameData;
    @XmlElement(name = "Suffix")
    protected List<SuffixNameDataType> suffix;
    @XmlAttribute(name = "Is_Legal", namespace = "urn:com.workday/bsvc")
    protected Boolean isLegal;
    @XmlAttribute(name = "Is_Preferred", namespace = "urn:com.workday/bsvc")
    protected Boolean isPreferred;
    @XmlAttribute(name = "Effective_Date", namespace = "urn:com.workday/bsvc")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute(name = "Last_Modified", namespace = "urn:com.workday/bsvc")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModified;

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

    /**
     * Gets the value of the additionalNameType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalNameType() {
        return additionalNameType;
    }

    /**
     * Sets the value of the additionalNameType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalNameType(String value) {
        this.additionalNameType = value;
    }

    /**
     * Gets the value of the prefix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prefix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrefix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrefixNameDataType }
     * 
     * 
     */
    public List<PrefixNameDataType> getPrefix() {
        if (prefix == null) {
            prefix = new ArrayList<PrefixNameDataType>();
        }
        return this.prefix;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lastName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLastName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LastNameDataType }
     * 
     * 
     */
    public List<LastNameDataType> getLastName() {
        if (lastName == null) {
            lastName = new ArrayList<LastNameDataType>();
        }
        return this.lastName;
    }

    /**
     * Gets the value of the localNameData property.
     * 
     * @return
     *     possible object is
     *     {@link LocalNameDataType }
     *     
     */
    public LocalNameDataType getLocalNameData() {
        return localNameData;
    }

    /**
     * Sets the value of the localNameData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalNameDataType }
     *     
     */
    public void setLocalNameData(LocalNameDataType value) {
        this.localNameData = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suffix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuffix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SuffixNameDataType }
     * 
     * 
     */
    public List<SuffixNameDataType> getSuffix() {
        if (suffix == null) {
            suffix = new ArrayList<SuffixNameDataType>();
        }
        return this.suffix;
    }

    /**
     * Gets the value of the isLegal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLegal() {
        return isLegal;
    }

    /**
     * Sets the value of the isLegal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLegal(Boolean value) {
        this.isLegal = value;
    }

    /**
     * Gets the value of the isPreferred property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPreferred() {
        return isPreferred;
    }

    /**
     * Sets the value of the isPreferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPreferred(Boolean value) {
        this.isPreferred = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the lastModified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModified() {
        return lastModified;
    }

    /**
     * Sets the value of the lastModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModified(XMLGregorianCalendar value) {
        this.lastModified = value;
    }

}
