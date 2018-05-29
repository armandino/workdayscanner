
package com.workday.sources;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Data for Committee Meeting Vote Record
 * 
 * <p>Java class for Committee_Meeting_Vote_Record_Data_SubeditType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Committee_Meeting_Vote_Record_Data_SubeditType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Agenda_Item_Vote_Record_Reference" type="{urn:com.workday/bsvc}Committee_Meeting_Vote_RecordObjectType" minOccurs="0"/>
 *         &lt;element name="Vote_Status_Reference" type="{urn:com.workday/bsvc}Committee_Meeting_Vote_StatusObjectType" minOccurs="0"/>
 *         &lt;element name="Vote_Count" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="12"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Add_Only" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Delete" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Committee_Meeting_Vote_Record_Data_SubeditType", propOrder = {
    "agendaItemVoteRecordReference",
    "voteStatusReference",
    "voteCount"
})
public class CommitteeMeetingVoteRecordDataSubeditType {

    @XmlElement(name = "Agenda_Item_Vote_Record_Reference")
    protected CommitteeMeetingVoteRecordObjectType agendaItemVoteRecordReference;
    @XmlElement(name = "Vote_Status_Reference")
    protected CommitteeMeetingVoteStatusObjectType voteStatusReference;
    @XmlElement(name = "Vote_Count")
    protected BigDecimal voteCount;
    @XmlAttribute(name = "Add_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean addOnly;
    @XmlAttribute(name = "Delete", namespace = "urn:com.workday/bsvc")
    protected Boolean delete;

    /**
     * Gets the value of the agendaItemVoteRecordReference property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeMeetingVoteRecordObjectType }
     *     
     */
    public CommitteeMeetingVoteRecordObjectType getAgendaItemVoteRecordReference() {
        return agendaItemVoteRecordReference;
    }

    /**
     * Sets the value of the agendaItemVoteRecordReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeMeetingVoteRecordObjectType }
     *     
     */
    public void setAgendaItemVoteRecordReference(CommitteeMeetingVoteRecordObjectType value) {
        this.agendaItemVoteRecordReference = value;
    }

    /**
     * Gets the value of the voteStatusReference property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeMeetingVoteStatusObjectType }
     *     
     */
    public CommitteeMeetingVoteStatusObjectType getVoteStatusReference() {
        return voteStatusReference;
    }

    /**
     * Sets the value of the voteStatusReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeMeetingVoteStatusObjectType }
     *     
     */
    public void setVoteStatusReference(CommitteeMeetingVoteStatusObjectType value) {
        this.voteStatusReference = value;
    }

    /**
     * Gets the value of the voteCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVoteCount() {
        return voteCount;
    }

    /**
     * Sets the value of the voteCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVoteCount(BigDecimal value) {
        this.voteCount = value;
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
     * Gets the value of the delete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelete() {
        return delete;
    }

    /**
     * Sets the value of the delete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelete(Boolean value) {
        this.delete = value;
    }

}
