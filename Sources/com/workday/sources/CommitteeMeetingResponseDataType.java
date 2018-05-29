
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response element for Get Committee Meetings
 * 
 * <p>Java class for Committee_Meeting_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Committee_Meeting_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Committee_Meeting" type="{urn:com.workday/bsvc}Committee_MeetingType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Committee_Meeting_Response_DataType", propOrder = {
    "committeeMeeting"
})
public class CommitteeMeetingResponseDataType {

    @XmlElement(name = "Committee_Meeting")
    protected List<CommitteeMeetingType> committeeMeeting;

    /**
     * Gets the value of the committeeMeeting property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the committeeMeeting property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommitteeMeeting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommitteeMeetingType }
     * 
     * 
     */
    public List<CommitteeMeetingType> getCommitteeMeeting() {
        if (committeeMeeting == null) {
            committeeMeeting = new ArrayList<CommitteeMeetingType>();
        }
        return this.committeeMeeting;
    }

}
