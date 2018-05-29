
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Encapsulating element containing Event History data.
 * 
 * <p>Java class for Event_History_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Event_History_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Event_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Event_Type_Reference" type="{urn:com.workday/bsvc}Business_Process_Type_Reference_DataType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Completed_DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Effective_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Event_History_DataType", propOrder = {
    "eventID",
    "eventTypeReference",
    "description",
    "completedDateTime",
    "effectiveDate"
})
public class EventHistoryDataType {

    @XmlElement(name = "Event_ID")
    protected String eventID;
    @XmlElement(name = "Event_Type_Reference")
    protected BusinessProcessTypeReferenceDataType eventTypeReference;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Completed_DateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar completedDateTime;
    @XmlElement(name = "Effective_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;

    /**
     * Gets the value of the eventID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventID() {
        return eventID;
    }

    /**
     * Sets the value of the eventID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventID(String value) {
        this.eventID = value;
    }

    /**
     * Gets the value of the eventTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessProcessTypeReferenceDataType }
     *     
     */
    public BusinessProcessTypeReferenceDataType getEventTypeReference() {
        return eventTypeReference;
    }

    /**
     * Sets the value of the eventTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessProcessTypeReferenceDataType }
     *     
     */
    public void setEventTypeReference(BusinessProcessTypeReferenceDataType value) {
        this.eventTypeReference = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the completedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompletedDateTime() {
        return completedDateTime;
    }

    /**
     * Sets the value of the completedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompletedDateTime(XMLGregorianCalendar value) {
        this.completedDateTime = value;
    }

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

}
