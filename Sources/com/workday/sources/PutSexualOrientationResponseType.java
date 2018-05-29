
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The response to the sexual orientation put request.
 * 
 * <p>Java class for Put_Sexual_Orientation_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Sexual_Orientation_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sexual_Orientation_Reference" type="{urn:com.workday/bsvc}Sexual_OrientationObjectType" minOccurs="0"/>
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
@XmlType(name = "Put_Sexual_Orientation_ResponseType", propOrder = {
    "sexualOrientationReference"
})
public class PutSexualOrientationResponseType {

    @XmlElement(name = "Sexual_Orientation_Reference")
    protected SexualOrientationObjectType sexualOrientationReference;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the sexualOrientationReference property.
     * 
     * @return
     *     possible object is
     *     {@link SexualOrientationObjectType }
     *     
     */
    public SexualOrientationObjectType getSexualOrientationReference() {
        return sexualOrientationReference;
    }

    /**
     * Sets the value of the sexualOrientationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SexualOrientationObjectType }
     *     
     */
    public void setSexualOrientationReference(SexualOrientationObjectType value) {
        this.sexualOrientationReference = value;
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
