
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Organization Assignment Restrictions by Type Data
 * 
 * <p>Java class for Organization_Assignment_Restrictions_by_Type_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization_Assignment_Restrictions_by_Type_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Organization_Type_Reference" type="{urn:com.workday/bsvc}Organization_TypeObjectType"/>
 *         &lt;element name="Allowed_Organization_Data" type="{urn:com.workday/bsvc}Staff_Allowed_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Default_Organization_Data" type="{urn:com.workday/bsvc}Staff_Default_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization_Assignment_Restrictions_by_Type_DataType", propOrder = {
    "organizationTypeReference",
    "allowedOrganizationData",
    "defaultOrganizationData"
})
public class OrganizationAssignmentRestrictionsByTypeDataType {

    @XmlElement(name = "Organization_Type_Reference", required = true)
    protected OrganizationTypeObjectType organizationTypeReference;
    @XmlElement(name = "Allowed_Organization_Data")
    protected List<StaffAllowedDataType> allowedOrganizationData;
    @XmlElement(name = "Default_Organization_Data")
    protected List<StaffDefaultDataType> defaultOrganizationData;

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
     * Gets the value of the allowedOrganizationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedOrganizationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedOrganizationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StaffAllowedDataType }
     * 
     * 
     */
    public List<StaffAllowedDataType> getAllowedOrganizationData() {
        if (allowedOrganizationData == null) {
            allowedOrganizationData = new ArrayList<StaffAllowedDataType>();
        }
        return this.allowedOrganizationData;
    }

    /**
     * Gets the value of the defaultOrganizationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defaultOrganizationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefaultOrganizationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StaffDefaultDataType }
     * 
     * 
     */
    public List<StaffDefaultDataType> getDefaultOrganizationData() {
        if (defaultOrganizationData == null) {
            defaultOrganizationData = new ArrayList<StaffDefaultDataType>();
        }
        return this.defaultOrganizationData;
    }

}
