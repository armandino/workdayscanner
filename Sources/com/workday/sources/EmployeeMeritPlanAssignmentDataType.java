
package com.workday.sources;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Encapsulating element containing all Merit Plan Compensation data.
 * 
 * <p>Java class for Employee_Merit_Plan_Assignment_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employee_Merit_Plan_Assignment_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Compensation_Plan_Reference" type="{urn:com.workday/bsvc}Merit_Percent_PlanObjectType" minOccurs="0"/>
 *         &lt;element name="Individual_Target_Percent" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="18"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Default_Target_Percent" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="16"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Merit_Increase_Matrix_Reference" type="{urn:com.workday/bsvc}Compensation_MatrixObjectType" minOccurs="0"/>
 *         &lt;element name="Guaranteed_Minimum" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Assignment_Effective_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employee_Merit_Plan_Assignment_DataType", propOrder = {
    "compensationPlanReference",
    "individualTargetPercent",
    "defaultTargetPercent",
    "meritIncreaseMatrixReference",
    "guaranteedMinimum",
    "assignmentEffectiveDate"
})
public class EmployeeMeritPlanAssignmentDataType {

    @XmlElement(name = "Compensation_Plan_Reference")
    protected MeritPercentPlanObjectType compensationPlanReference;
    @XmlElement(name = "Individual_Target_Percent")
    protected BigDecimal individualTargetPercent;
    @XmlElement(name = "Default_Target_Percent")
    protected BigDecimal defaultTargetPercent;
    @XmlElement(name = "Merit_Increase_Matrix_Reference")
    protected CompensationMatrixObjectType meritIncreaseMatrixReference;
    @XmlElement(name = "Guaranteed_Minimum")
    protected Boolean guaranteedMinimum;
    @XmlElement(name = "Assignment_Effective_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar assignmentEffectiveDate;

    /**
     * Gets the value of the compensationPlanReference property.
     * 
     * @return
     *     possible object is
     *     {@link MeritPercentPlanObjectType }
     *     
     */
    public MeritPercentPlanObjectType getCompensationPlanReference() {
        return compensationPlanReference;
    }

    /**
     * Sets the value of the compensationPlanReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeritPercentPlanObjectType }
     *     
     */
    public void setCompensationPlanReference(MeritPercentPlanObjectType value) {
        this.compensationPlanReference = value;
    }

    /**
     * Gets the value of the individualTargetPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndividualTargetPercent() {
        return individualTargetPercent;
    }

    /**
     * Sets the value of the individualTargetPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIndividualTargetPercent(BigDecimal value) {
        this.individualTargetPercent = value;
    }

    /**
     * Gets the value of the defaultTargetPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDefaultTargetPercent() {
        return defaultTargetPercent;
    }

    /**
     * Sets the value of the defaultTargetPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDefaultTargetPercent(BigDecimal value) {
        this.defaultTargetPercent = value;
    }

    /**
     * Gets the value of the meritIncreaseMatrixReference property.
     * 
     * @return
     *     possible object is
     *     {@link CompensationMatrixObjectType }
     *     
     */
    public CompensationMatrixObjectType getMeritIncreaseMatrixReference() {
        return meritIncreaseMatrixReference;
    }

    /**
     * Sets the value of the meritIncreaseMatrixReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompensationMatrixObjectType }
     *     
     */
    public void setMeritIncreaseMatrixReference(CompensationMatrixObjectType value) {
        this.meritIncreaseMatrixReference = value;
    }

    /**
     * Gets the value of the guaranteedMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuaranteedMinimum() {
        return guaranteedMinimum;
    }

    /**
     * Sets the value of the guaranteedMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuaranteedMinimum(Boolean value) {
        this.guaranteedMinimum = value;
    }

    /**
     * Gets the value of the assignmentEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAssignmentEffectiveDate() {
        return assignmentEffectiveDate;
    }

    /**
     * Sets the value of the assignmentEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAssignmentEffectiveDate(XMLGregorianCalendar value) {
        this.assignmentEffectiveDate = value;
    }

}
