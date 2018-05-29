
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Data for Appointment Specialty
 * 
 * <p>Java class for Appointment_Specialty_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Appointment_Specialty_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Specialty_Reference" type="{urn:com.workday/bsvc}SpecialtyObjectType"/>
 *         &lt;element name="Academic_Unit_or_Academic_Unit_Hierarchy_Reference" type="{urn:com.workday/bsvc}Academic_Appointment_SetObjectType" minOccurs="0"/>
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
@XmlType(name = "Appointment_Specialty_DataType", propOrder = {
    "id",
    "specialtyReference",
    "academicUnitOrAcademicUnitHierarchyReference",
    "inactive"
})
public class AppointmentSpecialtyDataType {

    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "Specialty_Reference", required = true)
    protected SpecialtyObjectType specialtyReference;
    @XmlElement(name = "Academic_Unit_or_Academic_Unit_Hierarchy_Reference")
    protected AcademicAppointmentSetObjectType academicUnitOrAcademicUnitHierarchyReference;
    @XmlElement(name = "Inactive")
    protected Boolean inactive;

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
     * Gets the value of the specialtyReference property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialtyObjectType }
     *     
     */
    public SpecialtyObjectType getSpecialtyReference() {
        return specialtyReference;
    }

    /**
     * Sets the value of the specialtyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialtyObjectType }
     *     
     */
    public void setSpecialtyReference(SpecialtyObjectType value) {
        this.specialtyReference = value;
    }

    /**
     * Gets the value of the academicUnitOrAcademicUnitHierarchyReference property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicAppointmentSetObjectType }
     *     
     */
    public AcademicAppointmentSetObjectType getAcademicUnitOrAcademicUnitHierarchyReference() {
        return academicUnitOrAcademicUnitHierarchyReference;
    }

    /**
     * Sets the value of the academicUnitOrAcademicUnitHierarchyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicAppointmentSetObjectType }
     *     
     */
    public void setAcademicUnitOrAcademicUnitHierarchyReference(AcademicAppointmentSetObjectType value) {
        this.academicUnitOrAcademicUnitHierarchyReference = value;
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
