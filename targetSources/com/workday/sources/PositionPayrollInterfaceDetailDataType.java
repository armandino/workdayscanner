
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Encapsulating element containg all Payroll Interface Processing data.
 * 
 * <p>Java class for Position_Payroll_Interface_Detail_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Position_Payroll_Interface_Detail_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Effective_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Pay_Rate_Type_Reference" type="{urn:com.workday/bsvc}Pay_Rate_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Frequency_Reference" type="{urn:com.workday/bsvc}FrequencyObjectType" minOccurs="0"/>
 *         &lt;element name="Pay_Group_Reference" type="{urn:com.workday/bsvc}External_Pay_GroupObjectType" minOccurs="0"/>
 *         &lt;element name="Payroll_Entity_Reference" type="{urn:com.workday/bsvc}External_Payroll_EntityObjectType" minOccurs="0"/>
 *         &lt;element name="External_Employee_Type_Reference" type="{urn:com.workday/bsvc}External_Payroll_Employee_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Payroll_File_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Position_Payroll_Interface_Detail_DataType", propOrder = {
    "effectiveDate",
    "payRateTypeReference",
    "frequencyReference",
    "payGroupReference",
    "payrollEntityReference",
    "externalEmployeeTypeReference",
    "payrollFileNumber"
})
public class PositionPayrollInterfaceDetailDataType {

    @XmlElement(name = "Effective_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "Pay_Rate_Type_Reference")
    protected PayRateTypeObjectType payRateTypeReference;
    @XmlElement(name = "Frequency_Reference")
    protected FrequencyObjectType frequencyReference;
    @XmlElement(name = "Pay_Group_Reference")
    protected ExternalPayGroupObjectType payGroupReference;
    @XmlElement(name = "Payroll_Entity_Reference")
    protected ExternalPayrollEntityObjectType payrollEntityReference;
    @XmlElement(name = "External_Employee_Type_Reference")
    protected ExternalPayrollEmployeeTypeObjectType externalEmployeeTypeReference;
    @XmlElement(name = "Payroll_File_Number")
    protected String payrollFileNumber;

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the payRateTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link PayRateTypeObjectType }
     *     
     */
    public PayRateTypeObjectType getPayRateTypeReference() {
        return payRateTypeReference;
    }

    /**
     * Sets the value of the payRateTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayRateTypeObjectType }
     *     
     */
    public void setPayRateTypeReference(PayRateTypeObjectType value) {
        this.payRateTypeReference = value;
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
     * Gets the value of the payGroupReference property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalPayGroupObjectType }
     *     
     */
    public ExternalPayGroupObjectType getPayGroupReference() {
        return payGroupReference;
    }

    /**
     * Sets the value of the payGroupReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalPayGroupObjectType }
     *     
     */
    public void setPayGroupReference(ExternalPayGroupObjectType value) {
        this.payGroupReference = value;
    }

    /**
     * Gets the value of the payrollEntityReference property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalPayrollEntityObjectType }
     *     
     */
    public ExternalPayrollEntityObjectType getPayrollEntityReference() {
        return payrollEntityReference;
    }

    /**
     * Sets the value of the payrollEntityReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalPayrollEntityObjectType }
     *     
     */
    public void setPayrollEntityReference(ExternalPayrollEntityObjectType value) {
        this.payrollEntityReference = value;
    }

    /**
     * Gets the value of the externalEmployeeTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalPayrollEmployeeTypeObjectType }
     *     
     */
    public ExternalPayrollEmployeeTypeObjectType getExternalEmployeeTypeReference() {
        return externalEmployeeTypeReference;
    }

    /**
     * Sets the value of the externalEmployeeTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalPayrollEmployeeTypeObjectType }
     *     
     */
    public void setExternalEmployeeTypeReference(ExternalPayrollEmployeeTypeObjectType value) {
        this.externalEmployeeTypeReference = value;
    }

    /**
     * Gets the value of the payrollFileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayrollFileNumber() {
        return payrollFileNumber;
    }

    /**
     * Sets the value of the payrollFileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayrollFileNumber(String value) {
        this.payrollFileNumber = value;
    }

}
