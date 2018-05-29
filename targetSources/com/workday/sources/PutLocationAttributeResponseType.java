
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Web Service Element for Put Location Attribute Response
 * 
 * <p>Java class for Put_Location_Attribute_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Location_Attribute_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Location_Attribute_Reference" type="{urn:com.workday/bsvc}Location_AttributeObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{urn:com.workday/bsvc}version"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Put_Location_Attribute_ResponseType", propOrder = {
    "locationAttributeReference"
})
public class PutLocationAttributeResponseType {

    @XmlElement(name = "Location_Attribute_Reference")
    protected LocationAttributeObjectType locationAttributeReference;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

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
