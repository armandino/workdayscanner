
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
 * Contains the health care coverage information (elections) for an employee.
 * 
 * <p>Java class for Worker_Health_Care_Coverage_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Health_Care_Coverage_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Health_Care_Coverage_Target_Reference" type="{urn:com.workday/bsvc}Health_Care_Coverage_TargetObjectType" minOccurs="0"/>
 *         &lt;element name="Original_Coverage_Begin_Date_for_Coverage_Target" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Provider_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Benefit_Election_Data" type="{urn:com.workday/bsvc}Worker_Benefit_Election_DataType" minOccurs="0"/>
 *         &lt;element name="Dependent_Coverage_Data" type="{urn:com.workday/bsvc}Dependent_Coverage_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Health_Care_Coverage_DataType", propOrder = {
    "healthCareCoverageTargetReference",
    "originalCoverageBeginDateForCoverageTarget",
    "providerID",
    "benefitElectionData",
    "dependentCoverageData"
})
public class WorkerHealthCareCoverageDataType {

    @XmlElement(name = "Health_Care_Coverage_Target_Reference")
    protected HealthCareCoverageTargetObjectType healthCareCoverageTargetReference;
    @XmlElement(name = "Original_Coverage_Begin_Date_for_Coverage_Target")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar originalCoverageBeginDateForCoverageTarget;
    @XmlElement(name = "Provider_ID")
    protected String providerID;
    @XmlElement(name = "Benefit_Election_Data")
    protected WorkerBenefitElectionDataType benefitElectionData;
    @XmlElement(name = "Dependent_Coverage_Data")
    protected List<DependentCoverageDataType> dependentCoverageData;

    /**
     * Gets the value of the healthCareCoverageTargetReference property.
     * 
     * @return
     *     possible object is
     *     {@link HealthCareCoverageTargetObjectType }
     *     
     */
    public HealthCareCoverageTargetObjectType getHealthCareCoverageTargetReference() {
        return healthCareCoverageTargetReference;
    }

    /**
     * Sets the value of the healthCareCoverageTargetReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthCareCoverageTargetObjectType }
     *     
     */
    public void setHealthCareCoverageTargetReference(HealthCareCoverageTargetObjectType value) {
        this.healthCareCoverageTargetReference = value;
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
     * Gets the value of the providerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderID() {
        return providerID;
    }

    /**
     * Sets the value of the providerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderID(String value) {
        this.providerID = value;
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
     * Gets the value of the dependentCoverageData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dependentCoverageData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDependentCoverageData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DependentCoverageDataType }
     * 
     * 
     */
    public List<DependentCoverageDataType> getDependentCoverageData() {
        if (dependentCoverageData == null) {
            dependentCoverageData = new ArrayList<DependentCoverageDataType>();
        }
        return this.dependentCoverageData;
    }

}
