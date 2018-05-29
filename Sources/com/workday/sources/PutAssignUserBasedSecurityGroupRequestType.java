
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Put Request Element for assigning Workday Accounts to a User-Based Security Group
 * 
 * <p>Java class for Put_Assign_User-Based_Security_Group_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Assign_User-Based_Security_Group_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Assign_User-Based_Security_Group_Data" type="{urn:com.workday/bsvc}Assign_User-Based_Security_Group_DataType"/>
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
@XmlType(name = "Put_Assign_User-Based_Security_Group_RequestType", propOrder = {
    "assignUserBasedSecurityGroupData"
})
public class PutAssignUserBasedSecurityGroupRequestType {

    @XmlElement(name = "Assign_User-Based_Security_Group_Data", required = true)
    protected AssignUserBasedSecurityGroupDataType assignUserBasedSecurityGroupData;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

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
