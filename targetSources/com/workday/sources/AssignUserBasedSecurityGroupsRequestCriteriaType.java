
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element containing the Request Criteria for Assign User-Based Security groups
 * 
 * <p>Java class for Assign_User-Based_Security_Groups_Request_CriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Assign_User-Based_Security_Groups_Request_CriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Workday_Account_User_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="User-Based_Security_Group_Reference" type="{urn:com.workday/bsvc}User-Based_Security_GroupObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="User-Based_Security_Group_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Assign_User-Based_Security_Groups_Request_CriteriaType", propOrder = {
    "workdayAccountUserName",
    "userBasedSecurityGroupReference",
    "userBasedSecurityGroupName"
})
public class AssignUserBasedSecurityGroupsRequestCriteriaType {

    @XmlElement(name = "Workday_Account_User_Name")
    protected String workdayAccountUserName;
    @XmlElement(name = "User-Based_Security_Group_Reference")
    protected List<UserBasedSecurityGroupObjectType> userBasedSecurityGroupReference;
    @XmlElement(name = "User-Based_Security_Group_Name")
    protected String userBasedSecurityGroupName;

    /**
     * Gets the value of the workdayAccountUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkdayAccountUserName() {
        return workdayAccountUserName;
    }

    /**
     * Sets the value of the workdayAccountUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkdayAccountUserName(String value) {
        this.workdayAccountUserName = value;
    }

    /**
     * Gets the value of the userBasedSecurityGroupReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userBasedSecurityGroupReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserBasedSecurityGroupReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserBasedSecurityGroupObjectType }
     * 
     * 
     */
    public List<UserBasedSecurityGroupObjectType> getUserBasedSecurityGroupReference() {
        if (userBasedSecurityGroupReference == null) {
            userBasedSecurityGroupReference = new ArrayList<UserBasedSecurityGroupObjectType>();
        }
        return this.userBasedSecurityGroupReference;
    }

    /**
     * Gets the value of the userBasedSecurityGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserBasedSecurityGroupName() {
        return userBasedSecurityGroupName;
    }

    /**
     * Sets the value of the userBasedSecurityGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserBasedSecurityGroupName(String value) {
        this.userBasedSecurityGroupName = value;
    }

}
