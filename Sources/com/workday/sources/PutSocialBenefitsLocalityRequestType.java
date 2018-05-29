
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request element for Put Social Benefits Locality
 * 
 * <p>Java class for Put_Social_Benefits_Locality_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Social_Benefits_Locality_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Social_Benefits_Locality_Reference" type="{urn:com.workday/bsvc}Social_Benefits_LocalityObjectType" minOccurs="0"/>
 *         &lt;element name="Social_Benefits_Locality_Data" type="{urn:com.workday/bsvc}Social_Benefits_Locality_DataType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Add_Only" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute ref="{urn:com.workday/bsvc}version"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Put_Social_Benefits_Locality_RequestType", propOrder = {
    "socialBenefitsLocalityReference",
    "socialBenefitsLocalityData"
})
public class PutSocialBenefitsLocalityRequestType {

    @XmlElement(name = "Social_Benefits_Locality_Reference")
    protected SocialBenefitsLocalityObjectType socialBenefitsLocalityReference;
    @XmlElement(name = "Social_Benefits_Locality_Data", required = true)
    protected SocialBenefitsLocalityDataType socialBenefitsLocalityData;
    @XmlAttribute(name = "Add_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean addOnly;
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

    /**
     * Gets the value of the addOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddOnly() {
        return addOnly;
    }

    /**
     * Sets the value of the addOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddOnly(Boolean value) {
        this.addOnly = value;
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
