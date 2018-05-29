
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request Element for Location Hierarchy Organization Assignment.
 * 
 * <p>Java class for Put_Location_Hierarchy_Organization_Assignments_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Location_Hierarchy_Organization_Assignments_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Location_Hierarchy_Organization_Assignments_Data" type="{urn:com.workday/bsvc}Location_Hierarchy_Organization_Assignments_DataType" minOccurs="0"/>
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
@XmlType(name = "Put_Location_Hierarchy_Organization_Assignments_RequestType", propOrder = {
    "locationHierarchyOrganizationAssignmentsData"
})
public class PutLocationHierarchyOrganizationAssignmentsRequestType {

    @XmlElement(name = "Location_Hierarchy_Organization_Assignments_Data")
    protected LocationHierarchyOrganizationAssignmentsDataType locationHierarchyOrganizationAssignmentsData;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the locationHierarchyOrganizationAssignmentsData property.
     * 
     * @return
     *     possible object is
     *     {@link LocationHierarchyOrganizationAssignmentsDataType }
     *     
     */
    public LocationHierarchyOrganizationAssignmentsDataType getLocationHierarchyOrganizationAssignmentsData() {
        return locationHierarchyOrganizationAssignmentsData;
    }

    /**
     * Sets the value of the locationHierarchyOrganizationAssignmentsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationHierarchyOrganizationAssignmentsDataType }
     *     
     */
    public void setLocationHierarchyOrganizationAssignmentsData(LocationHierarchyOrganizationAssignmentsDataType value) {
        this.locationHierarchyOrganizationAssignmentsData = value;
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
