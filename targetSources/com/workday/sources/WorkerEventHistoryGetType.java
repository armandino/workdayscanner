
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Utilize the following Reference element (and other optional attributes) to retrieve instances of Worker Events and their associated data.
 * 
 * <p>Java class for Worker_Event_History_GetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Event_History_GetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Worker_Reference" type="{urn:com.workday/bsvc}Worker_ReferenceType"/>
 *         &lt;element name="Event_Date_Range_Data" type="{urn:com.workday/bsvc}Effective_And_Updated_DateTime_DataType" minOccurs="0"/>
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
@XmlType(name = "Worker_Event_History_GetType", propOrder = {
    "workerReference",
    "eventDateRangeData"
})
public class WorkerEventHistoryGetType {

    @XmlElement(name = "Worker_Reference", required = true)
    protected WorkerReferenceType workerReference;
    @XmlElement(name = "Event_Date_Range_Data")
    protected EffectiveAndUpdatedDateTimeDataType eventDateRangeData;
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
     * Gets the value of the eventDateRangeData property.
     * 
     * @return
     *     possible object is
     *     {@link EffectiveAndUpdatedDateTimeDataType }
     *     
     */
    public EffectiveAndUpdatedDateTimeDataType getEventDateRangeData() {
        return eventDateRangeData;
    }

    /**
     * Sets the value of the eventDateRangeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectiveAndUpdatedDateTimeDataType }
     *     
     */
    public void setEventDateRangeData(EffectiveAndUpdatedDateTimeDataType value) {
        this.eventDateRangeData = value;
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
