
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains each provisioning group assignment based on the Request References or Request Criteria.
 * 
 * <p>Java class for Provisioning_Group_Assignment_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Provisioning_Group_Assignment_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Provisioning_Group_Assignment" type="{urn:com.workday/bsvc}Provisioning_Group_AssignmentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Provisioning_Group_Assignment_Response_DataType", propOrder = {
    "provisioningGroupAssignment"
})
public class ProvisioningGroupAssignmentResponseDataType {

    @XmlElement(name = "Provisioning_Group_Assignment")
    protected List<ProvisioningGroupAssignmentType> provisioningGroupAssignment;

    /**
     * Gets the value of the provisioningGroupAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the provisioningGroupAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProvisioningGroupAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProvisioningGroupAssignmentType }
     * 
     * 
     */
    public List<ProvisioningGroupAssignmentType> getProvisioningGroupAssignment() {
        if (provisioningGroupAssignment == null) {
            provisioningGroupAssignment = new ArrayList<ProvisioningGroupAssignmentType>();
        }
        return this.provisioningGroupAssignment;
    }

}
