
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response element for the Put Disability operation.
 * 
 * <p>Java class for Put_Disability_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Disability_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Disability_Reference" type="{urn:com.workday/bsvc}DisabilityObjectType" minOccurs="0"/>
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
@XmlType(name = "Put_Disability_ResponseType", propOrder = {
    "disabilityReference"
})
public class PutDisabilityResponseType {

    @XmlElement(name = "Disability_Reference")
    protected DisabilityObjectType disabilityReference;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the disabilityReference property.
     * 
     * @return
     *     possible object is
     *     {@link DisabilityObjectType }
     *     
     */
    public DisabilityObjectType getDisabilityReference() {
        return disabilityReference;
    }

    /**
     * Sets the value of the disabilityReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisabilityObjectType }
     *     
     */
    public void setDisabilityReference(DisabilityObjectType value) {
        this.disabilityReference = value;
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
