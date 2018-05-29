
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Put Establishment Response
 * 
 * <p>Java class for Put_Establishment_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Establishment_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Establishment_Reference" type="{urn:com.workday/bsvc}EstablishmentObjectType" minOccurs="0"/>
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
@XmlType(name = "Put_Establishment_ResponseType", propOrder = {
    "establishmentReference"
})
public class PutEstablishmentResponseType {

    @XmlElement(name = "Establishment_Reference")
    protected EstablishmentObjectType establishmentReference;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the establishmentReference property.
     * 
     * @return
     *     possible object is
     *     {@link EstablishmentObjectType }
     *     
     */
    public EstablishmentObjectType getEstablishmentReference() {
        return establishmentReference;
    }

    /**
     * Sets the value of the establishmentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstablishmentObjectType }
     *     
     */
    public void setEstablishmentReference(EstablishmentObjectType value) {
        this.establishmentReference = value;
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
