
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Utilize the Request Criteria element to limit the Job Profiles returned based on the specific criteria.  Job Profiles that are returned must meet all of the criteria specified.
 * 
 * <p>Java class for Job_Profile_Request_CriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job_Profile_Request_CriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Transaction_Log_Criteria_Data" type="{urn:com.workday/bsvc}Transaction_Log_CriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Event_Reference" type="{urn:com.workday/bsvc}Unique_IdentifierObjectType" minOccurs="0"/>
 *         &lt;element name="Job_Family_Reference" type="{urn:com.workday/bsvc}Job_Family_BaseObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Management_Level_Reference" type="{urn:com.workday/bsvc}Management_LevelObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Job_Level_Reference" type="{urn:com.workday/bsvc}Job_LevelObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Job_Category_Reference" type="{urn:com.workday/bsvc}Job_CategoryObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Company_Insider_Type_Reference" type="{urn:com.workday/bsvc}Company_Insider_TypeObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Job_Classification_Reference" type="{urn:com.workday/bsvc}Job_ClassificationObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Job_Classification_Group_Reference" type="{urn:com.workday/bsvc}Job_Classification_GroupObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Workers_Compensation_Code_Reference" type="{urn:com.workday/bsvc}Workers_Compensation_CodeObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Work_Hours_Profile_Reference" type="{urn:com.workday/bsvc}Work_Hours_ProfileObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Field_And_Parameter_Criteria_Data" type="{urn:com.workday/bsvc}Field_And_Parameter_Criteria_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job_Profile_Request_CriteriaType", propOrder = {
    "transactionLogCriteriaData",
    "eventReference",
    "jobFamilyReference",
    "managementLevelReference",
    "jobLevelReference",
    "jobCategoryReference",
    "companyInsiderTypeReference",
    "jobClassificationReference",
    "jobClassificationGroupReference",
    "workersCompensationCodeReference",
    "workHoursProfileReference",
    "fieldAndParameterCriteriaData"
})
public class JobProfileRequestCriteriaType {

    @XmlElement(name = "Transaction_Log_Criteria_Data")
    protected List<TransactionLogCriteriaType> transactionLogCriteriaData;
    @XmlElement(name = "Event_Reference")
    protected UniqueIdentifierObjectType eventReference;
    @XmlElement(name = "Job_Family_Reference")
    protected List<JobFamilyBaseObjectType> jobFamilyReference;
    @XmlElement(name = "Management_Level_Reference")
    protected List<ManagementLevelObjectType> managementLevelReference;
    @XmlElement(name = "Job_Level_Reference")
    protected List<JobLevelObjectType> jobLevelReference;
    @XmlElement(name = "Job_Category_Reference")
    protected List<JobCategoryObjectType> jobCategoryReference;
    @XmlElement(name = "Company_Insider_Type_Reference")
    protected List<CompanyInsiderTypeObjectType> companyInsiderTypeReference;
    @XmlElement(name = "Job_Classification_Reference")
    protected List<JobClassificationObjectType> jobClassificationReference;
    @XmlElement(name = "Job_Classification_Group_Reference")
    protected List<JobClassificationGroupObjectType> jobClassificationGroupReference;
    @XmlElement(name = "Workers_Compensation_Code_Reference")
    protected List<WorkersCompensationCodeObjectType> workersCompensationCodeReference;
    @XmlElement(name = "Work_Hours_Profile_Reference")
    protected List<WorkHoursProfileObjectType> workHoursProfileReference;
    @XmlElement(name = "Field_And_Parameter_Criteria_Data")
    protected FieldAndParameterCriteriaDataType fieldAndParameterCriteriaData;

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
     * Gets the value of the eventReference property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public UniqueIdentifierObjectType getEventReference() {
        return eventReference;
    }

    /**
     * Sets the value of the eventReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public void setEventReference(UniqueIdentifierObjectType value) {
        this.eventReference = value;
    }

    /**
     * Gets the value of the jobFamilyReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobFamilyReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobFamilyReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobFamilyBaseObjectType }
     * 
     * 
     */
    public List<JobFamilyBaseObjectType> getJobFamilyReference() {
        if (jobFamilyReference == null) {
            jobFamilyReference = new ArrayList<JobFamilyBaseObjectType>();
        }
        return this.jobFamilyReference;
    }

    /**
     * Gets the value of the managementLevelReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the managementLevelReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManagementLevelReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManagementLevelObjectType }
     * 
     * 
     */
    public List<ManagementLevelObjectType> getManagementLevelReference() {
        if (managementLevelReference == null) {
            managementLevelReference = new ArrayList<ManagementLevelObjectType>();
        }
        return this.managementLevelReference;
    }

    /**
     * Gets the value of the jobLevelReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobLevelReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobLevelReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobLevelObjectType }
     * 
     * 
     */
    public List<JobLevelObjectType> getJobLevelReference() {
        if (jobLevelReference == null) {
            jobLevelReference = new ArrayList<JobLevelObjectType>();
        }
        return this.jobLevelReference;
    }

    /**
     * Gets the value of the jobCategoryReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobCategoryReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobCategoryReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobCategoryObjectType }
     * 
     * 
     */
    public List<JobCategoryObjectType> getJobCategoryReference() {
        if (jobCategoryReference == null) {
            jobCategoryReference = new ArrayList<JobCategoryObjectType>();
        }
        return this.jobCategoryReference;
    }

    /**
     * Gets the value of the companyInsiderTypeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the companyInsiderTypeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompanyInsiderTypeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyInsiderTypeObjectType }
     * 
     * 
     */
    public List<CompanyInsiderTypeObjectType> getCompanyInsiderTypeReference() {
        if (companyInsiderTypeReference == null) {
            companyInsiderTypeReference = new ArrayList<CompanyInsiderTypeObjectType>();
        }
        return this.companyInsiderTypeReference;
    }

    /**
     * Gets the value of the jobClassificationReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobClassificationReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobClassificationReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobClassificationObjectType }
     * 
     * 
     */
    public List<JobClassificationObjectType> getJobClassificationReference() {
        if (jobClassificationReference == null) {
            jobClassificationReference = new ArrayList<JobClassificationObjectType>();
        }
        return this.jobClassificationReference;
    }

    /**
     * Gets the value of the jobClassificationGroupReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobClassificationGroupReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobClassificationGroupReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobClassificationGroupObjectType }
     * 
     * 
     */
    public List<JobClassificationGroupObjectType> getJobClassificationGroupReference() {
        if (jobClassificationGroupReference == null) {
            jobClassificationGroupReference = new ArrayList<JobClassificationGroupObjectType>();
        }
        return this.jobClassificationGroupReference;
    }

    /**
     * Gets the value of the workersCompensationCodeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workersCompensationCodeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkersCompensationCodeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkersCompensationCodeObjectType }
     * 
     * 
     */
    public List<WorkersCompensationCodeObjectType> getWorkersCompensationCodeReference() {
        if (workersCompensationCodeReference == null) {
            workersCompensationCodeReference = new ArrayList<WorkersCompensationCodeObjectType>();
        }
        return this.workersCompensationCodeReference;
    }

    /**
     * Gets the value of the workHoursProfileReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workHoursProfileReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkHoursProfileReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkHoursProfileObjectType }
     * 
     * 
     */
    public List<WorkHoursProfileObjectType> getWorkHoursProfileReference() {
        if (workHoursProfileReference == null) {
            workHoursProfileReference = new ArrayList<WorkHoursProfileObjectType>();
        }
        return this.workHoursProfileReference;
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

}
