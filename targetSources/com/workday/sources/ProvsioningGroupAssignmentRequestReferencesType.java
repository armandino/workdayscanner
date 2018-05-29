
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Utilize the Request References element to retrieve a specific instance(s) of provisioning group assignments.
 * 
 * <p>Java class for Provsioning_Group_Assignment_Request_ReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Provsioning_Group_Assignment_Request_ReferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Provisioning_Group_Assignment_Request_Reference" type="{urn:com.workday/bsvc}Unique_IdentifierObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Provsioning_Group_Assignment_Request_ReferencesType", propOrder = {
    "provisioningGroupAssignmentRequestReference"
})
public class ProvsioningGroupAssignmentRequestReferencesType {

    @XmlElement(name = "Provisioning_Group_Assignment_Request_Reference")
    protected List<UniqueIdentifierObjectType> provisioningGroupAssignmentRequestReference;

    /**
     * Gets the value of the provisioningGroupAssignmentRequestReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the provisioningGroupAssignmentRequestReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProvisioningGroupAssignmentRequestReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UniqueIdentifierObjectType }
     * 
     * 
     */
    public List<UniqueIdentifierObjectType> getProvisioningGroupAssignmentRequestReference() {
        if (provisioningGroupAssignmentRequestReference == null) {
            provisioningGroupAssignmentRequestReference = new ArrayList<UniqueIdentifierObjectType>();
        }
        return this.provisioningGroupAssignmentRequestReference;
    }

}
