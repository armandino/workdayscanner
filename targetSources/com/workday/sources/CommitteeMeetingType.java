
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Committee Meeting Element
 * 
 * <p>Java class for Committee_MeetingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Committee_MeetingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Committee_Meeting_Reference" type="{urn:com.workday/bsvc}Committee_MeetingObjectType" minOccurs="0"/>
 *         &lt;element name="Committee_Meeting_Data" type="{urn:com.workday/bsvc}Committee_Meeting_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Committee_MeetingType", propOrder = {
    "committeeMeetingReference",
    "committeeMeetingData"
})
public class CommitteeMeetingType {

    @XmlElement(name = "Committee_Meeting_Reference")
    protected CommitteeMeetingObjectType committeeMeetingReference;
    @XmlElement(name = "Committee_Meeting_Data")
    protected CommitteeMeetingDataType committeeMeetingData;

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
     * Gets the value of the committeeMeetingData property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeMeetingDataType }
     *     
     */
    public CommitteeMeetingDataType getCommitteeMeetingData() {
        return committeeMeetingData;
    }

    /**
     * Sets the value of the committeeMeetingData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeMeetingDataType }
     *     
     */
    public void setCommitteeMeetingData(CommitteeMeetingDataType value) {
        this.committeeMeetingData = value;
    }

}
