
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Location Attribute Web Service Element
 * 
 * <p>Java class for Location_AttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Location_AttributeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Location_Attribute_Reference" type="{urn:com.workday/bsvc}Location_AttributeObjectType"/>
 *         &lt;element name="Location_Attribute_Data" type="{urn:com.workday/bsvc}Location_Attribute_DataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location_AttributeType", propOrder = {
    "locationAttributeReference",
    "locationAttributeData"
})
public class LocationAttributeType {

    @XmlElement(name = "Location_Attribute_Reference", required = true)
    protected LocationAttributeObjectType locationAttributeReference;
    @XmlElement(name = "Location_Attribute_Data", required = true)
    protected LocationAttributeDataType locationAttributeData;

    /**
     * Gets the value of the locationAttributeReference property.
     * 
     * @return
     *     possible object is
     *     {@link LocationAttributeObjectType }
     *     
     */
    public LocationAttributeObjectType getLocationAttributeReference() {
        return locationAttributeReference;
    }

    /**
     * Sets the value of the locationAttributeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationAttributeObjectType }
     *     
     */
    public void setLocationAttributeReference(LocationAttributeObjectType value) {
        this.locationAttributeReference = value;
    }

    /**
     * Gets the value of the locationAttributeData property.
     * 
     * @return
     *     possible object is
     *     {@link LocationAttributeDataType }
     *     
     */
    public LocationAttributeDataType getLocationAttributeData() {
        return locationAttributeData;
    }

    /**
     * Sets the value of the locationAttributeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationAttributeDataType }
     *     
     */
    public void setLocationAttributeData(LocationAttributeDataType value) {
        this.locationAttributeData = value;
    }

}
