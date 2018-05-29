
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Contains the details about the organization.
 * 
 * <p>Java class for Organization_Summary_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization_Summary_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Organization_Reference_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organization_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Integration_ID_Data" type="{urn:com.workday/bsvc}External_Integration_ID_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Organization_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organization_Type_Reference" type="{urn:com.workday/bsvc}Organization_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Organization_Subtype_Reference" type="{urn:com.workday/bsvc}Organization_SubtypeObjectType" minOccurs="0"/>
 *         &lt;element name="Primary_Business_Site_Reference" type="{urn:com.workday/bsvc}LocationObjectType" minOccurs="0"/>
 *         &lt;element name="Organization_Support_Role_Data" type="{urn:com.workday/bsvc}Organization_Support_RoleType" minOccurs="0"/>
 *         &lt;element name="Date_of_Pay_Group_Assignment" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Used_in_Change_Organization_Assignments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization_Summary_DataType", propOrder = {
    "organizationReferenceID",
    "organizationCode",
    "integrationIDData",
    "organizationName",
    "organizationTypeReference",
    "organizationSubtypeReference",
    "primaryBusinessSiteReference",
    "organizationSupportRoleData",
    "dateOfPayGroupAssignment",
    "usedInChangeOrganizationAssignments"
})
public class OrganizationSummaryDataType {

    @XmlElement(name = "Organization_Reference_ID")
    protected String organizationReferenceID;
    @XmlElement(name = "Organization_Code")
    protected String organizationCode;
    @XmlElement(name = "Integration_ID_Data")
    protected List<ExternalIntegrationIDDataType> integrationIDData;
    @XmlElement(name = "Organization_Name")
    protected String organizationName;
    @XmlElement(name = "Organization_Type_Reference")
    protected OrganizationTypeObjectType organizationTypeReference;
    @XmlElement(name = "Organization_Subtype_Reference")
    protected OrganizationSubtypeObjectType organizationSubtypeReference;
    @XmlElement(name = "Primary_Business_Site_Reference")
    protected LocationObjectType primaryBusinessSiteReference;
    @XmlElement(name = "Organization_Support_Role_Data")
    protected OrganizationSupportRoleType organizationSupportRoleData;
    @XmlElement(name = "Date_of_Pay_Group_Assignment")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfPayGroupAssignment;
    @XmlElement(name = "Used_in_Change_Organization_Assignments")
    protected Boolean usedInChangeOrganizationAssignments;

    /**
     * Gets the value of the organizationReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationReferenceID() {
        return organizationReferenceID;
    }

    /**
     * Sets the value of the organizationReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationReferenceID(String value) {
        this.organizationReferenceID = value;
    }

    /**
     * Gets the value of the organizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationCode() {
        return organizationCode;
    }

    /**
     * Sets the value of the organizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationCode(String value) {
        this.organizationCode = value;
    }

    /**
     * Gets the value of the integrationIDData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the integrationIDData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntegrationIDData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalIntegrationIDDataType }
     * 
     * 
     */
    public List<ExternalIntegrationIDDataType> getIntegrationIDData() {
        if (integrationIDData == null) {
            integrationIDData = new ArrayList<ExternalIntegrationIDDataType>();
        }
        return this.integrationIDData;
    }

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationName(String value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the organizationTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationTypeObjectType }
     *     
     */
    public OrganizationTypeObjectType getOrganizationTypeReference() {
        return organizationTypeReference;
    }

    /**
     * Sets the value of the organizationTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationTypeObjectType }
     *     
     */
    public void setOrganizationTypeReference(OrganizationTypeObjectType value) {
        this.organizationTypeReference = value;
    }

    /**
     * Gets the value of the organizationSubtypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationSubtypeObjectType }
     *     
     */
    public OrganizationSubtypeObjectType getOrganizationSubtypeReference() {
        return organizationSubtypeReference;
    }

    /**
     * Sets the value of the organizationSubtypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationSubtypeObjectType }
     *     
     */
    public void setOrganizationSubtypeReference(OrganizationSubtypeObjectType value) {
        this.organizationSubtypeReference = value;
    }

    /**
     * Gets the value of the primaryBusinessSiteReference property.
     * 
     * @return
     *     possible object is
     *     {@link LocationObjectType }
     *     
     */
    public LocationObjectType getPrimaryBusinessSiteReference() {
        return primaryBusinessSiteReference;
    }

    /**
     * Sets the value of the primaryBusinessSiteReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationObjectType }
     *     
     */
    public void setPrimaryBusinessSiteReference(LocationObjectType value) {
        this.primaryBusinessSiteReference = value;
    }

    /**
     * Gets the value of the organizationSupportRoleData property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationSupportRoleType }
     *     
     */
    public OrganizationSupportRoleType getOrganizationSupportRoleData() {
        return organizationSupportRoleData;
    }

    /**
     * Sets the value of the organizationSupportRoleData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationSupportRoleType }
     *     
     */
    public void setOrganizationSupportRoleData(OrganizationSupportRoleType value) {
        this.organizationSupportRoleData = value;
    }

    /**
     * Gets the value of the dateOfPayGroupAssignment property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfPayGroupAssignment() {
        return dateOfPayGroupAssignment;
    }

    /**
     * Sets the value of the dateOfPayGroupAssignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfPayGroupAssignment(XMLGregorianCalendar value) {
        this.dateOfPayGroupAssignment = value;
    }

    /**
     * Gets the value of the usedInChangeOrganizationAssignments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsedInChangeOrganizationAssignments() {
        return usedInChangeOrganizationAssignments;
    }

    /**
     * Sets the value of the usedInChangeOrganizationAssignments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsedInChangeOrganizationAssignments(Boolean value) {
        this.usedInChangeOrganizationAssignments = value;
    }

}
