
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the data for a Committee Membership Type
 * 
 * <p>Java class for Committee_Membership_TypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Committee_Membership_TypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Committee_Membership_Type_Reference" type="{urn:com.workday/bsvc}Committee_Membership_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Committee_Membership_Type_Data" type="{urn:com.workday/bsvc}Committee_Membership_Type_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Committee_Membership_TypeType", propOrder = {
    "committeeMembershipTypeReference",
    "committeeMembershipTypeData"
})
public class CommitteeMembershipTypeType {

    @XmlElement(name = "Committee_Membership_Type_Reference")
    protected CommitteeMembershipTypeObjectType committeeMembershipTypeReference;
    @XmlElement(name = "Committee_Membership_Type_Data")
    protected List<CommitteeMembershipTypeDataType> committeeMembershipTypeData;

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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the committeeMembershipTypeData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommitteeMembershipTypeData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommitteeMembershipTypeDataType }
     * 
     * 
     */
    public List<CommitteeMembershipTypeDataType> getCommitteeMembershipTypeData() {
        if (committeeMembershipTypeData == null) {
            committeeMembershipTypeData = new ArrayList<CommitteeMembershipTypeDataType>();
        }
        return this.committeeMembershipTypeData;
    }

}
