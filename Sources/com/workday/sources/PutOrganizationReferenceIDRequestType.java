
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request for Put Organization Reference ID
 * 
 * <p>Java class for Put_Organization_Reference_ID_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Organization_Reference_ID_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Organization_Reference" type="{urn:com.workday/bsvc}OrganizationObjectType" minOccurs="0"/>
 *         &lt;element name="Organization_Reference_ID_Data" type="{urn:com.workday/bsvc}Organization_Reference_ID_Reference_DataType" minOccurs="0"/>
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
@XmlType(name = "Put_Organization_Reference_ID_RequestType", propOrder = {
    "organizationReference",
    "organizationReferenceIDData"
})
public class PutOrganizationReferenceIDRequestType {

    @XmlElement(name = "Organization_Reference")
    protected OrganizationObjectType organizationReference;
    @XmlElement(name = "Organization_Reference_ID_Data")
    protected OrganizationReferenceIDReferenceDataType organizationReferenceIDData;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

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
     * Gets the value of the organizationReferenceIDData property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationReferenceIDReferenceDataType }
     *     
     */
    public OrganizationReferenceIDReferenceDataType getOrganizationReferenceIDData() {
        return organizationReferenceIDData;
    }

    /**
     * Sets the value of the organizationReferenceIDData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationReferenceIDReferenceDataType }
     *     
     */
    public void setOrganizationReferenceIDData(OrganizationReferenceIDReferenceDataType value) {
        this.organizationReferenceIDData = value;
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
