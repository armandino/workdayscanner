
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference element representing a unique instance of Merit Plan.
 * 
 * <p>Java class for Employee_Compensation_Merit_Plan_Assignment_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employee_Compensation_Merit_Plan_Assignment_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Merit_Plan_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Compensation_Element_Values_for_Merit_Plan_Data" type="{urn:com.workday/bsvc}Employee_Compensation_Merit_Plan_Assignment_Detail_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employee_Compensation_Merit_Plan_Assignment_DataType", propOrder = {
    "meritPlanName",
    "compensationElementValuesForMeritPlanData"
})
public class EmployeeCompensationMeritPlanAssignmentDataType {

    @XmlElement(name = "Merit_Plan_Name", required = true)
    protected String meritPlanName;
    @XmlElement(name = "Compensation_Element_Values_for_Merit_Plan_Data")
    protected EmployeeCompensationMeritPlanAssignmentDetailDataType compensationElementValuesForMeritPlanData;

    /**
     * Gets the value of the meritPlanName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeritPlanName() {
        return meritPlanName;
    }

    /**
     * Sets the value of the meritPlanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeritPlanName(String value) {
        this.meritPlanName = value;
    }

    /**
     * Gets the value of the compensationElementValuesForMeritPlanData property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeCompensationMeritPlanAssignmentDetailDataType }
     *     
     */
    public EmployeeCompensationMeritPlanAssignmentDetailDataType getCompensationElementValuesForMeritPlanData() {
        return compensationElementValuesForMeritPlanData;
    }

    /**
     * Sets the value of the compensationElementValuesForMeritPlanData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeCompensationMeritPlanAssignmentDetailDataType }
     *     
     */
    public void setCompensationElementValuesForMeritPlanData(EmployeeCompensationMeritPlanAssignmentDetailDataType value) {
        this.compensationElementValuesForMeritPlanData = value;
    }

}
