
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Response element containing an instance of Employee and his/her Employment Information.
 * 
 * <p>Java class for Employee_Employment_InfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employee_Employment_InfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Employee_Reference" type="{urn:com.workday/bsvc}Employee_ReferenceType"/>
 *         &lt;element name="Employee_Employment_Info_Data" type="{urn:com.workday/bsvc}Employee_Employment_Info_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="As_Of_Date" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="As_Of_Moment" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute ref="{urn:com.workday/bsvc}version"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employee_Employment_InfoType", propOrder = {
    "employeeReference",
    "employeeEmploymentInfoData"
})
public class EmployeeEmploymentInfoType {

    @XmlElement(name = "Employee_Reference", required = true)
    protected EmployeeReferenceType employeeReference;
    @XmlElement(name = "Employee_Employment_Info_Data")
    protected EmployeeEmploymentInfoDataType employeeEmploymentInfoData;
    @XmlAttribute(name = "As_Of_Date", namespace = "urn:com.workday/bsvc")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar asOfDate;
    @XmlAttribute(name = "As_Of_Moment", namespace = "urn:com.workday/bsvc")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar asOfMoment;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the employeeReference property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeReferenceType }
     *     
     */
    public EmployeeReferenceType getEmployeeReference() {
        return employeeReference;
    }

    /**
     * Sets the value of the employeeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeReferenceType }
     *     
     */
    public void setEmployeeReference(EmployeeReferenceType value) {
        this.employeeReference = value;
    }

    /**
     * Gets the value of the employeeEmploymentInfoData property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeEmploymentInfoDataType }
     *     
     */
    public EmployeeEmploymentInfoDataType getEmployeeEmploymentInfoData() {
        return employeeEmploymentInfoData;
    }

    /**
     * Sets the value of the employeeEmploymentInfoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeEmploymentInfoDataType }
     *     
     */
    public void setEmployeeEmploymentInfoData(EmployeeEmploymentInfoDataType value) {
        this.employeeEmploymentInfoData = value;
    }

    /**
     * Gets the value of the asOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAsOfDate() {
        return asOfDate;
    }

    /**
     * Sets the value of the asOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAsOfDate(XMLGregorianCalendar value) {
        this.asOfDate = value;
    }

    /**
     * Gets the value of the asOfMoment property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAsOfMoment() {
        return asOfMoment;
    }

    /**
     * Sets the value of the asOfMoment property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAsOfMoment(XMLGregorianCalendar value) {
        this.asOfMoment = value;
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
