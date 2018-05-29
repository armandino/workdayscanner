
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for Academic Unit Hierarchy attributes and relationships.
 * 
 * <p>Java class for Academic_Unit_Hierarchy_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Academic_Unit_Hierarchy_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Academic_Unit_Hierarchy_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Include_Code_in_Name" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Leadership_Role_Incumbent_in_Name" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Subtype_in_Name" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Type_Reference" type="{urn:com.workday/bsvc}Academic_Unit_SubtypeObjectType" minOccurs="0"/>
 *         &lt;element name="External_URL_Reference" type="{urn:com.workday/bsvc}External_URLObjectType" minOccurs="0"/>
 *         &lt;element name="Superior_Reference" type="{urn:com.workday/bsvc}Academic_Unit_HierarchyObjectType" minOccurs="0"/>
 *         &lt;element name="Subordinate_Reference" type="{urn:com.workday/bsvc}Academic_Unit_HierarchyObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Academic_Unit_Reference" type="{urn:com.workday/bsvc}Academic_UnitObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Inactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Academic_Unit_Hierarchy_DataType", propOrder = {
    "academicUnitHierarchyID",
    "name",
    "code",
    "includeCodeInName",
    "includeLeadershipRoleIncumbentInName",
    "includeSubtypeInName",
    "typeReference",
    "externalURLReference",
    "superiorReference",
    "subordinateReference",
    "academicUnitReference",
    "inactive"
})
public class AcademicUnitHierarchyDataType {

    @XmlElement(name = "Academic_Unit_Hierarchy_ID")
    protected String academicUnitHierarchyID;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Include_Code_in_Name")
    protected Boolean includeCodeInName;
    @XmlElement(name = "Include_Leadership_Role_Incumbent_in_Name")
    protected Boolean includeLeadershipRoleIncumbentInName;
    @XmlElement(name = "Include_Subtype_in_Name")
    protected Boolean includeSubtypeInName;
    @XmlElement(name = "Type_Reference")
    protected AcademicUnitSubtypeObjectType typeReference;
    @XmlElement(name = "External_URL_Reference")
    protected ExternalURLObjectType externalURLReference;
    @XmlElement(name = "Superior_Reference")
    protected AcademicUnitHierarchyObjectType superiorReference;
    @XmlElement(name = "Subordinate_Reference")
    protected List<AcademicUnitHierarchyObjectType> subordinateReference;
    @XmlElement(name = "Academic_Unit_Reference")
    protected List<AcademicUnitObjectType> academicUnitReference;
    @XmlElement(name = "Inactive")
    protected Boolean inactive;

    /**
     * Gets the value of the academicUnitHierarchyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicUnitHierarchyID() {
        return academicUnitHierarchyID;
    }

    /**
     * Sets the value of the academicUnitHierarchyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicUnitHierarchyID(String value) {
        this.academicUnitHierarchyID = value;
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
     * Gets the value of the includeLeadershipRoleIncumbentInName property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeLeadershipRoleIncumbentInName() {
        return includeLeadershipRoleIncumbentInName;
    }

    /**
     * Sets the value of the includeLeadershipRoleIncumbentInName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeLeadershipRoleIncumbentInName(Boolean value) {
        this.includeLeadershipRoleIncumbentInName = value;
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
     * Gets the value of the typeReference property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicUnitSubtypeObjectType }
     *     
     */
    public AcademicUnitSubtypeObjectType getTypeReference() {
        return typeReference;
    }

    /**
     * Sets the value of the typeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicUnitSubtypeObjectType }
     *     
     */
    public void setTypeReference(AcademicUnitSubtypeObjectType value) {
        this.typeReference = value;
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
     * Gets the value of the superiorReference property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicUnitHierarchyObjectType }
     *     
     */
    public AcademicUnitHierarchyObjectType getSuperiorReference() {
        return superiorReference;
    }

    /**
     * Sets the value of the superiorReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicUnitHierarchyObjectType }
     *     
     */
    public void setSuperiorReference(AcademicUnitHierarchyObjectType value) {
        this.superiorReference = value;
    }

    /**
     * Gets the value of the subordinateReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subordinateReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubordinateReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcademicUnitHierarchyObjectType }
     * 
     * 
     */
    public List<AcademicUnitHierarchyObjectType> getSubordinateReference() {
        if (subordinateReference == null) {
            subordinateReference = new ArrayList<AcademicUnitHierarchyObjectType>();
        }
        return this.subordinateReference;
    }

    /**
     * Gets the value of the academicUnitReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the academicUnitReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcademicUnitReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcademicUnitObjectType }
     * 
     * 
     */
    public List<AcademicUnitObjectType> getAcademicUnitReference() {
        if (academicUnitReference == null) {
            academicUnitReference = new ArrayList<AcademicUnitObjectType>();
        }
        return this.academicUnitReference;
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

}
