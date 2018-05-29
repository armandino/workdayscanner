
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the insurance period data for an employee based on the benefit plan year.
 * 
 * <p>Java class for Worker_Insurance_Period_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Insurance_Period_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Enrollment_Period_Data" type="{urn:com.workday/bsvc}Enrollment_Period_DataType" minOccurs="0"/>
 *         &lt;element name="Insurance_Coverage_Data" type="{urn:com.workday/bsvc}Worker_Insurance_Coverage_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Insurance_Period_DataType", propOrder = {
    "enrollmentPeriodData",
    "insuranceCoverageData"
})
public class WorkerInsurancePeriodDataType {

    @XmlElement(name = "Enrollment_Period_Data")
    protected EnrollmentPeriodDataType enrollmentPeriodData;
    @XmlElement(name = "Insurance_Coverage_Data")
    protected List<WorkerInsuranceCoverageDataType> insuranceCoverageData;

    /**
     * Gets the value of the enrollmentPeriodData property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollmentPeriodDataType }
     *     
     */
    public EnrollmentPeriodDataType getEnrollmentPeriodData() {
        return enrollmentPeriodData;
    }

    /**
     * Sets the value of the enrollmentPeriodData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollmentPeriodDataType }
     *     
     */
    public void setEnrollmentPeriodData(EnrollmentPeriodDataType value) {
        this.enrollmentPeriodData = value;
    }

    /**
     * Gets the value of the insuranceCoverageData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insuranceCoverageData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsuranceCoverageData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkerInsuranceCoverageDataType }
     * 
     * 
     */
    public List<WorkerInsuranceCoverageDataType> getInsuranceCoverageData() {
        if (insuranceCoverageData == null) {
            insuranceCoverageData = new ArrayList<WorkerInsuranceCoverageDataType>();
        }
        return this.insuranceCoverageData;
    }

}
