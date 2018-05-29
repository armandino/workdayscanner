
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference element representing a unique instance of Social Benefits Locality
 * 
 * <p>Java class for Social_Benefits_LocalityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Social_Benefits_LocalityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Social_Benefits_Locality_Reference" type="{urn:com.workday/bsvc}Social_Benefits_LocalityObjectType" minOccurs="0"/>
 *         &lt;element name="Social_Benefits_Locality_Data" type="{urn:com.workday/bsvc}Social_Benefits_Locality_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Social_Benefits_LocalityType", propOrder = {
    "socialBenefitsLocalityReference",
    "socialBenefitsLocalityData"
})
public class SocialBenefitsLocalityType {

    @XmlElement(name = "Social_Benefits_Locality_Reference")
    protected SocialBenefitsLocalityObjectType socialBenefitsLocalityReference;
    @XmlElement(name = "Social_Benefits_Locality_Data")
    protected SocialBenefitsLocalityDataType socialBenefitsLocalityData;

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
     * Gets the value of the socialBenefitsLocalityData property.
     * 
     * @return
     *     possible object is
     *     {@link SocialBenefitsLocalityDataType }
     *     
     */
    public SocialBenefitsLocalityDataType getSocialBenefitsLocalityData() {
        return socialBenefitsLocalityData;
    }

    /**
     * Sets the value of the socialBenefitsLocalityData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SocialBenefitsLocalityDataType }
     *     
     */
    public void setSocialBenefitsLocalityData(SocialBenefitsLocalityDataType value) {
        this.socialBenefitsLocalityData = value;
    }

}
