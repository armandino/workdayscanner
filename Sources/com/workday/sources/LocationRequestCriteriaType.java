
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element containing filtering criteria to specify the Location to return in the response.
 * 
 * <p>Java class for Location_Request_CriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Location_Request_CriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Location_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location_Usage_Reference" type="{urn:com.workday/bsvc}Location_UsageObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Location_Type_Reference" type="{urn:com.workday/bsvc}Location_TypeObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="Exclude_Inactive_Locations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           &lt;element name="Exclude_Active_Locations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="Field_And_Parameter_Criteria_Data" type="{urn:com.workday/bsvc}Field_And_Parameter_Criteria_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location_Request_CriteriaType", propOrder = {
    "locationName",
    "locationUsageReference",
    "locationTypeReference",
    "excludeInactiveLocations",
    "excludeActiveLocations",
    "fieldAndParameterCriteriaData"
})
public class LocationRequestCriteriaType {

    @XmlElement(name = "Location_Name")
    protected String locationName;
    @XmlElement(name = "Location_Usage_Reference")
    protected List<LocationUsageObjectType> locationUsageReference;
    @XmlElement(name = "Location_Type_Reference")
    protected List<LocationTypeObjectType> locationTypeReference;
    @XmlElement(name = "Exclude_Inactive_Locations")
    protected Boolean excludeInactiveLocations;
    @XmlElement(name = "Exclude_Active_Locations")
    protected Boolean excludeActiveLocations;
    @XmlElement(name = "Field_And_Parameter_Criteria_Data")
    protected List<FieldAndParameterCriteriaDataType> fieldAndParameterCriteriaData;

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
     * {@link LocationTypeObjectType }
     * 
     * 
     */
    public List<LocationTypeObjectType> getLocationTypeReference() {
        if (locationTypeReference == null) {
            locationTypeReference = new ArrayList<LocationTypeObjectType>();
        }
        return this.locationTypeReference;
    }

    /**
     * Gets the value of the excludeInactiveLocations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeInactiveLocations() {
        return excludeInactiveLocations;
    }

    /**
     * Sets the value of the excludeInactiveLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeInactiveLocations(Boolean value) {
        this.excludeInactiveLocations = value;
    }

    /**
     * Gets the value of the excludeActiveLocations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeActiveLocations() {
        return excludeActiveLocations;
    }

    /**
     * Sets the value of the excludeActiveLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeActiveLocations(Boolean value) {
        this.excludeActiveLocations = value;
    }

    /**
     * Gets the value of the fieldAndParameterCriteriaData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldAndParameterCriteriaData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldAndParameterCriteriaData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldAndParameterCriteriaDataType }
     * 
     * 
     */
    public List<FieldAndParameterCriteriaDataType> getFieldAndParameterCriteriaData() {
        if (fieldAndParameterCriteriaData == null) {
            fieldAndParameterCriteriaData = new ArrayList<FieldAndParameterCriteriaDataType>();
        }
        return this.fieldAndParameterCriteriaData;
    }

}
