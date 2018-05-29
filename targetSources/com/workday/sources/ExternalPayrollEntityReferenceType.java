
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference element representing a unique instance of External Payroll Entity.
 * 
 * <p>Java class for External_Payroll_Entity_ReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="External_Payroll_Entity_ReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Payroll_Entity_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "External_Payroll_Entity_ReferenceType", propOrder = {
    "payrollEntityID"
})
public class ExternalPayrollEntityReferenceType {

    @XmlElement(name = "Payroll_Entity_ID")
    protected String payrollEntityID;

    /**
     * Gets the value of the payrollEntityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayrollEntityID() {
        return payrollEntityID;
    }

    /**
     * Sets the value of the payrollEntityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayrollEntityID(String value) {
        this.payrollEntityID = value;
    }

}
