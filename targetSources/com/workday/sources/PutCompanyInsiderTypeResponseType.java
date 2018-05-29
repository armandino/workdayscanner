
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element containing Put Company Insider Type Response Data
 * 
 * <p>Java class for Put_Company_Insider_Type_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Company_Insider_Type_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Company_Insider_Type_Reference" type="{urn:com.workday/bsvc}Company_Insider_TypeObjectType" minOccurs="0"/>
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
@XmlType(name = "Put_Company_Insider_Type_ResponseType", propOrder = {
    "companyInsiderTypeReference"
})
public class PutCompanyInsiderTypeResponseType {

    @XmlElement(name = "Company_Insider_Type_Reference")
    protected CompanyInsiderTypeObjectType companyInsiderTypeReference;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the companyInsiderTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyInsiderTypeObjectType }
     *     
     */
    public CompanyInsiderTypeObjectType getCompanyInsiderTypeReference() {
        return companyInsiderTypeReference;
    }

    /**
     * Sets the value of the companyInsiderTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyInsiderTypeObjectType }
     *     
     */
    public void setCompanyInsiderTypeReference(CompanyInsiderTypeObjectType value) {
        this.companyInsiderTypeReference = value;
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
