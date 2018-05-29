
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This web service allows updates to the preferred name of a worker.
 * 
 * <p>Java class for Change_Preferred_Name_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Change_Preferred_Name_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Business_Process_Parameters" type="{urn:com.workday/bsvc}Business_Process_ParametersType" minOccurs="0"/>
 *         &lt;element name="Change_Preferred_Name_Data" type="{urn:com.workday/bsvc}Change_Preferred_Name_Business_Process_DataType"/>
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
@XmlType(name = "Change_Preferred_Name_RequestType", propOrder = {
    "businessProcessParameters",
    "changePreferredNameData"
})
public class ChangePreferredNameRequestType {

    @XmlElement(name = "Business_Process_Parameters")
    protected BusinessProcessParametersType businessProcessParameters;
    @XmlElement(name = "Change_Preferred_Name_Data", required = true)
    protected ChangePreferredNameBusinessProcessDataType changePreferredNameData;
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
     * Gets the value of the changePreferredNameData property.
     * 
     * @return
     *     possible object is
     *     {@link ChangePreferredNameBusinessProcessDataType }
     *     
     */
    public ChangePreferredNameBusinessProcessDataType getChangePreferredNameData() {
        return changePreferredNameData;
    }

    /**
     * Sets the value of the changePreferredNameData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangePreferredNameBusinessProcessDataType }
     *     
     */
    public void setChangePreferredNameData(ChangePreferredNameBusinessProcessDataType value) {
        this.changePreferredNameData = value;
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
