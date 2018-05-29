
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the summary information about the benefit provider of the benefit plan.
 * 
 * <p>Java class for Benefit_Plan_Summary_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Benefit_Plan_Summary_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Benefit_Plan_Reference" type="{urn:com.workday/bsvc}Benefit_PlanObjectType" minOccurs="0"/>
 *         &lt;element name="Benefit_Plan_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group_Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Benefit_Coverage_Type_Reference" type="{urn:com.workday/bsvc}Benefit_Coverage_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Currency_Reference" type="{urn:com.workday/bsvc}CurrencyObjectType" minOccurs="0"/>
 *         &lt;element name="Frequency_Reference" type="{urn:com.workday/bsvc}FrequencyObjectType" minOccurs="0"/>
 *         &lt;element name="Health_Care_Classification_Reference" type="{urn:com.workday/bsvc}Health_Care_ClassificationObjectType" minOccurs="0"/>
 *         &lt;element name="Insurance_Coverage_Target_Reference" type="{urn:com.workday/bsvc}Insurance_Coverage_TargetObjectType" minOccurs="0"/>
 *         &lt;element name="Benefit_Provider_Summary_Data" type="{urn:com.workday/bsvc}Benefit_Provider_Summary_DataType" minOccurs="0"/>
 *         &lt;element name="External_Integration_ID_Data" type="{urn:com.workday/bsvc}External_Integration_ID_DataType" minOccurs="0"/>
 *         &lt;element name="Pay_Component_Reference" type="{urn:com.workday/bsvc}Pay_ComponentObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Benefit_Plan_Summary_DataType", propOrder = {
    "benefitPlanReference",
    "benefitPlanName",
    "groupIdentifier",
    "benefitCoverageTypeReference",
    "currencyReference",
    "frequencyReference",
    "healthCareClassificationReference",
    "insuranceCoverageTargetReference",
    "benefitProviderSummaryData",
    "externalIntegrationIDData",
    "payComponentReference"
})
public class BenefitPlanSummaryDataType {

    @XmlElement(name = "Benefit_Plan_Reference")
    protected BenefitPlanObjectType benefitPlanReference;
    @XmlElement(name = "Benefit_Plan_Name")
    protected String benefitPlanName;
    @XmlElement(name = "Group_Identifier")
    protected String groupIdentifier;
    @XmlElement(name = "Benefit_Coverage_Type_Reference")
    protected BenefitCoverageTypeObjectType benefitCoverageTypeReference;
    @XmlElement(name = "Currency_Reference")
    protected CurrencyObjectType currencyReference;
    @XmlElement(name = "Frequency_Reference")
    protected FrequencyObjectType frequencyReference;
    @XmlElement(name = "Health_Care_Classification_Reference")
    protected HealthCareClassificationObjectType healthCareClassificationReference;
    @XmlElement(name = "Insurance_Coverage_Target_Reference")
    protected InsuranceCoverageTargetObjectType insuranceCoverageTargetReference;
    @XmlElement(name = "Benefit_Provider_Summary_Data")
    protected BenefitProviderSummaryDataType benefitProviderSummaryData;
    @XmlElement(name = "External_Integration_ID_Data")
    protected ExternalIntegrationIDDataType externalIntegrationIDData;
    @XmlElement(name = "Pay_Component_Reference")
    protected List<PayComponentObjectType> payComponentReference;

    /**
     * Gets the value of the benefitPlanReference property.
     * 
     * @return
     *     possible object is
     *     {@link BenefitPlanObjectType }
     *     
     */
    public BenefitPlanObjectType getBenefitPlanReference() {
        return benefitPlanReference;
    }

    /**
     * Sets the value of the benefitPlanReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenefitPlanObjectType }
     *     
     */
    public void setBenefitPlanReference(BenefitPlanObjectType value) {
        this.benefitPlanReference = value;
    }

    /**
     * Gets the value of the benefitPlanName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitPlanName() {
        return benefitPlanName;
    }

    /**
     * Sets the value of the benefitPlanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitPlanName(String value) {
        this.benefitPlanName = value;
    }

    /**
     * Gets the value of the groupIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupIdentifier() {
        return groupIdentifier;
    }

    /**
     * Sets the value of the groupIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupIdentifier(String value) {
        this.groupIdentifier = value;
    }

    /**
     * Gets the value of the benefitCoverageTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link BenefitCoverageTypeObjectType }
     *     
     */
    public BenefitCoverageTypeObjectType getBenefitCoverageTypeReference() {
        return benefitCoverageTypeReference;
    }

    /**
     * Sets the value of the benefitCoverageTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenefitCoverageTypeObjectType }
     *     
     */
    public void setBenefitCoverageTypeReference(BenefitCoverageTypeObjectType value) {
        this.benefitCoverageTypeReference = value;
    }

    /**
     * Gets the value of the currencyReference property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyObjectType }
     *     
     */
    public CurrencyObjectType getCurrencyReference() {
        return currencyReference;
    }

    /**
     * Sets the value of the currencyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyObjectType }
     *     
     */
    public void setCurrencyReference(CurrencyObjectType value) {
        this.currencyReference = value;
    }

    /**
     * Gets the value of the frequencyReference property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyObjectType }
     *     
     */
    public FrequencyObjectType getFrequencyReference() {
        return frequencyReference;
    }

    /**
     * Sets the value of the frequencyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyObjectType }
     *     
     */
    public void setFrequencyReference(FrequencyObjectType value) {
        this.frequencyReference = value;
    }

    /**
     * Gets the value of the healthCareClassificationReference property.
     * 
     * @return
     *     possible object is
     *     {@link HealthCareClassificationObjectType }
     *     
     */
    public HealthCareClassificationObjectType getHealthCareClassificationReference() {
        return healthCareClassificationReference;
    }

    /**
     * Sets the value of the healthCareClassificationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthCareClassificationObjectType }
     *     
     */
    public void setHealthCareClassificationReference(HealthCareClassificationObjectType value) {
        this.healthCareClassificationReference = value;
    }

    /**
     * Gets the value of the insuranceCoverageTargetReference property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceCoverageTargetObjectType }
     *     
     */
    public InsuranceCoverageTargetObjectType getInsuranceCoverageTargetReference() {
        return insuranceCoverageTargetReference;
    }

    /**
     * Sets the value of the insuranceCoverageTargetReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceCoverageTargetObjectType }
     *     
     */
    public void setInsuranceCoverageTargetReference(InsuranceCoverageTargetObjectType value) {
        this.insuranceCoverageTargetReference = value;
    }

    /**
     * Gets the value of the benefitProviderSummaryData property.
     * 
     * @return
     *     possible object is
     *     {@link BenefitProviderSummaryDataType }
     *     
     */
    public BenefitProviderSummaryDataType getBenefitProviderSummaryData() {
        return benefitProviderSummaryData;
    }

    /**
     * Sets the value of the benefitProviderSummaryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenefitProviderSummaryDataType }
     *     
     */
    public void setBenefitProviderSummaryData(BenefitProviderSummaryDataType value) {
        this.benefitProviderSummaryData = value;
    }

    /**
     * Gets the value of the externalIntegrationIDData property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalIntegrationIDDataType }
     *     
     */
    public ExternalIntegrationIDDataType getExternalIntegrationIDData() {
        return externalIntegrationIDData;
    }

    /**
     * Sets the value of the externalIntegrationIDData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalIntegrationIDDataType }
     *     
     */
    public void setExternalIntegrationIDData(ExternalIntegrationIDDataType value) {
        this.externalIntegrationIDData = value;
    }

    /**
     * Gets the value of the payComponentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payComponentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayComponentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PayComponentObjectType }
     * 
     * 
     */
    public List<PayComponentObjectType> getPayComponentReference() {
        if (payComponentReference == null) {
            payComponentReference = new ArrayList<PayComponentObjectType>();
        }
        return this.payComponentReference;
    }

}
