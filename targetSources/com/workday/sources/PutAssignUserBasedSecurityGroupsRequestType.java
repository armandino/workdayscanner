
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Put Request element for assigning User-Based Security Groups to a Workday Account.
 * 
 * <p>Java class for Put_Assign_User-Based_Security_Groups_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Assign_User-Based_Security_Groups_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Assign_User-Based_Security_Groups_Data" type="{urn:com.workday/bsvc}Assign_User-Based_Security_Groups_DataType" minOccurs="0"/>
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
@XmlType(name = "Put_Assign_User-Based_Security_Groups_RequestType", propOrder = {
    "assignUserBasedSecurityGroupsData"
})
public class PutAssignUserBasedSecurityGroupsRequestType {

    @XmlElement(name = "Assign_User-Based_Security_Groups_Data")
    protected AssignUserBasedSecurityGroupsDataType assignUserBasedSecurityGroupsData;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

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
