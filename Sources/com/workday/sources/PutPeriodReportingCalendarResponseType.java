
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response of Put Period Reporting Calendar
 * 
 * <p>Java class for Put_Period_Reporting_Calendar_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Period_Reporting_Calendar_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Period_Reporting_Calendar_Reference" type="{urn:com.workday/bsvc}Period_Reporting_CalendarObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{urn:com.workday/bsvc}version"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Put_Period_Reporting_Calendar_ResponseType", propOrder = {
    "periodReportingCalendarReference"
})
public class PutPeriodReportingCalendarResponseType {

    @XmlElement(name = "Period_Reporting_Calendar_Reference")
    protected PeriodReportingCalendarObjectType periodReportingCalendarReference;
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
