
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Utilize the following elements to update the Personal Information for an existing Employee within the Workday system.
 * 
 * <p>Java class for Employee_Personal_Info_UpdateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employee_Personal_Info_UpdateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Employee_Reference" type="{urn:com.workday/bsvc}Employee_ReferenceType"/>
 *         &lt;element name="Employee_Personal_Info_Data" type="{urn:com.workday/bsvc}Worker_Personal_Info_DataType"/>
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
@XmlType(name = "Employee_Personal_Info_UpdateType", propOrder = {
    "employeeReference",
    "employeePersonalInfoData"
})
public class EmployeePersonalInfoUpdateType {

    @XmlElement(name = "Employee_Reference", required = true)
    protected EmployeeReferenceType employeeReference;
    @XmlElement(name = "Employee_Personal_Info_Data", required = true)
    protected WorkerPersonalInfoDataType employeePersonalInfoData;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the employeeReference property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeReferenceType }
     *     
     */
    public EmployeeReferenceType getEmployeeReference() {
        return employeeReference;
    }

    /**
     * Sets the value of the employeeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeReferenceType }
     *     
     */
    public void setEmployeeReference(EmployeeReferenceType value) {
        this.employeeReference = value;
    }

    /**
     * Gets the value of the employeePersonalInfoData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerPersonalInfoDataType }
     *     
     */
    public WorkerPersonalInfoDataType getEmployeePersonalInfoData() {
        return employeePersonalInfoData;
    }

    /**
     * Sets the value of the employeePersonalInfoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerPersonalInfoDataType }
     *     
     */
    public void setEmployeePersonalInfoData(WorkerPersonalInfoDataType value) {
        this.employeePersonalInfoData = value;
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
