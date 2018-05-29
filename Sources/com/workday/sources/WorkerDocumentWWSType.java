
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for documents associated with a worker.
 * 
 * <p>Java class for Worker_Document_WWSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Document_WWSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Worker_Document_Reference" type="{urn:com.workday/bsvc}Worker_DocumentObjectType"/>
 *         &lt;element name="Worker_Document_Detail_Data" type="{urn:com.workday/bsvc}Worker_Document_Details_DataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Document_WWSType", propOrder = {
    "workerDocumentReference",
    "workerDocumentDetailData"
})
public class WorkerDocumentWWSType {

    @XmlElement(name = "Worker_Document_Reference", required = true)
    protected WorkerDocumentObjectType workerDocumentReference;
    @XmlElement(name = "Worker_Document_Detail_Data", required = true)
    protected WorkerDocumentDetailsDataType workerDocumentDetailData;

    /**
     * Gets the value of the workerDocumentReference property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerDocumentObjectType }
     *     
     */
    public WorkerDocumentObjectType getWorkerDocumentReference() {
        return workerDocumentReference;
    }

    /**
     * Sets the value of the workerDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerDocumentObjectType }
     *     
     */
    public void setWorkerDocumentReference(WorkerDocumentObjectType value) {
        this.workerDocumentReference = value;
    }

    /**
     * Gets the value of the workerDocumentDetailData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerDocumentDetailsDataType }
     *     
     */
    public WorkerDocumentDetailsDataType getWorkerDocumentDetailData() {
        return workerDocumentDetailData;
    }

    /**
     * Sets the value of the workerDocumentDetailData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerDocumentDetailsDataType }
     *     
     */
    public void setWorkerDocumentDetailData(WorkerDocumentDetailsDataType value) {
        this.workerDocumentDetailData = value;
    }

}
