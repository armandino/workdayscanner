
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper Element for Responding with Reporting Calendar Data
 * 
 * <p>Java class for Period_Reporting_CalendarType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Period_Reporting_CalendarType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Period_Reporting_Calendar_Reference" type="{urn:com.workday/bsvc}Period_Reporting_CalendarObjectType" minOccurs="0"/>
 *         &lt;element name="Period_Reporting_Calendar_Data" type="{urn:com.workday/bsvc}Period_Reporting_Calendar_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Period_Reporting_CalendarType", propOrder = {
    "periodReportingCalendarReference",
    "periodReportingCalendarData"
})
public class PeriodReportingCalendarType {

    @XmlElement(name = "Period_Reporting_Calendar_Reference")
    protected PeriodReportingCalendarObjectType periodReportingCalendarReference;
    @XmlElement(name = "Period_Reporting_Calendar_Data")
    protected List<PeriodReportingCalendarDataType> periodReportingCalendarData;

    /**
     * Gets the value of the periodReportingCalendarReference property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodReportingCalendarObjectType }
     *     
     */
    public PeriodReportingCalendarObjectType getPeriodReportingCalendarReference() {
        return periodReportingCalendarReference;
    }

    /**
     * Sets the value of the periodReportingCalendarReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodReportingCalendarObjectType }
     *     
     */
    public void setPeriodReportingCalendarReference(PeriodReportingCalendarObjectType value) {
        this.periodReportingCalendarReference = value;
    }

    /**
     * Gets the value of the periodReportingCalendarData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the periodReportingCalendarData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriodReportingCalendarData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodReportingCalendarDataType }
     * 
     * 
     */
    public List<PeriodReportingCalendarDataType> getPeriodReportingCalendarData() {
        if (periodReportingCalendarData == null) {
            periodReportingCalendarData = new ArrayList<PeriodReportingCalendarDataType>();
        }
        return this.periodReportingCalendarData;
    }

}
