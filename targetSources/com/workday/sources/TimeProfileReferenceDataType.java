
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference element representing a unique instance of Time Profile.
 * 
 * <p>Java class for Time_Profile_Reference_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Time_Profile_Reference_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Time_Profile_Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Time_Profile_Reference_DataType", propOrder = {
    "timeProfileDescription"
})
public class TimeProfileReferenceDataType {

    @XmlElement(name = "Time_Profile_Description", required = true)
    protected String timeProfileDescription;

    /**
     * Gets the value of the timeProfileDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeProfileDescription() {
        return timeProfileDescription;
    }

    /**
     * Sets the value of the timeProfileDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeProfileDescription(String value) {
        this.timeProfileDescription = value;
    }

}
