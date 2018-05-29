
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the insurance election information for the employee.
 * 
 * <p>Java class for Worker_Insurance_Coverage_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Insurance_Coverage_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Insurance_Coverage_Level_Data" type="{urn:com.workday/bsvc}Insurance_Coverage_Level_DataType"/>
 *         &lt;element name="Benefit_Election_Data" type="{urn:com.workday/bsvc}Worker_Benefit_Election_DataType"/>
 *         &lt;element name="Dependent_Coverage_Data" type="{urn:com.workday/bsvc}Dependent_Coverage_DataType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Worker_Insurance_Coverage_DataType", propOrder = {
    "insuranceCoverageLevelData",
    "benefitElectionData",
    "dependentCoverageData",
    "beneficiaryDesignationData"
})
public class WorkerInsuranceCoverageDataType {

    @XmlElement(name = "Insurance_Coverage_Level_Data", required = true)
    protected InsuranceCoverageLevelDataType insuranceCoverageLevelData;
    @XmlElement(name = "Benefit_Election_Data", required = true)
    protected WorkerBenefitElectionDataType benefitElectionData;
    @XmlElement(name = "Dependent_Coverage_Data")
    protected List<DependentCoverageDataType> dependentCoverageData;
    @XmlElement(name = "Beneficiary_Designation_Data")
    protected List<BeneficiaryDesignationDataType> beneficiaryDesignationData;

    /**
     * Gets the value of the insuranceCoverageLevelData property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceCoverageLevelDataType }
     *     
     */
    public InsuranceCoverageLevelDataType getInsuranceCoverageLevelData() {
        return insuranceCoverageLevelData;
    }

    /**
     * Sets the value of the insuranceCoverageLevelData property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceCoverageLevelDataType }
     *     
     */
    public void setInsuranceCoverageLevelData(InsuranceCoverageLevelDataType value) {
        this.insuranceCoverageLevelData = value;
    }

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
     * Gets the value of the dependentCoverageData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dependentCoverageData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDependentCoverageData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DependentCoverageDataType }
     * 
     * 
     */
    public List<DependentCoverageDataType> getDependentCoverageData() {
        if (dependentCoverageData == null) {
            dependentCoverageData = new ArrayList<DependentCoverageDataType>();
        }
        return this.dependentCoverageData;
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
