
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the roles that a worker holds.
 * 
 * <p>Java class for Worker_Role_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Role_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Organization_Role_Data" type="{urn:com.workday/bsvc}Worker_Organization_Role_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Role_DataType", propOrder = {
    "organizationRoleData"
})
public class WorkerRoleDataType {

    @XmlElement(name = "Organization_Role_Data")
    protected WorkerOrganizationRoleDataType organizationRoleData;

    /**
     * Gets the value of the organizationRoleData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerOrganizationRoleDataType }
     *     
     */
    public WorkerOrganizationRoleDataType getOrganizationRoleData() {
        return organizationRoleData;
    }

    /**
     * Sets the value of the organizationRoleData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerOrganizationRoleDataType }
     *     
     */
    public void setOrganizationRoleData(WorkerOrganizationRoleDataType value) {
        this.organizationRoleData = value;
    }

}
