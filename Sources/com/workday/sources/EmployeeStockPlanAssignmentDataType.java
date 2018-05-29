
package com.workday.sources;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Encapsulating element containing all Stock Plan Compensation data.
 * 
 * <p>Java class for Employee_Stock_Plan_Assignment_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employee_Stock_Plan_Assignment_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Compensation_Plan_Reference" type="{urn:com.workday/bsvc}Stock_PlanObjectType" minOccurs="0"/>
 *         &lt;element name="Percent_of_Target_as_Option" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="7"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Percent_of_Target_as_Stock" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="7"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Target_Shares" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="12"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Individual_Target_Shares" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="21"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Target_Percent" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="16"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Individual_Target_Amount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="26"/>
 *               &lt;fractionDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Target_Amount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="26"/>
 *               &lt;fractionDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Individual_Target_Percent" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="18"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Currency_Reference" type="{urn:com.workday/bsvc}CurrencyObjectType" minOccurs="0"/>
 *         &lt;element name="Vesting_Schedule_Reference" type="{urn:com.workday/bsvc}Stock_Vesting_ScheduleObjectType" minOccurs="0"/>
 *         &lt;element name="Compensation_Matrix_Reference" type="{urn:com.workday/bsvc}Compensation_MatrixObjectType" minOccurs="0"/>
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
@XmlType(name = "Employee_Stock_Plan_Assignment_DataType", propOrder = {
    "compensationPlanReference",
    "percentOfTargetAsOption",
    "percentOfTargetAsStock",
    "targetShares",
    "individualTargetShares",
    "targetPercent",
    "individualTargetAmount",
    "targetAmount",
    "individualTargetPercent",
    "currencyReference",
    "vestingScheduleReference",
    "compensationMatrixReference",
    "assignmentEffectiveDate"
})
public class EmployeeStockPlanAssignmentDataType {

    @XmlElement(name = "Compensation_Plan_Reference")
    protected StockPlanObjectType compensationPlanReference;
    @XmlElement(name = "Percent_of_Target_as_Option")
    protected BigDecimal percentOfTargetAsOption;
    @XmlElement(name = "Percent_of_Target_as_Stock")
    protected BigDecimal percentOfTargetAsStock;
    @XmlElement(name = "Target_Shares")
    protected BigDecimal targetShares;
    @XmlElement(name = "Individual_Target_Shares")
    protected BigDecimal individualTargetShares;
    @XmlElement(name = "Target_Percent")
    protected BigDecimal targetPercent;
    @XmlElement(name = "Individual_Target_Amount")
    protected BigDecimal individualTargetAmount;
    @XmlElement(name = "Target_Amount")
    protected BigDecimal targetAmount;
    @XmlElement(name = "Individual_Target_Percent")
    protected BigDecimal individualTargetPercent;
    @XmlElement(name = "Currency_Reference")
    protected CurrencyObjectType currencyReference;
    @XmlElement(name = "Vesting_Schedule_Reference")
    protected StockVestingScheduleObjectType vestingScheduleReference;
    @XmlElement(name = "Compensation_Matrix_Reference")
    protected CompensationMatrixObjectType compensationMatrixReference;
    @XmlElement(name = "Assignment_Effective_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar assignmentEffectiveDate;

    /**
     * Gets the value of the compensationPlanReference property.
     * 
     * @return
     *     possible object is
     *     {@link StockPlanObjectType }
     *     
     */
    public StockPlanObjectType getCompensationPlanReference() {
        return compensationPlanReference;
    }

    /**
     * Sets the value of the compensationPlanReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockPlanObjectType }
     *     
     */
    public void setCompensationPlanReference(StockPlanObjectType value) {
        this.compensationPlanReference = value;
    }

    /**
     * Gets the value of the percentOfTargetAsOption property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentOfTargetAsOption() {
        return percentOfTargetAsOption;
    }

    /**
     * Sets the value of the percentOfTargetAsOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentOfTargetAsOption(BigDecimal value) {
        this.percentOfTargetAsOption = value;
    }

    /**
     * Gets the value of the percentOfTargetAsStock property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentOfTargetAsStock() {
        return percentOfTargetAsStock;
    }

    /**
     * Sets the value of the percentOfTargetAsStock property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentOfTargetAsStock(BigDecimal value) {
        this.percentOfTargetAsStock = value;
    }

    /**
     * Gets the value of the targetShares property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTargetShares() {
        return targetShares;
    }

    /**
     * Sets the value of the targetShares property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTargetShares(BigDecimal value) {
        this.targetShares = value;
    }

    /**
     * Gets the value of the individualTargetShares property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndividualTargetShares() {
        return individualTargetShares;
    }

    /**
     * Sets the value of the individualTargetShares property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIndividualTargetShares(BigDecimal value) {
        this.individualTargetShares = value;
    }

    /**
     * Gets the value of the targetPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTargetPercent() {
        return targetPercent;
    }

    /**
     * Sets the value of the targetPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTargetPercent(BigDecimal value) {
        this.targetPercent = value;
    }

    /**
     * Gets the value of the individualTargetAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndividualTargetAmount() {
        return individualTargetAmount;
    }

    /**
     * Sets the value of the individualTargetAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIndividualTargetAmount(BigDecimal value) {
        this.individualTargetAmount = value;
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
     * Gets the value of the individualTargetPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndividualTargetPercent() {
        return individualTargetPercent;
    }

    /**
     * Sets the value of the individualTargetPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIndividualTargetPercent(BigDecimal value) {
        this.individualTargetPercent = value;
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
     * Gets the value of the vestingScheduleReference property.
     * 
     * @return
     *     possible object is
     *     {@link StockVestingScheduleObjectType }
     *     
     */
    public StockVestingScheduleObjectType getVestingScheduleReference() {
        return vestingScheduleReference;
    }

    /**
     * Sets the value of the vestingScheduleReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockVestingScheduleObjectType }
     *     
     */
    public void setVestingScheduleReference(StockVestingScheduleObjectType value) {
        this.vestingScheduleReference = value;
    }

    /**
     * Gets the value of the compensationMatrixReference property.
     * 
     * @return
     *     possible object is
     *     {@link CompensationMatrixObjectType }
     *     
     */
    public CompensationMatrixObjectType getCompensationMatrixReference() {
        return compensationMatrixReference;
    }

    /**
     * Sets the value of the compensationMatrixReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompensationMatrixObjectType }
     *     
     */
    public void setCompensationMatrixReference(CompensationMatrixObjectType value) {
        this.compensationMatrixReference = value;
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
