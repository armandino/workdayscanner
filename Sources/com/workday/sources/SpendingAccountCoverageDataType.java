
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the spending account coverage information (elections) for an employee.
 * 
 * <p>Java class for Spending_Account_Coverage_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Spending_Account_Coverage_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Benefit_Election_Data" type="{urn:com.workday/bsvc}Worker_Benefit_Election_DataType" minOccurs="0"/>
 *         &lt;element name="Employee_Contribution_Data" type="{urn:com.workday/bsvc}Employee_Contribution_DataType" minOccurs="0"/>
 *         &lt;element name="Employer_Contribution_Data" type="{urn:com.workday/bsvc}Employer_Contribution_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Spending_Account_Coverage_DataType", propOrder = {
    "benefitElectionData",
    "employeeContributionData",
    "employerContributionData"
})
public class SpendingAccountCoverageDataType {

    @XmlElement(name = "Benefit_Election_Data")
    protected WorkerBenefitElectionDataType benefitElectionData;
    @XmlElement(name = "Employee_Contribution_Data")
    protected EmployeeContributionDataType employeeContributionData;
    @XmlElement(name = "Employer_Contribution_Data")
    protected EmployerContributionDataType employerContributionData;

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
     * Gets the value of the employeeContributionData property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeContributionDataType }
     *     
     */
    public EmployeeContributionDataType getEmployeeContributionData() {
        return employeeContributionData;
    }

    /**
     * Sets the value of the employeeContributionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeContributionDataType }
     *     
     */
    public void setEmployeeContributionData(EmployeeContributionDataType value) {
        this.employeeContributionData = value;
    }

    /**
     * Gets the value of the employerContributionData property.
     * 
     * @return
     *     possible object is
     *     {@link EmployerContributionDataType }
     *     
     */
    public EmployerContributionDataType getEmployerContributionData() {
        return employerContributionData;
    }

    /**
     * Sets the value of the employerContributionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployerContributionDataType }
     *     
     */
    public void setEmployerContributionData(EmployerContributionDataType value) {
        this.employerContributionData = value;
    }

}
