
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Event Data for the Holiday Calendar.
 * 
 * <p>Java class for Holiday_Calendar_Event_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Holiday_Calendar_Event_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Start_End_Data" type="{urn:com.workday/bsvc}Start_End_DataType"/>
 *         &lt;element name="Recurrence_Data" type="{urn:com.workday/bsvc}Recurrence_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Holiday_Calendar_Event_DataType", propOrder = {
    "name",
    "startEndData",
    "recurrenceData"
})
public class HolidayCalendarEventDataType {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Start_End_Data", required = true)
    protected StartEndDataType startEndData;
    @XmlElement(name = "Recurrence_Data")
    protected RecurrenceDataType recurrenceData;
    @XmlAttribute(name = "ID", namespace = "urn:com.workday/bsvc")
    protected String id;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the startEndData property.
     * 
     * @return
     *     possible object is
     *     {@link StartEndDataType }
     *     
     */
    public StartEndDataType getStartEndData() {
        return startEndData;
    }

    /**
     * Sets the value of the startEndData property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartEndDataType }
     *     
     */
    public void setStartEndData(StartEndDataType value) {
        this.startEndData = value;
    }

    /**
     * Gets the value of the recurrenceData property.
     * 
     * @return
     *     possible object is
     *     {@link RecurrenceDataType }
     *     
     */
    public RecurrenceDataType getRecurrenceData() {
        return recurrenceData;
    }

    /**
     * Sets the value of the recurrenceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurrenceDataType }
     *     
     */
    public void setRecurrenceData(RecurrenceDataType value) {
        this.recurrenceData = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

}
