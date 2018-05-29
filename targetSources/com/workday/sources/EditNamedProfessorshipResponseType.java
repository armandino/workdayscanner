
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper for Edit Named Professorship Web Service Response
 * 
 * <p>Java class for Edit_Named_Professorship_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Edit_Named_Professorship_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Event_Reference" type="{urn:com.workday/bsvc}Unique_IdentifierObjectType" minOccurs="0"/>
 *         &lt;element name="Gift_Reference" type="{urn:com.workday/bsvc}GiftObjectType" minOccurs="0"/>
 *         &lt;element name="Named_Professorship_Reference" type="{urn:com.workday/bsvc}Named_ProfessorshipObjectType" minOccurs="0"/>
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
@XmlType(name = "Edit_Named_Professorship_ResponseType", propOrder = {
    "eventReference",
    "giftReference",
    "namedProfessorshipReference"
})
public class EditNamedProfessorshipResponseType {

    @XmlElement(name = "Event_Reference")
    protected UniqueIdentifierObjectType eventReference;
    @XmlElement(name = "Gift_Reference")
    protected GiftObjectType giftReference;
    @XmlElement(name = "Named_Professorship_Reference")
    protected NamedProfessorshipObjectType namedProfessorshipReference;
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
     * Gets the value of the giftReference property.
     * 
     * @return
     *     possible object is
     *     {@link GiftObjectType }
     *     
     */
    public GiftObjectType getGiftReference() {
        return giftReference;
    }

    /**
     * Sets the value of the giftReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link GiftObjectType }
     *     
     */
    public void setGiftReference(GiftObjectType value) {
        this.giftReference = value;
    }

    /**
     * Gets the value of the namedProfessorshipReference property.
     * 
     * @return
     *     possible object is
     *     {@link NamedProfessorshipObjectType }
     *     
     */
    public NamedProfessorshipObjectType getNamedProfessorshipReference() {
        return namedProfessorshipReference;
    }

    /**
     * Sets the value of the namedProfessorshipReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedProfessorshipObjectType }
     *     
     */
    public void setNamedProfessorshipReference(NamedProfessorshipObjectType value) {
        this.namedProfessorshipReference = value;
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
