
package com.workday.sources;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Encapsulating element containing all Contract data for a Worker.
 * 
 * <p>Java class for Worker_Contract_Detail_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Contract_Detail_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Contract_Pay_Rate" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="21"/>
 *               &lt;fractionDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Currency_Reference" type="{urn:com.workday/bsvc}CurrencyObjectType" minOccurs="0"/>
 *         &lt;element name="Frequency_Reference" type="{urn:com.workday/bsvc}FrequencyObjectType" minOccurs="0"/>
 *         &lt;element name="Contract_Assignment_Details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contract_End_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Supplier_Reference" type="{urn:com.workday/bsvc}SupplierObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Contract_Detail_DataType", propOrder = {
    "contractPayRate",
    "currencyReference",
    "frequencyReference",
    "contractAssignmentDetails",
    "contractEndDate",
    "supplierReference"
})
public class WorkerContractDetailDataType {

    @XmlElement(name = "Contract_Pay_Rate")
    protected BigDecimal contractPayRate;
    @XmlElement(name = "Currency_Reference")
    protected CurrencyObjectType currencyReference;
    @XmlElement(name = "Frequency_Reference")
    protected FrequencyObjectType frequencyReference;
    @XmlElement(name = "Contract_Assignment_Details")
    protected String contractAssignmentDetails;
    @XmlElement(name = "Contract_End_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar contractEndDate;
    @XmlElement(name = "Supplier_Reference")
    protected SupplierObjectType supplierReference;

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

    /**
     * Gets the value of the contractEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractEndDate() {
        return contractEndDate;
    }

    /**
     * Sets the value of the contractEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractEndDate(XMLGregorianCalendar value) {
        this.contractEndDate = value;
    }

    /**
     * Gets the value of the supplierReference property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierObjectType }
     *     
     */
    public SupplierObjectType getSupplierReference() {
        return supplierReference;
    }

    /**
     * Sets the value of the supplierReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierObjectType }
     *     
     */
    public void setSupplierReference(SupplierObjectType value) {
        this.supplierReference = value;
    }

}
