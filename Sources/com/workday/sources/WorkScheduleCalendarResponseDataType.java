
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Retrieved Work Schedule Calendar.
 * 
 * <p>Java class for Work_Schedule_Calendar_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Work_Schedule_Calendar_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Work_Schedule_Calendar" type="{urn:com.workday/bsvc}Work_Schedule_CalendarType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Work_Schedule_Calendar_Response_DataType", propOrder = {
    "workScheduleCalendar"
})
public class WorkScheduleCalendarResponseDataType {

    @XmlElement(name = "Work_Schedule_Calendar")
    protected List<WorkScheduleCalendarType> workScheduleCalendar;

    /**
     * Gets the value of the workScheduleCalendar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workScheduleCalendar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkScheduleCalendar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkScheduleCalendarType }
     * 
     * 
     */
    public List<WorkScheduleCalendarType> getWorkScheduleCalendar() {
        if (workScheduleCalendar == null) {
            workScheduleCalendar = new ArrayList<WorkScheduleCalendarType>();
        }
        return this.workScheduleCalendar;
    }

}
