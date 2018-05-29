
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the effective-dated additional data for the requested Academic Appointment Tracks as of the effective date.
 * 
 * <p>Java class for Academic_Appointment_Track_Additional_Data_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Academic_Appointment_Track_Additional_Data_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Academic_Appointment_Track_Additional_Data" type="{urn:com.workday/bsvc}Academic_Appointment_Track_Custom_Object_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Academic_Appointment_Track_Additional_Data_Response_DataType", propOrder = {
    "academicAppointmentTrackAdditionalData"
})
public class AcademicAppointmentTrackAdditionalDataResponseDataType {

    @XmlElement(name = "Academic_Appointment_Track_Additional_Data")
    protected List<AcademicAppointmentTrackCustomObjectDataType> academicAppointmentTrackAdditionalData;

    /**
     * Gets the value of the academicAppointmentTrackAdditionalData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the academicAppointmentTrackAdditionalData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcademicAppointmentTrackAdditionalData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcademicAppointmentTrackCustomObjectDataType }
     * 
     * 
     */
    public List<AcademicAppointmentTrackCustomObjectDataType> getAcademicAppointmentTrackAdditionalData() {
        if (academicAppointmentTrackAdditionalData == null) {
            academicAppointmentTrackAdditionalData = new ArrayList<AcademicAppointmentTrackCustomObjectDataType>();
        }
        return this.academicAppointmentTrackAdditionalData;
    }

}
