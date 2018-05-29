
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing transaction log entries that have been rescinded or corrected.
 * 
 * <p>Java class for Event_Target_Transaction_Log_Rescind_And_Correct_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Event_Target_Transaction_Log_Rescind_And_Correct_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Corrected_Or_Rescinded_Transaction_Log_Data" type="{urn:com.workday/bsvc}Corrected_Or_Rescinded_Transaction_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Event_Target_Transaction_Log_Rescind_And_Correct_DataType", propOrder = {
    "correctedOrRescindedTransactionLogData"
})
public class EventTargetTransactionLogRescindAndCorrectDataType {

    @XmlElement(name = "Corrected_Or_Rescinded_Transaction_Log_Data")
    protected List<CorrectedOrRescindedTransactionDataType> correctedOrRescindedTransactionLogData;

    /**
     * Gets the value of the correctedOrRescindedTransactionLogData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correctedOrRescindedTransactionLogData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrectedOrRescindedTransactionLogData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorrectedOrRescindedTransactionDataType }
     * 
     * 
     */
    public List<CorrectedOrRescindedTransactionDataType> getCorrectedOrRescindedTransactionLogData() {
        if (correctedOrRescindedTransactionLogData == null) {
            correctedOrRescindedTransactionLogData = new ArrayList<CorrectedOrRescindedTransactionDataType>();
        }
        return this.correctedOrRescindedTransactionLogData;
    }

}
