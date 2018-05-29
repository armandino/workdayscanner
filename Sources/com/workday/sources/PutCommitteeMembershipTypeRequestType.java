
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Put Committee Membership Type Request
 * 
 * <p>Java class for Put_Committee_Membership_Type_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Committee_Membership_Type_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Committee_Membership_Type_Reference" type="{urn:com.workday/bsvc}Committee_Membership_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Committee_Membership_Type_Data" type="{urn:com.workday/bsvc}Committee_Membership_Type_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Add_Only" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute ref="{urn:com.workday/bsvc}version"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Put_Committee_Membership_Type_RequestType", propOrder = {
    "committeeMembershipTypeReference",
    "committeeMembershipTypeData"
})
public class PutCommitteeMembershipTypeRequestType {

    @XmlElement(name = "Committee_Membership_Type_Reference")
    protected CommitteeMembershipTypeObjectType committeeMembershipTypeReference;
    @XmlElement(name = "Committee_Membership_Type_Data")
    protected CommitteeMembershipTypeDataType committeeMembershipTypeData;
    @XmlAttribute(name = "Add_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean addOnly;
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
     * Gets the value of the committeeMembershipTypeData property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeMembershipTypeDataType }
     *     
     */
    public CommitteeMembershipTypeDataType getCommitteeMembershipTypeData() {
        return committeeMembershipTypeData;
    }

    /**
     * Sets the value of the committeeMembershipTypeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeMembershipTypeDataType }
     *     
     */
    public void setCommitteeMembershipTypeData(CommitteeMembershipTypeDataType value) {
        this.committeeMembershipTypeData = value;
    }

    /**
     * Gets the value of the addOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddOnly() {
        return addOnly;
    }

    /**
     * Sets the value of the addOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddOnly(Boolean value) {
        this.addOnly = value;
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
