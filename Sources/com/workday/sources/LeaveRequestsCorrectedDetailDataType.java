
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Encapsulating element containing all Leave Requests that have corrected data.
 * 
 * <p>Java class for Leave_Requests_Corrected_Detail_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Leave_Requests_Corrected_Detail_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Leave_Request_Event_Reference" type="{urn:com.workday/bsvc}Leave_Request_EventObjectType" minOccurs="0"/>
 *         &lt;element name="Leave_Request_Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Leave_Return_Event_Reference" type="{urn:com.workday/bsvc}Unique_IdentifierObjectType" minOccurs="0"/>
 *         &lt;element name="On_Leave" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Leave_Start_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Estimated_Leave_End_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Leave_End_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="First_Day_of_Work" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Leave_Last_Day_of_Work" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Leave_of_Absence_Type_Reference" type="{urn:com.workday/bsvc}Leave_of_Absence_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Links_Back_to_Prior_Event_Reference" type="{urn:com.workday/bsvc}Leave_Request_EventObjectType" minOccurs="0"/>
 *         &lt;element name="Benefits_Effect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Payroll_Effect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Paid_Time_Off_Accrual_Effect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Continuous_Service_Accrual_Effect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Stock_Vesting_Effect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Leave_Type_Reason_Reference" type="{urn:com.workday/bsvc}Leave_Type_ReasonObjectType" minOccurs="0"/>
 *         &lt;element name="Leave_Request_Additional_Fields" type="{urn:com.workday/bsvc}Leave_Request_Additional_FieldsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Leave_Requests_Corrected_Detail_DataType", propOrder = {
    "leaveRequestEventReference",
    "leaveRequestDescription",
    "leaveReturnEventReference",
    "onLeave",
    "leaveStartDate",
    "estimatedLeaveEndDate",
    "leaveEndDate",
    "firstDayOfWork",
    "leaveLastDayOfWork",
    "leaveOfAbsenceTypeReference",
    "linksBackToPriorEventReference",
    "benefitsEffect",
    "payrollEffect",
    "paidTimeOffAccrualEffect",
    "continuousServiceAccrualEffect",
    "stockVestingEffect",
    "leaveTypeReasonReference",
    "leaveRequestAdditionalFields"
})
public class LeaveRequestsCorrectedDetailDataType {

    @XmlElement(name = "Leave_Request_Event_Reference")
    protected LeaveRequestEventObjectType leaveRequestEventReference;
    @XmlElement(name = "Leave_Request_Description")
    protected String leaveRequestDescription;
    @XmlElement(name = "Leave_Return_Event_Reference")
    protected UniqueIdentifierObjectType leaveReturnEventReference;
    @XmlElement(name = "On_Leave")
    protected Boolean onLeave;
    @XmlElement(name = "Leave_Start_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar leaveStartDate;
    @XmlElement(name = "Estimated_Leave_End_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar estimatedLeaveEndDate;
    @XmlElement(name = "Leave_End_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar leaveEndDate;
    @XmlElement(name = "First_Day_of_Work")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstDayOfWork;
    @XmlElement(name = "Leave_Last_Day_of_Work")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar leaveLastDayOfWork;
    @XmlElement(name = "Leave_of_Absence_Type_Reference")
    protected LeaveOfAbsenceTypeObjectType leaveOfAbsenceTypeReference;
    @XmlElement(name = "Links_Back_to_Prior_Event_Reference")
    protected LeaveRequestEventObjectType linksBackToPriorEventReference;
    @XmlElement(name = "Benefits_Effect")
    protected Boolean benefitsEffect;
    @XmlElement(name = "Payroll_Effect")
    protected Boolean payrollEffect;
    @XmlElement(name = "Paid_Time_Off_Accrual_Effect")
    protected Boolean paidTimeOffAccrualEffect;
    @XmlElement(name = "Continuous_Service_Accrual_Effect")
    protected Boolean continuousServiceAccrualEffect;
    @XmlElement(name = "Stock_Vesting_Effect")
    protected Boolean stockVestingEffect;
    @XmlElement(name = "Leave_Type_Reason_Reference")
    protected LeaveTypeReasonObjectType leaveTypeReasonReference;
    @XmlElement(name = "Leave_Request_Additional_Fields")
    protected LeaveRequestAdditionalFieldsType leaveRequestAdditionalFields;

    /**
     * Gets the value of the leaveRequestEventReference property.
     * 
     * @return
     *     possible object is
     *     {@link LeaveRequestEventObjectType }
     *     
     */
    public LeaveRequestEventObjectType getLeaveRequestEventReference() {
        return leaveRequestEventReference;
    }

    /**
     * Sets the value of the leaveRequestEventReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeaveRequestEventObjectType }
     *     
     */
    public void setLeaveRequestEventReference(LeaveRequestEventObjectType value) {
        this.leaveRequestEventReference = value;
    }

    /**
     * Gets the value of the leaveRequestDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaveRequestDescription() {
        return leaveRequestDescription;
    }

    /**
     * Sets the value of the leaveRequestDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaveRequestDescription(String value) {
        this.leaveRequestDescription = value;
    }

    /**
     * Gets the value of the leaveReturnEventReference property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public UniqueIdentifierObjectType getLeaveReturnEventReference() {
        return leaveReturnEventReference;
    }

    /**
     * Sets the value of the leaveReturnEventReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public void setLeaveReturnEventReference(UniqueIdentifierObjectType value) {
        this.leaveReturnEventReference = value;
    }

    /**
     * Gets the value of the onLeave property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnLeave() {
        return onLeave;
    }

    /**
     * Sets the value of the onLeave property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnLeave(Boolean value) {
        this.onLeave = value;
    }

    /**
     * Gets the value of the leaveStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLeaveStartDate() {
        return leaveStartDate;
    }

    /**
     * Sets the value of the leaveStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLeaveStartDate(XMLGregorianCalendar value) {
        this.leaveStartDate = value;
    }

    /**
     * Gets the value of the estimatedLeaveEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimatedLeaveEndDate() {
        return estimatedLeaveEndDate;
    }

    /**
     * Sets the value of the estimatedLeaveEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimatedLeaveEndDate(XMLGregorianCalendar value) {
        this.estimatedLeaveEndDate = value;
    }

    /**
     * Gets the value of the leaveEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLeaveEndDate() {
        return leaveEndDate;
    }

    /**
     * Sets the value of the leaveEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLeaveEndDate(XMLGregorianCalendar value) {
        this.leaveEndDate = value;
    }

    /**
     * Gets the value of the firstDayOfWork property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstDayOfWork() {
        return firstDayOfWork;
    }

    /**
     * Sets the value of the firstDayOfWork property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstDayOfWork(XMLGregorianCalendar value) {
        this.firstDayOfWork = value;
    }

    /**
     * Gets the value of the leaveLastDayOfWork property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLeaveLastDayOfWork() {
        return leaveLastDayOfWork;
    }

    /**
     * Sets the value of the leaveLastDayOfWork property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLeaveLastDayOfWork(XMLGregorianCalendar value) {
        this.leaveLastDayOfWork = value;
    }

    /**
     * Gets the value of the leaveOfAbsenceTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link LeaveOfAbsenceTypeObjectType }
     *     
     */
    public LeaveOfAbsenceTypeObjectType getLeaveOfAbsenceTypeReference() {
        return leaveOfAbsenceTypeReference;
    }

    /**
     * Sets the value of the leaveOfAbsenceTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeaveOfAbsenceTypeObjectType }
     *     
     */
    public void setLeaveOfAbsenceTypeReference(LeaveOfAbsenceTypeObjectType value) {
        this.leaveOfAbsenceTypeReference = value;
    }

    /**
     * Gets the value of the linksBackToPriorEventReference property.
     * 
     * @return
     *     possible object is
     *     {@link LeaveRequestEventObjectType }
     *     
     */
    public LeaveRequestEventObjectType getLinksBackToPriorEventReference() {
        return linksBackToPriorEventReference;
    }

    /**
     * Sets the value of the linksBackToPriorEventReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeaveRequestEventObjectType }
     *     
     */
    public void setLinksBackToPriorEventReference(LeaveRequestEventObjectType value) {
        this.linksBackToPriorEventReference = value;
    }

    /**
     * Gets the value of the benefitsEffect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBenefitsEffect() {
        return benefitsEffect;
    }

    /**
     * Sets the value of the benefitsEffect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBenefitsEffect(Boolean value) {
        this.benefitsEffect = value;
    }

    /**
     * Gets the value of the payrollEffect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPayrollEffect() {
        return payrollEffect;
    }

    /**
     * Sets the value of the payrollEffect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPayrollEffect(Boolean value) {
        this.payrollEffect = value;
    }

    /**
     * Gets the value of the paidTimeOffAccrualEffect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaidTimeOffAccrualEffect() {
        return paidTimeOffAccrualEffect;
    }

    /**
     * Sets the value of the paidTimeOffAccrualEffect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaidTimeOffAccrualEffect(Boolean value) {
        this.paidTimeOffAccrualEffect = value;
    }

    /**
     * Gets the value of the continuousServiceAccrualEffect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContinuousServiceAccrualEffect() {
        return continuousServiceAccrualEffect;
    }

    /**
     * Sets the value of the continuousServiceAccrualEffect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContinuousServiceAccrualEffect(Boolean value) {
        this.continuousServiceAccrualEffect = value;
    }

    /**
     * Gets the value of the stockVestingEffect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStockVestingEffect() {
        return stockVestingEffect;
    }

    /**
     * Sets the value of the stockVestingEffect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStockVestingEffect(Boolean value) {
        this.stockVestingEffect = value;
    }

    /**
     * Gets the value of the leaveTypeReasonReference property.
     * 
     * @return
     *     possible object is
     *     {@link LeaveTypeReasonObjectType }
     *     
     */
    public LeaveTypeReasonObjectType getLeaveTypeReasonReference() {
        return leaveTypeReasonReference;
    }

    /**
     * Sets the value of the leaveTypeReasonReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeaveTypeReasonObjectType }
     *     
     */
    public void setLeaveTypeReasonReference(LeaveTypeReasonObjectType value) {
        this.leaveTypeReasonReference = value;
    }

    /**
     * Gets the value of the leaveRequestAdditionalFields property.
     * 
     * @return
     *     possible object is
     *     {@link LeaveRequestAdditionalFieldsType }
     *     
     */
    public LeaveRequestAdditionalFieldsType getLeaveRequestAdditionalFields() {
        return leaveRequestAdditionalFields;
    }

    /**
     * Sets the value of the leaveRequestAdditionalFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeaveRequestAdditionalFieldsType }
     *     
     */
    public void setLeaveRequestAdditionalFields(LeaveRequestAdditionalFieldsType value) {
        this.leaveRequestAdditionalFields = value;
    }

}
