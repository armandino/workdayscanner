
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Top-level request element used to add or update an Academic Unit Hierarchy.
 * 
 * <p>Java class for Put_Academic_Unit_Hierarchy_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Academic_Unit_Hierarchy_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Academic_Unit_Hierarchy_Reference" type="{urn:com.workday/bsvc}Academic_Unit_HierarchyObjectType" minOccurs="0"/>
 *         &lt;element name="Academic_Unit_Hierarchy_Data" type="{urn:com.workday/bsvc}Academic_Unit_Hierarchy_DataType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Add_Only" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute ref="{urn:com.workday/bsvc}version"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Put_Academic_Unit_Hierarchy_RequestType", propOrder = {
    "academicUnitHierarchyReference",
    "academicUnitHierarchyData"
})
public class PutAcademicUnitHierarchyRequestType {

    @XmlElement(name = "Academic_Unit_Hierarchy_Reference")
    protected AcademicUnitHierarchyObjectType academicUnitHierarchyReference;
    @XmlElement(name = "Academic_Unit_Hierarchy_Data", required = true)
    protected AcademicUnitHierarchyDataType academicUnitHierarchyData;
    @XmlAttribute(name = "Add_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean addOnly;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the academicUnitHierarchyReference property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicUnitHierarchyObjectType }
     *     
     */
    public AcademicUnitHierarchyObjectType getAcademicUnitHierarchyReference() {
        return academicUnitHierarchyReference;
    }

    /**
     * Sets the value of the academicUnitHierarchyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicUnitHierarchyObjectType }
     *     
     */
    public void setAcademicUnitHierarchyReference(AcademicUnitHierarchyObjectType value) {
        this.academicUnitHierarchyReference = value;
    }

    /**
     * Gets the value of the academicUnitHierarchyData property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicUnitHierarchyDataType }
     *     
     */
    public AcademicUnitHierarchyDataType getAcademicUnitHierarchyData() {
        return academicUnitHierarchyData;
    }

    /**
     * Sets the value of the academicUnitHierarchyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicUnitHierarchyDataType }
     *     
     */
    public void setAcademicUnitHierarchyData(AcademicUnitHierarchyDataType value) {
        this.academicUnitHierarchyData = value;
    }

    /**
     * Gets the value of the addOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddOnly() {
        return addOnly;
    }

    /**
     * Sets the value of the addOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddOnly(Boolean value) {
        this.addOnly = value;
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
