
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Input Element for Organization Type and Allowed Organizations data.
 * 
 * <p>Java class for Location_Hierarchy_Organization_Assignments_by_Type_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Location_Hierarchy_Organization_Assignments_by_Type_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Organization_Type_Reference" type="{urn:com.workday/bsvc}Organization_TypeObjectType"/>
 *         &lt;element name="Allowed_Organization_Reference" type="{urn:com.workday/bsvc}StaffObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Delete" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location_Hierarchy_Organization_Assignments_by_Type_DataType", propOrder = {
    "organizationTypeReference",
    "allowedOrganizationReference"
})
public class LocationHierarchyOrganizationAssignmentsByTypeDataType {

    @XmlElement(name = "Organization_Type_Reference", required = true)
    protected OrganizationTypeObjectType organizationTypeReference;
    @XmlElement(name = "Allowed_Organization_Reference")
    protected List<StaffObjectType> allowedOrganizationReference;
    @XmlAttribute(name = "Delete", namespace = "urn:com.workday/bsvc")
    protected Boolean delete;

    /**
     * Gets the value of the organizationTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationTypeObjectType }
     *     
     */
    public OrganizationTypeObjectType getOrganizationTypeReference() {
        return organizationTypeReference;
    }

    /**
     * Sets the value of the organizationTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationTypeObjectType }
     *     
     */
    public void setOrganizationTypeReference(OrganizationTypeObjectType value) {
        this.organizationTypeReference = value;
    }

    /**
     * Gets the value of the allowedOrganizationReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedOrganizationReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedOrganizationReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StaffObjectType }
     * 
     * 
     */
    public List<StaffObjectType> getAllowedOrganizationReference() {
        if (allowedOrganizationReference == null) {
            allowedOrganizationReference = new ArrayList<StaffObjectType>();
        }
        return this.allowedOrganizationReference;
    }

    /**
     * Gets the value of the delete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelete() {
        return delete;
    }

    /**
     * Sets the value of the delete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelete(Boolean value) {
        this.delete = value;
    }

}
