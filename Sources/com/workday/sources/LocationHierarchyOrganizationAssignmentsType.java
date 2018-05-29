
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Location Hierarchy Organization Assignments
 * 
 * <p>Java class for Location_Hierarchy_Organization_AssignmentsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Location_Hierarchy_Organization_AssignmentsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Location_Hierarchy_Organization_Assignments_Data" type="{urn:com.workday/bsvc}Location_Hierarchy_Organization_Assignments_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location_Hierarchy_Organization_AssignmentsType", propOrder = {
    "locationHierarchyOrganizationAssignmentsData"
})
public class LocationHierarchyOrganizationAssignmentsType {

    @XmlElement(name = "Location_Hierarchy_Organization_Assignments_Data")
    protected List<LocationHierarchyOrganizationAssignmentsDataType> locationHierarchyOrganizationAssignmentsData;

    /**
     * Gets the value of the locationHierarchyOrganizationAssignmentsData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationHierarchyOrganizationAssignmentsData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationHierarchyOrganizationAssignmentsData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationHierarchyOrganizationAssignmentsDataType }
     * 
     * 
     */
    public List<LocationHierarchyOrganizationAssignmentsDataType> getLocationHierarchyOrganizationAssignmentsData() {
        if (locationHierarchyOrganizationAssignmentsData == null) {
            locationHierarchyOrganizationAssignmentsData = new ArrayList<LocationHierarchyOrganizationAssignmentsDataType>();
        }
        return this.locationHierarchyOrganizationAssignmentsData;
    }

}
