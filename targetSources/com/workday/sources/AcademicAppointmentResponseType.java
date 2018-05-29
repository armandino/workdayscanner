
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Top-level response element for Academic Appointment business process operations.
 * 
 * <p>Java class for Academic_Appointment_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Academic_Appointment_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Event_Reference" type="{urn:com.workday/bsvc}Unique_IdentifierObjectType" minOccurs="0"/>
 *         &lt;element name="Academic_Appointee_Reference" type="{urn:com.workday/bsvc}Academic_Appointee_EnabledObjectType" minOccurs="0"/>
 *         &lt;element name="Academic_Appointment_Track_Reference" type="{urn:com.workday/bsvc}Academic_Appointment_TrackObjectType" minOccurs="0"/>
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
@XmlType(name = "Academic_Appointment_ResponseType", propOrder = {
    "eventReference",
    "academicAppointeeReference",
    "academicAppointmentTrackReference"
})
public class AcademicAppointmentResponseType {

    @XmlElement(name = "Event_Reference")
    protected UniqueIdentifierObjectType eventReference;
    @XmlElement(name = "Academic_Appointee_Reference")
    protected AcademicAppointeeEnabledObjectType academicAppointeeReference;
    @XmlElement(name = "Academic_Appointment_Track_Reference")
    protected AcademicAppointmentTrackObjectType academicAppointmentTrackReference;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the eventReference property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public UniqueIdentifierObjectType getEventReference() {
        return eventReference;
    }

    /**
     * Sets the value of the eventReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public void setEventReference(UniqueIdentifierObjectType value) {
        this.eventReference = value;
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
     * Gets the value of the academicAppointmentTrackReference property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicAppointmentTrackObjectType }
     *     
     */
    public AcademicAppointmentTrackObjectType getAcademicAppointmentTrackReference() {
        return academicAppointmentTrackReference;
    }

    /**
     * Sets the value of the academicAppointmentTrackReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicAppointmentTrackObjectType }
     *     
     */
    public void setAcademicAppointmentTrackReference(AcademicAppointmentTrackObjectType value) {
        this.academicAppointmentTrackReference = value;
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
