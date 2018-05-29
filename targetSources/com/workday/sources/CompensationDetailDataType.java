
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing all Compesation Detail data.
 * 
 * <p>Java class for Compensation_Detail_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Compensation_Detail_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Compensation_Package_Reference" type="{urn:com.workday/bsvc}Compensation_Package_ReferenceType"/>
 *         &lt;element name="Compensation_Grade_Reference" type="{urn:com.workday/bsvc}Compensation_Grade_ReferenceType"/>
 *         &lt;element name="Compensation_Grade_Profile_Reference" type="{urn:com.workday/bsvc}Compensation_Grade_Profile_ReferenceType" minOccurs="0"/>
 *         &lt;element name="Compensation_Step_Reference" type="{urn:com.workday/bsvc}Compensation_Step_Reference_DataType" minOccurs="0"/>
 *         &lt;element name="Salary_Plan_for_Compensation_Data" type="{urn:com.workday/bsvc}Employee_Compensation_Salary_Plan_Assignment_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Hourly_Plan_for_Compensation_Data" type="{urn:com.workday/bsvc}Employee_Compensation_Hourly_Plan_Assignment_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Unit_Salary_Plan_for_Compensation_Data" type="{urn:com.workday/bsvc}Employee_Compensation_Salary_Unit_Plan_Assignment_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Allowance_Plan_for_Compensation_Data" type="{urn:com.workday/bsvc}Employee_Compensation_Allowance_Plan_Assignment_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Unit_Allowance_Plan_for_Compensation_Data" type="{urn:com.workday/bsvc}Employee_Compensation_Allowance_Unit_Plan_Assignment_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Bonus_Plan_for_Compensation_Data" type="{urn:com.workday/bsvc}Employee_Compensation_Bonus_Plan_Assignment_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Merit_Plan_for_Compensation_Data" type="{urn:com.workday/bsvc}Employee_Compensation_Merit_Plan_Assignment_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Commission_Plan_for_Compensation_Data" type="{urn:com.workday/bsvc}Employee_Compensation_Commission_Plan_Assignment_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Period_Salary_Plan_for_Compensation_Data" type="{urn:com.workday/bsvc}Employee_Compensation_Period_Salary_Plan_Assignment_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Compensation_Detail_DataType", propOrder = {
    "compensationPackageReference",
    "compensationGradeReference",
    "compensationGradeProfileReference",
    "compensationStepReference",
    "salaryPlanForCompensationData",
    "hourlyPlanForCompensationData",
    "unitSalaryPlanForCompensationData",
    "allowancePlanForCompensationData",
    "unitAllowancePlanForCompensationData",
    "bonusPlanForCompensationData",
    "meritPlanForCompensationData",
    "commissionPlanForCompensationData",
    "periodSalaryPlanForCompensationData"
})
public class CompensationDetailDataType {

    @XmlElement(name = "Compensation_Package_Reference", required = true)
    protected CompensationPackageReferenceType compensationPackageReference;
    @XmlElement(name = "Compensation_Grade_Reference", required = true)
    protected CompensationGradeReferenceType compensationGradeReference;
    @XmlElement(name = "Compensation_Grade_Profile_Reference")
    protected CompensationGradeProfileReferenceType compensationGradeProfileReference;
    @XmlElement(name = "Compensation_Step_Reference")
    protected CompensationStepReferenceDataType compensationStepReference;
    @XmlElement(name = "Salary_Plan_for_Compensation_Data")
    protected List<EmployeeCompensationSalaryPlanAssignmentDataType> salaryPlanForCompensationData;
    @XmlElement(name = "Hourly_Plan_for_Compensation_Data")
    protected List<EmployeeCompensationHourlyPlanAssignmentDataType> hourlyPlanForCompensationData;
    @XmlElement(name = "Unit_Salary_Plan_for_Compensation_Data")
    protected List<EmployeeCompensationSalaryUnitPlanAssignmentDataType> unitSalaryPlanForCompensationData;
    @XmlElement(name = "Allowance_Plan_for_Compensation_Data")
    protected List<EmployeeCompensationAllowancePlanAssignmentDataType> allowancePlanForCompensationData;
    @XmlElement(name = "Unit_Allowance_Plan_for_Compensation_Data")
    protected List<EmployeeCompensationAllowanceUnitPlanAssignmentDataType> unitAllowancePlanForCompensationData;
    @XmlElement(name = "Bonus_Plan_for_Compensation_Data")
    protected List<EmployeeCompensationBonusPlanAssignmentDataType> bonusPlanForCompensationData;
    @XmlElement(name = "Merit_Plan_for_Compensation_Data")
    protected List<EmployeeCompensationMeritPlanAssignmentDataType> meritPlanForCompensationData;
    @XmlElement(name = "Commission_Plan_for_Compensation_Data")
    protected List<EmployeeCompensationCommissionPlanAssignmentDataType> commissionPlanForCompensationData;
    @XmlElement(name = "Period_Salary_Plan_for_Compensation_Data")
    protected List<EmployeeCompensationPeriodSalaryPlanAssignmentDataType> periodSalaryPlanForCompensationData;

    /**
     * Gets the value of the compensationPackageReference property.
     * 
     * @return
     *     possible object is
     *     {@link CompensationPackageReferenceType }
     *     
     */
    public CompensationPackageReferenceType getCompensationPackageReference() {
        return compensationPackageReference;
    }

    /**
     * Sets the value of the compensationPackageReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompensationPackageReferenceType }
     *     
     */
    public void setCompensationPackageReference(CompensationPackageReferenceType value) {
        this.compensationPackageReference = value;
    }

    /**
     * Gets the value of the compensationGradeReference property.
     * 
     * @return
     *     possible object is
     *     {@link CompensationGradeReferenceType }
     *     
     */
    public CompensationGradeReferenceType getCompensationGradeReference() {
        return compensationGradeReference;
    }

    /**
     * Sets the value of the compensationGradeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompensationGradeReferenceType }
     *     
     */
    public void setCompensationGradeReference(CompensationGradeReferenceType value) {
        this.compensationGradeReference = value;
    }

    /**
     * Gets the value of the compensationGradeProfileReference property.
     * 
     * @return
     *     possible object is
     *     {@link CompensationGradeProfileReferenceType }
     *     
     */
    public CompensationGradeProfileReferenceType getCompensationGradeProfileReference() {
        return compensationGradeProfileReference;
    }

    /**
     * Sets the value of the compensationGradeProfileReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompensationGradeProfileReferenceType }
     *     
     */
    public void setCompensationGradeProfileReference(CompensationGradeProfileReferenceType value) {
        this.compensationGradeProfileReference = value;
    }

    /**
     * Gets the value of the compensationStepReference property.
     * 
     * @return
     *     possible object is
     *     {@link CompensationStepReferenceDataType }
     *     
     */
    public CompensationStepReferenceDataType getCompensationStepReference() {
        return compensationStepReference;
    }

    /**
     * Sets the value of the compensationStepReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompensationStepReferenceDataType }
     *     
     */
    public void setCompensationStepReference(CompensationStepReferenceDataType value) {
        this.compensationStepReference = value;
    }

    /**
     * Gets the value of the salaryPlanForCompensationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salaryPlanForCompensationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalaryPlanForCompensationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeCompensationSalaryPlanAssignmentDataType }
     * 
     * 
     */
    public List<EmployeeCompensationSalaryPlanAssignmentDataType> getSalaryPlanForCompensationData() {
        if (salaryPlanForCompensationData == null) {
            salaryPlanForCompensationData = new ArrayList<EmployeeCompensationSalaryPlanAssignmentDataType>();
        }
        return this.salaryPlanForCompensationData;
    }

    /**
     * Gets the value of the hourlyPlanForCompensationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hourlyPlanForCompensationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHourlyPlanForCompensationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeCompensationHourlyPlanAssignmentDataType }
     * 
     * 
     */
    public List<EmployeeCompensationHourlyPlanAssignmentDataType> getHourlyPlanForCompensationData() {
        if (hourlyPlanForCompensationData == null) {
            hourlyPlanForCompensationData = new ArrayList<EmployeeCompensationHourlyPlanAssignmentDataType>();
        }
        return this.hourlyPlanForCompensationData;
    }

    /**
     * Gets the value of the unitSalaryPlanForCompensationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitSalaryPlanForCompensationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitSalaryPlanForCompensationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeCompensationSalaryUnitPlanAssignmentDataType }
     * 
     * 
     */
    public List<EmployeeCompensationSalaryUnitPlanAssignmentDataType> getUnitSalaryPlanForCompensationData() {
        if (unitSalaryPlanForCompensationData == null) {
            unitSalaryPlanForCompensationData = new ArrayList<EmployeeCompensationSalaryUnitPlanAssignmentDataType>();
        }
        return this.unitSalaryPlanForCompensationData;
    }

    /**
     * Gets the value of the allowancePlanForCompensationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowancePlanForCompensationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowancePlanForCompensationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeCompensationAllowancePlanAssignmentDataType }
     * 
     * 
     */
    public List<EmployeeCompensationAllowancePlanAssignmentDataType> getAllowancePlanForCompensationData() {
        if (allowancePlanForCompensationData == null) {
            allowancePlanForCompensationData = new ArrayList<EmployeeCompensationAllowancePlanAssignmentDataType>();
        }
        return this.allowancePlanForCompensationData;
    }

    /**
     * Gets the value of the unitAllowancePlanForCompensationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitAllowancePlanForCompensationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitAllowancePlanForCompensationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeCompensationAllowanceUnitPlanAssignmentDataType }
     * 
     * 
     */
    public List<EmployeeCompensationAllowanceUnitPlanAssignmentDataType> getUnitAllowancePlanForCompensationData() {
        if (unitAllowancePlanForCompensationData == null) {
            unitAllowancePlanForCompensationData = new ArrayList<EmployeeCompensationAllowanceUnitPlanAssignmentDataType>();
        }
        return this.unitAllowancePlanForCompensationData;
    }

    /**
     * Gets the value of the bonusPlanForCompensationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bonusPlanForCompensationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBonusPlanForCompensationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeCompensationBonusPlanAssignmentDataType }
     * 
     * 
     */
    public List<EmployeeCompensationBonusPlanAssignmentDataType> getBonusPlanForCompensationData() {
        if (bonusPlanForCompensationData == null) {
            bonusPlanForCompensationData = new ArrayList<EmployeeCompensationBonusPlanAssignmentDataType>();
        }
        return this.bonusPlanForCompensationData;
    }

    /**
     * Gets the value of the meritPlanForCompensationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meritPlanForCompensationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeritPlanForCompensationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeCompensationMeritPlanAssignmentDataType }
     * 
     * 
     */
    public List<EmployeeCompensationMeritPlanAssignmentDataType> getMeritPlanForCompensationData() {
        if (meritPlanForCompensationData == null) {
            meritPlanForCompensationData = new ArrayList<EmployeeCompensationMeritPlanAssignmentDataType>();
        }
        return this.meritPlanForCompensationData;
    }

    /**
     * Gets the value of the commissionPlanForCompensationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commissionPlanForCompensationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommissionPlanForCompensationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeCompensationCommissionPlanAssignmentDataType }
     * 
     * 
     */
    public List<EmployeeCompensationCommissionPlanAssignmentDataType> getCommissionPlanForCompensationData() {
        if (commissionPlanForCompensationData == null) {
            commissionPlanForCompensationData = new ArrayList<EmployeeCompensationCommissionPlanAssignmentDataType>();
        }
        return this.commissionPlanForCompensationData;
    }

    /**
     * Gets the value of the periodSalaryPlanForCompensationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the periodSalaryPlanForCompensationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriodSalaryPlanForCompensationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeCompensationPeriodSalaryPlanAssignmentDataType }
     * 
     * 
     */
    public List<EmployeeCompensationPeriodSalaryPlanAssignmentDataType> getPeriodSalaryPlanForCompensationData() {
        if (periodSalaryPlanForCompensationData == null) {
            periodSalaryPlanForCompensationData = new ArrayList<EmployeeCompensationPeriodSalaryPlanAssignmentDataType>();
        }
        return this.periodSalaryPlanForCompensationData;
    }

}
