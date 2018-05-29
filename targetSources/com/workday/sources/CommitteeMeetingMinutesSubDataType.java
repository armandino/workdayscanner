
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Data element for everything about Minutes
 * 
 * <p>Java class for Committee_Meeting_Minutes_SubDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Committee_Meeting_Minutes_SubDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Minutes_Reference" type="{urn:com.workday/bsvc}Committee_Meeting_MinutesObjectType" minOccurs="0"/>
 *         &lt;element name="Details" type="{urn:com.workday/bsvc}RichText" minOccurs="0"/>
 *         &lt;element name="Committee_Meeting_Minutes_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Committee_Meeting_Minutes_SubDataType", propOrder = {
    "minutesReference",
    "details",
    "committeeMeetingMinutesID"
})
public class CommitteeMeetingMinutesSubDataType {

    @XmlElement(name = "Minutes_Reference")
    protected CommitteeMeetingMinutesObjectType minutesReference;
    @XmlElement(name = "Details")
    protected String details;
    @XmlElement(name = "Committee_Meeting_Minutes_ID")
    protected String committeeMeetingMinutesID;

    /**
     * Gets the value of the minutesReference property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeMeetingMinutesObjectType }
     *     
     */
    public CommitteeMeetingMinutesObjectType getMinutesReference() {
        return minutesReference;
    }

    /**
     * Sets the value of the minutesReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeMeetingMinutesObjectType }
     *     
     */
    public void setMinutesReference(CommitteeMeetingMinutesObjectType value) {
        this.minutesReference = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetails(String value) {
        this.details = value;
    }

    /**
     * Gets the value of the committeeMeetingMinutesID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommitteeMeetingMinutesID() {
        return committeeMeetingMinutesID;
    }

    /**
     * Sets the value of the committeeMeetingMinutesID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommitteeMeetingMinutesID(String value) {
        this.committeeMeetingMinutesID = value;
    }

}
