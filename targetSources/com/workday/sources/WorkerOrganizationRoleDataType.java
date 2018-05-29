
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
 * <p>Java class for Worker_Organization_Role_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Organization_Role_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Organization_Role" type="{urn:com.workday/bsvc}Organization_Role_for_Worker_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Organization_Role_DataType", propOrder = {
    "organizationRole"
})
public class WorkerOrganizationRoleDataType {

    @XmlElement(name = "Organization_Role")
    protected List<OrganizationRoleForWorkerDataType> organizationRole;

    /**
     * Gets the value of the organizationRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationRoleForWorkerDataType }
     * 
     * 
     */
    public List<OrganizationRoleForWorkerDataType> getOrganizationRole() {
        if (organizationRole == null) {
            organizationRole = new ArrayList<OrganizationRoleForWorkerDataType>();
        }
        return this.organizationRole;
    }

}
