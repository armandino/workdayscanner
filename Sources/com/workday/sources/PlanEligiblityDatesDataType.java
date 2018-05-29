
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Information about the Earliest and Earliest Contiguous Eligiblility Dates for Retirement Plans which are Part of a Plan Year
 * 
 * <p>Java class for Plan_Eligiblity_Dates_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Plan_Eligiblity_Dates_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Benefit_Plan_Reference" type="{urn:com.workday/bsvc}Benefit_PlanObjectType" minOccurs="0"/>
 *         &lt;element name="Earliest_Eligibility_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Earliest_Contiguous_Eligibility_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Plan_Eligiblity_Dates_DataType", propOrder = {
    "benefitPlanReference",
    "earliestEligibilityDate",
    "earliestContiguousEligibilityDate"
})
public class PlanEligiblityDatesDataType {

    @XmlElement(name = "Benefit_Plan_Reference")
    protected BenefitPlanObjectType benefitPlanReference;
    @XmlElement(name = "Earliest_Eligibility_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar earliestEligibilityDate;
    @XmlElement(name = "Earliest_Contiguous_Eligibility_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar earliestContiguousEligibilityDate;

    /**
     * Gets the value of the benefitPlanReference property.
     * 
     * @return
     *     possible object is
     *     {@link BenefitPlanObjectType }
     *     
     */
    public BenefitPlanObjectType getBenefitPlanReference() {
        return benefitPlanReference;
    }

    /**
     * Sets the value of the benefitPlanReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenefitPlanObjectType }
     *     
     */
    public void setBenefitPlanReference(BenefitPlanObjectType value) {
        this.benefitPlanReference = value;
    }

    /**
     * Gets the value of the earliestEligibilityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestEligibilityDate() {
        return earliestEligibilityDate;
    }

    /**
     * Sets the value of the earliestEligibilityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarliestEligibilityDate(XMLGregorianCalendar value) {
        this.earliestEligibilityDate = value;
    }

    /**
     * Gets the value of the earliestContiguousEligibilityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestContiguousEligibilityDate() {
        return earliestContiguousEligibilityDate;
    }

    /**
     * Sets the value of the earliestContiguousEligibilityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarliestContiguousEligibilityDate(XMLGregorianCalendar value) {
        this.earliestContiguousEligibilityDate = value;
    }

}
