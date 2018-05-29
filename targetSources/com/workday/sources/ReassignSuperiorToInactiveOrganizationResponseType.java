
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Responds with the Event ID for the Assign Superior Event.
 * 
 * <p>Java class for Reassign_Superior_to_Inactive_Organization_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Reassign_Superior_to_Inactive_Organization_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Event_Reference" type="{urn:com.workday/bsvc}Unique_IdentifierObjectType" minOccurs="0"/>
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
@XmlType(name = "Reassign_Superior_to_Inactive_Organization_ResponseType", propOrder = {
    "eventReference"
})
public class ReassignSuperiorToInactiveOrganizationResponseType {

    @XmlElement(name = "Event_Reference")
    protected UniqueIdentifierObjectType eventReference;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the eventReference property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public UniqueIdentifierObjectType getEventReference() {
        return eventReference;
    }

    /**
     * Sets the value of the eventReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public void setEventReference(UniqueIdentifierObjectType value) {
        this.eventReference = value;
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
