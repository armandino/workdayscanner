
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Top-level response for Edit Academic Appointment Track Additional Data
 * 
 * <p>Java class for Edit_Academic_Appointment_Track_Additional_Data_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Edit_Academic_Appointment_Track_Additional_Data_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Academic_Appointment_Track_Reference" type="{urn:com.workday/bsvc}Academic_Appointment_TrackObjectType" minOccurs="0"/>
 *         &lt;element name="Effective_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Additional_Data" type="{urn:com.workday/bsvc}Effective_Dated_Web_Service_Additional_DataType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Edit_Academic_Appointment_Track_Additional_Data_ResponseType", propOrder = {
    "academicAppointmentTrackReference",
    "effectiveDate",
    "additionalData"
})
public class EditAcademicAppointmentTrackAdditionalDataResponseType {

    @XmlElement(name = "Academic_Appointment_Track_Reference")
    protected AcademicAppointmentTrackObjectType academicAppointmentTrackReference;
    @XmlElement(name = "Effective_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "Additional_Data")
    protected List<EffectiveDatedWebServiceAdditionalDataType> additionalData;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

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
     * Gets the value of the additionalData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EffectiveDatedWebServiceAdditionalDataType }
     * 
     * 
     */
    public List<EffectiveDatedWebServiceAdditionalDataType> getAdditionalData() {
        if (additionalData == null) {
            additionalData = new ArrayList<EffectiveDatedWebServiceAdditionalDataType>();
        }
        return this.additionalData;
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
