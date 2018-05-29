
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This element reports Pay Group Assignment rescind events.
 * 
 * <p>Java class for Pay_Group_Assignment_Correct_or_Rescinded_Organization_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pay_Group_Assignment_Correct_or_Rescinded_Organization_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Effective_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Completed_On" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Event_Corrected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Event_Rescinded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Original_Pay_Group_Reference" type="{urn:com.workday/bsvc}Pay_GroupObjectType" minOccurs="0"/>
 *         &lt;element name="Proposed_Pay_Group_Reference" type="{urn:com.workday/bsvc}Pay_GroupObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pay_Group_Assignment_Correct_or_Rescinded_Organization_DataType", propOrder = {
    "effectiveDate",
    "completedOn",
    "eventCorrected",
    "eventRescinded",
    "originalPayGroupReference",
    "proposedPayGroupReference"
})
public class PayGroupAssignmentCorrectOrRescindedOrganizationDataType {

    @XmlElement(name = "Effective_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "Completed_On")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar completedOn;
    @XmlElement(name = "Event_Corrected")
    protected Boolean eventCorrected;
    @XmlElement(name = "Event_Rescinded")
    protected Boolean eventRescinded;
    @XmlElement(name = "Original_Pay_Group_Reference")
    protected PayGroupObjectType originalPayGroupReference;
    @XmlElement(name = "Proposed_Pay_Group_Reference")
    protected PayGroupObjectType proposedPayGroupReference;

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
     * Gets the value of the completedOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompletedOn() {
        return completedOn;
    }

    /**
     * Sets the value of the completedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompletedOn(XMLGregorianCalendar value) {
        this.completedOn = value;
    }

    /**
     * Gets the value of the eventCorrected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEventCorrected() {
        return eventCorrected;
    }

    /**
     * Sets the value of the eventCorrected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEventCorrected(Boolean value) {
        this.eventCorrected = value;
    }

    /**
     * Gets the value of the eventRescinded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEventRescinded() {
        return eventRescinded;
    }

    /**
     * Sets the value of the eventRescinded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEventRescinded(Boolean value) {
        this.eventRescinded = value;
    }

    /**
     * Gets the value of the originalPayGroupReference property.
     * 
     * @return
     *     possible object is
     *     {@link PayGroupObjectType }
     *     
     */
    public PayGroupObjectType getOriginalPayGroupReference() {
        return originalPayGroupReference;
    }

    /**
     * Sets the value of the originalPayGroupReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayGroupObjectType }
     *     
     */
    public void setOriginalPayGroupReference(PayGroupObjectType value) {
        this.originalPayGroupReference = value;
    }

    /**
     * Gets the value of the proposedPayGroupReference property.
     * 
     * @return
     *     possible object is
     *     {@link PayGroupObjectType }
     *     
     */
    public PayGroupObjectType getProposedPayGroupReference() {
        return proposedPayGroupReference;
    }

    /**
     * Sets the value of the proposedPayGroupReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayGroupObjectType }
     *     
     */
    public void setProposedPayGroupReference(PayGroupObjectType value) {
        this.proposedPayGroupReference = value;
    }

}
