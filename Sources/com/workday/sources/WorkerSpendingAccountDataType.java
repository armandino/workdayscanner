
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the spending account information for an employee.
 * 
 * <p>Java class for Worker_Spending_Account_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Spending_Account_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Spending_Account_Period_Data" type="{urn:com.workday/bsvc}Worker_Spending_Account_Period_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Spending_Account_DataType", propOrder = {
    "spendingAccountPeriodData"
})
public class WorkerSpendingAccountDataType {

    @XmlElement(name = "Spending_Account_Period_Data")
    protected List<WorkerSpendingAccountPeriodDataType> spendingAccountPeriodData;

    /**
     * Gets the value of the spendingAccountPeriodData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spendingAccountPeriodData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpendingAccountPeriodData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkerSpendingAccountPeriodDataType }
     * 
     * 
     */
    public List<WorkerSpendingAccountPeriodDataType> getSpendingAccountPeriodData() {
        if (spendingAccountPeriodData == null) {
            spendingAccountPeriodData = new ArrayList<WorkerSpendingAccountPeriodDataType>();
        }
        return this.spendingAccountPeriodData;
    }

}
