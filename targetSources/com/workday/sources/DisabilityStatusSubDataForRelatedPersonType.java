
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Container for disability status data for the Personal Information Change business process.
 * 
 * <p>Java class for Disability_Status_Sub_Data_for_Related_PersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Disability_Status_Sub_Data_for_Related_PersonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Disability_Reference" type="{urn:com.workday/bsvc}DisabilityObjectType"/>
 *         &lt;element name="Disability_Status_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Date_Known" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Disability_End_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Disability_Grade_Reference" type="{urn:com.workday/bsvc}Disability_GradeObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Disability_Status_Sub_Data_for_Related_PersonType", propOrder = {
    "disabilityReference",
    "disabilityStatusDate",
    "dateKnown",
    "disabilityEndDate",
    "disabilityGradeReference"
})
public class DisabilityStatusSubDataForRelatedPersonType {

    @XmlElement(name = "Disability_Reference", required = true)
    protected DisabilityObjectType disabilityReference;
    @XmlElement(name = "Disability_Status_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar disabilityStatusDate;
    @XmlElement(name = "Date_Known")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateKnown;
    @XmlElement(name = "Disability_End_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar disabilityEndDate;
    @XmlElement(name = "Disability_Grade_Reference")
    protected DisabilityGradeObjectType disabilityGradeReference;

    /**
     * Gets the value of the disabilityReference property.
     * 
     * @return
     *     possible object is
     *     {@link DisabilityObjectType }
     *     
     */
    public DisabilityObjectType getDisabilityReference() {
        return disabilityReference;
    }

    /**
     * Sets the value of the disabilityReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisabilityObjectType }
     *     
     */
    public void setDisabilityReference(DisabilityObjectType value) {
        this.disabilityReference = value;
    }

    /**
     * Gets the value of the disabilityStatusDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDisabilityStatusDate() {
        return disabilityStatusDate;
    }

    /**
     * Sets the value of the disabilityStatusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDisabilityStatusDate(XMLGregorianCalendar value) {
        this.disabilityStatusDate = value;
    }

    /**
     * Gets the value of the dateKnown property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateKnown() {
        return dateKnown;
    }

    /**
     * Sets the value of the dateKnown property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateKnown(XMLGregorianCalendar value) {
        this.dateKnown = value;
    }

    /**
     * Gets the value of the disabilityEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDisabilityEndDate() {
        return disabilityEndDate;
    }

    /**
     * Sets the value of the disabilityEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDisabilityEndDate(XMLGregorianCalendar value) {
        this.disabilityEndDate = value;
    }

    /**
     * Gets the value of the disabilityGradeReference property.
     * 
     * @return
     *     possible object is
     *     {@link DisabilityGradeObjectType }
     *     
     */
    public DisabilityGradeObjectType getDisabilityGradeReference() {
        return disabilityGradeReference;
    }

    /**
     * Sets the value of the disabilityGradeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisabilityGradeObjectType }
     *     
     */
    public void setDisabilityGradeReference(DisabilityGradeObjectType value) {
        this.disabilityGradeReference = value;
    }

}
