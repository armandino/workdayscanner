
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Put Committee Membership Type Response
 * 
 * <p>Java class for Put_Committee_Membership_Type_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Committee_Membership_Type_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Committee_Membership_Type_Reference" type="{urn:com.workday/bsvc}Committee_Membership_TypeObjectType" minOccurs="0"/>
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
@XmlType(name = "Put_Committee_Membership_Type_ResponseType", propOrder = {
    "committeeMembershipTypeReference"
})
public class PutCommitteeMembershipTypeResponseType {

    @XmlElement(name = "Committee_Membership_Type_Reference")
    protected CommitteeMembershipTypeObjectType committeeMembershipTypeReference;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the committeeMembershipTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeMembershipTypeObjectType }
     *     
     */
    public CommitteeMembershipTypeObjectType getCommitteeMembershipTypeReference() {
        return committeeMembershipTypeReference;
    }

    /**
     * Sets the value of the committeeMembershipTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeMembershipTypeObjectType }
     *     
     */
    public void setCommitteeMembershipTypeReference(CommitteeMembershipTypeObjectType value) {
        this.committeeMembershipTypeReference = value;
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
