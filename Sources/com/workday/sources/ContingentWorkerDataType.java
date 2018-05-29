
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing all Contingent Worker data.
 * 
 * <p>Java class for Contingent_Worker_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contingent_Worker_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="User_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Integration_ID_Data" type="{urn:com.workday/bsvc}External_Integration_ID_DataType" minOccurs="0"/>
 *         &lt;element name="Personal_Info_Data" type="{urn:com.workday/bsvc}Personal_Info_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Contingent_Worker_Contract_Info_Data" type="{urn:com.workday/bsvc}Contingent_Worker_Contract_Info_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contingent_Worker_DataType", propOrder = {
    "userID",
    "integrationIDData",
    "personalInfoData",
    "contingentWorkerContractInfoData"
})
public class ContingentWorkerDataType {

    @XmlElement(name = "User_ID")
    protected String userID;
    @XmlElement(name = "Integration_ID_Data")
    protected ExternalIntegrationIDDataType integrationIDData;
    @XmlElement(name = "Personal_Info_Data")
    protected List<PersonalInfoDataType> personalInfoData;
    @XmlElement(name = "Contingent_Worker_Contract_Info_Data")
    protected List<ContingentWorkerContractInfoDataType> contingentWorkerContractInfoData;

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the integrationIDData property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalIntegrationIDDataType }
     *     
     */
    public ExternalIntegrationIDDataType getIntegrationIDData() {
        return integrationIDData;
    }

    /**
     * Sets the value of the integrationIDData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalIntegrationIDDataType }
     *     
     */
    public void setIntegrationIDData(ExternalIntegrationIDDataType value) {
        this.integrationIDData = value;
    }

    /**
     * Gets the value of the personalInfoData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personalInfoData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonalInfoData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonalInfoDataType }
     * 
     * 
     */
    public List<PersonalInfoDataType> getPersonalInfoData() {
        if (personalInfoData == null) {
            personalInfoData = new ArrayList<PersonalInfoDataType>();
        }
        return this.personalInfoData;
    }

    /**
     * Gets the value of the contingentWorkerContractInfoData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contingentWorkerContractInfoData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContingentWorkerContractInfoData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContingentWorkerContractInfoDataType }
     * 
     * 
     */
    public List<ContingentWorkerContractInfoDataType> getContingentWorkerContractInfoData() {
        if (contingentWorkerContractInfoData == null) {
            contingentWorkerContractInfoData = new ArrayList<ContingentWorkerContractInfoDataType>();
        }
        return this.contingentWorkerContractInfoData;
    }

}
