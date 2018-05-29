
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing the transaction log entry.
 * 
 * <p>Java class for Transaction_Log_EntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Transaction_Log_EntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Transaction_Log_Reference" type="{urn:com.workday/bsvc}Transaction_LogObjectType" minOccurs="0"/>
 *         &lt;element name="Transaction_Log_Data" type="{urn:com.workday/bsvc}Transaction_Log_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction_Log_EntryType", propOrder = {
    "transactionLogReference",
    "transactionLogData"
})
public class TransactionLogEntryType {

    @XmlElement(name = "Transaction_Log_Reference")
    protected TransactionLogObjectType transactionLogReference;
    @XmlElement(name = "Transaction_Log_Data")
    protected TransactionLogDataType transactionLogData;

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
     * Gets the value of the transactionLogData property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionLogDataType }
     *     
     */
    public TransactionLogDataType getTransactionLogData() {
        return transactionLogData;
    }

    /**
     * Sets the value of the transactionLogData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionLogDataType }
     *     
     */
    public void setTransactionLogData(TransactionLogDataType value) {
        this.transactionLogData = value;
    }

}
