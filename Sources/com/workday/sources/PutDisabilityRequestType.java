
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request element for Put Disability
 * 
 * <p>Java class for Put_Disability_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Disability_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Disability_Reference" type="{urn:com.workday/bsvc}DisabilityObjectType" minOccurs="0"/>
 *         &lt;element name="Disability_Data" type="{urn:com.workday/bsvc}Disability_DataType"/>
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
@XmlType(name = "Put_Disability_RequestType", propOrder = {
    "disabilityReference",
    "disabilityData"
})
public class PutDisabilityRequestType {

    @XmlElement(name = "Disability_Reference")
    protected DisabilityObjectType disabilityReference;
    @XmlElement(name = "Disability_Data", required = true)
    protected DisabilityDataType disabilityData;
    @XmlAttribute(name = "Add_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean addOnly;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the disabilityReference property.
     * 
     * @return
     *     possible object is
     *     {@link DisabilityObjectType }
     *     
     */
    public DisabilityObjectType getDisabilityReference() {
        return disabilityReference;
    }

    /**
     * Sets the value of the disabilityReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisabilityObjectType }
     *     
     */
    public void setDisabilityReference(DisabilityObjectType value) {
        this.disabilityReference = value;
    }

    /**
     * Gets the value of the disabilityData property.
     * 
     * @return
     *     possible object is
     *     {@link DisabilityDataType }
     *     
     */
    public DisabilityDataType getDisabilityData() {
        return disabilityData;
    }

    /**
     * Sets the value of the disabilityData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisabilityDataType }
     *     
     */
    public void setDisabilityData(DisabilityDataType value) {
        this.disabilityData = value;
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
