
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Manage Committee Membership Data, contains the data for the Manage Committee Membership event
 * 
 * <p>Java class for Manage_Committee_Membership_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Manage_Committee_Membership_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Create_External_Committee_Member_Data" type="{urn:com.workday/bsvc}Create_External_Committee_Member_DataType"/>
 *           &lt;element name="Committee_Member_Reference" type="{urn:com.workday/bsvc}Committee_Member_EnabledObjectType"/>
 *         &lt;/choice>
 *         &lt;element name="Effective_Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Reason_Reference" type="{urn:com.workday/bsvc}Event_Classification_SubcategoryObjectType"/>
 *         &lt;element name="Committee__Reference" type="{urn:com.workday/bsvc}CommitteeObjectType"/>
 *         &lt;element name="Committee_Membership_Type_Reference" type="{urn:com.workday/bsvc}Committee_Membership_TypeObjectType"/>
 *         &lt;element name="End_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Manage_Professional_Affiliation_Sub_Business_Process_for_External_Committee_Member" type="{urn:com.workday/bsvc}Manage_Professional_Affiliation_Sub_Business_Process_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Add_Only" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Manage_Committee_Membership_DataType", propOrder = {
    "createExternalCommitteeMemberData",
    "committeeMemberReference",
    "effectiveDate",
    "reasonReference",
    "committeeReference",
    "committeeMembershipTypeReference",
    "endDate",
    "manageProfessionalAffiliationSubBusinessProcessForExternalCommitteeMember"
})
public class ManageCommitteeMembershipDataType {

    @XmlElement(name = "Create_External_Committee_Member_Data")
    protected CreateExternalCommitteeMemberDataType createExternalCommitteeMemberData;
    @XmlElement(name = "Committee_Member_Reference")
    protected CommitteeMemberEnabledObjectType committeeMemberReference;
    @XmlElement(name = "Effective_Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "Reason_Reference", required = true)
    protected EventClassificationSubcategoryObjectType reasonReference;
    @XmlElement(name = "Committee__Reference", required = true)
    protected CommitteeObjectType committeeReference;
    @XmlElement(name = "Committee_Membership_Type_Reference", required = true)
    protected CommitteeMembershipTypeObjectType committeeMembershipTypeReference;
    @XmlElement(name = "End_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "Manage_Professional_Affiliation_Sub_Business_Process_for_External_Committee_Member")
    protected ManageProfessionalAffiliationSubBusinessProcessDataType manageProfessionalAffiliationSubBusinessProcessForExternalCommitteeMember;
    @XmlAttribute(name = "Add_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean addOnly;

    /**
     * Gets the value of the createExternalCommitteeMemberData property.
     * 
     * @return
     *     possible object is
     *     {@link CreateExternalCommitteeMemberDataType }
     *     
     */
    public CreateExternalCommitteeMemberDataType getCreateExternalCommitteeMemberData() {
        return createExternalCommitteeMemberData;
    }

    /**
     * Sets the value of the createExternalCommitteeMemberData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateExternalCommitteeMemberDataType }
     *     
     */
    public void setCreateExternalCommitteeMemberData(CreateExternalCommitteeMemberDataType value) {
        this.createExternalCommitteeMemberData = value;
    }

    /**
     * Gets the value of the committeeMemberReference property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeMemberEnabledObjectType }
     *     
     */
    public CommitteeMemberEnabledObjectType getCommitteeMemberReference() {
        return committeeMemberReference;
    }

    /**
     * Sets the value of the committeeMemberReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeMemberEnabledObjectType }
     *     
     */
    public void setCommitteeMemberReference(CommitteeMemberEnabledObjectType value) {
        this.committeeMemberReference = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the reasonReference property.
     * 
     * @return
     *     possible object is
     *     {@link EventClassificationSubcategoryObjectType }
     *     
     */
    public EventClassificationSubcategoryObjectType getReasonReference() {
        return reasonReference;
    }

    /**
     * Sets the value of the reasonReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventClassificationSubcategoryObjectType }
     *     
     */
    public void setReasonReference(EventClassificationSubcategoryObjectType value) {
        this.reasonReference = value;
    }

    /**
     * Gets the value of the committeeReference property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeObjectType }
     *     
     */
    public CommitteeObjectType getCommitteeReference() {
        return committeeReference;
    }

    /**
     * Sets the value of the committeeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeObjectType }
     *     
     */
    public void setCommitteeReference(CommitteeObjectType value) {
        this.committeeReference = value;
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
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the manageProfessionalAffiliationSubBusinessProcessForExternalCommitteeMember property.
     * 
     * @return
     *     possible object is
     *     {@link ManageProfessionalAffiliationSubBusinessProcessDataType }
     *     
     */
    public ManageProfessionalAffiliationSubBusinessProcessDataType getManageProfessionalAffiliationSubBusinessProcessForExternalCommitteeMember() {
        return manageProfessionalAffiliationSubBusinessProcessForExternalCommitteeMember;
    }

    /**
     * Sets the value of the manageProfessionalAffiliationSubBusinessProcessForExternalCommitteeMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManageProfessionalAffiliationSubBusinessProcessDataType }
     *     
     */
    public void setManageProfessionalAffiliationSubBusinessProcessForExternalCommitteeMember(ManageProfessionalAffiliationSubBusinessProcessDataType value) {
        this.manageProfessionalAffiliationSubBusinessProcessForExternalCommitteeMember = value;
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
