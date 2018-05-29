
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper containing data for Condition Rule.
 * 
 * <p>Java class for Holiday_Calendar_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Holiday_Calendar_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Condition_Rule_Reference" type="{urn:com.workday/bsvc}Condition_RuleObjectType" minOccurs="0"/>
 *         &lt;element name="Display_on_Time_Off_and_Leave_Calendar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Holiday_Calendar_Event_Data" type="{urn:com.workday/bsvc}Holiday_Calendar_Event_DataType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Holiday_Calendar_DataType", propOrder = {
    "name",
    "description",
    "conditionRuleReference",
    "displayOnTimeOffAndLeaveCalendar",
    "holidayCalendarEventData"
})
public class HolidayCalendarDataType {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Condition_Rule_Reference")
    protected ConditionRuleObjectType conditionRuleReference;
    @XmlElement(name = "Display_on_Time_Off_and_Leave_Calendar")
    protected Boolean displayOnTimeOffAndLeaveCalendar;
    @XmlElement(name = "Holiday_Calendar_Event_Data")
    protected List<HolidayCalendarEventDataType> holidayCalendarEventData;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the conditionRuleReference property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionRuleObjectType }
     *     
     */
    public ConditionRuleObjectType getConditionRuleReference() {
        return conditionRuleReference;
    }

    /**
     * Sets the value of the conditionRuleReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionRuleObjectType }
     *     
     */
    public void setConditionRuleReference(ConditionRuleObjectType value) {
        this.conditionRuleReference = value;
    }

    /**
     * Gets the value of the displayOnTimeOffAndLeaveCalendar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayOnTimeOffAndLeaveCalendar() {
        return displayOnTimeOffAndLeaveCalendar;
    }

    /**
     * Sets the value of the displayOnTimeOffAndLeaveCalendar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayOnTimeOffAndLeaveCalendar(Boolean value) {
        this.displayOnTimeOffAndLeaveCalendar = value;
    }

    /**
     * Gets the value of the holidayCalendarEventData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the holidayCalendarEventData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHolidayCalendarEventData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HolidayCalendarEventDataType }
     * 
     * 
     */
    public List<HolidayCalendarEventDataType> getHolidayCalendarEventData() {
        if (holidayCalendarEventData == null) {
            holidayCalendarEventData = new ArrayList<HolidayCalendarEventDataType>();
        }
        return this.holidayCalendarEventData;
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
