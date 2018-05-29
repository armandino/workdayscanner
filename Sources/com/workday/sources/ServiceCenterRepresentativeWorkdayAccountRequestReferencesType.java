
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request References
 * 
 * <p>Java class for Service_Center_Representative_Workday_Account_Request_ReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Service_Center_Representative_Workday_Account_Request_ReferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Service_Center_Representative_Workday_Account_Reference" type="{urn:com.workday/bsvc}Service_Center_RepresentativeObjectType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Service_Center_Representative_Workday_Account_Request_ReferencesType", propOrder = {
    "serviceCenterRepresentativeWorkdayAccountReference"
})
public class ServiceCenterRepresentativeWorkdayAccountRequestReferencesType {

    @XmlElement(name = "Service_Center_Representative_Workday_Account_Reference", required = true)
    protected List<ServiceCenterRepresentativeObjectType> serviceCenterRepresentativeWorkdayAccountReference;

    /**
     * Gets the value of the serviceCenterRepresentativeWorkdayAccountReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceCenterRepresentativeWorkdayAccountReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceCenterRepresentativeWorkdayAccountReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceCenterRepresentativeObjectType }
     * 
     * 
     */
    public List<ServiceCenterRepresentativeObjectType> getServiceCenterRepresentativeWorkdayAccountReference() {
        if (serviceCenterRepresentativeWorkdayAccountReference == null) {
            serviceCenterRepresentativeWorkdayAccountReference = new ArrayList<ServiceCenterRepresentativeObjectType>();
        }
        return this.serviceCenterRepresentativeWorkdayAccountReference;
    }

}
