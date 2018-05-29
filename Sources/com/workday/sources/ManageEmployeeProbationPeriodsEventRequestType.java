
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Probation Period Request Element
 * 
 * <p>Java class for Manage_Employee_Probation_Periods_Event_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Manage_Employee_Probation_Periods_Event_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Business_Process_Parameters" type="{urn:com.workday/bsvc}Business_Process_ParametersType" minOccurs="0"/>
 *         &lt;element name="Manage_Employee_Probation_Periods_Event_Data" type="{urn:com.workday/bsvc}Manage_Employee_Probation_Periods_Event_DataType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Manage_Employee_Probation_Periods_Event_RequestType", propOrder = {
    "businessProcessParameters",
    "manageEmployeeProbationPeriodsEventData"
})
public class ManageEmployeeProbationPeriodsEventRequestType {

    @XmlElement(name = "Business_Process_Parameters")
    protected BusinessProcessParametersType businessProcessParameters;
    @XmlElement(name = "Manage_Employee_Probation_Periods_Event_Data")
    protected List<ManageEmployeeProbationPeriodsEventDataType> manageEmployeeProbationPeriodsEventData;
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
     * Gets the value of the manageEmployeeProbationPeriodsEventData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manageEmployeeProbationPeriodsEventData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManageEmployeeProbationPeriodsEventData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManageEmployeeProbationPeriodsEventDataType }
     * 
     * 
     */
    public List<ManageEmployeeProbationPeriodsEventDataType> getManageEmployeeProbationPeriodsEventData() {
        if (manageEmployeeProbationPeriodsEventData == null) {
            manageEmployeeProbationPeriodsEventData = new ArrayList<ManageEmployeeProbationPeriodsEventDataType>();
        }
        return this.manageEmployeeProbationPeriodsEventData;
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
