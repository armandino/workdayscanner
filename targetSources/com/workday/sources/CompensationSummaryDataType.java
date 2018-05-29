
package com.workday.sources;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containg a brief summary of Compensation data.
 * 
 * <p>Java class for Compensation_Summary_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Compensation_Summary_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Total_Compensation" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="26"/>
 *               &lt;fractionDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Total_Base_Pay" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="26"/>
 *               &lt;fractionDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Currency_Reference" type="{urn:com.workday/bsvc}Currency_Reference_DataType" minOccurs="0"/>
 *         &lt;element name="Frequency_Reference" type="{urn:com.workday/bsvc}Frequency_Reference_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Compensation_Summary_DataType", propOrder = {
    "totalCompensation",
    "totalBasePay",
    "currencyReference",
    "frequencyReference"
})
public class CompensationSummaryDataType {

    @XmlElement(name = "Total_Compensation")
    protected BigDecimal totalCompensation;
    @XmlElement(name = "Total_Base_Pay")
    protected BigDecimal totalBasePay;
    @XmlElement(name = "Currency_Reference")
    protected CurrencyReferenceDataType currencyReference;
    @XmlElement(name = "Frequency_Reference")
    protected FrequencyReferenceDataType frequencyReference;

    /**
     * Gets the value of the totalCompensation property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCompensation() {
        return totalCompensation;
    }

    /**
     * Sets the value of the totalCompensation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCompensation(BigDecimal value) {
        this.totalCompensation = value;
    }

    /**
     * Gets the value of the totalBasePay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalBasePay() {
        return totalBasePay;
    }

    /**
     * Sets the value of the totalBasePay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalBasePay(BigDecimal value) {
        this.totalBasePay = value;
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

}
