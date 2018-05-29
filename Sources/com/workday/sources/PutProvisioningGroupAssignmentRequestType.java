
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request element to add or update a provisioning group assignment
 * 
 * <p>Java class for Put_Provisioning_Group_Assignment_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Provisioning_Group_Assignment_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Provisioning_Group_Assignment_Reference" type="{urn:com.workday/bsvc}Unique_IdentifierObjectType" minOccurs="0"/>
 *         &lt;element name="Provisioning_Group_Assignment_Data" type="{urn:com.workday/bsvc}Provisioning_Group_Assignment_DataType"/>
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
@XmlType(name = "Put_Provisioning_Group_Assignment_RequestType", propOrder = {
    "provisioningGroupAssignmentReference",
    "provisioningGroupAssignmentData"
})
public class PutProvisioningGroupAssignmentRequestType {

    @XmlElement(name = "Provisioning_Group_Assignment_Reference")
    protected UniqueIdentifierObjectType provisioningGroupAssignmentReference;
    @XmlElement(name = "Provisioning_Group_Assignment_Data", required = true)
    protected ProvisioningGroupAssignmentDataType provisioningGroupAssignmentData;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the provisioningGroupAssignmentReference property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public UniqueIdentifierObjectType getProvisioningGroupAssignmentReference() {
        return provisioningGroupAssignmentReference;
    }

    /**
     * Sets the value of the provisioningGroupAssignmentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public void setProvisioningGroupAssignmentReference(UniqueIdentifierObjectType value) {
        this.provisioningGroupAssignmentReference = value;
    }

    /**
     * Gets the value of the provisioningGroupAssignmentData property.
     * 
     * @return
     *     possible object is
     *     {@link ProvisioningGroupAssignmentDataType }
     *     
     */
    public ProvisioningGroupAssignmentDataType getProvisioningGroupAssignmentData() {
        return provisioningGroupAssignmentData;
    }

    /**
     * Sets the value of the provisioningGroupAssignmentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvisioningGroupAssignmentDataType }
     *     
     */
    public void setProvisioningGroupAssignmentData(ProvisioningGroupAssignmentDataType value) {
        this.provisioningGroupAssignmentData = value;
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
