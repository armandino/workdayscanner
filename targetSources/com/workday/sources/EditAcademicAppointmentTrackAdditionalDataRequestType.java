
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Top-level element for editing Academic Appointment Track Additional Data
 * 
 * <p>Java class for Edit_Academic_Appointment_Track_Additional_Data_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Edit_Academic_Appointment_Track_Additional_Data_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Academic_Appointment_Track_Additional_Data" type="{urn:com.workday/bsvc}Academic_Appointment_Track_Custom_Object_DataType"/>
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
@XmlType(name = "Edit_Academic_Appointment_Track_Additional_Data_RequestType", propOrder = {
    "academicAppointmentTrackAdditionalData"
})
public class EditAcademicAppointmentTrackAdditionalDataRequestType {

    @XmlElement(name = "Academic_Appointment_Track_Additional_Data", required = true)
    protected AcademicAppointmentTrackCustomObjectDataType academicAppointmentTrackAdditionalData;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the academicAppointmentTrackAdditionalData property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicAppointmentTrackCustomObjectDataType }
     *     
     */
    public AcademicAppointmentTrackCustomObjectDataType getAcademicAppointmentTrackAdditionalData() {
        return academicAppointmentTrackAdditionalData;
    }

    /**
     * Sets the value of the academicAppointmentTrackAdditionalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicAppointmentTrackCustomObjectDataType }
     *     
     */
    public void setAcademicAppointmentTrackAdditionalData(AcademicAppointmentTrackCustomObjectDataType value) {
        this.academicAppointmentTrackAdditionalData = value;
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
