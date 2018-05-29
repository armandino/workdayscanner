
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Container for the data changed in the Change Business Title business process.
 * 
 * <p>Java class for Change_Business_Title_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Change_Business_Title_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Event_Effective_Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Proposed_Business_Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Change_Business_Title_DataType", propOrder = {
    "eventEffectiveDate",
    "proposedBusinessTitle"
})
public class ChangeBusinessTitleDataType {

    @XmlElement(name = "Event_Effective_Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eventEffectiveDate;
    @XmlElement(name = "Proposed_Business_Title", required = true)
    protected String proposedBusinessTitle;

    /**
     * Gets the value of the eventEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventEffectiveDate() {
        return eventEffectiveDate;
    }

    /**
     * Sets the value of the eventEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventEffectiveDate(XMLGregorianCalendar value) {
        this.eventEffectiveDate = value;
    }

    /**
     * Gets the value of the proposedBusinessTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProposedBusinessTitle() {
        return proposedBusinessTitle;
    }

    /**
     * Sets the value of the proposedBusinessTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProposedBusinessTitle(String value) {
        this.proposedBusinessTitle = value;
    }

}
