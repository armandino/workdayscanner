
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper to hold the business process configuration and user account details.
 * 
 * <p>Java class for Create_Workday_Account_Sub_Business_ProcessType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Create_Workday_Account_Sub_Business_ProcessType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Business_Sub_Process_Parameters" type="{urn:com.workday/bsvc}Business_Sub_Process_ParametersType" minOccurs="0"/>
 *         &lt;element name="Create_Workday_Account_Data" type="{urn:com.workday/bsvc}System_User_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Create_Workday_Account_Sub_Business_ProcessType", propOrder = {
    "businessSubProcessParameters",
    "createWorkdayAccountData"
})
public class CreateWorkdayAccountSubBusinessProcessType {

    @XmlElement(name = "Business_Sub_Process_Parameters")
    protected BusinessSubProcessParametersType businessSubProcessParameters;
    @XmlElement(name = "Create_Workday_Account_Data")
    protected SystemUserDataType createWorkdayAccountData;

    /**
     * Gets the value of the businessSubProcessParameters property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessSubProcessParametersType }
     *     
     */
    public BusinessSubProcessParametersType getBusinessSubProcessParameters() {
        return businessSubProcessParameters;
    }

    /**
     * Sets the value of the businessSubProcessParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessSubProcessParametersType }
     *     
     */
    public void setBusinessSubProcessParameters(BusinessSubProcessParametersType value) {
        this.businessSubProcessParameters = value;
    }

    /**
     * Gets the value of the createWorkdayAccountData property.
     * 
     * @return
     *     possible object is
     *     {@link SystemUserDataType }
     *     
     */
    public SystemUserDataType getCreateWorkdayAccountData() {
        return createWorkdayAccountData;
    }

    /**
     * Sets the value of the createWorkdayAccountData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemUserDataType }
     *     
     */
    public void setCreateWorkdayAccountData(SystemUserDataType value) {
        this.createWorkdayAccountData = value;
    }

}
