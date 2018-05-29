
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the health care data for an employee.
 * 
 * <p>Java class for Worker_Health_Care_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Health_Care_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Health_Care_Period_Data" type="{urn:com.workday/bsvc}Worker_Health_Care_Period_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Health_Care_DataType", propOrder = {
    "healthCarePeriodData"
})
public class WorkerHealthCareDataType {

    @XmlElement(name = "Health_Care_Period_Data")
    protected List<WorkerHealthCarePeriodDataType> healthCarePeriodData;

    /**
     * Gets the value of the healthCarePeriodData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the healthCarePeriodData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHealthCarePeriodData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkerHealthCarePeriodDataType }
     * 
     * 
     */
    public List<WorkerHealthCarePeriodDataType> getHealthCarePeriodData() {
        if (healthCarePeriodData == null) {
            healthCarePeriodData = new ArrayList<WorkerHealthCarePeriodDataType>();
        }
        return this.healthCarePeriodData;
    }

}
