
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference element representing a unique instance of Work Experience Rating.
 * 
 * <p>Java class for Professional_Experience_Rating_ReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Professional_Experience_Rating_ReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Rating_Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Professional_Experience_Rating_ReferenceType", propOrder = {
    "ratingDescription"
})
public class ProfessionalExperienceRatingReferenceType {

    @XmlElement(name = "Rating_Description")
    protected String ratingDescription;

    /**
     * Gets the value of the ratingDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatingDescription() {
        return ratingDescription;
    }

    /**
     * Sets the value of the ratingDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatingDescription(String value) {
        this.ratingDescription = value;
    }

}
