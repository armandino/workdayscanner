
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Top-level request element to add an academic appointment
 * 
 * <p>Java class for Add_Academic_Appointment_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Add_Academic_Appointment_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Business_Process_Parameters" type="{urn:com.workday/bsvc}Business_Process_ParametersType" minOccurs="0"/>
 *         &lt;element name="Add_Academic_Appointment_Data" type="{urn:com.workday/bsvc}Add_Academic_Appointment_DataType"/>
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
@XmlType(name = "Add_Academic_Appointment_RequestType", propOrder = {
    "businessProcessParameters",
    "addAcademicAppointmentData"
})
public class AddAcademicAppointmentRequestType {

    @XmlElement(name = "Business_Process_Parameters")
    protected BusinessProcessParametersType businessProcessParameters;
    @XmlElement(name = "Add_Academic_Appointment_Data", required = true)
    protected AddAcademicAppointmentDataType addAcademicAppointmentData;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the businessProcessParameters property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessProcessParametersType }
     *     
     */
    public BusinessProcessParametersType getBusinessProcessParameters() {
        return businessProcessParameters;
    }

    /**
     * Sets the value of the businessProcessParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessProcessParametersType }
     *     
     */
    public void setBusinessProcessParameters(BusinessProcessParametersType value) {
        this.businessProcessParameters = value;
    }

    /**
     * Gets the value of the addAcademicAppointmentData property.
     * 
     * @return
     *     possible object is
     *     {@link AddAcademicAppointmentDataType }
     *     
     */
    public AddAcademicAppointmentDataType getAddAcademicAppointmentData() {
        return addAcademicAppointmentData;
    }

    /**
     * Sets the value of the addAcademicAppointmentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddAcademicAppointmentDataType }
     *     
     */
    public void setAddAcademicAppointmentData(AddAcademicAppointmentDataType value) {
        this.addAcademicAppointmentData = value;
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
