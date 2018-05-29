
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element for all Instant Messenger data.
 * 
 * <p>Java class for Instant_Messenger_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Instant_Messenger_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Instant_Messenger_Address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Instant_Messenger_Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Instant_Messenger_Type_Reference" type="{urn:com.workday/bsvc}Instant_Messenger_Type_ReferenceType"/>
 *         &lt;element name="Usage_Data" type="{urn:com.workday/bsvc}Communication_Method_Usage_DataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Instant_Messenger_DataType", propOrder = {
    "instantMessengerAddress",
    "instantMessengerComment",
    "instantMessengerTypeReference",
    "usageData"
})
public class InstantMessengerDataType {

    @XmlElement(name = "Instant_Messenger_Address", required = true)
    protected String instantMessengerAddress;
    @XmlElement(name = "Instant_Messenger_Comment")
    protected String instantMessengerComment;
    @XmlElement(name = "Instant_Messenger_Type_Reference", required = true)
    protected InstantMessengerTypeReferenceType instantMessengerTypeReference;
    @XmlElement(name = "Usage_Data", required = true)
    protected CommunicationMethodUsageDataType usageData;

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

    /**
     * Gets the value of the instantMessengerTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link InstantMessengerTypeReferenceType }
     *     
     */
    public InstantMessengerTypeReferenceType getInstantMessengerTypeReference() {
        return instantMessengerTypeReference;
    }

    /**
     * Sets the value of the instantMessengerTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstantMessengerTypeReferenceType }
     *     
     */
    public void setInstantMessengerTypeReference(InstantMessengerTypeReferenceType value) {
        this.instantMessengerTypeReference = value;
    }

    /**
     * Gets the value of the usageData property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationMethodUsageDataType }
     *     
     */
    public CommunicationMethodUsageDataType getUsageData() {
        return usageData;
    }

    /**
     * Sets the value of the usageData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationMethodUsageDataType }
     *     
     */
    public void setUsageData(CommunicationMethodUsageDataType value) {
        this.usageData = value;
    }

}
