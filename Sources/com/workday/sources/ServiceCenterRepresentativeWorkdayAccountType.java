
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element containing Workday Account information for a Service Center Representative.
 * 
 * <p>Java class for Service_Center_Representative_Workday_AccountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Service_Center_Representative_Workday_AccountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Service_Center_Representative_Workday_Account_Reference" type="{urn:com.workday/bsvc}Service_Center_RepresentativeObjectType" minOccurs="0"/>
 *         &lt;element name="Service_Center_Representative_Workday_Account_Data" type="{urn:com.workday/bsvc}Service_Center_Representative_Workday_Account_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Service_Center_Representative_Workday_AccountType", propOrder = {
    "serviceCenterRepresentativeWorkdayAccountReference",
    "serviceCenterRepresentativeWorkdayAccountData"
})
public class ServiceCenterRepresentativeWorkdayAccountType {

    @XmlElement(name = "Service_Center_Representative_Workday_Account_Reference")
    protected ServiceCenterRepresentativeObjectType serviceCenterRepresentativeWorkdayAccountReference;
    @XmlElement(name = "Service_Center_Representative_Workday_Account_Data")
    protected List<ServiceCenterRepresentativeWorkdayAccountDataType> serviceCenterRepresentativeWorkdayAccountData;

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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceCenterRepresentativeWorkdayAccountData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceCenterRepresentativeWorkdayAccountData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceCenterRepresentativeWorkdayAccountDataType }
     * 
     * 
     */
    public List<ServiceCenterRepresentativeWorkdayAccountDataType> getServiceCenterRepresentativeWorkdayAccountData() {
        if (serviceCenterRepresentativeWorkdayAccountData == null) {
            serviceCenterRepresentativeWorkdayAccountData = new ArrayList<ServiceCenterRepresentativeWorkdayAccountDataType>();
        }
        return this.serviceCenterRepresentativeWorkdayAccountData;
    }

}
