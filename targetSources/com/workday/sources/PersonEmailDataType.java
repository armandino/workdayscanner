
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A email address instance.
 * 
 * <p>Java class for Person_Email_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Person_Email_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Email_Data" type="{urn:com.workday/bsvc}Email_Core_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Usage_Data" type="{urn:com.workday/bsvc}Communication_Method_Usage_Information_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Email_Reference" type="{urn:com.workday/bsvc}Email_ReferenceObjectType" minOccurs="0"/>
 *         &lt;element name="Email_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Delete" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person_Email_DataType", propOrder = {
    "emailData",
    "usageData",
    "emailReference",
    "emailID"
})
public class PersonEmailDataType {

    @XmlElement(name = "Email_Data")
    protected List<EmailCoreDataType> emailData;
    @XmlElement(name = "Usage_Data")
    protected List<CommunicationMethodUsageInformationDataType> usageData;
    @XmlElement(name = "Email_Reference")
    protected EmailReferenceObjectType emailReference;
    @XmlElement(name = "Email_ID")
    protected String emailID;
    @XmlAttribute(name = "Delete", namespace = "urn:com.workday/bsvc")
    protected Boolean delete;

    /**
     * Gets the value of the emailData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailCoreDataType }
     * 
     * 
     */
    public List<EmailCoreDataType> getEmailData() {
        if (emailData == null) {
            emailData = new ArrayList<EmailCoreDataType>();
        }
        return this.emailData;
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

    /**
     * Gets the value of the emailReference property.
     * 
     * @return
     *     possible object is
     *     {@link EmailReferenceObjectType }
     *     
     */
    public EmailReferenceObjectType getEmailReference() {
        return emailReference;
    }

    /**
     * Sets the value of the emailReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailReferenceObjectType }
     *     
     */
    public void setEmailReference(EmailReferenceObjectType value) {
        this.emailReference = value;
    }

    /**
     * Gets the value of the emailID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailID() {
        return emailID;
    }

    /**
     * Sets the value of the emailID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailID(String value) {
        this.emailID = value;
    }

    /**
     * Gets the value of the delete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelete() {
        return delete;
    }

    /**
     * Sets the value of the delete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelete(Boolean value) {
        this.delete = value;
    }

}
