
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The organizational roles which provide support for the worker.
 * 
 * <p>Java class for Organization_Supporting_Role_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization_Supporting_Role_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Organization_Role_Reference" type="{urn:com.workday/bsvc}Assignable_RoleObjectType" minOccurs="0"/>
 *         &lt;element name="Organization_Role_Data" type="{urn:com.workday/bsvc}Worker_Organization_Role_Assignment_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization_Supporting_Role_DataType", propOrder = {
    "organizationRoleReference",
    "organizationRoleData"
})
public class OrganizationSupportingRoleDataType {

    @XmlElement(name = "Organization_Role_Reference")
    protected AssignableRoleObjectType organizationRoleReference;
    @XmlElement(name = "Organization_Role_Data")
    protected List<WorkerOrganizationRoleAssignmentDataType> organizationRoleData;

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
     * {@link WorkerOrganizationRoleAssignmentDataType }
     * 
     * 
     */
    public List<WorkerOrganizationRoleAssignmentDataType> getOrganizationRoleData() {
        if (organizationRoleData == null) {
            organizationRoleData = new ArrayList<WorkerOrganizationRoleAssignmentDataType>();
        }
        return this.organizationRoleData;
    }

}
