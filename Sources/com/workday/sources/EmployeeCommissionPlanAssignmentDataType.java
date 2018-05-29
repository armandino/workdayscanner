
package com.workday.sources;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Encapsulating element containing all Commission Plan Compensation data.
 * 
 * <p>Java class for Employee_Commission_Plan_Assignment_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employee_Commission_Plan_Assignment_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Compensation_Plan_Reference" type="{urn:com.workday/bsvc}Commission_PlanObjectType" minOccurs="0"/>
 *         &lt;element name="Compensation_Element_Reference" type="{urn:com.workday/bsvc}Compensation_Pay_EarningObjectType" minOccurs="0"/>
 *         &lt;element name="Target_Amount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="26"/>
 *               &lt;fractionDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Currency_Reference" type="{urn:com.workday/bsvc}CurrencyObjectType" minOccurs="0"/>
 *         &lt;element name="Frequency_Reference" type="{urn:com.workday/bsvc}FrequencyObjectType" minOccurs="0"/>
 *         &lt;element name="Draw_Amount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="21"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Draw_Frequency_Reference" type="{urn:com.workday/bsvc}FrequencyObjectType" minOccurs="0"/>
 *         &lt;element name="Draw_Duration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Recoverable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "Employee_Commission_Plan_Assignment_DataType", propOrder = {
    "compensationPlanReference",
    "compensationElementReference",
    "targetAmount",
    "currencyReference",
    "frequencyReference",
    "drawAmount",
    "drawFrequencyReference",
    "drawDuration",
    "recoverable",
    "assignmentEffectiveDate"
})
public class EmployeeCommissionPlanAssignmentDataType {

    @XmlElement(name = "Compensation_Plan_Reference")
    protected CommissionPlanObjectType compensationPlanReference;
    @XmlElement(name = "Compensation_Element_Reference")
    protected CompensationPayEarningObjectType compensationElementReference;
    @XmlElement(name = "Target_Amount")
    protected BigDecimal targetAmount;
    @XmlElement(name = "Currency_Reference")
    protected CurrencyObjectType currencyReference;
    @XmlElement(name = "Frequency_Reference")
    protected FrequencyObjectType frequencyReference;
    @XmlElement(name = "Draw_Amount")
    protected BigDecimal drawAmount;
    @XmlElement(name = "Draw_Frequency_Reference")
    protected FrequencyObjectType drawFrequencyReference;
    @XmlElement(name = "Draw_Duration")
    protected String drawDuration;
    @XmlElement(name = "Recoverable")
    protected Boolean recoverable;
    @XmlElement(name = "Assignment_Effective_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar assignmentEffectiveDate;

    /**
     * Gets the value of the compensationPlanReference property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionPlanObjectType }
     *     
     */
    public CommissionPlanObjectType getCompensationPlanReference() {
        return compensationPlanReference;
    }

    /**
     * Sets the value of the compensationPlanReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionPlanObjectType }
     *     
     */
    public void setCompensationPlanReference(CommissionPlanObjectType value) {
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
     * Gets the value of the targetAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTargetAmount() {
        return targetAmount;
    }

    /**
     * Sets the value of the targetAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTargetAmount(BigDecimal value) {
        this.targetAmount = value;
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
     * Gets the value of the drawAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDrawAmount() {
        return drawAmount;
    }

    /**
     * Sets the value of the drawAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDrawAmount(BigDecimal value) {
        this.drawAmount = value;
    }

    /**
     * Gets the value of the drawFrequencyReference property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyObjectType }
     *     
     */
    public FrequencyObjectType getDrawFrequencyReference() {
        return drawFrequencyReference;
    }

    /**
     * Sets the value of the drawFrequencyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyObjectType }
     *     
     */
    public void setDrawFrequencyReference(FrequencyObjectType value) {
        this.drawFrequencyReference = value;
    }

    /**
     * Gets the value of the drawDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrawDuration() {
        return drawDuration;
    }

    /**
     * Sets the value of the drawDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrawDuration(String value) {
        this.drawDuration = value;
    }

    /**
     * Gets the value of the recoverable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecoverable() {
        return recoverable;
    }

    /**
     * Sets the value of the recoverable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecoverable(Boolean value) {
        this.recoverable = value;
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
