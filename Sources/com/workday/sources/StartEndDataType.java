
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Wrapper element containing date and times for the Calendar Event.
 * 
 * <p>Java class for Start_End_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Start_End_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="All_Day_Event" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Start_Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Start_Time_Reference" type="{urn:com.workday/bsvc}Twenty_Four_Hour_TimeObjectType" minOccurs="0"/>
 *         &lt;element name="End_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="End_Time_Reference" type="{urn:com.workday/bsvc}Twenty_Four_Hour_TimeObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Start_End_DataType", propOrder = {
    "allDayEvent",
    "startDate",
    "startTimeReference",
    "endDate",
    "endTimeReference"
})
public class StartEndDataType {

    @XmlElement(name = "All_Day_Event")
    protected Boolean allDayEvent;
    @XmlElement(name = "Start_Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "Start_Time_Reference")
    protected TwentyFourHourTimeObjectType startTimeReference;
    @XmlElement(name = "End_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "End_Time_Reference")
    protected TwentyFourHourTimeObjectType endTimeReference;

    /**
     * Gets the value of the allDayEvent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllDayEvent() {
        return allDayEvent;
    }

    /**
     * Sets the value of the allDayEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllDayEvent(Boolean value) {
        this.allDayEvent = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the startTimeReference property.
     * 
     * @return
     *     possible object is
     *     {@link TwentyFourHourTimeObjectType }
     *     
     */
    public TwentyFourHourTimeObjectType getStartTimeReference() {
        return startTimeReference;
    }

    /**
     * Sets the value of the startTimeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TwentyFourHourTimeObjectType }
     *     
     */
    public void setStartTimeReference(TwentyFourHourTimeObjectType value) {
        this.startTimeReference = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the endTimeReference property.
     * 
     * @return
     *     possible object is
     *     {@link TwentyFourHourTimeObjectType }
     *     
     */
    public TwentyFourHourTimeObjectType getEndTimeReference() {
        return endTimeReference;
    }

    /**
     * Sets the value of the endTimeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TwentyFourHourTimeObjectType }
     *     
     */
    public void setEndTimeReference(TwentyFourHourTimeObjectType value) {
        this.endTimeReference = value;
    }

}
