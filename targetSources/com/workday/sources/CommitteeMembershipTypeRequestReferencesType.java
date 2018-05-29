
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Utilize the Request References element to retrieve a specific instance(s) of a Committee Member Type and its associated data
 * 
 * <p>Java class for Committee_Membership_Type_Request_ReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Committee_Membership_Type_Request_ReferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Committee_Membership_Type_Reference" type="{urn:com.workday/bsvc}Committee_Membership_TypeObjectType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Committee_Membership_Type_Request_ReferencesType", propOrder = {
    "committeeMembershipTypeReference"
})
public class CommitteeMembershipTypeRequestReferencesType {

    @XmlElement(name = "Committee_Membership_Type_Reference", required = true)
    protected List<CommitteeMembershipTypeObjectType> committeeMembershipTypeReference;

    /**
     * Gets the value of the committeeMembershipTypeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the committeeMembershipTypeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommitteeMembershipTypeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommitteeMembershipTypeObjectType }
     * 
     * 
     */
    public List<CommitteeMembershipTypeObjectType> getCommitteeMembershipTypeReference() {
        if (committeeMembershipTypeReference == null) {
            committeeMembershipTypeReference = new ArrayList<CommitteeMembershipTypeObjectType>();
        }
        return this.committeeMembershipTypeReference;
    }

}
