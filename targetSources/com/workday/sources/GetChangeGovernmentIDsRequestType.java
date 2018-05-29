
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request element used to get government IDs for a worker. The response is formatted to be usable as input to the Change Government IDs web service request.
 * 
 * <p>Java class for Get_Change_Government_IDs_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Get_Change_Government_IDs_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Request_References" type="{urn:com.workday/bsvc}Get_Change_Government_IDs_Request_ReferencesType" minOccurs="0"/>
 *         &lt;element name="Response_Filter" type="{urn:com.workday/bsvc}Response_FilterType" minOccurs="0"/>
 *         &lt;element name="Request_Criteria_Data" type="{urn:com.workday/bsvc}Change_Government_ID_Request_CriteriaType" minOccurs="0"/>
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
@XmlType(name = "Get_Change_Government_IDs_RequestType", propOrder = {
    "requestReferences",
    "responseFilter",
    "requestCriteriaData"
})
public class GetChangeGovernmentIDsRequestType {

    @XmlElement(name = "Request_References")
    protected GetChangeGovernmentIDsRequestReferencesType requestReferences;
    @XmlElement(name = "Response_Filter")
    protected ResponseFilterType responseFilter;
    @XmlElement(name = "Request_Criteria_Data")
    protected ChangeGovernmentIDRequestCriteriaType requestCriteriaData;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the requestReferences property.
     * 
     * @return
     *     possible object is
     *     {@link GetChangeGovernmentIDsRequestReferencesType }
     *     
     */
    public GetChangeGovernmentIDsRequestReferencesType getRequestReferences() {
        return requestReferences;
    }

    /**
     * Sets the value of the requestReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetChangeGovernmentIDsRequestReferencesType }
     *     
     */
    public void setRequestReferences(GetChangeGovernmentIDsRequestReferencesType value) {
        this.requestReferences = value;
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
     * Gets the value of the requestCriteriaData property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeGovernmentIDRequestCriteriaType }
     *     
     */
    public ChangeGovernmentIDRequestCriteriaType getRequestCriteriaData() {
        return requestCriteriaData;
    }

    /**
     * Sets the value of the requestCriteriaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeGovernmentIDRequestCriteriaType }
     *     
     */
    public void setRequestCriteriaData(ChangeGovernmentIDRequestCriteriaType value) {
        this.requestCriteriaData = value;
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
