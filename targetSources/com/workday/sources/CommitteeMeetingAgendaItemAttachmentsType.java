
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Holds Agenda Item Attachment Data
 * 
 * <p>Java class for Committee_Meeting_Agenda_Item_AttachmentsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Committee_Meeting_Agenda_Item_AttachmentsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Committee_Meeting_Agenda_Item_Attachment_Data" type="{urn:com.workday/bsvc}Committee_Meeting_Agenda_Item_Attachment_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Committee_Meeting_Agenda_Item_AttachmentsType", propOrder = {
    "committeeMeetingAgendaItemAttachmentData"
})
public class CommitteeMeetingAgendaItemAttachmentsType {

    @XmlElement(name = "Committee_Meeting_Agenda_Item_Attachment_Data")
    protected List<CommitteeMeetingAgendaItemAttachmentDataType> committeeMeetingAgendaItemAttachmentData;

    /**
     * Gets the value of the committeeMeetingAgendaItemAttachmentData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the committeeMeetingAgendaItemAttachmentData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommitteeMeetingAgendaItemAttachmentData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommitteeMeetingAgendaItemAttachmentDataType }
     * 
     * 
     */
    public List<CommitteeMeetingAgendaItemAttachmentDataType> getCommitteeMeetingAgendaItemAttachmentData() {
        if (committeeMeetingAgendaItemAttachmentData == null) {
            committeeMeetingAgendaItemAttachmentData = new ArrayList<CommitteeMeetingAgendaItemAttachmentDataType>();
        }
        return this.committeeMeetingAgendaItemAttachmentData;
    }

}
