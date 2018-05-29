
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Put Appointment Specialty Response
 * 
 * <p>Java class for Put_Appointment_Specialty_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Appointment_Specialty_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Appointment_Specialty_Reference" type="{urn:com.workday/bsvc}Appointment_SpecialtyObjectType" minOccurs="0"/>
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
@XmlType(name = "Put_Appointment_Specialty_ResponseType", propOrder = {
    "appointmentSpecialtyReference"
})
public class PutAppointmentSpecialtyResponseType {

    @XmlElement(name = "Appointment_Specialty_Reference")
    protected AppointmentSpecialtyObjectType appointmentSpecialtyReference;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the appointmentSpecialtyReference property.
     * 
     * @return
     *     possible object is
     *     {@link AppointmentSpecialtyObjectType }
     *     
     */
    public AppointmentSpecialtyObjectType getAppointmentSpecialtyReference() {
        return appointmentSpecialtyReference;
    }

    /**
     * Sets the value of the appointmentSpecialtyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppointmentSpecialtyObjectType }
     *     
     */
    public void setAppointmentSpecialtyReference(AppointmentSpecialtyObjectType value) {
        this.appointmentSpecialtyReference = value;
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
