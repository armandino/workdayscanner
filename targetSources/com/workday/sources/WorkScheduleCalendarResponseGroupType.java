
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Options for responded Work Schedule Calendar.
 * 
 * <p>Java class for Work_Schedule_Calendar_Response_GroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Work_Schedule_Calendar_Response_GroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Include_Reference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Work_Schedule_Calendar_Data" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Work_Schedule_Calendar_Response_GroupType", propOrder = {
    "includeReference",
    "includeWorkScheduleCalendarData"
})
public class WorkScheduleCalendarResponseGroupType {

    @XmlElement(name = "Include_Reference")
    protected Boolean includeReference;
    @XmlElement(name = "Include_Work_Schedule_Calendar_Data")
    protected Boolean includeWorkScheduleCalendarData;

    /**
     * Gets the value of the includeReference property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeReference() {
        return includeReference;
    }

    /**
     * Sets the value of the includeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeReference(Boolean value) {
        this.includeReference = value;
    }

    /**
     * Gets the value of the includeWorkScheduleCalendarData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeWorkScheduleCalendarData() {
        return includeWorkScheduleCalendarData;
    }

    /**
     * Sets the value of the includeWorkScheduleCalendarData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeWorkScheduleCalendarData(Boolean value) {
        this.includeWorkScheduleCalendarData = value;
    }

}
