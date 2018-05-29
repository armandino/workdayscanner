
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Organization Assignments information for Location Hierarchy to be updated or returned.
 * 
 * <p>Java class for Location_Hierarchy_Organization_Assignments_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Location_Hierarchy_Organization_Assignments_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Location_Hierarchy_Reference" type="{urn:com.workday/bsvc}Location_HierarchyObjectType"/>
 *         &lt;element name="Location_Hierarchy_Organization_Assignments_by_Type_Data" type="{urn:com.workday/bsvc}Location_Hierarchy_Organization_Assignments_by_Type_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Replace_All" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location_Hierarchy_Organization_Assignments_DataType", propOrder = {
    "locationHierarchyReference",
    "locationHierarchyOrganizationAssignmentsByTypeData"
})
public class LocationHierarchyOrganizationAssignmentsDataType {

    @XmlElement(name = "Location_Hierarchy_Reference", required = true)
    protected LocationHierarchyObjectType locationHierarchyReference;
    @XmlElement(name = "Location_Hierarchy_Organization_Assignments_by_Type_Data")
    protected List<LocationHierarchyOrganizationAssignmentsByTypeDataType> locationHierarchyOrganizationAssignmentsByTypeData;
    @XmlAttribute(name = "Replace_All", namespace = "urn:com.workday/bsvc")
    protected Boolean replaceAll;

    /**
     * Gets the value of the locationHierarchyReference property.
     * 
     * @return
     *     possible object is
     *     {@link LocationHierarchyObjectType }
     *     
     */
    public LocationHierarchyObjectType getLocationHierarchyReference() {
        return locationHierarchyReference;
    }

    /**
     * Sets the value of the locationHierarchyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationHierarchyObjectType }
     *     
     */
    public void setLocationHierarchyReference(LocationHierarchyObjectType value) {
        this.locationHierarchyReference = value;
    }

    /**
     * Gets the value of the locationHierarchyOrganizationAssignmentsByTypeData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationHierarchyOrganizationAssignmentsByTypeData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationHierarchyOrganizationAssignmentsByTypeData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationHierarchyOrganizationAssignmentsByTypeDataType }
     * 
     * 
     */
    public List<LocationHierarchyOrganizationAssignmentsByTypeDataType> getLocationHierarchyOrganizationAssignmentsByTypeData() {
        if (locationHierarchyOrganizationAssignmentsByTypeData == null) {
            locationHierarchyOrganizationAssignmentsByTypeData = new ArrayList<LocationHierarchyOrganizationAssignmentsByTypeDataType>();
        }
        return this.locationHierarchyOrganizationAssignmentsByTypeData;
    }

    /**
     * Gets the value of the replaceAll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReplaceAll() {
        return replaceAll;
    }

    /**
     * Sets the value of the replaceAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReplaceAll(Boolean value) {
        this.replaceAll = value;
    }

}
