
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The response to the gender identity put request.
 * 
 * <p>Java class for Put_Gender_Identity_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Gender_Identity_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Gender_Identity_Reference" type="{urn:com.workday/bsvc}Gender_IdentityObjectType" minOccurs="0"/>
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
@XmlType(name = "Put_Gender_Identity_ResponseType", propOrder = {
    "genderIdentityReference"
})
public class PutGenderIdentityResponseType {

    @XmlElement(name = "Gender_Identity_Reference")
    protected GenderIdentityObjectType genderIdentityReference;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the genderIdentityReference property.
     * 
     * @return
     *     possible object is
     *     {@link GenderIdentityObjectType }
     *     
     */
    public GenderIdentityObjectType getGenderIdentityReference() {
        return genderIdentityReference;
    }

    /**
     * Sets the value of the genderIdentityReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderIdentityObjectType }
     *     
     */
    public void setGenderIdentityReference(GenderIdentityObjectType value) {
        this.genderIdentityReference = value;
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
