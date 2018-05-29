
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Put Organization Assignment Restrictions Request
 * 
 * <p>Java class for Put_Organization_Assignment_Restrictions_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Organization_Assignment_Restrictions_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Organization_Assignment_Restrictions_Data" type="{urn:com.workday/bsvc}Organization_Assignment_Restrictions_DataType" minOccurs="0"/>
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
@XmlType(name = "Put_Organization_Assignment_Restrictions_RequestType", propOrder = {
    "organizationAssignmentRestrictionsData"
})
public class PutOrganizationAssignmentRestrictionsRequestType {

    @XmlElement(name = "Organization_Assignment_Restrictions_Data")
    protected OrganizationAssignmentRestrictionsDataType organizationAssignmentRestrictionsData;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

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
