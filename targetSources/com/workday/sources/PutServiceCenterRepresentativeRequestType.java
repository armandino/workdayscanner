
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Put Service Center Representative Request
 * 
 * <p>Java class for Put_Service_Center_Representative_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Service_Center_Representative_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Service_Center_Representative_Reference" type="{urn:com.workday/bsvc}Service_Center_RepresentativeObjectType" minOccurs="0"/>
 *         &lt;element name="Service_Center_Representative_Data" type="{urn:com.workday/bsvc}Service_Center_Representative_DataType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Add_Only" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute ref="{urn:com.workday/bsvc}version"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Put_Service_Center_Representative_RequestType", propOrder = {
    "serviceCenterRepresentativeReference",
    "serviceCenterRepresentativeData"
})
public class PutServiceCenterRepresentativeRequestType {

    @XmlElement(name = "Service_Center_Representative_Reference")
    protected ServiceCenterRepresentativeObjectType serviceCenterRepresentativeReference;
    @XmlElement(name = "Service_Center_Representative_Data", required = true)
    protected ServiceCenterRepresentativeDataType serviceCenterRepresentativeData;
    @XmlAttribute(name = "Add_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean addOnly;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

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

    /**
     * Gets the value of the addOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddOnly() {
        return addOnly;
    }

    /**
     * Sets the value of the addOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddOnly(Boolean value) {
        this.addOnly = value;
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
