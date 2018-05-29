
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the employer contribution amount for the retirement savings election.
 * 
 * <p>Java class for Employer_Contribution_Amount_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employer_Contribution_Amount_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Contribution_Amount_Data" type="{urn:com.workday/bsvc}Contribution_Amount_DataType"/>
 *         &lt;element name="Payroll_Interface_Contribution_Amount_Data" type="{urn:com.workday/bsvc}Payroll_Interface_Contribution_Amount_DataType" minOccurs="0"/>
 *         &lt;element name="Currency_Reference" type="{urn:com.workday/bsvc}CurrencyObjectType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employer_Contribution_Amount_DataType", propOrder = {
    "contributionAmountData",
    "payrollInterfaceContributionAmountData",
    "currencyReference"
})
public class EmployerContributionAmountDataType {

    @XmlElement(name = "Contribution_Amount_Data", required = true)
    protected ContributionAmountDataType contributionAmountData;
    @XmlElement(name = "Payroll_Interface_Contribution_Amount_Data")
    protected PayrollInterfaceContributionAmountDataType payrollInterfaceContributionAmountData;
    @XmlElement(name = "Currency_Reference", required = true)
    protected CurrencyObjectType currencyReference;

    /**
     * Gets the value of the contributionAmountData property.
     * 
     * @return
     *     possible object is
     *     {@link ContributionAmountDataType }
     *     
     */
    public ContributionAmountDataType getContributionAmountData() {
        return contributionAmountData;
    }

    /**
     * Sets the value of the contributionAmountData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContributionAmountDataType }
     *     
     */
    public void setContributionAmountData(ContributionAmountDataType value) {
        this.contributionAmountData = value;
    }

    /**
     * Gets the value of the payrollInterfaceContributionAmountData property.
     * 
     * @return
     *     possible object is
     *     {@link PayrollInterfaceContributionAmountDataType }
     *     
     */
    public PayrollInterfaceContributionAmountDataType getPayrollInterfaceContributionAmountData() {
        return payrollInterfaceContributionAmountData;
    }

    /**
     * Sets the value of the payrollInterfaceContributionAmountData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayrollInterfaceContributionAmountDataType }
     *     
     */
    public void setPayrollInterfaceContributionAmountData(PayrollInterfaceContributionAmountDataType value) {
        this.payrollInterfaceContributionAmountData = value;
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

}
