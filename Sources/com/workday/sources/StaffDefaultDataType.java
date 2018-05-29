
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Default Organization Data
 * 
 * <p>Java class for Staff_Default_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Staff_Default_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Default_Organization_Reference" type="{urn:com.workday/bsvc}StaffObjectType" minOccurs="0"/>
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
@XmlType(name = "Staff_Default_DataType", propOrder = {
    "defaultOrganizationReference"
})
public class StaffDefaultDataType {

    @XmlElement(name = "Default_Organization_Reference")
    protected StaffObjectType defaultOrganizationReference;
    @XmlAttribute(name = "Delete", namespace = "urn:com.workday/bsvc")
    protected Boolean delete;

    /**
     * Gets the value of the defaultOrganizationReference property.
     * 
     * @return
     *     possible object is
     *     {@link StaffObjectType }
     *     
     */
    public StaffObjectType getDefaultOrganizationReference() {
        return defaultOrganizationReference;
    }

    /**
     * Sets the value of the defaultOrganizationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link StaffObjectType }
     *     
     */
    public void setDefaultOrganizationReference(StaffObjectType value) {
        this.defaultOrganizationReference = value;
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
