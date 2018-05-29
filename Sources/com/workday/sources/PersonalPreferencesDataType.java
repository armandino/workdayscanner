
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element for all Personal Preferences.
 * 
 * <p>Java class for Personal_Preferences_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Personal_Preferences_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Receive_Email_Notifications" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Personal_Preferences_DataType", propOrder = {
    "receiveEmailNotifications"
})
public class PersonalPreferencesDataType {

    @XmlElement(name = "Receive_Email_Notifications")
    protected Boolean receiveEmailNotifications;

    /**
     * Gets the value of the receiveEmailNotifications property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReceiveEmailNotifications() {
        return receiveEmailNotifications;
    }

    /**
     * Sets the value of the receiveEmailNotifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReceiveEmailNotifications(Boolean value) {
        this.receiveEmailNotifications = value;
    }

}
