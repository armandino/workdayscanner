
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for Get Workers Response.  The response element has to match the Operation Name.
 * 
 * <p>Java class for Get_Workers_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Get_Workers_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Request_References" type="{urn:com.workday/bsvc}Worker_Request_ReferencesType" minOccurs="0"/>
 *         &lt;element name="Request_Criteria" type="{urn:com.workday/bsvc}Worker_Request_CriteriaType" minOccurs="0"/>
 *         &lt;element name="Response_Filter" type="{urn:com.workday/bsvc}Response_FilterType" minOccurs="0"/>
 *         &lt;element name="Response_Group" type="{urn:com.workday/bsvc}Worker_Response_GroupType" minOccurs="0"/>
 *         &lt;element name="Response_Results" type="{urn:com.workday/bsvc}Response_ResultsType" minOccurs="0"/>
 *         &lt;element name="Response_Data" type="{urn:com.workday/bsvc}Workers_Response_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Get_Workers_ResponseType", propOrder = {
    "requestReferences",
    "requestCriteria",
    "responseFilter",
    "responseGroup",
    "responseResults",
    "responseData"
})
@XmlSeeAlso({
    GetWorkersResponseRootType.class
})
public class GetWorkersResponseType {

    @XmlElement(name = "Request_References")
    protected WorkerRequestReferencesType requestReferences;
    @XmlElement(name = "Request_Criteria")
    protected WorkerRequestCriteriaType requestCriteria;
    @XmlElement(name = "Response_Filter")
    protected ResponseFilterType responseFilter;
    @XmlElement(name = "Response_Group")
    protected WorkerResponseGroupType responseGroup;
    @XmlElement(name = "Response_Results")
    protected ResponseResultsType responseResults;
    @XmlElement(name = "Response_Data")
    protected WorkersResponseDataType responseData;

    /**
     * Gets the value of the requestReferences property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerRequestReferencesType }
     *     
     */
    public WorkerRequestReferencesType getRequestReferences() {
        return requestReferences;
    }

    /**
     * Sets the value of the requestReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerRequestReferencesType }
     *     
     */
    public void setRequestReferences(WorkerRequestReferencesType value) {
        this.requestReferences = value;
    }

    /**
     * Gets the value of the requestCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerRequestCriteriaType }
     *     
     */
    public WorkerRequestCriteriaType getRequestCriteria() {
        return requestCriteria;
    }

    /**
     * Sets the value of the requestCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerRequestCriteriaType }
     *     
     */
    public void setRequestCriteria(WorkerRequestCriteriaType value) {
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
     * Gets the value of the responseGroup property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerResponseGroupType }
     *     
     */
    public WorkerResponseGroupType getResponseGroup() {
        return responseGroup;
    }

    /**
     * Sets the value of the responseGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerResponseGroupType }
     *     
     */
    public void setResponseGroup(WorkerResponseGroupType value) {
        this.responseGroup = value;
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
     *     {@link WorkersResponseDataType }
     *     
     */
    public WorkersResponseDataType getResponseData() {
        return responseData;
    }

    /**
     * Sets the value of the responseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkersResponseDataType }
     *     
     */
    public void setResponseData(WorkersResponseDataType value) {
        this.responseData = value;
    }

}
