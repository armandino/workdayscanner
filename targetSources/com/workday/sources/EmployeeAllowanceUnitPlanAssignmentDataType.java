
package com.workday.sources;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Encapsulating element containing all Unit Allowance Plan Compensation data.
 * 
 * <p>Java class for Employee_Allowance_Unit_Plan_Assignment_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employee_Allowance_Unit_Plan_Assignment_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Compensation_Plan_Reference" type="{urn:com.workday/bsvc}Allowance_Unit_PlanObjectType" minOccurs="0"/>
 *         &lt;element name="Compensation_Element_Reference" type="{urn:com.workday/bsvc}Compensation_Pay_EarningObjectType" minOccurs="0"/>
 *         &lt;element name="Number_of_Units" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="21"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Unit_Reference" type="{urn:com.workday/bsvc}Unit_of_MeasureObjectType" minOccurs="0"/>
 *         &lt;element name="Frequency_Reference" type="{urn:com.workday/bsvc}FrequencyObjectType" minOccurs="0"/>
 *         &lt;element name="Per_Unit_Amount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="26"/>
 *               &lt;fractionDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Currency_Reference" type="{urn:com.workday/bsvc}CurrencyObjectType"/>
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
@XmlType(name = "Employee_Allowance_Unit_Plan_Assignment_DataType", propOrder = {
    "compensationPlanReference",
    "compensationElementReference",
    "numberOfUnits",
    "unitReference",
    "frequencyReference",
    "perUnitAmount",
    "currencyReference",
    "assignmentEffectiveDate"
})
public class EmployeeAllowanceUnitPlanAssignmentDataType {

    @XmlElement(name = "Compensation_Plan_Reference")
    protected AllowanceUnitPlanObjectType compensationPlanReference;
    @XmlElement(name = "Compensation_Element_Reference")
    protected CompensationPayEarningObjectType compensationElementReference;
    @XmlElement(name = "Number_of_Units")
    protected BigDecimal numberOfUnits;
    @XmlElement(name = "Unit_Reference")
    protected UnitOfMeasureObjectType unitReference;
    @XmlElement(name = "Frequency_Reference")
    protected FrequencyObjectType frequencyReference;
    @XmlElement(name = "Per_Unit_Amount")
    protected BigDecimal perUnitAmount;
    @XmlElement(name = "Currency_Reference", required = true)
    protected CurrencyObjectType currencyReference;
    @XmlElement(name = "Assignment_Effective_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar assignmentEffectiveDate;

    /**
     * Gets the value of the compensationPlanReference property.
     * 
     * @return
     *     possible object is
     *     {@link AllowanceUnitPlanObjectType }
     *     
     */
    public AllowanceUnitPlanObjectType getCompensationPlanReference() {
        return compensationPlanReference;
    }

    /**
     * Sets the value of the compensationPlanReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowanceUnitPlanObjectType }
     *     
     */
    public void setCompensationPlanReference(AllowanceUnitPlanObjectType value) {
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
     * Gets the value of the numberOfUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumberOfUnits() {
        return numberOfUnits;
    }

    /**
     * Sets the value of the numberOfUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumberOfUnits(BigDecimal value) {
        this.numberOfUnits = value;
    }

    /**
     * Gets the value of the unitReference property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasureObjectType }
     *     
     */
    public UnitOfMeasureObjectType getUnitReference() {
        return unitReference;
    }

    /**
     * Sets the value of the unitReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasureObjectType }
     *     
     */
    public void setUnitReference(UnitOfMeasureObjectType value) {
        this.unitReference = value;
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
     * Gets the value of the perUnitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerUnitAmount() {
        return perUnitAmount;
    }

    /**
     * Sets the value of the perUnitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPerUnitAmount(BigDecimal value) {
        this.perUnitAmount = value;
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
