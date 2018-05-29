
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference element representing a unique instance of Ethnicity.  Ethnicity is a singular relationship with Demographic Data as of 8.  For certain tenants, especially US Public Sector Higher Education, Ethnicity may be a non-singluar relationship (as of V13).
 * 
 * <p>Java class for Ethnicity_ReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ethnicity_ReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ethnicity_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "Ethnicity_ReferenceType", propOrder = {
    "ethnicityName",
    "regulatoryRegionOrganizationReference"
})
public class EthnicityReferenceType {

    @XmlElement(name = "Ethnicity_Name", required = true)
    protected String ethnicityName;
    @XmlElement(name = "Regulatory_Region_Organization_Reference")
    protected OrganizationReferenceType regulatoryRegionOrganizationReference;

    /**
     * Gets the value of the ethnicityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEthnicityName() {
        return ethnicityName;
    }

    /**
     * Sets the value of the ethnicityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEthnicityName(String value) {
        this.ethnicityName = value;
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
