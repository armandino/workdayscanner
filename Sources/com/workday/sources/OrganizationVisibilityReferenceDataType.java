
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference element representing a unique instance of Organization Visibility.
 * 
 * <p>Java class for Organization_Visibility_Reference_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization_Visibility_Reference_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Organization_Visibility_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization_Visibility_Reference_DataType", propOrder = {
    "organizationVisibilityName"
})
public class OrganizationVisibilityReferenceDataType {

    @XmlElement(name = "Organization_Visibility_Name", required = true)
    protected String organizationVisibilityName;

    /**
     * Gets the value of the organizationVisibilityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationVisibilityName() {
        return organizationVisibilityName;
    }

    /**
     * Sets the value of the organizationVisibilityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationVisibilityName(String value) {
        this.organizationVisibilityName = value;
    }

}
