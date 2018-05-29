
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
 * Instance data for Work Schedule Calendar.
 * 
 * <p>Java class for Work_Schedule_Calendar_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Work_Schedule_Calendar_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Schedule_Summary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Condition_Rule_Reference" type="{urn:com.workday/bsvc}Condition_RuleObjectType" minOccurs="0"/>
 *         &lt;element name="Day_Breaker_Reference" type="{urn:com.workday/bsvc}Twenty_Four_Hour_TimeObjectType"/>
 *         &lt;element name="Day_Breaker_Divides_Reference" type="{urn:com.workday/bsvc}Day_Breaker_DividerObjectType" minOccurs="0"/>
 *         &lt;element name="Work_Week_Start_Day_Reference" type="{urn:com.workday/bsvc}Day_of_the_WeekObjectType"/>
 *         &lt;element name="Biweekly_Calculation_Start_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Pattern_Start_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Number_of_Weeks" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="2"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Work_Schedule_Calendar_Event_Data" type="{urn:com.workday/bsvc}Work_Schedule_Calendar_Event_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Worker_Edit_Options_Data" type="{urn:com.workday/bsvc}Worker_Editing_Options_DataType" minOccurs="0"/>
 *         &lt;element name="Pattern_Schedule_Event_Data" type="{urn:com.workday/bsvc}Pattern_Schedule_Event_DataType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Work_Schedule_Calendar_DataType", propOrder = {
    "name",
    "scheduleSummary",
    "description",
    "conditionRuleReference",
    "dayBreakerReference",
    "dayBreakerDividesReference",
    "workWeekStartDayReference",
    "biweeklyCalculationStartDate",
    "patternStartDate",
    "numberOfWeeks",
    "workScheduleCalendarEventData",
    "workerEditOptionsData",
    "patternScheduleEventData"
})
public class WorkScheduleCalendarDataType {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Schedule_Summary")
    protected String scheduleSummary;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Condition_Rule_Reference")
    protected ConditionRuleObjectType conditionRuleReference;
    @XmlElement(name = "Day_Breaker_Reference", required = true)
    protected TwentyFourHourTimeObjectType dayBreakerReference;
    @XmlElement(name = "Day_Breaker_Divides_Reference")
    protected DayBreakerDividerObjectType dayBreakerDividesReference;
    @XmlElement(name = "Work_Week_Start_Day_Reference", required = true)
    protected DayOfTheWeekObjectType workWeekStartDayReference;
    @XmlElement(name = "Biweekly_Calculation_Start_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar biweeklyCalculationStartDate;
    @XmlElement(name = "Pattern_Start_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar patternStartDate;
    @XmlElement(name = "Number_of_Weeks")
    protected BigDecimal numberOfWeeks;
    @XmlElement(name = "Work_Schedule_Calendar_Event_Data")
    protected List<WorkScheduleCalendarEventDataType> workScheduleCalendarEventData;
    @XmlElement(name = "Worker_Edit_Options_Data")
    protected WorkerEditingOptionsDataType workerEditOptionsData;
    @XmlElement(name = "Pattern_Schedule_Event_Data")
    protected List<PatternScheduleEventDataType> patternScheduleEventData;
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
     * Gets the value of the scheduleSummary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleSummary() {
        return scheduleSummary;
    }

    /**
     * Sets the value of the scheduleSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleSummary(String value) {
        this.scheduleSummary = value;
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
     * Gets the value of the dayBreakerReference property.
     * 
     * @return
     *     possible object is
     *     {@link TwentyFourHourTimeObjectType }
     *     
     */
    public TwentyFourHourTimeObjectType getDayBreakerReference() {
        return dayBreakerReference;
    }

    /**
     * Sets the value of the dayBreakerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TwentyFourHourTimeObjectType }
     *     
     */
    public void setDayBreakerReference(TwentyFourHourTimeObjectType value) {
        this.dayBreakerReference = value;
    }

    /**
     * Gets the value of the dayBreakerDividesReference property.
     * 
     * @return
     *     possible object is
     *     {@link DayBreakerDividerObjectType }
     *     
     */
    public DayBreakerDividerObjectType getDayBreakerDividesReference() {
        return dayBreakerDividesReference;
    }

    /**
     * Sets the value of the dayBreakerDividesReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayBreakerDividerObjectType }
     *     
     */
    public void setDayBreakerDividesReference(DayBreakerDividerObjectType value) {
        this.dayBreakerDividesReference = value;
    }

    /**
     * Gets the value of the workWeekStartDayReference property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfTheWeekObjectType }
     *     
     */
    public DayOfTheWeekObjectType getWorkWeekStartDayReference() {
        return workWeekStartDayReference;
    }

    /**
     * Sets the value of the workWeekStartDayReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfTheWeekObjectType }
     *     
     */
    public void setWorkWeekStartDayReference(DayOfTheWeekObjectType value) {
        this.workWeekStartDayReference = value;
    }

    /**
     * Gets the value of the biweeklyCalculationStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBiweeklyCalculationStartDate() {
        return biweeklyCalculationStartDate;
    }

    /**
     * Sets the value of the biweeklyCalculationStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBiweeklyCalculationStartDate(XMLGregorianCalendar value) {
        this.biweeklyCalculationStartDate = value;
    }

    /**
     * Gets the value of the patternStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPatternStartDate() {
        return patternStartDate;
    }

    /**
     * Sets the value of the patternStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPatternStartDate(XMLGregorianCalendar value) {
        this.patternStartDate = value;
    }

    /**
     * Gets the value of the numberOfWeeks property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumberOfWeeks() {
        return numberOfWeeks;
    }

    /**
     * Sets the value of the numberOfWeeks property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumberOfWeeks(BigDecimal value) {
        this.numberOfWeeks = value;
    }

    /**
     * Gets the value of the workScheduleCalendarEventData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workScheduleCalendarEventData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkScheduleCalendarEventData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkScheduleCalendarEventDataType }
     * 
     * 
     */
    public List<WorkScheduleCalendarEventDataType> getWorkScheduleCalendarEventData() {
        if (workScheduleCalendarEventData == null) {
            workScheduleCalendarEventData = new ArrayList<WorkScheduleCalendarEventDataType>();
        }
        return this.workScheduleCalendarEventData;
    }

    /**
     * Gets the value of the workerEditOptionsData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerEditingOptionsDataType }
     *     
     */
    public WorkerEditingOptionsDataType getWorkerEditOptionsData() {
        return workerEditOptionsData;
    }

    /**
     * Sets the value of the workerEditOptionsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerEditingOptionsDataType }
     *     
     */
    public void setWorkerEditOptionsData(WorkerEditingOptionsDataType value) {
        this.workerEditOptionsData = value;
    }

    /**
     * Gets the value of the patternScheduleEventData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the patternScheduleEventData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPatternScheduleEventData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PatternScheduleEventDataType }
     * 
     * 
     */
    public List<PatternScheduleEventDataType> getPatternScheduleEventData() {
        if (patternScheduleEventData == null) {
            patternScheduleEventData = new ArrayList<PatternScheduleEventDataType>();
        }
        return this.patternScheduleEventData;
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
