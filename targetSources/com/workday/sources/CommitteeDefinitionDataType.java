
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for the Maintain Committee Definition Task
 * 
 * <p>Java class for Committee_Definition_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Committee_Definition_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Private_Committee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Code_in_Name" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Committee_Type_Reference" type="{urn:com.workday/bsvc}Committee_TypeObjectType"/>
 *         &lt;element name="Include_Type_in_Name" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Committee_Subtype_Reference" type="{urn:com.workday/bsvc}Organization_SubtypeObjectType"/>
 *         &lt;element name="Include_Subtype_in_Name" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Committee_Classifications_Reference" type="{urn:com.workday/bsvc}Committee_ClassificationObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Publishable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="External_URL_Reference" type="{urn:com.workday/bsvc}External_URLObjectType" minOccurs="0"/>
 *         &lt;element name="Committee_Attachment_Data" type="{urn:com.workday/bsvc}Committee_Attachment_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Committee_Definition_Snapshot_Data" type="{urn:com.workday/bsvc}Committee_Definition_Snapshot_DataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Committee_Definition_DataType", propOrder = {
    "id",
    "privateCommittee",
    "includeCodeInName",
    "committeeTypeReference",
    "includeTypeInName",
    "committeeSubtypeReference",
    "includeSubtypeInName",
    "committeeClassificationsReference",
    "publishable",
    "externalURLReference",
    "committeeAttachmentData",
    "committeeDefinitionSnapshotData"
})
public class CommitteeDefinitionDataType {

    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "Private_Committee")
    protected Boolean privateCommittee;
    @XmlElement(name = "Include_Code_in_Name")
    protected Boolean includeCodeInName;
    @XmlElement(name = "Committee_Type_Reference", required = true)
    protected CommitteeTypeObjectType committeeTypeReference;
    @XmlElement(name = "Include_Type_in_Name")
    protected Boolean includeTypeInName;
    @XmlElement(name = "Committee_Subtype_Reference", required = true)
    protected OrganizationSubtypeObjectType committeeSubtypeReference;
    @XmlElement(name = "Include_Subtype_in_Name")
    protected Boolean includeSubtypeInName;
    @XmlElement(name = "Committee_Classifications_Reference")
    protected List<CommitteeClassificationObjectType> committeeClassificationsReference;
    @XmlElement(name = "Publishable")
    protected Boolean publishable;
    @XmlElement(name = "External_URL_Reference")
    protected ExternalURLObjectType externalURLReference;
    @XmlElement(name = "Committee_Attachment_Data")
    protected List<CommitteeAttachmentDataType> committeeAttachmentData;
    @XmlElement(name = "Committee_Definition_Snapshot_Data", required = true)
    protected CommitteeDefinitionSnapshotDataType committeeDefinitionSnapshotData;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the privateCommittee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrivateCommittee() {
        return privateCommittee;
    }

    /**
     * Sets the value of the privateCommittee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrivateCommittee(Boolean value) {
        this.privateCommittee = value;
    }

    /**
     * Gets the value of the includeCodeInName property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeCodeInName() {
        return includeCodeInName;
    }

    /**
     * Sets the value of the includeCodeInName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeCodeInName(Boolean value) {
        this.includeCodeInName = value;
    }

    /**
     * Gets the value of the committeeTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeTypeObjectType }
     *     
     */
    public CommitteeTypeObjectType getCommitteeTypeReference() {
        return committeeTypeReference;
    }

    /**
     * Sets the value of the committeeTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeTypeObjectType }
     *     
     */
    public void setCommitteeTypeReference(CommitteeTypeObjectType value) {
        this.committeeTypeReference = value;
    }

    /**
     * Gets the value of the includeTypeInName property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeTypeInName() {
        return includeTypeInName;
    }

    /**
     * Sets the value of the includeTypeInName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeTypeInName(Boolean value) {
        this.includeTypeInName = value;
    }

    /**
     * Gets the value of the committeeSubtypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationSubtypeObjectType }
     *     
     */
    public OrganizationSubtypeObjectType getCommitteeSubtypeReference() {
        return committeeSubtypeReference;
    }

    /**
     * Sets the value of the committeeSubtypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationSubtypeObjectType }
     *     
     */
    public void setCommitteeSubtypeReference(OrganizationSubtypeObjectType value) {
        this.committeeSubtypeReference = value;
    }

    /**
     * Gets the value of the includeSubtypeInName property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeSubtypeInName() {
        return includeSubtypeInName;
    }

    /**
     * Sets the value of the includeSubtypeInName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeSubtypeInName(Boolean value) {
        this.includeSubtypeInName = value;
    }

    /**
     * Gets the value of the committeeClassificationsReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the committeeClassificationsReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommitteeClassificationsReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommitteeClassificationObjectType }
     * 
     * 
     */
    public List<CommitteeClassificationObjectType> getCommitteeClassificationsReference() {
        if (committeeClassificationsReference == null) {
            committeeClassificationsReference = new ArrayList<CommitteeClassificationObjectType>();
        }
        return this.committeeClassificationsReference;
    }

    /**
     * Gets the value of the publishable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPublishable() {
        return publishable;
    }

    /**
     * Sets the value of the publishable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPublishable(Boolean value) {
        this.publishable = value;
    }

    /**
     * Gets the value of the externalURLReference property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalURLObjectType }
     *     
     */
    public ExternalURLObjectType getExternalURLReference() {
        return externalURLReference;
    }

    /**
     * Sets the value of the externalURLReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalURLObjectType }
     *     
     */
    public void setExternalURLReference(ExternalURLObjectType value) {
        this.externalURLReference = value;
    }

    /**
     * Gets the value of the committeeAttachmentData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the committeeAttachmentData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommitteeAttachmentData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommitteeAttachmentDataType }
     * 
     * 
     */
    public List<CommitteeAttachmentDataType> getCommitteeAttachmentData() {
        if (committeeAttachmentData == null) {
            committeeAttachmentData = new ArrayList<CommitteeAttachmentDataType>();
        }
        return this.committeeAttachmentData;
    }

    /**
     * Gets the value of the committeeDefinitionSnapshotData property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeDefinitionSnapshotDataType }
     *     
     */
    public CommitteeDefinitionSnapshotDataType getCommitteeDefinitionSnapshotData() {
        return committeeDefinitionSnapshotData;
    }

    /**
     * Sets the value of the committeeDefinitionSnapshotData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeDefinitionSnapshotDataType }
     *     
     */
    public void setCommitteeDefinitionSnapshotData(CommitteeDefinitionSnapshotDataType value) {
        this.committeeDefinitionSnapshotData = value;
    }

}
