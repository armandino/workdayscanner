
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Get Request wrapper for retrieving User-Based Security Groups and Workday Accounts that are members of the group
 * 
 * <p>Java class for Get_Assign_User-Based_Security_Group_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Get_Assign_User-Based_Security_Group_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Request_References" type="{urn:com.workday/bsvc}User-Based_Security_Group_Request_ReferencesType" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="Request_Criteria" type="{urn:com.workday/bsvc}User-Based_Security_Group_Request_CriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="Response_Filter" type="{urn:com.workday/bsvc}Response_FilterType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Response_Group" type="{urn:com.workday/bsvc}User-Based_Security_Group_Reference_Only_Response_GroupType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Get_Assign_User-Based_Security_Group_RequestType", propOrder = {
    "requestReferences",
    "requestCriteria",
    "responseFilter",
    "responseGroup"
})
public class GetAssignUserBasedSecurityGroupRequestType {

    @XmlElement(name = "Request_References")
    protected List<UserBasedSecurityGroupRequestReferencesType> requestReferences;
    @XmlElement(name = "Request_Criteria")
    protected List<UserBasedSecurityGroupRequestCriteriaType> requestCriteria;
    @XmlElement(name = "Response_Filter")
    protected List<ResponseFilterType> responseFilter;
    @XmlElement(name = "Response_Group")
    protected List<UserBasedSecurityGroupReferenceOnlyResponseGroupType> responseGroup;
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
     * {@link UserBasedSecurityGroupRequestReferencesType }
     * 
     * 
     */
    public List<UserBasedSecurityGroupRequestReferencesType> getRequestReferences() {
        if (requestReferences == null) {
            requestReferences = new ArrayList<UserBasedSecurityGroupRequestReferencesType>();
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
     * {@link UserBasedSecurityGroupRequestCriteriaType }
     * 
     * 
     */
    public List<UserBasedSecurityGroupRequestCriteriaType> getRequestCriteria() {
        if (requestCriteria == null) {
            requestCriteria = new ArrayList<UserBasedSecurityGroupRequestCriteriaType>();
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
     * {@link UserBasedSecurityGroupReferenceOnlyResponseGroupType }
     * 
     * 
     */
    public List<UserBasedSecurityGroupReferenceOnlyResponseGroupType> getResponseGroup() {
        if (responseGroup == null) {
            responseGroup = new ArrayList<UserBasedSecurityGroupReferenceOnlyResponseGroupType>();
        }
        return this.responseGroup;
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
