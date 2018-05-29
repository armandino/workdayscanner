
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request element used to get work contact information for a person.  The response is formatted to be usable as input to the Change Work Contact Information web service request.
 * 
 * <p>Java class for Get_Change_Work_Contact_Information_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Get_Change_Work_Contact_Information_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Request_References" type="{urn:com.workday/bsvc}Get_Change_Work_Contact_Information_Request_ReferencesType" minOccurs="0"/>
 *         &lt;element name="Response_Filter" type="{urn:com.workday/bsvc}Response_FilterType" minOccurs="0"/>
 *         &lt;element name="Request_Criteria_Data" type="{urn:com.workday/bsvc}Get_Change_Work_Contact_Information_Request_CriteriaType" minOccurs="0"/>
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
@XmlType(name = "Get_Change_Work_Contact_Information_RequestType", propOrder = {
    "requestReferences",
    "responseFilter",
    "requestCriteriaData"
})
public class GetChangeWorkContactInformationRequestType {

    @XmlElement(name = "Request_References")
    protected GetChangeWorkContactInformationRequestReferencesType requestReferences;
    @XmlElement(name = "Response_Filter")
    protected ResponseFilterType responseFilter;
    @XmlElement(name = "Request_Criteria_Data")
    protected GetChangeWorkContactInformationRequestCriteriaType requestCriteriaData;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the requestReferences property.
     * 
     * @return
     *     possible object is
     *     {@link GetChangeWorkContactInformationRequestReferencesType }
     *     
     */
    public GetChangeWorkContactInformationRequestReferencesType getRequestReferences() {
        return requestReferences;
    }

    /**
     * Sets the value of the requestReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetChangeWorkContactInformationRequestReferencesType }
     *     
     */
    public void setRequestReferences(GetChangeWorkContactInformationRequestReferencesType value) {
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
     *     {@link GetChangeWorkContactInformationRequestCriteriaType }
     *     
     */
    public GetChangeWorkContactInformationRequestCriteriaType getRequestCriteriaData() {
        return requestCriteriaData;
    }

    /**
     * Sets the value of the requestCriteriaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetChangeWorkContactInformationRequestCriteriaType }
     *     
     */
    public void setRequestCriteriaData(GetChangeWorkContactInformationRequestCriteriaType value) {
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
