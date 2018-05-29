
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for the Change Business Title business process web service.
 * 
 * <p>Java class for Change_Business_Title_Business_Process_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Change_Business_Title_Business_Process_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Worker_Reference" type="{urn:com.workday/bsvc}WorkerObjectType"/>
 *         &lt;element name="Job_Reference" type="{urn:com.workday/bsvc}Position_ElementObjectType" minOccurs="0"/>
 *         &lt;element name="Change_Business_Title_Data" type="{urn:com.workday/bsvc}Change_Business_Title_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Change_Business_Title_Business_Process_DataType", propOrder = {
    "workerReference",
    "jobReference",
    "changeBusinessTitleData"
})
public class ChangeBusinessTitleBusinessProcessDataType {

    @XmlElement(name = "Worker_Reference", required = true)
    protected WorkerObjectType workerReference;
    @XmlElement(name = "Job_Reference")
    protected PositionElementObjectType jobReference;
    @XmlElement(name = "Change_Business_Title_Data")
    protected ChangeBusinessTitleDataType changeBusinessTitleData;

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
     * Gets the value of the jobReference property.
     * 
     * @return
     *     possible object is
     *     {@link PositionElementObjectType }
     *     
     */
    public PositionElementObjectType getJobReference() {
        return jobReference;
    }

    /**
     * Sets the value of the jobReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionElementObjectType }
     *     
     */
    public void setJobReference(PositionElementObjectType value) {
        this.jobReference = value;
    }

    /**
     * Gets the value of the changeBusinessTitleData property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeBusinessTitleDataType }
     *     
     */
    public ChangeBusinessTitleDataType getChangeBusinessTitleData() {
        return changeBusinessTitleData;
    }

    /**
     * Sets the value of the changeBusinessTitleData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeBusinessTitleDataType }
     *     
     */
    public void setChangeBusinessTitleData(ChangeBusinessTitleDataType value) {
        this.changeBusinessTitleData = value;
    }

}
