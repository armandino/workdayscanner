
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for the Add Academic Appointment business process.
 * 
 * <p>Java class for Add_Academic_Appointment_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Add_Academic_Appointment_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Reason_Reference" type="{urn:com.workday/bsvc}General_Event_SubcategoryObjectType"/>
 *         &lt;choice>
 *           &lt;element name="Academic_Appointee_Reference" type="{urn:com.workday/bsvc}Academic_Appointee_EnabledObjectType" minOccurs="0"/>
 *           &lt;element name="Create_Academic_Affiliate_Data" type="{urn:com.workday/bsvc}Create_Academic_Affiliate_DataType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="Academic_Appointment_Data" type="{urn:com.workday/bsvc}Academic_Appointment_Snapshot_DataType"/>
 *         &lt;element name="Create_Workday_Account_Sub_Business_Process_for_Academic_Affiliate" type="{urn:com.workday/bsvc}Create_Workday_Account_Sub_Business_ProcessType" minOccurs="0"/>
 *         &lt;element name="Manage_Professional_Affiliation_Sub_Business_Process_for_Academic_Affiliate" type="{urn:com.workday/bsvc}Manage_Professional_Affiliation_Sub_Business_Process_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Manage_Education_Sub_Business_Process_for_Academic_Affiliate" type="{urn:com.workday/bsvc}Manage_Education_Sub_Business_Process_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Manage_Instructor_Eligibility_Sub_Business_Process_for_Academic_Affiliate" type="{urn:com.workday/bsvc}Manage_Instructor_Eligibility_Sub_Business_Process_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Add_Academic_Appointment_DataType", propOrder = {
    "reasonReference",
    "academicAppointeeReference",
    "createAcademicAffiliateData",
    "academicAppointmentData",
    "createWorkdayAccountSubBusinessProcessForAcademicAffiliate",
    "manageProfessionalAffiliationSubBusinessProcessForAcademicAffiliate",
    "manageEducationSubBusinessProcessForAcademicAffiliate",
    "manageInstructorEligibilitySubBusinessProcessForAcademicAffiliate"
})
public class AddAcademicAppointmentDataType {

    @XmlElement(name = "Reason_Reference", required = true)
    protected GeneralEventSubcategoryObjectType reasonReference;
    @XmlElement(name = "Academic_Appointee_Reference")
    protected AcademicAppointeeEnabledObjectType academicAppointeeReference;
    @XmlElement(name = "Create_Academic_Affiliate_Data")
    protected CreateAcademicAffiliateDataType createAcademicAffiliateData;
    @XmlElement(name = "Academic_Appointment_Data", required = true)
    protected AcademicAppointmentSnapshotDataType academicAppointmentData;
    @XmlElement(name = "Create_Workday_Account_Sub_Business_Process_for_Academic_Affiliate")
    protected CreateWorkdayAccountSubBusinessProcessType createWorkdayAccountSubBusinessProcessForAcademicAffiliate;
    @XmlElement(name = "Manage_Professional_Affiliation_Sub_Business_Process_for_Academic_Affiliate")
    protected List<ManageProfessionalAffiliationSubBusinessProcessDataType> manageProfessionalAffiliationSubBusinessProcessForAcademicAffiliate;
    @XmlElement(name = "Manage_Education_Sub_Business_Process_for_Academic_Affiliate")
    protected List<ManageEducationSubBusinessProcessDataType> manageEducationSubBusinessProcessForAcademicAffiliate;
    @XmlElement(name = "Manage_Instructor_Eligibility_Sub_Business_Process_for_Academic_Affiliate")
    protected List<ManageInstructorEligibilitySubBusinessProcessDataType> manageInstructorEligibilitySubBusinessProcessForAcademicAffiliate;

    /**
     * Gets the value of the reasonReference property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralEventSubcategoryObjectType }
     *     
     */
    public GeneralEventSubcategoryObjectType getReasonReference() {
        return reasonReference;
    }

    /**
     * Sets the value of the reasonReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralEventSubcategoryObjectType }
     *     
     */
    public void setReasonReference(GeneralEventSubcategoryObjectType value) {
        this.reasonReference = value;
    }

    /**
     * Gets the value of the academicAppointeeReference property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicAppointeeEnabledObjectType }
     *     
     */
    public AcademicAppointeeEnabledObjectType getAcademicAppointeeReference() {
        return academicAppointeeReference;
    }

    /**
     * Sets the value of the academicAppointeeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicAppointeeEnabledObjectType }
     *     
     */
    public void setAcademicAppointeeReference(AcademicAppointeeEnabledObjectType value) {
        this.academicAppointeeReference = value;
    }

    /**
     * Gets the value of the createAcademicAffiliateData property.
     * 
     * @return
     *     possible object is
     *     {@link CreateAcademicAffiliateDataType }
     *     
     */
    public CreateAcademicAffiliateDataType getCreateAcademicAffiliateData() {
        return createAcademicAffiliateData;
    }

    /**
     * Sets the value of the createAcademicAffiliateData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateAcademicAffiliateDataType }
     *     
     */
    public void setCreateAcademicAffiliateData(CreateAcademicAffiliateDataType value) {
        this.createAcademicAffiliateData = value;
    }

    /**
     * Gets the value of the academicAppointmentData property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicAppointmentSnapshotDataType }
     *     
     */
    public AcademicAppointmentSnapshotDataType getAcademicAppointmentData() {
        return academicAppointmentData;
    }

    /**
     * Sets the value of the academicAppointmentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicAppointmentSnapshotDataType }
     *     
     */
    public void setAcademicAppointmentData(AcademicAppointmentSnapshotDataType value) {
        this.academicAppointmentData = value;
    }

    /**
     * Gets the value of the createWorkdayAccountSubBusinessProcessForAcademicAffiliate property.
     * 
     * @return
     *     possible object is
     *     {@link CreateWorkdayAccountSubBusinessProcessType }
     *     
     */
    public CreateWorkdayAccountSubBusinessProcessType getCreateWorkdayAccountSubBusinessProcessForAcademicAffiliate() {
        return createWorkdayAccountSubBusinessProcessForAcademicAffiliate;
    }

    /**
     * Sets the value of the createWorkdayAccountSubBusinessProcessForAcademicAffiliate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateWorkdayAccountSubBusinessProcessType }
     *     
     */
    public void setCreateWorkdayAccountSubBusinessProcessForAcademicAffiliate(CreateWorkdayAccountSubBusinessProcessType value) {
        this.createWorkdayAccountSubBusinessProcessForAcademicAffiliate = value;
    }

    /**
     * Gets the value of the manageProfessionalAffiliationSubBusinessProcessForAcademicAffiliate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manageProfessionalAffiliationSubBusinessProcessForAcademicAffiliate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManageProfessionalAffiliationSubBusinessProcessForAcademicAffiliate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManageProfessionalAffiliationSubBusinessProcessDataType }
     * 
     * 
     */
    public List<ManageProfessionalAffiliationSubBusinessProcessDataType> getManageProfessionalAffiliationSubBusinessProcessForAcademicAffiliate() {
        if (manageProfessionalAffiliationSubBusinessProcessForAcademicAffiliate == null) {
            manageProfessionalAffiliationSubBusinessProcessForAcademicAffiliate = new ArrayList<ManageProfessionalAffiliationSubBusinessProcessDataType>();
        }
        return this.manageProfessionalAffiliationSubBusinessProcessForAcademicAffiliate;
    }

    /**
     * Gets the value of the manageEducationSubBusinessProcessForAcademicAffiliate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manageEducationSubBusinessProcessForAcademicAffiliate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManageEducationSubBusinessProcessForAcademicAffiliate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManageEducationSubBusinessProcessDataType }
     * 
     * 
     */
    public List<ManageEducationSubBusinessProcessDataType> getManageEducationSubBusinessProcessForAcademicAffiliate() {
        if (manageEducationSubBusinessProcessForAcademicAffiliate == null) {
            manageEducationSubBusinessProcessForAcademicAffiliate = new ArrayList<ManageEducationSubBusinessProcessDataType>();
        }
        return this.manageEducationSubBusinessProcessForAcademicAffiliate;
    }

    /**
     * Gets the value of the manageInstructorEligibilitySubBusinessProcessForAcademicAffiliate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manageInstructorEligibilitySubBusinessProcessForAcademicAffiliate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManageInstructorEligibilitySubBusinessProcessForAcademicAffiliate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManageInstructorEligibilitySubBusinessProcessDataType }
     * 
     * 
     */
    public List<ManageInstructorEligibilitySubBusinessProcessDataType> getManageInstructorEligibilitySubBusinessProcessForAcademicAffiliate() {
        if (manageInstructorEligibilitySubBusinessProcessForAcademicAffiliate == null) {
            manageInstructorEligibilitySubBusinessProcessForAcademicAffiliate = new ArrayList<ManageInstructorEligibilitySubBusinessProcessDataType>();
        }
        return this.manageInstructorEligibilitySubBusinessProcessForAcademicAffiliate;
    }

}
