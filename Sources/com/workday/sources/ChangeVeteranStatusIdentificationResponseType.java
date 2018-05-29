
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The response element containing all necessary information to assign a Veteran Status Identification for a Worker.
 * 
 * <p>Java class for Change_Veteran_Status_Identification_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Change_Veteran_Status_Identification_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Self-Identification_of_Veteran_Status_Event_Reference" type="{urn:com.workday/bsvc}Unique_IdentifierObjectType" minOccurs="0"/>
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
@XmlType(name = "Change_Veteran_Status_Identification_ResponseType", propOrder = {
    "selfIdentificationOfVeteranStatusEventReference"
})
public class ChangeVeteranStatusIdentificationResponseType {

    @XmlElement(name = "Self-Identification_of_Veteran_Status_Event_Reference")
    protected UniqueIdentifierObjectType selfIdentificationOfVeteranStatusEventReference;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the selfIdentificationOfVeteranStatusEventReference property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public UniqueIdentifierObjectType getSelfIdentificationOfVeteranStatusEventReference() {
        return selfIdentificationOfVeteranStatusEventReference;
    }

    /**
     * Sets the value of the selfIdentificationOfVeteranStatusEventReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public void setSelfIdentificationOfVeteranStatusEventReference(UniqueIdentifierObjectType value) {
        this.selfIdentificationOfVeteranStatusEventReference = value;
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
