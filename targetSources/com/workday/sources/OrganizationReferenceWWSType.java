
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference element representing a unique instance of Organization.
 * 
 * <p>Java class for Organization_Reference_WWSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization_Reference_WWSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Integration_ID_Reference" type="{urn:com.workday/bsvc}External_Integration_ID_Reference_DataType" minOccurs="0"/>
 *         &lt;element name="Organization_ID_Reference" type="{urn:com.workday/bsvc}OrganizationObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization_Reference_WWSType", propOrder = {
    "integrationIDReference",
    "organizationIDReference"
})
public class OrganizationReferenceWWSType {

    @XmlElement(name = "Integration_ID_Reference")
    protected ExternalIntegrationIDReferenceDataType integrationIDReference;
    @XmlElement(name = "Organization_ID_Reference")
    protected OrganizationObjectType organizationIDReference;

    /**
     * Gets the value of the integrationIDReference property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalIntegrationIDReferenceDataType }
     *     
     */
    public ExternalIntegrationIDReferenceDataType getIntegrationIDReference() {
        return integrationIDReference;
    }

    /**
     * Sets the value of the integrationIDReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalIntegrationIDReferenceDataType }
     *     
     */
    public void setIntegrationIDReference(ExternalIntegrationIDReferenceDataType value) {
        this.integrationIDReference = value;
    }

    /**
     * Gets the value of the organizationIDReference property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationObjectType }
     *     
     */
    public OrganizationObjectType getOrganizationIDReference() {
        return organizationIDReference;
    }

    /**
     * Sets the value of the organizationIDReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationObjectType }
     *     
     */
    public void setOrganizationIDReference(OrganizationObjectType value) {
        this.organizationIDReference = value;
    }

}
