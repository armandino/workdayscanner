
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Contains the additional benefits coverage information (elections) for an employee.
 * 
 * <p>Java class for Worker_Additional_Benefits_Coverage_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Additional_Benefits_Coverage_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Additional_Benefits_Coverage_Target_Reference" type="{urn:com.workday/bsvc}Additional_Benefits_Coverage_TargetObjectType" minOccurs="0"/>
 *         &lt;element name="Original_Coverage_Begin_Date_for_Coverage_Target" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Benefit_Election_Data" type="{urn:com.workday/bsvc}Worker_Benefit_Election_DataType" minOccurs="0"/>
 *         &lt;element name="Percent_Contribution_Data" type="{urn:com.workday/bsvc}Employee_Contribution_Percentage_DataType" minOccurs="0"/>
 *         &lt;element name="Amount_Contribution_Data" type="{urn:com.workday/bsvc}Employee_Contribution_Amount_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Additional_Benefits_Coverage_DataType", propOrder = {
    "additionalBenefitsCoverageTargetReference",
    "originalCoverageBeginDateForCoverageTarget",
    "benefitElectionData",
    "percentContributionData",
    "amountContributionData"
})
public class WorkerAdditionalBenefitsCoverageDataType {

    @XmlElement(name = "Additional_Benefits_Coverage_Target_Reference")
    protected AdditionalBenefitsCoverageTargetObjectType additionalBenefitsCoverageTargetReference;
    @XmlElement(name = "Original_Coverage_Begin_Date_for_Coverage_Target")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar originalCoverageBeginDateForCoverageTarget;
    @XmlElement(name = "Benefit_Election_Data")
    protected WorkerBenefitElectionDataType benefitElectionData;
    @XmlElement(name = "Percent_Contribution_Data")
    protected EmployeeContributionPercentageDataType percentContributionData;
    @XmlElement(name = "Amount_Contribution_Data")
    protected List<EmployeeContributionAmountDataType> amountContributionData;

    /**
     * Gets the value of the additionalBenefitsCoverageTargetReference property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalBenefitsCoverageTargetObjectType }
     *     
     */
    public AdditionalBenefitsCoverageTargetObjectType getAdditionalBenefitsCoverageTargetReference() {
        return additionalBenefitsCoverageTargetReference;
    }

    /**
     * Sets the value of the additionalBenefitsCoverageTargetReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalBenefitsCoverageTargetObjectType }
     *     
     */
    public void setAdditionalBenefitsCoverageTargetReference(AdditionalBenefitsCoverageTargetObjectType value) {
        this.additionalBenefitsCoverageTargetReference = value;
    }

    /**
     * Gets the value of the originalCoverageBeginDateForCoverageTarget property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginalCoverageBeginDateForCoverageTarget() {
        return originalCoverageBeginDateForCoverageTarget;
    }

    /**
     * Sets the value of the originalCoverageBeginDateForCoverageTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginalCoverageBeginDateForCoverageTarget(XMLGregorianCalendar value) {
        this.originalCoverageBeginDateForCoverageTarget = value;
    }

    /**
     * Gets the value of the benefitElectionData property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerBenefitElectionDataType }
     *     
     */
    public WorkerBenefitElectionDataType getBenefitElectionData() {
        return benefitElectionData;
    }

    /**
     * Sets the value of the benefitElectionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerBenefitElectionDataType }
     *     
     */
    public void setBenefitElectionData(WorkerBenefitElectionDataType value) {
        this.benefitElectionData = value;
    }

    /**
     * Gets the value of the percentContributionData property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeContributionPercentageDataType }
     *     
     */
    public EmployeeContributionPercentageDataType getPercentContributionData() {
        return percentContributionData;
    }

    /**
     * Sets the value of the percentContributionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeContributionPercentageDataType }
     *     
     */
    public void setPercentContributionData(EmployeeContributionPercentageDataType value) {
        this.percentContributionData = value;
    }

    /**
     * Gets the value of the amountContributionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amountContributionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmountContributionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeContributionAmountDataType }
     * 
     * 
     */
    public List<EmployeeContributionAmountDataType> getAmountContributionData() {
        if (amountContributionData == null) {
            amountContributionData = new ArrayList<EmployeeContributionAmountDataType>();
        }
        return this.amountContributionData;
    }

}
