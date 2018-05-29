
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Data for the Agenda Item
 * 
 * <p>Java class for Committee_Meeting_Agenda_Item_Data_SubeditType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Committee_Meeting_Agenda_Item_Data_SubeditType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Agenda_Item_Reference" type="{urn:com.workday/bsvc}Committee_Meeting_Agenda_ItemObjectType" minOccurs="0"/>
 *         &lt;element name="Agenda_Item_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Agenda_Item_Number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Agenda_Item_Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Committee_Meeting_Agenda_Item_Type_Reference" type="{urn:com.workday/bsvc}Committee_Meeting_Agenda_Item_TypeObjectType"/>
 *         &lt;element name="Agenda_Item_Presenter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Agenda_Item_Details" type="{urn:com.workday/bsvc}RichText" minOccurs="0"/>
 *         &lt;element name="Related_Academic_Appointment_Event_Reference" type="{urn:com.workday/bsvc}Unique_IdentifierObjectType" minOccurs="0"/>
 *         &lt;element name="Agenda_Item_Minutes_Data" type="{urn:com.workday/bsvc}Committee_Meeting_Minutes_SubDataType" minOccurs="0"/>
 *         &lt;element name="Agenda_Item_Action_Item_Data" type="{urn:com.workday/bsvc}Committee_Meeting_Action_Item_Sub_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{urn:com.workday/bsvc}Committee_Meeting_Agenda_Item_AttachmentsType" minOccurs="0"/>
 *         &lt;element name="Committee_Meeting_Agenda_Item_Vote" type="{urn:com.workday/bsvc}Committee_Meeting_Agenda_Item_Vote_Data_SubeditType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Committee_Meeting_Agenda_Item_Data_SubeditType", propOrder = {
    "agendaItemReference",
    "agendaItemID",
    "agendaItemNumber",
    "agendaItemDescription",
    "committeeMeetingAgendaItemTypeReference",
    "agendaItemPresenter",
    "agendaItemDetails",
    "relatedAcademicAppointmentEventReference",
    "agendaItemMinutesData",
    "agendaItemActionItemData",
    "attachments",
    "committeeMeetingAgendaItemVote"
})
public class CommitteeMeetingAgendaItemDataSubeditType {

    @XmlElement(name = "Agenda_Item_Reference")
    protected CommitteeMeetingAgendaItemObjectType agendaItemReference;
    @XmlElement(name = "Agenda_Item_ID")
    protected String agendaItemID;
    @XmlElement(name = "Agenda_Item_Number", required = true)
    protected String agendaItemNumber;
    @XmlElement(name = "Agenda_Item_Description", required = true)
    protected String agendaItemDescription;
    @XmlElement(name = "Committee_Meeting_Agenda_Item_Type_Reference", required = true)
    protected CommitteeMeetingAgendaItemTypeObjectType committeeMeetingAgendaItemTypeReference;
    @XmlElement(name = "Agenda_Item_Presenter")
    protected String agendaItemPresenter;
    @XmlElement(name = "Agenda_Item_Details")
    protected String agendaItemDetails;
    @XmlElement(name = "Related_Academic_Appointment_Event_Reference")
    protected UniqueIdentifierObjectType relatedAcademicAppointmentEventReference;
    @XmlElement(name = "Agenda_Item_Minutes_Data")
    protected CommitteeMeetingMinutesSubDataType agendaItemMinutesData;
    @XmlElement(name = "Agenda_Item_Action_Item_Data")
    protected List<CommitteeMeetingActionItemSubDataType> agendaItemActionItemData;
    @XmlElement(name = "Attachments")
    protected CommitteeMeetingAgendaItemAttachmentsType attachments;
    @XmlElement(name = "Committee_Meeting_Agenda_Item_Vote")
    protected List<CommitteeMeetingAgendaItemVoteDataSubeditType> committeeMeetingAgendaItemVote;
    @XmlAttribute(name = "Delete_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean deleteOnly;
    @XmlAttribute(name = "Add_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean addOnly;

    /**
     * Gets the value of the agendaItemReference property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeMeetingAgendaItemObjectType }
     *     
     */
    public CommitteeMeetingAgendaItemObjectType getAgendaItemReference() {
        return agendaItemReference;
    }

    /**
     * Sets the value of the agendaItemReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeMeetingAgendaItemObjectType }
     *     
     */
    public void setAgendaItemReference(CommitteeMeetingAgendaItemObjectType value) {
        this.agendaItemReference = value;
    }

    /**
     * Gets the value of the agendaItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgendaItemID() {
        return agendaItemID;
    }

    /**
     * Sets the value of the agendaItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgendaItemID(String value) {
        this.agendaItemID = value;
    }

    /**
     * Gets the value of the agendaItemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgendaItemNumber() {
        return agendaItemNumber;
    }

    /**
     * Sets the value of the agendaItemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgendaItemNumber(String value) {
        this.agendaItemNumber = value;
    }

    /**
     * Gets the value of the agendaItemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgendaItemDescription() {
        return agendaItemDescription;
    }

    /**
     * Sets the value of the agendaItemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgendaItemDescription(String value) {
        this.agendaItemDescription = value;
    }

    /**
     * Gets the value of the committeeMeetingAgendaItemTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeMeetingAgendaItemTypeObjectType }
     *     
     */
    public CommitteeMeetingAgendaItemTypeObjectType getCommitteeMeetingAgendaItemTypeReference() {
        return committeeMeetingAgendaItemTypeReference;
    }

    /**
     * Sets the value of the committeeMeetingAgendaItemTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeMeetingAgendaItemTypeObjectType }
     *     
     */
    public void setCommitteeMeetingAgendaItemTypeReference(CommitteeMeetingAgendaItemTypeObjectType value) {
        this.committeeMeetingAgendaItemTypeReference = value;
    }

    /**
     * Gets the value of the agendaItemPresenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgendaItemPresenter() {
        return agendaItemPresenter;
    }

    /**
     * Sets the value of the agendaItemPresenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgendaItemPresenter(String value) {
        this.agendaItemPresenter = value;
    }

    /**
     * Gets the value of the agendaItemDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgendaItemDetails() {
        return agendaItemDetails;
    }

    /**
     * Sets the value of the agendaItemDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgendaItemDetails(String value) {
        this.agendaItemDetails = value;
    }

    /**
     * Gets the value of the relatedAcademicAppointmentEventReference property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public UniqueIdentifierObjectType getRelatedAcademicAppointmentEventReference() {
        return relatedAcademicAppointmentEventReference;
    }

    /**
     * Sets the value of the relatedAcademicAppointmentEventReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public void setRelatedAcademicAppointmentEventReference(UniqueIdentifierObjectType value) {
        this.relatedAcademicAppointmentEventReference = value;
    }

    /**
     * Gets the value of the agendaItemMinutesData property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeMeetingMinutesSubDataType }
     *     
     */
    public CommitteeMeetingMinutesSubDataType getAgendaItemMinutesData() {
        return agendaItemMinutesData;
    }

    /**
     * Sets the value of the agendaItemMinutesData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeMeetingMinutesSubDataType }
     *     
     */
    public void setAgendaItemMinutesData(CommitteeMeetingMinutesSubDataType value) {
        this.agendaItemMinutesData = value;
    }

    /**
     * Gets the value of the agendaItemActionItemData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agendaItemActionItemData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgendaItemActionItemData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommitteeMeetingActionItemSubDataType }
     * 
     * 
     */
    public List<CommitteeMeetingActionItemSubDataType> getAgendaItemActionItemData() {
        if (agendaItemActionItemData == null) {
            agendaItemActionItemData = new ArrayList<CommitteeMeetingActionItemSubDataType>();
        }
        return this.agendaItemActionItemData;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeMeetingAgendaItemAttachmentsType }
     *     
     */
    public CommitteeMeetingAgendaItemAttachmentsType getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeMeetingAgendaItemAttachmentsType }
     *     
     */
    public void setAttachments(CommitteeMeetingAgendaItemAttachmentsType value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the committeeMeetingAgendaItemVote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the committeeMeetingAgendaItemVote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommitteeMeetingAgendaItemVote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommitteeMeetingAgendaItemVoteDataSubeditType }
     * 
     * 
     */
    public List<CommitteeMeetingAgendaItemVoteDataSubeditType> getCommitteeMeetingAgendaItemVote() {
        if (committeeMeetingAgendaItemVote == null) {
            committeeMeetingAgendaItemVote = new ArrayList<CommitteeMeetingAgendaItemVoteDataSubeditType>();
        }
        return this.committeeMeetingAgendaItemVote;
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
