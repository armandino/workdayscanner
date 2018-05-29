
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element containing Workday Account Data
 * 
 * <p>Java class for Get_Workday_Account_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Get_Workday_Account_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Request_References" type="{urn:com.workday/bsvc}Get_Workday_Account_Request_ReferencesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Request_Criteria" type="{urn:com.workday/bsvc}Get_Workday_Account_Request_CriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Response_Filter" type="{urn:com.workday/bsvc}Response_FilterType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Response_Group" type="{urn:com.workday/bsvc}Workday_Account_Response_GroupType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Response_Results" type="{urn:com.workday/bsvc}Response_ResultsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Response_Data" type="{urn:com.workday/bsvc}Get_Workday_Account_Response_DataType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Get_Workday_Account_ResponseType", propOrder = {
    "requestReferences",
    "requestCriteria",
    "responseFilter",
    "responseGroup",
    "responseResults",
    "responseData"
})
public class GetWorkdayAccountResponseType {

    @XmlElement(name = "Request_References")
    protected List<GetWorkdayAccountRequestReferencesType> requestReferences;
    @XmlElement(name = "Request_Criteria")
    protected List<GetWorkdayAccountRequestCriteriaType> requestCriteria;
    @XmlElement(name = "Response_Filter")
    protected List<ResponseFilterType> responseFilter;
    @XmlElement(name = "Response_Group")
    protected List<WorkdayAccountResponseGroupType> responseGroup;
    @XmlElement(name = "Response_Results")
    protected List<ResponseResultsType> responseResults;
    @XmlElement(name = "Response_Data")
    protected List<GetWorkdayAccountResponseDataType> responseData;
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
     * {@link GetWorkdayAccountRequestReferencesType }
     * 
     * 
     */
    public List<GetWorkdayAccountRequestReferencesType> getRequestReferences() {
        if (requestReferences == null) {
            requestReferences = new ArrayList<GetWorkdayAccountRequestReferencesType>();
        }
        return this.requestReferences;
    }

    /**
     * Gets the value of the requestCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetWorkdayAccountRequestCriteriaType }
     * 
     * 
     */
    public List<GetWorkdayAccountRequestCriteriaType> getRequestCriteria() {
        if (requestCriteria == null) {
            requestCriteria = new ArrayList<GetWorkdayAccountRequestCriteriaType>();
        }
        return this.requestCriteria;
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
     * {@link WorkdayAccountResponseGroupType }
     * 
     * 
     */
    public List<WorkdayAccountResponseGroupType> getResponseGroup() {
        if (responseGroup == null) {
            responseGroup = new ArrayList<WorkdayAccountResponseGroupType>();
        }
        return this.responseGroup;
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
     * {@link GetWorkdayAccountResponseDataType }
     * 
     * 
     */
    public List<GetWorkdayAccountResponseDataType> getResponseData() {
        if (responseData == null) {
            responseData = new ArrayList<GetWorkdayAccountResponseDataType>();
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
