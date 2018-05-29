
package com.workday.sources;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Data about the Committee Meeting
 * 
 * <p>Java class for Committee_Meeting_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Committee_Meeting_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Committee_Meeting_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Committee_Reference" type="{urn:com.workday/bsvc}CommitteeObjectType"/>
 *         &lt;element name="Committee_Meeting_Status_Reference" type="{urn:com.workday/bsvc}Committee_Meeting_StatusObjectType"/>
 *         &lt;element name="Committee_Meeting_Host" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Committee_Meeting_Type_Reference" type="{urn:com.workday/bsvc}Committee_Meeting_TypeObjectType"/>
 *         &lt;element name="Committee_Meeting_Subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Committee_Meeting_Abstract" type="{urn:com.workday/bsvc}RichText" minOccurs="0"/>
 *         &lt;element name="Committee_Meeting_Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Committee_Meeting_Time" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="Committee_Meeting_Time_Zone_Reference" type="{urn:com.workday/bsvc}Time_ZoneObjectType"/>
 *         &lt;element name="Duration_in_Hours">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Committee_Meeting_Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="Committee_Meeting_Invite_All_Members" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           &lt;element name="Committee_Member_Reference" type="{urn:com.workday/bsvc}Committee_Member_EnabledObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="Committee_Meeting_Attendee_Reference" type="{urn:com.workday/bsvc}Committee_Member_EnabledObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Committee_Meeting_Minutes_Data" type="{urn:com.workday/bsvc}Committee_Meeting_Minutes_SubDataType" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{urn:com.workday/bsvc}Committee_Meeting_AttachmentsType" minOccurs="0"/>
 *         &lt;element name="Committee_Meeting_Action_Item_Data" type="{urn:com.workday/bsvc}Committee_Meeting_Action_Item_Sub_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Committee_Meeting_Agenda_Item_Data" type="{urn:com.workday/bsvc}Committee_Meeting_Agenda_Item_Data_SubeditType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Committee_Meeting_DataType", propOrder = {
    "committeeMeetingID",
    "committeeReference",
    "committeeMeetingStatusReference",
    "committeeMeetingHost",
    "committeeMeetingTypeReference",
    "committeeMeetingSubject",
    "committeeMeetingAbstract",
    "committeeMeetingDate",
    "committeeMeetingTime",
    "committeeMeetingTimeZoneReference",
    "durationInHours",
    "committeeMeetingLocation",
    "committeeMeetingInviteAllMembers",
    "committeeMemberReference",
    "committeeMeetingAttendeeReference",
    "committeeMeetingMinutesData",
    "attachments",
    "committeeMeetingActionItemData",
    "committeeMeetingAgendaItemData"
})
public class CommitteeMeetingDataType {

    @XmlElement(name = "Committee_Meeting_ID")
    protected String committeeMeetingID;
    @XmlElement(name = "Committee_Reference", required = true)
    protected CommitteeObjectType committeeReference;
    @XmlElement(name = "Committee_Meeting_Status_Reference", required = true)
    protected CommitteeMeetingStatusObjectType committeeMeetingStatusReference;
    @XmlElement(name = "Committee_Meeting_Host")
    protected String committeeMeetingHost;
    @XmlElement(name = "Committee_Meeting_Type_Reference", required = true)
    protected CommitteeMeetingTypeObjectType committeeMeetingTypeReference;
    @XmlElement(name = "Committee_Meeting_Subject", required = true)
    protected String committeeMeetingSubject;
    @XmlElement(name = "Committee_Meeting_Abstract")
    protected String committeeMeetingAbstract;
    @XmlElement(name = "Committee_Meeting_Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar committeeMeetingDate;
    @XmlElement(name = "Committee_Meeting_Time", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar committeeMeetingTime;
    @XmlElement(name = "Committee_Meeting_Time_Zone_Reference", required = true)
    protected TimeZoneObjectType committeeMeetingTimeZoneReference;
    @XmlElement(name = "Duration_in_Hours", required = true)
    protected BigDecimal durationInHours;
    @XmlElement(name = "Committee_Meeting_Location")
    protected String committeeMeetingLocation;
    @XmlElement(name = "Committee_Meeting_Invite_All_Members")
    protected Boolean committeeMeetingInviteAllMembers;
    @XmlElement(name = "Committee_Member_Reference")
    protected List<CommitteeMemberEnabledObjectType> committeeMemberReference;
    @XmlElement(name = "Committee_Meeting_Attendee_Reference")
    protected List<CommitteeMemberEnabledObjectType> committeeMeetingAttendeeReference;
    @XmlElement(name = "Committee_Meeting_Minutes_Data")
    protected CommitteeMeetingMinutesSubDataType committeeMeetingMinutesData;
    @XmlElement(name = "Attachments")
    protected CommitteeMeetingAttachmentsType attachments;
    @XmlElement(name = "Committee_Meeting_Action_Item_Data")
    protected List<CommitteeMeetingActionItemSubDataType> committeeMeetingActionItemData;
    @XmlElement(name = "Committee_Meeting_Agenda_Item_Data")
    protected List<CommitteeMeetingAgendaItemDataSubeditType> committeeMeetingAgendaItemData;

    /**
     * Gets the value of the committeeMeetingID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommitteeMeetingID() {
        return committeeMeetingID;
    }

    /**
     * Sets the value of the committeeMeetingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommitteeMeetingID(String value) {
        this.committeeMeetingID = value;
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
     * Gets the value of the committeeMeetingStatusReference property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeMeetingStatusObjectType }
     *     
     */
    public CommitteeMeetingStatusObjectType getCommitteeMeetingStatusReference() {
        return committeeMeetingStatusReference;
    }

    /**
     * Sets the value of the committeeMeetingStatusReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeMeetingStatusObjectType }
     *     
     */
    public void setCommitteeMeetingStatusReference(CommitteeMeetingStatusObjectType value) {
        this.committeeMeetingStatusReference = value;
    }

    /**
     * Gets the value of the committeeMeetingHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommitteeMeetingHost() {
        return committeeMeetingHost;
    }

    /**
     * Sets the value of the committeeMeetingHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommitteeMeetingHost(String value) {
        this.committeeMeetingHost = value;
    }

    /**
     * Gets the value of the committeeMeetingTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeMeetingTypeObjectType }
     *     
     */
    public CommitteeMeetingTypeObjectType getCommitteeMeetingTypeReference() {
        return committeeMeetingTypeReference;
    }

    /**
     * Sets the value of the committeeMeetingTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeMeetingTypeObjectType }
     *     
     */
    public void setCommitteeMeetingTypeReference(CommitteeMeetingTypeObjectType value) {
        this.committeeMeetingTypeReference = value;
    }

    /**
     * Gets the value of the committeeMeetingSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommitteeMeetingSubject() {
        return committeeMeetingSubject;
    }

    /**
     * Sets the value of the committeeMeetingSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommitteeMeetingSubject(String value) {
        this.committeeMeetingSubject = value;
    }

    /**
     * Gets the value of the committeeMeetingAbstract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommitteeMeetingAbstract() {
        return committeeMeetingAbstract;
    }

    /**
     * Sets the value of the committeeMeetingAbstract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommitteeMeetingAbstract(String value) {
        this.committeeMeetingAbstract = value;
    }

    /**
     * Gets the value of the committeeMeetingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCommitteeMeetingDate() {
        return committeeMeetingDate;
    }

    /**
     * Sets the value of the committeeMeetingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCommitteeMeetingDate(XMLGregorianCalendar value) {
        this.committeeMeetingDate = value;
    }

    /**
     * Gets the value of the committeeMeetingTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCommitteeMeetingTime() {
        return committeeMeetingTime;
    }

    /**
     * Sets the value of the committeeMeetingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCommitteeMeetingTime(XMLGregorianCalendar value) {
        this.committeeMeetingTime = value;
    }

    /**
     * Gets the value of the committeeMeetingTimeZoneReference property.
     * 
     * @return
     *     possible object is
     *     {@link TimeZoneObjectType }
     *     
     */
    public TimeZoneObjectType getCommitteeMeetingTimeZoneReference() {
        return committeeMeetingTimeZoneReference;
    }

    /**
     * Sets the value of the committeeMeetingTimeZoneReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeZoneObjectType }
     *     
     */
    public void setCommitteeMeetingTimeZoneReference(TimeZoneObjectType value) {
        this.committeeMeetingTimeZoneReference = value;
    }

    /**
     * Gets the value of the durationInHours property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDurationInHours() {
        return durationInHours;
    }

    /**
     * Sets the value of the durationInHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDurationInHours(BigDecimal value) {
        this.durationInHours = value;
    }

    /**
     * Gets the value of the committeeMeetingLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommitteeMeetingLocation() {
        return committeeMeetingLocation;
    }

    /**
     * Sets the value of the committeeMeetingLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommitteeMeetingLocation(String value) {
        this.committeeMeetingLocation = value;
    }

    /**
     * Gets the value of the committeeMeetingInviteAllMembers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommitteeMeetingInviteAllMembers() {
        return committeeMeetingInviteAllMembers;
    }

    /**
     * Sets the value of the committeeMeetingInviteAllMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommitteeMeetingInviteAllMembers(Boolean value) {
        this.committeeMeetingInviteAllMembers = value;
    }

    /**
     * Gets the value of the committeeMemberReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the committeeMemberReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommitteeMemberReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommitteeMemberEnabledObjectType }
     * 
     * 
     */
    public List<CommitteeMemberEnabledObjectType> getCommitteeMemberReference() {
        if (committeeMemberReference == null) {
            committeeMemberReference = new ArrayList<CommitteeMemberEnabledObjectType>();
        }
        return this.committeeMemberReference;
    }

    /**
     * Gets the value of the committeeMeetingAttendeeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the committeeMeetingAttendeeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommitteeMeetingAttendeeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommitteeMemberEnabledObjectType }
     * 
     * 
     */
    public List<CommitteeMemberEnabledObjectType> getCommitteeMeetingAttendeeReference() {
        if (committeeMeetingAttendeeReference == null) {
            committeeMeetingAttendeeReference = new ArrayList<CommitteeMemberEnabledObjectType>();
        }
        return this.committeeMeetingAttendeeReference;
    }

    /**
     * Gets the value of the committeeMeetingMinutesData property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeMeetingMinutesSubDataType }
     *     
     */
    public CommitteeMeetingMinutesSubDataType getCommitteeMeetingMinutesData() {
        return committeeMeetingMinutesData;
    }

    /**
     * Sets the value of the committeeMeetingMinutesData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeMeetingMinutesSubDataType }
     *     
     */
    public void setCommitteeMeetingMinutesData(CommitteeMeetingMinutesSubDataType value) {
        this.committeeMeetingMinutesData = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeMeetingAttachmentsType }
     *     
     */
    public CommitteeMeetingAttachmentsType getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeMeetingAttachmentsType }
     *     
     */
    public void setAttachments(CommitteeMeetingAttachmentsType value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the committeeMeetingActionItemData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the committeeMeetingActionItemData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommitteeMeetingActionItemData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommitteeMeetingActionItemSubDataType }
     * 
     * 
     */
    public List<CommitteeMeetingActionItemSubDataType> getCommitteeMeetingActionItemData() {
        if (committeeMeetingActionItemData == null) {
            committeeMeetingActionItemData = new ArrayList<CommitteeMeetingActionItemSubDataType>();
        }
        return this.committeeMeetingActionItemData;
    }

    /**
     * Gets the value of the committeeMeetingAgendaItemData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the committeeMeetingAgendaItemData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommitteeMeetingAgendaItemData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommitteeMeetingAgendaItemDataSubeditType }
     * 
     * 
     */
    public List<CommitteeMeetingAgendaItemDataSubeditType> getCommitteeMeetingAgendaItemData() {
        if (committeeMeetingAgendaItemData == null) {
            committeeMeetingAgendaItemData = new ArrayList<CommitteeMeetingAgendaItemDataSubeditType>();
        }
        return this.committeeMeetingAgendaItemData;
    }

}
