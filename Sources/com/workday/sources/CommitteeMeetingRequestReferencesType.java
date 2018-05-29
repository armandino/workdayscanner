
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference Element for Committee Meeting
 * 
 * <p>Java class for Committee_Meeting_Request_ReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Committee_Meeting_Request_ReferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Committee_Meeting_Reference" type="{urn:com.workday/bsvc}Committee_MeetingObjectType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Committee_Meeting_Request_ReferencesType", propOrder = {
    "committeeMeetingReference"
})
public class CommitteeMeetingRequestReferencesType {

    @XmlElement(name = "Committee_Meeting_Reference", required = true)
    protected List<CommitteeMeetingObjectType> committeeMeetingReference;

    /**
     * Gets the value of the committeeMeetingReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the committeeMeetingReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommitteeMeetingReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommitteeMeetingObjectType }
     * 
     * 
     */
    public List<CommitteeMeetingObjectType> getCommitteeMeetingReference() {
        if (committeeMeetingReference == null) {
            committeeMeetingReference = new ArrayList<CommitteeMeetingObjectType>();
        }
        return this.committeeMeetingReference;
    }

}
