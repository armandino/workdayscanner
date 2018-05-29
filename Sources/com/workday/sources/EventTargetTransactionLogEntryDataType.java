
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing all transaction log entries.
 * 
 * <p>Java class for Event_Target_Transaction_Log_Entry_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Event_Target_Transaction_Log_Entry_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Transaction_Log_Entry" type="{urn:com.workday/bsvc}Transaction_Log_EntryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Event_Target_Transaction_Log_Entry_DataType", propOrder = {
    "transactionLogEntry"
})
public class EventTargetTransactionLogEntryDataType {

    @XmlElement(name = "Transaction_Log_Entry")
    protected List<TransactionLogEntryType> transactionLogEntry;

    /**
     * Gets the value of the transactionLogEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionLogEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionLogEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionLogEntryType }
     * 
     * 
     */
    public List<TransactionLogEntryType> getTransactionLogEntry() {
        if (transactionLogEntry == null) {
            transactionLogEntry = new ArrayList<TransactionLogEntryType>();
        }
        return this.transactionLogEntry;
    }

}
