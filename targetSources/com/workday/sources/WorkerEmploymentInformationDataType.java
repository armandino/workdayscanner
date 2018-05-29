
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the worker's employment information, such as their position and job information.
 * 
 * Security Note: This element is secured to the following domains:  Self-Service: Current Staffing Information, Worker Data: Current Staffing Information
 * 
 * <p>Java class for Worker_Employment_Information_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Employment_Information_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Worker_Job_Data" type="{urn:com.workday/bsvc}Worker_Job_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Worker_Status_Data" type="{urn:com.workday/bsvc}Worker_Status_Detail_DataType" minOccurs="0"/>
 *         &lt;element name="Worker_Contract_Data" type="{urn:com.workday/bsvc}Worker_Contract_Detail_DataType" minOccurs="0"/>
 *         &lt;element name="International_Assignment_Summary_Data" type="{urn:com.workday/bsvc}International_Assignment_Summary_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Employment_Information_DataType", propOrder = {
    "workerJobData",
    "workerStatusData",
    "workerContractData",
    "internationalAssignmentSummaryData"
})
public class WorkerEmploymentInformationDataType {

    @XmlElement(name = "Worker_Job_Data")
    protected List<WorkerJobDataType> workerJobData;
    @XmlElement(name = "Worker_Status_Data")
    protected WorkerStatusDetailDataType workerStatusData;
    @XmlElement(name = "Worker_Contract_Data")
    protected WorkerContractDetailDataType workerContractData;
    @XmlElement(name = "International_Assignment_Summary_Data")
    protected InternationalAssignmentSummaryDataType internationalAssignmentSummaryData;

    /**
     * Gets the value of the workerJobData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workerJobData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkerJobData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkerJobDataType }
     * 
     * 
     */
    public List<WorkerJobDataType> getWorkerJobData() {
        if (workerJobData == null) {
            workerJobData = new ArrayList<WorkerJobDataType>();
        }
        return this.workerJobData;
    }

    /**
     * Gets the value of the workerStatusData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerStatusDetailDataType }
     *     
     */
    public WorkerStatusDetailDataType getWorkerStatusData() {
        return workerStatusData;
    }

    /**
     * Sets the value of the workerStatusData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerStatusDetailDataType }
     *     
     */
    public void setWorkerStatusData(WorkerStatusDetailDataType value) {
        this.workerStatusData = value;
    }

    /**
     * Gets the value of the workerContractData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerContractDetailDataType }
     *     
     */
    public WorkerContractDetailDataType getWorkerContractData() {
        return workerContractData;
    }

    /**
     * Sets the value of the workerContractData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerContractDetailDataType }
     *     
     */
    public void setWorkerContractData(WorkerContractDetailDataType value) {
        this.workerContractData = value;
    }

    /**
     * Gets the value of the internationalAssignmentSummaryData property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalAssignmentSummaryDataType }
     *     
     */
    public InternationalAssignmentSummaryDataType getInternationalAssignmentSummaryData() {
        return internationalAssignmentSummaryData;
    }

    /**
     * Sets the value of the internationalAssignmentSummaryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalAssignmentSummaryDataType }
     *     
     */
    public void setInternationalAssignmentSummaryData(InternationalAssignmentSummaryDataType value) {
        this.internationalAssignmentSummaryData = value;
    }

}
