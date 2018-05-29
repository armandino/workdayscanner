
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains each provisioning group based on the Request References or Request Criteria.
 * 
 * <p>Java class for Provisioning_Group_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Provisioning_Group_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Provisioning_Group" type="{urn:com.workday/bsvc}Provisioning_GroupType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Provisioning_Group_Response_DataType", propOrder = {
    "provisioningGroup"
})
public class ProvisioningGroupResponseDataType {

    @XmlElement(name = "Provisioning_Group")
    protected List<ProvisioningGroupType> provisioningGroup;

    /**
     * Gets the value of the provisioningGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the provisioningGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProvisioningGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProvisioningGroupType }
     * 
     * 
     */
    public List<ProvisioningGroupType> getProvisioningGroup() {
        if (provisioningGroup == null) {
            provisioningGroup = new ArrayList<ProvisioningGroupType>();
        }
        return this.provisioningGroup;
    }

}
