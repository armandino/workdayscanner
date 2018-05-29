
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference element representing a unique instance of Contingent Worker.
 * 
 * <p>Java class for Contingent_Worker_Reference_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contingent_Worker_Reference_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Integration_ID_Reference" type="{urn:com.workday/bsvc}External_Integration_ID_Reference_DataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contingent_Worker_Reference_DataType", propOrder = {
    "integrationIDReference"
})
public class ContingentWorkerReferenceDataType {

    @XmlElement(name = "Integration_ID_Reference", required = true)
    protected ExternalIntegrationIDReferenceDataType integrationIDReference;

    /**
     * Gets the value of the integrationIDReference property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalIntegrationIDReferenceDataType }
     *     
     */
    public ExternalIntegrationIDReferenceDataType getIntegrationIDReference() {
        return integrationIDReference;
    }

    /**
     * Sets the value of the integrationIDReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalIntegrationIDReferenceDataType }
     *     
     */
    public void setIntegrationIDReference(ExternalIntegrationIDReferenceDataType value) {
        this.integrationIDReference = value;
    }

}
