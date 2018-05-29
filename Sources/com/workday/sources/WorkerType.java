
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing all Worker Profile data.
 * 
 * <p>Java class for WorkerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Worker_Reference" type="{urn:com.workday/bsvc}WorkerObjectType" minOccurs="0"/>
 *         &lt;element name="Worker_Descriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Universal_Identifier_Reference" type="{urn:com.workday/bsvc}Universal_IdentifierObjectType" minOccurs="0"/>
 *         &lt;element name="Worker_Data" type="{urn:com.workday/bsvc}Worker_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkerType", propOrder = {
    "workerReference",
    "workerDescriptor",
    "universalIdentifierReference",
    "workerData"
})
public class WorkerType {

    @XmlElement(name = "Worker_Reference")
    protected WorkerObjectType workerReference;
    @XmlElement(name = "Worker_Descriptor")
    protected String workerDescriptor;
    @XmlElement(name = "Universal_Identifier_Reference")
    protected UniversalIdentifierObjectType universalIdentifierReference;
    @XmlElement(name = "Worker_Data")
    protected WorkerDataType workerData;

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
     * Gets the value of the workerDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkerDescriptor() {
        return workerDescriptor;
    }

    /**
     * Sets the value of the workerDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkerDescriptor(String value) {
        this.workerDescriptor = value;
    }

    /**
     * Gets the value of the universalIdentifierReference property.
     * 
     * @return
     *     possible object is
     *     {@link UniversalIdentifierObjectType }
     *     
     */
    public UniversalIdentifierObjectType getUniversalIdentifierReference() {
        return universalIdentifierReference;
    }

    /**
     * Sets the value of the universalIdentifierReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniversalIdentifierObjectType }
     *     
     */
    public void setUniversalIdentifierReference(UniversalIdentifierObjectType value) {
        this.universalIdentifierReference = value;
    }

    /**
     * Gets the value of the workerData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerDataType }
     *     
     */
    public WorkerDataType getWorkerData() {
        return workerData;
    }

    /**
     * Sets the value of the workerData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerDataType }
     *     
     */
    public void setWorkerData(WorkerDataType value) {
        this.workerData = value;
    }

}
