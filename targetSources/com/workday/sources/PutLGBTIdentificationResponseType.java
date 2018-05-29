
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response element for the Put LGBT Identification operation.
 * 
 * <p>Java class for Put_LGBT_Identification_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_LGBT_Identification_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LGBT_Identification_Reference" type="{urn:com.workday/bsvc}LGBT_IdentificationObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{urn:com.workday/bsvc}version"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Put_LGBT_Identification_ResponseType", propOrder = {
    "lgbtIdentificationReference"
})
public class PutLGBTIdentificationResponseType {

    @XmlElement(name = "LGBT_Identification_Reference")
    protected LGBTIdentificationObjectType lgbtIdentificationReference;
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
