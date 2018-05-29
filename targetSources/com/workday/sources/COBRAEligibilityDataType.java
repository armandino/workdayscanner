
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Contains COBRA Eligibility detail for a participant.  If this element is not populated then the participant is assumed to not be COBRA eligible.
 * 
 * <p>Java class for COBRA_Eligibility_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COBRA_Eligibility_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COBRA_Eligibility_Reason_Reference" type="{urn:com.workday/bsvc}COBRA_Eligibility_ReasonObjectType" minOccurs="0"/>
 *         &lt;element name="Eligible_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Loss_of_Coverage_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Coverage_End_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Benefit_Plan_Reference" type="{urn:com.workday/bsvc}Benefit_PlanObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COBRA_Eligibility_DataType", propOrder = {
    "cobraEligibilityReasonReference",
    "eligibleDate",
    "lossOfCoverageDate",
    "coverageEndDate",
    "benefitPlanReference"
})
public class COBRAEligibilityDataType {

    @XmlElement(name = "COBRA_Eligibility_Reason_Reference")
    protected COBRAEligibilityReasonObjectType cobraEligibilityReasonReference;
    @XmlElement(name = "Eligible_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eligibleDate;
    @XmlElement(name = "Loss_of_Coverage_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lossOfCoverageDate;
    @XmlElement(name = "Coverage_End_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar coverageEndDate;
    @XmlElement(name = "Benefit_Plan_Reference")
    protected BenefitPlanObjectType benefitPlanReference;

    /**
     * Gets the value of the cobraEligibilityReasonReference property.
     * 
     * @return
     *     possible object is
     *     {@link COBRAEligibilityReasonObjectType }
     *     
     */
    public COBRAEligibilityReasonObjectType getCOBRAEligibilityReasonReference() {
        return cobraEligibilityReasonReference;
    }

    /**
     * Sets the value of the cobraEligibilityReasonReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link COBRAEligibilityReasonObjectType }
     *     
     */
    public void setCOBRAEligibilityReasonReference(COBRAEligibilityReasonObjectType value) {
        this.cobraEligibilityReasonReference = value;
    }

    /**
     * Gets the value of the eligibleDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEligibleDate() {
        return eligibleDate;
    }

    /**
     * Sets the value of the eligibleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEligibleDate(XMLGregorianCalendar value) {
        this.eligibleDate = value;
    }

    /**
     * Gets the value of the lossOfCoverageDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLossOfCoverageDate() {
        return lossOfCoverageDate;
    }

    /**
     * Sets the value of the lossOfCoverageDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLossOfCoverageDate(XMLGregorianCalendar value) {
        this.lossOfCoverageDate = value;
    }

    /**
     * Gets the value of the coverageEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCoverageEndDate() {
        return coverageEndDate;
    }

    /**
     * Sets the value of the coverageEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCoverageEndDate(XMLGregorianCalendar value) {
        this.coverageEndDate = value;
    }

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

}
