
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element containing Workers' Compensation Code data for a Job Profile.
 * 
 * <p>Java class for Workers_Compensation_Replacement_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Workers_Compensation_Replacement_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Workers_Compensation_Code_Reference" type="{urn:com.workday/bsvc}Workers_Compensation_CodeObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Workers_Compensation_Replacement_DataType", propOrder = {
    "workersCompensationCodeReference"
})
public class WorkersCompensationReplacementDataType {

    @XmlElement(name = "Workers_Compensation_Code_Reference")
    protected WorkersCompensationCodeObjectType workersCompensationCodeReference;

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

}
