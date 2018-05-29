
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Academic Appointee Response Group
 * 
 * <p>Java class for Academic_Appointee_Response_GroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Academic_Appointee_Response_GroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Include_Reference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Person_Name_Data" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Person_Identification_Data" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Personal_Information_Data" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Photo_Data" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Appointment_Data" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Academic_Appointee_Response_GroupType", propOrder = {
    "includeReference",
    "includePersonNameData",
    "includePersonIdentificationData",
    "includePersonalInformationData",
    "includePhotoData",
    "includeAppointmentData"
})
public class AcademicAppointeeResponseGroupType {

    @XmlElement(name = "Include_Reference")
    protected Boolean includeReference;
    @XmlElement(name = "Include_Person_Name_Data")
    protected Boolean includePersonNameData;
    @XmlElement(name = "Include_Person_Identification_Data")
    protected Boolean includePersonIdentificationData;
    @XmlElement(name = "Include_Personal_Information_Data")
    protected Boolean includePersonalInformationData;
    @XmlElement(name = "Include_Photo_Data")
    protected Boolean includePhotoData;
    @XmlElement(name = "Include_Appointment_Data")
    protected Boolean includeAppointmentData;

    /**
     * Gets the value of the includeReference property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeReference() {
        return includeReference;
    }

    /**
     * Sets the value of the includeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeReference(Boolean value) {
        this.includeReference = value;
    }

    /**
     * Gets the value of the includePersonNameData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludePersonNameData() {
        return includePersonNameData;
    }

    /**
     * Sets the value of the includePersonNameData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludePersonNameData(Boolean value) {
        this.includePersonNameData = value;
    }

    /**
     * Gets the value of the includePersonIdentificationData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludePersonIdentificationData() {
        return includePersonIdentificationData;
    }

    /**
     * Sets the value of the includePersonIdentificationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludePersonIdentificationData(Boolean value) {
        this.includePersonIdentificationData = value;
    }

    /**
     * Gets the value of the includePersonalInformationData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludePersonalInformationData() {
        return includePersonalInformationData;
    }

    /**
     * Sets the value of the includePersonalInformationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludePersonalInformationData(Boolean value) {
        this.includePersonalInformationData = value;
    }

    /**
     * Gets the value of the includePhotoData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludePhotoData() {
        return includePhotoData;
    }

    /**
     * Sets the value of the includePhotoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludePhotoData(Boolean value) {
        this.includePhotoData = value;
    }

    /**
     * Gets the value of the includeAppointmentData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeAppointmentData() {
        return includeAppointmentData;
    }

    /**
     * Sets the value of the includeAppointmentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeAppointmentData(Boolean value) {
        this.includeAppointmentData = value;
    }

}
