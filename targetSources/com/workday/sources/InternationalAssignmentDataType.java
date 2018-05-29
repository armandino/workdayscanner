
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Wrapper element that contains position's international assignment information
 * 
 * <p>Java class for International_Assignment_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="International_Assignment_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="International_Assignment_Type_Reference" type="{urn:com.workday/bsvc}International_Assignment_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Start_International_Assignment_Reason_Reference" type="{urn:com.workday/bsvc}Event_Classification_SubcategoryObjectType" minOccurs="0"/>
 *         &lt;element name="Expected_Assignment_End_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Host_Country_Reference" type="{urn:com.workday/bsvc}CountryObjectType" minOccurs="0"/>
 *         &lt;element name="Home_Country_Reference" type="{urn:com.workday/bsvc}CountryObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "International_Assignment_DataType", propOrder = {
    "internationalAssignmentTypeReference",
    "startInternationalAssignmentReasonReference",
    "expectedAssignmentEndDate",
    "hostCountryReference",
    "homeCountryReference"
})
public class InternationalAssignmentDataType {

    @XmlElement(name = "International_Assignment_Type_Reference")
    protected InternationalAssignmentTypeObjectType internationalAssignmentTypeReference;
    @XmlElement(name = "Start_International_Assignment_Reason_Reference")
    protected EventClassificationSubcategoryObjectType startInternationalAssignmentReasonReference;
    @XmlElement(name = "Expected_Assignment_End_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expectedAssignmentEndDate;
    @XmlElement(name = "Host_Country_Reference")
    protected CountryObjectType hostCountryReference;
    @XmlElement(name = "Home_Country_Reference")
    protected CountryObjectType homeCountryReference;

    /**
     * Gets the value of the internationalAssignmentTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalAssignmentTypeObjectType }
     *     
     */
    public InternationalAssignmentTypeObjectType getInternationalAssignmentTypeReference() {
        return internationalAssignmentTypeReference;
    }

    /**
     * Sets the value of the internationalAssignmentTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalAssignmentTypeObjectType }
     *     
     */
    public void setInternationalAssignmentTypeReference(InternationalAssignmentTypeObjectType value) {
        this.internationalAssignmentTypeReference = value;
    }

    /**
     * Gets the value of the startInternationalAssignmentReasonReference property.
     * 
     * @return
     *     possible object is
     *     {@link EventClassificationSubcategoryObjectType }
     *     
     */
    public EventClassificationSubcategoryObjectType getStartInternationalAssignmentReasonReference() {
        return startInternationalAssignmentReasonReference;
    }

    /**
     * Sets the value of the startInternationalAssignmentReasonReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventClassificationSubcategoryObjectType }
     *     
     */
    public void setStartInternationalAssignmentReasonReference(EventClassificationSubcategoryObjectType value) {
        this.startInternationalAssignmentReasonReference = value;
    }

    /**
     * Gets the value of the expectedAssignmentEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedAssignmentEndDate() {
        return expectedAssignmentEndDate;
    }

    /**
     * Sets the value of the expectedAssignmentEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedAssignmentEndDate(XMLGregorianCalendar value) {
        this.expectedAssignmentEndDate = value;
    }

    /**
     * Gets the value of the hostCountryReference property.
     * 
     * @return
     *     possible object is
     *     {@link CountryObjectType }
     *     
     */
    public CountryObjectType getHostCountryReference() {
        return hostCountryReference;
    }

    /**
     * Sets the value of the hostCountryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryObjectType }
     *     
     */
    public void setHostCountryReference(CountryObjectType value) {
        this.hostCountryReference = value;
    }

    /**
     * Gets the value of the homeCountryReference property.
     * 
     * @return
     *     possible object is
     *     {@link CountryObjectType }
     *     
     */
    public CountryObjectType getHomeCountryReference() {
        return homeCountryReference;
    }

    /**
     * Sets the value of the homeCountryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryObjectType }
     *     
     */
    public void setHomeCountryReference(CountryObjectType value) {
        this.homeCountryReference = value;
    }

}
