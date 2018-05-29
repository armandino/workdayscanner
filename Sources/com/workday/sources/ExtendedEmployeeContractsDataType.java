
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the extended employee's contract information.
 * 
 * <p>Java class for Extended_Employee_Contracts_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Extended_Employee_Contracts_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Extended_Employee_Contract_Data" type="{urn:com.workday/bsvc}Extended_Employee_Contract_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Extended_Employee_Contracts_DataType", propOrder = {
    "extendedEmployeeContractData"
})
public class ExtendedEmployeeContractsDataType {

    @XmlElement(name = "Extended_Employee_Contract_Data")
    protected List<ExtendedEmployeeContractDataType> extendedEmployeeContractData;

    /**
     * Gets the value of the extendedEmployeeContractData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extendedEmployeeContractData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtendedEmployeeContractData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtendedEmployeeContractDataType }
     * 
     * 
     */
    public List<ExtendedEmployeeContractDataType> getExtendedEmployeeContractData() {
        if (extendedEmployeeContractData == null) {
            extendedEmployeeContractData = new ArrayList<ExtendedEmployeeContractDataType>();
        }
        return this.extendedEmployeeContractData;
    }

}
