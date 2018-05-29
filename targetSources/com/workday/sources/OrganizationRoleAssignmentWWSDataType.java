
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains information about organization role assignments.
 * 
 * <p>Java class for Organization_Role_Assignment_WWS_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization_Role_Assignment_WWS_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Role_Reference" type="{urn:com.workday/bsvc}Assignable_RoleObjectType" minOccurs="0"/>
 *         &lt;element name="Worker_Reference" type="{urn:com.workday/bsvc}WorkerObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization_Role_Assignment_WWS_DataType", propOrder = {
    "roleReference",
    "workerReference"
})
public class OrganizationRoleAssignmentWWSDataType {

    @XmlElement(name = "Role_Reference")
    protected AssignableRoleObjectType roleReference;
    @XmlElement(name = "Worker_Reference")
    protected List<WorkerObjectType> workerReference;

    /**
     * Gets the value of the roleReference property.
     * 
     * @return
     *     possible object is
     *     {@link AssignableRoleObjectType }
     *     
     */
    public AssignableRoleObjectType getRoleReference() {
        return roleReference;
    }

    /**
     * Sets the value of the roleReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignableRoleObjectType }
     *     
     */
    public void setRoleReference(AssignableRoleObjectType value) {
        this.roleReference = value;
    }

    /**
     * Gets the value of the workerReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workerReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkerReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkerObjectType }
     * 
     * 
     */
    public List<WorkerObjectType> getWorkerReference() {
        if (workerReference == null) {
            workerReference = new ArrayList<WorkerObjectType>();
        }
        return this.workerReference;
    }

}
