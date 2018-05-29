
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the plans that the worker is eligible for
 * 
 * <p>Java class for Worker_Benefit_Eligibility_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Benefit_Eligibility_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Benefit_Plan_Reference" type="{urn:com.workday/bsvc}Benefit_PlanObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Plan_Eligibility_Dates_Data" type="{urn:com.workday/bsvc}Plan_Eligiblity_Dates_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Benefit_Eligibility_DataType", propOrder = {
    "benefitPlanReference",
    "planEligibilityDatesData"
})
public class WorkerBenefitEligibilityDataType {

    @XmlElement(name = "Benefit_Plan_Reference")
    protected List<BenefitPlanObjectType> benefitPlanReference;
    @XmlElement(name = "Plan_Eligibility_Dates_Data")
    protected List<PlanEligiblityDatesDataType> planEligibilityDatesData;

    /**
     * Gets the value of the benefitPlanReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the benefitPlanReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBenefitPlanReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BenefitPlanObjectType }
     * 
     * 
     */
    public List<BenefitPlanObjectType> getBenefitPlanReference() {
        if (benefitPlanReference == null) {
            benefitPlanReference = new ArrayList<BenefitPlanObjectType>();
        }
        return this.benefitPlanReference;
    }

    /**
     * Gets the value of the planEligibilityDatesData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the planEligibilityDatesData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlanEligibilityDatesData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlanEligiblityDatesDataType }
     * 
     * 
     */
    public List<PlanEligiblityDatesDataType> getPlanEligibilityDatesData() {
        if (planEligibilityDatesData == null) {
            planEligibilityDatesData = new ArrayList<PlanEligiblityDatesDataType>();
        }
        return this.planEligibilityDatesData;
    }

}
