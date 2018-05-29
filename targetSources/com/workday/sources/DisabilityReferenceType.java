
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference element representing a unique instance of Disability.  Does not support the update of Disability Status.  Use Put Applicant web service to update the Disability Status for a Person.
 * 
 * <p>Java class for Disability_ReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Disability_ReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Disability_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Regulatory_Region_Organization_Reference" type="{urn:com.workday/bsvc}Organization_ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Disability_ReferenceType", propOrder = {
    "disabilityName",
    "regulatoryRegionOrganizationReference"
})
public class DisabilityReferenceType {

    @XmlElement(name = "Disability_Name", required = true)
    protected String disabilityName;
    @XmlElement(name = "Regulatory_Region_Organization_Reference")
    protected List<OrganizationReferenceType> regulatoryRegionOrganizationReference;

    /**
     * Gets the value of the disabilityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisabilityName() {
        return disabilityName;
    }

    /**
     * Sets the value of the disabilityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisabilityName(String value) {
        this.disabilityName = value;
    }

    /**
     * Gets the value of the regulatoryRegionOrganizationReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regulatoryRegionOrganizationReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegulatoryRegionOrganizationReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationReferenceType }
     * 
     * 
     */
    public List<OrganizationReferenceType> getRegulatoryRegionOrganizationReference() {
        if (regulatoryRegionOrganizationReference == null) {
            regulatoryRegionOrganizationReference = new ArrayList<OrganizationReferenceType>();
        }
        return this.regulatoryRegionOrganizationReference;
    }

}
