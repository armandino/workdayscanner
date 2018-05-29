
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element for all Web Address data.
 * 
 * <p>Java class for Web_Address_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Web_Address_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Web_Address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Web_Address_Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Web_Address_DataType", propOrder = {
    "webAddress",
    "webAddressComment",
    "usageData"
})
public class WebAddressDataType {

    @XmlElement(name = "Web_Address", required = true)
    protected String webAddress;
    @XmlElement(name = "Web_Address_Comment")
    protected String webAddressComment;
    @XmlElement(name = "Usage_Data", required = true)
    protected CommunicationMethodUsageDataType usageData;

    /**
     * Gets the value of the webAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebAddress() {
        return webAddress;
    }

    /**
     * Sets the value of the webAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebAddress(String value) {
        this.webAddress = value;
    }

    /**
     * Gets the value of the webAddressComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebAddressComment() {
        return webAddressComment;
    }

    /**
     * Sets the value of the webAddressComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebAddressComment(String value) {
        this.webAddressComment = value;
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
