
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request element to retrieve provisioning group setup data.
 * 
 * <p>Java class for Get_Provisioning_Groups_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Get_Provisioning_Groups_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Request_References" type="{urn:com.workday/bsvc}Provisioning_Group_Request_ReferencesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Response_Filter" type="{urn:com.workday/bsvc}Response_FilterType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Response_Group" type="{urn:com.workday/bsvc}Provisioning_Group_Response_GroupType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Get_Provisioning_Groups_RequestType", propOrder = {
    "requestReferences",
    "responseFilter",
    "responseGroup"
})
public class GetProvisioningGroupsRequestType {

    @XmlElement(name = "Request_References")
    protected List<ProvisioningGroupRequestReferencesType> requestReferences;
    @XmlElement(name = "Response_Filter")
    protected List<ResponseFilterType> responseFilter;
    @XmlElement(name = "Response_Group")
    protected List<ProvisioningGroupResponseGroupType> responseGroup;
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
     * {@link ProvisioningGroupRequestReferencesType }
     * 
     * 
     */
    public List<ProvisioningGroupRequestReferencesType> getRequestReferences() {
        if (requestReferences == null) {
            requestReferences = new ArrayList<ProvisioningGroupRequestReferencesType>();
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
     * {@link ProvisioningGroupResponseGroupType }
     * 
     * 
     */
    public List<ProvisioningGroupResponseGroupType> getResponseGroup() {
        if (responseGroup == null) {
            responseGroup = new ArrayList<ProvisioningGroupResponseGroupType>();
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
