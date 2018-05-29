
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Put Holiday Calendar
 * 
 * <p>Java class for Put_Holiday_Calendar_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Holiday_Calendar_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Holiday_Calendar_Reference" type="{urn:com.workday/bsvc}Holiday_CalendarObjectType" minOccurs="0"/>
 *         &lt;element name="Holiday_Calendar_Data" type="{urn:com.workday/bsvc}Holiday_Calendar_DataType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Add_Only" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute ref="{urn:com.workday/bsvc}version"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Put_Holiday_Calendar_RequestType", propOrder = {
    "holidayCalendarReference",
    "holidayCalendarData"
})
public class PutHolidayCalendarRequestType {

    @XmlElement(name = "Holiday_Calendar_Reference")
    protected HolidayCalendarObjectType holidayCalendarReference;
    @XmlElement(name = "Holiday_Calendar_Data", required = true)
    protected HolidayCalendarDataType holidayCalendarData;
    @XmlAttribute(name = "Add_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean addOnly;
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

    /**
     * Gets the value of the addOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddOnly() {
        return addOnly;
    }

    /**
     * Sets the value of the addOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddOnly(Boolean value) {
        this.addOnly = value;
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
