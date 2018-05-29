
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response element containing an instance of Organization and its associated data.
 * 
 * <p>Java class for Organization_WWSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization_WWSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Organization_Reference" type="{urn:com.workday/bsvc}OrganizationObjectType" minOccurs="0"/>
 *         &lt;element name="Organization_Data" type="{urn:com.workday/bsvc}Organization_WWS_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization_WWSType", propOrder = {
    "organizationReference",
    "organizationData"
})
public class OrganizationWWSType {

    @XmlElement(name = "Organization_Reference")
    protected OrganizationObjectType organizationReference;
    @XmlElement(name = "Organization_Data")
    protected OrganizationWWSDataType organizationData;

    /**
     * Gets the value of the organizationReference property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationObjectType }
     *     
     */
    public OrganizationObjectType getOrganizationReference() {
        return organizationReference;
    }

    /**
     * Sets the value of the organizationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationObjectType }
     *     
     */
    public void setOrganizationReference(OrganizationObjectType value) {
        this.organizationReference = value;
    }

    /**
     * Gets the value of the organizationData property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationWWSDataType }
     *     
     */
    public OrganizationWWSDataType getOrganizationData() {
        return organizationData;
    }

    /**
     * Sets the value of the organizationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationWWSDataType }
     *     
     */
    public void setOrganizationData(OrganizationWWSDataType value) {
        this.organizationData = value;
    }

}
