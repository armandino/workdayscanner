
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Container for military service data for the Person
 * 
 * <p>Java class for Generic_Military_Service_Sub_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Generic_Military_Service_Sub_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Military_Status_Reference" type="{urn:com.workday/bsvc}Military_StatusObjectType"/>
 *         &lt;element name="Military_Discharge_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Military_Status_Begin_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Military_Service_Type_Reference" type="{urn:com.workday/bsvc}Military_Service_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Military_Rank_Reference" type="{urn:com.workday/bsvc}Military_RankObjectType" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:com.workday/bsvc}RichText" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Generic_Military_Service_Sub_DataType", propOrder = {
    "militaryStatusReference",
    "militaryDischargeDate",
    "militaryStatusBeginDate",
    "militaryServiceTypeReference",
    "militaryRankReference",
    "notes"
})
public class GenericMilitaryServiceSubDataType {

    @XmlElement(name = "Military_Status_Reference", required = true)
    protected MilitaryStatusObjectType militaryStatusReference;
    @XmlElement(name = "Military_Discharge_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar militaryDischargeDate;
    @XmlElement(name = "Military_Status_Begin_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar militaryStatusBeginDate;
    @XmlElement(name = "Military_Service_Type_Reference")
    protected MilitaryServiceTypeObjectType militaryServiceTypeReference;
    @XmlElement(name = "Military_Rank_Reference")
    protected MilitaryRankObjectType militaryRankReference;
    @XmlElement(name = "Notes")
    protected String notes;

    /**
     * Gets the value of the militaryStatusReference property.
     * 
     * @return
     *     possible object is
     *     {@link MilitaryStatusObjectType }
     *     
     */
    public MilitaryStatusObjectType getMilitaryStatusReference() {
        return militaryStatusReference;
    }

    /**
     * Sets the value of the militaryStatusReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link MilitaryStatusObjectType }
     *     
     */
    public void setMilitaryStatusReference(MilitaryStatusObjectType value) {
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

    /**
     * Gets the value of the militaryStatusBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMilitaryStatusBeginDate() {
        return militaryStatusBeginDate;
    }

    /**
     * Sets the value of the militaryStatusBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMilitaryStatusBeginDate(XMLGregorianCalendar value) {
        this.militaryStatusBeginDate = value;
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

}
