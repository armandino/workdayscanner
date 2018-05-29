
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing all provisioning group data.
 * 
 * <p>Java class for Provisioning_GroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Provisioning_GroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Provisioning_Group_Reference" type="{urn:com.workday/bsvc}Provisioning_GroupObjectType" minOccurs="0"/>
 *         &lt;element name="Provisioning_Group_Data" type="{urn:com.workday/bsvc}Provisioning_Group_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Provisioning_GroupType", propOrder = {
    "provisioningGroupReference",
    "provisioningGroupData"
})
public class ProvisioningGroupType {

    @XmlElement(name = "Provisioning_Group_Reference")
    protected ProvisioningGroupObjectType provisioningGroupReference;
    @XmlElement(name = "Provisioning_Group_Data")
    protected ProvisioningGroupDataType provisioningGroupData;

    /**
     * Gets the value of the provisioningGroupReference property.
     * 
     * @return
     *     possible object is
     *     {@link ProvisioningGroupObjectType }
     *     
     */
    public ProvisioningGroupObjectType getProvisioningGroupReference() {
        return provisioningGroupReference;
    }

    /**
     * Sets the value of the provisioningGroupReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvisioningGroupObjectType }
     *     
     */
    public void setProvisioningGroupReference(ProvisioningGroupObjectType value) {
        this.provisioningGroupReference = value;
    }

    /**
     * Gets the value of the provisioningGroupData property.
     * 
     * @return
     *     possible object is
     *     {@link ProvisioningGroupDataType }
     *     
     */
    public ProvisioningGroupDataType getProvisioningGroupData() {
        return provisioningGroupData;
    }

    /**
     * Sets the value of the provisioningGroupData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvisioningGroupDataType }
     *     
     */
    public void setProvisioningGroupData(ProvisioningGroupDataType value) {
        this.provisioningGroupData = value;
    }

}
