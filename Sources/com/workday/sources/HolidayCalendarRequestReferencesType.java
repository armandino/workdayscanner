
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper for Holiday Calendar references.
 * 
 * <p>Java class for Holiday_Calendar_Request_ReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Holiday_Calendar_Request_ReferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Holiday_Calendar_Request_Reference" type="{urn:com.workday/bsvc}Holiday_CalendarObjectType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Holiday_Calendar_Request_ReferencesType", propOrder = {
    "holidayCalendarRequestReference"
})
public class HolidayCalendarRequestReferencesType {

    @XmlElement(name = "Holiday_Calendar_Request_Reference", required = true)
    protected List<HolidayCalendarObjectType> holidayCalendarRequestReference;

    /**
     * Gets the value of the holidayCalendarRequestReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the holidayCalendarRequestReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHolidayCalendarRequestReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HolidayCalendarObjectType }
     * 
     * 
     */
    public List<HolidayCalendarObjectType> getHolidayCalendarRequestReference() {
        if (holidayCalendarRequestReference == null) {
            holidayCalendarRequestReference = new ArrayList<HolidayCalendarObjectType>();
        }
        return this.holidayCalendarRequestReference;
    }

}
