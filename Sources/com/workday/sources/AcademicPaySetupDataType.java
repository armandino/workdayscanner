
package com.workday.sources;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Wrapper element that contains position's academic pay setup related data.
 * 
 * <p>Java class for Academic_Pay_Setup_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Academic_Pay_Setup_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Annual_Work_Period_Work_Percent_of_Year" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="9"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Annual_Work_Period_Start_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Annual_Work_Period_End_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Disbursement_Plan_Period_Start_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Disbursement_Plan_Period_End_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Academic_Pay_Setup_DataType", propOrder = {
    "annualWorkPeriodWorkPercentOfYear",
    "annualWorkPeriodStartDate",
    "annualWorkPeriodEndDate",
    "disbursementPlanPeriodStartDate",
    "disbursementPlanPeriodEndDate"
})
public class AcademicPaySetupDataType {

    @XmlElement(name = "Annual_Work_Period_Work_Percent_of_Year")
    protected BigDecimal annualWorkPeriodWorkPercentOfYear;
    @XmlElement(name = "Annual_Work_Period_Start_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar annualWorkPeriodStartDate;
    @XmlElement(name = "Annual_Work_Period_End_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar annualWorkPeriodEndDate;
    @XmlElement(name = "Disbursement_Plan_Period_Start_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar disbursementPlanPeriodStartDate;
    @XmlElement(name = "Disbursement_Plan_Period_End_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar disbursementPlanPeriodEndDate;

    /**
     * Gets the value of the annualWorkPeriodWorkPercentOfYear property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAnnualWorkPeriodWorkPercentOfYear() {
        return annualWorkPeriodWorkPercentOfYear;
    }

    /**
     * Sets the value of the annualWorkPeriodWorkPercentOfYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAnnualWorkPeriodWorkPercentOfYear(BigDecimal value) {
        this.annualWorkPeriodWorkPercentOfYear = value;
    }

    /**
     * Gets the value of the annualWorkPeriodStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAnnualWorkPeriodStartDate() {
        return annualWorkPeriodStartDate;
    }

    /**
     * Sets the value of the annualWorkPeriodStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAnnualWorkPeriodStartDate(XMLGregorianCalendar value) {
        this.annualWorkPeriodStartDate = value;
    }

    /**
     * Gets the value of the annualWorkPeriodEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAnnualWorkPeriodEndDate() {
        return annualWorkPeriodEndDate;
    }

    /**
     * Sets the value of the annualWorkPeriodEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAnnualWorkPeriodEndDate(XMLGregorianCalendar value) {
        this.annualWorkPeriodEndDate = value;
    }

    /**
     * Gets the value of the disbursementPlanPeriodStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDisbursementPlanPeriodStartDate() {
        return disbursementPlanPeriodStartDate;
    }

    /**
     * Sets the value of the disbursementPlanPeriodStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDisbursementPlanPeriodStartDate(XMLGregorianCalendar value) {
        this.disbursementPlanPeriodStartDate = value;
    }

    /**
     * Gets the value of the disbursementPlanPeriodEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDisbursementPlanPeriodEndDate() {
        return disbursementPlanPeriodEndDate;
    }

    /**
     * Sets the value of the disbursementPlanPeriodEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDisbursementPlanPeriodEndDate(XMLGregorianCalendar value) {
        this.disbursementPlanPeriodEndDate = value;
    }

}
