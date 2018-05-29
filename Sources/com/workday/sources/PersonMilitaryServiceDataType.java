
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Wrapper element for the military service information for the person.
 * 
 * <p>Java class for Person_Military_Service_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Person_Military_Service_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status_Reference" type="{urn:com.workday/bsvc}Military_StatusObjectType"/>
 *         &lt;element name="Discharge_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Status_Begin_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Military_Service_Type_Reference" type="{urn:com.workday/bsvc}Military_Service_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Military_Rank_Reference" type="{urn:com.workday/bsvc}Military_RankObjectType" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:com.workday/bsvc}RichText" minOccurs="0"/>
 *         &lt;element name="Military_Service_Reference" type="{urn:com.workday/bsvc}Military_Service_ReferenceObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person_Military_Service_DataType", propOrder = {
    "statusReference",
    "dischargeDate",
    "statusBeginDate",
    "militaryServiceTypeReference",
    "militaryRankReference",
    "notes",
    "militaryServiceReference"
})
public class PersonMilitaryServiceDataType {

    @XmlElement(name = "Status_Reference", required = true)
    protected MilitaryStatusObjectType statusReference;
    @XmlElement(name = "Discharge_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dischargeDate;
    @XmlElement(name = "Status_Begin_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar statusBeginDate;
    @XmlElement(name = "Military_Service_Type_Reference")
    protected MilitaryServiceTypeObjectType militaryServiceTypeReference;
    @XmlElement(name = "Military_Rank_Reference")
    protected MilitaryRankObjectType militaryRankReference;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "Military_Service_Reference")
    protected MilitaryServiceReferenceObjectType militaryServiceReference;

    /**
     * Gets the value of the statusReference property.
     * 
     * @return
     *     possible object is
     *     {@link MilitaryStatusObjectType }
     *     
     */
    public MilitaryStatusObjectType getStatusReference() {
        return statusReference;
    }

    /**
     * Sets the value of the statusReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link MilitaryStatusObjectType }
     *     
     */
    public void setStatusReference(MilitaryStatusObjectType value) {
        this.statusReference = value;
    }

    /**
     * Gets the value of the dischargeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDischargeDate() {
        return dischargeDate;
    }

    /**
     * Sets the value of the dischargeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDischargeDate(XMLGregorianCalendar value) {
        this.dischargeDate = value;
    }

    /**
     * Gets the value of the statusBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusBeginDate() {
        return statusBeginDate;
    }

    /**
     * Sets the value of the statusBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusBeginDate(XMLGregorianCalendar value) {
        this.statusBeginDate = value;
    }

    /**
     * Gets the value of the militaryServiceTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link MilitaryServiceTypeObjectType }
     *     
     */
    public MilitaryServiceTypeObjectType getMilitaryServiceTypeReference() {
        return militaryServiceTypeReference;
    }

    /**
     * Sets the value of the militaryServiceTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link MilitaryServiceTypeObjectType }
     *     
     */
    public void setMilitaryServiceTypeReference(MilitaryServiceTypeObjectType value) {
        this.militaryServiceTypeReference = value;
    }

    /**
     * Gets the value of the militaryRankReference property.
     * 
     * @return
     *     possible object is
     *     {@link MilitaryRankObjectType }
     *     
     */
    public MilitaryRankObjectType getMilitaryRankReference() {
        return militaryRankReference;
    }

    /**
     * Sets the value of the militaryRankReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link MilitaryRankObjectType }
     *     
     */
    public void setMilitaryRankReference(MilitaryRankObjectType value) {
        this.militaryRankReference = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the militaryServiceReference property.
     * 
     * @return
     *     possible object is
     *     {@link MilitaryServiceReferenceObjectType }
     *     
     */
    public MilitaryServiceReferenceObjectType getMilitaryServiceReference() {
        return militaryServiceReference;
    }

    /**
     * Sets the value of the militaryServiceReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link MilitaryServiceReferenceObjectType }
     *     
     */
    public void setMilitaryServiceReference(MilitaryServiceReferenceObjectType value) {
        this.militaryServiceReference = value;
    }

}
