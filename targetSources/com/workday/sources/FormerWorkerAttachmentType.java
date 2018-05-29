
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the retrieved Former Worker Document information.
 * 
 * <p>Java class for Former_Worker_AttachmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Former_Worker_AttachmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Former_Worker_Document_Reference" type="{urn:com.workday/bsvc}Former_Worker_AttachmentObjectType" minOccurs="0"/>
 *         &lt;element name="Former_Worker_Document_Data" type="{urn:com.workday/bsvc}Former_Worker_Attachment_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Former_Worker_AttachmentType", propOrder = {
    "formerWorkerDocumentReference",
    "formerWorkerDocumentData"
})
public class FormerWorkerAttachmentType {

    @XmlElement(name = "Former_Worker_Document_Reference")
    protected FormerWorkerAttachmentObjectType formerWorkerDocumentReference;
    @XmlElement(name = "Former_Worker_Document_Data")
    protected FormerWorkerAttachmentDataType formerWorkerDocumentData;

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

}
