
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Effective dated additional data for an Academic Appointment Track. When updating custom objects that allow multiple instances, data for existing instances must appear in the request, otherwise it will be removed.
 * 
 * <p>Java class for Academic_Appointment_Track_Custom_Object_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Academic_Appointment_Track_Custom_Object_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Effective_Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Academic_Appointment_Track_Reference" type="{urn:com.workday/bsvc}Academic_Appointment_TrackObjectType"/>
 *         &lt;element name="Business_Object_Additional_Data" type="{urn:com.workday/bsvc}Effective_Dated_Web_Service_Additional_DataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Academic_Appointment_Track_Custom_Object_DataType", propOrder = {
    "effectiveDate",
    "academicAppointmentTrackReference",
    "businessObjectAdditionalData"
})
public class AcademicAppointmentTrackCustomObjectDataType {

    @XmlElement(name = "Effective_Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "Academic_Appointment_Track_Reference", required = true)
    protected AcademicAppointmentTrackObjectType academicAppointmentTrackReference;
    @XmlElement(name = "Business_Object_Additional_Data", required = true)
    protected EffectiveDatedWebServiceAdditionalDataType businessObjectAdditionalData;

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
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
     * Gets the value of the businessObjectAdditionalData property.
     * 
     * @return
     *     possible object is
     *     {@link EffectiveDatedWebServiceAdditionalDataType }
     *     
     */
    public EffectiveDatedWebServiceAdditionalDataType getBusinessObjectAdditionalData() {
        return businessObjectAdditionalData;
    }

    /**
     * Sets the value of the businessObjectAdditionalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectiveDatedWebServiceAdditionalDataType }
     *     
     */
    public void setBusinessObjectAdditionalData(EffectiveDatedWebServiceAdditionalDataType value) {
        this.businessObjectAdditionalData = value;
    }

}
