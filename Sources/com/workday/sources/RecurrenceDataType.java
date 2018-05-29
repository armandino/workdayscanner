
package com.workday.sources;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Wrapper element containing recurrence data for the Calendar Event.
 * 
 * <p>Java class for Recurrence_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Recurrence_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Recurrence_Type_Reference" type="{urn:com.workday/bsvc}Schedule_Request_TypeObjectType"/>
 *         &lt;element name="Recurrence_Interval_Multiplier" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Recurs_Every_Weekday" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Day_of_the_Week_Reference" type="{urn:com.workday/bsvc}Day_of_the_WeekObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="First_Day_of_the_Week_Reference" type="{urn:com.workday/bsvc}Day_of_the_WeekObjectType" minOccurs="0"/>
 *         &lt;element name="Month_Reference" type="{urn:com.workday/bsvc}MonthObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Day_of_the_Month_Reference" type="{urn:com.workday/bsvc}Day_of_the_MonthObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Week_of_the_Month_Reference" type="{urn:com.workday/bsvc}Week_of_the_MonthObjectType" minOccurs="0"/>
 *         &lt;element name="Recurrence_Start_Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Recurrence_End_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Recurrence_DataType", propOrder = {
    "recurrenceTypeReference",
    "recurrenceIntervalMultiplier",
    "recursEveryWeekday",
    "dayOfTheWeekReference",
    "firstDayOfTheWeekReference",
    "monthReference",
    "dayOfTheMonthReference",
    "weekOfTheMonthReference",
    "recurrenceStartDate",
    "recurrenceEndDate"
})
public class RecurrenceDataType {

    @XmlElement(name = "Recurrence_Type_Reference", required = true)
    protected ScheduleRequestTypeObjectType recurrenceTypeReference;
    @XmlElement(name = "Recurrence_Interval_Multiplier")
    protected BigDecimal recurrenceIntervalMultiplier;
    @XmlElement(name = "Recurs_Every_Weekday")
    protected Boolean recursEveryWeekday;
    @XmlElement(name = "Day_of_the_Week_Reference")
    protected List<DayOfTheWeekObjectType> dayOfTheWeekReference;
    @XmlElement(name = "First_Day_of_the_Week_Reference")
    protected DayOfTheWeekObjectType firstDayOfTheWeekReference;
    @XmlElement(name = "Month_Reference")
    protected List<MonthObjectType> monthReference;
    @XmlElement(name = "Day_of_the_Month_Reference")
    protected List<DayOfTheMonthObjectType> dayOfTheMonthReference;
    @XmlElement(name = "Week_of_the_Month_Reference")
    protected WeekOfTheMonthObjectType weekOfTheMonthReference;
    @XmlElement(name = "Recurrence_Start_Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar recurrenceStartDate;
    @XmlElement(name = "Recurrence_End_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar recurrenceEndDate;

    /**
     * Gets the value of the recurrenceTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleRequestTypeObjectType }
     *     
     */
    public ScheduleRequestTypeObjectType getRecurrenceTypeReference() {
        return recurrenceTypeReference;
    }

    /**
     * Sets the value of the recurrenceTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleRequestTypeObjectType }
     *     
     */
    public void setRecurrenceTypeReference(ScheduleRequestTypeObjectType value) {
        this.recurrenceTypeReference = value;
    }

    /**
     * Gets the value of the recurrenceIntervalMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRecurrenceIntervalMultiplier() {
        return recurrenceIntervalMultiplier;
    }

    /**
     * Sets the value of the recurrenceIntervalMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRecurrenceIntervalMultiplier(BigDecimal value) {
        this.recurrenceIntervalMultiplier = value;
    }

    /**
     * Gets the value of the recursEveryWeekday property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecursEveryWeekday() {
        return recursEveryWeekday;
    }

    /**
     * Sets the value of the recursEveryWeekday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecursEveryWeekday(Boolean value) {
        this.recursEveryWeekday = value;
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
     * Gets the value of the firstDayOfTheWeekReference property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfTheWeekObjectType }
     *     
     */
    public DayOfTheWeekObjectType getFirstDayOfTheWeekReference() {
        return firstDayOfTheWeekReference;
    }

    /**
     * Sets the value of the firstDayOfTheWeekReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfTheWeekObjectType }
     *     
     */
    public void setFirstDayOfTheWeekReference(DayOfTheWeekObjectType value) {
        this.firstDayOfTheWeekReference = value;
    }

    /**
     * Gets the value of the monthReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monthReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonthReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonthObjectType }
     * 
     * 
     */
    public List<MonthObjectType> getMonthReference() {
        if (monthReference == null) {
            monthReference = new ArrayList<MonthObjectType>();
        }
        return this.monthReference;
    }

    /**
     * Gets the value of the dayOfTheMonthReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dayOfTheMonthReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDayOfTheMonthReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DayOfTheMonthObjectType }
     * 
     * 
     */
    public List<DayOfTheMonthObjectType> getDayOfTheMonthReference() {
        if (dayOfTheMonthReference == null) {
            dayOfTheMonthReference = new ArrayList<DayOfTheMonthObjectType>();
        }
        return this.dayOfTheMonthReference;
    }

    /**
     * Gets the value of the weekOfTheMonthReference property.
     * 
     * @return
     *     possible object is
     *     {@link WeekOfTheMonthObjectType }
     *     
     */
    public WeekOfTheMonthObjectType getWeekOfTheMonthReference() {
        return weekOfTheMonthReference;
    }

    /**
     * Sets the value of the weekOfTheMonthReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeekOfTheMonthObjectType }
     *     
     */
    public void setWeekOfTheMonthReference(WeekOfTheMonthObjectType value) {
        this.weekOfTheMonthReference = value;
    }

    /**
     * Gets the value of the recurrenceStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecurrenceStartDate() {
        return recurrenceStartDate;
    }

    /**
     * Sets the value of the recurrenceStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecurrenceStartDate(XMLGregorianCalendar value) {
        this.recurrenceStartDate = value;
    }

    /**
     * Gets the value of the recurrenceEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecurrenceEndDate() {
        return recurrenceEndDate;
    }

    /**
     * Sets the value of the recurrenceEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecurrenceEndDate(XMLGregorianCalendar value) {
        this.recurrenceEndDate = value;
    }

}
