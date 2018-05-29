
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
 * A container for all the detail information about the Academic Unit
 * 
 * <p>Java class for Academic_Unit_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Academic_Unit_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Effective_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Is_Institution" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Code_in_Name" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Incumbent_Leader_in_Name" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Academic_Organization_Subtype_Reference" type="{urn:com.workday/bsvc}Academic_Unit_SubtypeObjectType" minOccurs="0"/>
 *         &lt;element name="Include_Subtype_in_Name" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Inactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Company_Reference" type="{urn:com.workday/bsvc}CompanyObjectType" minOccurs="0"/>
 *         &lt;element name="CIP_Code_Reference" type="{urn:com.workday/bsvc}CIP_Code__Workday_Owned_ObjectType" minOccurs="0"/>
 *         &lt;element name="External_URL_Reference" type="{urn:com.workday/bsvc}External_URLObjectType" minOccurs="0"/>
 *         &lt;element name="Supervisory_Organization_Reference" type="{urn:com.workday/bsvc}Supervisory_OrganizationObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Track_Type_Reference" type="{urn:com.workday/bsvc}Academic_Track_TypeObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Superior_Academic_Unit_Reference" type="{urn:com.workday/bsvc}Academic_UnitObjectType" minOccurs="0"/>
 *         &lt;element name="Acceptable_External_Institution_Grading_Scheme_Point_Value_Reference" type="{urn:com.workday/bsvc}External_Institution_Grading_Scheme_Grade_Point_ValueObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Academic_Unit_DataType", propOrder = {
    "id",
    "effectiveDate",
    "name",
    "code",
    "isInstitution",
    "includeCodeInName",
    "includeIncumbentLeaderInName",
    "academicOrganizationSubtypeReference",
    "includeSubtypeInName",
    "inactive",
    "companyReference",
    "cipCodeReference",
    "externalURLReference",
    "supervisoryOrganizationReference",
    "trackTypeReference",
    "superiorAcademicUnitReference",
    "acceptableExternalInstitutionGradingSchemePointValueReference"
})
public class AcademicUnitDataType {

    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "Effective_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Is_Institution")
    protected Boolean isInstitution;
    @XmlElement(name = "Include_Code_in_Name")
    protected Boolean includeCodeInName;
    @XmlElement(name = "Include_Incumbent_Leader_in_Name")
    protected Boolean includeIncumbentLeaderInName;
    @XmlElement(name = "Academic_Organization_Subtype_Reference")
    protected AcademicUnitSubtypeObjectType academicOrganizationSubtypeReference;
    @XmlElement(name = "Include_Subtype_in_Name")
    protected Boolean includeSubtypeInName;
    @XmlElement(name = "Inactive")
    protected Boolean inactive;
    @XmlElement(name = "Company_Reference")
    protected CompanyObjectType companyReference;
    @XmlElement(name = "CIP_Code_Reference")
    protected CIPCodeWorkdayOwnedObjectType cipCodeReference;
    @XmlElement(name = "External_URL_Reference")
    protected ExternalURLObjectType externalURLReference;
    @XmlElement(name = "Supervisory_Organization_Reference")
    protected List<SupervisoryOrganizationObjectType> supervisoryOrganizationReference;
    @XmlElement(name = "Track_Type_Reference")
    protected List<AcademicTrackTypeObjectType> trackTypeReference;
    @XmlElement(name = "Superior_Academic_Unit_Reference")
    protected AcademicUnitObjectType superiorAcademicUnitReference;
    @XmlElement(name = "Acceptable_External_Institution_Grading_Scheme_Point_Value_Reference")
    protected ExternalInstitutionGradingSchemeGradePointValueObjectType acceptableExternalInstitutionGradingSchemePointValueReference;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
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
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the isInstitution property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInstitution() {
        return isInstitution;
    }

    /**
     * Sets the value of the isInstitution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInstitution(Boolean value) {
        this.isInstitution = value;
    }

    /**
     * Gets the value of the includeCodeInName property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeCodeInName() {
        return includeCodeInName;
    }

    /**
     * Sets the value of the includeCodeInName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeCodeInName(Boolean value) {
        this.includeCodeInName = value;
    }

    /**
     * Gets the value of the includeIncumbentLeaderInName property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeIncumbentLeaderInName() {
        return includeIncumbentLeaderInName;
    }

    /**
     * Sets the value of the includeIncumbentLeaderInName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeIncumbentLeaderInName(Boolean value) {
        this.includeIncumbentLeaderInName = value;
    }

    /**
     * Gets the value of the academicOrganizationSubtypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicUnitSubtypeObjectType }
     *     
     */
    public AcademicUnitSubtypeObjectType getAcademicOrganizationSubtypeReference() {
        return academicOrganizationSubtypeReference;
    }

    /**
     * Sets the value of the academicOrganizationSubtypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicUnitSubtypeObjectType }
     *     
     */
    public void setAcademicOrganizationSubtypeReference(AcademicUnitSubtypeObjectType value) {
        this.academicOrganizationSubtypeReference = value;
    }

    /**
     * Gets the value of the includeSubtypeInName property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeSubtypeInName() {
        return includeSubtypeInName;
    }

    /**
     * Sets the value of the includeSubtypeInName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeSubtypeInName(Boolean value) {
        this.includeSubtypeInName = value;
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
     * Gets the value of the companyReference property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyObjectType }
     *     
     */
    public CompanyObjectType getCompanyReference() {
        return companyReference;
    }

    /**
     * Sets the value of the companyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyObjectType }
     *     
     */
    public void setCompanyReference(CompanyObjectType value) {
        this.companyReference = value;
    }

    /**
     * Gets the value of the cipCodeReference property.
     * 
     * @return
     *     possible object is
     *     {@link CIPCodeWorkdayOwnedObjectType }
     *     
     */
    public CIPCodeWorkdayOwnedObjectType getCIPCodeReference() {
        return cipCodeReference;
    }

    /**
     * Sets the value of the cipCodeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIPCodeWorkdayOwnedObjectType }
     *     
     */
    public void setCIPCodeReference(CIPCodeWorkdayOwnedObjectType value) {
        this.cipCodeReference = value;
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
     * Gets the value of the supervisoryOrganizationReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supervisoryOrganizationReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupervisoryOrganizationReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupervisoryOrganizationObjectType }
     * 
     * 
     */
    public List<SupervisoryOrganizationObjectType> getSupervisoryOrganizationReference() {
        if (supervisoryOrganizationReference == null) {
            supervisoryOrganizationReference = new ArrayList<SupervisoryOrganizationObjectType>();
        }
        return this.supervisoryOrganizationReference;
    }

    /**
     * Gets the value of the trackTypeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trackTypeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrackTypeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcademicTrackTypeObjectType }
     * 
     * 
     */
    public List<AcademicTrackTypeObjectType> getTrackTypeReference() {
        if (trackTypeReference == null) {
            trackTypeReference = new ArrayList<AcademicTrackTypeObjectType>();
        }
        return this.trackTypeReference;
    }

    /**
     * Gets the value of the superiorAcademicUnitReference property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicUnitObjectType }
     *     
     */
    public AcademicUnitObjectType getSuperiorAcademicUnitReference() {
        return superiorAcademicUnitReference;
    }

    /**
     * Sets the value of the superiorAcademicUnitReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicUnitObjectType }
     *     
     */
    public void setSuperiorAcademicUnitReference(AcademicUnitObjectType value) {
        this.superiorAcademicUnitReference = value;
    }

    /**
     * Gets the value of the acceptableExternalInstitutionGradingSchemePointValueReference property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalInstitutionGradingSchemeGradePointValueObjectType }
     *     
     */
    public ExternalInstitutionGradingSchemeGradePointValueObjectType getAcceptableExternalInstitutionGradingSchemePointValueReference() {
        return acceptableExternalInstitutionGradingSchemePointValueReference;
    }

    /**
     * Sets the value of the acceptableExternalInstitutionGradingSchemePointValueReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalInstitutionGradingSchemeGradePointValueObjectType }
     *     
     */
    public void setAcceptableExternalInstitutionGradingSchemePointValueReference(ExternalInstitutionGradingSchemeGradePointValueObjectType value) {
        this.acceptableExternalInstitutionGradingSchemePointValueReference = value;
    }

}
