
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response element, returning only the organization.
 * 
 * <p>Java class for Assign_Members_to_Custom_Organization_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Assign_Members_to_Custom_Organization_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Assign_Workers_to_Custom_Organization_Reference" type="{urn:com.workday/bsvc}OrganizationObjectType" minOccurs="0"/>
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
@XmlType(name = "Assign_Members_to_Custom_Organization_ResponseType", propOrder = {
    "assignWorkersToCustomOrganizationReference"
})
public class AssignMembersToCustomOrganizationResponseType {

    @XmlElement(name = "Assign_Workers_to_Custom_Organization_Reference")
    protected OrganizationObjectType assignWorkersToCustomOrganizationReference;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the assignWorkersToCustomOrganizationReference property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationObjectType }
     *     
     */
    public OrganizationObjectType getAssignWorkersToCustomOrganizationReference() {
        return assignWorkersToCustomOrganizationReference;
    }

    /**
     * Sets the value of the assignWorkersToCustomOrganizationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationObjectType }
     *     
     */
    public void setAssignWorkersToCustomOrganizationReference(OrganizationObjectType value) {
        this.assignWorkersToCustomOrganizationReference = value;
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
