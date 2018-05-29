
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request element used to retrieve Former Workers and their data.
 * 
 * <p>Java class for Get_Former_Workers_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Get_Former_Workers_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Request_References" type="{urn:com.workday/bsvc}Former_Worker_Request_ReferencesType" minOccurs="0"/>
 *           &lt;element name="Request_Criteria" type="{urn:com.workday/bsvc}Former_Worker_Request_CriteriaType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="Response_Filter" type="{urn:com.workday/bsvc}Response_FilterType" minOccurs="0"/>
 *         &lt;element name="Former_Worker_Response_Group" type="{urn:com.workday/bsvc}Former_Worker_Response_GroupType" minOccurs="0"/>
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
@XmlType(name = "Get_Former_Workers_RequestType", propOrder = {
    "requestReferences",
    "requestCriteria",
    "responseFilter",
    "formerWorkerResponseGroup"
})
public class GetFormerWorkersRequestType {

    @XmlElement(name = "Request_References")
    protected FormerWorkerRequestReferencesType requestReferences;
    @XmlElement(name = "Request_Criteria")
    protected FormerWorkerRequestCriteriaType requestCriteria;
    @XmlElement(name = "Response_Filter")
    protected ResponseFilterType responseFilter;
    @XmlElement(name = "Former_Worker_Response_Group")
    protected FormerWorkerResponseGroupType formerWorkerResponseGroup;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the requestReferences property.
     * 
     * @return
     *     possible object is
     *     {@link FormerWorkerRequestReferencesType }
     *     
     */
    public FormerWorkerRequestReferencesType getRequestReferences() {
        return requestReferences;
    }

    /**
     * Sets the value of the requestReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormerWorkerRequestReferencesType }
     *     
     */
    public void setRequestReferences(FormerWorkerRequestReferencesType value) {
        this.requestReferences = value;
    }

    /**
     * Gets the value of the requestCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link FormerWorkerRequestCriteriaType }
     *     
     */
    public FormerWorkerRequestCriteriaType getRequestCriteria() {
        return requestCriteria;
    }

    /**
     * Sets the value of the requestCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormerWorkerRequestCriteriaType }
     *     
     */
    public void setRequestCriteria(FormerWorkerRequestCriteriaType value) {
        this.requestCriteria = value;
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
     * Gets the value of the formerWorkerResponseGroup property.
     * 
     * @return
     *     possible object is
     *     {@link FormerWorkerResponseGroupType }
     *     
     */
    public FormerWorkerResponseGroupType getFormerWorkerResponseGroup() {
        return formerWorkerResponseGroup;
    }

    /**
     * Sets the value of the formerWorkerResponseGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormerWorkerResponseGroupType }
     *     
     */
    public void setFormerWorkerResponseGroup(FormerWorkerResponseGroupType value) {
        this.formerWorkerResponseGroup = value;
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
