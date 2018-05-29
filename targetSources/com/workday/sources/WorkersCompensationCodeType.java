
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element that includes the Workers' Compensation Code instance set and data.
 * 
 * <p>Java class for Workers_Compensation_CodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Workers_Compensation_CodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Workers_Compensation_Code_Reference" type="{urn:com.workday/bsvc}Workers_Compensation_CodeObjectType" minOccurs="0"/>
 *         &lt;element name="Workers_Compensation_Code_Data" type="{urn:com.workday/bsvc}Workers_Compensation_Code_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Workers_Compensation_CodeType", propOrder = {
    "workersCompensationCodeReference",
    "workersCompensationCodeData"
})
public class WorkersCompensationCodeType {

    @XmlElement(name = "Workers_Compensation_Code_Reference")
    protected WorkersCompensationCodeObjectType workersCompensationCodeReference;
    @XmlElement(name = "Workers_Compensation_Code_Data")
    protected WorkersCompensationCodeDataType workersCompensationCodeData;

    /**
     * Gets the value of the workersCompensationCodeReference property.
     * 
     * @return
     *     possible object is
     *     {@link WorkersCompensationCodeObjectType }
     *     
     */
    public WorkersCompensationCodeObjectType getWorkersCompensationCodeReference() {
        return workersCompensationCodeReference;
    }

    /**
     * Sets the value of the workersCompensationCodeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkersCompensationCodeObjectType }
     *     
     */
    public void setWorkersCompensationCodeReference(WorkersCompensationCodeObjectType value) {
        this.workersCompensationCodeReference = value;
    }

    /**
     * Gets the value of the workersCompensationCodeData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkersCompensationCodeDataType }
     *     
     */
    public WorkersCompensationCodeDataType getWorkersCompensationCodeData() {
        return workersCompensationCodeData;
    }

    /**
     * Sets the value of the workersCompensationCodeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkersCompensationCodeDataType }
     *     
     */
    public void setWorkersCompensationCodeData(WorkersCompensationCodeDataType value) {
        this.workersCompensationCodeData = value;
    }

}
