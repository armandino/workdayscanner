
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference element representing a unique instance of Organization that contains or includes other Organizations. An organization can be included in multiple hierarchies, but it can only be included in one node in each top level hierarchy for any given effective date.
 * 
 * <p>Java class for Container_Organization_Reference_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Container_Organization_Reference_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Organization_Reference" type="{urn:com.workday/bsvc}Organization_ReferenceType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Container_Organization_Reference_DataType", propOrder = {
    "organizationReference"
})
public class ContainerOrganizationReferenceDataType {

    @XmlElement(name = "Organization_Reference", required = true)
    protected OrganizationReferenceType organizationReference;

    /**
     * Gets the value of the organizationReference property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationReferenceType }
     *     
     */
    public OrganizationReferenceType getOrganizationReference() {
        return organizationReference;
    }

    /**
     * Sets the value of the organizationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationReferenceType }
     *     
     */
    public void setOrganizationReference(OrganizationReferenceType value) {
        this.organizationReference = value;
    }

}
