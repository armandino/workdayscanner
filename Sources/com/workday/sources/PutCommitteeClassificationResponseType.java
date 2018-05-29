
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Put Committee Classification Response
 * 
 * <p>Java class for Put_Committee_Classification_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Committee_Classification_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Committee_Classification_Reference" type="{urn:com.workday/bsvc}Committee_ClassificationObjectType" minOccurs="0"/>
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
@XmlType(name = "Put_Committee_Classification_ResponseType", propOrder = {
    "committeeClassificationReference"
})
public class PutCommitteeClassificationResponseType {

    @XmlElement(name = "Committee_Classification_Reference")
    protected CommitteeClassificationObjectType committeeClassificationReference;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the committeeClassificationReference property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeClassificationObjectType }
     *     
     */
    public CommitteeClassificationObjectType getCommitteeClassificationReference() {
        return committeeClassificationReference;
    }

    /**
     * Sets the value of the committeeClassificationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeClassificationObjectType }
     *     
     */
    public void setCommitteeClassificationReference(CommitteeClassificationObjectType value) {
        this.committeeClassificationReference = value;
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
