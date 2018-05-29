
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The pronoun data for a worker.
 * 
 * <p>Java class for Pronoun_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pronoun_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pronoun_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Pronoun_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pronoun_Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pronoun_Inactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pronoun_DataType", propOrder = {
    "id",
    "pronounName",
    "pronounCode",
    "pronounDescription",
    "pronounInactive"
})
public class PronounDataType {

    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "Pronoun_Name", required = true)
    protected String pronounName;
    @XmlElement(name = "Pronoun_Code")
    protected String pronounCode;
    @XmlElement(name = "Pronoun_Description")
    protected String pronounDescription;
    @XmlElement(name = "Pronoun_Inactive")
    protected Boolean pronounInactive;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the pronounName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPronounName() {
        return pronounName;
    }

    /**
     * Sets the value of the pronounName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPronounName(String value) {
        this.pronounName = value;
    }

    /**
     * Gets the value of the pronounCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPronounCode() {
        return pronounCode;
    }

    /**
     * Sets the value of the pronounCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPronounCode(String value) {
        this.pronounCode = value;
    }

    /**
     * Gets the value of the pronounDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPronounDescription() {
        return pronounDescription;
    }

    /**
     * Sets the value of the pronounDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPronounDescription(String value) {
        this.pronounDescription = value;
    }

    /**
     * Gets the value of the pronounInactive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPronounInactive() {
        return pronounInactive;
    }

    /**
     * Sets the value of the pronounInactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPronounInactive(Boolean value) {
        this.pronounInactive = value;
    }

}
