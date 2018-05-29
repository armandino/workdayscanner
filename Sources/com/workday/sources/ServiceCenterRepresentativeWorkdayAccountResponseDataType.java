
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element containing Service Center Representative Workday Account response data.
 * 
 * <p>Java class for Service_Center_Representative_Workday_Account_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Service_Center_Representative_Workday_Account_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Service_Center_Representative_Workday_Account" type="{urn:com.workday/bsvc}Service_Center_Representative_Workday_AccountType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Service_Center_Representative_Workday_Account_Response_DataType", propOrder = {
    "serviceCenterRepresentativeWorkdayAccount"
})
public class ServiceCenterRepresentativeWorkdayAccountResponseDataType {

    @XmlElement(name = "Service_Center_Representative_Workday_Account")
    protected List<ServiceCenterRepresentativeWorkdayAccountType> serviceCenterRepresentativeWorkdayAccount;

    /**
     * Gets the value of the serviceCenterRepresentativeWorkdayAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceCenterRepresentativeWorkdayAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceCenterRepresentativeWorkdayAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceCenterRepresentativeWorkdayAccountType }
     * 
     * 
     */
    public List<ServiceCenterRepresentativeWorkdayAccountType> getServiceCenterRepresentativeWorkdayAccount() {
        if (serviceCenterRepresentativeWorkdayAccount == null) {
            serviceCenterRepresentativeWorkdayAccount = new ArrayList<ServiceCenterRepresentativeWorkdayAccountType>();
        }
        return this.serviceCenterRepresentativeWorkdayAccount;
    }

}
