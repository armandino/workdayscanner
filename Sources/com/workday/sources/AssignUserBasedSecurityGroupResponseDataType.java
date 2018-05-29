
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element to return User-Based Security Group and its member Workday Accounts
 * 
 * <p>Java class for Assign_User-Based_Security_Group_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Assign_User-Based_Security_Group_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Assign_User-Based_Security_Group" type="{urn:com.workday/bsvc}Assign_User-Based_Security_GroupType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Assign_User-Based_Security_Group_Response_DataType", propOrder = {
    "assignUserBasedSecurityGroup"
})
public class AssignUserBasedSecurityGroupResponseDataType {

    @XmlElement(name = "Assign_User-Based_Security_Group")
    protected List<AssignUserBasedSecurityGroupType> assignUserBasedSecurityGroup;

    /**
     * Gets the value of the assignUserBasedSecurityGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignUserBasedSecurityGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignUserBasedSecurityGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssignUserBasedSecurityGroupType }
     * 
     * 
     */
    public List<AssignUserBasedSecurityGroupType> getAssignUserBasedSecurityGroup() {
        if (assignUserBasedSecurityGroup == null) {
            assignUserBasedSecurityGroup = new ArrayList<AssignUserBasedSecurityGroupType>();
        }
        return this.assignUserBasedSecurityGroup;
    }

}
