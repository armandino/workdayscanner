
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Contains the benefit plan year information.
 * 
 * <p>Java class for Enrollment_Period_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Enrollment_Period_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Benefit_Program_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Plan_Year" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Begin_Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="End_Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Enrollment_Period_DataType", propOrder = {
    "benefitProgramName",
    "planYear",
    "beginDate",
    "endDate"
})
public class EnrollmentPeriodDataType {

    @XmlElement(name = "Benefit_Program_Name", required = true)
    protected String benefitProgramName;
    @XmlElement(name = "Plan_Year")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar planYear;
    @XmlElement(name = "Begin_Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar beginDate;
    @XmlElement(name = "End_Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;

    /**
     * Gets the value of the benefitProgramName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitProgramName() {
        return benefitProgramName;
    }

    /**
     * Sets the value of the benefitProgramName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitProgramName(String value) {
        this.benefitProgramName = value;
    }

    /**
     * Gets the value of the planYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlanYear() {
        return planYear;
    }

    /**
     * Sets the value of the planYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlanYear(XMLGregorianCalendar value) {
        this.planYear = value;
    }

    /**
     * Gets the value of the beginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginDate() {
        return beginDate;
    }

    /**
     * Sets the value of the beginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginDate(XMLGregorianCalendar value) {
        this.beginDate = value;
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

}
