
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element Containing Put Work Shift Response Data
 * 
 * <p>Java class for Put_Work_Shift_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Work_Shift_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Work_Shift_Reference" type="{urn:com.workday/bsvc}Work_ShiftObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{urn:com.workday/bsvc}version"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Put_Work_Shift_ResponseType", propOrder = {
    "workShiftReference"
})
public class PutWorkShiftResponseType {

    @XmlElement(name = "Work_Shift_Reference")
    protected WorkShiftObjectType workShiftReference;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the workShiftReference property.
     * 
     * @return
     *     possible object is
     *     {@link WorkShiftObjectType }
     *     
     */
    public WorkShiftObjectType getWorkShiftReference() {
        return workShiftReference;
    }

    /**
     * Sets the value of the workShiftReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkShiftObjectType }
     *     
     */
    public void setWorkShiftReference(WorkShiftObjectType value) {
        this.workShiftReference = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
