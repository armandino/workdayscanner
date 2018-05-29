
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
 * <p>Java class for Employee_Compensation_Period_Salary_Plan_Assignment_Detail_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employee_Compensation_Period_Salary_Plan_Assignment_Detail_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Compensation_Element_Reference" type="{urn:com.workday/bsvc}Compensation_Element_ReferenceType" minOccurs="0"/>
 *         &lt;element name="Compensation_Period_Reference" type="{urn:com.workday/bsvc}Compensation_PeriodObjectType" minOccurs="0"/>
 *         &lt;element name="Currency_Reference" type="{urn:com.workday/bsvc}Currency_Reference_DataType"/>
 *         &lt;element name="Compensation_Multiplier" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="18"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Frequency_Reference" type="{urn:com.workday/bsvc}Frequency_Reference_DataType" minOccurs="0"/>
 *         &lt;element name="Actual_End_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employee_Compensation_Period_Salary_Plan_Assignment_Detail_DataType", propOrder = {
    "compensationElementReference",
    "compensationPeriodReference",
    "currencyReference",
    "compensationMultiplier",
    "frequencyReference",
    "actualEndDate"
})
public class EmployeeCompensationPeriodSalaryPlanAssignmentDetailDataType {

    @XmlElement(name = "Compensation_Element_Reference")
    protected CompensationElementReferenceType compensationElementReference;
    @XmlElement(name = "Compensation_Period_Reference")
    protected CompensationPeriodObjectType compensationPeriodReference;
    @XmlElement(name = "Currency_Reference", required = true)
    protected CurrencyReferenceDataType currencyReference;
    @XmlElement(name = "Compensation_Multiplier")
    protected BigDecimal compensationMultiplier;
    @XmlElement(name = "Frequency_Reference")
    protected FrequencyReferenceDataType frequencyReference;
    @XmlElement(name = "Actual_End_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar actualEndDate;

    /**
     * Gets the value of the compensationElementReference property.
     * 
     * @return
     *     possible object is
     *     {@link CompensationElementReferenceType }
     *     
     */
    public CompensationElementReferenceType getCompensationElementReference() {
        return compensationElementReference;
    }

    /**
     * Sets the value of the compensationElementReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompensationElementReferenceType }
     *     
     */
    public void setCompensationElementReference(CompensationElementReferenceType value) {
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
     *     {@link CurrencyReferenceDataType }
     *     
     */
    public CurrencyReferenceDataType getCurrencyReference() {
        return currencyReference;
    }

    /**
     * Sets the value of the currencyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyReferenceDataType }
     *     
     */
    public void setCurrencyReference(CurrencyReferenceDataType value) {
        this.currencyReference = value;
    }

    /**
     * Gets the value of the compensationMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCompensationMultiplier() {
        return compensationMultiplier;
    }

    /**
     * Sets the value of the compensationMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCompensationMultiplier(BigDecimal value) {
        this.compensationMultiplier = value;
    }

    /**
     * Gets the value of the frequencyReference property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyReferenceDataType }
     *     
     */
    public FrequencyReferenceDataType getFrequencyReference() {
        return frequencyReference;
    }

    /**
     * Sets the value of the frequencyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyReferenceDataType }
     *     
     */
    public void setFrequencyReference(FrequencyReferenceDataType value) {
        this.frequencyReference = value;
    }

    /**
     * Gets the value of the actualEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualEndDate() {
        return actualEndDate;
    }

    /**
     * Sets the value of the actualEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualEndDate(XMLGregorianCalendar value) {
        this.actualEndDate = value;
    }

}
