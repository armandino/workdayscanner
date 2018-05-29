
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Replacement Element containing Responsibility Qualifications for the Job Profile.
 * When updating a Job Profile, all Responsibilities for the Job Profile will be replaced by the data in being submitted. If no data is submitted, then the existing Responsibilities are not changed.
 * 
 * <p>Java class for Responsibility_Qualification_Profile_Replacement_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Responsibility_Qualification_Profile_Replacement_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Responsibility_Description" type="{urn:com.workday/bsvc}RichText"/>
 *         &lt;element name="Required" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Responsibility_Qualification_Profile_Replacement_DataType", propOrder = {
    "responsibilityDescription",
    "required"
})
public class ResponsibilityQualificationProfileReplacementDataType {

    @XmlElement(name = "Responsibility_Description", required = true)
    protected String responsibilityDescription;
    @XmlElement(name = "Required")
    protected Boolean required;

    /**
     * Gets the value of the responsibilityDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsibilityDescription() {
        return responsibilityDescription;
    }

    /**
     * Sets the value of the responsibilityDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsibilityDescription(String value) {
        this.responsibilityDescription = value;
    }

    /**
     * Gets the value of the required property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequired(Boolean value) {
        this.required = value;
    }

}
