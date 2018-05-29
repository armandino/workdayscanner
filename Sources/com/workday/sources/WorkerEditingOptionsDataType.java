
package com.workday.sources;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Instance data for Worker Editing Options for Work Schedule Calendar.
 * 
 * <p>Java class for Worker_Editing_Options_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Editing_Options_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Enable_Worker_Editing_Options" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Change_Scheduled_and_Non_Scheduled_Days" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Change_Number_of_Scheduled_Days" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Enable_Hours_Restrictions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Minimum_Number_of_Hours_per_Day" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="4"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Maximum_Number_of_Hours_per_Day" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="4"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Minimum_Number_of_Hours_per_Week" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Maximum_Number_of_Hours_per_Week" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Change_Daily_Start_and_End_Times" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Uniform_Start_and_End_Times" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Flexible_Start_Time" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="Flexible_End_Time" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="Allow_Meals" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Change_Meal_Start_and_End_Times" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Minimum_Meal_Duration" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="3"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Maximum_Meal_Duration" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="3"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Editing_Options_DataType", propOrder = {
    "enableWorkerEditingOptions",
    "changeScheduledAndNonScheduledDays",
    "changeNumberOfScheduledDays",
    "enableHoursRestrictions",
    "minimumNumberOfHoursPerDay",
    "maximumNumberOfHoursPerDay",
    "minimumNumberOfHoursPerWeek",
    "maximumNumberOfHoursPerWeek",
    "changeDailyStartAndEndTimes",
    "uniformStartAndEndTimes",
    "flexibleStartTime",
    "flexibleEndTime",
    "allowMeals",
    "changeMealStartAndEndTimes",
    "minimumMealDuration",
    "maximumMealDuration"
})
public class WorkerEditingOptionsDataType {

    @XmlElement(name = "Enable_Worker_Editing_Options")
    protected Boolean enableWorkerEditingOptions;
    @XmlElement(name = "Change_Scheduled_and_Non_Scheduled_Days")
    protected Boolean changeScheduledAndNonScheduledDays;
    @XmlElement(name = "Change_Number_of_Scheduled_Days")
    protected Boolean changeNumberOfScheduledDays;
    @XmlElement(name = "Enable_Hours_Restrictions")
    protected Boolean enableHoursRestrictions;
    @XmlElement(name = "Minimum_Number_of_Hours_per_Day")
    protected BigDecimal minimumNumberOfHoursPerDay;
    @XmlElement(name = "Maximum_Number_of_Hours_per_Day")
    protected BigDecimal maximumNumberOfHoursPerDay;
    @XmlElement(name = "Minimum_Number_of_Hours_per_Week")
    protected BigDecimal minimumNumberOfHoursPerWeek;
    @XmlElement(name = "Maximum_Number_of_Hours_per_Week")
    protected BigDecimal maximumNumberOfHoursPerWeek;
    @XmlElement(name = "Change_Daily_Start_and_End_Times")
    protected Boolean changeDailyStartAndEndTimes;
    @XmlElement(name = "Uniform_Start_and_End_Times")
    protected Boolean uniformStartAndEndTimes;
    @XmlElement(name = "Flexible_Start_Time")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar flexibleStartTime;
    @XmlElement(name = "Flexible_End_Time")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar flexibleEndTime;
    @XmlElement(name = "Allow_Meals")
    protected Boolean allowMeals;
    @XmlElement(name = "Change_Meal_Start_and_End_Times")
    protected Boolean changeMealStartAndEndTimes;
    @XmlElement(name = "Minimum_Meal_Duration")
    protected BigDecimal minimumMealDuration;
    @XmlElement(name = "Maximum_Meal_Duration")
    protected BigDecimal maximumMealDuration;

    /**
     * Gets the value of the enableWorkerEditingOptions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableWorkerEditingOptions() {
        return enableWorkerEditingOptions;
    }

    /**
     * Sets the value of the enableWorkerEditingOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableWorkerEditingOptions(Boolean value) {
        this.enableWorkerEditingOptions = value;
    }

    /**
     * Gets the value of the changeScheduledAndNonScheduledDays property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangeScheduledAndNonScheduledDays() {
        return changeScheduledAndNonScheduledDays;
    }

    /**
     * Sets the value of the changeScheduledAndNonScheduledDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangeScheduledAndNonScheduledDays(Boolean value) {
        this.changeScheduledAndNonScheduledDays = value;
    }

    /**
     * Gets the value of the changeNumberOfScheduledDays property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangeNumberOfScheduledDays() {
        return changeNumberOfScheduledDays;
    }

    /**
     * Sets the value of the changeNumberOfScheduledDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangeNumberOfScheduledDays(Boolean value) {
        this.changeNumberOfScheduledDays = value;
    }

    /**
     * Gets the value of the enableHoursRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableHoursRestrictions() {
        return enableHoursRestrictions;
    }

    /**
     * Sets the value of the enableHoursRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableHoursRestrictions(Boolean value) {
        this.enableHoursRestrictions = value;
    }

    /**
     * Gets the value of the minimumNumberOfHoursPerDay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumNumberOfHoursPerDay() {
        return minimumNumberOfHoursPerDay;
    }

    /**
     * Sets the value of the minimumNumberOfHoursPerDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumNumberOfHoursPerDay(BigDecimal value) {
        this.minimumNumberOfHoursPerDay = value;
    }

    /**
     * Gets the value of the maximumNumberOfHoursPerDay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumNumberOfHoursPerDay() {
        return maximumNumberOfHoursPerDay;
    }

    /**
     * Sets the value of the maximumNumberOfHoursPerDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumNumberOfHoursPerDay(BigDecimal value) {
        this.maximumNumberOfHoursPerDay = value;
    }

    /**
     * Gets the value of the minimumNumberOfHoursPerWeek property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumNumberOfHoursPerWeek() {
        return minimumNumberOfHoursPerWeek;
    }

    /**
     * Sets the value of the minimumNumberOfHoursPerWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumNumberOfHoursPerWeek(BigDecimal value) {
        this.minimumNumberOfHoursPerWeek = value;
    }

    /**
     * Gets the value of the maximumNumberOfHoursPerWeek property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumNumberOfHoursPerWeek() {
        return maximumNumberOfHoursPerWeek;
    }

    /**
     * Sets the value of the maximumNumberOfHoursPerWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumNumberOfHoursPerWeek(BigDecimal value) {
        this.maximumNumberOfHoursPerWeek = value;
    }

    /**
     * Gets the value of the changeDailyStartAndEndTimes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangeDailyStartAndEndTimes() {
        return changeDailyStartAndEndTimes;
    }

    /**
     * Sets the value of the changeDailyStartAndEndTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangeDailyStartAndEndTimes(Boolean value) {
        this.changeDailyStartAndEndTimes = value;
    }

    /**
     * Gets the value of the uniformStartAndEndTimes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUniformStartAndEndTimes() {
        return uniformStartAndEndTimes;
    }

    /**
     * Sets the value of the uniformStartAndEndTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUniformStartAndEndTimes(Boolean value) {
        this.uniformStartAndEndTimes = value;
    }

    /**
     * Gets the value of the flexibleStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFlexibleStartTime() {
        return flexibleStartTime;
    }

    /**
     * Sets the value of the flexibleStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFlexibleStartTime(XMLGregorianCalendar value) {
        this.flexibleStartTime = value;
    }

    /**
     * Gets the value of the flexibleEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFlexibleEndTime() {
        return flexibleEndTime;
    }

    /**
     * Sets the value of the flexibleEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFlexibleEndTime(XMLGregorianCalendar value) {
        this.flexibleEndTime = value;
    }

    /**
     * Gets the value of the allowMeals property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowMeals() {
        return allowMeals;
    }

    /**
     * Sets the value of the allowMeals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowMeals(Boolean value) {
        this.allowMeals = value;
    }

    /**
     * Gets the value of the changeMealStartAndEndTimes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangeMealStartAndEndTimes() {
        return changeMealStartAndEndTimes;
    }

    /**
     * Sets the value of the changeMealStartAndEndTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangeMealStartAndEndTimes(Boolean value) {
        this.changeMealStartAndEndTimes = value;
    }

    /**
     * Gets the value of the minimumMealDuration property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumMealDuration() {
        return minimumMealDuration;
    }

    /**
     * Sets the value of the minimumMealDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumMealDuration(BigDecimal value) {
        this.minimumMealDuration = value;
    }

    /**
     * Gets the value of the maximumMealDuration property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumMealDuration() {
        return maximumMealDuration;
    }

    /**
     * Sets the value of the maximumMealDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumMealDuration(BigDecimal value) {
        this.maximumMealDuration = value;
    }

}
