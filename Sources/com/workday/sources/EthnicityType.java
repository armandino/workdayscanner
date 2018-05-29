
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing all Ethnicity data.
 * 
 * <p>Java class for EthnicityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EthnicityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ethnicity_Reference" type="{urn:com.workday/bsvc}EthnicityObjectType" minOccurs="0"/>
 *         &lt;element name="Ethnicity_Data" type="{urn:com.workday/bsvc}Ethnicity_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EthnicityType", propOrder = {
    "ethnicityReference",
    "ethnicityData"
})
public class EthnicityType {

    @XmlElement(name = "Ethnicity_Reference")
    protected EthnicityObjectType ethnicityReference;
    @XmlElement(name = "Ethnicity_Data")
    protected EthnicityDataType ethnicityData;

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

}
