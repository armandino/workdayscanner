
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request References Element for Get Period Reporting Calendars Web Service
 * 
 * <p>Java class for Period_Reporting_Calendar_Request_ReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Period_Reporting_Calendar_Request_ReferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Period_Reporting_Calendar_Reference" type="{urn:com.workday/bsvc}Period_Reporting_CalendarObjectType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Period_Reporting_Calendar_Request_ReferencesType", propOrder = {
    "periodReportingCalendarReference"
})
public class PeriodReportingCalendarRequestReferencesType {

    @XmlElement(name = "Period_Reporting_Calendar_Reference", required = true)
    protected List<PeriodReportingCalendarObjectType> periodReportingCalendarReference;

    /**
     * Gets the value of the periodReportingCalendarReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the periodReportingCalendarReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriodReportingCalendarReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodReportingCalendarObjectType }
     * 
     * 
     */
    public List<PeriodReportingCalendarObjectType> getPeriodReportingCalendarReference() {
        if (periodReportingCalendarReference == null) {
            periodReportingCalendarReference = new ArrayList<PeriodReportingCalendarObjectType>();
        }
        return this.periodReportingCalendarReference;
    }

}
