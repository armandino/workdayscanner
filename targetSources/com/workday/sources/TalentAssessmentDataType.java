
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the potential assessment for the employee.
 * 
 * <p>Java class for Talent_Assessment_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Talent_Assessment_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Employee_Potential_Data" type="{urn:com.workday/bsvc}Employee_Talent_Assessment_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Talent_Assessment_DataType", propOrder = {
    "employeePotentialData"
})
public class TalentAssessmentDataType {

    @XmlElement(name = "Employee_Potential_Data")
    protected EmployeeTalentAssessmentDataType employeePotentialData;

    /**
     * Gets the value of the employeePotentialData property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeTalentAssessmentDataType }
     *     
     */
    public EmployeeTalentAssessmentDataType getEmployeePotentialData() {
        return employeePotentialData;
    }

    /**
     * Sets the value of the employeePotentialData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeTalentAssessmentDataType }
     *     
     */
    public void setEmployeePotentialData(EmployeeTalentAssessmentDataType value) {
        this.employeePotentialData = value;
    }

}
