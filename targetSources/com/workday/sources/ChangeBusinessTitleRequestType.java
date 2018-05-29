
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This web service allows updates to the Business Title of a worker.
 * 
 * <p>Java class for Change_Business_Title_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Change_Business_Title_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Business_Process_Parameters" type="{urn:com.workday/bsvc}Business_Process_ParametersType" minOccurs="0"/>
 *         &lt;element name="Change_Business_Title_Business_Process_Data" type="{urn:com.workday/bsvc}Change_Business_Title_Business_Process_DataType"/>
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
@XmlType(name = "Change_Business_Title_RequestType", propOrder = {
    "businessProcessParameters",
    "changeBusinessTitleBusinessProcessData"
})
public class ChangeBusinessTitleRequestType {

    @XmlElement(name = "Business_Process_Parameters")
    protected BusinessProcessParametersType businessProcessParameters;
    @XmlElement(name = "Change_Business_Title_Business_Process_Data", required = true)
    protected ChangeBusinessTitleBusinessProcessDataType changeBusinessTitleBusinessProcessData;
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
     * Gets the value of the changeBusinessTitleBusinessProcessData property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeBusinessTitleBusinessProcessDataType }
     *     
     */
    public ChangeBusinessTitleBusinessProcessDataType getChangeBusinessTitleBusinessProcessData() {
        return changeBusinessTitleBusinessProcessData;
    }

    /**
     * Sets the value of the changeBusinessTitleBusinessProcessData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeBusinessTitleBusinessProcessDataType }
     *     
     */
    public void setChangeBusinessTitleBusinessProcessData(ChangeBusinessTitleBusinessProcessDataType value) {
        this.changeBusinessTitleBusinessProcessData = value;
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
