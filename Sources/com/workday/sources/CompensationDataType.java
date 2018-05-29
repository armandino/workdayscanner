
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Encapsulating element containg all Compensation Data.
 * 
 * <p>Java class for Compensation_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Compensation_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Effective_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Summary_Compensation_Data" type="{urn:com.workday/bsvc}Compensation_Summary_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Compensation_DataType", propOrder = {
    "effectiveDate",
    "summaryCompensationData"
})
public class CompensationDataType {

    @XmlElement(name = "Effective_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "Summary_Compensation_Data")
    protected CompensationSummaryDataType summaryCompensationData;

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the summaryCompensationData property.
     * 
     * @return
     *     possible object is
     *     {@link CompensationSummaryDataType }
     *     
     */
    public CompensationSummaryDataType getSummaryCompensationData() {
        return summaryCompensationData;
    }

    /**
     * Sets the value of the summaryCompensationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompensationSummaryDataType }
     *     
     */
    public void setSummaryCompensationData(CompensationSummaryDataType value) {
        this.summaryCompensationData = value;
    }

}
