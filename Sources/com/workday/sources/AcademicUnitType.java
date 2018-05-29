
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A container for Academic Unit Data
 * 
 * <p>Java class for Academic_UnitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Academic_UnitType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Academic_Unit_Reference" type="{urn:com.workday/bsvc}Academic_UnitObjectType" minOccurs="0"/>
 *         &lt;element name="Academic_Unit_Data" type="{urn:com.workday/bsvc}Academic_Unit_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Academic_UnitType", propOrder = {
    "academicUnitReference",
    "academicUnitData"
})
public class AcademicUnitType {

    @XmlElement(name = "Academic_Unit_Reference")
    protected AcademicUnitObjectType academicUnitReference;
    @XmlElement(name = "Academic_Unit_Data")
    protected AcademicUnitDataType academicUnitData;

    /**
     * Gets the value of the academicUnitReference property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicUnitObjectType }
     *     
     */
    public AcademicUnitObjectType getAcademicUnitReference() {
        return academicUnitReference;
    }

    /**
     * Sets the value of the academicUnitReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicUnitObjectType }
     *     
     */
    public void setAcademicUnitReference(AcademicUnitObjectType value) {
        this.academicUnitReference = value;
    }

    /**
     * Gets the value of the academicUnitData property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicUnitDataType }
     *     
     */
    public AcademicUnitDataType getAcademicUnitData() {
        return academicUnitData;
    }

    /**
     * Sets the value of the academicUnitData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicUnitDataType }
     *     
     */
    public void setAcademicUnitData(AcademicUnitDataType value) {
        this.academicUnitData = value;
    }

}
