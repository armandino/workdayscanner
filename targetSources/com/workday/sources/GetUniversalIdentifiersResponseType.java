
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Get Response for Universal Identifiers.
 * 
 * <p>Java class for Get_Universal_Identifiers_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Get_Universal_Identifiers_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Request_References" type="{urn:com.workday/bsvc}Universal_Identifier_Request_ReferencesType" minOccurs="0"/>
 *         &lt;element name="Request_Criteria" type="{urn:com.workday/bsvc}Universal_Identifier_Request_CriteriaType" minOccurs="0"/>
 *         &lt;element name="Response_Filter" type="{urn:com.workday/bsvc}Response_FilterType" minOccurs="0"/>
 *         &lt;element name="Response_Results" type="{urn:com.workday/bsvc}Response_ResultsType" minOccurs="0"/>
 *         &lt;element name="Response_Data" type="{urn:com.workday/bsvc}Universal_Identifier_Response_DataType" minOccurs="0"/>
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
@XmlType(name = "Get_Universal_Identifiers_ResponseType", propOrder = {
    "requestReferences",
    "requestCriteria",
    "responseFilter",
    "responseResults",
    "responseData"
})
public class GetUniversalIdentifiersResponseType {

    @XmlElement(name = "Request_References")
    protected UniversalIdentifierRequestReferencesType requestReferences;
    @XmlElement(name = "Request_Criteria")
    protected UniversalIdentifierRequestCriteriaType requestCriteria;
    @XmlElement(name = "Response_Filter")
    protected ResponseFilterType responseFilter;
    @XmlElement(name = "Response_Results")
    protected ResponseResultsType responseResults;
    @XmlElement(name = "Response_Data")
    protected UniversalIdentifierResponseDataType responseData;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the requestReferences property.
     * 
     * @return
     *     possible object is
     *     {@link UniversalIdentifierRequestReferencesType }
     *     
     */
    public UniversalIdentifierRequestReferencesType getRequestReferences() {
        return requestReferences;
    }

    /**
     * Sets the value of the requestReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniversalIdentifierRequestReferencesType }
     *     
     */
    public void setRequestReferences(UniversalIdentifierRequestReferencesType value) {
        this.requestReferences = value;
    }

    /**
     * Gets the value of the requestCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link UniversalIdentifierRequestCriteriaType }
     *     
     */
    public UniversalIdentifierRequestCriteriaType getRequestCriteria() {
        return requestCriteria;
    }

    /**
     * Sets the value of the requestCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniversalIdentifierRequestCriteriaType }
     *     
     */
    public void setRequestCriteria(UniversalIdentifierRequestCriteriaType value) {
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
     * Gets the value of the responseResults property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseResultsType }
     *     
     */
    public ResponseResultsType getResponseResults() {
        return responseResults;
    }

    /**
     * Sets the value of the responseResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseResultsType }
     *     
     */
    public void setResponseResults(ResponseResultsType value) {
        this.responseResults = value;
    }

    /**
     * Gets the value of the responseData property.
     * 
     * @return
     *     possible object is
     *     {@link UniversalIdentifierResponseDataType }
     *     
     */
    public UniversalIdentifierResponseDataType getResponseData() {
        return responseData;
    }

    /**
     * Sets the value of the responseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniversalIdentifierResponseDataType }
     *     
     */
    public void setResponseData(UniversalIdentifierResponseDataType value) {
        this.responseData = value;
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
