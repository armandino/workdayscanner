
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Details on the rescind or correct of the event described in the main transaction data section.
 * 
 * <p>Java class for Transaction_Log_Rescind_And_Correct_Event_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Transaction_Log_Rescind_And_Correct_Event_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Transaction_Log_Reference" type="{urn:com.workday/bsvc}Transaction_LogObjectType" minOccurs="0"/>
 *         &lt;element name="Transaction_Log_Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Is_Correction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Is_Rescind" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Prior_Effective_Moment" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Transaction_Entry_Moment" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction_Log_Rescind_And_Correct_Event_DataType", propOrder = {
    "transactionLogReference",
    "transactionLogDescription",
    "isCorrection",
    "isRescind",
    "priorEffectiveMoment",
    "transactionEntryMoment"
})
public class TransactionLogRescindAndCorrectEventDataType {

    @XmlElement(name = "Transaction_Log_Reference")
    protected TransactionLogObjectType transactionLogReference;
    @XmlElement(name = "Transaction_Log_Description")
    protected String transactionLogDescription;
    @XmlElement(name = "Is_Correction")
    protected Boolean isCorrection;
    @XmlElement(name = "Is_Rescind")
    protected Boolean isRescind;
    @XmlElement(name = "Prior_Effective_Moment")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar priorEffectiveMoment;
    @XmlElement(name = "Transaction_Entry_Moment")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionEntryMoment;

    /**
     * Gets the value of the transactionLogReference property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionLogObjectType }
     *     
     */
    public TransactionLogObjectType getTransactionLogReference() {
        return transactionLogReference;
    }

    /**
     * Sets the value of the transactionLogReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionLogObjectType }
     *     
     */
    public void setTransactionLogReference(TransactionLogObjectType value) {
        this.transactionLogReference = value;
    }

    /**
     * Gets the value of the transactionLogDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionLogDescription() {
        return transactionLogDescription;
    }

    /**
     * Sets the value of the transactionLogDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionLogDescription(String value) {
        this.transactionLogDescription = value;
    }

    /**
     * Gets the value of the isCorrection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCorrection() {
        return isCorrection;
    }

    /**
     * Sets the value of the isCorrection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCorrection(Boolean value) {
        this.isCorrection = value;
    }

    /**
     * Gets the value of the isRescind property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRescind() {
        return isRescind;
    }

    /**
     * Sets the value of the isRescind property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRescind(Boolean value) {
        this.isRescind = value;
    }

    /**
     * Gets the value of the priorEffectiveMoment property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPriorEffectiveMoment() {
        return priorEffectiveMoment;
    }

    /**
     * Sets the value of the priorEffectiveMoment property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPriorEffectiveMoment(XMLGregorianCalendar value) {
        this.priorEffectiveMoment = value;
    }

    /**
     * Gets the value of the transactionEntryMoment property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionEntryMoment() {
        return transactionEntryMoment;
    }

    /**
     * Sets the value of the transactionEntryMoment property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionEntryMoment(XMLGregorianCalendar value) {
        this.transactionEntryMoment = value;
    }

}
