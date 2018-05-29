
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Data for Committee Meeting Agenda Item
 * 
 * <p>Java class for Committee_Meeting_Agenda_Item_Vote_Data_SubeditType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Committee_Meeting_Agenda_Item_Vote_Data_SubeditType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Agenda_Item_Vote_Reference" type="{urn:com.workday/bsvc}Committee_Meeting_Agenda_Item_VoteObjectType" minOccurs="0"/>
 *         &lt;element name="Passing_Vote" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Committee_Meeting_Vote_Record_Data_Subedit" type="{urn:com.workday/bsvc}Committee_Meeting_Vote_Record_Data_SubeditType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Committee_Meeting_Agenda_Item_Vote_Data_SubeditType", propOrder = {
    "agendaItemVoteReference",
    "passingVote",
    "committeeMeetingVoteRecordDataSubedit"
})
public class CommitteeMeetingAgendaItemVoteDataSubeditType {

    @XmlElement(name = "Agenda_Item_Vote_Reference")
    protected CommitteeMeetingAgendaItemVoteObjectType agendaItemVoteReference;
    @XmlElement(name = "Passing_Vote")
    protected Boolean passingVote;
    @XmlElement(name = "Committee_Meeting_Vote_Record_Data_Subedit")
    protected List<CommitteeMeetingVoteRecordDataSubeditType> committeeMeetingVoteRecordDataSubedit;
    @XmlAttribute(name = "Add_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean addOnly;

    /**
     * Gets the value of the agendaItemVoteReference property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeMeetingAgendaItemVoteObjectType }
     *     
     */
    public CommitteeMeetingAgendaItemVoteObjectType getAgendaItemVoteReference() {
        return agendaItemVoteReference;
    }

    /**
     * Sets the value of the agendaItemVoteReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeMeetingAgendaItemVoteObjectType }
     *     
     */
    public void setAgendaItemVoteReference(CommitteeMeetingAgendaItemVoteObjectType value) {
        this.agendaItemVoteReference = value;
    }

    /**
     * Gets the value of the passingVote property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPassingVote() {
        return passingVote;
    }

    /**
     * Sets the value of the passingVote property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPassingVote(Boolean value) {
        this.passingVote = value;
    }

    /**
     * Gets the value of the committeeMeetingVoteRecordDataSubedit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the committeeMeetingVoteRecordDataSubedit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommitteeMeetingVoteRecordDataSubedit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommitteeMeetingVoteRecordDataSubeditType }
     * 
     * 
     */
    public List<CommitteeMeetingVoteRecordDataSubeditType> getCommitteeMeetingVoteRecordDataSubedit() {
        if (committeeMeetingVoteRecordDataSubedit == null) {
            committeeMeetingVoteRecordDataSubedit = new ArrayList<CommitteeMeetingVoteRecordDataSubeditType>();
        }
        return this.committeeMeetingVoteRecordDataSubedit;
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
