
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Former Worker Document Response Data containing the retrieved Worker Document information.
 * 
 * <p>Java class for Former_Worker_Attachment_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Former_Worker_Attachment_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Former_Worker_Document" type="{urn:com.workday/bsvc}Former_Worker_AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Former_Worker_Attachment_Response_DataType", propOrder = {
    "formerWorkerDocument"
})
public class FormerWorkerAttachmentResponseDataType {

    @XmlElement(name = "Former_Worker_Document")
    protected List<FormerWorkerAttachmentType> formerWorkerDocument;

    /**
     * Gets the value of the formerWorkerDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formerWorkerDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormerWorkerDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormerWorkerAttachmentType }
     * 
     * 
     */
    public List<FormerWorkerAttachmentType> getFormerWorkerDocument() {
        if (formerWorkerDocument == null) {
            formerWorkerDocument = new ArrayList<FormerWorkerAttachmentType>();
        }
        return this.formerWorkerDocument;
    }

}
