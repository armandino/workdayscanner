
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Action Item element for everything about Action Items for Committee Meetings
 * 
 * <p>Java class for Committee_Meeting_Action_Item_Sub_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Committee_Meeting_Action_Item_Sub_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Action_Item_Reference" type="{urn:com.workday/bsvc}Committee_Meeting_Action_ItemObjectType" minOccurs="0"/>
 *         &lt;element name="Action_Item_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Item" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Assignee_Reference" type="{urn:com.workday/bsvc}Committee_Member_EnabledObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Details" type="{urn:com.workday/bsvc}RichText" minOccurs="0"/>
 *         &lt;element name="Complete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Delete" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Add_Only" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Committee_Meeting_Action_Item_Sub_DataType", propOrder = {
    "actionItemReference",
    "actionItemID",
    "item",
    "assigneeReference",
    "details",
    "complete"
})
public class CommitteeMeetingActionItemSubDataType {

    @XmlElement(name = "Action_Item_Reference")
    protected CommitteeMeetingActionItemObjectType actionItemReference;
    @XmlElement(name = "Action_Item_ID")
    protected String actionItemID;
    @XmlElement(name = "Item", required = true)
    protected String item;
    @XmlElement(name = "Assignee_Reference")
    protected List<CommitteeMemberEnabledObjectType> assigneeReference;
    @XmlElement(name = "Details")
    protected String details;
    @XmlElement(name = "Complete")
    protected Boolean complete;
    @XmlAttribute(name = "Delete", namespace = "urn:com.workday/bsvc")
    protected Boolean delete;
    @XmlAttribute(name = "Add_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean addOnly;

    /**
     * Gets the value of the actionItemReference property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeMeetingActionItemObjectType }
     *     
     */
    public CommitteeMeetingActionItemObjectType getActionItemReference() {
        return actionItemReference;
    }

    /**
     * Sets the value of the actionItemReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeMeetingActionItemObjectType }
     *     
     */
    public void setActionItemReference(CommitteeMeetingActionItemObjectType value) {
        this.actionItemReference = value;
    }

    /**
     * Gets the value of the actionItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionItemID() {
        return actionItemID;
    }

    /**
     * Sets the value of the actionItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionItemID(String value) {
        this.actionItemID = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItem(String value) {
        this.item = value;
    }

    /**
     * Gets the value of the assigneeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assigneeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssigneeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommitteeMemberEnabledObjectType }
     * 
     * 
     */
    public List<CommitteeMemberEnabledObjectType> getAssigneeReference() {
        if (assigneeReference == null) {
            assigneeReference = new ArrayList<CommitteeMemberEnabledObjectType>();
        }
        return this.assigneeReference;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetails(String value) {
        this.details = value;
    }

    /**
     * Gets the value of the complete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComplete() {
        return complete;
    }

    /**
     * Sets the value of the complete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComplete(Boolean value) {
        this.complete = value;
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
