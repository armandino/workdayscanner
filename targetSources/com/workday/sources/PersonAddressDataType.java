
package com.workday.sources;

import java.math.BigDecimal;
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
 * Encapsulating element for updating a single address.
 * 
 * <p>Java class for Person_Address_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Person_Address_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address_Data" type="{urn:com.workday/bsvc}Address_Core_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Usage_Data" type="{urn:com.workday/bsvc}Communication_Method_Usage_Information_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Number_of_Days" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="1"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Days_of_the_Week_Reference" type="{urn:com.workday/bsvc}Day_of_the_WeekObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Address_Reference" type="{urn:com.workday/bsvc}Address_ReferenceObjectType" minOccurs="0"/>
 *         &lt;element name="Address_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Address_Format_Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Delete" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Effective_Date" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person_Address_DataType", propOrder = {
    "addressData",
    "usageData",
    "numberOfDays",
    "daysOfTheWeekReference",
    "addressReference",
    "addressID"
})
public class PersonAddressDataType {

    @XmlElement(name = "Address_Data")
    protected List<AddressCoreDataType> addressData;
    @XmlElement(name = "Usage_Data")
    protected List<CommunicationMethodUsageInformationDataType> usageData;
    @XmlElement(name = "Number_of_Days")
    protected BigDecimal numberOfDays;
    @XmlElement(name = "Days_of_the_Week_Reference")
    protected List<DayOfTheWeekObjectType> daysOfTheWeekReference;
    @XmlElement(name = "Address_Reference")
    protected AddressReferenceObjectType addressReference;
    @XmlElement(name = "Address_ID")
    protected String addressID;
    @XmlAttribute(name = "Address_Format_Type", namespace = "urn:com.workday/bsvc")
    protected String addressFormatType;
    @XmlAttribute(name = "Delete", namespace = "urn:com.workday/bsvc")
    protected Boolean delete;
    @XmlAttribute(name = "Effective_Date", namespace = "urn:com.workday/bsvc")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;

    /**
     * Gets the value of the addressData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressCoreDataType }
     * 
     * 
     */
    public List<AddressCoreDataType> getAddressData() {
        if (addressData == null) {
            addressData = new ArrayList<AddressCoreDataType>();
        }
        return this.addressData;
    }

    /**
     * Gets the value of the usageData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usageData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsageData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicationMethodUsageInformationDataType }
     * 
     * 
     */
    public List<CommunicationMethodUsageInformationDataType> getUsageData() {
        if (usageData == null) {
            usageData = new ArrayList<CommunicationMethodUsageInformationDataType>();
        }
        return this.usageData;
    }

    /**
     * Gets the value of the numberOfDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumberOfDays() {
        return numberOfDays;
    }

    /**
     * Sets the value of the numberOfDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumberOfDays(BigDecimal value) {
        this.numberOfDays = value;
    }

    /**
     * Gets the value of the daysOfTheWeekReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the daysOfTheWeekReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDaysOfTheWeekReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DayOfTheWeekObjectType }
     * 
     * 
     */
    public List<DayOfTheWeekObjectType> getDaysOfTheWeekReference() {
        if (daysOfTheWeekReference == null) {
            daysOfTheWeekReference = new ArrayList<DayOfTheWeekObjectType>();
        }
        return this.daysOfTheWeekReference;
    }

    /**
     * Gets the value of the addressReference property.
     * 
     * @return
     *     possible object is
     *     {@link AddressReferenceObjectType }
     *     
     */
    public AddressReferenceObjectType getAddressReference() {
        return addressReference;
    }

    /**
     * Sets the value of the addressReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressReferenceObjectType }
     *     
     */
    public void setAddressReference(AddressReferenceObjectType value) {
        this.addressReference = value;
    }

    /**
     * Gets the value of the addressID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressID() {
        return addressID;
    }

    /**
     * Sets the value of the addressID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressID(String value) {
        this.addressID = value;
    }

    /**
     * Gets the value of the addressFormatType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressFormatType() {
        return addressFormatType;
    }

    /**
     * Sets the value of the addressFormatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressFormatType(String value) {
        this.addressFormatType = value;
    }

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

}
