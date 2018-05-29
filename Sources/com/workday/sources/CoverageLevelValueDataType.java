
package com.workday.sources;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the detailed insurance coverage level information for an election.
 * 
 * <p>Java class for Coverage_Level_Value_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Coverage_Level_Value_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Coverage_Level_Value">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="21"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Buy_Up_Amount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="21"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Guarantee_Issue_Amount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="21"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Coverage_Level_Multiplier">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Coverage_Level_Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "Coverage_Level_Value_DataType", propOrder = {
    "coverageLevelValue",
    "buyUpAmount",
    "guaranteeIssueAmount",
    "coverageLevelMultiplier",
    "coverageLevelType",
    "currencyReference"
})
public class CoverageLevelValueDataType {

    @XmlElement(name = "Coverage_Level_Value", required = true)
    protected BigDecimal coverageLevelValue;
    @XmlElement(name = "Buy_Up_Amount")
    protected BigDecimal buyUpAmount;
    @XmlElement(name = "Guarantee_Issue_Amount")
    protected BigDecimal guaranteeIssueAmount;
    @XmlElement(name = "Coverage_Level_Multiplier", required = true)
    protected BigDecimal coverageLevelMultiplier;
    @XmlElement(name = "Coverage_Level_Type", required = true)
    protected String coverageLevelType;
    @XmlElement(name = "Currency_Reference", required = true)
    protected CurrencyObjectType currencyReference;

    /**
     * Gets the value of the coverageLevelValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoverageLevelValue() {
        return coverageLevelValue;
    }

    /**
     * Sets the value of the coverageLevelValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoverageLevelValue(BigDecimal value) {
        this.coverageLevelValue = value;
    }

    /**
     * Gets the value of the buyUpAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBuyUpAmount() {
        return buyUpAmount;
    }

    /**
     * Sets the value of the buyUpAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBuyUpAmount(BigDecimal value) {
        this.buyUpAmount = value;
    }

    /**
     * Gets the value of the guaranteeIssueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGuaranteeIssueAmount() {
        return guaranteeIssueAmount;
    }

    /**
     * Sets the value of the guaranteeIssueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGuaranteeIssueAmount(BigDecimal value) {
        this.guaranteeIssueAmount = value;
    }

    /**
     * Gets the value of the coverageLevelMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoverageLevelMultiplier() {
        return coverageLevelMultiplier;
    }

    /**
     * Sets the value of the coverageLevelMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoverageLevelMultiplier(BigDecimal value) {
        this.coverageLevelMultiplier = value;
    }

    /**
     * Gets the value of the coverageLevelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverageLevelType() {
        return coverageLevelType;
    }

    /**
     * Sets the value of the coverageLevelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverageLevelType(String value) {
        this.coverageLevelType = value;
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
