
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response element for Get Period Reporting Calendars Web Service
 * 
 * <p>Java class for Period_Reporting_Calendar_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Period_Reporting_Calendar_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Period_Reporting_Calendar" type="{urn:com.workday/bsvc}Period_Reporting_CalendarType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Period_Reporting_Calendar_Response_DataType", propOrder = {
    "periodReportingCalendar"
})
public class PeriodReportingCalendarResponseDataType {

    @XmlElement(name = "Period_Reporting_Calendar")
    protected List<PeriodReportingCalendarType> periodReportingCalendar;

    /**
     * Gets the value of the periodReportingCalendar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the periodReportingCalendar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriodReportingCalendar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodReportingCalendarType }
     * 
     * 
     */
    public List<PeriodReportingCalendarType> getPeriodReportingCalendar() {
        if (periodReportingCalendar == null) {
            periodReportingCalendar = new ArrayList<PeriodReportingCalendarType>();
        }
        return this.periodReportingCalendar;
    }

}
