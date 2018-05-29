
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the latest completed performance improvement plan for the employee.
 * 
 * <p>Java class for Performance_Improvement_Plan_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Performance_Improvement_Plan_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Performance_Improvement_Plan_Reference" type="{urn:com.workday/bsvc}Performance_Improvement_PlanObjectType" minOccurs="0"/>
 *         &lt;element name="Review_Data" type="{urn:com.workday/bsvc}Employee_Review_Details_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Performance_Improvement_Plan_DataType", propOrder = {
    "performanceImprovementPlanReference",
    "reviewData"
})
public class PerformanceImprovementPlanDataType {

    @XmlElement(name = "Performance_Improvement_Plan_Reference")
    protected PerformanceImprovementPlanObjectType performanceImprovementPlanReference;
    @XmlElement(name = "Review_Data")
    protected EmployeeReviewDetailsDataType reviewData;

    /**
     * Gets the value of the performanceImprovementPlanReference property.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceImprovementPlanObjectType }
     *     
     */
    public PerformanceImprovementPlanObjectType getPerformanceImprovementPlanReference() {
        return performanceImprovementPlanReference;
    }

    /**
     * Sets the value of the performanceImprovementPlanReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceImprovementPlanObjectType }
     *     
     */
    public void setPerformanceImprovementPlanReference(PerformanceImprovementPlanObjectType value) {
        this.performanceImprovementPlanReference = value;
    }

    /**
     * Gets the value of the reviewData property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeReviewDetailsDataType }
     *     
     */
    public EmployeeReviewDetailsDataType getReviewData() {
        return reviewData;
    }

    /**
     * Sets the value of the reviewData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeReviewDetailsDataType }
     *     
     */
    public void setReviewData(EmployeeReviewDetailsDataType value) {
        this.reviewData = value;
    }

}
