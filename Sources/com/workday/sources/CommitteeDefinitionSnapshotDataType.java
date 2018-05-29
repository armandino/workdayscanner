
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Wrapper element for the Committee Definition Snapshot.
 * 
 * <p>Java class for Committee_Definition_Snapshot_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Committee_Definition_Snapshot_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Effective_Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Committee_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Committee_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sponsoring_Organization_Reference" type="{urn:com.workday/bsvc}Committee_Sponsoring_OrganizationObjectType"/>
 *         &lt;element name="Job_Requisition_Reference" type="{urn:com.workday/bsvc}Job_RequisitionObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Superior_Committee_Reference" type="{urn:com.workday/bsvc}CommitteeObjectType" minOccurs="0"/>
 *         &lt;element name="Committee_Summary" type="{urn:com.workday/bsvc}RichText" minOccurs="0"/>
 *         &lt;element name="Committee_Purpose_-_Detailed" type="{urn:com.workday/bsvc}RichText" minOccurs="0"/>
 *         &lt;element name="Inactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Committee_Membership_Target_Data_Reference" type="{urn:com.workday/bsvc}Committee_Membership_Targets_Data_SubeditType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Committee_Definition_Snapshot_DataType", propOrder = {
    "effectiveDate",
    "committeeName",
    "committeeCode",
    "sponsoringOrganizationReference",
    "jobRequisitionReference",
    "superiorCommitteeReference",
    "committeeSummary",
    "committeePurposeDetailed",
    "inactive",
    "committeeMembershipTargetDataReference"
})
public class CommitteeDefinitionSnapshotDataType {

    @XmlElement(name = "Effective_Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "Committee_Name", required = true)
    protected String committeeName;
    @XmlElement(name = "Committee_Code")
    protected String committeeCode;
    @XmlElement(name = "Sponsoring_Organization_Reference", required = true)
    protected CommitteeSponsoringOrganizationObjectType sponsoringOrganizationReference;
    @XmlElement(name = "Job_Requisition_Reference")
    protected List<JobRequisitionObjectType> jobRequisitionReference;
    @XmlElement(name = "Superior_Committee_Reference")
    protected CommitteeObjectType superiorCommitteeReference;
    @XmlElement(name = "Committee_Summary")
    protected String committeeSummary;
    @XmlElement(name = "Committee_Purpose_-_Detailed")
    protected String committeePurposeDetailed;
    @XmlElement(name = "Inactive")
    protected Boolean inactive;
    @XmlElement(name = "Committee_Membership_Target_Data_Reference")
    protected List<CommitteeMembershipTargetsDataSubeditType> committeeMembershipTargetDataReference;

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
     * Gets the value of the committeeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommitteeName() {
        return committeeName;
    }

    /**
     * Sets the value of the committeeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommitteeName(String value) {
        this.committeeName = value;
    }

    /**
     * Gets the value of the committeeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommitteeCode() {
        return committeeCode;
    }

    /**
     * Sets the value of the committeeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommitteeCode(String value) {
        this.committeeCode = value;
    }

    /**
     * Gets the value of the sponsoringOrganizationReference property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeSponsoringOrganizationObjectType }
     *     
     */
    public CommitteeSponsoringOrganizationObjectType getSponsoringOrganizationReference() {
        return sponsoringOrganizationReference;
    }

    /**
     * Sets the value of the sponsoringOrganizationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeSponsoringOrganizationObjectType }
     *     
     */
    public void setSponsoringOrganizationReference(CommitteeSponsoringOrganizationObjectType value) {
        this.sponsoringOrganizationReference = value;
    }

    /**
     * Gets the value of the jobRequisitionReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobRequisitionReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobRequisitionReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobRequisitionObjectType }
     * 
     * 
     */
    public List<JobRequisitionObjectType> getJobRequisitionReference() {
        if (jobRequisitionReference == null) {
            jobRequisitionReference = new ArrayList<JobRequisitionObjectType>();
        }
        return this.jobRequisitionReference;
    }

    /**
     * Gets the value of the superiorCommitteeReference property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeObjectType }
     *     
     */
    public CommitteeObjectType getSuperiorCommitteeReference() {
        return superiorCommitteeReference;
    }

    /**
     * Sets the value of the superiorCommitteeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeObjectType }
     *     
     */
    public void setSuperiorCommitteeReference(CommitteeObjectType value) {
        this.superiorCommitteeReference = value;
    }

    /**
     * Gets the value of the committeeSummary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommitteeSummary() {
        return committeeSummary;
    }

    /**
     * Sets the value of the committeeSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommitteeSummary(String value) {
        this.committeeSummary = value;
    }

    /**
     * Gets the value of the committeePurposeDetailed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommitteePurposeDetailed() {
        return committeePurposeDetailed;
    }

    /**
     * Sets the value of the committeePurposeDetailed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommitteePurposeDetailed(String value) {
        this.committeePurposeDetailed = value;
    }

    /**
     * Gets the value of the inactive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInactive() {
        return inactive;
    }

    /**
     * Sets the value of the inactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInactive(Boolean value) {
        this.inactive = value;
    }

    /**
     * Gets the value of the committeeMembershipTargetDataReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the committeeMembershipTargetDataReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommitteeMembershipTargetDataReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommitteeMembershipTargetsDataSubeditType }
     * 
     * 
     */
    public List<CommitteeMembershipTargetsDataSubeditType> getCommitteeMembershipTargetDataReference() {
        if (committeeMembershipTargetDataReference == null) {
            committeeMembershipTargetDataReference = new ArrayList<CommitteeMembershipTargetsDataSubeditType>();
        }
        return this.committeeMembershipTargetDataReference;
    }

}
