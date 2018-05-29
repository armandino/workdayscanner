
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Element containing specific union membership dates and details.
 * 
 * <p>Java class for Union_Membership_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Union_Membership_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Start_Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="End_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Membership_Type_Reference" type="{urn:com.workday/bsvc}Union_Membership_TypeObjectType"/>
 *         &lt;element name="Related_Position_Reference" type="{urn:com.workday/bsvc}Staffing_InterfaceObjectType" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Union_Membership_DataType", propOrder = {
    "startDate",
    "endDate",
    "membershipTypeReference",
    "relatedPositionReference",
    "notes"
})
public class UnionMembershipDataType {

    @XmlElement(name = "Start_Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "End_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "Membership_Type_Reference", required = true)
    protected UnionMembershipTypeObjectType membershipTypeReference;
    @XmlElement(name = "Related_Position_Reference")
    protected StaffingInterfaceObjectType relatedPositionReference;
    @XmlElement(name = "Notes")
    protected String notes;

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the membershipTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link UnionMembershipTypeObjectType }
     *     
     */
    public UnionMembershipTypeObjectType getMembershipTypeReference() {
        return membershipTypeReference;
    }

    /**
     * Sets the value of the membershipTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnionMembershipTypeObjectType }
     *     
     */
    public void setMembershipTypeReference(UnionMembershipTypeObjectType value) {
        this.membershipTypeReference = value;
    }

    /**
     * Gets the value of the relatedPositionReference property.
     * 
     * @return
     *     possible object is
     *     {@link StaffingInterfaceObjectType }
     *     
     */
    public StaffingInterfaceObjectType getRelatedPositionReference() {
        return relatedPositionReference;
    }

    /**
     * Sets the value of the relatedPositionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link StaffingInterfaceObjectType }
     *     
     */
    public void setRelatedPositionReference(StaffingInterfaceObjectType value) {
        this.relatedPositionReference = value;
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
