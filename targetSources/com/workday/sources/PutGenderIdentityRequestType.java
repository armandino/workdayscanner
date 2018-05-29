
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The request to edit gender identity data for a worker.
 * 
 * <p>Java class for Put_Gender_Identity_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Gender_Identity_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Gender_Identity_Reference" type="{urn:com.workday/bsvc}Gender_IdentityObjectType" minOccurs="0"/>
 *         &lt;element name="Gender_Identity_Data" type="{urn:com.workday/bsvc}Gender_Identity_DataType"/>
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
@XmlType(name = "Put_Gender_Identity_RequestType", propOrder = {
    "genderIdentityReference",
    "genderIdentityData"
})
public class PutGenderIdentityRequestType {

    @XmlElement(name = "Gender_Identity_Reference")
    protected GenderIdentityObjectType genderIdentityReference;
    @XmlElement(name = "Gender_Identity_Data", required = true)
    protected GenderIdentityDataType genderIdentityData;
    @XmlAttribute(name = "Add_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean addOnly;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the genderIdentityReference property.
     * 
     * @return
     *     possible object is
     *     {@link GenderIdentityObjectType }
     *     
     */
    public GenderIdentityObjectType getGenderIdentityReference() {
        return genderIdentityReference;
    }

    /**
     * Sets the value of the genderIdentityReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderIdentityObjectType }
     *     
     */
    public void setGenderIdentityReference(GenderIdentityObjectType value) {
        this.genderIdentityReference = value;
    }

    /**
     * Gets the value of the genderIdentityData property.
     * 
     * @return
     *     possible object is
     *     {@link GenderIdentityDataType }
     *     
     */
    public GenderIdentityDataType getGenderIdentityData() {
        return genderIdentityData;
    }

    /**
     * Sets the value of the genderIdentityData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderIdentityDataType }
     *     
     */
    public void setGenderIdentityData(GenderIdentityDataType value) {
        this.genderIdentityData = value;
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
