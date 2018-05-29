
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing a brief summary of Location data.
 * 
 * <p>Java class for Location_Content_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Location_Content_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Integration_ID_Data" type="{urn:com.workday/bsvc}External_Integration_ID_DataType" minOccurs="0"/>
 *         &lt;element name="Location_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location_Type_Reference" type="{urn:com.workday/bsvc}Location_Type_Reference_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Time_Profile_Reference" type="{urn:com.workday/bsvc}Time_Profile_Reference_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location_Content_DataType", propOrder = {
    "integrationIDData",
    "locationName",
    "locationTypeReference",
    "timeProfileReference"
})
public class LocationContentDataType {

    @XmlElement(name = "Integration_ID_Data")
    protected ExternalIntegrationIDDataType integrationIDData;
    @XmlElement(name = "Location_Name")
    protected String locationName;
    @XmlElement(name = "Location_Type_Reference")
    protected List<LocationTypeReferenceDataType> locationTypeReference;
    @XmlElement(name = "Time_Profile_Reference")
    protected List<TimeProfileReferenceDataType> timeProfileReference;

    /**
     * Gets the value of the integrationIDData property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalIntegrationIDDataType }
     *     
     */
    public ExternalIntegrationIDDataType getIntegrationIDData() {
        return integrationIDData;
    }

    /**
     * Sets the value of the integrationIDData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalIntegrationIDDataType }
     *     
     */
    public void setIntegrationIDData(ExternalIntegrationIDDataType value) {
        this.integrationIDData = value;
    }

    /**
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationName(String value) {
        this.locationName = value;
    }

    /**
     * Gets the value of the locationTypeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationTypeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationTypeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationTypeReferenceDataType }
     * 
     * 
     */
    public List<LocationTypeReferenceDataType> getLocationTypeReference() {
        if (locationTypeReference == null) {
            locationTypeReference = new ArrayList<LocationTypeReferenceDataType>();
        }
        return this.locationTypeReference;
    }

    /**
     * Gets the value of the timeProfileReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeProfileReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeProfileReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeProfileReferenceDataType }
     * 
     * 
     */
    public List<TimeProfileReferenceDataType> getTimeProfileReference() {
        if (timeProfileReference == null) {
            timeProfileReference = new ArrayList<TimeProfileReferenceDataType>();
        }
        return this.timeProfileReference;
    }

}
