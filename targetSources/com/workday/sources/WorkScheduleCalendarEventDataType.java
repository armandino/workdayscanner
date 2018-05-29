
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Work Schedule Calendar Event data.
 * 
 * <p>Java class for Work_Schedule_Calendar_Event_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Work_Schedule_Calendar_Event_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Display_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Start_End_Data" type="{urn:com.workday/bsvc}Start_End_Minute_Support_DataType"/>
 *         &lt;element name="Meal_Data" type="{urn:com.workday/bsvc}Calendar_Event_Non_Work_DataType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Work_Schedule_Calendar_Event_DataType", propOrder = {
    "name",
    "displayName",
    "startEndData",
    "mealData",
    "recurrenceData"
})
public class WorkScheduleCalendarEventDataType {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Display_Name")
    protected String displayName;
    @XmlElement(name = "Start_End_Data", required = true)
    protected StartEndMinuteSupportDataType startEndData;
    @XmlElement(name = "Meal_Data")
    protected List<CalendarEventNonWorkDataType> mealData;
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
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the startEndData property.
     * 
     * @return
     *     possible object is
     *     {@link StartEndMinuteSupportDataType }
     *     
     */
    public StartEndMinuteSupportDataType getStartEndData() {
        return startEndData;
    }

    /**
     * Sets the value of the startEndData property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartEndMinuteSupportDataType }
     *     
     */
    public void setStartEndData(StartEndMinuteSupportDataType value) {
        this.startEndData = value;
    }

    /**
     * Gets the value of the mealData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mealData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMealData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CalendarEventNonWorkDataType }
     * 
     * 
     */
    public List<CalendarEventNonWorkDataType> getMealData() {
        if (mealData == null) {
            mealData = new ArrayList<CalendarEventNonWorkDataType>();
        }
        return this.mealData;
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
