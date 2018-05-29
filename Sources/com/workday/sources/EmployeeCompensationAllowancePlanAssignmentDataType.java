
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing all Allowance Plan Compensation data.
 * 
 * <p>Java class for Employee_Compensation_Allowance_Plan_Assignment_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employee_Compensation_Allowance_Plan_Assignment_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Allowance_Plan_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Compensation_Element_Values_for_Allowance_Plan_Data" type="{urn:com.workday/bsvc}Employee_Compensation_Allowance_Plan_Assignment_Detail_DataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employee_Compensation_Allowance_Plan_Assignment_DataType", propOrder = {
    "allowancePlanName",
    "compensationElementValuesForAllowancePlanData"
})
public class EmployeeCompensationAllowancePlanAssignmentDataType {

    @XmlElement(name = "Allowance_Plan_Name", required = true)
    protected String allowancePlanName;
    @XmlElement(name = "Compensation_Element_Values_for_Allowance_Plan_Data", required = true)
    protected EmployeeCompensationAllowancePlanAssignmentDetailDataType compensationElementValuesForAllowancePlanData;

    /**
     * Gets the value of the allowancePlanName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowancePlanName() {
        return allowancePlanName;
    }

    /**
     * Sets the value of the allowancePlanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowancePlanName(String value) {
        this.allowancePlanName = value;
    }

    /**
     * Gets the value of the compensationElementValuesForAllowancePlanData property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeCompensationAllowancePlanAssignmentDetailDataType }
     *     
     */
    public EmployeeCompensationAllowancePlanAssignmentDetailDataType getCompensationElementValuesForAllowancePlanData() {
        return compensationElementValuesForAllowancePlanData;
    }

    /**
     * Sets the value of the compensationElementValuesForAllowancePlanData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeCompensationAllowancePlanAssignmentDetailDataType }
     *     
     */
    public void setCompensationElementValuesForAllowancePlanData(EmployeeCompensationAllowancePlanAssignmentDetailDataType value) {
        this.compensationElementValuesForAllowancePlanData = value;
    }

}
