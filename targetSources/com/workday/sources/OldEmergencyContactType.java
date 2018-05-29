
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing all Emergency Contact data.
 * 
 * <p>Java class for Old_Emergency_ContactType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Old_Emergency_ContactType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Emergency_Contact_Reference" type="{urn:com.workday/bsvc}Emergency_ContactObjectType"/>
 *         &lt;element name="Emergency_Contact_Data" type="{urn:com.workday/bsvc}Emergency_Contact_DataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Old_Emergency_ContactType", propOrder = {
    "emergencyContactReference",
    "emergencyContactData"
})
public class OldEmergencyContactType {

    @XmlElement(name = "Emergency_Contact_Reference", required = true)
    protected EmergencyContactObjectType emergencyContactReference;
    @XmlElement(name = "Emergency_Contact_Data", required = true)
    protected EmergencyContactDataType emergencyContactData;

    /**
     * Gets the value of the emergencyContactReference property.
     * 
     * @return
     *     possible object is
     *     {@link EmergencyContactObjectType }
     *     
     */
    public EmergencyContactObjectType getEmergencyContactReference() {
        return emergencyContactReference;
    }

    /**
     * Sets the value of the emergencyContactReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmergencyContactObjectType }
     *     
     */
    public void setEmergencyContactReference(EmergencyContactObjectType value) {
        this.emergencyContactReference = value;
    }

    /**
     * Gets the value of the emergencyContactData property.
     * 
     * @return
     *     possible object is
     *     {@link EmergencyContactDataType }
     *     
     */
    public EmergencyContactDataType getEmergencyContactData() {
        return emergencyContactData;
    }

    /**
     * Sets the value of the emergencyContactData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmergencyContactDataType }
     *     
     */
    public void setEmergencyContactData(EmergencyContactDataType value) {
        this.emergencyContactData = value;
    }

}
