
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference element representing a unique instance of Location.
 * 
 * <p>Java class for Location_Reference_WWSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Location_Reference_WWSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Integration_ID_Reference" type="{urn:com.workday/bsvc}External_Integration_ID_Reference_DataType" minOccurs="0"/>
 *         &lt;element name="Location_ID_Reference" type="{urn:com.workday/bsvc}LocationObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location_Reference_WWSType", propOrder = {
    "integrationIDReference",
    "locationIDReference"
})
public class LocationReferenceWWSType {

    @XmlElement(name = "Integration_ID_Reference")
    protected ExternalIntegrationIDReferenceDataType integrationIDReference;
    @XmlElement(name = "Location_ID_Reference")
    protected LocationObjectType locationIDReference;

    /**
     * Gets the value of the integrationIDReference property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalIntegrationIDReferenceDataType }
     *     
     */
    public ExternalIntegrationIDReferenceDataType getIntegrationIDReference() {
        return integrationIDReference;
    }

    /**
     * Sets the value of the integrationIDReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalIntegrationIDReferenceDataType }
     *     
     */
    public void setIntegrationIDReference(ExternalIntegrationIDReferenceDataType value) {
        this.integrationIDReference = value;
    }

    /**
     * Gets the value of the locationIDReference property.
     * 
     * @return
     *     possible object is
     *     {@link LocationObjectType }
     *     
     */
    public LocationObjectType getLocationIDReference() {
        return locationIDReference;
    }

    /**
     * Sets the value of the locationIDReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationObjectType }
     *     
     */
    public void setLocationIDReference(LocationObjectType value) {
        this.locationIDReference = value;
    }

}
