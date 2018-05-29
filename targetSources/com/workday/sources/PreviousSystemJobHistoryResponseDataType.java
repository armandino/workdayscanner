
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains each Worker and their job history from a previous system.
 * 
 * <p>Java class for Previous_System_Job_History_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Previous_System_Job_History_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Previous_System_Job_History" type="{urn:com.workday/bsvc}Previous_System_Job_History_Get_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Previous_System_Job_History_Response_DataType", propOrder = {
    "previousSystemJobHistory"
})
public class PreviousSystemJobHistoryResponseDataType {

    @XmlElement(name = "Previous_System_Job_History")
    protected List<PreviousSystemJobHistoryGetDataType> previousSystemJobHistory;

    /**
     * Gets the value of the previousSystemJobHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the previousSystemJobHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreviousSystemJobHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreviousSystemJobHistoryGetDataType }
     * 
     * 
     */
    public List<PreviousSystemJobHistoryGetDataType> getPreviousSystemJobHistory() {
        if (previousSystemJobHistory == null) {
            previousSystemJobHistory = new ArrayList<PreviousSystemJobHistoryGetDataType>();
        }
        return this.previousSystemJobHistory;
    }

}
