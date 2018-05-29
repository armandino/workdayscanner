
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing all Personal Information for an Employee.
 * 
 * <p>Java class for Worker_Personal_Info_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Personal_Info_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="External_Integration_ID_Data" type="{urn:com.workday/bsvc}External_Integration_ID_DataType" minOccurs="0"/>
 *         &lt;element name="Personal_Info_Data" type="{urn:com.workday/bsvc}Personal_Info_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Personal_Info_DataType", propOrder = {
    "externalIntegrationIDData",
    "personalInfoData"
})
public class WorkerPersonalInfoDataType {

    @XmlElement(name = "External_Integration_ID_Data")
    protected ExternalIntegrationIDDataType externalIntegrationIDData;
    @XmlElement(name = "Personal_Info_Data")
    protected PersonalInfoDataType personalInfoData;

    /**
     * Gets the value of the externalIntegrationIDData property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalIntegrationIDDataType }
     *     
     */
    public ExternalIntegrationIDDataType getExternalIntegrationIDData() {
        return externalIntegrationIDData;
    }

    /**
     * Sets the value of the externalIntegrationIDData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalIntegrationIDDataType }
     *     
     */
    public void setExternalIntegrationIDData(ExternalIntegrationIDDataType value) {
        this.externalIntegrationIDData = value;
    }

    /**
     * Gets the value of the personalInfoData property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalInfoDataType }
     *     
     */
    public PersonalInfoDataType getPersonalInfoData() {
        return personalInfoData;
    }

    /**
     * Sets the value of the personalInfoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalInfoDataType }
     *     
     */
    public void setPersonalInfoData(PersonalInfoDataType value) {
        this.personalInfoData = value;
    }

}
