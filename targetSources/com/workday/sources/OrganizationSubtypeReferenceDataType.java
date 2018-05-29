
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference element representing a unique instance of Organization Subtype.
 * 
 * <p>Java class for Organization_Subtype_Reference_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization_Subtype_Reference_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Organization_Subtype_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization_Subtype_Reference_DataType", propOrder = {
    "organizationSubtypeName"
})
public class OrganizationSubtypeReferenceDataType {

    @XmlElement(name = "Organization_Subtype_Name", required = true)
    protected String organizationSubtypeName;

    /**
     * Gets the value of the organizationSubtypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationSubtypeName() {
        return organizationSubtypeName;
    }

    /**
     * Sets the value of the organizationSubtypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationSubtypeName(String value) {
        this.organizationSubtypeName = value;
    }

}
