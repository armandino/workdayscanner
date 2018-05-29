
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing all Bonus Plan Compensation data.
 * 
 * <p>Java class for Employee_Compensation_Bonus_Plan_Assignment_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employee_Compensation_Bonus_Plan_Assignment_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Bonus_Plan_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Compensation_Element_Values_for_Bonus_Plan_Data" type="{urn:com.workday/bsvc}Employee_Compensation_Bonus_Plan_Assignment_Detail_DataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employee_Compensation_Bonus_Plan_Assignment_DataType", propOrder = {
    "bonusPlanName",
    "compensationElementValuesForBonusPlanData"
})
public class EmployeeCompensationBonusPlanAssignmentDataType {

    @XmlElement(name = "Bonus_Plan_Name", required = true)
    protected String bonusPlanName;
    @XmlElement(name = "Compensation_Element_Values_for_Bonus_Plan_Data", required = true)
    protected EmployeeCompensationBonusPlanAssignmentDetailDataType compensationElementValuesForBonusPlanData;

    /**
     * Gets the value of the bonusPlanName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBonusPlanName() {
        return bonusPlanName;
    }

    /**
     * Sets the value of the bonusPlanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBonusPlanName(String value) {
        this.bonusPlanName = value;
    }

    /**
     * Gets the value of the compensationElementValuesForBonusPlanData property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeCompensationBonusPlanAssignmentDetailDataType }
     *     
     */
    public EmployeeCompensationBonusPlanAssignmentDetailDataType getCompensationElementValuesForBonusPlanData() {
        return compensationElementValuesForBonusPlanData;
    }

    /**
     * Sets the value of the compensationElementValuesForBonusPlanData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeCompensationBonusPlanAssignmentDetailDataType }
     *     
     */
    public void setCompensationElementValuesForBonusPlanData(EmployeeCompensationBonusPlanAssignmentDetailDataType value) {
        this.compensationElementValuesForBonusPlanData = value;
    }

}
