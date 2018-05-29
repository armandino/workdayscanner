
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request element for Put Ethnicity
 * 
 * <p>Java class for Put_Ethnicity_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Ethnicity_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ethnicity_Reference" type="{urn:com.workday/bsvc}EthnicityObjectType" minOccurs="0"/>
 *         &lt;element name="Ethnicity_Data" type="{urn:com.workday/bsvc}Ethnicity_DataType" minOccurs="0"/>
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
@XmlType(name = "Put_Ethnicity_RequestType", propOrder = {
    "ethnicityReference",
    "ethnicityData"
})
public class PutEthnicityRequestType {

    @XmlElement(name = "Ethnicity_Reference")
    protected EthnicityObjectType ethnicityReference;
    @XmlElement(name = "Ethnicity_Data")
    protected EthnicityDataType ethnicityData;
    @XmlAttribute(name = "Add_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean addOnly;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the ethnicityReference property.
     * 
     * @return
     *     possible object is
     *     {@link EthnicityObjectType }
     *     
     */
    public EthnicityObjectType getEthnicityReference() {
        return ethnicityReference;
    }

    /**
     * Sets the value of the ethnicityReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EthnicityObjectType }
     *     
     */
    public void setEthnicityReference(EthnicityObjectType value) {
        this.ethnicityReference = value;
    }

    /**
     * Gets the value of the ethnicityData property.
     * 
     * @return
     *     possible object is
     *     {@link EthnicityDataType }
     *     
     */
    public EthnicityDataType getEthnicityData() {
        return ethnicityData;
    }

    /**
     * Sets the value of the ethnicityData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EthnicityDataType }
     *     
     */
    public void setEthnicityData(EthnicityDataType value) {
        this.ethnicityData = value;
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
