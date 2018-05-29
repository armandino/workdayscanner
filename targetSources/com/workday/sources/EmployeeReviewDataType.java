
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the latest completed performance review for the employee.
 * 
 * <p>Java class for Employee_Review_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employee_Review_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Performance_Review_Data" type="{urn:com.workday/bsvc}Performance_Review_DataType" minOccurs="0"/>
 *         &lt;element name="Performance_Improvement_Plan_Data" type="{urn:com.workday/bsvc}Performance_Improvement_Plan_DataType" minOccurs="0"/>
 *         &lt;element name="Development_Plan_Data" type="{urn:com.workday/bsvc}Development_Plan_DataType" minOccurs="0"/>
 *         &lt;element name="Disciplinary_Action_Data" type="{urn:com.workday/bsvc}Disciplinary_Action_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employee_Review_DataType", propOrder = {
    "performanceReviewData",
    "performanceImprovementPlanData",
    "developmentPlanData",
    "disciplinaryActionData"
})
public class EmployeeReviewDataType {

    @XmlElement(name = "Performance_Review_Data")
    protected PerformanceReviewDataType performanceReviewData;
    @XmlElement(name = "Performance_Improvement_Plan_Data")
    protected PerformanceImprovementPlanDataType performanceImprovementPlanData;
    @XmlElement(name = "Development_Plan_Data")
    protected DevelopmentPlanDataType developmentPlanData;
    @XmlElement(name = "Disciplinary_Action_Data")
    protected DisciplinaryActionDataType disciplinaryActionData;

    /**
     * Gets the value of the performanceReviewData property.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceReviewDataType }
     *     
     */
    public PerformanceReviewDataType getPerformanceReviewData() {
        return performanceReviewData;
    }

    /**
     * Sets the value of the performanceReviewData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceReviewDataType }
     *     
     */
    public void setPerformanceReviewData(PerformanceReviewDataType value) {
        this.performanceReviewData = value;
    }

    /**
     * Gets the value of the performanceImprovementPlanData property.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceImprovementPlanDataType }
     *     
     */
    public PerformanceImprovementPlanDataType getPerformanceImprovementPlanData() {
        return performanceImprovementPlanData;
    }

    /**
     * Sets the value of the performanceImprovementPlanData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceImprovementPlanDataType }
     *     
     */
    public void setPerformanceImprovementPlanData(PerformanceImprovementPlanDataType value) {
        this.performanceImprovementPlanData = value;
    }

    /**
     * Gets the value of the developmentPlanData property.
     * 
     * @return
     *     possible object is
     *     {@link DevelopmentPlanDataType }
     *     
     */
    public DevelopmentPlanDataType getDevelopmentPlanData() {
        return developmentPlanData;
    }

    /**
     * Sets the value of the developmentPlanData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevelopmentPlanDataType }
     *     
     */
    public void setDevelopmentPlanData(DevelopmentPlanDataType value) {
        this.developmentPlanData = value;
    }

    /**
     * Gets the value of the disciplinaryActionData property.
     * 
     * @return
     *     possible object is
     *     {@link DisciplinaryActionDataType }
     *     
     */
    public DisciplinaryActionDataType getDisciplinaryActionData() {
        return disciplinaryActionData;
    }

    /**
     * Sets the value of the disciplinaryActionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisciplinaryActionDataType }
     *     
     */
    public void setDisciplinaryActionData(DisciplinaryActionDataType value) {
        this.disciplinaryActionData = value;
    }

}
