
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the organization reference and details about an organization.
 * 
 * <p>Java class for Worker_Organization_Membership_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Organization_Membership_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Organization_Reference" type="{urn:com.workday/bsvc}Position_SetObjectType"/>
 *         &lt;element name="Organization_Data" type="{urn:com.workday/bsvc}Organization_Summary_DataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Organization_Membership_DataType", propOrder = {
    "organizationReference",
    "organizationData"
})
public class WorkerOrganizationMembershipDataType {

    @XmlElement(name = "Organization_Reference", required = true)
    protected PositionSetObjectType organizationReference;
    @XmlElement(name = "Organization_Data", required = true)
    protected OrganizationSummaryDataType organizationData;

    /**
     * Gets the value of the organizationReference property.
     * 
     * @return
     *     possible object is
     *     {@link PositionSetObjectType }
     *     
     */
    public PositionSetObjectType getOrganizationReference() {
        return organizationReference;
    }

    /**
     * Sets the value of the organizationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionSetObjectType }
     *     
     */
    public void setOrganizationReference(PositionSetObjectType value) {
        this.organizationReference = value;
    }

    /**
     * Gets the value of the organizationData property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationSummaryDataType }
     *     
     */
    public OrganizationSummaryDataType getOrganizationData() {
        return organizationData;
    }

    /**
     * Sets the value of the organizationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationSummaryDataType }
     *     
     */
    public void setOrganizationData(OrganizationSummaryDataType value) {
        this.organizationData = value;
    }

}
