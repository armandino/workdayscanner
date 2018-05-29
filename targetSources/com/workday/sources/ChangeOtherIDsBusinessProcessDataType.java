
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for the Other Identifier Data.
 * 
 * <p>Java class for Change_Other_IDs_Business_Process_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Change_Other_IDs_Business_Process_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Worker_Reference" type="{urn:com.workday/bsvc}WorkerObjectType"/>
 *         &lt;element name="Custom_Identification_Data" type="{urn:com.workday/bsvc}Custom_Identification_DataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Change_Other_IDs_Business_Process_DataType", propOrder = {
    "workerReference",
    "customIdentificationData"
})
public class ChangeOtherIDsBusinessProcessDataType {

    @XmlElement(name = "Worker_Reference", required = true)
    protected WorkerObjectType workerReference;
    @XmlElement(name = "Custom_Identification_Data", required = true)
    protected CustomIdentificationDataType customIdentificationData;

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
     * Gets the value of the customIdentificationData property.
     * 
     * @return
     *     possible object is
     *     {@link CustomIdentificationDataType }
     *     
     */
    public CustomIdentificationDataType getCustomIdentificationData() {
        return customIdentificationData;
    }

    /**
     * Sets the value of the customIdentificationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomIdentificationDataType }
     *     
     */
    public void setCustomIdentificationData(CustomIdentificationDataType value) {
        this.customIdentificationData = value;
    }

}
