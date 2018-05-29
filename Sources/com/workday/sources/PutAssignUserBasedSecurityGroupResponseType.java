
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Put Response for the Assign User-Based Security Groups to a Workday Account request.
 * 
 * <p>Java class for Put_Assign_User-Based_Security_Group_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Assign_User-Based_Security_Group_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="User-Based_Security_Group_Reference" type="{urn:com.workday/bsvc}User-Based_Security_GroupObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{urn:com.workday/bsvc}version"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Put_Assign_User-Based_Security_Group_ResponseType", propOrder = {
    "userBasedSecurityGroupReference"
})
public class PutAssignUserBasedSecurityGroupResponseType {

    @XmlElement(name = "User-Based_Security_Group_Reference")
    protected UserBasedSecurityGroupObjectType userBasedSecurityGroupReference;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

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
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
