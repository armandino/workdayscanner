
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing all Unit Salary Plan Compensation data.
 * 
 * <p>Java class for Employee_Compensation_Salary_Unit_Plan_Assignment_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employee_Compensation_Salary_Unit_Plan_Assignment_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Unit_Salary_Plan_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Compensation_Element_Values_for_Unit_Salary_Plan_Data" type="{urn:com.workday/bsvc}Employee_Compensation_Salary_Unit_Plan_Assignment_Detail_DataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employee_Compensation_Salary_Unit_Plan_Assignment_DataType", propOrder = {
    "unitSalaryPlanName",
    "compensationElementValuesForUnitSalaryPlanData"
})
public class EmployeeCompensationSalaryUnitPlanAssignmentDataType {

    @XmlElement(name = "Unit_Salary_Plan_Name", required = true)
    protected String unitSalaryPlanName;
    @XmlElement(name = "Compensation_Element_Values_for_Unit_Salary_Plan_Data", required = true)
    protected EmployeeCompensationSalaryUnitPlanAssignmentDetailDataType compensationElementValuesForUnitSalaryPlanData;

    /**
     * Gets the value of the unitSalaryPlanName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitSalaryPlanName() {
        return unitSalaryPlanName;
    }

    /**
     * Sets the value of the unitSalaryPlanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitSalaryPlanName(String value) {
        this.unitSalaryPlanName = value;
    }

    /**
     * Gets the value of the compensationElementValuesForUnitSalaryPlanData property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeCompensationSalaryUnitPlanAssignmentDetailDataType }
     *     
     */
    public EmployeeCompensationSalaryUnitPlanAssignmentDetailDataType getCompensationElementValuesForUnitSalaryPlanData() {
        return compensationElementValuesForUnitSalaryPlanData;
    }

    /**
     * Sets the value of the compensationElementValuesForUnitSalaryPlanData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeCompensationSalaryUnitPlanAssignmentDetailDataType }
     *     
     */
    public void setCompensationElementValuesForUnitSalaryPlanData(EmployeeCompensationSalaryUnitPlanAssignmentDetailDataType value) {
        this.compensationElementValuesForUnitSalaryPlanData = value;
    }

}
