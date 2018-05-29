
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Put Location Hierarchy Organization Assignments responds with the Location Hierarchy whose Organization Assignments have been updated.
 * 
 * <p>Java class for Put_Location_Hierarchy_Organization_Assignments_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Location_Hierarchy_Organization_Assignments_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Location_Hierarchy_Reference" type="{urn:com.workday/bsvc}Location_HierarchyObjectType" minOccurs="0"/>
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
@XmlType(name = "Put_Location_Hierarchy_Organization_Assignments_ResponseType", propOrder = {
    "locationHierarchyReference"
})
public class PutLocationHierarchyOrganizationAssignmentsResponseType {

    @XmlElement(name = "Location_Hierarchy_Reference")
    protected LocationHierarchyObjectType locationHierarchyReference;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

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
