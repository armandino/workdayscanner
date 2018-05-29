
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Transaction Data for an event that has been rescinded or corrected.
 * 
 * <p>Java class for Corrected_Or_Rescinded_Transaction_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Corrected_Or_Rescinded_Transaction_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Main_Transaction_Data" type="{urn:com.workday/bsvc}Main_Transaction_Log_Entry_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Correction_Or_Rescind_Data" type="{urn:com.workday/bsvc}Transaction_Log_Rescind_And_Correct_Event_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Corrected_Or_Rescinded_Transaction_DataType", propOrder = {
    "mainTransactionData",
    "correctionOrRescindData"
})
public class CorrectedOrRescindedTransactionDataType {

    @XmlElement(name = "Main_Transaction_Data")
    protected List<MainTransactionLogEntryDataType> mainTransactionData;
    @XmlElement(name = "Correction_Or_Rescind_Data")
    protected List<TransactionLogRescindAndCorrectEventDataType> correctionOrRescindData;

    /**
     * Gets the value of the mainTransactionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mainTransactionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMainTransactionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MainTransactionLogEntryDataType }
     * 
     * 
     */
    public List<MainTransactionLogEntryDataType> getMainTransactionData() {
        if (mainTransactionData == null) {
            mainTransactionData = new ArrayList<MainTransactionLogEntryDataType>();
        }
        return this.mainTransactionData;
    }

    /**
     * Gets the value of the correctionOrRescindData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correctionOrRescindData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrectionOrRescindData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionLogRescindAndCorrectEventDataType }
     * 
     * 
     */
    public List<TransactionLogRescindAndCorrectEventDataType> getCorrectionOrRescindData() {
        if (correctionOrRescindData == null) {
            correctionOrRescindData = new ArrayList<TransactionLogRescindAndCorrectEventDataType>();
        }
        return this.correctionOrRescindData;
    }

}
