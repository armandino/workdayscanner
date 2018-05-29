
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Home Contact Change Event created by the corresponding request.
 * 
 * <p>Java class for Change_Home_Contact_Information_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Change_Home_Contact_Information_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Change_Home_Contact_Information_Event_Reference" type="{urn:com.workday/bsvc}Unique_IdentifierObjectType" minOccurs="0"/>
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
@XmlType(name = "Change_Home_Contact_Information_ResponseType", propOrder = {
    "changeHomeContactInformationEventReference"
})
public class ChangeHomeContactInformationResponseType {

    @XmlElement(name = "Change_Home_Contact_Information_Event_Reference")
    protected UniqueIdentifierObjectType changeHomeContactInformationEventReference;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the changeHomeContactInformationEventReference property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public UniqueIdentifierObjectType getChangeHomeContactInformationEventReference() {
        return changeHomeContactInformationEventReference;
    }

    /**
     * Sets the value of the changeHomeContactInformationEventReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public void setChangeHomeContactInformationEventReference(UniqueIdentifierObjectType value) {
        this.changeHomeContactInformationEventReference = value;
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
