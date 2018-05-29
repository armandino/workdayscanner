
package com.workday.sources;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing all Contract Details data.
 * 
 * <p>Java class for Contract_Details_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contract_Details_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Contract_Pay_Rate" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="21"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Currency_Reference_Data" type="{urn:com.workday/bsvc}Currency_Reference_DataType" minOccurs="0"/>
 *         &lt;element name="Frequency_Reference_Data" type="{urn:com.workday/bsvc}Frequency_Reference_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Contract_Assignment_Details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contract_Details_DataType", propOrder = {
    "contractPayRate",
    "currencyReferenceData",
    "frequencyReferenceData",
    "contractAssignmentDetails"
})
public class ContractDetailsDataType {

    @XmlElement(name = "Contract_Pay_Rate")
    protected BigDecimal contractPayRate;
    @XmlElement(name = "Currency_Reference_Data")
    protected CurrencyReferenceDataType currencyReferenceData;
    @XmlElement(name = "Frequency_Reference_Data")
    protected List<FrequencyReferenceDataType> frequencyReferenceData;
    @XmlElement(name = "Contract_Assignment_Details")
    protected String contractAssignmentDetails;

    /**
     * Gets the value of the contractPayRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getContractPayRate() {
        return contractPayRate;
    }

    /**
     * Sets the value of the contractPayRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setContractPayRate(BigDecimal value) {
        this.contractPayRate = value;
    }

    /**
     * Gets the value of the currencyReferenceData property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyReferenceDataType }
     *     
     */
    public CurrencyReferenceDataType getCurrencyReferenceData() {
        return currencyReferenceData;
    }

    /**
     * Sets the value of the currencyReferenceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyReferenceDataType }
     *     
     */
    public void setCurrencyReferenceData(CurrencyReferenceDataType value) {
        this.currencyReferenceData = value;
    }

    /**
     * Gets the value of the frequencyReferenceData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frequencyReferenceData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrequencyReferenceData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FrequencyReferenceDataType }
     * 
     * 
     */
    public List<FrequencyReferenceDataType> getFrequencyReferenceData() {
        if (frequencyReferenceData == null) {
            frequencyReferenceData = new ArrayList<FrequencyReferenceDataType>();
        }
        return this.frequencyReferenceData;
    }

    /**
     * Gets the value of the contractAssignmentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractAssignmentDetails() {
        return contractAssignmentDetails;
    }

    /**
     * Sets the value of the contractAssignmentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractAssignmentDetails(String value) {
        this.contractAssignmentDetails = value;
    }

}
