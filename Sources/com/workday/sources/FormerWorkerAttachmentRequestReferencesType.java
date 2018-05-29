
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference for Former worker attachment request
 * 
 * <p>Java class for Former_Worker_Attachment_Request_ReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Former_Worker_Attachment_Request_ReferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Former_Worker_Document_Reference" type="{urn:com.workday/bsvc}Former_Worker_AttachmentObjectType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Former_Worker_Attachment_Request_ReferencesType", propOrder = {
    "formerWorkerDocumentReference"
})
public class FormerWorkerAttachmentRequestReferencesType {

    @XmlElement(name = "Former_Worker_Document_Reference", required = true)
    protected List<FormerWorkerAttachmentObjectType> formerWorkerDocumentReference;

    /**
     * Gets the value of the formerWorkerDocumentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formerWorkerDocumentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormerWorkerDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormerWorkerAttachmentObjectType }
     * 
     * 
     */
    public List<FormerWorkerAttachmentObjectType> getFormerWorkerDocumentReference() {
        if (formerWorkerDocumentReference == null) {
            formerWorkerDocumentReference = new ArrayList<FormerWorkerAttachmentObjectType>();
        }
        return this.formerWorkerDocumentReference;
    }

}
