
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the response elements for the Get Disabilities and Put Disability service requests.
 * 
 * <p>Java class for DisabilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisabilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Disability_Reference" type="{urn:com.workday/bsvc}DisabilityObjectType" minOccurs="0"/>
 *         &lt;element name="Disability_Data" type="{urn:com.workday/bsvc}Disability_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisabilityType", propOrder = {
    "disabilityReference",
    "disabilityData"
})
public class DisabilityType {

    @XmlElement(name = "Disability_Reference")
    protected DisabilityObjectType disabilityReference;
    @XmlElement(name = "Disability_Data")
    protected DisabilityDataType disabilityData;

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

}
