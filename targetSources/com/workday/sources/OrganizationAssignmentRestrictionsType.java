
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Organization Assignment Restrictions Response Data
 * 
 * <p>Java class for Organization_Assignment_RestrictionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization_Assignment_RestrictionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Organization_Assignment_Restrictions_Data" type="{urn:com.workday/bsvc}Organization_Assignment_Restrictions_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization_Assignment_RestrictionsType", propOrder = {
    "organizationAssignmentRestrictionsData"
})
public class OrganizationAssignmentRestrictionsType {

    @XmlElement(name = "Organization_Assignment_Restrictions_Data")
    protected OrganizationAssignmentRestrictionsDataType organizationAssignmentRestrictionsData;

    /**
     * Gets the value of the organizationAssignmentRestrictionsData property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationAssignmentRestrictionsDataType }
     *     
     */
    public OrganizationAssignmentRestrictionsDataType getOrganizationAssignmentRestrictionsData() {
        return organizationAssignmentRestrictionsData;
    }

    /**
     * Sets the value of the organizationAssignmentRestrictionsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationAssignmentRestrictionsDataType }
     *     
     */
    public void setOrganizationAssignmentRestrictionsData(OrganizationAssignmentRestrictionsDataType value) {
        this.organizationAssignmentRestrictionsData = value;
    }

}
