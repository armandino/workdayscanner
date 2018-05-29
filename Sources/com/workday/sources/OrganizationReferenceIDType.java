
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Organization Reference ID Response Data
 * 
 * <p>Java class for Organization_Reference_IDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization_Reference_IDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Organization_Reference" type="{urn:com.workday/bsvc}OrganizationObjectType" minOccurs="0"/>
 *         &lt;element name="Organization_ID_Data" type="{urn:com.workday/bsvc}Organization_Reference_ID_Reference_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization_Reference_IDType", propOrder = {
    "organizationReference",
    "organizationIDData"
})
public class OrganizationReferenceIDType {

    @XmlElement(name = "Organization_Reference")
    protected OrganizationObjectType organizationReference;
    @XmlElement(name = "Organization_ID_Data")
    protected List<OrganizationReferenceIDReferenceDataType> organizationIDData;

    /**
     * Gets the value of the organizationReference property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationObjectType }
     *     
     */
    public OrganizationObjectType getOrganizationReference() {
        return organizationReference;
    }

    /**
     * Sets the value of the organizationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationObjectType }
     *     
     */
    public void setOrganizationReference(OrganizationObjectType value) {
        this.organizationReference = value;
    }

    /**
     * Gets the value of the organizationIDData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationIDData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationIDData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationReferenceIDReferenceDataType }
     * 
     * 
     */
    public List<OrganizationReferenceIDReferenceDataType> getOrganizationIDData() {
        if (organizationIDData == null) {
            organizationIDData = new ArrayList<OrganizationReferenceIDReferenceDataType>();
        }
        return this.organizationIDData;
    }

}
