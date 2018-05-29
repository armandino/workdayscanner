
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A phone instance.
 * 
 * <p>Java class for Person_Phone_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Person_Phone_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Phone_Data" type="{urn:com.workday/bsvc}Phone_Core_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Usage_Data" type="{urn:com.workday/bsvc}Communication_Method_Usage_Information_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Phone_Reference" type="{urn:com.workday/bsvc}Phone_ReferenceObjectType" minOccurs="0"/>
 *         &lt;element name="Phone_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Person_Phone_DataType", propOrder = {
    "phoneData",
    "usageData",
    "phoneReference",
    "phoneID"
})
public class PersonPhoneDataType {

    @XmlElement(name = "Phone_Data")
    protected List<PhoneCoreDataType> phoneData;
    @XmlElement(name = "Usage_Data")
    protected List<CommunicationMethodUsageInformationDataType> usageData;
    @XmlElement(name = "Phone_Reference")
    protected PhoneReferenceObjectType phoneReference;
    @XmlElement(name = "Phone_ID")
    protected String phoneID;
    @XmlAttribute(name = "Delete", namespace = "urn:com.workday/bsvc")
    protected Boolean delete;

    /**
     * Gets the value of the phoneData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoneData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoneData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneCoreDataType }
     * 
     * 
     */
    public List<PhoneCoreDataType> getPhoneData() {
        if (phoneData == null) {
            phoneData = new ArrayList<PhoneCoreDataType>();
        }
        return this.phoneData;
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
     * Gets the value of the phoneReference property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneReferenceObjectType }
     *     
     */
    public PhoneReferenceObjectType getPhoneReference() {
        return phoneReference;
    }

    /**
     * Sets the value of the phoneReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneReferenceObjectType }
     *     
     */
    public void setPhoneReference(PhoneReferenceObjectType value) {
        this.phoneReference = value;
    }

    /**
     * Gets the value of the phoneID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneID() {
        return phoneID;
    }

    /**
     * Sets the value of the phoneID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneID(String value) {
        this.phoneID = value;
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
