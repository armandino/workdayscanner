
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Contains the worker's compensation information.
 * 
 * Security Note: This element is secured to the following domains:  Self Service: Compensation; Worker Data: Compensation by Organization
 * 
 * <p>Java class for Worker_Compensation_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Compensation_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Compensation_Effective_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Reason_Reference" type="{urn:com.workday/bsvc}Event_Classification_SubcategoryObjectType" minOccurs="0"/>
 *         &lt;element name="Compensation_Guidelines_Data" type="{urn:com.workday/bsvc}Compensatable_Guidelines_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Salary_and_Hourly_Data" type="{urn:com.workday/bsvc}Employee_Base_Pay_Plan_Assignment_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Unit_Salary_Plan_Data" type="{urn:com.workday/bsvc}Employee_Salary_Unit_Plan_Assignment_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Allowance_Plan_Data" type="{urn:com.workday/bsvc}Employee_Allowance_Plan_Assignment_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Unit_Allowance_Plan_Data" type="{urn:com.workday/bsvc}Employee_Allowance_Unit_Plan_Assignment_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Bonus_Plan_Data" type="{urn:com.workday/bsvc}Employee_Bonus_Plan_Assignment_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Merit_Plan_Data" type="{urn:com.workday/bsvc}Employee_Merit_Plan_Assignment_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Commission_Plan_Data" type="{urn:com.workday/bsvc}Employee_Commission_Plan_Assignment_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Stock_Plan_Data" type="{urn:com.workday/bsvc}Employee_Stock_Plan_Assignment_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Future_Payment_Plan_Data" type="{urn:com.workday/bsvc}Future_Payment_Plan_Assignment_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Period_Salary_Plan_Data" type="{urn:com.workday/bsvc}Employee_Period_Salary_Plan_Assignment_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Employee_Compensation_Summary_Data" type="{urn:com.workday/bsvc}Compensatable_Summary_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Compensation_DataType", propOrder = {
    "compensationEffectiveDate",
    "reasonReference",
    "compensationGuidelinesData",
    "salaryAndHourlyData",
    "unitSalaryPlanData",
    "allowancePlanData",
    "unitAllowancePlanData",
    "bonusPlanData",
    "meritPlanData",
    "commissionPlanData",
    "stockPlanData",
    "futurePaymentPlanData",
    "periodSalaryPlanData",
    "employeeCompensationSummaryData"
})
public class WorkerCompensationDataType {

    @XmlElement(name = "Compensation_Effective_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar compensationEffectiveDate;
    @XmlElement(name = "Reason_Reference")
    protected EventClassificationSubcategoryObjectType reasonReference;
    @XmlElement(name = "Compensation_Guidelines_Data")
    protected List<CompensatableGuidelinesDataType> compensationGuidelinesData;
    @XmlElement(name = "Salary_and_Hourly_Data")
    protected List<EmployeeBasePayPlanAssignmentDataType> salaryAndHourlyData;
    @XmlElement(name = "Unit_Salary_Plan_Data")
    protected List<EmployeeSalaryUnitPlanAssignmentDataType> unitSalaryPlanData;
    @XmlElement(name = "Allowance_Plan_Data")
    protected List<EmployeeAllowancePlanAssignmentDataType> allowancePlanData;
    @XmlElement(name = "Unit_Allowance_Plan_Data")
    protected List<EmployeeAllowanceUnitPlanAssignmentDataType> unitAllowancePlanData;
    @XmlElement(name = "Bonus_Plan_Data")
    protected List<EmployeeBonusPlanAssignmentDataType> bonusPlanData;
    @XmlElement(name = "Merit_Plan_Data")
    protected List<EmployeeMeritPlanAssignmentDataType> meritPlanData;
    @XmlElement(name = "Commission_Plan_Data")
    protected List<EmployeeCommissionPlanAssignmentDataType> commissionPlanData;
    @XmlElement(name = "Stock_Plan_Data")
    protected List<EmployeeStockPlanAssignmentDataType> stockPlanData;
    @XmlElement(name = "Future_Payment_Plan_Data")
    protected List<FuturePaymentPlanAssignmentDataType> futurePaymentPlanData;
    @XmlElement(name = "Period_Salary_Plan_Data")
    protected List<EmployeePeriodSalaryPlanAssignmentDataType> periodSalaryPlanData;
    @XmlElement(name = "Employee_Compensation_Summary_Data")
    protected CompensatableSummaryDataType employeeCompensationSummaryData;

    /**
     * Gets the value of the compensationEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompensationEffectiveDate() {
        return compensationEffectiveDate;
    }

    /**
     * Sets the value of the compensationEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompensationEffectiveDate(XMLGregorianCalendar value) {
        this.compensationEffectiveDate = value;
    }

    /**
     * Gets the value of the reasonReference property.
     * 
     * @return
     *     possible object is
     *     {@link EventClassificationSubcategoryObjectType }
     *     
     */
    public EventClassificationSubcategoryObjectType getReasonReference() {
        return reasonReference;
    }

    /**
     * Sets the value of the reasonReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventClassificationSubcategoryObjectType }
     *     
     */
    public void setReasonReference(EventClassificationSubcategoryObjectType value) {
        this.reasonReference = value;
    }

    /**
     * Gets the value of the compensationGuidelinesData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compensationGuidelinesData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompensationGuidelinesData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompensatableGuidelinesDataType }
     * 
     * 
     */
    public List<CompensatableGuidelinesDataType> getCompensationGuidelinesData() {
        if (compensationGuidelinesData == null) {
            compensationGuidelinesData = new ArrayList<CompensatableGuidelinesDataType>();
        }
        return this.compensationGuidelinesData;
    }

    /**
     * Gets the value of the salaryAndHourlyData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salaryAndHourlyData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalaryAndHourlyData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeBasePayPlanAssignmentDataType }
     * 
     * 
     */
    public List<EmployeeBasePayPlanAssignmentDataType> getSalaryAndHourlyData() {
        if (salaryAndHourlyData == null) {
            salaryAndHourlyData = new ArrayList<EmployeeBasePayPlanAssignmentDataType>();
        }
        return this.salaryAndHourlyData;
    }

    /**
     * Gets the value of the unitSalaryPlanData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitSalaryPlanData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitSalaryPlanData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeSalaryUnitPlanAssignmentDataType }
     * 
     * 
     */
    public List<EmployeeSalaryUnitPlanAssignmentDataType> getUnitSalaryPlanData() {
        if (unitSalaryPlanData == null) {
            unitSalaryPlanData = new ArrayList<EmployeeSalaryUnitPlanAssignmentDataType>();
        }
        return this.unitSalaryPlanData;
    }

    /**
     * Gets the value of the allowancePlanData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowancePlanData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowancePlanData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeAllowancePlanAssignmentDataType }
     * 
     * 
     */
    public List<EmployeeAllowancePlanAssignmentDataType> getAllowancePlanData() {
        if (allowancePlanData == null) {
            allowancePlanData = new ArrayList<EmployeeAllowancePlanAssignmentDataType>();
        }
        return this.allowancePlanData;
    }

    /**
     * Gets the value of the unitAllowancePlanData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitAllowancePlanData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitAllowancePlanData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeAllowanceUnitPlanAssignmentDataType }
     * 
     * 
     */
    public List<EmployeeAllowanceUnitPlanAssignmentDataType> getUnitAllowancePlanData() {
        if (unitAllowancePlanData == null) {
            unitAllowancePlanData = new ArrayList<EmployeeAllowanceUnitPlanAssignmentDataType>();
        }
        return this.unitAllowancePlanData;
    }

    /**
     * Gets the value of the bonusPlanData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bonusPlanData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBonusPlanData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeBonusPlanAssignmentDataType }
     * 
     * 
     */
    public List<EmployeeBonusPlanAssignmentDataType> getBonusPlanData() {
        if (bonusPlanData == null) {
            bonusPlanData = new ArrayList<EmployeeBonusPlanAssignmentDataType>();
        }
        return this.bonusPlanData;
    }

    /**
     * Gets the value of the meritPlanData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meritPlanData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeritPlanData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeMeritPlanAssignmentDataType }
     * 
     * 
     */
    public List<EmployeeMeritPlanAssignmentDataType> getMeritPlanData() {
        if (meritPlanData == null) {
            meritPlanData = new ArrayList<EmployeeMeritPlanAssignmentDataType>();
        }
        return this.meritPlanData;
    }

    /**
     * Gets the value of the commissionPlanData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commissionPlanData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommissionPlanData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeCommissionPlanAssignmentDataType }
     * 
     * 
     */
    public List<EmployeeCommissionPlanAssignmentDataType> getCommissionPlanData() {
        if (commissionPlanData == null) {
            commissionPlanData = new ArrayList<EmployeeCommissionPlanAssignmentDataType>();
        }
        return this.commissionPlanData;
    }

    /**
     * Gets the value of the stockPlanData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stockPlanData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStockPlanData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeStockPlanAssignmentDataType }
     * 
     * 
     */
    public List<EmployeeStockPlanAssignmentDataType> getStockPlanData() {
        if (stockPlanData == null) {
            stockPlanData = new ArrayList<EmployeeStockPlanAssignmentDataType>();
        }
        return this.stockPlanData;
    }

    /**
     * Gets the value of the futurePaymentPlanData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the futurePaymentPlanData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFuturePaymentPlanData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FuturePaymentPlanAssignmentDataType }
     * 
     * 
     */
    public List<FuturePaymentPlanAssignmentDataType> getFuturePaymentPlanData() {
        if (futurePaymentPlanData == null) {
            futurePaymentPlanData = new ArrayList<FuturePaymentPlanAssignmentDataType>();
        }
        return this.futurePaymentPlanData;
    }

    /**
     * Gets the value of the periodSalaryPlanData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the periodSalaryPlanData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriodSalaryPlanData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeePeriodSalaryPlanAssignmentDataType }
     * 
     * 
     */
    public List<EmployeePeriodSalaryPlanAssignmentDataType> getPeriodSalaryPlanData() {
        if (periodSalaryPlanData == null) {
            periodSalaryPlanData = new ArrayList<EmployeePeriodSalaryPlanAssignmentDataType>();
        }
        return this.periodSalaryPlanData;
    }

    /**
     * Gets the value of the employeeCompensationSummaryData property.
     * 
     * @return
     *     possible object is
     *     {@link CompensatableSummaryDataType }
     *     
     */
    public CompensatableSummaryDataType getEmployeeCompensationSummaryData() {
        return employeeCompensationSummaryData;
    }

    /**
     * Sets the value of the employeeCompensationSummaryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompensatableSummaryDataType }
     *     
     */
    public void setEmployeeCompensationSummaryData(CompensatableSummaryDataType value) {
        this.employeeCompensationSummaryData = value;
    }

}
