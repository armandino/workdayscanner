
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Put Provisioning Group Request
 * 
 * <p>Java class for Put_Provisioning_Group_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Provisioning_Group_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Provisioning_Group_Reference" type="{urn:com.workday/bsvc}Provisioning_GroupObjectType" minOccurs="0"/>
 *         &lt;element name="Provisioning_Group_Data" type="{urn:com.workday/bsvc}Provisioning_Group_DataType"/>
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
@XmlType(name = "Put_Provisioning_Group_RequestType", propOrder = {
    "provisioningGroupReference",
    "provisioningGroupData"
})
public class PutProvisioningGroupRequestType {

    @XmlElement(name = "Provisioning_Group_Reference")
    protected ProvisioningGroupObjectType provisioningGroupReference;
    @XmlElement(name = "Provisioning_Group_Data", required = true)
    protected ProvisioningGroupDataType provisioningGroupData;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

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
