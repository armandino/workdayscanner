
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Employees Career Interest Data.
 * 
 * <p>Java class for Career_Preferences_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Career_Preferences_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Career_Interest_Reference" type="{urn:com.workday/bsvc}Career_ResponsibilityObjectType" minOccurs="0"/>
 *         &lt;element name="Career_Interests" type="{urn:com.workday/bsvc}RichText" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Career_Preferences_DataType", propOrder = {
    "careerInterestReference",
    "careerInterests"
})
public class CareerPreferencesDataType {

    @XmlElement(name = "Career_Interest_Reference")
    protected CareerResponsibilityObjectType careerInterestReference;
    @XmlElement(name = "Career_Interests")
    protected String careerInterests;

    /**
     * Gets the value of the careerInterestReference property.
     * 
     * @return
     *     possible object is
     *     {@link CareerResponsibilityObjectType }
     *     
     */
    public CareerResponsibilityObjectType getCareerInterestReference() {
        return careerInterestReference;
    }

    /**
     * Sets the value of the careerInterestReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CareerResponsibilityObjectType }
     *     
     */
    public void setCareerInterestReference(CareerResponsibilityObjectType value) {
        this.careerInterestReference = value;
    }

    /**
     * Gets the value of the careerInterests property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCareerInterests() {
        return careerInterests;
    }

    /**
     * Sets the value of the careerInterests property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCareerInterests(String value) {
        this.careerInterests = value;
    }

}
