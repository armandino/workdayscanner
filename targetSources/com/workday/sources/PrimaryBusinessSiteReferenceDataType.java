
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference element representing a unique instance of Location.
 * 
 * <p>Java class for Primary_Business_Site_Reference_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Primary_Business_Site_Reference_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Business_Site_Reference" type="{urn:com.workday/bsvc}Business_Site_Reference_DataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Primary_Business_Site_Reference_DataType", propOrder = {
    "businessSiteReference"
})
public class PrimaryBusinessSiteReferenceDataType {

    @XmlElement(name = "Business_Site_Reference", required = true)
    protected BusinessSiteReferenceDataType businessSiteReference;

    /**
     * Gets the value of the businessSiteReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessSiteReferenceDataType }
     *     
     */
    public BusinessSiteReferenceDataType getBusinessSiteReference() {
        return businessSiteReference;
    }

    /**
     * Sets the value of the businessSiteReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessSiteReferenceDataType }
     *     
     */
    public void setBusinessSiteReference(BusinessSiteReferenceDataType value) {
        this.businessSiteReference = value;
    }

}
