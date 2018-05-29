
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containg all Employment data (e.g. Status, Position, Compensation, etc.) for an Employee.
 * 
 * <p>Java class for Employee_Employment_Info_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employee_Employment_Info_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Worker_Status_Data" type="{urn:com.workday/bsvc}Worker_Status_DataType" minOccurs="0"/>
 *         &lt;element name="Worker_Position_Data" type="{urn:com.workday/bsvc}Worker_Position_DataType" minOccurs="0"/>
 *         &lt;element name="Compensation_Data" type="{urn:com.workday/bsvc}Compensation_DataType" minOccurs="0"/>
 *         &lt;element name="Worker_Document_Data" type="{urn:com.workday/bsvc}Worker_Document_Data_WWSType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employee_Employment_Info_DataType", propOrder = {
    "workerStatusData",
    "workerPositionData",
    "compensationData",
    "workerDocumentData"
})
public class EmployeeEmploymentInfoDataType {

    @XmlElement(name = "Worker_Status_Data")
    protected WorkerStatusDataType workerStatusData;
    @XmlElement(name = "Worker_Position_Data")
    protected WorkerPositionDataType workerPositionData;
    @XmlElement(name = "Compensation_Data")
    protected CompensationDataType compensationData;
    @XmlElement(name = "Worker_Document_Data")
    protected WorkerDocumentDataWWSType workerDocumentData;

    /**
     * Gets the value of the workerStatusData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerStatusDataType }
     *     
     */
    public WorkerStatusDataType getWorkerStatusData() {
        return workerStatusData;
    }

    /**
     * Sets the value of the workerStatusData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerStatusDataType }
     *     
     */
    public void setWorkerStatusData(WorkerStatusDataType value) {
        this.workerStatusData = value;
    }

    /**
     * Gets the value of the workerPositionData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerPositionDataType }
     *     
     */
    public WorkerPositionDataType getWorkerPositionData() {
        return workerPositionData;
    }

    /**
     * Sets the value of the workerPositionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerPositionDataType }
     *     
     */
    public void setWorkerPositionData(WorkerPositionDataType value) {
        this.workerPositionData = value;
    }

    /**
     * Gets the value of the compensationData property.
     * 
     * @return
     *     possible object is
     *     {@link CompensationDataType }
     *     
     */
    public CompensationDataType getCompensationData() {
        return compensationData;
    }

    /**
     * Sets the value of the compensationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompensationDataType }
     *     
     */
    public void setCompensationData(CompensationDataType value) {
        this.compensationData = value;
    }

    /**
     * Gets the value of the workerDocumentData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerDocumentDataWWSType }
     *     
     */
    public WorkerDocumentDataWWSType getWorkerDocumentData() {
        return workerDocumentData;
    }

    /**
     * Sets the value of the workerDocumentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerDocumentDataWWSType }
     *     
     */
    public void setWorkerDocumentData(WorkerDocumentDataWWSType value) {
        this.workerDocumentData = value;
    }

}
