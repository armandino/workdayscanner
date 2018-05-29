
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Container for a Worker and the Previous System Job History data.
 * 
 * <p>Java class for Previous_System_Job_History_Get_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Previous_System_Job_History_Get_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Worker_Reference" type="{urn:com.workday/bsvc}WorkerObjectType" minOccurs="0"/>
 *         &lt;element name="Previous_System_Job_History_Data" type="{urn:com.workday/bsvc}Previous_System_Job_HistoryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Previous_System_Job_History_Get_DataType", propOrder = {
    "workerReference",
    "previousSystemJobHistoryData"
})
public class PreviousSystemJobHistoryGetDataType {

    @XmlElement(name = "Worker_Reference")
    protected WorkerObjectType workerReference;
    @XmlElement(name = "Previous_System_Job_History_Data")
    protected List<PreviousSystemJobHistoryType> previousSystemJobHistoryData;

    /**
     * Gets the value of the workerReference property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerObjectType }
     *     
     */
    public WorkerObjectType getWorkerReference() {
        return workerReference;
    }

    /**
     * Sets the value of the workerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerObjectType }
     *     
     */
    public void setWorkerReference(WorkerObjectType value) {
        this.workerReference = value;
    }

    /**
     * Gets the value of the previousSystemJobHistoryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the previousSystemJobHistoryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreviousSystemJobHistoryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreviousSystemJobHistoryType }
     * 
     * 
     */
    public List<PreviousSystemJobHistoryType> getPreviousSystemJobHistoryData() {
        if (previousSystemJobHistoryData == null) {
            previousSystemJobHistoryData = new ArrayList<PreviousSystemJobHistoryType>();
        }
        return this.previousSystemJobHistoryData;
    }

}
