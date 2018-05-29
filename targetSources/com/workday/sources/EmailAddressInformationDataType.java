
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Email Address Information
 * 
 * <p>Java class for Email_Address_Information_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Email_Address_Information_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Email_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email_Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Usage_Data" type="{urn:com.workday/bsvc}Communication_Method_Usage_Information_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Email_Reference" type="{urn:com.workday/bsvc}Email_ReferenceObjectType" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Delete" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Do_Not_Replace_All" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Email_Address_Information_DataType", propOrder = {
    "emailAddress",
    "emailComment",
    "usageData",
    "emailReference",
    "id"
})
public class EmailAddressInformationDataType {

    @XmlElement(name = "Email_Address")
    protected String emailAddress;
    @XmlElement(name = "Email_Comment")
    protected String emailComment;
    @XmlElement(name = "Usage_Data")
    protected List<CommunicationMethodUsageInformationDataType> usageData;
    @XmlElement(name = "Email_Reference")
    protected EmailReferenceObjectType emailReference;
    @XmlElement(name = "ID")
    protected String id;
    @XmlAttribute(name = "Delete", namespace = "urn:com.workday/bsvc")
    protected Boolean delete;
    @XmlAttribute(name = "Do_Not_Replace_All", namespace = "urn:com.workday/bsvc")
    protected Boolean doNotReplaceAll;

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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
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

    /**
     * Gets the value of the doNotReplaceAll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDoNotReplaceAll() {
        return doNotReplaceAll;
    }

    /**
     * Sets the value of the doNotReplaceAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDoNotReplaceAll(Boolean value) {
        this.doNotReplaceAll = value;
    }

}
