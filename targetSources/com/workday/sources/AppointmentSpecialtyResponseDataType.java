
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Appointment Specialty Response Data
 * 
 * <p>Java class for Appointment_Specialty_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Appointment_Specialty_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Appointment_Specialty" type="{urn:com.workday/bsvc}Appointment_SpecialtyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Appointment_Specialty_Response_DataType", propOrder = {
    "appointmentSpecialty"
})
public class AppointmentSpecialtyResponseDataType {

    @XmlElement(name = "Appointment_Specialty")
    protected List<AppointmentSpecialtyType> appointmentSpecialty;

    /**
     * Gets the value of the appointmentSpecialty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appointmentSpecialty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppointmentSpecialty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppointmentSpecialtyType }
     * 
     * 
     */
    public List<AppointmentSpecialtyType> getAppointmentSpecialty() {
        if (appointmentSpecialty == null) {
            appointmentSpecialty = new ArrayList<AppointmentSpecialtyType>();
        }
        return this.appointmentSpecialty;
    }

}
