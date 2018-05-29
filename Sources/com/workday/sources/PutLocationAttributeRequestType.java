
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Web Service Element for Put Location Attribute Requests
 * 
 * <p>Java class for Put_Location_Attribute_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Location_Attribute_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Location_Attribute_Reference" type="{urn:com.workday/bsvc}Location_AttributeObjectType" minOccurs="0"/>
 *         &lt;element name="Location_Attribute_Data" type="{urn:com.workday/bsvc}Location_Attribute_DataType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Add_Only" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute ref="{urn:com.workday/bsvc}version"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Put_Location_Attribute_RequestType", propOrder = {
    "locationAttributeReference",
    "locationAttributeData"
})
public class PutLocationAttributeRequestType {

    @XmlElement(name = "Location_Attribute_Reference")
    protected LocationAttributeObjectType locationAttributeReference;
    @XmlElement(name = "Location_Attribute_Data", required = true)
    protected LocationAttributeDataType locationAttributeData;
    @XmlAttribute(name = "Add_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean addOnly;
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

    /**
     * Gets the value of the addOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddOnly() {
        return addOnly;
    }

    /**
     * Sets the value of the addOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddOnly(Boolean value) {
        this.addOnly = value;
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
