
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for the Academic Unit Hierarchy reference and associated data.\
 * 
 * <p>Java class for Academic_Unit_HierarchyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Academic_Unit_HierarchyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Academic_Unit_Hierarchy_Reference" type="{urn:com.workday/bsvc}Academic_Unit_HierarchyObjectType" minOccurs="0"/>
 *         &lt;element name="Academic_Unit_Hierarchy_Data" type="{urn:com.workday/bsvc}Academic_Unit_Hierarchy_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Academic_Unit_HierarchyType", propOrder = {
    "academicUnitHierarchyReference",
    "academicUnitHierarchyData"
})
public class AcademicUnitHierarchyType {

    @XmlElement(name = "Academic_Unit_Hierarchy_Reference")
    protected AcademicUnitHierarchyObjectType academicUnitHierarchyReference;
    @XmlElement(name = "Academic_Unit_Hierarchy_Data")
    protected List<AcademicUnitHierarchyDataType> academicUnitHierarchyData;

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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the academicUnitHierarchyData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcademicUnitHierarchyData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcademicUnitHierarchyDataType }
     * 
     * 
     */
    public List<AcademicUnitHierarchyDataType> getAcademicUnitHierarchyData() {
        if (academicUnitHierarchyData == null) {
            academicUnitHierarchyData = new ArrayList<AcademicUnitHierarchyDataType>();
        }
        return this.academicUnitHierarchyData;
    }

}
