
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element wrapping the controls what information is returned in the Response Data content
 * 
 * <p>Java class for Assign_User-Based_Security_Groups_Response_GroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Assign_User-Based_Security_Groups_Response_GroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Include_Reference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_User-Based_Security_Group_Assignment_Data" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Assign_User-Based_Security_Groups_Response_GroupType", propOrder = {
    "includeReference",
    "includeUserBasedSecurityGroupAssignmentData"
})
public class AssignUserBasedSecurityGroupsResponseGroupType {

    @XmlElement(name = "Include_Reference")
    protected Boolean includeReference;
    @XmlElement(name = "Include_User-Based_Security_Group_Assignment_Data")
    protected Boolean includeUserBasedSecurityGroupAssignmentData;

    /**
     * Gets the value of the includeReference property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeReference() {
        return includeReference;
    }

    /**
     * Sets the value of the includeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeReference(Boolean value) {
        this.includeReference = value;
    }

    /**
     * Gets the value of the includeUserBasedSecurityGroupAssignmentData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeUserBasedSecurityGroupAssignmentData() {
        return includeUserBasedSecurityGroupAssignmentData;
    }

    /**
     * Sets the value of the includeUserBasedSecurityGroupAssignmentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeUserBasedSecurityGroupAssignmentData(Boolean value) {
        this.includeUserBasedSecurityGroupAssignmentData = value;
    }

}
