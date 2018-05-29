
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the organization role and the organizations that the worker supports that role for.
 * 
 * <p>Java class for Organization_Role_for_Worker_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization_Role_for_Worker_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Organization_Role_Reference" type="{urn:com.workday/bsvc}Assignable_RoleObjectType" minOccurs="0"/>
 *         &lt;element name="Organization_Role_Data" type="{urn:com.workday/bsvc}Organization_Role_Assignment_for_Worker_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization_Role_for_Worker_DataType", propOrder = {
    "organizationRoleReference",
    "organizationRoleData"
})
public class OrganizationRoleForWorkerDataType {

    @XmlElement(name = "Organization_Role_Reference")
    protected AssignableRoleObjectType organizationRoleReference;
    @XmlElement(name = "Organization_Role_Data")
    protected List<OrganizationRoleAssignmentForWorkerDataType> organizationRoleData;

    /**
     * Gets the value of the organizationRoleReference property.
     * 
     * @return
     *     possible object is
     *     {@link AssignableRoleObjectType }
     *     
     */
    public AssignableRoleObjectType getOrganizationRoleReference() {
        return organizationRoleReference;
    }

    /**
     * Sets the value of the organizationRoleReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignableRoleObjectType }
     *     
     */
    public void setOrganizationRoleReference(AssignableRoleObjectType value) {
        this.organizationRoleReference = value;
    }

    /**
     * Gets the value of the organizationRoleData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationRoleData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationRoleData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationRoleAssignmentForWorkerDataType }
     * 
     * 
     */
    public List<OrganizationRoleAssignmentForWorkerDataType> getOrganizationRoleData() {
        if (organizationRoleData == null) {
            organizationRoleData = new ArrayList<OrganizationRoleAssignmentForWorkerDataType>();
        }
        return this.organizationRoleData;
    }

}
