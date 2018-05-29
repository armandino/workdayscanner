
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Universal Identifier High Volume
 * 
 * <p>Java class for Universal_Identifier_Data_HVType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Universal_Identifier_Data_HVType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Universal_Identifier_Data" type="{urn:com.workday/bsvc}Universal_Identifier_DataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Universal_Identifier_Data_HVType", propOrder = {
    "universalIdentifierData"
})
public class UniversalIdentifierDataHVType {

    @XmlElement(name = "Universal_Identifier_Data", required = true)
    protected UniversalIdentifierDataType universalIdentifierData;

    /**
     * Gets the value of the universalIdentifierData property.
     * 
     * @return
     *     possible object is
     *     {@link UniversalIdentifierDataType }
     *     
     */
    public UniversalIdentifierDataType getUniversalIdentifierData() {
        return universalIdentifierData;
    }

    /**
     * Sets the value of the universalIdentifierData property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniversalIdentifierDataType }
     *     
     */
    public void setUniversalIdentifierData(UniversalIdentifierDataType value) {
        this.universalIdentifierData = value;
    }

}
