
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The gender identity data for workers.
 * 
 * <p>Java class for Gender_Identity_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Gender_Identity_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gender_Identity_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Gender_Identity_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gender_Identity_Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gender_Identity_Inactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Gender_Identity_DataType", propOrder = {
    "id",
    "genderIdentityName",
    "genderIdentityCode",
    "genderIdentityDescription",
    "genderIdentityInactive"
})
public class GenderIdentityDataType {

    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "Gender_Identity_Name", required = true)
    protected String genderIdentityName;
    @XmlElement(name = "Gender_Identity_Code")
    protected String genderIdentityCode;
    @XmlElement(name = "Gender_Identity_Description")
    protected String genderIdentityDescription;
    @XmlElement(name = "Gender_Identity_Inactive")
    protected Boolean genderIdentityInactive;

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
     * Gets the value of the genderIdentityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenderIdentityName() {
        return genderIdentityName;
    }

    /**
     * Sets the value of the genderIdentityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenderIdentityName(String value) {
        this.genderIdentityName = value;
    }

    /**
     * Gets the value of the genderIdentityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenderIdentityCode() {
        return genderIdentityCode;
    }

    /**
     * Sets the value of the genderIdentityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenderIdentityCode(String value) {
        this.genderIdentityCode = value;
    }

    /**
     * Gets the value of the genderIdentityDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenderIdentityDescription() {
        return genderIdentityDescription;
    }

    /**
     * Sets the value of the genderIdentityDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenderIdentityDescription(String value) {
        this.genderIdentityDescription = value;
    }

    /**
     * Gets the value of the genderIdentityInactive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGenderIdentityInactive() {
        return genderIdentityInactive;
    }

    /**
     * Sets the value of the genderIdentityInactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGenderIdentityInactive(Boolean value) {
        this.genderIdentityInactive = value;
    }

}
