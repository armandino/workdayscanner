
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the detailed information about a worker.
 * 
 * <p>Java class for Worker_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Worker_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="User_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Universal_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Personal_Data" type="{urn:com.workday/bsvc}Personal_Information_DataType" minOccurs="0"/>
 *         &lt;element name="Employment_Data" type="{urn:com.workday/bsvc}Worker_Employment_Information_DataType" minOccurs="0"/>
 *         &lt;element name="Compensation_Data" type="{urn:com.workday/bsvc}Worker_Compensation_DataType" minOccurs="0"/>
 *         &lt;element name="Organization_Data" type="{urn:com.workday/bsvc}Worker_Organization_DataType" minOccurs="0"/>
 *         &lt;element name="Role_Data" type="{urn:com.workday/bsvc}Worker_Role_DataType" minOccurs="0"/>
 *         &lt;element name="Management_Chain_Data" type="{urn:com.workday/bsvc}Worker_Management_Chain_DataType" minOccurs="0"/>
 *         &lt;element name="Benefit_Enrollment_Data" type="{urn:com.workday/bsvc}Worker_Benefit_Enrollment_DataType" minOccurs="0"/>
 *         &lt;element name="Benefit_Eligibility_Data" type="{urn:com.workday/bsvc}Worker_Benefit_Eligibility_DataType" minOccurs="0"/>
 *         &lt;element name="Related_Person_Data" type="{urn:com.workday/bsvc}Worker_Related_Persons_DataType" minOccurs="0"/>
 *         &lt;element name="Qualification_Data" type="{urn:com.workday/bsvc}Person_Qualification_DataType" minOccurs="0"/>
 *         &lt;element name="Employee_Review_Data" type="{urn:com.workday/bsvc}Employee_Review_DataType" minOccurs="0"/>
 *         &lt;element name="Photo_Data" type="{urn:com.workday/bsvc}Employee_Image_DataType" minOccurs="0"/>
 *         &lt;element name="Worker_Document_Data" type="{urn:com.workday/bsvc}Worker_Document_Data_WWSType" minOccurs="0"/>
 *         &lt;element name="Integration_Field_Override_Data" type="{urn:com.workday/bsvc}Document_Field_Result_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Transaction_Log_Entry_Data" type="{urn:com.workday/bsvc}Event_Target_Transaction_Log_Entry_DataType" minOccurs="0"/>
 *         &lt;element name="Transaction_Log_Corrected_And_Rescinded_Data" type="{urn:com.workday/bsvc}Event_Target_Transaction_Log_Rescind_And_Correct_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Succession_Profile_Data" type="{urn:com.workday/bsvc}Succession_Profile_DataType" minOccurs="0"/>
 *         &lt;element name="Talent_Assessment_Data" type="{urn:com.workday/bsvc}Talent_Assessment_DataType" minOccurs="0"/>
 *         &lt;element name="Worker_Goal_Data" type="{urn:com.workday/bsvc}Worker_Goal_DataType" minOccurs="0"/>
 *         &lt;element name="Development_Item_Data" type="{urn:com.workday/bsvc}Worker_Development_Item_DataType" minOccurs="0"/>
 *         &lt;element name="Skill_Data" type="{urn:com.workday/bsvc}Worker_Skill_Item_DataType" minOccurs="0"/>
 *         &lt;element name="Employee_Contracts_Data" type="{urn:com.workday/bsvc}Employee_Contracts_DataType" minOccurs="0"/>
 *         &lt;element name="Extended_Employee_Contracts_Data" type="{urn:com.workday/bsvc}Extended_Employee_Contracts_DataType" minOccurs="0"/>
 *         &lt;element name="Feedback_Received_Data" type="{urn:com.workday/bsvc}Feedback_Received_DataType" minOccurs="0"/>
 *         &lt;element name="User_Account_Data" type="{urn:com.workday/bsvc}System_User_for_Worker_DataType" minOccurs="0"/>
 *         &lt;element name="Career_Data" type="{urn:com.workday/bsvc}Worker_Career_DataType" minOccurs="0"/>
 *         &lt;element name="Account_Provisioning_Data" type="{urn:com.workday/bsvc}Person_Account_Provisioning_DataType" minOccurs="0"/>
 *         &lt;element name="Background_Check_Data" type="{urn:com.workday/bsvc}Background_Check_Overall_Status_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Contingent_Worker_Tax_Authority_Form_Type_Data" type="{urn:com.workday/bsvc}Contingent_Worker_Tax_Authority_Form_Information_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_DataType", propOrder = {
    "workerID",
    "userID",
    "universalID",
    "personalData",
    "employmentData",
    "compensationData",
    "organizationData",
    "roleData",
    "managementChainData",
    "benefitEnrollmentData",
    "benefitEligibilityData",
    "relatedPersonData",
    "qualificationData",
    "employeeReviewData",
    "photoData",
    "workerDocumentData",
    "integrationFieldOverrideData",
    "transactionLogEntryData",
    "transactionLogCorrectedAndRescindedData",
    "successionProfileData",
    "talentAssessmentData",
    "workerGoalData",
    "developmentItemData",
    "skillData",
    "employeeContractsData",
    "extendedEmployeeContractsData",
    "feedbackReceivedData",
    "userAccountData",
    "careerData",
    "accountProvisioningData",
    "backgroundCheckData",
    "contingentWorkerTaxAuthorityFormTypeData"
})
public class WorkerDataType {

    @XmlElement(name = "Worker_ID")
    protected String workerID;
    @XmlElement(name = "User_ID")
    protected String userID;
    @XmlElement(name = "Universal_ID")
    protected String universalID;
    @XmlElement(name = "Personal_Data")
    protected PersonalInformationDataType personalData;
    @XmlElement(name = "Employment_Data")
    protected WorkerEmploymentInformationDataType employmentData;
    @XmlElement(name = "Compensation_Data")
    protected WorkerCompensationDataType compensationData;
    @XmlElement(name = "Organization_Data")
    protected WorkerOrganizationDataType organizationData;
    @XmlElement(name = "Role_Data")
    protected WorkerRoleDataType roleData;
    @XmlElement(name = "Management_Chain_Data")
    protected WorkerManagementChainDataType managementChainData;
    @XmlElement(name = "Benefit_Enrollment_Data")
    protected WorkerBenefitEnrollmentDataType benefitEnrollmentData;
    @XmlElement(name = "Benefit_Eligibility_Data")
    protected WorkerBenefitEligibilityDataType benefitEligibilityData;
    @XmlElement(name = "Related_Person_Data")
    protected WorkerRelatedPersonsDataType relatedPersonData;
    @XmlElement(name = "Qualification_Data")
    protected PersonQualificationDataType qualificationData;
    @XmlElement(name = "Employee_Review_Data")
    protected EmployeeReviewDataType employeeReviewData;
    @XmlElement(name = "Photo_Data")
    protected EmployeeImageDataType photoData;
    @XmlElement(name = "Worker_Document_Data")
    protected WorkerDocumentDataWWSType workerDocumentData;
    @XmlElement(name = "Integration_Field_Override_Data")
    protected List<DocumentFieldResultDataType> integrationFieldOverrideData;
    @XmlElement(name = "Transaction_Log_Entry_Data")
    protected EventTargetTransactionLogEntryDataType transactionLogEntryData;
    @XmlElement(name = "Transaction_Log_Corrected_And_Rescinded_Data")
    protected List<EventTargetTransactionLogRescindAndCorrectDataType> transactionLogCorrectedAndRescindedData;
    @XmlElement(name = "Succession_Profile_Data")
    protected SuccessionProfileDataType successionProfileData;
    @XmlElement(name = "Talent_Assessment_Data")
    protected TalentAssessmentDataType talentAssessmentData;
    @XmlElement(name = "Worker_Goal_Data")
    protected WorkerGoalDataType workerGoalData;
    @XmlElement(name = "Development_Item_Data")
    protected WorkerDevelopmentItemDataType developmentItemData;
    @XmlElement(name = "Skill_Data")
    protected WorkerSkillItemDataType skillData;
    @XmlElement(name = "Employee_Contracts_Data")
    protected EmployeeContractsDataType employeeContractsData;
    @XmlElement(name = "Extended_Employee_Contracts_Data")
    protected ExtendedEmployeeContractsDataType extendedEmployeeContractsData;
    @XmlElement(name = "Feedback_Received_Data")
    protected FeedbackReceivedDataType feedbackReceivedData;
    @XmlElement(name = "User_Account_Data")
    protected SystemUserForWorkerDataType userAccountData;
    @XmlElement(name = "Career_Data")
    protected WorkerCareerDataType careerData;
    @XmlElement(name = "Account_Provisioning_Data")
    protected PersonAccountProvisioningDataType accountProvisioningData;
    @XmlElement(name = "Background_Check_Data")
    protected List<BackgroundCheckOverallStatusDataType> backgroundCheckData;
    @XmlElement(name = "Contingent_Worker_Tax_Authority_Form_Type_Data")
    protected List<ContingentWorkerTaxAuthorityFormInformationDataType> contingentWorkerTaxAuthorityFormTypeData;

    /**
     * Gets the value of the workerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkerID() {
        return workerID;
    }

    /**
     * Sets the value of the workerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkerID(String value) {
        this.workerID = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the universalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversalID() {
        return universalID;
    }

    /**
     * Sets the value of the universalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversalID(String value) {
        this.universalID = value;
    }

    /**
     * Gets the value of the personalData property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalInformationDataType }
     *     
     */
    public PersonalInformationDataType getPersonalData() {
        return personalData;
    }

    /**
     * Sets the value of the personalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalInformationDataType }
     *     
     */
    public void setPersonalData(PersonalInformationDataType value) {
        this.personalData = value;
    }

    /**
     * Gets the value of the employmentData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerEmploymentInformationDataType }
     *     
     */
    public WorkerEmploymentInformationDataType getEmploymentData() {
        return employmentData;
    }

    /**
     * Sets the value of the employmentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerEmploymentInformationDataType }
     *     
     */
    public void setEmploymentData(WorkerEmploymentInformationDataType value) {
        this.employmentData = value;
    }

    /**
     * Gets the value of the compensationData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerCompensationDataType }
     *     
     */
    public WorkerCompensationDataType getCompensationData() {
        return compensationData;
    }

    /**
     * Sets the value of the compensationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerCompensationDataType }
     *     
     */
    public void setCompensationData(WorkerCompensationDataType value) {
        this.compensationData = value;
    }

    /**
     * Gets the value of the organizationData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerOrganizationDataType }
     *     
     */
    public WorkerOrganizationDataType getOrganizationData() {
        return organizationData;
    }

    /**
     * Sets the value of the organizationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerOrganizationDataType }
     *     
     */
    public void setOrganizationData(WorkerOrganizationDataType value) {
        this.organizationData = value;
    }

    /**
     * Gets the value of the roleData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerRoleDataType }
     *     
     */
    public WorkerRoleDataType getRoleData() {
        return roleData;
    }

    /**
     * Sets the value of the roleData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerRoleDataType }
     *     
     */
    public void setRoleData(WorkerRoleDataType value) {
        this.roleData = value;
    }

    /**
     * Gets the value of the managementChainData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerManagementChainDataType }
     *     
     */
    public WorkerManagementChainDataType getManagementChainData() {
        return managementChainData;
    }

    /**
     * Sets the value of the managementChainData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerManagementChainDataType }
     *     
     */
    public void setManagementChainData(WorkerManagementChainDataType value) {
        this.managementChainData = value;
    }

    /**
     * Gets the value of the benefitEnrollmentData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerBenefitEnrollmentDataType }
     *     
     */
    public WorkerBenefitEnrollmentDataType getBenefitEnrollmentData() {
        return benefitEnrollmentData;
    }

    /**
     * Sets the value of the benefitEnrollmentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerBenefitEnrollmentDataType }
     *     
     */
    public void setBenefitEnrollmentData(WorkerBenefitEnrollmentDataType value) {
        this.benefitEnrollmentData = value;
    }

    /**
     * Gets the value of the benefitEligibilityData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerBenefitEligibilityDataType }
     *     
     */
    public WorkerBenefitEligibilityDataType getBenefitEligibilityData() {
        return benefitEligibilityData;
    }

    /**
     * Sets the value of the benefitEligibilityData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerBenefitEligibilityDataType }
     *     
     */
    public void setBenefitEligibilityData(WorkerBenefitEligibilityDataType value) {
        this.benefitEligibilityData = value;
    }

    /**
     * Gets the value of the relatedPersonData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerRelatedPersonsDataType }
     *     
     */
    public WorkerRelatedPersonsDataType getRelatedPersonData() {
        return relatedPersonData;
    }

    /**
     * Sets the value of the relatedPersonData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerRelatedPersonsDataType }
     *     
     */
    public void setRelatedPersonData(WorkerRelatedPersonsDataType value) {
        this.relatedPersonData = value;
    }

    /**
     * Gets the value of the qualificationData property.
     * 
     * @return
     *     possible object is
     *     {@link PersonQualificationDataType }
     *     
     */
    public PersonQualificationDataType getQualificationData() {
        return qualificationData;
    }

    /**
     * Sets the value of the qualificationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonQualificationDataType }
     *     
     */
    public void setQualificationData(PersonQualificationDataType value) {
        this.qualificationData = value;
    }

    /**
     * Gets the value of the employeeReviewData property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeReviewDataType }
     *     
     */
    public EmployeeReviewDataType getEmployeeReviewData() {
        return employeeReviewData;
    }

    /**
     * Sets the value of the employeeReviewData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeReviewDataType }
     *     
     */
    public void setEmployeeReviewData(EmployeeReviewDataType value) {
        this.employeeReviewData = value;
    }

    /**
     * Gets the value of the photoData property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeImageDataType }
     *     
     */
    public EmployeeImageDataType getPhotoData() {
        return photoData;
    }

    /**
     * Sets the value of the photoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeImageDataType }
     *     
     */
    public void setPhotoData(EmployeeImageDataType value) {
        this.photoData = value;
    }

    /**
     * Gets the value of the workerDocumentData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerDocumentDataWWSType }
     *     
     */
    public WorkerDocumentDataWWSType getWorkerDocumentData() {
        return workerDocumentData;
    }

    /**
     * Sets the value of the workerDocumentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerDocumentDataWWSType }
     *     
     */
    public void setWorkerDocumentData(WorkerDocumentDataWWSType value) {
        this.workerDocumentData = value;
    }

    /**
     * Gets the value of the integrationFieldOverrideData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the integrationFieldOverrideData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntegrationFieldOverrideData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentFieldResultDataType }
     * 
     * 
     */
    public List<DocumentFieldResultDataType> getIntegrationFieldOverrideData() {
        if (integrationFieldOverrideData == null) {
            integrationFieldOverrideData = new ArrayList<DocumentFieldResultDataType>();
        }
        return this.integrationFieldOverrideData;
    }

    /**
     * Gets the value of the transactionLogEntryData property.
     * 
     * @return
     *     possible object is
     *     {@link EventTargetTransactionLogEntryDataType }
     *     
     */
    public EventTargetTransactionLogEntryDataType getTransactionLogEntryData() {
        return transactionLogEntryData;
    }

    /**
     * Sets the value of the transactionLogEntryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventTargetTransactionLogEntryDataType }
     *     
     */
    public void setTransactionLogEntryData(EventTargetTransactionLogEntryDataType value) {
        this.transactionLogEntryData = value;
    }

    /**
     * Gets the value of the transactionLogCorrectedAndRescindedData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionLogCorrectedAndRescindedData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionLogCorrectedAndRescindedData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventTargetTransactionLogRescindAndCorrectDataType }
     * 
     * 
     */
    public List<EventTargetTransactionLogRescindAndCorrectDataType> getTransactionLogCorrectedAndRescindedData() {
        if (transactionLogCorrectedAndRescindedData == null) {
            transactionLogCorrectedAndRescindedData = new ArrayList<EventTargetTransactionLogRescindAndCorrectDataType>();
        }
        return this.transactionLogCorrectedAndRescindedData;
    }

    /**
     * Gets the value of the successionProfileData property.
     * 
     * @return
     *     possible object is
     *     {@link SuccessionProfileDataType }
     *     
     */
    public SuccessionProfileDataType getSuccessionProfileData() {
        return successionProfileData;
    }

    /**
     * Sets the value of the successionProfileData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuccessionProfileDataType }
     *     
     */
    public void setSuccessionProfileData(SuccessionProfileDataType value) {
        this.successionProfileData = value;
    }

    /**
     * Gets the value of the talentAssessmentData property.
     * 
     * @return
     *     possible object is
     *     {@link TalentAssessmentDataType }
     *     
     */
    public TalentAssessmentDataType getTalentAssessmentData() {
        return talentAssessmentData;
    }

    /**
     * Sets the value of the talentAssessmentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TalentAssessmentDataType }
     *     
     */
    public void setTalentAssessmentData(TalentAssessmentDataType value) {
        this.talentAssessmentData = value;
    }

    /**
     * Gets the value of the workerGoalData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerGoalDataType }
     *     
     */
    public WorkerGoalDataType getWorkerGoalData() {
        return workerGoalData;
    }

    /**
     * Sets the value of the workerGoalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerGoalDataType }
     *     
     */
    public void setWorkerGoalData(WorkerGoalDataType value) {
        this.workerGoalData = value;
    }

    /**
     * Gets the value of the developmentItemData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerDevelopmentItemDataType }
     *     
     */
    public WorkerDevelopmentItemDataType getDevelopmentItemData() {
        return developmentItemData;
    }

    /**
     * Sets the value of the developmentItemData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerDevelopmentItemDataType }
     *     
     */
    public void setDevelopmentItemData(WorkerDevelopmentItemDataType value) {
        this.developmentItemData = value;
    }

    /**
     * Gets the value of the skillData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerSkillItemDataType }
     *     
     */
    public WorkerSkillItemDataType getSkillData() {
        return skillData;
    }

    /**
     * Sets the value of the skillData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerSkillItemDataType }
     *     
     */
    public void setSkillData(WorkerSkillItemDataType value) {
        this.skillData = value;
    }

    /**
     * Gets the value of the employeeContractsData property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeContractsDataType }
     *     
     */
    public EmployeeContractsDataType getEmployeeContractsData() {
        return employeeContractsData;
    }

    /**
     * Sets the value of the employeeContractsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeContractsDataType }
     *     
     */
    public void setEmployeeContractsData(EmployeeContractsDataType value) {
        this.employeeContractsData = value;
    }

    /**
     * Gets the value of the extendedEmployeeContractsData property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedEmployeeContractsDataType }
     *     
     */
    public ExtendedEmployeeContractsDataType getExtendedEmployeeContractsData() {
        return extendedEmployeeContractsData;
    }

    /**
     * Sets the value of the extendedEmployeeContractsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedEmployeeContractsDataType }
     *     
     */
    public void setExtendedEmployeeContractsData(ExtendedEmployeeContractsDataType value) {
        this.extendedEmployeeContractsData = value;
    }

    /**
     * Gets the value of the feedbackReceivedData property.
     * 
     * @return
     *     possible object is
     *     {@link FeedbackReceivedDataType }
     *     
     */
    public FeedbackReceivedDataType getFeedbackReceivedData() {
        return feedbackReceivedData;
    }

    /**
     * Sets the value of the feedbackReceivedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedbackReceivedDataType }
     *     
     */
    public void setFeedbackReceivedData(FeedbackReceivedDataType value) {
        this.feedbackReceivedData = value;
    }

    /**
     * Gets the value of the userAccountData property.
     * 
     * @return
     *     possible object is
     *     {@link SystemUserForWorkerDataType }
     *     
     */
    public SystemUserForWorkerDataType getUserAccountData() {
        return userAccountData;
    }

    /**
     * Sets the value of the userAccountData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemUserForWorkerDataType }
     *     
     */
    public void setUserAccountData(SystemUserForWorkerDataType value) {
        this.userAccountData = value;
    }

    /**
     * Gets the value of the careerData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerCareerDataType }
     *     
     */
    public WorkerCareerDataType getCareerData() {
        return careerData;
    }

    /**
     * Sets the value of the careerData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerCareerDataType }
     *     
     */
    public void setCareerData(WorkerCareerDataType value) {
        this.careerData = value;
    }

    /**
     * Gets the value of the accountProvisioningData property.
     * 
     * @return
     *     possible object is
     *     {@link PersonAccountProvisioningDataType }
     *     
     */
    public PersonAccountProvisioningDataType getAccountProvisioningData() {
        return accountProvisioningData;
    }

    /**
     * Sets the value of the accountProvisioningData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonAccountProvisioningDataType }
     *     
     */
    public void setAccountProvisioningData(PersonAccountProvisioningDataType value) {
        this.accountProvisioningData = value;
    }

    /**
     * Gets the value of the backgroundCheckData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the backgroundCheckData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBackgroundCheckData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BackgroundCheckOverallStatusDataType }
     * 
     * 
     */
    public List<BackgroundCheckOverallStatusDataType> getBackgroundCheckData() {
        if (backgroundCheckData == null) {
            backgroundCheckData = new ArrayList<BackgroundCheckOverallStatusDataType>();
        }
        return this.backgroundCheckData;
    }

    /**
     * Gets the value of the contingentWorkerTaxAuthorityFormTypeData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contingentWorkerTaxAuthorityFormTypeData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContingentWorkerTaxAuthorityFormTypeData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContingentWorkerTaxAuthorityFormInformationDataType }
     * 
     * 
     */
    public List<ContingentWorkerTaxAuthorityFormInformationDataType> getContingentWorkerTaxAuthorityFormTypeData() {
        if (contingentWorkerTaxAuthorityFormTypeData == null) {
            contingentWorkerTaxAuthorityFormTypeData = new ArrayList<ContingentWorkerTaxAuthorityFormInformationDataType>();
        }
        return this.contingentWorkerTaxAuthorityFormTypeData;
    }

}
