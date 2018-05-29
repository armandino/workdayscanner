
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for the 'Reassign Superior to Inactive Organization' web service.
 * 
 * <p>Java class for Reassign_Superior_to_Inactive_Organization_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Reassign_Superior_to_Inactive_Organization_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Organization_Inactive_Reference" type="{urn:com.workday/bsvc}OrganizationObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reassign_Superior_to_Inactive_Organization_DataType", propOrder = {
    "organizationInactiveReference"
})
public class ReassignSuperiorToInactiveOrganizationDataType {

    @XmlElement(name = "Organization_Inactive_Reference")
    protected OrganizationObjectType organizationInactiveReference;

    /**
     * Gets the value of the organizationInactiveReference property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationObjectType }
     *     
     */
    public OrganizationObjectType getOrganizationInactiveReference() {
        return organizationInactiveReference;
    }

    /**
     * Sets the value of the organizationInactiveReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationObjectType }
     *     
     */
    public void setOrganizationInactiveReference(OrganizationObjectType value) {
        this.organizationInactiveReference = value;
    }

}
