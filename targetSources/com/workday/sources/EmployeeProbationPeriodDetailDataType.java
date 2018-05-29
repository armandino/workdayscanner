
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Encapsulating element containing all Probation Period data. Including Corrected data.
 * 
 * <p>Java class for Employee_Probation_Period_Detail_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employee_Probation_Period_Detail_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Employee_Probation_Period_Event_Reference" type="{urn:com.workday/bsvc}Unique_IdentifierObjectType" minOccurs="0"/>
 *         &lt;element name="Employee_Probation_Period_Reference" type="{urn:com.workday/bsvc}Employee_Probation_PeriodObjectType" minOccurs="0"/>
 *         &lt;element name="Effective_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Start_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="End_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Probation_Type_Reference" type="{urn:com.workday/bsvc}Employee_Probation_Period_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Probation_Reason_Reference" type="{urn:com.workday/bsvc}Employee_Probation_Period_ReasonObjectType" minOccurs="0"/>
 *         &lt;element name="Extended_End_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employee_Probation_Period_Detail_DataType", propOrder = {
    "employeeProbationPeriodEventReference",
    "employeeProbationPeriodReference",
    "effectiveDate",
    "startDate",
    "endDate",
    "probationTypeReference",
    "probationReasonReference",
    "extendedEndDate",
    "note"
})
public class EmployeeProbationPeriodDetailDataType {

    @XmlElement(name = "Employee_Probation_Period_Event_Reference")
    protected UniqueIdentifierObjectType employeeProbationPeriodEventReference;
    @XmlElement(name = "Employee_Probation_Period_Reference")
    protected EmployeeProbationPeriodObjectType employeeProbationPeriodReference;
    @XmlElement(name = "Effective_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "Start_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "End_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "Probation_Type_Reference")
    protected EmployeeProbationPeriodTypeObjectType probationTypeReference;
    @XmlElement(name = "Probation_Reason_Reference")
    protected EmployeeProbationPeriodReasonObjectType probationReasonReference;
    @XmlElement(name = "Extended_End_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar extendedEndDate;
    @XmlElement(name = "Note")
    protected String note;

    /**
     * Gets the value of the employeeProbationPeriodEventReference property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public UniqueIdentifierObjectType getEmployeeProbationPeriodEventReference() {
        return employeeProbationPeriodEventReference;
    }

    /**
     * Sets the value of the employeeProbationPeriodEventReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public void setEmployeeProbationPeriodEventReference(UniqueIdentifierObjectType value) {
        this.employeeProbationPeriodEventReference = value;
    }

    /**
     * Gets the value of the employeeProbationPeriodReference property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeProbationPeriodObjectType }
     *     
     */
    public EmployeeProbationPeriodObjectType getEmployeeProbationPeriodReference() {
        return employeeProbationPeriodReference;
    }

    /**
     * Sets the value of the employeeProbationPeriodReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeProbationPeriodObjectType }
     *     
     */
    public void setEmployeeProbationPeriodReference(EmployeeProbationPeriodObjectType value) {
        this.employeeProbationPeriodReference = value;
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
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the probationTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeProbationPeriodTypeObjectType }
     *     
     */
    public EmployeeProbationPeriodTypeObjectType getProbationTypeReference() {
        return probationTypeReference;
    }

    /**
     * Sets the value of the probationTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeProbationPeriodTypeObjectType }
     *     
     */
    public void setProbationTypeReference(EmployeeProbationPeriodTypeObjectType value) {
        this.probationTypeReference = value;
    }

    /**
     * Gets the value of the probationReasonReference property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeProbationPeriodReasonObjectType }
     *     
     */
    public EmployeeProbationPeriodReasonObjectType getProbationReasonReference() {
        return probationReasonReference;
    }

    /**
     * Sets the value of the probationReasonReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeProbationPeriodReasonObjectType }
     *     
     */
    public void setProbationReasonReference(EmployeeProbationPeriodReasonObjectType value) {
        this.probationReasonReference = value;
    }

    /**
     * Gets the value of the extendedEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExtendedEndDate() {
        return extendedEndDate;
    }

    /**
     * Sets the value of the extendedEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExtendedEndDate(XMLGregorianCalendar value) {
        this.extendedEndDate = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

}
