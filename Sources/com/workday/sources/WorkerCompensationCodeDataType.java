
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for the worker compensation code. Contains the reference id and the worker comp code.
 * 
 * <p>Java class for Worker_Compensation_Code_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Compensation_Code_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Workers_Compensation_Code_Reference" type="{urn:com.workday/bsvc}Workers_Compensation_CodeObjectType" minOccurs="0"/>
 *         &lt;element name="Workers_Compensation_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Compensation_Code_DataType", propOrder = {
    "workersCompensationCodeReference",
    "workersCompensationCode"
})
public class WorkerCompensationCodeDataType {

    @XmlElement(name = "Workers_Compensation_Code_Reference")
    protected WorkersCompensationCodeObjectType workersCompensationCodeReference;
    @XmlElement(name = "Workers_Compensation_Code")
    protected String workersCompensationCode;

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
     * Gets the value of the workersCompensationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkersCompensationCode() {
        return workersCompensationCode;
    }

    /**
     * Sets the value of the workersCompensationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkersCompensationCode(String value) {
        this.workersCompensationCode = value;
    }

}
