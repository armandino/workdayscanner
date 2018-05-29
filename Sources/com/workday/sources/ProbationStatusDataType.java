
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Encapsulating element containg all Probation Status data for a Worker.
 * 
 * <p>Java class for Probation_Status_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Probation_Status_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Probation_Start_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Probation_End_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Probation_Status_DataType", propOrder = {
    "probationStartDate",
    "probationEndDate"
})
public class ProbationStatusDataType {

    @XmlElement(name = "Probation_Start_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar probationStartDate;
    @XmlElement(name = "Probation_End_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar probationEndDate;

    /**
     * Gets the value of the probationStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProbationStartDate() {
        return probationStartDate;
    }

    /**
     * Sets the value of the probationStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProbationStartDate(XMLGregorianCalendar value) {
        this.probationStartDate = value;
    }

    /**
     * Gets the value of the probationEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProbationEndDate() {
        return probationEndDate;
    }

    /**
     * Sets the value of the probationEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProbationEndDate(XMLGregorianCalendar value) {
        this.probationEndDate = value;
    }

}
