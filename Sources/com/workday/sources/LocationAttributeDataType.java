
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Web Service Element holding Location Attribute Data
 * 
 * <p>Java class for Location_Attribute_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Location_Attribute_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location_Attribute_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Location_Usage_Reference" type="{urn:com.workday/bsvc}Location_UsageObjectType" maxOccurs="unbounded"/>
 *         &lt;element name="Location_Attribute_Inactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location_Attribute_DataType", propOrder = {
    "id",
    "locationAttributeName",
    "locationUsageReference",
    "locationAttributeInactive"
})
public class LocationAttributeDataType {

    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "Location_Attribute_Name", required = true)
    protected String locationAttributeName;
    @XmlElement(name = "Location_Usage_Reference", required = true)
    protected List<LocationUsageObjectType> locationUsageReference;
    @XmlElement(name = "Location_Attribute_Inactive")
    protected Boolean locationAttributeInactive;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the locationAttributeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationAttributeName() {
        return locationAttributeName;
    }

    /**
     * Sets the value of the locationAttributeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationAttributeName(String value) {
        this.locationAttributeName = value;
    }

    /**
     * Gets the value of the locationUsageReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationUsageReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationUsageReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationUsageObjectType }
     * 
     * 
     */
    public List<LocationUsageObjectType> getLocationUsageReference() {
        if (locationUsageReference == null) {
            locationUsageReference = new ArrayList<LocationUsageObjectType>();
        }
        return this.locationUsageReference;
    }

    /**
     * Gets the value of the locationAttributeInactive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocationAttributeInactive() {
        return locationAttributeInactive;
    }

    /**
     * Sets the value of the locationAttributeInactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocationAttributeInactive(Boolean value) {
        this.locationAttributeInactive = value;
    }

}
