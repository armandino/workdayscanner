
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Response element containing an instance of Location and its associated data.
 * 
 * <p>Java class for Business_SiteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Business_SiteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Location_Reference" type="{urn:com.workday/bsvc}Business_Site_Reference_DataType" minOccurs="0"/>
 *         &lt;element name="Location_Data" type="{urn:com.workday/bsvc}Location_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="As_Of_Moment" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute ref="{urn:com.workday/bsvc}version"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Business_SiteType", propOrder = {
    "locationReference",
    "locationData"
})
public class BusinessSiteType {

    @XmlElement(name = "Location_Reference")
    protected BusinessSiteReferenceDataType locationReference;
    @XmlElement(name = "Location_Data")
    protected LocationDataType locationData;
    @XmlAttribute(name = "As_Of_Moment", namespace = "urn:com.workday/bsvc")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar asOfMoment;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the locationReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessSiteReferenceDataType }
     *     
     */
    public BusinessSiteReferenceDataType getLocationReference() {
        return locationReference;
    }

    /**
     * Sets the value of the locationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessSiteReferenceDataType }
     *     
     */
    public void setLocationReference(BusinessSiteReferenceDataType value) {
        this.locationReference = value;
    }

    /**
     * Gets the value of the locationData property.
     * 
     * @return
     *     possible object is
     *     {@link LocationDataType }
     *     
     */
    public LocationDataType getLocationData() {
        return locationData;
    }

    /**
     * Sets the value of the locationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationDataType }
     *     
     */
    public void setLocationData(LocationDataType value) {
        this.locationData = value;
    }

    /**
     * Gets the value of the asOfMoment property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAsOfMoment() {
        return asOfMoment;
    }

    /**
     * Sets the value of the asOfMoment property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAsOfMoment(XMLGregorianCalendar value) {
        this.asOfMoment = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
