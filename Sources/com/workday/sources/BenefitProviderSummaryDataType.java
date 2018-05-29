
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the summary information about the benefit provider of the benefit plan.
 * 
 * <p>Java class for Benefit_Provider_Summary_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Benefit_Provider_Summary_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Benefit_Provider_Reference" type="{urn:com.workday/bsvc}Benefit_ProviderObjectType" minOccurs="0"/>
 *         &lt;element name="Benefit_Provider_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Benefit_Provider_Identifier_Type_Reference" type="{urn:com.workday/bsvc}Benefit_Provider_Identifier_TypeObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Benefit_Provider_Summary_DataType", propOrder = {
    "benefitProviderReference",
    "benefitProviderName",
    "benefitProviderIdentifierTypeReference"
})
public class BenefitProviderSummaryDataType {

    @XmlElement(name = "Benefit_Provider_Reference")
    protected BenefitProviderObjectType benefitProviderReference;
    @XmlElement(name = "Benefit_Provider_Name")
    protected String benefitProviderName;
    @XmlElement(name = "Benefit_Provider_Identifier_Type_Reference")
    protected BenefitProviderIdentifierTypeObjectType benefitProviderIdentifierTypeReference;

    /**
     * Gets the value of the benefitProviderReference property.
     * 
     * @return
     *     possible object is
     *     {@link BenefitProviderObjectType }
     *     
     */
    public BenefitProviderObjectType getBenefitProviderReference() {
        return benefitProviderReference;
    }

    /**
     * Sets the value of the benefitProviderReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenefitProviderObjectType }
     *     
     */
    public void setBenefitProviderReference(BenefitProviderObjectType value) {
        this.benefitProviderReference = value;
    }

    /**
     * Gets the value of the benefitProviderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitProviderName() {
        return benefitProviderName;
    }

    /**
     * Sets the value of the benefitProviderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitProviderName(String value) {
        this.benefitProviderName = value;
    }

    /**
     * Gets the value of the benefitProviderIdentifierTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link BenefitProviderIdentifierTypeObjectType }
     *     
     */
    public BenefitProviderIdentifierTypeObjectType getBenefitProviderIdentifierTypeReference() {
        return benefitProviderIdentifierTypeReference;
    }

    /**
     * Sets the value of the benefitProviderIdentifierTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenefitProviderIdentifierTypeObjectType }
     *     
     */
    public void setBenefitProviderIdentifierTypeReference(BenefitProviderIdentifierTypeObjectType value) {
        this.benefitProviderIdentifierTypeReference = value;
    }

}
