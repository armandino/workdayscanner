
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request Element consisting of Business Process Parameters and element with Worker and Collective Agreement details
 * 
 * <p>Java class for Assign_Employee_Collective_Agreement_Event_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Assign_Employee_Collective_Agreement_Event_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Business_Process_Parameters" type="{urn:com.workday/bsvc}Business_Process_ParametersType" minOccurs="0"/>
 *         &lt;element name="Assign_Employee_Collective_Agreement_Event_Data" type="{urn:com.workday/bsvc}Assign_Employee_Collective_Agreement_Event_DataType" minOccurs="0"/>
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
@XmlType(name = "Assign_Employee_Collective_Agreement_Event_RequestType", propOrder = {
    "businessProcessParameters",
    "assignEmployeeCollectiveAgreementEventData"
})
public class AssignEmployeeCollectiveAgreementEventRequestType {

    @XmlElement(name = "Business_Process_Parameters")
    protected BusinessProcessParametersType businessProcessParameters;
    @XmlElement(name = "Assign_Employee_Collective_Agreement_Event_Data")
    protected AssignEmployeeCollectiveAgreementEventDataType assignEmployeeCollectiveAgreementEventData;
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
     * Gets the value of the assignEmployeeCollectiveAgreementEventData property.
     * 
     * @return
     *     possible object is
     *     {@link AssignEmployeeCollectiveAgreementEventDataType }
     *     
     */
    public AssignEmployeeCollectiveAgreementEventDataType getAssignEmployeeCollectiveAgreementEventData() {
        return assignEmployeeCollectiveAgreementEventData;
    }

    /**
     * Sets the value of the assignEmployeeCollectiveAgreementEventData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignEmployeeCollectiveAgreementEventDataType }
     *     
     */
    public void setAssignEmployeeCollectiveAgreementEventData(AssignEmployeeCollectiveAgreementEventDataType value) {
        this.assignEmployeeCollectiveAgreementEventData = value;
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
