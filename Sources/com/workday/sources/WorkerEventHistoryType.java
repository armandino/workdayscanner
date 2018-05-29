
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response element containing an instance of Worker and his/her Worker Event History.
 * 
 * <p>Java class for Worker_Event_HistoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Event_HistoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Worker_Reference" type="{urn:com.workday/bsvc}Worker_ReferenceType" minOccurs="0"/>
 *         &lt;element name="Worker_Event_History_Data" type="{urn:com.workday/bsvc}Worker_Event_History_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{urn:com.workday/bsvc}version"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Event_HistoryType", propOrder = {
    "workerReference",
    "workerEventHistoryData"
})
public class WorkerEventHistoryType {

    @XmlElement(name = "Worker_Reference")
    protected WorkerReferenceType workerReference;
    @XmlElement(name = "Worker_Event_History_Data")
    protected WorkerEventHistoryDataType workerEventHistoryData;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the workerReference property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerReferenceType }
     *     
     */
    public WorkerReferenceType getWorkerReference() {
        return workerReference;
    }

    /**
     * Sets the value of the workerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerReferenceType }
     *     
     */
    public void setWorkerReference(WorkerReferenceType value) {
        this.workerReference = value;
    }

    /**
     * Gets the value of the workerEventHistoryData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerEventHistoryDataType }
     *     
     */
    public WorkerEventHistoryDataType getWorkerEventHistoryData() {
        return workerEventHistoryData;
    }

    /**
     * Sets the value of the workerEventHistoryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerEventHistoryDataType }
     *     
     */
    public void setWorkerEventHistoryData(WorkerEventHistoryDataType value) {
        this.workerEventHistoryData = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
