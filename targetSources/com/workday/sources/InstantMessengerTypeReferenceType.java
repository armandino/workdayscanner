
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference element representing a unique instance of Instant Messenger Type.
 * 
 * <p>Java class for Instant_Messenger_Type_ReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Instant_Messenger_Type_ReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Instant_Messenger_Provider" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Instant_Messenger_Type_ReferenceType", propOrder = {
    "instantMessengerProvider"
})
public class InstantMessengerTypeReferenceType {

    @XmlElement(name = "Instant_Messenger_Provider", required = true)
    protected String instantMessengerProvider;

    /**
     * Gets the value of the instantMessengerProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstantMessengerProvider() {
        return instantMessengerProvider;
    }

    /**
     * Sets the value of the instantMessengerProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstantMessengerProvider(String value) {
        this.instantMessengerProvider = value;
    }

}
