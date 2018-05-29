
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request Element for Adding or Updating a Period Reporting Calendar
 * 
 * <p>Java class for Put_Period_Reporting_Calendar_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Period_Reporting_Calendar_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Period_Reporting_Calendar_Reference" type="{urn:com.workday/bsvc}Period_Reporting_CalendarObjectType" minOccurs="0"/>
 *         &lt;element name="Period_Reporting_Calendar_Data" type="{urn:com.workday/bsvc}Period_Reporting_Calendar_DataType"/>
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
@XmlType(name = "Put_Period_Reporting_Calendar_RequestType", propOrder = {
    "periodReportingCalendarReference",
    "periodReportingCalendarData"
})
public class PutPeriodReportingCalendarRequestType {

    @XmlElement(name = "Period_Reporting_Calendar_Reference")
    protected PeriodReportingCalendarObjectType periodReportingCalendarReference;
    @XmlElement(name = "Period_Reporting_Calendar_Data", required = true)
    protected PeriodReportingCalendarDataType periodReportingCalendarData;
    @XmlAttribute(name = "Add_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean addOnly;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

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
     * @return
     *     possible object is
     *     {@link PeriodReportingCalendarDataType }
     *     
     */
    public PeriodReportingCalendarDataType getPeriodReportingCalendarData() {
        return periodReportingCalendarData;
    }

    /**
     * Sets the value of the periodReportingCalendarData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodReportingCalendarDataType }
     *     
     */
    public void setPeriodReportingCalendarData(PeriodReportingCalendarDataType value) {
        this.periodReportingCalendarData = value;
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
