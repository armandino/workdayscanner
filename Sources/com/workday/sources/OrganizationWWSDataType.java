
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
 * Contains the detailed information about an Organization.
 * 
 * <p>Java class for Organization_WWS_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization_WWS_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Reference_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organization_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Include_Manager_in_Name" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Organization_Code_in_Name" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Organization_Type_Reference" type="{urn:com.workday/bsvc}Organization_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Organization_Subtype_Reference" type="{urn:com.workday/bsvc}Organization_SubtypeObjectType" minOccurs="0"/>
 *         &lt;element name="Availibility_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Last_Updated_DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Inactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Inactive_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Manager_Reference" type="{urn:com.workday/bsvc}WorkerObjectType" minOccurs="0"/>
 *         &lt;element name="Leadership_Reference" type="{urn:com.workday/bsvc}WorkerObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Organization_Owner_Reference" type="{urn:com.workday/bsvc}Organization_OwnerObjectType" minOccurs="0"/>
 *         &lt;element name="Organization_Visibility_Reference" type="{urn:com.workday/bsvc}Unique_IdentifierObjectType" minOccurs="0"/>
 *         &lt;element name="External_URL_Reference" type="{urn:com.workday/bsvc}External_URLObjectType" minOccurs="0"/>
 *         &lt;element name="External_IDs_Data" type="{urn:com.workday/bsvc}External_Integration_ID_DataType" minOccurs="0"/>
 *         &lt;element name="Roles_Data" type="{urn:com.workday/bsvc}Organization_Roles_WWS_DataType" minOccurs="0"/>
 *         &lt;element name="Hierarchy_Data" type="{urn:com.workday/bsvc}Organization_Hierarchy_DataType" minOccurs="0"/>
 *         &lt;element name="Supervisory_Data" type="{urn:com.workday/bsvc}Supervisory_Org_DataType" minOccurs="0"/>
 *         &lt;element name="Integration_Field_Override_Data" type="{urn:com.workday/bsvc}Document_Field_Result_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization_WWS_DataType", propOrder = {
    "referenceID",
    "name",
    "description",
    "organizationCode",
    "includeManagerInName",
    "includeOrganizationCodeInName",
    "organizationTypeReference",
    "organizationSubtypeReference",
    "availibilityDate",
    "lastUpdatedDateTime",
    "inactive",
    "inactiveDate",
    "managerReference",
    "leadershipReference",
    "organizationOwnerReference",
    "organizationVisibilityReference",
    "externalURLReference",
    "externalIDsData",
    "rolesData",
    "hierarchyData",
    "supervisoryData",
    "integrationFieldOverrideData"
})
public class OrganizationWWSDataType {

    @XmlElement(name = "Reference_ID")
    protected String referenceID;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Organization_Code")
    protected String organizationCode;
    @XmlElement(name = "Include_Manager_in_Name")
    protected Boolean includeManagerInName;
    @XmlElement(name = "Include_Organization_Code_in_Name")
    protected Boolean includeOrganizationCodeInName;
    @XmlElement(name = "Organization_Type_Reference")
    protected OrganizationTypeObjectType organizationTypeReference;
    @XmlElement(name = "Organization_Subtype_Reference")
    protected OrganizationSubtypeObjectType organizationSubtypeReference;
    @XmlElement(name = "Availibility_Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar availibilityDate;
    @XmlElement(name = "Last_Updated_DateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdatedDateTime;
    @XmlElement(name = "Inactive")
    protected Boolean inactive;
    @XmlElement(name = "Inactive_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar inactiveDate;
    @XmlElement(name = "Manager_Reference")
    protected WorkerObjectType managerReference;
    @XmlElement(name = "Leadership_Reference")
    protected List<WorkerObjectType> leadershipReference;
    @XmlElement(name = "Organization_Owner_Reference")
    protected OrganizationOwnerObjectType organizationOwnerReference;
    @XmlElement(name = "Organization_Visibility_Reference")
    protected UniqueIdentifierObjectType organizationVisibilityReference;
    @XmlElement(name = "External_URL_Reference")
    protected ExternalURLObjectType externalURLReference;
    @XmlElement(name = "External_IDs_Data")
    protected ExternalIntegrationIDDataType externalIDsData;
    @XmlElement(name = "Roles_Data")
    protected OrganizationRolesWWSDataType rolesData;
    @XmlElement(name = "Hierarchy_Data")
    protected OrganizationHierarchyDataType hierarchyData;
    @XmlElement(name = "Supervisory_Data")
    protected SupervisoryOrgDataType supervisoryData;
    @XmlElement(name = "Integration_Field_Override_Data")
    protected List<DocumentFieldResultDataType> integrationFieldOverrideData;

    /**
     * Gets the value of the referenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceID() {
        return referenceID;
    }

    /**
     * Sets the value of the referenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceID(String value) {
        this.referenceID = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the includeManagerInName property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeManagerInName() {
        return includeManagerInName;
    }

    /**
     * Sets the value of the includeManagerInName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeManagerInName(Boolean value) {
        this.includeManagerInName = value;
    }

    /**
     * Gets the value of the includeOrganizationCodeInName property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeOrganizationCodeInName() {
        return includeOrganizationCodeInName;
    }

    /**
     * Sets the value of the includeOrganizationCodeInName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeOrganizationCodeInName(Boolean value) {
        this.includeOrganizationCodeInName = value;
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
     * Gets the value of the availibilityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAvailibilityDate() {
        return availibilityDate;
    }

    /**
     * Sets the value of the availibilityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAvailibilityDate(XMLGregorianCalendar value) {
        this.availibilityDate = value;
    }

    /**
     * Gets the value of the lastUpdatedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdatedDateTime() {
        return lastUpdatedDateTime;
    }

    /**
     * Sets the value of the lastUpdatedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdatedDateTime(XMLGregorianCalendar value) {
        this.lastUpdatedDateTime = value;
    }

    /**
     * Gets the value of the inactive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInactive() {
        return inactive;
    }

    /**
     * Sets the value of the inactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInactive(Boolean value) {
        this.inactive = value;
    }

    /**
     * Gets the value of the inactiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInactiveDate() {
        return inactiveDate;
    }

    /**
     * Sets the value of the inactiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInactiveDate(XMLGregorianCalendar value) {
        this.inactiveDate = value;
    }

    /**
     * Gets the value of the managerReference property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerObjectType }
     *     
     */
    public WorkerObjectType getManagerReference() {
        return managerReference;
    }

    /**
     * Sets the value of the managerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerObjectType }
     *     
     */
    public void setManagerReference(WorkerObjectType value) {
        this.managerReference = value;
    }

    /**
     * Gets the value of the leadershipReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leadershipReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeadershipReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkerObjectType }
     * 
     * 
     */
    public List<WorkerObjectType> getLeadershipReference() {
        if (leadershipReference == null) {
            leadershipReference = new ArrayList<WorkerObjectType>();
        }
        return this.leadershipReference;
    }

    /**
     * Gets the value of the organizationOwnerReference property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationOwnerObjectType }
     *     
     */
    public OrganizationOwnerObjectType getOrganizationOwnerReference() {
        return organizationOwnerReference;
    }

    /**
     * Sets the value of the organizationOwnerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationOwnerObjectType }
     *     
     */
    public void setOrganizationOwnerReference(OrganizationOwnerObjectType value) {
        this.organizationOwnerReference = value;
    }

    /**
     * Gets the value of the organizationVisibilityReference property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public UniqueIdentifierObjectType getOrganizationVisibilityReference() {
        return organizationVisibilityReference;
    }

    /**
     * Sets the value of the organizationVisibilityReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public void setOrganizationVisibilityReference(UniqueIdentifierObjectType value) {
        this.organizationVisibilityReference = value;
    }

    /**
     * Gets the value of the externalURLReference property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalURLObjectType }
     *     
     */
    public ExternalURLObjectType getExternalURLReference() {
        return externalURLReference;
    }

    /**
     * Sets the value of the externalURLReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalURLObjectType }
     *     
     */
    public void setExternalURLReference(ExternalURLObjectType value) {
        this.externalURLReference = value;
    }

    /**
     * Gets the value of the externalIDsData property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalIntegrationIDDataType }
     *     
     */
    public ExternalIntegrationIDDataType getExternalIDsData() {
        return externalIDsData;
    }

    /**
     * Sets the value of the externalIDsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalIntegrationIDDataType }
     *     
     */
    public void setExternalIDsData(ExternalIntegrationIDDataType value) {
        this.externalIDsData = value;
    }

    /**
     * Gets the value of the rolesData property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationRolesWWSDataType }
     *     
     */
    public OrganizationRolesWWSDataType getRolesData() {
        return rolesData;
    }

    /**
     * Sets the value of the rolesData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationRolesWWSDataType }
     *     
     */
    public void setRolesData(OrganizationRolesWWSDataType value) {
        this.rolesData = value;
    }

    /**
     * Gets the value of the hierarchyData property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationHierarchyDataType }
     *     
     */
    public OrganizationHierarchyDataType getHierarchyData() {
        return hierarchyData;
    }

    /**
     * Sets the value of the hierarchyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationHierarchyDataType }
     *     
     */
    public void setHierarchyData(OrganizationHierarchyDataType value) {
        this.hierarchyData = value;
    }

    /**
     * Gets the value of the supervisoryData property.
     * 
     * @return
     *     possible object is
     *     {@link SupervisoryOrgDataType }
     *     
     */
    public SupervisoryOrgDataType getSupervisoryData() {
        return supervisoryData;
    }

    /**
     * Sets the value of the supervisoryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupervisoryOrgDataType }
     *     
     */
    public void setSupervisoryData(SupervisoryOrgDataType value) {
        this.supervisoryData = value;
    }

    /**
     * Gets the value of the integrationFieldOverrideData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the integrationFieldOverrideData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntegrationFieldOverrideData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentFieldResultDataType }
     * 
     * 
     */
    public List<DocumentFieldResultDataType> getIntegrationFieldOverrideData() {
        if (integrationFieldOverrideData == null) {
            integrationFieldOverrideData = new ArrayList<DocumentFieldResultDataType>();
        }
        return this.integrationFieldOverrideData;
    }

}
