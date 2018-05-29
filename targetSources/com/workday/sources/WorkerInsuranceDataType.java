
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the insurance information for an employee.
 * 
 * <p>Java class for Worker_Insurance_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Insurance_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Insurance_Period_Data" type="{urn:com.workday/bsvc}Worker_Insurance_Period_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Insurance_DataType", propOrder = {
    "insurancePeriodData"
})
public class WorkerInsuranceDataType {

    @XmlElement(name = "Insurance_Period_Data")
    protected List<WorkerInsurancePeriodDataType> insurancePeriodData;

    /**
     * Gets the value of the insurancePeriodData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insurancePeriodData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsurancePeriodData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkerInsurancePeriodDataType }
     * 
     * 
     */
    public List<WorkerInsurancePeriodDataType> getInsurancePeriodData() {
        if (insurancePeriodData == null) {
            insurancePeriodData = new ArrayList<WorkerInsurancePeriodDataType>();
        }
        return this.insurancePeriodData;
    }

}
