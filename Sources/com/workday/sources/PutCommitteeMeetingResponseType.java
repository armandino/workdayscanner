
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response data for put committee meeting request
 * 
 * <p>Java class for Put_Committee_Meeting_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Committee_Meeting_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Committee_Meeting_Reference" type="{urn:com.workday/bsvc}Committee_MeetingObjectType" minOccurs="0"/>
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
@XmlType(name = "Put_Committee_Meeting_ResponseType", propOrder = {
    "committeeMeetingReference"
})
public class PutCommitteeMeetingResponseType {

    @XmlElement(name = "Committee_Meeting_Reference")
    protected CommitteeMeetingObjectType committeeMeetingReference;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the committeeMeetingReference property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeMeetingObjectType }
     *     
     */
    public CommitteeMeetingObjectType getCommitteeMeetingReference() {
        return committeeMeetingReference;
    }

    /**
     * Sets the value of the committeeMeetingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeMeetingObjectType }
     *     
     */
    public void setCommitteeMeetingReference(CommitteeMeetingObjectType value) {
        this.committeeMeetingReference = value;
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
