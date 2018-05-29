
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the organization role refeference and the information about that role.
 * 
 * <p>Java class for Organization_Support_RoleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization_Support_RoleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Organization_Support_Role" type="{urn:com.workday/bsvc}Organization_Supporting_Role_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization_Support_RoleType", propOrder = {
    "organizationSupportRole"
})
public class OrganizationSupportRoleType {

    @XmlElement(name = "Organization_Support_Role")
    protected List<OrganizationSupportingRoleDataType> organizationSupportRole;

    /**
     * Gets the value of the organizationSupportRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationSupportRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationSupportRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationSupportingRoleDataType }
     * 
     * 
     */
    public List<OrganizationSupportingRoleDataType> getOrganizationSupportRole() {
        if (organizationSupportRole == null) {
            organizationSupportRole = new ArrayList<OrganizationSupportingRoleDataType>();
        }
        return this.organizationSupportRole;
    }

}
