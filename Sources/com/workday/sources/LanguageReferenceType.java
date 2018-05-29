
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference element representing a unique instance of Language.
 * 
 * <p>Java class for Language_ReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Language_ReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Language_Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Language_ReferenceType", propOrder = {
    "languageDescription"
})
public class LanguageReferenceType {

    @XmlElement(name = "Language_Description", required = true)
    protected String languageDescription;

    /**
     * Gets the value of the languageDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageDescription() {
        return languageDescription;
    }

    /**
     * Sets the value of the languageDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageDescription(String value) {
        this.languageDescription = value;
    }

}
