
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Put Organization Assignment Restrictions Response
 * 
 * <p>Java class for Put_Organization_Assignment_Restrictions_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Organization_Assignment_Restrictions_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Supervisory_Organization_Reference" type="{urn:com.workday/bsvc}Supervisory_OrganizationObjectType" minOccurs="0"/>
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
@XmlType(name = "Put_Organization_Assignment_Restrictions_ResponseType", propOrder = {
    "supervisoryOrganizationReference"
})
public class PutOrganizationAssignmentRestrictionsResponseType {

    @XmlElement(name = "Supervisory_Organization_Reference")
    protected SupervisoryOrganizationObjectType supervisoryOrganizationReference;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the supervisoryOrganizationReference property.
     * 
     * @return
     *     possible object is
     *     {@link SupervisoryOrganizationObjectType }
     *     
     */
    public SupervisoryOrganizationObjectType getSupervisoryOrganizationReference() {
        return supervisoryOrganizationReference;
    }

    /**
     * Sets the value of the supervisoryOrganizationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupervisoryOrganizationObjectType }
     *     
     */
    public void setSupervisoryOrganizationReference(SupervisoryOrganizationObjectType value) {
        this.supervisoryOrganizationReference = value;
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
