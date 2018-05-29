
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element containing Service Center Representative data.
 * 
 * <p>Java class for Service_Center_RepresentativeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Service_Center_RepresentativeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Service_Center_Representative_Reference" type="{urn:com.workday/bsvc}Service_Center_RepresentativeObjectType" minOccurs="0"/>
 *         &lt;element name="Service_Center_Representative_Data" type="{urn:com.workday/bsvc}Service_Center_Representative_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Service_Center_RepresentativeType", propOrder = {
    "serviceCenterRepresentativeReference",
    "serviceCenterRepresentativeData"
})
public class ServiceCenterRepresentativeType {

    @XmlElement(name = "Service_Center_Representative_Reference")
    protected ServiceCenterRepresentativeObjectType serviceCenterRepresentativeReference;
    @XmlElement(name = "Service_Center_Representative_Data")
    protected ServiceCenterRepresentativeDataType serviceCenterRepresentativeData;

    /**
     * Gets the value of the serviceCenterRepresentativeReference property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCenterRepresentativeObjectType }
     *     
     */
    public ServiceCenterRepresentativeObjectType getServiceCenterRepresentativeReference() {
        return serviceCenterRepresentativeReference;
    }

    /**
     * Sets the value of the serviceCenterRepresentativeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCenterRepresentativeObjectType }
     *     
     */
    public void setServiceCenterRepresentativeReference(ServiceCenterRepresentativeObjectType value) {
        this.serviceCenterRepresentativeReference = value;
    }

    /**
     * Gets the value of the serviceCenterRepresentativeData property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCenterRepresentativeDataType }
     *     
     */
    public ServiceCenterRepresentativeDataType getServiceCenterRepresentativeData() {
        return serviceCenterRepresentativeData;
    }

    /**
     * Sets the value of the serviceCenterRepresentativeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCenterRepresentativeDataType }
     *     
     */
    public void setServiceCenterRepresentativeData(ServiceCenterRepresentativeDataType value) {
        this.serviceCenterRepresentativeData = value;
    }

}
