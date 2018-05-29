
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Put Holiday Calendar Response.
 * 
 * <p>Java class for Put_Holiday_Calendar_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Holiday_Calendar_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Holiday_Calendar_Reference" type="{urn:com.workday/bsvc}Holiday_CalendarObjectType" minOccurs="0"/>
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
@XmlType(name = "Put_Holiday_Calendar_ResponseType", propOrder = {
    "holidayCalendarReference"
})
public class PutHolidayCalendarResponseType {

    @XmlElement(name = "Holiday_Calendar_Reference")
    protected HolidayCalendarObjectType holidayCalendarReference;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

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
