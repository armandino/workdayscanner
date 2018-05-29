
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Sub element used to change work space on a Position.
 * 
 * <p>Java class for Work_Space_Change_Event_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Work_Space_Change_Event_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Position_Reference" type="{urn:com.workday/bsvc}Position_ElementObjectType"/>
 *         &lt;element name="Effective_Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Work_Space_Reference" type="{urn:com.workday/bsvc}LocationObjectType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Work_Space_Change_Event_DataType", propOrder = {
    "positionReference",
    "effectiveDate",
    "workSpaceReference"
})
public class WorkSpaceChangeEventDataType {

    @XmlElement(name = "Position_Reference", required = true)
    protected PositionElementObjectType positionReference;
    @XmlElement(name = "Effective_Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "Work_Space_Reference", required = true)
    protected LocationObjectType workSpaceReference;

    /**
     * Gets the value of the positionReference property.
     * 
     * @return
     *     possible object is
     *     {@link PositionElementObjectType }
     *     
     */
    public PositionElementObjectType getPositionReference() {
        return positionReference;
    }

    /**
     * Sets the value of the positionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionElementObjectType }
     *     
     */
    public void setPositionReference(PositionElementObjectType value) {
        this.positionReference = value;
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

    /**
     * Gets the value of the workSpaceReference property.
     * 
     * @return
     *     possible object is
     *     {@link LocationObjectType }
     *     
     */
    public LocationObjectType getWorkSpaceReference() {
        return workSpaceReference;
    }

    /**
     * Sets the value of the workSpaceReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationObjectType }
     *     
     */
    public void setWorkSpaceReference(LocationObjectType value) {
        this.workSpaceReference = value;
    }

}
