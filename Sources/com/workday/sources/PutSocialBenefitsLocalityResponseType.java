
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response element for the Put Political Affiliation operation.
 * 
 * <p>Java class for Put_Social_Benefits_Locality_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Social_Benefits_Locality_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Social_Benefits_Locality_Reference" type="{urn:com.workday/bsvc}Social_Benefits_LocalityObjectType" minOccurs="0"/>
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
@XmlType(name = "Put_Social_Benefits_Locality_ResponseType", propOrder = {
    "socialBenefitsLocalityReference"
})
public class PutSocialBenefitsLocalityResponseType {

    @XmlElement(name = "Social_Benefits_Locality_Reference")
    protected SocialBenefitsLocalityObjectType socialBenefitsLocalityReference;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the socialBenefitsLocalityReference property.
     * 
     * @return
     *     possible object is
     *     {@link SocialBenefitsLocalityObjectType }
     *     
     */
    public SocialBenefitsLocalityObjectType getSocialBenefitsLocalityReference() {
        return socialBenefitsLocalityReference;
    }

    /**
     * Sets the value of the socialBenefitsLocalityReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SocialBenefitsLocalityObjectType }
     *     
     */
    public void setSocialBenefitsLocalityReference(SocialBenefitsLocalityObjectType value) {
        this.socialBenefitsLocalityReference = value;
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
