
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Put Appointment Specialty Request
 * 
 * <p>Java class for Put_Appointment_Specialty_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Appointment_Specialty_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Appointment_Specialty_Reference" type="{urn:com.workday/bsvc}Appointment_SpecialtyObjectType" minOccurs="0"/>
 *         &lt;element name="Appointment_Specialty_Data" type="{urn:com.workday/bsvc}Appointment_Specialty_DataType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Add_Only" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute ref="{urn:com.workday/bsvc}version"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Put_Appointment_Specialty_RequestType", propOrder = {
    "appointmentSpecialtyReference",
    "appointmentSpecialtyData"
})
public class PutAppointmentSpecialtyRequestType {

    @XmlElement(name = "Appointment_Specialty_Reference")
    protected AppointmentSpecialtyObjectType appointmentSpecialtyReference;
    @XmlElement(name = "Appointment_Specialty_Data", required = true)
    protected AppointmentSpecialtyDataType appointmentSpecialtyData;
    @XmlAttribute(name = "Add_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean addOnly;
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
     * Gets the value of the appointmentSpecialtyData property.
     * 
     * @return
     *     possible object is
     *     {@link AppointmentSpecialtyDataType }
     *     
     */
    public AppointmentSpecialtyDataType getAppointmentSpecialtyData() {
        return appointmentSpecialtyData;
    }

    /**
     * Sets the value of the appointmentSpecialtyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppointmentSpecialtyDataType }
     *     
     */
    public void setAppointmentSpecialtyData(AppointmentSpecialtyDataType value) {
        this.appointmentSpecialtyData = value;
    }

    /**
     * Gets the value of the addOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddOnly() {
        return addOnly;
    }

    /**
     * Sets the value of the addOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddOnly(Boolean value) {
        this.addOnly = value;
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
