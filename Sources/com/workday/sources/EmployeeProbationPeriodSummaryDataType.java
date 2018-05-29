
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing all Probation Period data.
 * 
 * <p>Java class for Employee_Probation_Period_Summary_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employee_Probation_Period_Summary_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Employee_Probation_Period_Detail_Data" type="{urn:com.workday/bsvc}Employee_Probation_Period_Detail_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employee_Probation_Period_Summary_DataType", propOrder = {
    "employeeProbationPeriodDetailData"
})
public class EmployeeProbationPeriodSummaryDataType {

    @XmlElement(name = "Employee_Probation_Period_Detail_Data")
    protected List<EmployeeProbationPeriodDetailDataType> employeeProbationPeriodDetailData;

    /**
     * Gets the value of the employeeProbationPeriodDetailData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employeeProbationPeriodDetailData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployeeProbationPeriodDetailData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeProbationPeriodDetailDataType }
     * 
     * 
     */
    public List<EmployeeProbationPeriodDetailDataType> getEmployeeProbationPeriodDetailData() {
        if (employeeProbationPeriodDetailData == null) {
            employeeProbationPeriodDetailData = new ArrayList<EmployeeProbationPeriodDetailDataType>();
        }
        return this.employeeProbationPeriodDetailData;
    }

}
