
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response element containing an instance of Location and its associated data.
 * 
 * <p>Java class for Location_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Location_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Location_Reference" type="{urn:com.workday/bsvc}LocationObjectType" minOccurs="0"/>
 *         &lt;element name="Location_Data" type="{urn:com.workday/bsvc}Location_iDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location_ResponseType", propOrder = {
    "locationReference",
    "locationData"
})
public class LocationResponseType {

    @XmlElement(name = "Location_Reference")
    protected LocationObjectType locationReference;
    @XmlElement(name = "Location_Data")
    protected LocationIDataType locationData;

    /**
     * Gets the value of the locationReference property.
     * 
     * @return
     *     possible object is
     *     {@link LocationObjectType }
     *     
     */
    public LocationObjectType getLocationReference() {
        return locationReference;
    }

    /**
     * Sets the value of the locationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationObjectType }
     *     
     */
    public void setLocationReference(LocationObjectType value) {
        this.locationReference = value;
    }

    /**
     * Gets the value of the locationData property.
     * 
     * @return
     *     possible object is
     *     {@link LocationIDataType }
     *     
     */
    public LocationIDataType getLocationData() {
        return locationData;
    }

    /**
     * Sets the value of the locationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationIDataType }
     *     
     */
    public void setLocationData(LocationIDataType value) {
        this.locationData = value;
    }

}
