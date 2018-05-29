
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Utilize the following elements to Inactivate an existing Organization within the Workday system.
 * 
 * <p>Java class for Organization_InactivateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization_InactivateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Validate_Only" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Organization_Reference_Data" type="{urn:com.workday/bsvc}Organization_ReferenceType"/>
 *         &lt;element name="Organization_Inactivate_Data" type="{urn:com.workday/bsvc}Organization_Inactivate_DataType"/>
 *         &lt;element name="Keep_in_Hierarchy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Organization_for_Subordinates_Reference" type="{urn:com.workday/bsvc}OrganizationObjectType" minOccurs="0"/>
 *         &lt;element name="Organization_for_Included_Organizations_Reference" type="{urn:com.workday/bsvc}OrganizationObjectType" minOccurs="0"/>
 *         &lt;element name="Remove_All_Role_Assignments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "Organization_InactivateType", propOrder = {
    "validateOnly",
    "organizationReferenceData",
    "organizationInactivateData",
    "keepInHierarchy",
    "organizationForSubordinatesReference",
    "organizationForIncludedOrganizationsReference",
    "removeAllRoleAssignments"
})
public class OrganizationInactivateType {

    @XmlElement(name = "Validate_Only")
    protected Boolean validateOnly;
    @XmlElement(name = "Organization_Reference_Data", required = true)
    protected OrganizationReferenceType organizationReferenceData;
    @XmlElement(name = "Organization_Inactivate_Data", required = true)
    protected OrganizationInactivateDataType organizationInactivateData;
    @XmlElement(name = "Keep_in_Hierarchy")
    protected Boolean keepInHierarchy;
    @XmlElement(name = "Organization_for_Subordinates_Reference")
    protected OrganizationObjectType organizationForSubordinatesReference;
    @XmlElement(name = "Organization_for_Included_Organizations_Reference")
    protected OrganizationObjectType organizationForIncludedOrganizationsReference;
    @XmlElement(name = "Remove_All_Role_Assignments")
    protected Boolean removeAllRoleAssignments;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the validateOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidateOnly() {
        return validateOnly;
    }

    /**
     * Sets the value of the validateOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidateOnly(Boolean value) {
        this.validateOnly = value;
    }

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
     * Gets the value of the organizationInactivateData property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationInactivateDataType }
     *     
     */
    public OrganizationInactivateDataType getOrganizationInactivateData() {
        return organizationInactivateData;
    }

    /**
     * Sets the value of the organizationInactivateData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationInactivateDataType }
     *     
     */
    public void setOrganizationInactivateData(OrganizationInactivateDataType value) {
        this.organizationInactivateData = value;
    }

    /**
     * Gets the value of the keepInHierarchy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeepInHierarchy() {
        return keepInHierarchy;
    }

    /**
     * Sets the value of the keepInHierarchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeepInHierarchy(Boolean value) {
        this.keepInHierarchy = value;
    }

    /**
     * Gets the value of the organizationForSubordinatesReference property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationObjectType }
     *     
     */
    public OrganizationObjectType getOrganizationForSubordinatesReference() {
        return organizationForSubordinatesReference;
    }

    /**
     * Sets the value of the organizationForSubordinatesReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationObjectType }
     *     
     */
    public void setOrganizationForSubordinatesReference(OrganizationObjectType value) {
        this.organizationForSubordinatesReference = value;
    }

    /**
     * Gets the value of the organizationForIncludedOrganizationsReference property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationObjectType }
     *     
     */
    public OrganizationObjectType getOrganizationForIncludedOrganizationsReference() {
        return organizationForIncludedOrganizationsReference;
    }

    /**
     * Sets the value of the organizationForIncludedOrganizationsReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationObjectType }
     *     
     */
    public void setOrganizationForIncludedOrganizationsReference(OrganizationObjectType value) {
        this.organizationForIncludedOrganizationsReference = value;
    }

    /**
     * Gets the value of the removeAllRoleAssignments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoveAllRoleAssignments() {
        return removeAllRoleAssignments;
    }

    /**
     * Sets the value of the removeAllRoleAssignments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoveAllRoleAssignments(Boolean value) {
        this.removeAllRoleAssignments = value;
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
