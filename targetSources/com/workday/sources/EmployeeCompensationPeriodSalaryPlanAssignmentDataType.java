
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing all Period Salary Plan Compensation data.
 * 
 * <p>Java class for Employee_Compensation_Period_Salary_Plan_Assignment_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employee_Compensation_Period_Salary_Plan_Assignment_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Period_Salary_Plan_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Compensation_Element_Values_for_Period_Salary_Plan_Data" type="{urn:com.workday/bsvc}Employee_Compensation_Period_Salary_Plan_Assignment_Detail_DataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employee_Compensation_Period_Salary_Plan_Assignment_DataType", propOrder = {
    "periodSalaryPlanName",
    "compensationElementValuesForPeriodSalaryPlanData"
})
public class EmployeeCompensationPeriodSalaryPlanAssignmentDataType {

    @XmlElement(name = "Period_Salary_Plan_Name", required = true)
    protected String periodSalaryPlanName;
    @XmlElement(name = "Compensation_Element_Values_for_Period_Salary_Plan_Data", required = true)
    protected EmployeeCompensationPeriodSalaryPlanAssignmentDetailDataType compensationElementValuesForPeriodSalaryPlanData;

    /**
     * Gets the value of the periodSalaryPlanName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodSalaryPlanName() {
        return periodSalaryPlanName;
    }

    /**
     * Sets the value of the periodSalaryPlanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodSalaryPlanName(String value) {
        this.periodSalaryPlanName = value;
    }

    /**
     * Gets the value of the compensationElementValuesForPeriodSalaryPlanData property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeCompensationPeriodSalaryPlanAssignmentDetailDataType }
     *     
     */
    public EmployeeCompensationPeriodSalaryPlanAssignmentDetailDataType getCompensationElementValuesForPeriodSalaryPlanData() {
        return compensationElementValuesForPeriodSalaryPlanData;
    }

    /**
     * Sets the value of the compensationElementValuesForPeriodSalaryPlanData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeCompensationPeriodSalaryPlanAssignmentDetailDataType }
     *     
     */
    public void setCompensationElementValuesForPeriodSalaryPlanData(EmployeeCompensationPeriodSalaryPlanAssignmentDetailDataType value) {
        this.compensationElementValuesForPeriodSalaryPlanData = value;
    }

}
