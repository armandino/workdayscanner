
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Top-level response element for the Put Academic Unit Hierarchy operation
 * 
 * <p>Java class for Put_Academic_Unit_Hierarchy_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Academic_Unit_Hierarchy_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Academic_Unit_Hierarchy_Reference" type="{urn:com.workday/bsvc}Academic_Unit_HierarchyObjectType" minOccurs="0"/>
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
@XmlType(name = "Put_Academic_Unit_Hierarchy_ResponseType", propOrder = {
    "academicUnitHierarchyReference"
})
public class PutAcademicUnitHierarchyResponseType {

    @XmlElement(name = "Academic_Unit_Hierarchy_Reference")
    protected AcademicUnitHierarchyObjectType academicUnitHierarchyReference;
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
