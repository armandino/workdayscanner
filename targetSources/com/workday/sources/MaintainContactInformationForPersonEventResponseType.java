
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Contact Information for Person Event created by the corresponding request
 * 
 * <p>Java class for Maintain_Contact_Information_for_Person_Event_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Maintain_Contact_Information_for_Person_Event_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Contact_Information_for_Person_Event_Reference" type="{urn:com.workday/bsvc}Unique_IdentifierObjectType" minOccurs="0"/>
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
@XmlType(name = "Maintain_Contact_Information_for_Person_Event_ResponseType", propOrder = {
    "contactInformationForPersonEventReference"
})
public class MaintainContactInformationForPersonEventResponseType {

    @XmlElement(name = "Contact_Information_for_Person_Event_Reference")
    protected UniqueIdentifierObjectType contactInformationForPersonEventReference;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the contactInformationForPersonEventReference property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public UniqueIdentifierObjectType getContactInformationForPersonEventReference() {
        return contactInformationForPersonEventReference;
    }

    /**
     * Sets the value of the contactInformationForPersonEventReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public void setContactInformationForPersonEventReference(UniqueIdentifierObjectType value) {
        this.contactInformationForPersonEventReference = value;
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
