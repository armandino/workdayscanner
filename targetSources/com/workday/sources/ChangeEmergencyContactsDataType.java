
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element to hold reference and data for an emergency contact.
 * 
 * <p>Java class for Change_Emergency_Contacts_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Change_Emergency_Contacts_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Emergency_Contact_Reference" type="{urn:com.workday/bsvc}Emergency_ContactObjectType" minOccurs="0"/>
 *         &lt;element name="Delete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Emergency_Contact_Data" type="{urn:com.workday/bsvc}Change_Emergency_Contact_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Change_Emergency_Contacts_DataType", propOrder = {
    "emergencyContactReference",
    "delete",
    "emergencyContactData"
})
public class ChangeEmergencyContactsDataType {

    @XmlElement(name = "Emergency_Contact_Reference")
    protected EmergencyContactObjectType emergencyContactReference;
    @XmlElement(name = "Delete")
    protected Boolean delete;
    @XmlElement(name = "Emergency_Contact_Data")
    protected ChangeEmergencyContactDataType emergencyContactData;

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
     * Gets the value of the delete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelete() {
        return delete;
    }

    /**
     * Sets the value of the delete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelete(Boolean value) {
        this.delete = value;
    }

    /**
     * Gets the value of the emergencyContactData property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeEmergencyContactDataType }
     *     
     */
    public ChangeEmergencyContactDataType getEmergencyContactData() {
        return emergencyContactData;
    }

    /**
     * Sets the value of the emergencyContactData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeEmergencyContactDataType }
     *     
     */
    public void setEmergencyContactData(ChangeEmergencyContactDataType value) {
        this.emergencyContactData = value;
    }

}
