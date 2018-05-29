
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper for Holiday Calendar reference and data.
 * 
 * <p>Java class for Holiday_CalendarType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Holiday_CalendarType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Holiday_Calendar_Reference" type="{urn:com.workday/bsvc}Holiday_CalendarObjectType" minOccurs="0"/>
 *         &lt;element name="Holiday_Calendar_Data" type="{urn:com.workday/bsvc}Holiday_Calendar_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Holiday_CalendarType", propOrder = {
    "holidayCalendarReference",
    "holidayCalendarData"
})
public class HolidayCalendarType {

    @XmlElement(name = "Holiday_Calendar_Reference")
    protected HolidayCalendarObjectType holidayCalendarReference;
    @XmlElement(name = "Holiday_Calendar_Data")
    protected HolidayCalendarDataType holidayCalendarData;

    /**
     * Gets the value of the holidayCalendarReference property.
     * 
     * @return
     *     possible object is
     *     {@link HolidayCalendarObjectType }
     *     
     */
    public HolidayCalendarObjectType getHolidayCalendarReference() {
        return holidayCalendarReference;
    }

    /**
     * Sets the value of the holidayCalendarReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link HolidayCalendarObjectType }
     *     
     */
    public void setHolidayCalendarReference(HolidayCalendarObjectType value) {
        this.holidayCalendarReference = value;
    }

    /**
     * Gets the value of the holidayCalendarData property.
     * 
     * @return
     *     possible object is
     *     {@link HolidayCalendarDataType }
     *     
     */
    public HolidayCalendarDataType getHolidayCalendarData() {
        return holidayCalendarData;
    }

    /**
     * Sets the value of the holidayCalendarData property.
     * 
     * @param value
     *     allowed object is
     *     {@link HolidayCalendarDataType }
     *     
     */
    public void setHolidayCalendarData(HolidayCalendarDataType value) {
        this.holidayCalendarData = value;
    }

}
