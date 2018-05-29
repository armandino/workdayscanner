
package com.workday.sources;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Instance data for Schedule Pattern. This schedule pattern may be linked to schedule changes that a manager made. If you update this schedule pattern, you will also be deleting the manager's changes.
 * 
 * <p>Java class for Pattern_Schedule_Event_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pattern_Schedule_Event_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Week_Number">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="2"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Day_of_the_Week_Reference" type="{urn:com.workday/bsvc}Day_of_the_WeekObjectType" maxOccurs="unbounded"/>
 *         &lt;element name="Start_Time" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="End_Time" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="_24_Hour_Shift" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Meal_Start" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="Meal_End" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
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
@XmlType(name = "Pattern_Schedule_Event_DataType", propOrder = {
    "weekNumber",
    "dayOfTheWeekReference",
    "startTime",
    "endTime",
    "_24HourShift",
    "mealStart",
    "mealEnd"
})
public class PatternScheduleEventDataType {

    @XmlElement(name = "Week_Number", required = true)
    protected BigDecimal weekNumber;
    @XmlElement(name = "Day_of_the_Week_Reference", required = true)
    protected List<DayOfTheWeekObjectType> dayOfTheWeekReference;
    @XmlElement(name = "Start_Time")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "End_Time")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar endTime;
    @XmlElement(name = "_24_Hour_Shift")
    protected Boolean _24HourShift;
    @XmlElement(name = "Meal_Start")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar mealStart;
    @XmlElement(name = "Meal_End")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar mealEnd;
    @XmlAttribute(name = "ID", namespace = "urn:com.workday/bsvc")
    protected String id;

    /**
     * Gets the value of the weekNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeekNumber() {
        return weekNumber;
    }

    /**
     * Sets the value of the weekNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeekNumber(BigDecimal value) {
        this.weekNumber = value;
    }

    /**
     * Gets the value of the dayOfTheWeekReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dayOfTheWeekReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDayOfTheWeekReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DayOfTheWeekObjectType }
     * 
     * 
     */
    public List<DayOfTheWeekObjectType> getDayOfTheWeekReference() {
        if (dayOfTheWeekReference == null) {
            dayOfTheWeekReference = new ArrayList<DayOfTheWeekObjectType>();
        }
        return this.dayOfTheWeekReference;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the 24HourShift property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean is24HourShift() {
        return _24HourShift;
    }

    /**
     * Sets the value of the 24HourShift property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void set24HourShift(Boolean value) {
        this._24HourShift = value;
    }

    /**
     * Gets the value of the mealStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMealStart() {
        return mealStart;
    }

    /**
     * Sets the value of the mealStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMealStart(XMLGregorianCalendar value) {
        this.mealStart = value;
    }

    /**
     * Gets the value of the mealEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMealEnd() {
        return mealEnd;
    }

    /**
     * Sets the value of the mealEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMealEnd(XMLGregorianCalendar value) {
        this.mealEnd = value;
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
