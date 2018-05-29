
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Holds data for Organization Reference ID
 * 
 * <p>Java class for Organization_Reference_ID_Reference_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization_Reference_ID_Reference_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Organization_Reference_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organization_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Include_Organization_ID_in_Name" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization_Reference_ID_Reference_DataType", propOrder = {
    "organizationReferenceID",
    "organizationName",
    "includeOrganizationIDInName"
})
public class OrganizationReferenceIDReferenceDataType {

    @XmlElement(name = "Organization_Reference_ID")
    protected String organizationReferenceID;
    @XmlElement(name = "Organization_Name")
    protected String organizationName;
    @XmlElement(name = "Include_Organization_ID_in_Name")
    protected Boolean includeOrganizationIDInName;

    /**
     * Gets the value of the organizationReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationReferenceID() {
        return organizationReferenceID;
    }

    /**
     * Sets the value of the organizationReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationReferenceID(String value) {
        this.organizationReferenceID = value;
    }

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationName(String value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the includeOrganizationIDInName property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeOrganizationIDInName() {
        return includeOrganizationIDInName;
    }

    /**
     * Sets the value of the includeOrganizationIDInName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeOrganizationIDInName(Boolean value) {
        this.includeOrganizationIDInName = value;
    }

}
