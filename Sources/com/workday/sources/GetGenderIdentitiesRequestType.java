
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The request to get gender identity data for a worker.
 * 
 * <p>Java class for Get_Gender_Identities_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Get_Gender_Identities_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Request_References" type="{urn:com.workday/bsvc}Gender_Identity_Request_ReferencesType" minOccurs="0"/>
 *           &lt;element name="Request_Criteria" type="{urn:com.workday/bsvc}Gender_Identity_Request_CriteriaType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="Response_Filter" type="{urn:com.workday/bsvc}Response_FilterType" minOccurs="0"/>
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
@XmlType(name = "Get_Gender_Identities_RequestType", propOrder = {
    "requestReferences",
    "requestCriteria",
    "responseFilter"
})
public class GetGenderIdentitiesRequestType {

    @XmlElement(name = "Request_References")
    protected GenderIdentityRequestReferencesType requestReferences;
    @XmlElement(name = "Request_Criteria")
    protected GenderIdentityRequestCriteriaType requestCriteria;
    @XmlElement(name = "Response_Filter")
    protected ResponseFilterType responseFilter;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the requestReferences property.
     * 
     * @return
     *     possible object is
     *     {@link GenderIdentityRequestReferencesType }
     *     
     */
    public GenderIdentityRequestReferencesType getRequestReferences() {
        return requestReferences;
    }

    /**
     * Sets the value of the requestReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderIdentityRequestReferencesType }
     *     
     */
    public void setRequestReferences(GenderIdentityRequestReferencesType value) {
        this.requestReferences = value;
    }

    /**
     * Gets the value of the requestCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link GenderIdentityRequestCriteriaType }
     *     
     */
    public GenderIdentityRequestCriteriaType getRequestCriteria() {
        return requestCriteria;
    }

    /**
     * Sets the value of the requestCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderIdentityRequestCriteriaType }
     *     
     */
    public void setRequestCriteria(GenderIdentityRequestCriteriaType value) {
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
