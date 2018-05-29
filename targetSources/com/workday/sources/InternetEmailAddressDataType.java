
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element for all Internet Email Addresses.
 * 
 * <p>Java class for Internet_Email_Address_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Internet_Email_Address_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Email_Address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Email_Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Internet_Email_Address_DataType", propOrder = {
    "emailAddress",
    "emailComment",
    "usageData"
})
public class InternetEmailAddressDataType {

    @XmlElement(name = "Email_Address", required = true)
    protected String emailAddress;
    @XmlElement(name = "Email_Comment")
    protected String emailComment;
    @XmlElement(name = "Usage_Data", required = true)
    protected CommunicationMethodUsageDataType usageData;

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the emailComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailComment() {
        return emailComment;
    }

    /**
     * Sets the value of the emailComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailComment(String value) {
        this.emailComment = value;
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
