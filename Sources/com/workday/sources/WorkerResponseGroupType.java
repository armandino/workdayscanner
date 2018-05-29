
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Use the response group to limit the response to the data you are interested in. If the request does not set any values for the response group, then the response by default returns the following elements: Reference, Personal Data, Employment Data, Compensation Data, Organization Data, and Role Data.
 * 
 * <p>Java class for Worker_Response_GroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Response_GroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Include_Reference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Personal_Information" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Additional_Jobs" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Employment_Information" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Compensation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Organizations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Exclude_Organization_Support_Role_Data" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Exclude_Location_Hierarchies" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Exclude_Cost_Centers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Exclude_Cost_Center_Hierarchies" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Exclude_Companies" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Exclude_Company_Hierarchies" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Exclude_Matrix_Organizations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Exclude_Pay_Groups" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Exclude_Regions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Exclude_Region_Hierarchies" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Exclude_Supervisory_Organizations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Exclude_Teams" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Exclude_Custom_Organizations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Roles" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Management_Chain_Data" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Multiple_Managers_in_Management_Chain_Data" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Benefit_Enrollments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Benefit_Eligibility" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Related_Persons" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Qualifications" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Employee_Review" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Goals" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Development_Items" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Skills" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Photo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Worker_Documents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Transaction_Log_Data" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Subevents_for_Corrected_Transaction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Subevents_for_Rescinded_Transaction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Succession_Profile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Talent_Assessment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Employee_Contract_Data" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Collective_Agreement_Data" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Probation_Period_Data" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Extended_Employee_Contract_Details" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Feedback_Received" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_User_Account" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Career" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Account_Provisioning" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Background_Check_Data" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Contingent_Worker_Tax_Authority_Form_Information" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Exclude_Funds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Exclude_Fund_Hierarchies" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Exclude_Grants" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Exclude_Grant_Hierarchies" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Exclude_Business_Units" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Exclude_Business_Unit_Hierarchies" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Exclude_Programs" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Exclude_Program_Hierarchies" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Exclude_Gifts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Exclude_Gift_Hierarchies" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Response_GroupType", propOrder = {
    "includeReference",
    "includePersonalInformation",
    "includeAdditionalJobs",
    "includeEmploymentInformation",
    "includeCompensation",
    "includeOrganizations",
    "excludeOrganizationSupportRoleData",
    "excludeLocationHierarchies",
    "excludeCostCenters",
    "excludeCostCenterHierarchies",
    "excludeCompanies",
    "excludeCompanyHierarchies",
    "excludeMatrixOrganizations",
    "excludePayGroups",
    "excludeRegions",
    "excludeRegionHierarchies",
    "excludeSupervisoryOrganizations",
    "excludeTeams",
    "excludeCustomOrganizations",
    "includeRoles",
    "includeManagementChainData",
    "includeMultipleManagersInManagementChainData",
    "includeBenefitEnrollments",
    "includeBenefitEligibility",
    "includeRelatedPersons",
    "includeQualifications",
    "includeEmployeeReview",
    "includeGoals",
    "includeDevelopmentItems",
    "includeSkills",
    "includePhoto",
    "includeWorkerDocuments",
    "includeTransactionLogData",
    "includeSubeventsForCorrectedTransaction",
    "includeSubeventsForRescindedTransaction",
    "includeSuccessionProfile",
    "includeTalentAssessment",
    "includeEmployeeContractData",
    "includeCollectiveAgreementData",
    "includeProbationPeriodData",
    "includeExtendedEmployeeContractDetails",
    "includeFeedbackReceived",
    "includeUserAccount",
    "includeCareer",
    "includeAccountProvisioning",
    "includeBackgroundCheckData",
    "includeContingentWorkerTaxAuthorityFormInformation",
    "excludeFunds",
    "excludeFundHierarchies",
    "excludeGrants",
    "excludeGrantHierarchies",
    "excludeBusinessUnits",
    "excludeBusinessUnitHierarchies",
    "excludePrograms",
    "excludeProgramHierarchies",
    "excludeGifts",
    "excludeGiftHierarchies"
})
public class WorkerResponseGroupType {

    @XmlElement(name = "Include_Reference")
    protected Boolean includeReference;
    @XmlElement(name = "Include_Personal_Information")
    protected Boolean includePersonalInformation;
    @XmlElement(name = "Include_Additional_Jobs")
    protected Boolean includeAdditionalJobs;
    @XmlElement(name = "Include_Employment_Information")
    protected Boolean includeEmploymentInformation;
    @XmlElement(name = "Include_Compensation")
    protected Boolean includeCompensation;
    @XmlElement(name = "Include_Organizations")
    protected Boolean includeOrganizations;
    @XmlElement(name = "Exclude_Organization_Support_Role_Data")
    protected Boolean excludeOrganizationSupportRoleData;
    @XmlElement(name = "Exclude_Location_Hierarchies")
    protected Boolean excludeLocationHierarchies;
    @XmlElement(name = "Exclude_Cost_Centers")
    protected Boolean excludeCostCenters;
    @XmlElement(name = "Exclude_Cost_Center_Hierarchies")
    protected Boolean excludeCostCenterHierarchies;
    @XmlElement(name = "Exclude_Companies")
    protected Boolean excludeCompanies;
    @XmlElement(name = "Exclude_Company_Hierarchies")
    protected Boolean excludeCompanyHierarchies;
    @XmlElement(name = "Exclude_Matrix_Organizations")
    protected Boolean excludeMatrixOrganizations;
    @XmlElement(name = "Exclude_Pay_Groups")
    protected Boolean excludePayGroups;
    @XmlElement(name = "Exclude_Regions")
    protected Boolean excludeRegions;
    @XmlElement(name = "Exclude_Region_Hierarchies")
    protected Boolean excludeRegionHierarchies;
    @XmlElement(name = "Exclude_Supervisory_Organizations")
    protected Boolean excludeSupervisoryOrganizations;
    @XmlElement(name = "Exclude_Teams")
    protected Boolean excludeTeams;
    @XmlElement(name = "Exclude_Custom_Organizations")
    protected Boolean excludeCustomOrganizations;
    @XmlElement(name = "Include_Roles")
    protected Boolean includeRoles;
    @XmlElement(name = "Include_Management_Chain_Data")
    protected Boolean includeManagementChainData;
    @XmlElement(name = "Include_Multiple_Managers_in_Management_Chain_Data")
    protected Boolean includeMultipleManagersInManagementChainData;
    @XmlElement(name = "Include_Benefit_Enrollments")
    protected Boolean includeBenefitEnrollments;
    @XmlElement(name = "Include_Benefit_Eligibility")
    protected Boolean includeBenefitEligibility;
    @XmlElement(name = "Include_Related_Persons")
    protected Boolean includeRelatedPersons;
    @XmlElement(name = "Include_Qualifications")
    protected Boolean includeQualifications;
    @XmlElement(name = "Include_Employee_Review")
    protected Boolean includeEmployeeReview;
    @XmlElement(name = "Include_Goals")
    protected Boolean includeGoals;
    @XmlElement(name = "Include_Development_Items")
    protected Boolean includeDevelopmentItems;
    @XmlElement(name = "Include_Skills")
    protected Boolean includeSkills;
    @XmlElement(name = "Include_Photo")
    protected Boolean includePhoto;
    @XmlElement(name = "Include_Worker_Documents")
    protected Boolean includeWorkerDocuments;
    @XmlElement(name = "Include_Transaction_Log_Data")
    protected Boolean includeTransactionLogData;
    @XmlElement(name = "Include_Subevents_for_Corrected_Transaction")
    protected Boolean includeSubeventsForCorrectedTransaction;
    @XmlElement(name = "Include_Subevents_for_Rescinded_Transaction")
    protected Boolean includeSubeventsForRescindedTransaction;
    @XmlElement(name = "Include_Succession_Profile")
    protected Boolean includeSuccessionProfile;
    @XmlElement(name = "Include_Talent_Assessment")
    protected Boolean includeTalentAssessment;
    @XmlElement(name = "Include_Employee_Contract_Data")
    protected Boolean includeEmployeeContractData;
    @XmlElement(name = "Include_Collective_Agreement_Data")
    protected Boolean includeCollectiveAgreementData;
    @XmlElement(name = "Include_Probation_Period_Data")
    protected Boolean includeProbationPeriodData;
    @XmlElement(name = "Include_Extended_Employee_Contract_Details")
    protected Boolean includeExtendedEmployeeContractDetails;
    @XmlElement(name = "Include_Feedback_Received")
    protected Boolean includeFeedbackReceived;
    @XmlElement(name = "Include_User_Account")
    protected Boolean includeUserAccount;
    @XmlElement(name = "Include_Career")
    protected Boolean includeCareer;
    @XmlElement(name = "Include_Account_Provisioning")
    protected Boolean includeAccountProvisioning;
    @XmlElement(name = "Include_Background_Check_Data")
    protected Boolean includeBackgroundCheckData;
    @XmlElement(name = "Include_Contingent_Worker_Tax_Authority_Form_Information")
    protected Boolean includeContingentWorkerTaxAuthorityFormInformation;
    @XmlElement(name = "Exclude_Funds")
    protected Boolean excludeFunds;
    @XmlElement(name = "Exclude_Fund_Hierarchies")
    protected Boolean excludeFundHierarchies;
    @XmlElement(name = "Exclude_Grants")
    protected Boolean excludeGrants;
    @XmlElement(name = "Exclude_Grant_Hierarchies")
    protected Boolean excludeGrantHierarchies;
    @XmlElement(name = "Exclude_Business_Units")
    protected Boolean excludeBusinessUnits;
    @XmlElement(name = "Exclude_Business_Unit_Hierarchies")
    protected Boolean excludeBusinessUnitHierarchies;
    @XmlElement(name = "Exclude_Programs")
    protected Boolean excludePrograms;
    @XmlElement(name = "Exclude_Program_Hierarchies")
    protected Boolean excludeProgramHierarchies;
    @XmlElement(name = "Exclude_Gifts")
    protected Boolean excludeGifts;
    @XmlElement(name = "Exclude_Gift_Hierarchies")
    protected Boolean excludeGiftHierarchies;

    /**
     * Gets the value of the includeReference property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeReference() {
        return includeReference;
    }

    /**
     * Sets the value of the includeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeReference(Boolean value) {
        this.includeReference = value;
    }

    /**
     * Gets the value of the includePersonalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludePersonalInformation() {
        return includePersonalInformation;
    }

    /**
     * Sets the value of the includePersonalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludePersonalInformation(Boolean value) {
        this.includePersonalInformation = value;
    }

    /**
     * Gets the value of the includeAdditionalJobs property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeAdditionalJobs() {
        return includeAdditionalJobs;
    }

    /**
     * Sets the value of the includeAdditionalJobs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeAdditionalJobs(Boolean value) {
        this.includeAdditionalJobs = value;
    }

    /**
     * Gets the value of the includeEmploymentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeEmploymentInformation() {
        return includeEmploymentInformation;
    }

    /**
     * Sets the value of the includeEmploymentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeEmploymentInformation(Boolean value) {
        this.includeEmploymentInformation = value;
    }

    /**
     * Gets the value of the includeCompensation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeCompensation() {
        return includeCompensation;
    }

    /**
     * Sets the value of the includeCompensation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeCompensation(Boolean value) {
        this.includeCompensation = value;
    }

    /**
     * Gets the value of the includeOrganizations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeOrganizations() {
        return includeOrganizations;
    }

    /**
     * Sets the value of the includeOrganizations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeOrganizations(Boolean value) {
        this.includeOrganizations = value;
    }

    /**
     * Gets the value of the excludeOrganizationSupportRoleData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeOrganizationSupportRoleData() {
        return excludeOrganizationSupportRoleData;
    }

    /**
     * Sets the value of the excludeOrganizationSupportRoleData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeOrganizationSupportRoleData(Boolean value) {
        this.excludeOrganizationSupportRoleData = value;
    }

    /**
     * Gets the value of the excludeLocationHierarchies property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeLocationHierarchies() {
        return excludeLocationHierarchies;
    }

    /**
     * Sets the value of the excludeLocationHierarchies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeLocationHierarchies(Boolean value) {
        this.excludeLocationHierarchies = value;
    }

    /**
     * Gets the value of the excludeCostCenters property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeCostCenters() {
        return excludeCostCenters;
    }

    /**
     * Sets the value of the excludeCostCenters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeCostCenters(Boolean value) {
        this.excludeCostCenters = value;
    }

    /**
     * Gets the value of the excludeCostCenterHierarchies property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeCostCenterHierarchies() {
        return excludeCostCenterHierarchies;
    }

    /**
     * Sets the value of the excludeCostCenterHierarchies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeCostCenterHierarchies(Boolean value) {
        this.excludeCostCenterHierarchies = value;
    }

    /**
     * Gets the value of the excludeCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeCompanies() {
        return excludeCompanies;
    }

    /**
     * Sets the value of the excludeCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeCompanies(Boolean value) {
        this.excludeCompanies = value;
    }

    /**
     * Gets the value of the excludeCompanyHierarchies property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeCompanyHierarchies() {
        return excludeCompanyHierarchies;
    }

    /**
     * Sets the value of the excludeCompanyHierarchies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeCompanyHierarchies(Boolean value) {
        this.excludeCompanyHierarchies = value;
    }

    /**
     * Gets the value of the excludeMatrixOrganizations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeMatrixOrganizations() {
        return excludeMatrixOrganizations;
    }

    /**
     * Sets the value of the excludeMatrixOrganizations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeMatrixOrganizations(Boolean value) {
        this.excludeMatrixOrganizations = value;
    }

    /**
     * Gets the value of the excludePayGroups property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludePayGroups() {
        return excludePayGroups;
    }

    /**
     * Sets the value of the excludePayGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludePayGroups(Boolean value) {
        this.excludePayGroups = value;
    }

    /**
     * Gets the value of the excludeRegions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeRegions() {
        return excludeRegions;
    }

    /**
     * Sets the value of the excludeRegions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeRegions(Boolean value) {
        this.excludeRegions = value;
    }

    /**
     * Gets the value of the excludeRegionHierarchies property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeRegionHierarchies() {
        return excludeRegionHierarchies;
    }

    /**
     * Sets the value of the excludeRegionHierarchies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeRegionHierarchies(Boolean value) {
        this.excludeRegionHierarchies = value;
    }

    /**
     * Gets the value of the excludeSupervisoryOrganizations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeSupervisoryOrganizations() {
        return excludeSupervisoryOrganizations;
    }

    /**
     * Sets the value of the excludeSupervisoryOrganizations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeSupervisoryOrganizations(Boolean value) {
        this.excludeSupervisoryOrganizations = value;
    }

    /**
     * Gets the value of the excludeTeams property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeTeams() {
        return excludeTeams;
    }

    /**
     * Sets the value of the excludeTeams property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeTeams(Boolean value) {
        this.excludeTeams = value;
    }

    /**
     * Gets the value of the excludeCustomOrganizations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeCustomOrganizations() {
        return excludeCustomOrganizations;
    }

    /**
     * Sets the value of the excludeCustomOrganizations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeCustomOrganizations(Boolean value) {
        this.excludeCustomOrganizations = value;
    }

    /**
     * Gets the value of the includeRoles property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeRoles() {
        return includeRoles;
    }

    /**
     * Sets the value of the includeRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeRoles(Boolean value) {
        this.includeRoles = value;
    }

    /**
     * Gets the value of the includeManagementChainData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeManagementChainData() {
        return includeManagementChainData;
    }

    /**
     * Sets the value of the includeManagementChainData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeManagementChainData(Boolean value) {
        this.includeManagementChainData = value;
    }

    /**
     * Gets the value of the includeMultipleManagersInManagementChainData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeMultipleManagersInManagementChainData() {
        return includeMultipleManagersInManagementChainData;
    }

    /**
     * Sets the value of the includeMultipleManagersInManagementChainData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeMultipleManagersInManagementChainData(Boolean value) {
        this.includeMultipleManagersInManagementChainData = value;
    }

    /**
     * Gets the value of the includeBenefitEnrollments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeBenefitEnrollments() {
        return includeBenefitEnrollments;
    }

    /**
     * Sets the value of the includeBenefitEnrollments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeBenefitEnrollments(Boolean value) {
        this.includeBenefitEnrollments = value;
    }

    /**
     * Gets the value of the includeBenefitEligibility property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeBenefitEligibility() {
        return includeBenefitEligibility;
    }

    /**
     * Sets the value of the includeBenefitEligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeBenefitEligibility(Boolean value) {
        this.includeBenefitEligibility = value;
    }

    /**
     * Gets the value of the includeRelatedPersons property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeRelatedPersons() {
        return includeRelatedPersons;
    }

    /**
     * Sets the value of the includeRelatedPersons property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeRelatedPersons(Boolean value) {
        this.includeRelatedPersons = value;
    }

    /**
     * Gets the value of the includeQualifications property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeQualifications() {
        return includeQualifications;
    }

    /**
     * Sets the value of the includeQualifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeQualifications(Boolean value) {
        this.includeQualifications = value;
    }

    /**
     * Gets the value of the includeEmployeeReview property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeEmployeeReview() {
        return includeEmployeeReview;
    }

    /**
     * Sets the value of the includeEmployeeReview property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeEmployeeReview(Boolean value) {
        this.includeEmployeeReview = value;
    }

    /**
     * Gets the value of the includeGoals property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeGoals() {
        return includeGoals;
    }

    /**
     * Sets the value of the includeGoals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeGoals(Boolean value) {
        this.includeGoals = value;
    }

    /**
     * Gets the value of the includeDevelopmentItems property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeDevelopmentItems() {
        return includeDevelopmentItems;
    }

    /**
     * Sets the value of the includeDevelopmentItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeDevelopmentItems(Boolean value) {
        this.includeDevelopmentItems = value;
    }

    /**
     * Gets the value of the includeSkills property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeSkills() {
        return includeSkills;
    }

    /**
     * Sets the value of the includeSkills property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeSkills(Boolean value) {
        this.includeSkills = value;
    }

    /**
     * Gets the value of the includePhoto property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludePhoto() {
        return includePhoto;
    }

    /**
     * Sets the value of the includePhoto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludePhoto(Boolean value) {
        this.includePhoto = value;
    }

    /**
     * Gets the value of the includeWorkerDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeWorkerDocuments() {
        return includeWorkerDocuments;
    }

    /**
     * Sets the value of the includeWorkerDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeWorkerDocuments(Boolean value) {
        this.includeWorkerDocuments = value;
    }

    /**
     * Gets the value of the includeTransactionLogData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeTransactionLogData() {
        return includeTransactionLogData;
    }

    /**
     * Sets the value of the includeTransactionLogData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeTransactionLogData(Boolean value) {
        this.includeTransactionLogData = value;
    }

    /**
     * Gets the value of the includeSubeventsForCorrectedTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeSubeventsForCorrectedTransaction() {
        return includeSubeventsForCorrectedTransaction;
    }

    /**
     * Sets the value of the includeSubeventsForCorrectedTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeSubeventsForCorrectedTransaction(Boolean value) {
        this.includeSubeventsForCorrectedTransaction = value;
    }

    /**
     * Gets the value of the includeSubeventsForRescindedTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeSubeventsForRescindedTransaction() {
        return includeSubeventsForRescindedTransaction;
    }

    /**
     * Sets the value of the includeSubeventsForRescindedTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeSubeventsForRescindedTransaction(Boolean value) {
        this.includeSubeventsForRescindedTransaction = value;
    }

    /**
     * Gets the value of the includeSuccessionProfile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeSuccessionProfile() {
        return includeSuccessionProfile;
    }

    /**
     * Sets the value of the includeSuccessionProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeSuccessionProfile(Boolean value) {
        this.includeSuccessionProfile = value;
    }

    /**
     * Gets the value of the includeTalentAssessment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeTalentAssessment() {
        return includeTalentAssessment;
    }

    /**
     * Sets the value of the includeTalentAssessment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeTalentAssessment(Boolean value) {
        this.includeTalentAssessment = value;
    }

    /**
     * Gets the value of the includeEmployeeContractData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeEmployeeContractData() {
        return includeEmployeeContractData;
    }

    /**
     * Sets the value of the includeEmployeeContractData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeEmployeeContractData(Boolean value) {
        this.includeEmployeeContractData = value;
    }

    /**
     * Gets the value of the includeCollectiveAgreementData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeCollectiveAgreementData() {
        return includeCollectiveAgreementData;
    }

    /**
     * Sets the value of the includeCollectiveAgreementData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeCollectiveAgreementData(Boolean value) {
        this.includeCollectiveAgreementData = value;
    }

    /**
     * Gets the value of the includeProbationPeriodData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeProbationPeriodData() {
        return includeProbationPeriodData;
    }

    /**
     * Sets the value of the includeProbationPeriodData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeProbationPeriodData(Boolean value) {
        this.includeProbationPeriodData = value;
    }

    /**
     * Gets the value of the includeExtendedEmployeeContractDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeExtendedEmployeeContractDetails() {
        return includeExtendedEmployeeContractDetails;
    }

    /**
     * Sets the value of the includeExtendedEmployeeContractDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeExtendedEmployeeContractDetails(Boolean value) {
        this.includeExtendedEmployeeContractDetails = value;
    }

    /**
     * Gets the value of the includeFeedbackReceived property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeFeedbackReceived() {
        return includeFeedbackReceived;
    }

    /**
     * Sets the value of the includeFeedbackReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeFeedbackReceived(Boolean value) {
        this.includeFeedbackReceived = value;
    }

    /**
     * Gets the value of the includeUserAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeUserAccount() {
        return includeUserAccount;
    }

    /**
     * Sets the value of the includeUserAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeUserAccount(Boolean value) {
        this.includeUserAccount = value;
    }

    /**
     * Gets the value of the includeCareer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeCareer() {
        return includeCareer;
    }

    /**
     * Sets the value of the includeCareer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeCareer(Boolean value) {
        this.includeCareer = value;
    }

    /**
     * Gets the value of the includeAccountProvisioning property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeAccountProvisioning() {
        return includeAccountProvisioning;
    }

    /**
     * Sets the value of the includeAccountProvisioning property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeAccountProvisioning(Boolean value) {
        this.includeAccountProvisioning = value;
    }

    /**
     * Gets the value of the includeBackgroundCheckData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeBackgroundCheckData() {
        return includeBackgroundCheckData;
    }

    /**
     * Sets the value of the includeBackgroundCheckData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeBackgroundCheckData(Boolean value) {
        this.includeBackgroundCheckData = value;
    }

    /**
     * Gets the value of the includeContingentWorkerTaxAuthorityFormInformation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeContingentWorkerTaxAuthorityFormInformation() {
        return includeContingentWorkerTaxAuthorityFormInformation;
    }

    /**
     * Sets the value of the includeContingentWorkerTaxAuthorityFormInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeContingentWorkerTaxAuthorityFormInformation(Boolean value) {
        this.includeContingentWorkerTaxAuthorityFormInformation = value;
    }

    /**
     * Gets the value of the excludeFunds property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeFunds() {
        return excludeFunds;
    }

    /**
     * Sets the value of the excludeFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeFunds(Boolean value) {
        this.excludeFunds = value;
    }

    /**
     * Gets the value of the excludeFundHierarchies property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeFundHierarchies() {
        return excludeFundHierarchies;
    }

    /**
     * Sets the value of the excludeFundHierarchies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeFundHierarchies(Boolean value) {
        this.excludeFundHierarchies = value;
    }

    /**
     * Gets the value of the excludeGrants property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeGrants() {
        return excludeGrants;
    }

    /**
     * Sets the value of the excludeGrants property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeGrants(Boolean value) {
        this.excludeGrants = value;
    }

    /**
     * Gets the value of the excludeGrantHierarchies property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeGrantHierarchies() {
        return excludeGrantHierarchies;
    }

    /**
     * Sets the value of the excludeGrantHierarchies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeGrantHierarchies(Boolean value) {
        this.excludeGrantHierarchies = value;
    }

    /**
     * Gets the value of the excludeBusinessUnits property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeBusinessUnits() {
        return excludeBusinessUnits;
    }

    /**
     * Sets the value of the excludeBusinessUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeBusinessUnits(Boolean value) {
        this.excludeBusinessUnits = value;
    }

    /**
     * Gets the value of the excludeBusinessUnitHierarchies property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeBusinessUnitHierarchies() {
        return excludeBusinessUnitHierarchies;
    }

    /**
     * Sets the value of the excludeBusinessUnitHierarchies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeBusinessUnitHierarchies(Boolean value) {
        this.excludeBusinessUnitHierarchies = value;
    }

    /**
     * Gets the value of the excludePrograms property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludePrograms() {
        return excludePrograms;
    }

    /**
     * Sets the value of the excludePrograms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludePrograms(Boolean value) {
        this.excludePrograms = value;
    }

    /**
     * Gets the value of the excludeProgramHierarchies property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeProgramHierarchies() {
        return excludeProgramHierarchies;
    }

    /**
     * Sets the value of the excludeProgramHierarchies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeProgramHierarchies(Boolean value) {
        this.excludeProgramHierarchies = value;
    }

    /**
     * Gets the value of the excludeGifts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeGifts() {
        return excludeGifts;
    }

    /**
     * Sets the value of the excludeGifts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeGifts(Boolean value) {
        this.excludeGifts = value;
    }

    /**
     * Gets the value of the excludeGiftHierarchies property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeGiftHierarchies() {
        return excludeGiftHierarchies;
    }

    /**
     * Sets the value of the excludeGiftHierarchies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeGiftHierarchies(Boolean value) {
        this.excludeGiftHierarchies = value;
    }

}
