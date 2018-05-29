
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Encapsulating element containing all External Disability Self-Identification Record data.
 * 
 * <p>Java class for External_Disability_Self-Identification_Record_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="External_Disability_Self-Identification_Record_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Employee_Reference" type="{urn:com.workday/bsvc}EmployeeObjectType"/>
 *         &lt;element name="Disability_Status_Reference" type="{urn:com.workday/bsvc}Self-Identification_of_Disability_StatusObjectType" minOccurs="0"/>
 *         &lt;element name="Invitation_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Response_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "External_Disability_Self-Identification_Record_DataType", propOrder = {
    "id",
    "employeeReference",
    "disabilityStatusReference",
    "invitationDate",
    "responseDate"
})
public class ExternalDisabilitySelfIdentificationRecordDataType {

    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "Employee_Reference", required = true)
    protected EmployeeObjectType employeeReference;
    @XmlElement(name = "Disability_Status_Reference")
    protected SelfIdentificationOfDisabilityStatusObjectType disabilityStatusReference;
    @XmlElement(name = "Invitation_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar invitationDate;
    @XmlElement(name = "Response_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar responseDate;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the employeeReference property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeObjectType }
     *     
     */
    public EmployeeObjectType getEmployeeReference() {
        return employeeReference;
    }

    /**
     * Sets the value of the employeeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeObjectType }
     *     
     */
    public void setEmployeeReference(EmployeeObjectType value) {
        this.employeeReference = value;
    }

    /**
     * Gets the value of the disabilityStatusReference property.
     * 
     * @return
     *     possible object is
     *     {@link SelfIdentificationOfDisabilityStatusObjectType }
     *     
     */
    public SelfIdentificationOfDisabilityStatusObjectType getDisabilityStatusReference() {
        return disabilityStatusReference;
    }

    /**
     * Sets the value of the disabilityStatusReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelfIdentificationOfDisabilityStatusObjectType }
     *     
     */
    public void setDisabilityStatusReference(SelfIdentificationOfDisabilityStatusObjectType value) {
        this.disabilityStatusReference = value;
    }

    /**
     * Gets the value of the invitationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvitationDate() {
        return invitationDate;
    }

    /**
     * Sets the value of the invitationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvitationDate(XMLGregorianCalendar value) {
        this.invitationDate = value;
    }

    /**
     * Gets the value of the responseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResponseDate() {
        return responseDate;
    }

    /**
     * Sets the value of the responseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResponseDate(XMLGregorianCalendar value) {
        this.responseDate = value;
    }

}
