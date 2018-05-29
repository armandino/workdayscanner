
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains details specific to a Supervisory Organization.
 * 
 * <p>Java class for Supervisory_Org_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Supervisory_Org_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Staffing_Model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location_Reference" type="{urn:com.workday/bsvc}LocationObjectType" minOccurs="0"/>
 *         &lt;element name="Organization_Assignments_Data" type="{urn:com.workday/bsvc}Organization_Assignments_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Staffing_Restrictions_Data" type="{urn:com.workday/bsvc}Position_Group_Restriction_Summary_DataType" minOccurs="0"/>
 *         &lt;element name="Available_For_Hire" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Hiring_Freeze" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Supervisory_Org_DataType", propOrder = {
    "staffingModel",
    "locationReference",
    "organizationAssignmentsData",
    "staffingRestrictionsData",
    "availableForHire",
    "hiringFreeze"
})
public class SupervisoryOrgDataType {

    @XmlElement(name = "Staffing_Model")
    protected String staffingModel;
    @XmlElement(name = "Location_Reference")
    protected LocationObjectType locationReference;
    @XmlElement(name = "Organization_Assignments_Data")
    protected List<OrganizationAssignmentsDataType> organizationAssignmentsData;
    @XmlElement(name = "Staffing_Restrictions_Data")
    protected PositionGroupRestrictionSummaryDataType staffingRestrictionsData;
    @XmlElement(name = "Available_For_Hire")
    protected Boolean availableForHire;
    @XmlElement(name = "Hiring_Freeze")
    protected Boolean hiringFreeze;

    /**
     * Gets the value of the staffingModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffingModel() {
        return staffingModel;
    }

    /**
     * Sets the value of the staffingModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffingModel(String value) {
        this.staffingModel = value;
    }

    /**
     * Gets the value of the locationReference property.
     * 
     * @return
     *     possible object is
     *     {@link LocationObjectType }
     *     
     */
    public LocationObjectType getLocationReference() {
        return locationReference;
    }

    /**
     * Sets the value of the locationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationObjectType }
     *     
     */
    public void setLocationReference(LocationObjectType value) {
        this.locationReference = value;
    }

    /**
     * Gets the value of the organizationAssignmentsData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationAssignmentsData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationAssignmentsData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationAssignmentsDataType }
     * 
     * 
     */
    public List<OrganizationAssignmentsDataType> getOrganizationAssignmentsData() {
        if (organizationAssignmentsData == null) {
            organizationAssignmentsData = new ArrayList<OrganizationAssignmentsDataType>();
        }
        return this.organizationAssignmentsData;
    }

    /**
     * Gets the value of the staffingRestrictionsData property.
     * 
     * @return
     *     possible object is
     *     {@link PositionGroupRestrictionSummaryDataType }
     *     
     */
    public PositionGroupRestrictionSummaryDataType getStaffingRestrictionsData() {
        return staffingRestrictionsData;
    }

    /**
     * Sets the value of the staffingRestrictionsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionGroupRestrictionSummaryDataType }
     *     
     */
    public void setStaffingRestrictionsData(PositionGroupRestrictionSummaryDataType value) {
        this.staffingRestrictionsData = value;
    }

    /**
     * Gets the value of the availableForHire property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvailableForHire() {
        return availableForHire;
    }

    /**
     * Sets the value of the availableForHire property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvailableForHire(Boolean value) {
        this.availableForHire = value;
    }

    /**
     * Gets the value of the hiringFreeze property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHiringFreeze() {
        return hiringFreeze;
    }

    /**
     * Sets the value of the hiringFreeze property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHiringFreeze(Boolean value) {
        this.hiringFreeze = value;
    }

}
