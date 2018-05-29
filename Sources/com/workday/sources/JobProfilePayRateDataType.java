
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element containing Job Profile Pay Rate Data
 * 
 * <p>Java class for Job_Profile_Pay_Rate_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job_Profile_Pay_Rate_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Country_Reference" type="{urn:com.workday/bsvc}CountryObjectType"/>
 *         &lt;element name="Pay_Rate_Type_Reference" type="{urn:com.workday/bsvc}Pay_Rate_TypeObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Delete" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job_Profile_Pay_Rate_DataType", propOrder = {
    "countryReference",
    "payRateTypeReference"
})
public class JobProfilePayRateDataType {

    @XmlElement(name = "Country_Reference", required = true)
    protected CountryObjectType countryReference;
    @XmlElement(name = "Pay_Rate_Type_Reference")
    protected PayRateTypeObjectType payRateTypeReference;
    @XmlAttribute(name = "Delete", namespace = "urn:com.workday/bsvc")
    protected Boolean delete;

    /**
     * Gets the value of the countryReference property.
     * 
     * @return
     *     possible object is
     *     {@link CountryObjectType }
     *     
     */
    public CountryObjectType getCountryReference() {
        return countryReference;
    }

    /**
     * Sets the value of the countryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryObjectType }
     *     
     */
    public void setCountryReference(CountryObjectType value) {
        this.countryReference = value;
    }

    /**
     * Gets the value of the payRateTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link PayRateTypeObjectType }
     *     
     */
    public PayRateTypeObjectType getPayRateTypeReference() {
        return payRateTypeReference;
    }

    /**
     * Sets the value of the payRateTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayRateTypeObjectType }
     *     
     */
    public void setPayRateTypeReference(PayRateTypeObjectType value) {
        this.payRateTypeReference = value;
    }

    /**
     * Gets the value of the delete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelete() {
        return delete;
    }

    /**
     * Sets the value of the delete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelete(Boolean value) {
        this.delete = value;
    }

}
