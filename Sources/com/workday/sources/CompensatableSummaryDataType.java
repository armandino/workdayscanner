
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element containing summary compensation information for a position.  The information is in the position's compensation currency and frequency, annualized, and annualized in the default currency.
 * 
 * <p>Java class for Compensatable_Summary_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Compensatable_Summary_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Employee_Compensation_Summary_Data" type="{urn:com.workday/bsvc}Compensatable_Summary_Amount_DataType" minOccurs="0"/>
 *         &lt;element name="Annualized_Summary_Data" type="{urn:com.workday/bsvc}Compensatable_Summary_Amount_Annualized_DataType" minOccurs="0"/>
 *         &lt;element name="Summary_Data_in_Pay_Group_Frequency" type="{urn:com.workday/bsvc}Compensatable_Summary_Amount_In_Target_Frequency_DataType" minOccurs="0"/>
 *         &lt;element name="Annualized_in_Reporting_Currency_Summary_Data" type="{urn:com.workday/bsvc}Compensatable_Summary_Amount_Annualized_In_Reporting_Currency_DataType" minOccurs="0"/>
 *         &lt;element name="Summary_Data_in_Hourly_Frequency" type="{urn:com.workday/bsvc}Compensatable_Summary_Amount_Hourly_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Compensatable_Summary_DataType", propOrder = {
    "employeeCompensationSummaryData",
    "annualizedSummaryData",
    "summaryDataInPayGroupFrequency",
    "annualizedInReportingCurrencySummaryData",
    "summaryDataInHourlyFrequency"
})
public class CompensatableSummaryDataType {

    @XmlElement(name = "Employee_Compensation_Summary_Data")
    protected CompensatableSummaryAmountDataType employeeCompensationSummaryData;
    @XmlElement(name = "Annualized_Summary_Data")
    protected CompensatableSummaryAmountAnnualizedDataType annualizedSummaryData;
    @XmlElement(name = "Summary_Data_in_Pay_Group_Frequency")
    protected CompensatableSummaryAmountInTargetFrequencyDataType summaryDataInPayGroupFrequency;
    @XmlElement(name = "Annualized_in_Reporting_Currency_Summary_Data")
    protected CompensatableSummaryAmountAnnualizedInReportingCurrencyDataType annualizedInReportingCurrencySummaryData;
    @XmlElement(name = "Summary_Data_in_Hourly_Frequency")
    protected CompensatableSummaryAmountHourlyDataType summaryDataInHourlyFrequency;

    /**
     * Gets the value of the employeeCompensationSummaryData property.
     * 
     * @return
     *     possible object is
     *     {@link CompensatableSummaryAmountDataType }
     *     
     */
    public CompensatableSummaryAmountDataType getEmployeeCompensationSummaryData() {
        return employeeCompensationSummaryData;
    }

    /**
     * Sets the value of the employeeCompensationSummaryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompensatableSummaryAmountDataType }
     *     
     */
    public void setEmployeeCompensationSummaryData(CompensatableSummaryAmountDataType value) {
        this.employeeCompensationSummaryData = value;
    }

    /**
     * Gets the value of the annualizedSummaryData property.
     * 
     * @return
     *     possible object is
     *     {@link CompensatableSummaryAmountAnnualizedDataType }
     *     
     */
    public CompensatableSummaryAmountAnnualizedDataType getAnnualizedSummaryData() {
        return annualizedSummaryData;
    }

    /**
     * Sets the value of the annualizedSummaryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompensatableSummaryAmountAnnualizedDataType }
     *     
     */
    public void setAnnualizedSummaryData(CompensatableSummaryAmountAnnualizedDataType value) {
        this.annualizedSummaryData = value;
    }

    /**
     * Gets the value of the summaryDataInPayGroupFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link CompensatableSummaryAmountInTargetFrequencyDataType }
     *     
     */
    public CompensatableSummaryAmountInTargetFrequencyDataType getSummaryDataInPayGroupFrequency() {
        return summaryDataInPayGroupFrequency;
    }

    /**
     * Sets the value of the summaryDataInPayGroupFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompensatableSummaryAmountInTargetFrequencyDataType }
     *     
     */
    public void setSummaryDataInPayGroupFrequency(CompensatableSummaryAmountInTargetFrequencyDataType value) {
        this.summaryDataInPayGroupFrequency = value;
    }

    /**
     * Gets the value of the annualizedInReportingCurrencySummaryData property.
     * 
     * @return
     *     possible object is
     *     {@link CompensatableSummaryAmountAnnualizedInReportingCurrencyDataType }
     *     
     */
    public CompensatableSummaryAmountAnnualizedInReportingCurrencyDataType getAnnualizedInReportingCurrencySummaryData() {
        return annualizedInReportingCurrencySummaryData;
    }

    /**
     * Sets the value of the annualizedInReportingCurrencySummaryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompensatableSummaryAmountAnnualizedInReportingCurrencyDataType }
     *     
     */
    public void setAnnualizedInReportingCurrencySummaryData(CompensatableSummaryAmountAnnualizedInReportingCurrencyDataType value) {
        this.annualizedInReportingCurrencySummaryData = value;
    }

    /**
     * Gets the value of the summaryDataInHourlyFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link CompensatableSummaryAmountHourlyDataType }
     *     
     */
    public CompensatableSummaryAmountHourlyDataType getSummaryDataInHourlyFrequency() {
        return summaryDataInHourlyFrequency;
    }

    /**
     * Sets the value of the summaryDataInHourlyFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompensatableSummaryAmountHourlyDataType }
     *     
     */
    public void setSummaryDataInHourlyFrequency(CompensatableSummaryAmountHourlyDataType value) {
        this.summaryDataInHourlyFrequency = value;
    }

}
