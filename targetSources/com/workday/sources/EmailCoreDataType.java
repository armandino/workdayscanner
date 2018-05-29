
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Email Address core data.
 * 
 * <p>Java class for Email_Core_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Email_Core_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Email_Address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Email_Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Email_Core_DataType", propOrder = {
    "emailAddress",
    "emailComment"
})
public class EmailCoreDataType {

    @XmlElement(name = "Email_Address", required = true)
    protected String emailAddress;
    @XmlElement(name = "Email_Comment")
    protected String emailComment;

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

}
