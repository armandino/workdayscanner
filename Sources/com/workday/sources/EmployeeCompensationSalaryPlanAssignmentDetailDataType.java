
package com.workday.sources;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Encapsulating element containing all Compensation Element Values for Base Pay data.
 * 
 * <p>Java class for Employee_Compensation_Salary_Plan_Assignment_Detail_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employee_Compensation_Salary_Plan_Assignment_Detail_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Compensation_Element_Reference" type="{urn:com.workday/bsvc}Compensation_Element_ReferenceType" minOccurs="0"/>
 *         &lt;element name="Compensation_Element_Amount">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="26"/>
 *               &lt;fractionDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Currency_Reference" type="{urn:com.workday/bsvc}Currency_Reference_DataType"/>
 *         &lt;element name="Frequency_Reference" type="{urn:com.workday/bsvc}Frequency_Reference_DataType"/>
 *         &lt;element name="Expected_End_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
@XmlType(name = "Employee_Compensation_Salary_Plan_Assignment_Detail_DataType", propOrder = {
    "compensationElementReference",
    "compensationElementAmount",
    "currencyReference",
    "frequencyReference",
    "expectedEndDate",
    "actualEndDate"
})
public class EmployeeCompensationSalaryPlanAssignmentDetailDataType {

    @XmlElement(name = "Compensation_Element_Reference")
    protected CompensationElementReferenceType compensationElementReference;
    @XmlElement(name = "Compensation_Element_Amount", required = true)
    protected BigDecimal compensationElementAmount;
    @XmlElement(name = "Currency_Reference", required = true)
    protected CurrencyReferenceDataType currencyReference;
    @XmlElement(name = "Frequency_Reference", required = true)
    protected FrequencyReferenceDataType frequencyReference;
    @XmlElement(name = "Expected_End_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expectedEndDate;
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
     * Gets the value of the compensationElementAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCompensationElementAmount() {
        return compensationElementAmount;
    }

    /**
     * Sets the value of the compensationElementAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCompensationElementAmount(BigDecimal value) {
        this.compensationElementAmount = value;
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
     * Gets the value of the expectedEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedEndDate() {
        return expectedEndDate;
    }

    /**
     * Sets the value of the expectedEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedEndDate(XMLGregorianCalendar value) {
        this.expectedEndDate = value;
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
