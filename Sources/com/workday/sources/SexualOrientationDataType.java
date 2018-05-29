
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The sexual orientation data for a worker.
 * 
 * <p>Java class for Sexual_Orientation_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Sexual_Orientation_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sexual_Orientation_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Sexual_Orientation_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sexual_Orientation_Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sexual_Orientation_Inactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sexual_Orientation_DataType", propOrder = {
    "id",
    "sexualOrientationName",
    "sexualOrientationCode",
    "sexualOrientationDescription",
    "sexualOrientationInactive"
})
public class SexualOrientationDataType {

    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "Sexual_Orientation_Name", required = true)
    protected String sexualOrientationName;
    @XmlElement(name = "Sexual_Orientation_Code")
    protected String sexualOrientationCode;
    @XmlElement(name = "Sexual_Orientation_Description")
    protected String sexualOrientationDescription;
    @XmlElement(name = "Sexual_Orientation_Inactive")
    protected Boolean sexualOrientationInactive;

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
     * Gets the value of the sexualOrientationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexualOrientationName() {
        return sexualOrientationName;
    }

    /**
     * Sets the value of the sexualOrientationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexualOrientationName(String value) {
        this.sexualOrientationName = value;
    }

    /**
     * Gets the value of the sexualOrientationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexualOrientationCode() {
        return sexualOrientationCode;
    }

    /**
     * Sets the value of the sexualOrientationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexualOrientationCode(String value) {
        this.sexualOrientationCode = value;
    }

    /**
     * Gets the value of the sexualOrientationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexualOrientationDescription() {
        return sexualOrientationDescription;
    }

    /**
     * Sets the value of the sexualOrientationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexualOrientationDescription(String value) {
        this.sexualOrientationDescription = value;
    }

    /**
     * Gets the value of the sexualOrientationInactive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSexualOrientationInactive() {
        return sexualOrientationInactive;
    }

    /**
     * Sets the value of the sexualOrientationInactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSexualOrientationInactive(Boolean value) {
        this.sexualOrientationInactive = value;
    }

}
