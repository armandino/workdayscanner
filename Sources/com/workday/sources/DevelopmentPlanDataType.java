
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the latest completed development plan for the employee.
 * 
 * <p>Java class for Development_Plan_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Development_Plan_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Development_Plan_Reference" type="{urn:com.workday/bsvc}Development_PlanObjectType" minOccurs="0"/>
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
@XmlType(name = "Development_Plan_DataType", propOrder = {
    "developmentPlanReference",
    "reviewData"
})
public class DevelopmentPlanDataType {

    @XmlElement(name = "Development_Plan_Reference")
    protected DevelopmentPlanObjectType developmentPlanReference;
    @XmlElement(name = "Review_Data")
    protected EmployeeReviewDetailsDataType reviewData;

    /**
     * Gets the value of the developmentPlanReference property.
     * 
     * @return
     *     possible object is
     *     {@link DevelopmentPlanObjectType }
     *     
     */
    public DevelopmentPlanObjectType getDevelopmentPlanReference() {
        return developmentPlanReference;
    }

    /**
     * Sets the value of the developmentPlanReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevelopmentPlanObjectType }
     *     
     */
    public void setDevelopmentPlanReference(DevelopmentPlanObjectType value) {
        this.developmentPlanReference = value;
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
