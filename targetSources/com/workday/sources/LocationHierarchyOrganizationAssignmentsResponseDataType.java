
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Returned information from the Location Hierarchy Organization Assignments request.
 * 
 * <p>Java class for Location_Hierarchy_Organization_Assignments_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Location_Hierarchy_Organization_Assignments_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Location_Hierarchy_Organization_Assignments" type="{urn:com.workday/bsvc}Location_Hierarchy_Organization_AssignmentsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location_Hierarchy_Organization_Assignments_Response_DataType", propOrder = {
    "locationHierarchyOrganizationAssignments"
})
public class LocationHierarchyOrganizationAssignmentsResponseDataType {

    @XmlElement(name = "Location_Hierarchy_Organization_Assignments")
    protected List<LocationHierarchyOrganizationAssignmentsType> locationHierarchyOrganizationAssignments;

    /**
     * Gets the value of the locationHierarchyOrganizationAssignments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationHierarchyOrganizationAssignments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationHierarchyOrganizationAssignments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationHierarchyOrganizationAssignmentsType }
     * 
     * 
     */
    public List<LocationHierarchyOrganizationAssignmentsType> getLocationHierarchyOrganizationAssignments() {
        if (locationHierarchyOrganizationAssignments == null) {
            locationHierarchyOrganizationAssignments = new ArrayList<LocationHierarchyOrganizationAssignmentsType>();
        }
        return this.locationHierarchyOrganizationAssignments;
    }

}
