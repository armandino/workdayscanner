
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * References to Location Hierarchies for which to request their Organization Assignments. Can take one or more references
 * 
 * <p>Java class for Location_Hierarchy_Organization_Assignments_Request_ReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Location_Hierarchy_Organization_Assignments_Request_ReferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Location_Hierarchy_Reference" type="{urn:com.workday/bsvc}Location_HierarchyObjectType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location_Hierarchy_Organization_Assignments_Request_ReferencesType", propOrder = {
    "locationHierarchyReference"
})
public class LocationHierarchyOrganizationAssignmentsRequestReferencesType {

    @XmlElement(name = "Location_Hierarchy_Reference", required = true)
    protected List<LocationHierarchyObjectType> locationHierarchyReference;

    /**
     * Gets the value of the locationHierarchyReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationHierarchyReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationHierarchyReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationHierarchyObjectType }
     * 
     * 
     */
    public List<LocationHierarchyObjectType> getLocationHierarchyReference() {
        if (locationHierarchyReference == null) {
            locationHierarchyReference = new ArrayList<LocationHierarchyObjectType>();
        }
        return this.locationHierarchyReference;
    }

}
