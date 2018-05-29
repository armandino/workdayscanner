
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for the Change Personal Information business process web service.
 * 
 * <p>Java class for Change_Personal_Information_Business_Process_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Change_Personal_Information_Business_Process_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Worker_Reference" type="{urn:com.workday/bsvc}WorkerObjectType"/>
 *         &lt;element name="Personal_Information_Data" type="{urn:com.workday/bsvc}Change_Personal_Information_DataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Change_Personal_Information_Business_Process_DataType", propOrder = {
    "workerReference",
    "personalInformationData"
})
public class ChangePersonalInformationBusinessProcessDataType {

    @XmlElement(name = "Worker_Reference", required = true)
    protected WorkerObjectType workerReference;
    @XmlElement(name = "Personal_Information_Data", required = true)
    protected ChangePersonalInformationDataType personalInformationData;

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
     * Gets the value of the personalInformationData property.
     * 
     * @return
     *     possible object is
     *     {@link ChangePersonalInformationDataType }
     *     
     */
    public ChangePersonalInformationDataType getPersonalInformationData() {
        return personalInformationData;
    }

    /**
     * Sets the value of the personalInformationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangePersonalInformationDataType }
     *     
     */
    public void setPersonalInformationData(ChangePersonalInformationDataType value) {
        this.personalInformationData = value;
    }

}
