
package com.workday.sources;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Container for Membership Targets
 * 
 * <p>Java class for Committee_Membership_Targets_Data_SubeditType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Committee_Membership_Targets_Data_SubeditType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Committee_Membership_Target_Reference" type="{urn:com.workday/bsvc}Committee_Membership_TargetObjectType" minOccurs="0"/>
 *         &lt;element name="Committee_Membership_Type_Reference" type="{urn:com.workday/bsvc}Committee_Membership_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Target_Quantity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="12"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Unlimited_Quantity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Delete_Only" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Add_Only" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Committee_Membership_Targets_Data_SubeditType", propOrder = {
    "committeeMembershipTargetReference",
    "committeeMembershipTypeReference",
    "targetQuantity",
    "unlimitedQuantity"
})
public class CommitteeMembershipTargetsDataSubeditType {

    @XmlElement(name = "Committee_Membership_Target_Reference")
    protected CommitteeMembershipTargetObjectType committeeMembershipTargetReference;
    @XmlElement(name = "Committee_Membership_Type_Reference")
    protected CommitteeMembershipTypeObjectType committeeMembershipTypeReference;
    @XmlElement(name = "Target_Quantity")
    protected BigDecimal targetQuantity;
    @XmlElement(name = "Unlimited_Quantity")
    protected Boolean unlimitedQuantity;
    @XmlAttribute(name = "Delete_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean deleteOnly;
    @XmlAttribute(name = "Add_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean addOnly;

    /**
     * Gets the value of the committeeMembershipTargetReference property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeMembershipTargetObjectType }
     *     
     */
    public CommitteeMembershipTargetObjectType getCommitteeMembershipTargetReference() {
        return committeeMembershipTargetReference;
    }

    /**
     * Sets the value of the committeeMembershipTargetReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeMembershipTargetObjectType }
     *     
     */
    public void setCommitteeMembershipTargetReference(CommitteeMembershipTargetObjectType value) {
        this.committeeMembershipTargetReference = value;
    }

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
     * Gets the value of the targetQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTargetQuantity() {
        return targetQuantity;
    }

    /**
     * Sets the value of the targetQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTargetQuantity(BigDecimal value) {
        this.targetQuantity = value;
    }

    /**
     * Gets the value of the unlimitedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnlimitedQuantity() {
        return unlimitedQuantity;
    }

    /**
     * Sets the value of the unlimitedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnlimitedQuantity(Boolean value) {
        this.unlimitedQuantity = value;
    }

    /**
     * Gets the value of the deleteOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeleteOnly() {
        return deleteOnly;
    }

    /**
     * Sets the value of the deleteOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeleteOnly(Boolean value) {
        this.deleteOnly = value;
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

}
