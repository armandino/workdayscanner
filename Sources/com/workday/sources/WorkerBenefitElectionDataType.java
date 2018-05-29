
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The election information for the coverage.
 * 
 * <p>Java class for Worker_Benefit_Election_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Benefit_Election_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Coverage_Begin_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Coverage_End_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Election_Coverage_Begin_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Original_Coverage_Begin_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Original_Coverage_Begin_Date_for_Benefit_Coverage_Type" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Deduction_Begin_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Deduction_End_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Election_Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Enrollment_Signature_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Passive_Enrollment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Benefit_Plan_Summary_Data" type="{urn:com.workday/bsvc}Benefit_Plan_Summary_DataType" minOccurs="0"/>
 *         &lt;element name="Original_Plan_Enrollment_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Original_Benefit_Provider_Enrollment_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Is_Corrected_or_Rescinded" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Benefit_Election_DataType", propOrder = {
    "coverageBeginDate",
    "coverageEndDate",
    "electionCoverageBeginDate",
    "originalCoverageBeginDate",
    "originalCoverageBeginDateForBenefitCoverageType",
    "deductionBeginDate",
    "deductionEndDate",
    "electionStatus",
    "enrollmentSignatureDate",
    "passiveEnrollment",
    "benefitPlanSummaryData",
    "originalPlanEnrollmentDate",
    "originalBenefitProviderEnrollmentDate"
})
public class WorkerBenefitElectionDataType {

    @XmlElement(name = "Coverage_Begin_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar coverageBeginDate;
    @XmlElement(name = "Coverage_End_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar coverageEndDate;
    @XmlElement(name = "Election_Coverage_Begin_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar electionCoverageBeginDate;
    @XmlElement(name = "Original_Coverage_Begin_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar originalCoverageBeginDate;
    @XmlElement(name = "Original_Coverage_Begin_Date_for_Benefit_Coverage_Type")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar originalCoverageBeginDateForBenefitCoverageType;
    @XmlElement(name = "Deduction_Begin_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deductionBeginDate;
    @XmlElement(name = "Deduction_End_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deductionEndDate;
    @XmlElement(name = "Election_Status")
    protected String electionStatus;
    @XmlElement(name = "Enrollment_Signature_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar enrollmentSignatureDate;
    @XmlElement(name = "Passive_Enrollment")
    protected Boolean passiveEnrollment;
    @XmlElement(name = "Benefit_Plan_Summary_Data")
    protected BenefitPlanSummaryDataType benefitPlanSummaryData;
    @XmlElement(name = "Original_Plan_Enrollment_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar originalPlanEnrollmentDate;
    @XmlElement(name = "Original_Benefit_Provider_Enrollment_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar originalBenefitProviderEnrollmentDate;
    @XmlAttribute(name = "Is_Corrected_or_Rescinded", namespace = "urn:com.workday/bsvc")
    protected Boolean isCorrectedOrRescinded;

    /**
     * Gets the value of the coverageBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCoverageBeginDate() {
        return coverageBeginDate;
    }

    /**
     * Sets the value of the coverageBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCoverageBeginDate(XMLGregorianCalendar value) {
        this.coverageBeginDate = value;
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
     * Gets the value of the electionCoverageBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getElectionCoverageBeginDate() {
        return electionCoverageBeginDate;
    }

    /**
     * Sets the value of the electionCoverageBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setElectionCoverageBeginDate(XMLGregorianCalendar value) {
        this.electionCoverageBeginDate = value;
    }

    /**
     * Gets the value of the originalCoverageBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginalCoverageBeginDate() {
        return originalCoverageBeginDate;
    }

    /**
     * Sets the value of the originalCoverageBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginalCoverageBeginDate(XMLGregorianCalendar value) {
        this.originalCoverageBeginDate = value;
    }

    /**
     * Gets the value of the originalCoverageBeginDateForBenefitCoverageType property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginalCoverageBeginDateForBenefitCoverageType() {
        return originalCoverageBeginDateForBenefitCoverageType;
    }

    /**
     * Sets the value of the originalCoverageBeginDateForBenefitCoverageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginalCoverageBeginDateForBenefitCoverageType(XMLGregorianCalendar value) {
        this.originalCoverageBeginDateForBenefitCoverageType = value;
    }

    /**
     * Gets the value of the deductionBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeductionBeginDate() {
        return deductionBeginDate;
    }

    /**
     * Sets the value of the deductionBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeductionBeginDate(XMLGregorianCalendar value) {
        this.deductionBeginDate = value;
    }

    /**
     * Gets the value of the deductionEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeductionEndDate() {
        return deductionEndDate;
    }

    /**
     * Sets the value of the deductionEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeductionEndDate(XMLGregorianCalendar value) {
        this.deductionEndDate = value;
    }

    /**
     * Gets the value of the electionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElectionStatus() {
        return electionStatus;
    }

    /**
     * Sets the value of the electionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectionStatus(String value) {
        this.electionStatus = value;
    }

    /**
     * Gets the value of the enrollmentSignatureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnrollmentSignatureDate() {
        return enrollmentSignatureDate;
    }

    /**
     * Sets the value of the enrollmentSignatureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnrollmentSignatureDate(XMLGregorianCalendar value) {
        this.enrollmentSignatureDate = value;
    }

    /**
     * Gets the value of the passiveEnrollment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPassiveEnrollment() {
        return passiveEnrollment;
    }

    /**
     * Sets the value of the passiveEnrollment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPassiveEnrollment(Boolean value) {
        this.passiveEnrollment = value;
    }

    /**
     * Gets the value of the benefitPlanSummaryData property.
     * 
     * @return
     *     possible object is
     *     {@link BenefitPlanSummaryDataType }
     *     
     */
    public BenefitPlanSummaryDataType getBenefitPlanSummaryData() {
        return benefitPlanSummaryData;
    }

    /**
     * Sets the value of the benefitPlanSummaryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenefitPlanSummaryDataType }
     *     
     */
    public void setBenefitPlanSummaryData(BenefitPlanSummaryDataType value) {
        this.benefitPlanSummaryData = value;
    }

    /**
     * Gets the value of the originalPlanEnrollmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginalPlanEnrollmentDate() {
        return originalPlanEnrollmentDate;
    }

    /**
     * Sets the value of the originalPlanEnrollmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginalPlanEnrollmentDate(XMLGregorianCalendar value) {
        this.originalPlanEnrollmentDate = value;
    }

    /**
     * Gets the value of the originalBenefitProviderEnrollmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginalBenefitProviderEnrollmentDate() {
        return originalBenefitProviderEnrollmentDate;
    }

    /**
     * Sets the value of the originalBenefitProviderEnrollmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginalBenefitProviderEnrollmentDate(XMLGregorianCalendar value) {
        this.originalBenefitProviderEnrollmentDate = value;
    }

    /**
     * Gets the value of the isCorrectedOrRescinded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCorrectedOrRescinded() {
        return isCorrectedOrRescinded;
    }

    /**
     * Sets the value of the isCorrectedOrRescinded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCorrectedOrRescinded(Boolean value) {
        this.isCorrectedOrRescinded = value;
    }

}
