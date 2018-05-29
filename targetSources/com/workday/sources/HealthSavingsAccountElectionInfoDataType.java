
package com.workday.sources;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Benefit Plan Earnings Deduction Details Data
 * 
 * <p>Java class for Health_Savings_Account_Election_Info_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Health_Savings_Account_Election_Info_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Coverage_Target_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Annual_Contribution_Amount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="26"/>
 *               &lt;fractionDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Currency_Reference" type="{urn:com.workday/bsvc}CurrencyObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Health_Savings_Account_Election_Info_DataType", propOrder = {
    "coverageTargetName",
    "maximumAnnualContributionAmount",
    "currencyReference"
})
public class HealthSavingsAccountElectionInfoDataType {

    @XmlElement(name = "Coverage_Target_Name")
    protected String coverageTargetName;
    @XmlElement(name = "Maximum_Annual_Contribution_Amount")
    protected BigDecimal maximumAnnualContributionAmount;
    @XmlElement(name = "Currency_Reference")
    protected CurrencyObjectType currencyReference;

    /**
     * Gets the value of the coverageTargetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverageTargetName() {
        return coverageTargetName;
    }

    /**
     * Sets the value of the coverageTargetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverageTargetName(String value) {
        this.coverageTargetName = value;
    }

    /**
     * Gets the value of the maximumAnnualContributionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumAnnualContributionAmount() {
        return maximumAnnualContributionAmount;
    }

    /**
     * Sets the value of the maximumAnnualContributionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumAnnualContributionAmount(BigDecimal value) {
        this.maximumAnnualContributionAmount = value;
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
