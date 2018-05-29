
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing all External Contact data.
 * 
 * <p>Java class for External_Contact_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="External_Contact_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Integration_ID_Data" type="{urn:com.workday/bsvc}External_Integration_ID_DataType" minOccurs="0"/>
 *         &lt;element name="External_Contact_Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "External_Contact_DataType", propOrder = {
    "integrationIDData",
    "externalContactType"
})
public class ExternalContactDataType {

    @XmlElement(name = "Integration_ID_Data")
    protected ExternalIntegrationIDDataType integrationIDData;
    @XmlElement(name = "External_Contact_Type", required = true)
    protected String externalContactType;

    /**
     * Gets the value of the integrationIDData property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalIntegrationIDDataType }
     *     
     */
    public ExternalIntegrationIDDataType getIntegrationIDData() {
        return integrationIDData;
    }

    /**
     * Sets the value of the integrationIDData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalIntegrationIDDataType }
     *     
     */
    public void setIntegrationIDData(ExternalIntegrationIDDataType value) {
        this.integrationIDData = value;
    }

    /**
     * Gets the value of the externalContactType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalContactType() {
        return externalContactType;
    }

    /**
     * Sets the value of the externalContactType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalContactType(String value) {
        this.externalContactType = value;
    }

}
