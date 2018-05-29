
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request Element for Put Service Center Representative Workday Account
 * 
 * <p>Java class for Put_Service_Center_Representative_Workday_Account_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Service_Center_Representative_Workday_Account_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Service_Center_Representative_Workday_Account_Reference" type="{urn:com.workday/bsvc}Service_Center_RepresentativeObjectType" minOccurs="0"/>
 *         &lt;element name="Service_Center_Representative_Workday_Account_Data" type="{urn:com.workday/bsvc}Service_Center_Representative_Workday_Account_DataType"/>
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
@XmlType(name = "Put_Service_Center_Representative_Workday_Account_RequestType", propOrder = {
    "serviceCenterRepresentativeWorkdayAccountReference",
    "serviceCenterRepresentativeWorkdayAccountData"
})
public class PutServiceCenterRepresentativeWorkdayAccountRequestType {

    @XmlElement(name = "Service_Center_Representative_Workday_Account_Reference")
    protected ServiceCenterRepresentativeObjectType serviceCenterRepresentativeWorkdayAccountReference;
    @XmlElement(name = "Service_Center_Representative_Workday_Account_Data", required = true)
    protected ServiceCenterRepresentativeWorkdayAccountDataType serviceCenterRepresentativeWorkdayAccountData;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the serviceCenterRepresentativeWorkdayAccountReference property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCenterRepresentativeObjectType }
     *     
     */
    public ServiceCenterRepresentativeObjectType getServiceCenterRepresentativeWorkdayAccountReference() {
        return serviceCenterRepresentativeWorkdayAccountReference;
    }

    /**
     * Sets the value of the serviceCenterRepresentativeWorkdayAccountReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCenterRepresentativeObjectType }
     *     
     */
    public void setServiceCenterRepresentativeWorkdayAccountReference(ServiceCenterRepresentativeObjectType value) {
        this.serviceCenterRepresentativeWorkdayAccountReference = value;
    }

    /**
     * Gets the value of the serviceCenterRepresentativeWorkdayAccountData property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCenterRepresentativeWorkdayAccountDataType }
     *     
     */
    public ServiceCenterRepresentativeWorkdayAccountDataType getServiceCenterRepresentativeWorkdayAccountData() {
        return serviceCenterRepresentativeWorkdayAccountData;
    }

    /**
     * Sets the value of the serviceCenterRepresentativeWorkdayAccountData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCenterRepresentativeWorkdayAccountDataType }
     *     
     */
    public void setServiceCenterRepresentativeWorkdayAccountData(ServiceCenterRepresentativeWorkdayAccountDataType value) {
        this.serviceCenterRepresentativeWorkdayAccountData = value;
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
