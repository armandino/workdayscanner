
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The response group allows for the response data to be tailored to only included elements that the user is looking for.  If no response group is provided in the request, then only the following elements will be returned:  Reference, Organization Data, Hierarchy Data and if a Supervisory Organization Type the Supervisory Data.
 * 
 * <p>Java class for Organization_Response_GroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization_Response_GroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Include_Roles_Data" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Hierarchy_Data" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Supervisory_Data" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Staffing_Restrictions_Data" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization_Response_GroupType", propOrder = {
    "includeRolesData",
    "includeHierarchyData",
    "includeSupervisoryData",
    "includeStaffingRestrictionsData"
})
public class OrganizationResponseGroupType {

    @XmlElement(name = "Include_Roles_Data")
    protected Boolean includeRolesData;
    @XmlElement(name = "Include_Hierarchy_Data")
    protected Boolean includeHierarchyData;
    @XmlElement(name = "Include_Supervisory_Data")
    protected Boolean includeSupervisoryData;
    @XmlElement(name = "Include_Staffing_Restrictions_Data")
    protected Boolean includeStaffingRestrictionsData;

    /**
     * Gets the value of the includeRolesData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeRolesData() {
        return includeRolesData;
    }

    /**
     * Sets the value of the includeRolesData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeRolesData(Boolean value) {
        this.includeRolesData = value;
    }

    /**
     * Gets the value of the includeHierarchyData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeHierarchyData() {
        return includeHierarchyData;
    }

    /**
     * Sets the value of the includeHierarchyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeHierarchyData(Boolean value) {
        this.includeHierarchyData = value;
    }

    /**
     * Gets the value of the includeSupervisoryData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeSupervisoryData() {
        return includeSupervisoryData;
    }

    /**
     * Sets the value of the includeSupervisoryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeSupervisoryData(Boolean value) {
        this.includeSupervisoryData = value;
    }

    /**
     * Gets the value of the includeStaffingRestrictionsData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeStaffingRestrictionsData() {
        return includeStaffingRestrictionsData;
    }

    /**
     * Sets the value of the includeStaffingRestrictionsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeStaffingRestrictionsData(Boolean value) {
        this.includeStaffingRestrictionsData = value;
    }

}
