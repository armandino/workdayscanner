
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response element containing an instances of committee member type and their associated data
 * 
 * <p>Java class for Committee_Membership_Type_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Committee_Membership_Type_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Committee_Membership_Type" type="{urn:com.workday/bsvc}Committee_Membership_TypeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Committee_Membership_Type_Response_DataType", propOrder = {
    "committeeMembershipType"
})
public class CommitteeMembershipTypeResponseDataType {

    @XmlElement(name = "Committee_Membership_Type")
    protected List<CommitteeMembershipTypeType> committeeMembershipType;

    /**
     * Gets the value of the committeeMembershipType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the committeeMembershipType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommitteeMembershipType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommitteeMembershipTypeType }
     * 
     * 
     */
    public List<CommitteeMembershipTypeType> getCommitteeMembershipType() {
        if (committeeMembershipType == null) {
            committeeMembershipType = new ArrayList<CommitteeMembershipTypeType>();
        }
        return this.committeeMembershipType;
    }

}
