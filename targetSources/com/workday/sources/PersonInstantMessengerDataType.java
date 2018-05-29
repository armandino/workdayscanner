
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * An instant messenger instance
 * 
 * <p>Java class for Person_Instant_Messenger_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Person_Instant_Messenger_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Instant_Messenger_Data" type="{urn:com.workday/bsvc}Instant_Messenger_Core_DataType"/>
 *         &lt;element name="Usage_Data" type="{urn:com.workday/bsvc}Communication_Method_Usage_Information_DataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person_Instant_Messenger_DataType", propOrder = {
    "instantMessengerData",
    "usageData"
})
public class PersonInstantMessengerDataType {

    @XmlElement(name = "Instant_Messenger_Data", required = true)
    protected InstantMessengerCoreDataType instantMessengerData;
    @XmlElement(name = "Usage_Data", required = true)
    protected CommunicationMethodUsageInformationDataType usageData;

    /**
     * Gets the value of the instantMessengerData property.
     * 
     * @return
     *     possible object is
     *     {@link InstantMessengerCoreDataType }
     *     
     */
    public InstantMessengerCoreDataType getInstantMessengerData() {
        return instantMessengerData;
    }

    /**
     * Sets the value of the instantMessengerData property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstantMessengerCoreDataType }
     *     
     */
    public void setInstantMessengerData(InstantMessengerCoreDataType value) {
        this.instantMessengerData = value;
    }

    /**
     * Gets the value of the usageData property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationMethodUsageInformationDataType }
     *     
     */
    public CommunicationMethodUsageInformationDataType getUsageData() {
        return usageData;
    }

    /**
     * Sets the value of the usageData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationMethodUsageInformationDataType }
     *     
     */
    public void setUsageData(CommunicationMethodUsageInformationDataType value) {
        this.usageData = value;
    }

}
