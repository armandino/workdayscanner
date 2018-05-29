
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The response to the pronoun put request.
 * 
 * <p>Java class for Put_Pronoun_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Pronoun_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pronoun_Reference" type="{urn:com.workday/bsvc}PronounObjectType" minOccurs="0"/>
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
@XmlType(name = "Put_Pronoun_ResponseType", propOrder = {
    "pronounReference"
})
public class PutPronounResponseType {

    @XmlElement(name = "Pronoun_Reference")
    protected PronounObjectType pronounReference;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the pronounReference property.
     * 
     * @return
     *     possible object is
     *     {@link PronounObjectType }
     *     
     */
    public PronounObjectType getPronounReference() {
        return pronounReference;
    }

    /**
     * Sets the value of the pronounReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PronounObjectType }
     *     
     */
    public void setPronounReference(PronounObjectType value) {
        this.pronounReference = value;
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
