
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing all provisioning group assignment data.
 * 
 * <p>Java class for Provisioning_Group_AssignmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Provisioning_Group_AssignmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Provisioning_Group_Assignment_Reference" type="{urn:com.workday/bsvc}Unique_IdentifierObjectType" minOccurs="0"/>
 *         &lt;element name="Provisioning_Group_Assignment_Data" type="{urn:com.workday/bsvc}Provisioning_Group_Assignment_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Provisioning_Group_AssignmentType", propOrder = {
    "provisioningGroupAssignmentReference",
    "provisioningGroupAssignmentData"
})
public class ProvisioningGroupAssignmentType {

    @XmlElement(name = "Provisioning_Group_Assignment_Reference")
    protected UniqueIdentifierObjectType provisioningGroupAssignmentReference;
    @XmlElement(name = "Provisioning_Group_Assignment_Data")
    protected ProvisioningGroupAssignmentDataType provisioningGroupAssignmentData;

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

}
