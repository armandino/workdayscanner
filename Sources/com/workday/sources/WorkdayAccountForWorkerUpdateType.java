
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Utilize the following elements to update an existing Workday Account into the Workday system.
 * 
 * <p>Java class for Workday_Account_for_Worker_UpdateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Workday_Account_for_Worker_UpdateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Worker_Reference" type="{urn:com.workday/bsvc}Worker_ReferenceType" minOccurs="0"/>
 *         &lt;element name="Non_Worker_Reference" type="{urn:com.workday/bsvc}RoleObjectType" minOccurs="0"/>
 *         &lt;element name="Workday_Account_for_Worker_Data" type="{urn:com.workday/bsvc}Workday_Account_for_Worker_DataType"/>
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
@XmlType(name = "Workday_Account_for_Worker_UpdateType", propOrder = {
    "workerReference",
    "nonWorkerReference",
    "workdayAccountForWorkerData"
})
public class WorkdayAccountForWorkerUpdateType {

    @XmlElement(name = "Worker_Reference")
    protected WorkerReferenceType workerReference;
    @XmlElement(name = "Non_Worker_Reference")
    protected RoleObjectType nonWorkerReference;
    @XmlElement(name = "Workday_Account_for_Worker_Data", required = true)
    protected WorkdayAccountForWorkerDataType workdayAccountForWorkerData;
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
     * Gets the value of the nonWorkerReference property.
     * 
     * @return
     *     possible object is
     *     {@link RoleObjectType }
     *     
     */
    public RoleObjectType getNonWorkerReference() {
        return nonWorkerReference;
    }

    /**
     * Sets the value of the nonWorkerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleObjectType }
     *     
     */
    public void setNonWorkerReference(RoleObjectType value) {
        this.nonWorkerReference = value;
    }

    /**
     * Gets the value of the workdayAccountForWorkerData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkdayAccountForWorkerDataType }
     *     
     */
    public WorkdayAccountForWorkerDataType getWorkdayAccountForWorkerData() {
        return workdayAccountForWorkerData;
    }

    /**
     * Sets the value of the workdayAccountForWorkerData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkdayAccountForWorkerDataType }
     *     
     */
    public void setWorkdayAccountForWorkerData(WorkdayAccountForWorkerDataType value) {
        this.workdayAccountForWorkerData = value;
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
