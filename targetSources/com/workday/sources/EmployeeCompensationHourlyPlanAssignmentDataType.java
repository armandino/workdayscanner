
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing all Hourly Plan Compensation data.
 * 
 * <p>Java class for Employee_Compensation_Hourly_Plan_Assignment_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employee_Compensation_Hourly_Plan_Assignment_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Hourly_Plan_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Compensation_Element_Values_for_Base_Pay_Data" type="{urn:com.workday/bsvc}Employee_Compensation_Salary_Plan_Assignment_Detail_DataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employee_Compensation_Hourly_Plan_Assignment_DataType", propOrder = {
    "hourlyPlanName",
    "compensationElementValuesForBasePayData"
})
public class EmployeeCompensationHourlyPlanAssignmentDataType {

    @XmlElement(name = "Hourly_Plan_Name", required = true)
    protected String hourlyPlanName;
    @XmlElement(name = "Compensation_Element_Values_for_Base_Pay_Data", required = true)
    protected EmployeeCompensationSalaryPlanAssignmentDetailDataType compensationElementValuesForBasePayData;

    /**
     * Gets the value of the hourlyPlanName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHourlyPlanName() {
        return hourlyPlanName;
    }

    /**
     * Sets the value of the hourlyPlanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHourlyPlanName(String value) {
        this.hourlyPlanName = value;
    }

    /**
     * Gets the value of the compensationElementValuesForBasePayData property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeCompensationSalaryPlanAssignmentDetailDataType }
     *     
     */
    public EmployeeCompensationSalaryPlanAssignmentDetailDataType getCompensationElementValuesForBasePayData() {
        return compensationElementValuesForBasePayData;
    }

    /**
     * Sets the value of the compensationElementValuesForBasePayData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeCompensationSalaryPlanAssignmentDetailDataType }
     *     
     */
    public void setCompensationElementValuesForBasePayData(EmployeeCompensationSalaryPlanAssignmentDetailDataType value) {
        this.compensationElementValuesForBasePayData = value;
    }

}
