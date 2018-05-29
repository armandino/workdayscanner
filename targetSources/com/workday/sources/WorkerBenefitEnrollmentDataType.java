
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the worker's benefits information.
 * 
 * Security Note: This element is secured to the following domains:  Self Service: Benefit Elections; Worker Data: Benefit Elections
 * 
 * <p>Java class for Worker_Benefit_Enrollment_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Benefit_Enrollment_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Health_Care_Data" type="{urn:com.workday/bsvc}Worker_Health_Care_DataType" minOccurs="0"/>
 *         &lt;element name="Health_Savings_Account_Data" type="{urn:com.workday/bsvc}Worker_Health_Savings_Account_DataType" minOccurs="0"/>
 *         &lt;element name="Spending_Account_Data" type="{urn:com.workday/bsvc}Worker_Spending_Account_DataType" minOccurs="0"/>
 *         &lt;element name="Insurance_Data" type="{urn:com.workday/bsvc}Worker_Insurance_DataType" minOccurs="0"/>
 *         &lt;element name="Retirement_Savings_Data" type="{urn:com.workday/bsvc}Retirement_Savings_DataType" minOccurs="0"/>
 *         &lt;element name="Additional_Benefits_Data" type="{urn:com.workday/bsvc}Worker_Additional_Benefits_DataType" minOccurs="0"/>
 *         &lt;element name="COBRA_Eligibility_Data" type="{urn:com.workday/bsvc}COBRA_Eligibility_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Benefit_Enrollment_DataType", propOrder = {
    "healthCareData",
    "healthSavingsAccountData",
    "spendingAccountData",
    "insuranceData",
    "retirementSavingsData",
    "additionalBenefitsData",
    "cobraEligibilityData"
})
public class WorkerBenefitEnrollmentDataType {

    @XmlElement(name = "Health_Care_Data")
    protected WorkerHealthCareDataType healthCareData;
    @XmlElement(name = "Health_Savings_Account_Data")
    protected WorkerHealthSavingsAccountDataType healthSavingsAccountData;
    @XmlElement(name = "Spending_Account_Data")
    protected WorkerSpendingAccountDataType spendingAccountData;
    @XmlElement(name = "Insurance_Data")
    protected WorkerInsuranceDataType insuranceData;
    @XmlElement(name = "Retirement_Savings_Data")
    protected RetirementSavingsDataType retirementSavingsData;
    @XmlElement(name = "Additional_Benefits_Data")
    protected WorkerAdditionalBenefitsDataType additionalBenefitsData;
    @XmlElement(name = "COBRA_Eligibility_Data")
    protected List<COBRAEligibilityDataType> cobraEligibilityData;

    /**
     * Gets the value of the healthCareData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerHealthCareDataType }
     *     
     */
    public WorkerHealthCareDataType getHealthCareData() {
        return healthCareData;
    }

    /**
     * Sets the value of the healthCareData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerHealthCareDataType }
     *     
     */
    public void setHealthCareData(WorkerHealthCareDataType value) {
        this.healthCareData = value;
    }

    /**
     * Gets the value of the healthSavingsAccountData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerHealthSavingsAccountDataType }
     *     
     */
    public WorkerHealthSavingsAccountDataType getHealthSavingsAccountData() {
        return healthSavingsAccountData;
    }

    /**
     * Sets the value of the healthSavingsAccountData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerHealthSavingsAccountDataType }
     *     
     */
    public void setHealthSavingsAccountData(WorkerHealthSavingsAccountDataType value) {
        this.healthSavingsAccountData = value;
    }

    /**
     * Gets the value of the spendingAccountData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerSpendingAccountDataType }
     *     
     */
    public WorkerSpendingAccountDataType getSpendingAccountData() {
        return spendingAccountData;
    }

    /**
     * Sets the value of the spendingAccountData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerSpendingAccountDataType }
     *     
     */
    public void setSpendingAccountData(WorkerSpendingAccountDataType value) {
        this.spendingAccountData = value;
    }

    /**
     * Gets the value of the insuranceData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerInsuranceDataType }
     *     
     */
    public WorkerInsuranceDataType getInsuranceData() {
        return insuranceData;
    }

    /**
     * Sets the value of the insuranceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerInsuranceDataType }
     *     
     */
    public void setInsuranceData(WorkerInsuranceDataType value) {
        this.insuranceData = value;
    }

    /**
     * Gets the value of the retirementSavingsData property.
     * 
     * @return
     *     possible object is
     *     {@link RetirementSavingsDataType }
     *     
     */
    public RetirementSavingsDataType getRetirementSavingsData() {
        return retirementSavingsData;
    }

    /**
     * Sets the value of the retirementSavingsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetirementSavingsDataType }
     *     
     */
    public void setRetirementSavingsData(RetirementSavingsDataType value) {
        this.retirementSavingsData = value;
    }

    /**
     * Gets the value of the additionalBenefitsData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerAdditionalBenefitsDataType }
     *     
     */
    public WorkerAdditionalBenefitsDataType getAdditionalBenefitsData() {
        return additionalBenefitsData;
    }

    /**
     * Sets the value of the additionalBenefitsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerAdditionalBenefitsDataType }
     *     
     */
    public void setAdditionalBenefitsData(WorkerAdditionalBenefitsDataType value) {
        this.additionalBenefitsData = value;
    }

    /**
     * Gets the value of the cobraEligibilityData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cobraEligibilityData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOBRAEligibilityData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COBRAEligibilityDataType }
     * 
     * 
     */
    public List<COBRAEligibilityDataType> getCOBRAEligibilityData() {
        if (cobraEligibilityData == null) {
            cobraEligibilityData = new ArrayList<COBRAEligibilityDataType>();
        }
        return this.cobraEligibilityData;
    }

}
