
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Utilize the Request References element to retrieve a specific instance(s) of provisioning groups.
 * 
 * <p>Java class for Provisioning_Group_Request_ReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Provisioning_Group_Request_ReferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Provisioning_Group_Request_Reference" type="{urn:com.workday/bsvc}Provisioning_GroupObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Provisioning_Group_Request_ReferencesType", propOrder = {
    "provisioningGroupRequestReference"
})
public class ProvisioningGroupRequestReferencesType {

    @XmlElement(name = "Provisioning_Group_Request_Reference")
    protected List<ProvisioningGroupObjectType> provisioningGroupRequestReference;

    /**
     * Gets the value of the provisioningGroupRequestReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the provisioningGroupRequestReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProvisioningGroupRequestReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProvisioningGroupObjectType }
     * 
     * 
     */
    public List<ProvisioningGroupObjectType> getProvisioningGroupRequestReference() {
        if (provisioningGroupRequestReference == null) {
            provisioningGroupRequestReference = new ArrayList<ProvisioningGroupObjectType>();
        }
        return this.provisioningGroupRequestReference;
    }

}
