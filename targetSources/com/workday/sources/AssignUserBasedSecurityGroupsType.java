
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for a Workday Account and the User-Based Security Group assignment data.
 * 
 * <p>Java class for Assign_User-Based_Security_GroupsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Assign_User-Based_Security_GroupsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Workday_Account_Reference" type="{urn:com.workday/bsvc}System_UserObjectType" minOccurs="0"/>
 *         &lt;element name="Assign_User-Based_Security_Groups_Data" type="{urn:com.workday/bsvc}Assign_User-Based_Security_Groups_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Assign_User-Based_Security_GroupsType", propOrder = {
    "workdayAccountReference",
    "assignUserBasedSecurityGroupsData"
})
public class AssignUserBasedSecurityGroupsType {

    @XmlElement(name = "Workday_Account_Reference")
    protected SystemUserObjectType workdayAccountReference;
    @XmlElement(name = "Assign_User-Based_Security_Groups_Data")
    protected AssignUserBasedSecurityGroupsDataType assignUserBasedSecurityGroupsData;

    /**
     * Gets the value of the workdayAccountReference property.
     * 
     * @return
     *     possible object is
     *     {@link SystemUserObjectType }
     *     
     */
    public SystemUserObjectType getWorkdayAccountReference() {
        return workdayAccountReference;
    }

    /**
     * Sets the value of the workdayAccountReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemUserObjectType }
     *     
     */
    public void setWorkdayAccountReference(SystemUserObjectType value) {
        this.workdayAccountReference = value;
    }

    /**
     * Gets the value of the assignUserBasedSecurityGroupsData property.
     * 
     * @return
     *     possible object is
     *     {@link AssignUserBasedSecurityGroupsDataType }
     *     
     */
    public AssignUserBasedSecurityGroupsDataType getAssignUserBasedSecurityGroupsData() {
        return assignUserBasedSecurityGroupsData;
    }

    /**
     * Sets the value of the assignUserBasedSecurityGroupsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignUserBasedSecurityGroupsDataType }
     *     
     */
    public void setAssignUserBasedSecurityGroupsData(AssignUserBasedSecurityGroupsDataType value) {
        this.assignUserBasedSecurityGroupsData = value;
    }

}
