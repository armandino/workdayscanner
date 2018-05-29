
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Utilize the following elements to add (or update, if already existing) a new Organization into the Workday system. A new effective-dated organization name is automatically created if any attributes used for organization name are different as of specified effective date.
 * 
 * <p>Java class for Organization_Add_UpdateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization_Add_UpdateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Organization_Data" type="{urn:com.workday/bsvc}Organization_DataType"/>
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
@XmlType(name = "Organization_Add_UpdateType", propOrder = {
    "organizationData"
})
public class OrganizationAddUpdateType {

    @XmlElement(name = "Organization_Data", required = true)
    protected OrganizationDataType organizationData;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the organizationData property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationDataType }
     *     
     */
    public OrganizationDataType getOrganizationData() {
        return organizationData;
    }

    /**
     * Sets the value of the organizationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationDataType }
     *     
     */
    public void setOrganizationData(OrganizationDataType value) {
        this.organizationData = value;
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
