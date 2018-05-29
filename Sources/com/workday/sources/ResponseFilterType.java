
package com.workday.sources;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Parameters that let you filter the data returned in the response. You can filter returned data by dates and page attributes.
 * 
 * <p>Java class for Response_FilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Response_FilterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="As_Of_Effective_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="As_Of_Entry_DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Page" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="12"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Count" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="3"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Response_FilterType", propOrder = {
    "asOfEffectiveDate",
    "asOfEntryDateTime",
    "page",
    "count"
})
public class ResponseFilterType {

    @XmlElement(name = "As_Of_Effective_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar asOfEffectiveDate;
    @XmlElement(name = "As_Of_Entry_DateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar asOfEntryDateTime;
    @XmlElement(name = "Page")
    protected BigDecimal page;
    @XmlElement(name = "Count")
    protected BigDecimal count;

    /**
     * Gets the value of the asOfEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAsOfEffectiveDate() {
        return asOfEffectiveDate;
    }

    /**
     * Sets the value of the asOfEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAsOfEffectiveDate(XMLGregorianCalendar value) {
        this.asOfEffectiveDate = value;
    }

    /**
     * Gets the value of the asOfEntryDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAsOfEntryDateTime() {
        return asOfEntryDateTime;
    }

    /**
     * Sets the value of the asOfEntryDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAsOfEntryDateTime(XMLGregorianCalendar value) {
        this.asOfEntryDateTime = value;
    }

    /**
     * Gets the value of the page property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPage(BigDecimal value) {
        this.page = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCount(BigDecimal value) {
        this.count = value;
    }

}
