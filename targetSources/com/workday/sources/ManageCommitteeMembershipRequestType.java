
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request element for the Manage Committee Membership business process web service.
 * 
 * <p>Java class for Manage_Committee_Membership_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Manage_Committee_Membership_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Business_Process_Parameters" type="{urn:com.workday/bsvc}Business_Process_ParametersType" minOccurs="0"/>
 *         &lt;element name="Manage_Committee_Membership_Data" type="{urn:com.workday/bsvc}Manage_Committee_Membership_DataType"/>
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
@XmlType(name = "Manage_Committee_Membership_RequestType", propOrder = {
    "businessProcessParameters",
    "manageCommitteeMembershipData"
})
public class ManageCommitteeMembershipRequestType {

    @XmlElement(name = "Business_Process_Parameters")
    protected BusinessProcessParametersType businessProcessParameters;
    @XmlElement(name = "Manage_Committee_Membership_Data", required = true)
    protected ManageCommitteeMembershipDataType manageCommitteeMembershipData;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the businessProcessParameters property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessProcessParametersType }
     *     
     */
    public BusinessProcessParametersType getBusinessProcessParameters() {
        return businessProcessParameters;
    }

    /**
     * Sets the value of the businessProcessParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessProcessParametersType }
     *     
     */
    public void setBusinessProcessParameters(BusinessProcessParametersType value) {
        this.businessProcessParameters = value;
    }

    /**
     * Gets the value of the manageCommitteeMembershipData property.
     * 
     * @return
     *     possible object is
     *     {@link ManageCommitteeMembershipDataType }
     *     
     */
    public ManageCommitteeMembershipDataType getManageCommitteeMembershipData() {
        return manageCommitteeMembershipData;
    }

    /**
     * Sets the value of the manageCommitteeMembershipData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManageCommitteeMembershipDataType }
     *     
     */
    public void setManageCommitteeMembershipData(ManageCommitteeMembershipDataType value) {
        this.manageCommitteeMembershipData = value;
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
