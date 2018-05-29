
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Academic Appointment Track References to view Additional Data
 * 
 * <p>Java class for Academic_Appointment_Track_Additional_Data_Request_ReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Academic_Appointment_Track_Additional_Data_Request_ReferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Academic_Appointment_Track_Reference" type="{urn:com.workday/bsvc}Academic_Appointment_TrackObjectType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Academic_Appointment_Track_Additional_Data_Request_ReferencesType", propOrder = {
    "academicAppointmentTrackReference"
})
public class AcademicAppointmentTrackAdditionalDataRequestReferencesType {

    @XmlElement(name = "Academic_Appointment_Track_Reference", required = true)
    protected List<AcademicAppointmentTrackObjectType> academicAppointmentTrackReference;

    /**
     * Gets the value of the academicAppointmentTrackReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the academicAppointmentTrackReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcademicAppointmentTrackReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcademicAppointmentTrackObjectType }
     * 
     * 
     */
    public List<AcademicAppointmentTrackObjectType> getAcademicAppointmentTrackReference() {
        if (academicAppointmentTrackReference == null) {
            academicAppointmentTrackReference = new ArrayList<AcademicAppointmentTrackObjectType>();
        }
        return this.academicAppointmentTrackReference;
    }

}
