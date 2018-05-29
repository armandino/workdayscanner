
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request element having the organization, positions to be added/removed and the effective date.
 * 
 * <p>Java class for Assign_Members_to_Custom_Organization_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Assign_Members_to_Custom_Organization_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Assign_Members_to_Custom_Organization_Reference" type="{urn:com.workday/bsvc}OrganizationObjectType"/>
 *         &lt;element name="Assign_Members_to_Custom_Organization_Data" type="{urn:com.workday/bsvc}Assign_Members_to_Custom_Organization_DataType" minOccurs="0"/>
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
@XmlType(name = "Assign_Members_to_Custom_Organization_RequestType", propOrder = {
    "assignMembersToCustomOrganizationReference",
    "assignMembersToCustomOrganizationData"
})
public class AssignMembersToCustomOrganizationRequestType {

    @XmlElement(name = "Assign_Members_to_Custom_Organization_Reference", required = true)
    protected OrganizationObjectType assignMembersToCustomOrganizationReference;
    @XmlElement(name = "Assign_Members_to_Custom_Organization_Data")
    protected AssignMembersToCustomOrganizationDataType assignMembersToCustomOrganizationData;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the assignMembersToCustomOrganizationReference property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationObjectType }
     *     
     */
    public OrganizationObjectType getAssignMembersToCustomOrganizationReference() {
        return assignMembersToCustomOrganizationReference;
    }

    /**
     * Sets the value of the assignMembersToCustomOrganizationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationObjectType }
     *     
     */
    public void setAssignMembersToCustomOrganizationReference(OrganizationObjectType value) {
        this.assignMembersToCustomOrganizationReference = value;
    }

    /**
     * Gets the value of the assignMembersToCustomOrganizationData property.
     * 
     * @return
     *     possible object is
     *     {@link AssignMembersToCustomOrganizationDataType }
     *     
     */
    public AssignMembersToCustomOrganizationDataType getAssignMembersToCustomOrganizationData() {
        return assignMembersToCustomOrganizationData;
    }

    /**
     * Sets the value of the assignMembersToCustomOrganizationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignMembersToCustomOrganizationDataType }
     *     
     */
    public void setAssignMembersToCustomOrganizationData(AssignMembersToCustomOrganizationDataType value) {
        this.assignMembersToCustomOrganizationData = value;
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
