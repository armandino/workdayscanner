
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Encapsulating element for Military Service Data.
 * 
 * <p>Java class for Military_Service_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Military_Service_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Military_Status_Reference" type="{urn:com.workday/bsvc}Military_Status_ReferenceType"/>
 *         &lt;element name="Military_Discharge_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Military_Service_DataType", propOrder = {
    "militaryStatusReference",
    "militaryDischargeDate"
})
public class MilitaryServiceDataType {

    @XmlElement(name = "Military_Status_Reference", required = true)
    protected MilitaryStatusReferenceType militaryStatusReference;
    @XmlElement(name = "Military_Discharge_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar militaryDischargeDate;

    /**
     * Gets the value of the militaryStatusReference property.
     * 
     * @return
     *     possible object is
     *     {@link MilitaryStatusReferenceType }
     *     
     */
    public MilitaryStatusReferenceType getMilitaryStatusReference() {
        return militaryStatusReference;
    }

    /**
     * Sets the value of the militaryStatusReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link MilitaryStatusReferenceType }
     *     
     */
    public void setMilitaryStatusReference(MilitaryStatusReferenceType value) {
        this.militaryStatusReference = value;
    }

    /**
     * Gets the value of the militaryDischargeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMilitaryDischargeDate() {
        return militaryDischargeDate;
    }

    /**
     * Sets the value of the militaryDischargeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMilitaryDischargeDate(XMLGregorianCalendar value) {
        this.militaryDischargeDate = value;
    }

}
