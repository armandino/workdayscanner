
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference element representing a unique instance of Authority.
 * 
 * <p>Java class for Authority_ReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Authority_ReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Authority_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Regulatory_Region_Organization_Reference" type="{urn:com.workday/bsvc}Organization_ReferenceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Authority_ReferenceType", propOrder = {
    "authorityName",
    "regulatoryRegionOrganizationReference"
})
public class AuthorityReferenceType {

    @XmlElement(name = "Authority_Name", required = true)
    protected String authorityName;
    @XmlElement(name = "Regulatory_Region_Organization_Reference")
    protected OrganizationReferenceType regulatoryRegionOrganizationReference;

    /**
     * Gets the value of the authorityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorityName() {
        return authorityName;
    }

    /**
     * Sets the value of the authorityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorityName(String value) {
        this.authorityName = value;
    }

    /**
     * Gets the value of the regulatoryRegionOrganizationReference property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationReferenceType }
     *     
     */
    public OrganizationReferenceType getRegulatoryRegionOrganizationReference() {
        return regulatoryRegionOrganizationReference;
    }

    /**
     * Sets the value of the regulatoryRegionOrganizationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationReferenceType }
     *     
     */
    public void setRegulatoryRegionOrganizationReference(OrganizationReferenceType value) {
        this.regulatoryRegionOrganizationReference = value;
    }

}
