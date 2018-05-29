
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This element contains all provisioning group assignments for a person.
 * 
 * <p>Java class for Person_Account_Provisioning_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Person_Account_Provisioning_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Provisioning_Group_Assignment_Data" type="{urn:com.workday/bsvc}Provisioning_Group_Assignment_for_Person_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person_Account_Provisioning_DataType", propOrder = {
    "provisioningGroupAssignmentData"
})
public class PersonAccountProvisioningDataType {

    @XmlElement(name = "Provisioning_Group_Assignment_Data")
    protected List<ProvisioningGroupAssignmentForPersonDataType> provisioningGroupAssignmentData;

    /**
     * Gets the value of the provisioningGroupAssignmentData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the provisioningGroupAssignmentData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProvisioningGroupAssignmentData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProvisioningGroupAssignmentForPersonDataType }
     * 
     * 
     */
    public List<ProvisioningGroupAssignmentForPersonDataType> getProvisioningGroupAssignmentData() {
        if (provisioningGroupAssignmentData == null) {
            provisioningGroupAssignmentData = new ArrayList<ProvisioningGroupAssignmentForPersonDataType>();
        }
        return this.provisioningGroupAssignmentData;
    }

}
