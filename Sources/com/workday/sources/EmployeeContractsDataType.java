
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the employee's contract information.
 * 
 * <p>Java class for Employee_Contracts_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employee_Contracts_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Employee_Contract_Data" type="{urn:com.workday/bsvc}Employee_Contract_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employee_Contracts_DataType", propOrder = {
    "employeeContractData"
})
public class EmployeeContractsDataType {

    @XmlElement(name = "Employee_Contract_Data")
    protected List<EmployeeContractDataType> employeeContractData;

    /**
     * Gets the value of the employeeContractData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employeeContractData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployeeContractData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeContractDataType }
     * 
     * 
     */
    public List<EmployeeContractDataType> getEmployeeContractData() {
        if (employeeContractData == null) {
            employeeContractData = new ArrayList<EmployeeContractDataType>();
        }
        return this.employeeContractData;
    }

}
