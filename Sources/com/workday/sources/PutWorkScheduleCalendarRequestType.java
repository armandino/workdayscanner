
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Put Work Schedule Calendar and Events.
 * 
 * <p>Java class for Put_Work_Schedule_Calendar_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Work_Schedule_Calendar_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Work_Schedule_Calendar_Reference" type="{urn:com.workday/bsvc}Work_Schedule_CalendarObjectType" minOccurs="0"/>
 *         &lt;element name="Work_Schedule_Calendar_Data" type="{urn:com.workday/bsvc}Work_Schedule_Calendar_DataType"/>
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
@XmlType(name = "Put_Work_Schedule_Calendar_RequestType", propOrder = {
    "workScheduleCalendarReference",
    "workScheduleCalendarData"
})
public class PutWorkScheduleCalendarRequestType {

    @XmlElement(name = "Work_Schedule_Calendar_Reference")
    protected WorkScheduleCalendarObjectType workScheduleCalendarReference;
    @XmlElement(name = "Work_Schedule_Calendar_Data", required = true)
    protected WorkScheduleCalendarDataType workScheduleCalendarData;
    @XmlAttribute(name = "Add_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean addOnly;
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
