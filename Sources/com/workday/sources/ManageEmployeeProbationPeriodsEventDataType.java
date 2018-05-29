
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Details of the Probation Period being added to the Worker
 * 
 * <p>Java class for Manage_Employee_Probation_Periods_Event_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Manage_Employee_Probation_Periods_Event_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Worker_Reference" type="{urn:com.workday/bsvc}WorkerObjectType" minOccurs="0"/>
 *         &lt;element name="Position_Reference" type="{urn:com.workday/bsvc}Position_ElementObjectType" minOccurs="0"/>
 *         &lt;element name="Probation_Period_Reference" type="{urn:com.workday/bsvc}Employee_Probation_PeriodObjectType" minOccurs="0"/>
 *         &lt;element name="Start_Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="End_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Probation_Type_Reference" type="{urn:com.workday/bsvc}Employee_Probation_Period_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Derive_Probation_Period_from_Rule" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Length" type="{urn:com.workday/bsvc}Probation_Period_Length_DataType" minOccurs="0"/>
 *         &lt;element name="Extended_Length" type="{urn:com.workday/bsvc}Probation_Period_Extended_Length_DataType" minOccurs="0"/>
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
@XmlType(name = "Manage_Employee_Probation_Periods_Event_DataType", propOrder = {
    "workerReference",
    "positionReference",
    "probationPeriodReference",
    "startDate",
    "endDate",
    "probationTypeReference",
    "deriveProbationPeriodFromRule",
    "length",
    "extendedLength",
    "probationReasonReference",
    "extendedEndDate",
    "note"
})
public class ManageEmployeeProbationPeriodsEventDataType {

    @XmlElement(name = "Worker_Reference")
    protected WorkerObjectType workerReference;
    @XmlElement(name = "Position_Reference")
    protected PositionElementObjectType positionReference;
    @XmlElement(name = "Probation_Period_Reference")
    protected EmployeeProbationPeriodObjectType probationPeriodReference;
    @XmlElement(name = "Start_Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "End_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "Probation_Type_Reference")
    protected EmployeeProbationPeriodTypeObjectType probationTypeReference;
    @XmlElement(name = "Derive_Probation_Period_from_Rule")
    protected Boolean deriveProbationPeriodFromRule;
    @XmlElement(name = "Length")
    protected ProbationPeriodLengthDataType length;
    @XmlElement(name = "Extended_Length")
    protected ProbationPeriodExtendedLengthDataType extendedLength;
    @XmlElement(name = "Probation_Reason_Reference")
    protected EmployeeProbationPeriodReasonObjectType probationReasonReference;
    @XmlElement(name = "Extended_End_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar extendedEndDate;
    @XmlElement(name = "Note")
    protected String note;

    /**
     * Gets the value of the workerReference property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerObjectType }
     *     
     */
    public WorkerObjectType getWorkerReference() {
        return workerReference;
    }

    /**
     * Sets the value of the workerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerObjectType }
     *     
     */
    public void setWorkerReference(WorkerObjectType value) {
        this.workerReference = value;
    }

    /**
     * Gets the value of the positionReference property.
     * 
     * @return
     *     possible object is
     *     {@link PositionElementObjectType }
     *     
     */
    public PositionElementObjectType getPositionReference() {
        return positionReference;
    }

    /**
     * Sets the value of the positionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionElementObjectType }
     *     
     */
    public void setPositionReference(PositionElementObjectType value) {
        this.positionReference = value;
    }

    /**
     * Gets the value of the probationPeriodReference property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeProbationPeriodObjectType }
     *     
     */
    public EmployeeProbationPeriodObjectType getProbationPeriodReference() {
        return probationPeriodReference;
    }

    /**
     * Sets the value of the probationPeriodReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeProbationPeriodObjectType }
     *     
     */
    public void setProbationPeriodReference(EmployeeProbationPeriodObjectType value) {
        this.probationPeriodReference = value;
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
     * Gets the value of the deriveProbationPeriodFromRule property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeriveProbationPeriodFromRule() {
        return deriveProbationPeriodFromRule;
    }

    /**
     * Sets the value of the deriveProbationPeriodFromRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeriveProbationPeriodFromRule(Boolean value) {
        this.deriveProbationPeriodFromRule = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link ProbationPeriodLengthDataType }
     *     
     */
    public ProbationPeriodLengthDataType getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProbationPeriodLengthDataType }
     *     
     */
    public void setLength(ProbationPeriodLengthDataType value) {
        this.length = value;
    }

    /**
     * Gets the value of the extendedLength property.
     * 
     * @return
     *     possible object is
     *     {@link ProbationPeriodExtendedLengthDataType }
     *     
     */
    public ProbationPeriodExtendedLengthDataType getExtendedLength() {
        return extendedLength;
    }

    /**
     * Sets the value of the extendedLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProbationPeriodExtendedLengthDataType }
     *     
     */
    public void setExtendedLength(ProbationPeriodExtendedLengthDataType value) {
        this.extendedLength = value;
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
