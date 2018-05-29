
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Academic Appointee Data
 * 
 * <p>Java class for Academic_Appointee_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Academic_Appointee_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Person_Data" type="{urn:com.workday/bsvc}Person_Name_DataType" minOccurs="0"/>
 *         &lt;element name="Person_Identification_Data" type="{urn:com.workday/bsvc}Person_Identification_DataType" minOccurs="0"/>
 *         &lt;element name="Personal_Information_Data" type="{urn:com.workday/bsvc}Generic_Personal_Information_DataType" minOccurs="0"/>
 *         &lt;element name="Person_Photo_Data" type="{urn:com.workday/bsvc}Person_Photo_DataType" minOccurs="0"/>
 *         &lt;element name="Appointment_Data" type="{urn:com.workday/bsvc}Academic_Appointment_Snapshot_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Academic_Appointee_DataType", propOrder = {
    "personData",
    "personIdentificationData",
    "personalInformationData",
    "personPhotoData",
    "appointmentData"
})
public class AcademicAppointeeDataType {

    @XmlElement(name = "Person_Data")
    protected PersonNameDataType personData;
    @XmlElement(name = "Person_Identification_Data")
    protected PersonIdentificationDataType personIdentificationData;
    @XmlElement(name = "Personal_Information_Data")
    protected GenericPersonalInformationDataType personalInformationData;
    @XmlElement(name = "Person_Photo_Data")
    protected PersonPhotoDataType personPhotoData;
    @XmlElement(name = "Appointment_Data")
    protected List<AcademicAppointmentSnapshotDataType> appointmentData;

    /**
     * Gets the value of the personData property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameDataType }
     *     
     */
    public PersonNameDataType getPersonData() {
        return personData;
    }

    /**
     * Sets the value of the personData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameDataType }
     *     
     */
    public void setPersonData(PersonNameDataType value) {
        this.personData = value;
    }

    /**
     * Gets the value of the personIdentificationData property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdentificationDataType }
     *     
     */
    public PersonIdentificationDataType getPersonIdentificationData() {
        return personIdentificationData;
    }

    /**
     * Sets the value of the personIdentificationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdentificationDataType }
     *     
     */
    public void setPersonIdentificationData(PersonIdentificationDataType value) {
        this.personIdentificationData = value;
    }

    /**
     * Gets the value of the personalInformationData property.
     * 
     * @return
     *     possible object is
     *     {@link GenericPersonalInformationDataType }
     *     
     */
    public GenericPersonalInformationDataType getPersonalInformationData() {
        return personalInformationData;
    }

    /**
     * Sets the value of the personalInformationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericPersonalInformationDataType }
     *     
     */
    public void setPersonalInformationData(GenericPersonalInformationDataType value) {
        this.personalInformationData = value;
    }

    /**
     * Gets the value of the personPhotoData property.
     * 
     * @return
     *     possible object is
     *     {@link PersonPhotoDataType }
     *     
     */
    public PersonPhotoDataType getPersonPhotoData() {
        return personPhotoData;
    }

    /**
     * Sets the value of the personPhotoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonPhotoDataType }
     *     
     */
    public void setPersonPhotoData(PersonPhotoDataType value) {
        this.personPhotoData = value;
    }

    /**
     * Gets the value of the appointmentData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appointmentData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppointmentData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcademicAppointmentSnapshotDataType }
     * 
     * 
     */
    public List<AcademicAppointmentSnapshotDataType> getAppointmentData() {
        if (appointmentData == null) {
            appointmentData = new ArrayList<AcademicAppointmentSnapshotDataType>();
        }
        return this.appointmentData;
    }

}
