
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the retirement savings election information for the employee.
 * 
 * <p>Java class for Worker_Retirement_Savings_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Retirement_Savings_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Benefit_Election_Data" type="{urn:com.workday/bsvc}Worker_Benefit_Election_DataType"/>
 *         &lt;choice>
 *           &lt;element name="Employee_Contribution_Percentage_Data" type="{urn:com.workday/bsvc}Employee_Contribution_Percentage_DataType" minOccurs="0"/>
 *           &lt;element name="Employee_Contribution_Amount_Data" type="{urn:com.workday/bsvc}Employee_Contribution_Amount_DataType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="Employer_Contribution_Percentage_Data" type="{urn:com.workday/bsvc}Employer_Contribution_Percentage_DataType" minOccurs="0"/>
 *           &lt;element name="Employer_Contribution_Amount_Data" type="{urn:com.workday/bsvc}Employer_Contribution_Amount_DataType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="Beneficiary_Designation_Data" type="{urn:com.workday/bsvc}Beneficiary_Designation_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Retirement_Savings_DataType", propOrder = {
    "benefitElectionData",
    "employeeContributionPercentageData",
    "employeeContributionAmountData",
    "employerContributionPercentageData",
    "employerContributionAmountData",
    "beneficiaryDesignationData"
})
public class WorkerRetirementSavingsDataType {

    @XmlElement(name = "Benefit_Election_Data", required = true)
    protected WorkerBenefitElectionDataType benefitElectionData;
    @XmlElement(name = "Employee_Contribution_Percentage_Data")
    protected EmployeeContributionPercentageDataType employeeContributionPercentageData;
    @XmlElement(name = "Employee_Contribution_Amount_Data")
    protected EmployeeContributionAmountDataType employeeContributionAmountData;
    @XmlElement(name = "Employer_Contribution_Percentage_Data")
    protected EmployerContributionPercentageDataType employerContributionPercentageData;
    @XmlElement(name = "Employer_Contribution_Amount_Data")
    protected EmployerContributionAmountDataType employerContributionAmountData;
    @XmlElement(name = "Beneficiary_Designation_Data")
    protected List<BeneficiaryDesignationDataType> beneficiaryDesignationData;

    /**
     * Gets the value of the benefitElectionData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerBenefitElectionDataType }
     *     
     */
    public WorkerBenefitElectionDataType getBenefitElectionData() {
        return benefitElectionData;
    }

    /**
     * Sets the value of the benefitElectionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerBenefitElectionDataType }
     *     
     */
    public void setBenefitElectionData(WorkerBenefitElectionDataType value) {
        this.benefitElectionData = value;
    }

    /**
     * Gets the value of the employeeContributionPercentageData property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeContributionPercentageDataType }
     *     
     */
    public EmployeeContributionPercentageDataType getEmployeeContributionPercentageData() {
        return employeeContributionPercentageData;
    }

    /**
     * Sets the value of the employeeContributionPercentageData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeContributionPercentageDataType }
     *     
     */
    public void setEmployeeContributionPercentageData(EmployeeContributionPercentageDataType value) {
        this.employeeContributionPercentageData = value;
    }

    /**
     * Gets the value of the employeeContributionAmountData property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeContributionAmountDataType }
     *     
     */
    public EmployeeContributionAmountDataType getEmployeeContributionAmountData() {
        return employeeContributionAmountData;
    }

    /**
     * Sets the value of the employeeContributionAmountData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeContributionAmountDataType }
     *     
     */
    public void setEmployeeContributionAmountData(EmployeeContributionAmountDataType value) {
        this.employeeContributionAmountData = value;
    }

    /**
     * Gets the value of the employerContributionPercentageData property.
     * 
     * @return
     *     possible object is
     *     {@link EmployerContributionPercentageDataType }
     *     
     */
    public EmployerContributionPercentageDataType getEmployerContributionPercentageData() {
        return employerContributionPercentageData;
    }

    /**
     * Sets the value of the employerContributionPercentageData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployerContributionPercentageDataType }
     *     
     */
    public void setEmployerContributionPercentageData(EmployerContributionPercentageDataType value) {
        this.employerContributionPercentageData = value;
    }

    /**
     * Gets the value of the employerContributionAmountData property.
     * 
     * @return
     *     possible object is
     *     {@link EmployerContributionAmountDataType }
     *     
     */
    public EmployerContributionAmountDataType getEmployerContributionAmountData() {
        return employerContributionAmountData;
    }

    /**
     * Sets the value of the employerContributionAmountData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployerContributionAmountDataType }
     *     
     */
    public void setEmployerContributionAmountData(EmployerContributionAmountDataType value) {
        this.employerContributionAmountData = value;
    }

    /**
     * Gets the value of the beneficiaryDesignationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beneficiaryDesignationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeneficiaryDesignationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BeneficiaryDesignationDataType }
     * 
     * 
     */
    public List<BeneficiaryDesignationDataType> getBeneficiaryDesignationData() {
        if (beneficiaryDesignationData == null) {
            beneficiaryDesignationData = new ArrayList<BeneficiaryDesignationDataType>();
        }
        return this.beneficiaryDesignationData;
    }

}
