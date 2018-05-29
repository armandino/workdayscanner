
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Data element containing a Workday Account and the assigned User-Based Security Groups .
 * 
 * <p>Java class for Assign_User-Based_Security_Groups_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Assign_User-Based_Security_Groups_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Workday_Account_Reference" type="{urn:com.workday/bsvc}System_UserObjectType"/>
 *         &lt;element name="User-Based_Security_Group_Reference" type="{urn:com.workday/bsvc}User-Based_Security_GroupObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Assign_User-Based_Security_Groups_DataType", propOrder = {
    "workdayAccountReference",
    "userBasedSecurityGroupReference"
})
public class AssignUserBasedSecurityGroupsDataType {

    @XmlElement(name = "Workday_Account_Reference", required = true)
    protected SystemUserObjectType workdayAccountReference;
    @XmlElement(name = "User-Based_Security_Group_Reference")
    protected List<UserBasedSecurityGroupObjectType> userBasedSecurityGroupReference;

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

}
