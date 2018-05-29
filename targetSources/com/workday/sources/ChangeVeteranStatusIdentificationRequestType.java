
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The request element containing all necessary information to assign a Veteran Status Identification for a Worker.
 * 
 * <p>Java class for Change_Veteran_Status_Identification_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Change_Veteran_Status_Identification_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Business_Process_Parameters" type="{urn:com.workday/bsvc}Business_Process_ParametersType" minOccurs="0"/>
 *         &lt;element name="Veteran_Status_Identification_Data" type="{urn:com.workday/bsvc}Veteran_Status_Identification_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{urn:com.workday/bsvc}version"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Change_Veteran_Status_Identification_RequestType", propOrder = {
    "businessProcessParameters",
    "veteranStatusIdentificationData"
})
public class ChangeVeteranStatusIdentificationRequestType {

    @XmlElement(name = "Business_Process_Parameters")
    protected BusinessProcessParametersType businessProcessParameters;
    @XmlElement(name = "Veteran_Status_Identification_Data")
    protected VeteranStatusIdentificationDataType veteranStatusIdentificationData;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the businessProcessParameters property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessProcessParametersType }
     *     
     */
    public BusinessProcessParametersType getBusinessProcessParameters() {
        return businessProcessParameters;
    }

    /**
     * Sets the value of the businessProcessParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessProcessParametersType }
     *     
     */
    public void setBusinessProcessParameters(BusinessProcessParametersType value) {
        this.businessProcessParameters = value;
    }

    /**
     * Gets the value of the veteranStatusIdentificationData property.
     * 
     * @return
     *     possible object is
     *     {@link VeteranStatusIdentificationDataType }
     *     
     */
    public VeteranStatusIdentificationDataType getVeteranStatusIdentificationData() {
        return veteranStatusIdentificationData;
    }

    /**
     * Sets the value of the veteranStatusIdentificationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link VeteranStatusIdentificationDataType }
     *     
     */
    public void setVeteranStatusIdentificationData(VeteranStatusIdentificationDataType value) {
        this.veteranStatusIdentificationData = value;
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
