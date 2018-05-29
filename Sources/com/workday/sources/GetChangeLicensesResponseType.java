
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response element containing a worker's licenses.
 * 
 * <p>Java class for Get_Change_Licenses_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Get_Change_Licenses_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Request_References" type="{urn:com.workday/bsvc}Get_Change_Licenses_Request_ReferencesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Response_Filter" type="{urn:com.workday/bsvc}Response_FilterType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Response_Results" type="{urn:com.workday/bsvc}Response_ResultsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Response_Data" type="{urn:com.workday/bsvc}Change_Licenses_Response_DataType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Get_Change_Licenses_ResponseType", propOrder = {
    "requestReferences",
    "responseFilter",
    "responseResults",
    "responseData"
})
public class GetChangeLicensesResponseType {

    @XmlElement(name = "Request_References")
    protected List<GetChangeLicensesRequestReferencesType> requestReferences;
    @XmlElement(name = "Response_Filter")
    protected List<ResponseFilterType> responseFilter;
    @XmlElement(name = "Response_Results")
    protected List<ResponseResultsType> responseResults;
    @XmlElement(name = "Response_Data")
    protected List<ChangeLicensesResponseDataType> responseData;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the requestReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetChangeLicensesRequestReferencesType }
     * 
     * 
     */
    public List<GetChangeLicensesRequestReferencesType> getRequestReferences() {
        if (requestReferences == null) {
            requestReferences = new ArrayList<GetChangeLicensesRequestReferencesType>();
        }
        return this.requestReferences;
    }

    /**
     * Gets the value of the responseFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseFilterType }
     * 
     * 
     */
    public List<ResponseFilterType> getResponseFilter() {
        if (responseFilter == null) {
            responseFilter = new ArrayList<ResponseFilterType>();
        }
        return this.responseFilter;
    }

    /**
     * Gets the value of the responseResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseResultsType }
     * 
     * 
     */
    public List<ResponseResultsType> getResponseResults() {
        if (responseResults == null) {
            responseResults = new ArrayList<ResponseResultsType>();
        }
        return this.responseResults;
    }

    /**
     * Gets the value of the responseData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeLicensesResponseDataType }
     * 
     * 
     */
    public List<ChangeLicensesResponseDataType> getResponseData() {
        if (responseData == null) {
            responseData = new ArrayList<ChangeLicensesResponseDataType>();
        }
        return this.responseData;
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
