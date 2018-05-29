
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Request Criteria element lets you apply additional criteria to identify the specific instance(s) of a Worker.
 * 
 * <p>Java class for Worker_Request_CriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Request_CriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Transaction_Log_Criteria_Data" type="{urn:com.workday/bsvc}Transaction_Log_CriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Organization_Reference" type="{urn:com.workday/bsvc}OrganizationObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Country_Reference" type="{urn:com.workday/bsvc}CountryObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Include_Subordinate_Organizations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Position_Reference" type="{urn:com.workday/bsvc}Position_ElementObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Event_Reference" type="{urn:com.workday/bsvc}Transaction_LogObjectType" minOccurs="0"/>
 *         &lt;element name="Benefit_Plan_Reference" type="{urn:com.workday/bsvc}Benefit_PlanObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Field_And_Parameter_Criteria_Data" type="{urn:com.workday/bsvc}Field_And_Parameter_Criteria_DataType" minOccurs="0"/>
 *         &lt;element name="National_ID_Criteria_Data" type="{urn:com.workday/bsvc}Worker_by_National_ID_Request_CriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Exclude_Inactive_Workers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Exclude_Employees" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Exclude_Contingent_Workers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Eligibility_Criteria_Data" type="{urn:com.workday/bsvc}Eligibility_Criteria_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Universal_ID_Reference" type="{urn:com.workday/bsvc}Universal_IdentifierObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Request_CriteriaType", propOrder = {
    "transactionLogCriteriaData",
    "organizationReference",
    "countryReference",
    "includeSubordinateOrganizations",
    "positionReference",
    "eventReference",
    "benefitPlanReference",
    "fieldAndParameterCriteriaData",
    "nationalIDCriteriaData",
    "excludeInactiveWorkers",
    "excludeEmployees",
    "excludeContingentWorkers",
    "eligibilityCriteriaData",
    "universalIDReference"
})
public class WorkerRequestCriteriaType {

    @XmlElement(name = "Transaction_Log_Criteria_Data")
    protected List<TransactionLogCriteriaType> transactionLogCriteriaData;
    @XmlElement(name = "Organization_Reference")
    protected List<OrganizationObjectType> organizationReference;
    @XmlElement(name = "Country_Reference")
    protected List<CountryObjectType> countryReference;
    @XmlElement(name = "Include_Subordinate_Organizations")
    protected Boolean includeSubordinateOrganizations;
    @XmlElement(name = "Position_Reference")
    protected List<PositionElementObjectType> positionReference;
    @XmlElement(name = "Event_Reference")
    protected TransactionLogObjectType eventReference;
    @XmlElement(name = "Benefit_Plan_Reference")
    protected List<BenefitPlanObjectType> benefitPlanReference;
    @XmlElement(name = "Field_And_Parameter_Criteria_Data")
    protected FieldAndParameterCriteriaDataType fieldAndParameterCriteriaData;
    @XmlElement(name = "National_ID_Criteria_Data")
    protected List<WorkerByNationalIDRequestCriteriaType> nationalIDCriteriaData;
    @XmlElement(name = "Exclude_Inactive_Workers")
    protected Boolean excludeInactiveWorkers;
    @XmlElement(name = "Exclude_Employees")
    protected Boolean excludeEmployees;
    @XmlElement(name = "Exclude_Contingent_Workers")
    protected Boolean excludeContingentWorkers;
    @XmlElement(name = "Eligibility_Criteria_Data")
    protected List<EligibilityCriteriaDataType> eligibilityCriteriaData;
    @XmlElement(name = "Universal_ID_Reference")
    protected List<UniversalIdentifierObjectType> universalIDReference;

    /**
     * Gets the value of the transactionLogCriteriaData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionLogCriteriaData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionLogCriteriaData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionLogCriteriaType }
     * 
     * 
     */
    public List<TransactionLogCriteriaType> getTransactionLogCriteriaData() {
        if (transactionLogCriteriaData == null) {
            transactionLogCriteriaData = new ArrayList<TransactionLogCriteriaType>();
        }
        return this.transactionLogCriteriaData;
    }

    /**
     * Gets the value of the organizationReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationObjectType }
     * 
     * 
     */
    public List<OrganizationObjectType> getOrganizationReference() {
        if (organizationReference == null) {
            organizationReference = new ArrayList<OrganizationObjectType>();
        }
        return this.organizationReference;
    }

    /**
     * Gets the value of the countryReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryObjectType }
     * 
     * 
     */
    public List<CountryObjectType> getCountryReference() {
        if (countryReference == null) {
            countryReference = new ArrayList<CountryObjectType>();
        }
        return this.countryReference;
    }

    /**
     * Gets the value of the includeSubordinateOrganizations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeSubordinateOrganizations() {
        return includeSubordinateOrganizations;
    }

    /**
     * Sets the value of the includeSubordinateOrganizations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeSubordinateOrganizations(Boolean value) {
        this.includeSubordinateOrganizations = value;
    }

    /**
     * Gets the value of the positionReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the positionReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositionReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionElementObjectType }
     * 
     * 
     */
    public List<PositionElementObjectType> getPositionReference() {
        if (positionReference == null) {
            positionReference = new ArrayList<PositionElementObjectType>();
        }
        return this.positionReference;
    }

    /**
     * Gets the value of the eventReference property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionLogObjectType }
     *     
     */
    public TransactionLogObjectType getEventReference() {
        return eventReference;
    }

    /**
     * Sets the value of the eventReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionLogObjectType }
     *     
     */
    public void setEventReference(TransactionLogObjectType value) {
        this.eventReference = value;
    }

    /**
     * Gets the value of the benefitPlanReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the benefitPlanReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBenefitPlanReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BenefitPlanObjectType }
     * 
     * 
     */
    public List<BenefitPlanObjectType> getBenefitPlanReference() {
        if (benefitPlanReference == null) {
            benefitPlanReference = new ArrayList<BenefitPlanObjectType>();
        }
        return this.benefitPlanReference;
    }

    /**
     * Gets the value of the fieldAndParameterCriteriaData property.
     * 
     * @return
     *     possible object is
     *     {@link FieldAndParameterCriteriaDataType }
     *     
     */
    public FieldAndParameterCriteriaDataType getFieldAndParameterCriteriaData() {
        return fieldAndParameterCriteriaData;
    }

    /**
     * Sets the value of the fieldAndParameterCriteriaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldAndParameterCriteriaDataType }
     *     
     */
    public void setFieldAndParameterCriteriaData(FieldAndParameterCriteriaDataType value) {
        this.fieldAndParameterCriteriaData = value;
    }

    /**
     * Gets the value of the nationalIDCriteriaData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nationalIDCriteriaData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNationalIDCriteriaData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkerByNationalIDRequestCriteriaType }
     * 
     * 
     */
    public List<WorkerByNationalIDRequestCriteriaType> getNationalIDCriteriaData() {
        if (nationalIDCriteriaData == null) {
            nationalIDCriteriaData = new ArrayList<WorkerByNationalIDRequestCriteriaType>();
        }
        return this.nationalIDCriteriaData;
    }

    /**
     * Gets the value of the excludeInactiveWorkers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeInactiveWorkers() {
        return excludeInactiveWorkers;
    }

    /**
     * Sets the value of the excludeInactiveWorkers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeInactiveWorkers(Boolean value) {
        this.excludeInactiveWorkers = value;
    }

    /**
     * Gets the value of the excludeEmployees property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeEmployees() {
        return excludeEmployees;
    }

    /**
     * Sets the value of the excludeEmployees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeEmployees(Boolean value) {
        this.excludeEmployees = value;
    }

    /**
     * Gets the value of the excludeContingentWorkers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeContingentWorkers() {
        return excludeContingentWorkers;
    }

    /**
     * Sets the value of the excludeContingentWorkers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeContingentWorkers(Boolean value) {
        this.excludeContingentWorkers = value;
    }

    /**
     * Gets the value of the eligibilityCriteriaData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eligibilityCriteriaData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEligibilityCriteriaData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EligibilityCriteriaDataType }
     * 
     * 
     */
    public List<EligibilityCriteriaDataType> getEligibilityCriteriaData() {
        if (eligibilityCriteriaData == null) {
            eligibilityCriteriaData = new ArrayList<EligibilityCriteriaDataType>();
        }
        return this.eligibilityCriteriaData;
    }

    /**
     * Gets the value of the universalIDReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the universalIDReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUniversalIDReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UniversalIdentifierObjectType }
     * 
     * 
     */
    public List<UniversalIdentifierObjectType> getUniversalIDReference() {
        if (universalIDReference == null) {
            universalIDReference = new ArrayList<UniversalIdentifierObjectType>();
        }
        return this.universalIDReference;
    }

}
