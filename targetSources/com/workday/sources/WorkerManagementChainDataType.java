
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the worker's management chain for supervisory and matrix organizations.
 * 
 * <p>Java class for Worker_Management_Chain_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Management_Chain_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Worker_Supervisory_Management_Chain_Data" type="{urn:com.workday/bsvc}Worker_Supervisory_Management_Chain_DataType" minOccurs="0"/>
 *         &lt;element name="Worker_Matrix_Management_Chain_Data" type="{urn:com.workday/bsvc}Worker_Matrix_Management_Chain_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Management_Chain_DataType", propOrder = {
    "workerSupervisoryManagementChainData",
    "workerMatrixManagementChainData"
})
public class WorkerManagementChainDataType {

    @XmlElement(name = "Worker_Supervisory_Management_Chain_Data")
    protected WorkerSupervisoryManagementChainDataType workerSupervisoryManagementChainData;
    @XmlElement(name = "Worker_Matrix_Management_Chain_Data")
    protected WorkerMatrixManagementChainDataType workerMatrixManagementChainData;

    /**
     * Gets the value of the workerSupervisoryManagementChainData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerSupervisoryManagementChainDataType }
     *     
     */
    public WorkerSupervisoryManagementChainDataType getWorkerSupervisoryManagementChainData() {
        return workerSupervisoryManagementChainData;
    }

    /**
     * Sets the value of the workerSupervisoryManagementChainData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerSupervisoryManagementChainDataType }
     *     
     */
    public void setWorkerSupervisoryManagementChainData(WorkerSupervisoryManagementChainDataType value) {
        this.workerSupervisoryManagementChainData = value;
    }

    /**
     * Gets the value of the workerMatrixManagementChainData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerMatrixManagementChainDataType }
     *     
     */
    public WorkerMatrixManagementChainDataType getWorkerMatrixManagementChainData() {
        return workerMatrixManagementChainData;
    }

    /**
     * Sets the value of the workerMatrixManagementChainData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerMatrixManagementChainDataType }
     *     
     */
    public void setWorkerMatrixManagementChainData(WorkerMatrixManagementChainDataType value) {
        this.workerMatrixManagementChainData = value;
    }

}
