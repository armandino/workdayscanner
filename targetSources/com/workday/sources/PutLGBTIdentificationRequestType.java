
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request element for Put LGBT Identification
 * 
 * <p>Java class for Put_LGBT_Identification_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_LGBT_Identification_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LGBT_Identification_Reference" type="{urn:com.workday/bsvc}LGBT_IdentificationObjectType" minOccurs="0"/>
 *         &lt;element name="LGBT_Identification_Data" type="{urn:com.workday/bsvc}LGBT_Identification_DataType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Add_Only" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute ref="{urn:com.workday/bsvc}version"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Put_LGBT_Identification_RequestType", propOrder = {
    "lgbtIdentificationReference",
    "lgbtIdentificationData"
})
public class PutLGBTIdentificationRequestType {

    @XmlElement(name = "LGBT_Identification_Reference")
    protected LGBTIdentificationObjectType lgbtIdentificationReference;
    @XmlElement(name = "LGBT_Identification_Data", required = true)
    protected LGBTIdentificationDataType lgbtIdentificationData;
    @XmlAttribute(name = "Add_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean addOnly;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the lgbtIdentificationReference property.
     * 
     * @return
     *     possible object is
     *     {@link LGBTIdentificationObjectType }
     *     
     */
    public LGBTIdentificationObjectType getLGBTIdentificationReference() {
        return lgbtIdentificationReference;
    }

    /**
     * Sets the value of the lgbtIdentificationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LGBTIdentificationObjectType }
     *     
     */
    public void setLGBTIdentificationReference(LGBTIdentificationObjectType value) {
        this.lgbtIdentificationReference = value;
    }

    /**
     * Gets the value of the lgbtIdentificationData property.
     * 
     * @return
     *     possible object is
     *     {@link LGBTIdentificationDataType }
     *     
     */
    public LGBTIdentificationDataType getLGBTIdentificationData() {
        return lgbtIdentificationData;
    }

    /**
     * Sets the value of the lgbtIdentificationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LGBTIdentificationDataType }
     *     
     */
    public void setLGBTIdentificationData(LGBTIdentificationDataType value) {
        this.lgbtIdentificationData = value;
    }

    /**
     * Gets the value of the addOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddOnly() {
        return addOnly;
    }

    /**
     * Sets the value of the addOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddOnly(Boolean value) {
        this.addOnly = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
