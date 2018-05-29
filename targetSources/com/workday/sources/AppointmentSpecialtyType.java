
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Appointment Specialty
 * 
 * <p>Java class for Appointment_SpecialtyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Appointment_SpecialtyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Appointment_Specialty_Reference" type="{urn:com.workday/bsvc}Appointment_SpecialtyObjectType" minOccurs="0"/>
 *         &lt;element name="Appointment_Specialty_Data" type="{urn:com.workday/bsvc}Appointment_Specialty_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Appointment_SpecialtyType", propOrder = {
    "appointmentSpecialtyReference",
    "appointmentSpecialtyData"
})
public class AppointmentSpecialtyType {

    @XmlElement(name = "Appointment_Specialty_Reference")
    protected AppointmentSpecialtyObjectType appointmentSpecialtyReference;
    @XmlElement(name = "Appointment_Specialty_Data")
    protected List<AppointmentSpecialtyDataType> appointmentSpecialtyData;

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
     * Gets the value of the appointmentSpecialtyData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appointmentSpecialtyData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppointmentSpecialtyData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppointmentSpecialtyDataType }
     * 
     * 
     */
    public List<AppointmentSpecialtyDataType> getAppointmentSpecialtyData() {
        if (appointmentSpecialtyData == null) {
            appointmentSpecialtyData = new ArrayList<AppointmentSpecialtyDataType>();
        }
        return this.appointmentSpecialtyData;
    }

}
