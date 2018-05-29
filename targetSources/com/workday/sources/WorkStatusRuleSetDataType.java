
package com.workday.sources;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Container Element containing all Attributes and Relationship for a Work Status Rule Set
 * 
 * <p>Java class for Work_Status_Rule_Set_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Work_Status_Rule_Set_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Work_Status_Rule_Set_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Work_Status_Rule_Set_Description" type="{urn:com.workday/bsvc}RichText" minOccurs="0"/>
 *         &lt;element name="Restricted_to_Academic_Unit_Reference" type="{urn:com.workday/bsvc}Academic_UnitObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Default_Work_Status_Rule_Set" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Inactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Applies_to_Leave_Types_Reference" type="{urn:com.workday/bsvc}Leave_of_Absence_TypeObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Active_Periods_Required_for_Eligibility" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="10"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Minimum_Years_Since_Last_Applicable_Leave" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="4"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Work_Status_Rule_Row_Subdata" type="{urn:com.workday/bsvc}Work_Status_Rule_Row_SubdataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Work_Status_Rule_Set_DataType", propOrder = {
    "id",
    "workStatusRuleSetName",
    "workStatusRuleSetDescription",
    "restrictedToAcademicUnitReference",
    "defaultWorkStatusRuleSet",
    "inactive",
    "appliesToLeaveTypesReference",
    "activePeriodsRequiredForEligibility",
    "minimumYearsSinceLastApplicableLeave",
    "workStatusRuleRowSubdata"
})
public class WorkStatusRuleSetDataType {

    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "Work_Status_Rule_Set_Name", required = true)
    protected String workStatusRuleSetName;
    @XmlElement(name = "Work_Status_Rule_Set_Description")
    protected String workStatusRuleSetDescription;
    @XmlElement(name = "Restricted_to_Academic_Unit_Reference")
    protected List<AcademicUnitObjectType> restrictedToAcademicUnitReference;
    @XmlElement(name = "Default_Work_Status_Rule_Set")
    protected Boolean defaultWorkStatusRuleSet;
    @XmlElement(name = "Inactive")
    protected Boolean inactive;
    @XmlElement(name = "Applies_to_Leave_Types_Reference")
    protected List<LeaveOfAbsenceTypeObjectType> appliesToLeaveTypesReference;
    @XmlElement(name = "Active_Periods_Required_for_Eligibility")
    protected BigDecimal activePeriodsRequiredForEligibility;
    @XmlElement(name = "Minimum_Years_Since_Last_Applicable_Leave")
    protected BigDecimal minimumYearsSinceLastApplicableLeave;
    @XmlElement(name = "Work_Status_Rule_Row_Subdata")
    protected List<WorkStatusRuleRowSubdataType> workStatusRuleRowSubdata;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the workStatusRuleSetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkStatusRuleSetName() {
        return workStatusRuleSetName;
    }

    /**
     * Sets the value of the workStatusRuleSetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkStatusRuleSetName(String value) {
        this.workStatusRuleSetName = value;
    }

    /**
     * Gets the value of the workStatusRuleSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkStatusRuleSetDescription() {
        return workStatusRuleSetDescription;
    }

    /**
     * Sets the value of the workStatusRuleSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkStatusRuleSetDescription(String value) {
        this.workStatusRuleSetDescription = value;
    }

    /**
     * Gets the value of the restrictedToAcademicUnitReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restrictedToAcademicUnitReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestrictedToAcademicUnitReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcademicUnitObjectType }
     * 
     * 
     */
    public List<AcademicUnitObjectType> getRestrictedToAcademicUnitReference() {
        if (restrictedToAcademicUnitReference == null) {
            restrictedToAcademicUnitReference = new ArrayList<AcademicUnitObjectType>();
        }
        return this.restrictedToAcademicUnitReference;
    }

    /**
     * Gets the value of the defaultWorkStatusRuleSet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultWorkStatusRuleSet() {
        return defaultWorkStatusRuleSet;
    }

    /**
     * Sets the value of the defaultWorkStatusRuleSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultWorkStatusRuleSet(Boolean value) {
        this.defaultWorkStatusRuleSet = value;
    }

    /**
     * Gets the value of the inactive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInactive() {
        return inactive;
    }

    /**
     * Sets the value of the inactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInactive(Boolean value) {
        this.inactive = value;
    }

    /**
     * Gets the value of the appliesToLeaveTypesReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appliesToLeaveTypesReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppliesToLeaveTypesReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LeaveOfAbsenceTypeObjectType }
     * 
     * 
     */
    public List<LeaveOfAbsenceTypeObjectType> getAppliesToLeaveTypesReference() {
        if (appliesToLeaveTypesReference == null) {
            appliesToLeaveTypesReference = new ArrayList<LeaveOfAbsenceTypeObjectType>();
        }
        return this.appliesToLeaveTypesReference;
    }

    /**
     * Gets the value of the activePeriodsRequiredForEligibility property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActivePeriodsRequiredForEligibility() {
        return activePeriodsRequiredForEligibility;
    }

    /**
     * Sets the value of the activePeriodsRequiredForEligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActivePeriodsRequiredForEligibility(BigDecimal value) {
        this.activePeriodsRequiredForEligibility = value;
    }

    /**
     * Gets the value of the minimumYearsSinceLastApplicableLeave property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumYearsSinceLastApplicableLeave() {
        return minimumYearsSinceLastApplicableLeave;
    }

    /**
     * Sets the value of the minimumYearsSinceLastApplicableLeave property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumYearsSinceLastApplicableLeave(BigDecimal value) {
        this.minimumYearsSinceLastApplicableLeave = value;
    }

    /**
     * Gets the value of the workStatusRuleRowSubdata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workStatusRuleRowSubdata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkStatusRuleRowSubdata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkStatusRuleRowSubdataType }
     * 
     * 
     */
    public List<WorkStatusRuleRowSubdataType> getWorkStatusRuleRowSubdata() {
        if (workStatusRuleRowSubdata == null) {
            workStatusRuleRowSubdata = new ArrayList<WorkStatusRuleRowSubdataType>();
        }
        return this.workStatusRuleRowSubdata;
    }

}
