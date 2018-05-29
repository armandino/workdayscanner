
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Maintain Committee Definition Response
 * 
 * <p>Java class for Maintain_Committee_Definition_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Maintain_Committee_Definition_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Committee_Definition_Reference" type="{urn:com.workday/bsvc}CommitteeObjectType" minOccurs="0"/>
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
@XmlType(name = "Maintain_Committee_Definition_ResponseType", propOrder = {
    "committeeDefinitionReference"
})
public class MaintainCommitteeDefinitionResponseType {

    @XmlElement(name = "Committee_Definition_Reference")
    protected CommitteeObjectType committeeDefinitionReference;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the committeeDefinitionReference property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeObjectType }
     *     
     */
    public CommitteeObjectType getCommitteeDefinitionReference() {
        return committeeDefinitionReference;
    }

    /**
     * Sets the value of the committeeDefinitionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeObjectType }
     *     
     */
    public void setCommitteeDefinitionReference(CommitteeObjectType value) {
        this.committeeDefinitionReference = value;
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
