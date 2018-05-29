
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Encapsulating element containg all Payroll Interface Processing data.
 * 
 * <p>Java class for Payroll_Interface_Processing_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Payroll_Interface_Processing_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pay_Rate_Type_Reference" type="{urn:com.workday/bsvc}Pay_Rate_Type_ReferenceType" minOccurs="0"/>
 *         &lt;element name="Frequency_Reference" type="{urn:com.workday/bsvc}Frequency_Reference_DataType" minOccurs="0"/>
 *         &lt;element name="Pay_Group_Reference" type="{urn:com.workday/bsvc}External_Pay_Group_ReferenceType" minOccurs="0"/>
 *         &lt;element name="Payroll_Entity_Reference" type="{urn:com.workday/bsvc}External_Payroll_Entity_ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Effective_Date" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Payroll_Interface_Processing_DataType", propOrder = {
    "payRateTypeReference",
    "frequencyReference",
    "payGroupReference",
    "payrollEntityReference"
})
public class PayrollInterfaceProcessingDataType {

    @XmlElement(name = "Pay_Rate_Type_Reference")
    protected PayRateTypeReferenceType payRateTypeReference;
    @XmlElement(name = "Frequency_Reference")
    protected FrequencyReferenceDataType frequencyReference;
    @XmlElement(name = "Pay_Group_Reference")
    protected ExternalPayGroupReferenceType payGroupReference;
    @XmlElement(name = "Payroll_Entity_Reference")
    protected List<ExternalPayrollEntityReferenceType> payrollEntityReference;
    @XmlAttribute(name = "Effective_Date", namespace = "urn:com.workday/bsvc")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;

    /**
     * Gets the value of the payRateTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link PayRateTypeReferenceType }
     *     
     */
    public PayRateTypeReferenceType getPayRateTypeReference() {
        return payRateTypeReference;
    }

    /**
     * Sets the value of the payRateTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayRateTypeReferenceType }
     *     
     */
    public void setPayRateTypeReference(PayRateTypeReferenceType value) {
        this.payRateTypeReference = value;
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
     * Gets the value of the payGroupReference property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalPayGroupReferenceType }
     *     
     */
    public ExternalPayGroupReferenceType getPayGroupReference() {
        return payGroupReference;
    }

    /**
     * Sets the value of the payGroupReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalPayGroupReferenceType }
     *     
     */
    public void setPayGroupReference(ExternalPayGroupReferenceType value) {
        this.payGroupReference = value;
    }

    /**
     * Gets the value of the payrollEntityReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payrollEntityReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayrollEntityReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalPayrollEntityReferenceType }
     * 
     * 
     */
    public List<ExternalPayrollEntityReferenceType> getPayrollEntityReference() {
        if (payrollEntityReference == null) {
            payrollEntityReference = new ArrayList<ExternalPayrollEntityReferenceType>();
        }
        return this.payrollEntityReference;
    }

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

}
