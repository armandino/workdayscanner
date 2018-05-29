
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Utilize the following elements to Dissolve an existing Organization Structure within the Workday system.
 * 
 * <p>Java class for Organization_Structure_DissolveType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization_Structure_DissolveType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Organization_Reference_Data" type="{urn:com.workday/bsvc}Organization_ReferenceType"/>
 *         &lt;element name="Organization_Structure_Dissolve_Data" type="{urn:com.workday/bsvc}Organization_Structure_Dissolve_DataType"/>
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
@XmlType(name = "Organization_Structure_DissolveType", propOrder = {
    "organizationReferenceData",
    "organizationStructureDissolveData"
})
public class OrganizationStructureDissolveType {

    @XmlElement(name = "Organization_Reference_Data", required = true)
    protected OrganizationReferenceType organizationReferenceData;
    @XmlElement(name = "Organization_Structure_Dissolve_Data", required = true)
    protected OrganizationStructureDissolveDataType organizationStructureDissolveData;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the organizationReferenceData property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationReferenceType }
     *     
     */
    public OrganizationReferenceType getOrganizationReferenceData() {
        return organizationReferenceData;
    }

    /**
     * Sets the value of the organizationReferenceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationReferenceType }
     *     
     */
    public void setOrganizationReferenceData(OrganizationReferenceType value) {
        this.organizationReferenceData = value;
    }

    /**
     * Gets the value of the organizationStructureDissolveData property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationStructureDissolveDataType }
     *     
     */
    public OrganizationStructureDissolveDataType getOrganizationStructureDissolveData() {
        return organizationStructureDissolveData;
    }

    /**
     * Sets the value of the organizationStructureDissolveData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationStructureDissolveDataType }
     *     
     */
    public void setOrganizationStructureDissolveData(OrganizationStructureDissolveDataType value) {
        this.organizationStructureDissolveData = value;
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
