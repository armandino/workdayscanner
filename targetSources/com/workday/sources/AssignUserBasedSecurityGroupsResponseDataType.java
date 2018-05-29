
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response Data for retrieving Workday Accounts and their assigned User-Based Security Groups.
 * 
 * <p>Java class for Assign_User-Based_Security_Groups_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Assign_User-Based_Security_Groups_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Assign_User-Based_Security_Groups" type="{urn:com.workday/bsvc}Assign_User-Based_Security_GroupsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Assign_User-Based_Security_Groups_Response_DataType", propOrder = {
    "assignUserBasedSecurityGroups"
})
public class AssignUserBasedSecurityGroupsResponseDataType {

    @XmlElement(name = "Assign_User-Based_Security_Groups")
    protected List<AssignUserBasedSecurityGroupsType> assignUserBasedSecurityGroups;

    /**
     * Gets the value of the assignUserBasedSecurityGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignUserBasedSecurityGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignUserBasedSecurityGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssignUserBasedSecurityGroupsType }
     * 
     * 
     */
    public List<AssignUserBasedSecurityGroupsType> getAssignUserBasedSecurityGroups() {
        if (assignUserBasedSecurityGroups == null) {
            assignUserBasedSecurityGroups = new ArrayList<AssignUserBasedSecurityGroupsType>();
        }
        return this.assignUserBasedSecurityGroups;
    }

}
