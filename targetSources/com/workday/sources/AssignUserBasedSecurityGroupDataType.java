
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Data element containing User-Based Security Group and Workday Accounts
 * 
 * <p>Java class for Assign_User-Based_Security_Group_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Assign_User-Based_Security_Group_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="User-Based_Security_Group_Reference" type="{urn:com.workday/bsvc}User-Based_Security_GroupObjectType"/>
 *         &lt;element name="Workday_Account_Reference" type="{urn:com.workday/bsvc}System_UserObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Assign_User-Based_Security_Group_DataType", propOrder = {
    "userBasedSecurityGroupReference",
    "workdayAccountReference"
})
public class AssignUserBasedSecurityGroupDataType {

    @XmlElement(name = "User-Based_Security_Group_Reference", required = true)
    protected UserBasedSecurityGroupObjectType userBasedSecurityGroupReference;
    @XmlElement(name = "Workday_Account_Reference")
    protected List<SystemUserObjectType> workdayAccountReference;

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
     * Gets the value of the workdayAccountReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workdayAccountReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkdayAccountReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemUserObjectType }
     * 
     * 
     */
    public List<SystemUserObjectType> getWorkdayAccountReference() {
        if (workdayAccountReference == null) {
            workdayAccountReference = new ArrayList<SystemUserObjectType>();
        }
        return this.workdayAccountReference;
    }

}
