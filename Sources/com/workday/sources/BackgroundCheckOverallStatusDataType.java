
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Wrapper element for Background Check data.
 * 
 * <p>Java class for Background_Check_Overall_Status_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Background_Check_Overall_Status_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status_Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Status_Reference" type="{urn:com.workday/bsvc}Background_Check_StatusObjectType"/>
 *         &lt;element name="Status_Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Background_Check_Overall_Status_DataType", propOrder = {
    "statusDate",
    "statusReference",
    "statusComment"
})
public class BackgroundCheckOverallStatusDataType {

    @XmlElement(name = "Status_Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar statusDate;
    @XmlElement(name = "Status_Reference", required = true)
    protected BackgroundCheckStatusObjectType statusReference;
    @XmlElement(name = "Status_Comment")
    protected String statusComment;

    /**
     * Gets the value of the statusDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusDate() {
        return statusDate;
    }

    /**
     * Sets the value of the statusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusDate(XMLGregorianCalendar value) {
        this.statusDate = value;
    }

    /**
     * Gets the value of the statusReference property.
     * 
     * @return
     *     possible object is
     *     {@link BackgroundCheckStatusObjectType }
     *     
     */
    public BackgroundCheckStatusObjectType getStatusReference() {
        return statusReference;
    }

    /**
     * Sets the value of the statusReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BackgroundCheckStatusObjectType }
     *     
     */
    public void setStatusReference(BackgroundCheckStatusObjectType value) {
        this.statusReference = value;
    }

    /**
     * Gets the value of the statusComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusComment() {
        return statusComment;
    }

    /**
     * Sets the value of the statusComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusComment(String value) {
        this.statusComment = value;
    }

}
