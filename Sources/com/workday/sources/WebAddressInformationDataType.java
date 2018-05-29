
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Web Address Information
 * 
 * <p>Java class for Web_address_Information_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Web_address_Information_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Web_Address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Web_Address_Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Web_address_Information_DataType", propOrder = {
    "webAddress",
    "webAddressComment",
    "usageData"
})
public class WebAddressInformationDataType {

    @XmlElement(name = "Web_Address", required = true)
    protected String webAddress;
    @XmlElement(name = "Web_Address_Comment")
    protected String webAddressComment;
    @XmlElement(name = "Usage_Data", required = true)
    protected List<CommunicationMethodUsageInformationDataType> usageData;

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
