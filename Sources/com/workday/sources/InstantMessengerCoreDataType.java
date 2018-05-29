
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Instant Messenger core data.
 * 
 * <p>Java class for Instant_Messenger_Core_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Instant_Messenger_Core_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Instant_Messenger_Type_Reference" type="{urn:com.workday/bsvc}Instant_Messenger_TypeObjectType"/>
 *         &lt;element name="Instant_Messenger_Address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Instant_Messenger_Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Instant_Messenger_Core_DataType", propOrder = {
    "instantMessengerTypeReference",
    "instantMessengerAddress",
    "instantMessengerComment"
})
public class InstantMessengerCoreDataType {

    @XmlElement(name = "Instant_Messenger_Type_Reference", required = true)
    protected InstantMessengerTypeObjectType instantMessengerTypeReference;
    @XmlElement(name = "Instant_Messenger_Address", required = true)
    protected String instantMessengerAddress;
    @XmlElement(name = "Instant_Messenger_Comment")
    protected String instantMessengerComment;

    /**
     * Gets the value of the instantMessengerTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link InstantMessengerTypeObjectType }
     *     
     */
    public InstantMessengerTypeObjectType getInstantMessengerTypeReference() {
        return instantMessengerTypeReference;
    }

    /**
     * Sets the value of the instantMessengerTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstantMessengerTypeObjectType }
     *     
     */
    public void setInstantMessengerTypeReference(InstantMessengerTypeObjectType value) {
        this.instantMessengerTypeReference = value;
    }

    /**
     * Gets the value of the instantMessengerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstantMessengerAddress() {
        return instantMessengerAddress;
    }

    /**
     * Sets the value of the instantMessengerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstantMessengerAddress(String value) {
        this.instantMessengerAddress = value;
    }

    /**
     * Gets the value of the instantMessengerComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstantMessengerComment() {
        return instantMessengerComment;
    }

    /**
     * Sets the value of the instantMessengerComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstantMessengerComment(String value) {
        this.instantMessengerComment = value;
    }

}
