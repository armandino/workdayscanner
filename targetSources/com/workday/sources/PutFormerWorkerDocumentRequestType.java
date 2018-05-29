
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request element for Put Former Worker Document Request
 * 
 * <p>Java class for Put_Former_Worker_Document_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Former_Worker_Document_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Former_Worker_Document_Reference" type="{urn:com.workday/bsvc}Former_Worker_AttachmentObjectType" minOccurs="0"/>
 *         &lt;element name="Former_Worker_Document_Data" type="{urn:com.workday/bsvc}Former_Worker_Attachment_DataType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Add_Only" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute ref="{urn:com.workday/bsvc}version"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Put_Former_Worker_Document_RequestType", propOrder = {
    "formerWorkerDocumentReference",
    "formerWorkerDocumentData"
})
public class PutFormerWorkerDocumentRequestType {

    @XmlElement(name = "Former_Worker_Document_Reference")
    protected FormerWorkerAttachmentObjectType formerWorkerDocumentReference;
    @XmlElement(name = "Former_Worker_Document_Data", required = true)
    protected FormerWorkerAttachmentDataType formerWorkerDocumentData;
    @XmlAttribute(name = "Add_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean addOnly;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the formerWorkerDocumentReference property.
     * 
     * @return
     *     possible object is
     *     {@link FormerWorkerAttachmentObjectType }
     *     
     */
    public FormerWorkerAttachmentObjectType getFormerWorkerDocumentReference() {
        return formerWorkerDocumentReference;
    }

    /**
     * Sets the value of the formerWorkerDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormerWorkerAttachmentObjectType }
     *     
     */
    public void setFormerWorkerDocumentReference(FormerWorkerAttachmentObjectType value) {
        this.formerWorkerDocumentReference = value;
    }

    /**
     * Gets the value of the formerWorkerDocumentData property.
     * 
     * @return
     *     possible object is
     *     {@link FormerWorkerAttachmentDataType }
     *     
     */
    public FormerWorkerAttachmentDataType getFormerWorkerDocumentData() {
        return formerWorkerDocumentData;
    }

    /**
     * Sets the value of the formerWorkerDocumentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormerWorkerAttachmentDataType }
     *     
     */
    public void setFormerWorkerDocumentData(FormerWorkerAttachmentDataType value) {
        this.formerWorkerDocumentData = value;
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
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
