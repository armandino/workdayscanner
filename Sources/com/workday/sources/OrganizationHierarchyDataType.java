
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains information regarding organizations just adjacent in the hierarchy.
 * 
 * <p>Java class for Organization_Hierarchy_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization_Hierarchy_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Top-Level_Organization_Reference" type="{urn:com.workday/bsvc}OrganizationObjectType" minOccurs="0"/>
 *         &lt;element name="Superior_Organization_Reference" type="{urn:com.workday/bsvc}OrganizationObjectType" minOccurs="0"/>
 *         &lt;element name="Subordinate_Organization_Reference" type="{urn:com.workday/bsvc}OrganizationObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Included_Organization_Reference" type="{urn:com.workday/bsvc}OrganizationObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Included_In_Organization_Reference" type="{urn:com.workday/bsvc}OrganizationObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization_Hierarchy_DataType", propOrder = {
    "topLevelOrganizationReference",
    "superiorOrganizationReference",
    "subordinateOrganizationReference",
    "includedOrganizationReference",
    "includedInOrganizationReference"
})
public class OrganizationHierarchyDataType {

    @XmlElement(name = "Top-Level_Organization_Reference")
    protected OrganizationObjectType topLevelOrganizationReference;
    @XmlElement(name = "Superior_Organization_Reference")
    protected OrganizationObjectType superiorOrganizationReference;
    @XmlElement(name = "Subordinate_Organization_Reference")
    protected List<OrganizationObjectType> subordinateOrganizationReference;
    @XmlElement(name = "Included_Organization_Reference")
    protected List<OrganizationObjectType> includedOrganizationReference;
    @XmlElement(name = "Included_In_Organization_Reference")
    protected List<OrganizationObjectType> includedInOrganizationReference;

    /**
     * Gets the value of the topLevelOrganizationReference property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationObjectType }
     *     
     */
    public OrganizationObjectType getTopLevelOrganizationReference() {
        return topLevelOrganizationReference;
    }

    /**
     * Sets the value of the topLevelOrganizationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationObjectType }
     *     
     */
    public void setTopLevelOrganizationReference(OrganizationObjectType value) {
        this.topLevelOrganizationReference = value;
    }

    /**
     * Gets the value of the superiorOrganizationReference property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationObjectType }
     *     
     */
    public OrganizationObjectType getSuperiorOrganizationReference() {
        return superiorOrganizationReference;
    }

    /**
     * Sets the value of the superiorOrganizationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationObjectType }
     *     
     */
    public void setSuperiorOrganizationReference(OrganizationObjectType value) {
        this.superiorOrganizationReference = value;
    }

    /**
     * Gets the value of the subordinateOrganizationReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subordinateOrganizationReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubordinateOrganizationReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationObjectType }
     * 
     * 
     */
    public List<OrganizationObjectType> getSubordinateOrganizationReference() {
        if (subordinateOrganizationReference == null) {
            subordinateOrganizationReference = new ArrayList<OrganizationObjectType>();
        }
        return this.subordinateOrganizationReference;
    }

    /**
     * Gets the value of the includedOrganizationReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includedOrganizationReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludedOrganizationReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationObjectType }
     * 
     * 
     */
    public List<OrganizationObjectType> getIncludedOrganizationReference() {
        if (includedOrganizationReference == null) {
            includedOrganizationReference = new ArrayList<OrganizationObjectType>();
        }
        return this.includedOrganizationReference;
    }

    /**
     * Gets the value of the includedInOrganizationReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includedInOrganizationReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludedInOrganizationReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationObjectType }
     * 
     * 
     */
    public List<OrganizationObjectType> getIncludedInOrganizationReference() {
        if (includedInOrganizationReference == null) {
            includedInOrganizationReference = new ArrayList<OrganizationObjectType>();
        }
        return this.includedInOrganizationReference;
    }

}
