
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for the Update Academic Appointment business process.
 * 
 * <p>Java class for Update_Academic_Appointment_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Update_Academic_Appointment_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Reason_Reference" type="{urn:com.workday/bsvc}General_Event_SubcategoryObjectType"/>
 *         &lt;element name="Academic_Appointee_Reference" type="{urn:com.workday/bsvc}Academic_Appointee_EnabledObjectType"/>
 *         &lt;element name="Academic_Appointment_Data" type="{urn:com.workday/bsvc}Academic_Appointment_Snapshot_DataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Update_Academic_Appointment_DataType", propOrder = {
    "reasonReference",
    "academicAppointeeReference",
    "academicAppointmentData"
})
public class UpdateAcademicAppointmentDataType {

    @XmlElement(name = "Reason_Reference", required = true)
    protected GeneralEventSubcategoryObjectType reasonReference;
    @XmlElement(name = "Academic_Appointee_Reference", required = true)
    protected AcademicAppointeeEnabledObjectType academicAppointeeReference;
    @XmlElement(name = "Academic_Appointment_Data", required = true)
    protected AcademicAppointmentSnapshotDataType academicAppointmentData;

    /**
     * Gets the value of the reasonReference property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralEventSubcategoryObjectType }
     *     
     */
    public GeneralEventSubcategoryObjectType getReasonReference() {
        return reasonReference;
    }

    /**
     * Sets the value of the reasonReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralEventSubcategoryObjectType }
     *     
     */
    public void setReasonReference(GeneralEventSubcategoryObjectType value) {
        this.reasonReference = value;
    }

    /**
     * Gets the value of the academicAppointeeReference property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicAppointeeEnabledObjectType }
     *     
     */
    public AcademicAppointeeEnabledObjectType getAcademicAppointeeReference() {
        return academicAppointeeReference;
    }

    /**
     * Sets the value of the academicAppointeeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicAppointeeEnabledObjectType }
     *     
     */
    public void setAcademicAppointeeReference(AcademicAppointeeEnabledObjectType value) {
        this.academicAppointeeReference = value;
    }

    /**
     * Gets the value of the academicAppointmentData property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicAppointmentSnapshotDataType }
     *     
     */
    public AcademicAppointmentSnapshotDataType getAcademicAppointmentData() {
        return academicAppointmentData;
    }

    /**
     * Sets the value of the academicAppointmentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicAppointmentSnapshotDataType }
     *     
     */
    public void setAcademicAppointmentData(AcademicAppointmentSnapshotDataType value) {
        this.academicAppointmentData = value;
    }

}
