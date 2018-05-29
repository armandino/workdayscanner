
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Operation allowing the addition of contact information for a person
 * 
 * <p>Java class for Change_Work_Contact_Information_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Change_Work_Contact_Information_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Business_Process_Parameters" type="{urn:com.workday/bsvc}Business_Process_ParametersType" minOccurs="0"/>
 *         &lt;element name="Change_Work_Contact_Information_Data" type="{urn:com.workday/bsvc}Change_Work_Contact_Information_Business_Process_DataType"/>
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
@XmlType(name = "Change_Work_Contact_Information_RequestType", propOrder = {
    "businessProcessParameters",
    "changeWorkContactInformationData"
})
public class ChangeWorkContactInformationRequestType {

    @XmlElement(name = "Business_Process_Parameters")
    protected BusinessProcessParametersType businessProcessParameters;
    @XmlElement(name = "Change_Work_Contact_Information_Data", required = true)
    protected ChangeWorkContactInformationBusinessProcessDataType changeWorkContactInformationData;
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
     * Gets the value of the changeWorkContactInformationData property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeWorkContactInformationBusinessProcessDataType }
     *     
     */
    public ChangeWorkContactInformationBusinessProcessDataType getChangeWorkContactInformationData() {
        return changeWorkContactInformationData;
    }

    /**
     * Sets the value of the changeWorkContactInformationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeWorkContactInformationBusinessProcessDataType }
     *     
     */
    public void setChangeWorkContactInformationData(ChangeWorkContactInformationBusinessProcessDataType value) {
        this.changeWorkContactInformationData = value;
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
