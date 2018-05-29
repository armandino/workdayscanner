
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request for Get Former Worker Document
 * 
 * <p>Java class for Get_Former_Worker_Documents_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Get_Former_Worker_Documents_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Request_References" type="{urn:com.workday/bsvc}Former_Worker_Attachment_Request_ReferencesType" minOccurs="0"/>
 *         &lt;element name="Request_Critieria" type="{urn:com.workday/bsvc}Former_Worker_Attachment_Request_Criteria__EL_Type" minOccurs="0"/>
 *         &lt;element name="Response_Filter" type="{urn:com.workday/bsvc}Response_FilterType" minOccurs="0"/>
 *         &lt;element name="Response_Group" type="{urn:com.workday/bsvc}Former_Worker_Attachment_Response_GroupType" minOccurs="0"/>
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
@XmlType(name = "Get_Former_Worker_Documents_RequestType", propOrder = {
    "requestReferences",
    "requestCritieria",
    "responseFilter",
    "responseGroup"
})
public class GetFormerWorkerDocumentsRequestType {

    @XmlElement(name = "Request_References")
    protected FormerWorkerAttachmentRequestReferencesType requestReferences;
    @XmlElement(name = "Request_Critieria")
    protected FormerWorkerAttachmentRequestCriteriaELType requestCritieria;
    @XmlElement(name = "Response_Filter")
    protected ResponseFilterType responseFilter;
    @XmlElement(name = "Response_Group")
    protected FormerWorkerAttachmentResponseGroupType responseGroup;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the requestReferences property.
     * 
     * @return
     *     possible object is
     *     {@link FormerWorkerAttachmentRequestReferencesType }
     *     
     */
    public FormerWorkerAttachmentRequestReferencesType getRequestReferences() {
        return requestReferences;
    }

    /**
     * Sets the value of the requestReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormerWorkerAttachmentRequestReferencesType }
     *     
     */
    public void setRequestReferences(FormerWorkerAttachmentRequestReferencesType value) {
        this.requestReferences = value;
    }

    /**
     * Gets the value of the requestCritieria property.
     * 
     * @return
     *     possible object is
     *     {@link FormerWorkerAttachmentRequestCriteriaELType }
     *     
     */
    public FormerWorkerAttachmentRequestCriteriaELType getRequestCritieria() {
        return requestCritieria;
    }

    /**
     * Sets the value of the requestCritieria property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormerWorkerAttachmentRequestCriteriaELType }
     *     
     */
    public void setRequestCritieria(FormerWorkerAttachmentRequestCriteriaELType value) {
        this.requestCritieria = value;
    }

    /**
     * Gets the value of the responseFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseFilterType }
     *     
     */
    public ResponseFilterType getResponseFilter() {
        return responseFilter;
    }

    /**
     * Sets the value of the responseFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseFilterType }
     *     
     */
    public void setResponseFilter(ResponseFilterType value) {
        this.responseFilter = value;
    }

    /**
     * Gets the value of the responseGroup property.
     * 
     * @return
     *     possible object is
     *     {@link FormerWorkerAttachmentResponseGroupType }
     *     
     */
    public FormerWorkerAttachmentResponseGroupType getResponseGroup() {
        return responseGroup;
    }

    /**
     * Sets the value of the responseGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormerWorkerAttachmentResponseGroupType }
     *     
     */
    public void setResponseGroup(FormerWorkerAttachmentResponseGroupType value) {
        this.responseGroup = value;
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
