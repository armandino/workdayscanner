
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Get Appointment Specialties Request
 * 
 * <p>Java class for Appointment_Specialty_Request_ReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Appointment_Specialty_Request_ReferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Appointment_Specialty_Reference" type="{urn:com.workday/bsvc}Appointment_SpecialtyObjectType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Appointment_Specialty_Request_ReferencesType", propOrder = {
    "appointmentSpecialtyReference"
})
public class AppointmentSpecialtyRequestReferencesType {

    @XmlElement(name = "Appointment_Specialty_Reference", required = true)
    protected List<AppointmentSpecialtyObjectType> appointmentSpecialtyReference;

    /**
     * Gets the value of the appointmentSpecialtyReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appointmentSpecialtyReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppointmentSpecialtyReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppointmentSpecialtyObjectType }
     * 
     * 
     */
    public List<AppointmentSpecialtyObjectType> getAppointmentSpecialtyReference() {
        if (appointmentSpecialtyReference == null) {
            appointmentSpecialtyReference = new ArrayList<AppointmentSpecialtyObjectType>();
        }
        return this.appointmentSpecialtyReference;
    }

}
