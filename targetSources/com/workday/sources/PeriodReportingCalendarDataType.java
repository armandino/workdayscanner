
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Form to put, update, and view a Period Reporting Calendar
 * 
 * <p>Java class for Period_Reporting_Calendar_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Period_Reporting_Calendar_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reporting_Calendar_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Academic_Unit_Reference" type="{urn:com.workday/bsvc}Academic_UnitObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Default_Calendar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Inactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Period_Reporting_Calendar_Row_Data" type="{urn:com.workday/bsvc}Period_Reporting_Calendar_Row_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Period_Reporting_Calendar_DataType", propOrder = {
    "id",
    "reportingCalendarName",
    "academicUnitReference",
    "defaultCalendar",
    "inactive",
    "periodReportingCalendarRowData"
})
public class PeriodReportingCalendarDataType {

    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "Reporting_Calendar_Name", required = true)
    protected String reportingCalendarName;
    @XmlElement(name = "Academic_Unit_Reference")
    protected List<AcademicUnitObjectType> academicUnitReference;
    @XmlElement(name = "Default_Calendar")
    protected Boolean defaultCalendar;
    @XmlElement(name = "Inactive")
    protected Boolean inactive;
    @XmlElement(name = "Period_Reporting_Calendar_Row_Data")
    protected List<PeriodReportingCalendarRowDataType> periodReportingCalendarRowData;

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

    /**
     * Gets the value of the reportingCalendarName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingCalendarName() {
        return reportingCalendarName;
    }

    /**
     * Sets the value of the reportingCalendarName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingCalendarName(String value) {
        this.reportingCalendarName = value;
    }

    /**
     * Gets the value of the academicUnitReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the academicUnitReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcademicUnitReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcademicUnitObjectType }
     * 
     * 
     */
    public List<AcademicUnitObjectType> getAcademicUnitReference() {
        if (academicUnitReference == null) {
            academicUnitReference = new ArrayList<AcademicUnitObjectType>();
        }
        return this.academicUnitReference;
    }

    /**
     * Gets the value of the defaultCalendar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultCalendar() {
        return defaultCalendar;
    }

    /**
     * Sets the value of the defaultCalendar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultCalendar(Boolean value) {
        this.defaultCalendar = value;
    }

    /**
     * Gets the value of the inactive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInactive() {
        return inactive;
    }

    /**
     * Sets the value of the inactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInactive(Boolean value) {
        this.inactive = value;
    }

    /**
     * Gets the value of the periodReportingCalendarRowData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the periodReportingCalendarRowData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriodReportingCalendarRowData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodReportingCalendarRowDataType }
     * 
     * 
     */
    public List<PeriodReportingCalendarRowDataType> getPeriodReportingCalendarRowData() {
        if (periodReportingCalendarRowData == null) {
            periodReportingCalendarRowData = new ArrayList<PeriodReportingCalendarRowDataType>();
        }
        return this.periodReportingCalendarRowData;
    }

}
