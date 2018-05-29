
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Period Reporting Row Data
 * 
 * <p>Java class for Period_Reporting_Calendar_Row_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Period_Reporting_Calendar_Row_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Period_Reporting_Calendar_Row_Reference" type="{urn:com.workday/bsvc}Period_Reporting_Calendar_RowObjectType" minOccurs="0"/>
 *         &lt;element name="Order">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Calendar_Period_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Academic_Period_Reference" type="{urn:com.workday/bsvc}Academic_PeriodObjectType" minOccurs="0"/>
 *         &lt;element name="Start_Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="End_Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Evaluation_Constraint_Reference" type="{urn:com.workday/bsvc}Evaluation_ConstraintObjectType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Delete" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Add_Only" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Period_Reporting_Calendar_Row_DataType", propOrder = {
    "periodReportingCalendarRowReference",
    "order",
    "calendarPeriodName",
    "academicPeriodReference",
    "startDate",
    "endDate",
    "evaluationConstraintReference"
})
public class PeriodReportingCalendarRowDataType {

    @XmlElement(name = "Period_Reporting_Calendar_Row_Reference")
    protected PeriodReportingCalendarRowObjectType periodReportingCalendarRowReference;
    @XmlElement(name = "Order", required = true)
    protected String order;
    @XmlElement(name = "Calendar_Period_Name", required = true)
    protected String calendarPeriodName;
    @XmlElement(name = "Academic_Period_Reference")
    protected AcademicPeriodObjectType academicPeriodReference;
    @XmlElement(name = "Start_Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "End_Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "Evaluation_Constraint_Reference", required = true)
    protected EvaluationConstraintObjectType evaluationConstraintReference;
    @XmlAttribute(name = "Delete", namespace = "urn:com.workday/bsvc")
    protected Boolean delete;
    @XmlAttribute(name = "Add_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean addOnly;

    /**
     * Gets the value of the periodReportingCalendarRowReference property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodReportingCalendarRowObjectType }
     *     
     */
    public PeriodReportingCalendarRowObjectType getPeriodReportingCalendarRowReference() {
        return periodReportingCalendarRowReference;
    }

    /**
     * Sets the value of the periodReportingCalendarRowReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodReportingCalendarRowObjectType }
     *     
     */
    public void setPeriodReportingCalendarRowReference(PeriodReportingCalendarRowObjectType value) {
        this.periodReportingCalendarRowReference = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrder(String value) {
        this.order = value;
    }

    /**
     * Gets the value of the calendarPeriodName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalendarPeriodName() {
        return calendarPeriodName;
    }

    /**
     * Sets the value of the calendarPeriodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalendarPeriodName(String value) {
        this.calendarPeriodName = value;
    }

    /**
     * Gets the value of the academicPeriodReference property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicPeriodObjectType }
     *     
     */
    public AcademicPeriodObjectType getAcademicPeriodReference() {
        return academicPeriodReference;
    }

    /**
     * Sets the value of the academicPeriodReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicPeriodObjectType }
     *     
     */
    public void setAcademicPeriodReference(AcademicPeriodObjectType value) {
        this.academicPeriodReference = value;
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
     * Gets the value of the evaluationConstraintReference property.
     * 
     * @return
     *     possible object is
     *     {@link EvaluationConstraintObjectType }
     *     
     */
    public EvaluationConstraintObjectType getEvaluationConstraintReference() {
        return evaluationConstraintReference;
    }

    /**
     * Sets the value of the evaluationConstraintReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EvaluationConstraintObjectType }
     *     
     */
    public void setEvaluationConstraintReference(EvaluationConstraintObjectType value) {
        this.evaluationConstraintReference = value;
    }

    /**
     * Gets the value of the delete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelete() {
        return delete;
    }

    /**
     * Sets the value of the delete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelete(Boolean value) {
        this.delete = value;
    }

    /**
     * Gets the value of the addOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddOnly() {
        return addOnly;
    }

    /**
     * Sets the value of the addOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddOnly(Boolean value) {
        this.addOnly = value;
    }

}
