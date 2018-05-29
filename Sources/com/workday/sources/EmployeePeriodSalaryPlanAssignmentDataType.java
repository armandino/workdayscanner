
package com.workday.sources;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Encapsulating element containing all Period Salary Plan Compensation data.
 * 
 * <p>Java class for Employee_Period_Salary_Plan_Assignment_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employee_Period_Salary_Plan_Assignment_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Compensation_Plan_Reference" type="{urn:com.workday/bsvc}Period_Salary_PlanObjectType" minOccurs="0"/>
 *         &lt;element name="Compensation_Element_Reference" type="{urn:com.workday/bsvc}Compensation_Pay_EarningObjectType" minOccurs="0"/>
 *         &lt;element name="Compensation_Period_Reference" type="{urn:com.workday/bsvc}Compensation_PeriodObjectType" minOccurs="0"/>
 *         &lt;element name="Currency_Reference" type="{urn:com.workday/bsvc}CurrencyObjectType" minOccurs="0"/>
 *         &lt;element name="Compensation_Period_Multiplier" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="18"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Frequency_Reference" type="{urn:com.workday/bsvc}FrequencyObjectType" minOccurs="0"/>
 *         &lt;element name="Assignment_Effective_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employee_Period_Salary_Plan_Assignment_DataType", propOrder = {
    "compensationPlanReference",
    "compensationElementReference",
    "compensationPeriodReference",
    "currencyReference",
    "compensationPeriodMultiplier",
    "frequencyReference",
    "assignmentEffectiveDate"
})
public class EmployeePeriodSalaryPlanAssignmentDataType {

    @XmlElement(name = "Compensation_Plan_Reference")
    protected PeriodSalaryPlanObjectType compensationPlanReference;
    @XmlElement(name = "Compensation_Element_Reference")
    protected CompensationPayEarningObjectType compensationElementReference;
    @XmlElement(name = "Compensation_Period_Reference")
    protected CompensationPeriodObjectType compensationPeriodReference;
    @XmlElement(name = "Currency_Reference")
    protected CurrencyObjectType currencyReference;
    @XmlElement(name = "Compensation_Period_Multiplier")
    protected BigDecimal compensationPeriodMultiplier;
    @XmlElement(name = "Frequency_Reference")
    protected FrequencyObjectType frequencyReference;
    @XmlElement(name = "Assignment_Effective_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar assignmentEffectiveDate;

    /**
     * Gets the value of the compensationPlanReference property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodSalaryPlanObjectType }
     *     
     */
    public PeriodSalaryPlanObjectType getCompensationPlanReference() {
        return compensationPlanReference;
    }

    /**
     * Sets the value of the compensationPlanReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodSalaryPlanObjectType }
     *     
     */
    public void setCompensationPlanReference(PeriodSalaryPlanObjectType value) {
        this.compensationPlanReference = value;
    }

    /**
     * Gets the value of the compensationElementReference property.
     * 
     * @return
     *     possible object is
     *     {@link CompensationPayEarningObjectType }
     *     
     */
    public CompensationPayEarningObjectType getCompensationElementReference() {
        return compensationElementReference;
    }

    /**
     * Sets the value of the compensationElementReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompensationPayEarningObjectType }
     *     
     */
    public void setCompensationElementReference(CompensationPayEarningObjectType value) {
        this.compensationElementReference = value;
    }

    /**
     * Gets the value of the compensationPeriodReference property.
     * 
     * @return
     *     possible object is
     *     {@link CompensationPeriodObjectType }
     *     
     */
    public CompensationPeriodObjectType getCompensationPeriodReference() {
        return compensationPeriodReference;
    }

    /**
     * Sets the value of the compensationPeriodReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompensationPeriodObjectType }
     *     
     */
    public void setCompensationPeriodReference(CompensationPeriodObjectType value) {
        this.compensationPeriodReference = value;
    }

    /**
     * Gets the value of the currencyReference property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyObjectType }
     *     
     */
    public CurrencyObjectType getCurrencyReference() {
        return currencyReference;
    }

    /**
     * Sets the value of the currencyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyObjectType }
     *     
     */
    public void setCurrencyReference(CurrencyObjectType value) {
        this.currencyReference = value;
    }

    /**
     * Gets the value of the compensationPeriodMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCompensationPeriodMultiplier() {
        return compensationPeriodMultiplier;
    }

    /**
     * Sets the value of the compensationPeriodMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCompensationPeriodMultiplier(BigDecimal value) {
        this.compensationPeriodMultiplier = value;
    }

    /**
     * Gets the value of the frequencyReference property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyObjectType }
     *     
     */
    public FrequencyObjectType getFrequencyReference() {
        return frequencyReference;
    }

    /**
     * Sets the value of the frequencyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyObjectType }
     *     
     */
    public void setFrequencyReference(FrequencyObjectType value) {
        this.frequencyReference = value;
    }

    /**
     * Gets the value of the assignmentEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAssignmentEffectiveDate() {
        return assignmentEffectiveDate;
    }

    /**
     * Sets the value of the assignmentEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAssignmentEffectiveDate(XMLGregorianCalendar value) {
        this.assignmentEffectiveDate = value;
    }

}
