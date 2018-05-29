
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing Worker Event History data.
 * 
 * <p>Java class for Worker_Event_History_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Event_History_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Event_Date_Range_Data" type="{urn:com.workday/bsvc}Effective_And_Updated_DateTime_DataType" minOccurs="0"/>
 *         &lt;element name="Event_Data" type="{urn:com.workday/bsvc}Event_History_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Event_History_DataType", propOrder = {
    "eventDateRangeData",
    "eventData"
})
public class WorkerEventHistoryDataType {

    @XmlElement(name = "Event_Date_Range_Data")
    protected EffectiveAndUpdatedDateTimeDataType eventDateRangeData;
    @XmlElement(name = "Event_Data")
    protected List<EventHistoryDataType> eventData;

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
     * Gets the value of the eventData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventHistoryDataType }
     * 
     * 
     */
    public List<EventHistoryDataType> getEventData() {
        if (eventData == null) {
            eventData = new ArrayList<EventHistoryDataType>();
        }
        return this.eventData;
    }

}
