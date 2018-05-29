
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Encapsulating element containg all Leave Status data.
 * 
 * <p>Java class for Leave_Status_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Leave_Status_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="On_Leave" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Leave_Start_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Estimated_Leave_End_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Leave_End_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="First_Day_Of_Work" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Leave_of_Absence_Type_Reference" type="{urn:com.workday/bsvc}Leave_of_Absence_Type_ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Benefits_Effect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Payroll_Effect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Paid_Time_Off_Accrual_Effect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Continuous_Service_Accrual_Effect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Stock_Vesting_Effect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Leave_Status_DataType", propOrder = {
    "onLeave",
    "leaveStartDate",
    "estimatedLeaveEndDate",
    "leaveEndDate",
    "firstDayOfWork",
    "leaveOfAbsenceTypeReference",
    "benefitsEffect",
    "payrollEffect",
    "paidTimeOffAccrualEffect",
    "continuousServiceAccrualEffect",
    "stockVestingEffect"
})
public class LeaveStatusDataType {

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
    @XmlElement(name = "First_Day_Of_Work")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstDayOfWork;
    @XmlElement(name = "Leave_of_Absence_Type_Reference")
    protected List<LeaveOfAbsenceTypeReferenceType> leaveOfAbsenceTypeReference;
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
     * Gets the value of the leaveOfAbsenceTypeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leaveOfAbsenceTypeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeaveOfAbsenceTypeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LeaveOfAbsenceTypeReferenceType }
     * 
     * 
     */
    public List<LeaveOfAbsenceTypeReferenceType> getLeaveOfAbsenceTypeReference() {
        if (leaveOfAbsenceTypeReference == null) {
            leaveOfAbsenceTypeReference = new ArrayList<LeaveOfAbsenceTypeReferenceType>();
        }
        return this.leaveOfAbsenceTypeReference;
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

}
