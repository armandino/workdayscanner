
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Element contains effective and updated date/time data.
 * 
 * <p>Java class for Effective_And_Updated_DateTime_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Effective_And_Updated_DateTime_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Updated_From" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Updated_Through" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Effective_From" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Effective_Through" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Effective_And_Updated_DateTime_DataType", propOrder = {
    "updatedFrom",
    "updatedThrough",
    "effectiveFrom",
    "effectiveThrough"
})
public class EffectiveAndUpdatedDateTimeDataType {

    @XmlElement(name = "Updated_From")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedFrom;
    @XmlElement(name = "Updated_Through")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedThrough;
    @XmlElement(name = "Effective_From")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveFrom;
    @XmlElement(name = "Effective_Through")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveThrough;

    /**
     * Gets the value of the updatedFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedFrom() {
        return updatedFrom;
    }

    /**
     * Sets the value of the updatedFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedFrom(XMLGregorianCalendar value) {
        this.updatedFrom = value;
    }

    /**
     * Gets the value of the updatedThrough property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedThrough() {
        return updatedThrough;
    }

    /**
     * Sets the value of the updatedThrough property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedThrough(XMLGregorianCalendar value) {
        this.updatedThrough = value;
    }

    /**
     * Gets the value of the effectiveFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveFrom() {
        return effectiveFrom;
    }

    /**
     * Sets the value of the effectiveFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveFrom(XMLGregorianCalendar value) {
        this.effectiveFrom = value;
    }

    /**
     * Gets the value of the effectiveThrough property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveThrough() {
        return effectiveThrough;
    }

    /**
     * Sets the value of the effectiveThrough property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveThrough(XMLGregorianCalendar value) {
        this.effectiveThrough = value;
    }

}
