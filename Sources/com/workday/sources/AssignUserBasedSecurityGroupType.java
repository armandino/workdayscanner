
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element to include Optional User-Based Security Group Reference and the Element with  User-Based Security Group and its member Workday Accounts
 * 
 * <p>Java class for Assign_User-Based_Security_GroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Assign_User-Based_Security_GroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="User-Based_Security_Group_Reference" type="{urn:com.workday/bsvc}User-Based_Security_GroupObjectType" minOccurs="0"/>
 *         &lt;element name="Assign_User-Based_Security_Group_Data" type="{urn:com.workday/bsvc}Assign_User-Based_Security_Group_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Assign_User-Based_Security_GroupType", propOrder = {
    "userBasedSecurityGroupReference",
    "assignUserBasedSecurityGroupData"
})
public class AssignUserBasedSecurityGroupType {

    @XmlElement(name = "User-Based_Security_Group_Reference")
    protected UserBasedSecurityGroupObjectType userBasedSecurityGroupReference;
    @XmlElement(name = "Assign_User-Based_Security_Group_Data")
    protected AssignUserBasedSecurityGroupDataType assignUserBasedSecurityGroupData;

    /**
     * Gets the value of the userBasedSecurityGroupReference property.
     * 
     * @return
     *     possible object is
     *     {@link UserBasedSecurityGroupObjectType }
     *     
     */
    public UserBasedSecurityGroupObjectType getUserBasedSecurityGroupReference() {
        return userBasedSecurityGroupReference;
    }

    /**
     * Sets the value of the userBasedSecurityGroupReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserBasedSecurityGroupObjectType }
     *     
     */
    public void setUserBasedSecurityGroupReference(UserBasedSecurityGroupObjectType value) {
        this.userBasedSecurityGroupReference = value;
    }

    /**
     * Gets the value of the assignUserBasedSecurityGroupData property.
     * 
     * @return
     *     possible object is
     *     {@link AssignUserBasedSecurityGroupDataType }
     *     
     */
    public AssignUserBasedSecurityGroupDataType getAssignUserBasedSecurityGroupData() {
        return assignUserBasedSecurityGroupData;
    }

    /**
     * Sets the value of the assignUserBasedSecurityGroupData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignUserBasedSecurityGroupDataType }
     *     
     */
    public void setAssignUserBasedSecurityGroupData(AssignUserBasedSecurityGroupDataType value) {
        this.assignUserBasedSecurityGroupData = value;
    }

}
