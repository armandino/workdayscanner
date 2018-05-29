
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for the Academic Unit Hierarchies
 * 
 * <p>Java class for Academic_Unit_Hierarchy_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Academic_Unit_Hierarchy_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Academic_Unit_Hierarchy" type="{urn:com.workday/bsvc}Academic_Unit_HierarchyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Academic_Unit_Hierarchy_Response_DataType", propOrder = {
    "academicUnitHierarchy"
})
public class AcademicUnitHierarchyResponseDataType {

    @XmlElement(name = "Academic_Unit_Hierarchy")
    protected List<AcademicUnitHierarchyType> academicUnitHierarchy;

    /**
     * Gets the value of the academicUnitHierarchy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the academicUnitHierarchy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcademicUnitHierarchy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcademicUnitHierarchyType }
     * 
     * 
     */
    public List<AcademicUnitHierarchyType> getAcademicUnitHierarchy() {
        if (academicUnitHierarchy == null) {
            academicUnitHierarchy = new ArrayList<AcademicUnitHierarchyType>();
        }
        return this.academicUnitHierarchy;
    }

}
