
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response element containing the instances of workers and their previous job history.
 * 
 * <p>Java class for Get_Previous_System_Job_History_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Get_Previous_System_Job_History_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Request_References" type="{urn:com.workday/bsvc}Worker_Request_ReferencesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Response_Filter" type="{urn:com.workday/bsvc}Response_FilterType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Response_Results" type="{urn:com.workday/bsvc}Response_ResultsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Response_Group" type="{urn:com.workday/bsvc}Worker_Response_Group_for_ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Response_Data" type="{urn:com.workday/bsvc}Previous_System_Job_History_Response_DataType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Get_Previous_System_Job_History_ResponseType", propOrder = {
    "requestReferences",
    "responseFilter",
    "responseResults",
    "responseGroup",
    "responseData"
})
public class GetPreviousSystemJobHistoryResponseType {

    @XmlElement(name = "Request_References")
    protected List<WorkerRequestReferencesType> requestReferences;
    @XmlElement(name = "Response_Filter")
    protected List<ResponseFilterType> responseFilter;
    @XmlElement(name = "Response_Results")
    protected List<ResponseResultsType> responseResults;
    @XmlElement(name = "Response_Group")
    protected List<WorkerResponseGroupForReferenceType> responseGroup;
    @XmlElement(name = "Response_Data")
    protected List<PreviousSystemJobHistoryResponseDataType> responseData;
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
     * {@link WorkerRequestReferencesType }
     * 
     * 
     */
    public List<WorkerRequestReferencesType> getRequestReferences() {
        if (requestReferences == null) {
            requestReferences = new ArrayList<WorkerRequestReferencesType>();
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
     * Gets the value of the responseGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkerResponseGroupForReferenceType }
     * 
     * 
     */
    public List<WorkerResponseGroupForReferenceType> getResponseGroup() {
        if (responseGroup == null) {
            responseGroup = new ArrayList<WorkerResponseGroupForReferenceType>();
        }
        return this.responseGroup;
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
     * {@link PreviousSystemJobHistoryResponseDataType }
     * 
     * 
     */
    public List<PreviousSystemJobHistoryResponseDataType> getResponseData() {
        if (responseData == null) {
            responseData = new ArrayList<PreviousSystemJobHistoryResponseDataType>();
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
