
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response element for the Put Political Affiliation operation.
 * 
 * <p>Java class for Put_Political_Affiliation_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Political_Affiliation_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Political_Affiliation_Reference" type="{urn:com.workday/bsvc}Political_AffiliationObjectType" minOccurs="0"/>
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
@XmlType(name = "Put_Political_Affiliation_ResponseType", propOrder = {
    "politicalAffiliationReference"
})
public class PutPoliticalAffiliationResponseType {

    @XmlElement(name = "Political_Affiliation_Reference")
    protected PoliticalAffiliationObjectType politicalAffiliationReference;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the politicalAffiliationReference property.
     * 
     * @return
     *     possible object is
     *     {@link PoliticalAffiliationObjectType }
     *     
     */
    public PoliticalAffiliationObjectType getPoliticalAffiliationReference() {
        return politicalAffiliationReference;
    }

    /**
     * Sets the value of the politicalAffiliationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoliticalAffiliationObjectType }
     *     
     */
    public void setPoliticalAffiliationReference(PoliticalAffiliationObjectType value) {
        this.politicalAffiliationReference = value;
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
