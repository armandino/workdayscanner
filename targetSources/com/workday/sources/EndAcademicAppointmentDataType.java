
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Wrapper element for the End Academic Appointment business process.
 * 
 * <p>Java class for End_Academic_Appointment_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="End_Academic_Appointment_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Academic_Appointee_Reference" type="{urn:com.workday/bsvc}Academic_Appointee_EnabledObjectType" minOccurs="0"/>
 *         &lt;element name="Academic_Appointment_Track_Reference" type="{urn:com.workday/bsvc}Academic_Appointment_TrackObjectType" minOccurs="0"/>
 *         &lt;element name="Reason_Reference" type="{urn:com.workday/bsvc}General_Event_SubcategoryObjectType"/>
 *         &lt;element name="Track_End_Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "End_Academic_Appointment_DataType", propOrder = {
    "academicAppointeeReference",
    "academicAppointmentTrackReference",
    "reasonReference",
    "trackEndDate"
})
public class EndAcademicAppointmentDataType {

    @XmlElement(name = "Academic_Appointee_Reference")
    protected AcademicAppointeeEnabledObjectType academicAppointeeReference;
    @XmlElement(name = "Academic_Appointment_Track_Reference")
    protected AcademicAppointmentTrackObjectType academicAppointmentTrackReference;
    @XmlElement(name = "Reason_Reference", required = true)
    protected GeneralEventSubcategoryObjectType reasonReference;
    @XmlElement(name = "Track_End_Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar trackEndDate;

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
     * Gets the value of the trackEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTrackEndDate() {
        return trackEndDate;
    }

    /**
     * Sets the value of the trackEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTrackEndDate(XMLGregorianCalendar value) {
        this.trackEndDate = value;
    }

}
