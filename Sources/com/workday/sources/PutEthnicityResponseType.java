
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response element for Put Ethnicity
 * 
 * <p>Java class for Put_Ethnicity_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Ethnicity_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ethnicity_Reference" type="{urn:com.workday/bsvc}EthnicityObjectType" minOccurs="0"/>
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
@XmlType(name = "Put_Ethnicity_ResponseType", propOrder = {
    "ethnicityReference"
})
public class PutEthnicityResponseType {

    @XmlElement(name = "Ethnicity_Reference")
    protected EthnicityObjectType ethnicityReference;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the ethnicityReference property.
     * 
     * @return
     *     possible object is
     *     {@link EthnicityObjectType }
     *     
     */
    public EthnicityObjectType getEthnicityReference() {
        return ethnicityReference;
    }

    /**
     * Sets the value of the ethnicityReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EthnicityObjectType }
     *     
     */
    public void setEthnicityReference(EthnicityObjectType value) {
        this.ethnicityReference = value;
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
