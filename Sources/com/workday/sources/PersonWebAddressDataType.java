
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A web address instance.
 * 
 * <p>Java class for Person_Web_Address_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Person_Web_Address_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Web_Address_Data" type="{urn:com.workday/bsvc}Web_Address_Core_DataType"/>
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
@XmlType(name = "Person_Web_Address_DataType", propOrder = {
    "webAddressData",
    "usageData"
})
public class PersonWebAddressDataType {

    @XmlElement(name = "Web_Address_Data", required = true)
    protected WebAddressCoreDataType webAddressData;
    @XmlElement(name = "Usage_Data", required = true)
    protected CommunicationMethodUsageInformationDataType usageData;

    /**
     * Gets the value of the webAddressData property.
     * 
     * @return
     *     possible object is
     *     {@link WebAddressCoreDataType }
     *     
     */
    public WebAddressCoreDataType getWebAddressData() {
        return webAddressData;
    }

    /**
     * Sets the value of the webAddressData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebAddressCoreDataType }
     *     
     */
    public void setWebAddressData(WebAddressCoreDataType value) {
        this.webAddressData = value;
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
