
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Put Work Schedule Calendar response.
 * 
 * <p>Java class for Put_Work_Schedule_Calendar_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Work_Schedule_Calendar_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Work_Schedule_Calendar_Reference" type="{urn:com.workday/bsvc}Work_Schedule_CalendarObjectType" minOccurs="0"/>
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
@XmlType(name = "Put_Work_Schedule_Calendar_ResponseType", propOrder = {
    "workScheduleCalendarReference"
})
public class PutWorkScheduleCalendarResponseType {

    @XmlElement(name = "Work_Schedule_Calendar_Reference")
    protected WorkScheduleCalendarObjectType workScheduleCalendarReference;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

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
