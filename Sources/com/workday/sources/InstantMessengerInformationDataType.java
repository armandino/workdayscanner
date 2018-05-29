
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Instant Messenger Address.
 * 
 * <p>Java class for Instant_Messenger_Information_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Instant_Messenger_Information_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Instant_Messenger_Address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Instant_Messenger_Type_Reference" type="{urn:com.workday/bsvc}Instant_Messenger_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Instant_Messenger_Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Usage_Data" type="{urn:com.workday/bsvc}Communication_Method_Usage_Information_DataType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Instant_Messenger_Information_DataType", propOrder = {
    "instantMessengerAddress",
    "instantMessengerTypeReference",
    "instantMessengerComment",
    "usageData"
})
public class InstantMessengerInformationDataType {

    @XmlElement(name = "Instant_Messenger_Address", required = true)
    protected String instantMessengerAddress;
    @XmlElement(name = "Instant_Messenger_Type_Reference")
    protected InstantMessengerTypeObjectType instantMessengerTypeReference;
    @XmlElement(name = "Instant_Messenger_Comment")
    protected String instantMessengerComment;
    @XmlElement(name = "Usage_Data", required = true)
    protected List<CommunicationMethodUsageInformationDataType> usageData;

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
     * Gets the value of the usageData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usageData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsageData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicationMethodUsageInformationDataType }
     * 
     * 
     */
    public List<CommunicationMethodUsageInformationDataType> getUsageData() {
        if (usageData == null) {
            usageData = new ArrayList<CommunicationMethodUsageInformationDataType>();
        }
        return this.usageData;
    }

}
