
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request References element for retrieving specific User-Based Security Groups and their member Workday Accounts
 * 
 * <p>Java class for User-Based_Security_Group_Request_ReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="User-Based_Security_Group_Request_ReferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "User-Based_Security_Group_Request_ReferencesType", propOrder = {
    "userBasedSecurityGroupReference"
})
public class UserBasedSecurityGroupRequestReferencesType {

    @XmlElement(name = "User-Based_Security_Group_Reference")
    protected List<UserBasedSecurityGroupObjectType> userBasedSecurityGroupReference;

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
