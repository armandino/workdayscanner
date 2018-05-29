
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the retirement savings election information for the benefit plan year period.
 * 
 * <p>Java class for Retirement_Savings_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Retirement_Savings_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Retirement_Savings_Period_Data" type="{urn:com.workday/bsvc}Worker_Retirement_Savings_Period_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Retirement_Savings_DataType", propOrder = {
    "retirementSavingsPeriodData"
})
public class RetirementSavingsDataType {

    @XmlElement(name = "Retirement_Savings_Period_Data")
    protected List<WorkerRetirementSavingsPeriodDataType> retirementSavingsPeriodData;

    /**
     * Gets the value of the retirementSavingsPeriodData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retirementSavingsPeriodData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetirementSavingsPeriodData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkerRetirementSavingsPeriodDataType }
     * 
     * 
     */
    public List<WorkerRetirementSavingsPeriodDataType> getRetirementSavingsPeriodData() {
        if (retirementSavingsPeriodData == null) {
            retirementSavingsPeriodData = new ArrayList<WorkerRetirementSavingsPeriodDataType>();
        }
        return this.retirementSavingsPeriodData;
    }

}
