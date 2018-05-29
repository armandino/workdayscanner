
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Requested Work Schedule Calendar data.
 * 
 * <p>Java class for Work_Schedule_CalendarType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Work_Schedule_CalendarType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Work_Schedule_Calendar_Reference" type="{urn:com.workday/bsvc}Work_Schedule_CalendarObjectType" minOccurs="0"/>
 *         &lt;element name="Work_Schedule_Calendar_Data" type="{urn:com.workday/bsvc}Work_Schedule_Calendar_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Work_Schedule_CalendarType", propOrder = {
    "workScheduleCalendarReference",
    "workScheduleCalendarData"
})
public class WorkScheduleCalendarType {

    @XmlElement(name = "Work_Schedule_Calendar_Reference")
    protected WorkScheduleCalendarObjectType workScheduleCalendarReference;
    @XmlElement(name = "Work_Schedule_Calendar_Data")
    protected WorkScheduleCalendarDataType workScheduleCalendarData;

    /**
     * Gets the value of the workScheduleCalendarReference property.
     * 
     * @return
     *     possible object is
     *     {@link WorkScheduleCalendarObjectType }
     *     
     */
    public WorkScheduleCalendarObjectType getWorkScheduleCalendarReference() {
        return workScheduleCalendarReference;
    }

    /**
     * Sets the value of the workScheduleCalendarReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkScheduleCalendarObjectType }
     *     
     */
    public void setWorkScheduleCalendarReference(WorkScheduleCalendarObjectType value) {
        this.workScheduleCalendarReference = value;
    }

    /**
     * Gets the value of the workScheduleCalendarData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkScheduleCalendarDataType }
     *     
     */
    public WorkScheduleCalendarDataType getWorkScheduleCalendarData() {
        return workScheduleCalendarData;
    }

    /**
     * Sets the value of the workScheduleCalendarData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkScheduleCalendarDataType }
     *     
     */
    public void setWorkScheduleCalendarData(WorkScheduleCalendarDataType value) {
        this.workScheduleCalendarData = value;
    }

}
