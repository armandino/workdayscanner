
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response Element for Put Former Worker Attachment
 * 
 * <p>Java class for Put_Former_Worker_Document_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Former_Worker_Document_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Former_Worker_Attachment_Reference" type="{urn:com.workday/bsvc}Former_Worker_AttachmentObjectType" minOccurs="0"/>
 *         &lt;element name="Former_Worker_Reference" type="{urn:com.workday/bsvc}Former_WorkerObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{urn:com.workday/bsvc}version"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Put_Former_Worker_Document_ResponseType", propOrder = {
    "formerWorkerAttachmentReference",
    "formerWorkerReference"
})
public class PutFormerWorkerDocumentResponseType {

    @XmlElement(name = "Former_Worker_Attachment_Reference")
    protected FormerWorkerAttachmentObjectType formerWorkerAttachmentReference;
    @XmlElement(name = "Former_Worker_Reference")
    protected FormerWorkerObjectType formerWorkerReference;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the formerWorkerAttachmentReference property.
     * 
     * @return
     *     possible object is
     *     {@link FormerWorkerAttachmentObjectType }
     *     
     */
    public FormerWorkerAttachmentObjectType getFormerWorkerAttachmentReference() {
        return formerWorkerAttachmentReference;
    }

    /**
     * Sets the value of the formerWorkerAttachmentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormerWorkerAttachmentObjectType }
     *     
     */
    public void setFormerWorkerAttachmentReference(FormerWorkerAttachmentObjectType value) {
        this.formerWorkerAttachmentReference = value;
    }

    /**
     * Gets the value of the formerWorkerReference property.
     * 
     * @return
     *     possible object is
     *     {@link FormerWorkerObjectType }
     *     
     */
    public FormerWorkerObjectType getFormerWorkerReference() {
        return formerWorkerReference;
    }

    /**
     * Sets the value of the formerWorkerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormerWorkerObjectType }
     *     
     */
    public void setFormerWorkerReference(FormerWorkerObjectType value) {
        this.formerWorkerReference = value;
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
