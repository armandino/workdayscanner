
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the additional benefits data for an employee.
 * 
 * <p>Java class for Worker_Additional_Benefits_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Additional_Benefits_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Additional_Benefits_Period_Data" type="{urn:com.workday/bsvc}Worker_Additional_Benefits_Period_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Additional_Benefits_DataType", propOrder = {
    "additionalBenefitsPeriodData"
})
public class WorkerAdditionalBenefitsDataType {

    @XmlElement(name = "Additional_Benefits_Period_Data")
    protected List<WorkerAdditionalBenefitsPeriodDataType> additionalBenefitsPeriodData;

    /**
     * Gets the value of the additionalBenefitsPeriodData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalBenefitsPeriodData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalBenefitsPeriodData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkerAdditionalBenefitsPeriodDataType }
     * 
     * 
     */
    public List<WorkerAdditionalBenefitsPeriodDataType> getAdditionalBenefitsPeriodData() {
        if (additionalBenefitsPeriodData == null) {
            additionalBenefitsPeriodData = new ArrayList<WorkerAdditionalBenefitsPeriodDataType>();
        }
        return this.additionalBenefitsPeriodData;
    }

}
