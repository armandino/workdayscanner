
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Eligibility Criteria Data.  Eligibility Criteria element is used in conjunction with Workday delivered integrations.
 * 
 * <p>Java class for Eligibility_Criteria_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Eligibility_Criteria_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Field_Reference" type="{urn:com.workday/bsvc}Integration_Document_FieldObjectType"/>
 *         &lt;element name="As_Of_Effective_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="As_Of_Entry_DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Eligibility_Criteria_DataType", propOrder = {
    "fieldReference",
    "asOfEffectiveDate",
    "asOfEntryDateTime"
})
public class EligibilityCriteriaDataType {

    @XmlElement(name = "Field_Reference", required = true)
    protected IntegrationDocumentFieldObjectType fieldReference;
    @XmlElement(name = "As_Of_Effective_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar asOfEffectiveDate;
    @XmlElement(name = "As_Of_Entry_DateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar asOfEntryDateTime;

    /**
     * Gets the value of the fieldReference property.
     * 
     * @return
     *     possible object is
     *     {@link IntegrationDocumentFieldObjectType }
     *     
     */
    public IntegrationDocumentFieldObjectType getFieldReference() {
        return fieldReference;
    }

    /**
     * Sets the value of the fieldReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegrationDocumentFieldObjectType }
     *     
     */
    public void setFieldReference(IntegrationDocumentFieldObjectType value) {
        this.fieldReference = value;
    }

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

}
