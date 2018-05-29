
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the latest completed performance review for the employee.
 * 
 * <p>Java class for Performance_Review_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Performance_Review_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Performance_Review_Reference" type="{urn:com.workday/bsvc}Performance_ReviewObjectType" minOccurs="0"/>
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
@XmlType(name = "Performance_Review_DataType", propOrder = {
    "performanceReviewReference",
    "reviewData"
})
public class PerformanceReviewDataType {

    @XmlElement(name = "Performance_Review_Reference")
    protected PerformanceReviewObjectType performanceReviewReference;
    @XmlElement(name = "Review_Data")
    protected EmployeeReviewDetailsDataType reviewData;

    /**
     * Gets the value of the performanceReviewReference property.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceReviewObjectType }
     *     
     */
    public PerformanceReviewObjectType getPerformanceReviewReference() {
        return performanceReviewReference;
    }

    /**
     * Sets the value of the performanceReviewReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceReviewObjectType }
     *     
     */
    public void setPerformanceReviewReference(PerformanceReviewObjectType value) {
        this.performanceReviewReference = value;
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
