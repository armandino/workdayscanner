
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
 * Contains the dependents covered for the election.
 * 
 * <p>Java class for Dependent_Coverage_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dependent_Coverage_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dependent_Reference" type="{urn:com.workday/bsvc}DependentObjectType" minOccurs="0"/>
 *         &lt;element name="Original_Coverage_Begin_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Coverage_End_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Original_Coverage_Begin_Date_for_Benefit_Coverage_Type" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="First_Date_Covered_by_Benefit_Plan" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="First_Date_Covered_by_Benefit_Provider" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Provider_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COBRA_Eligibility_Data" type="{urn:com.workday/bsvc}COBRA_Eligibility_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dependent_Coverage_DataType", propOrder = {
    "dependentReference",
    "originalCoverageBeginDate",
    "coverageEndDate",
    "originalCoverageBeginDateForBenefitCoverageType",
    "firstDateCoveredByBenefitPlan",
    "firstDateCoveredByBenefitProvider",
    "providerID",
    "cobraEligibilityData"
})
public class DependentCoverageDataType {

    @XmlElement(name = "Dependent_Reference")
    protected DependentObjectType dependentReference;
    @XmlElement(name = "Original_Coverage_Begin_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar originalCoverageBeginDate;
    @XmlElement(name = "Coverage_End_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar coverageEndDate;
    @XmlElement(name = "Original_Coverage_Begin_Date_for_Benefit_Coverage_Type")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar originalCoverageBeginDateForBenefitCoverageType;
    @XmlElement(name = "First_Date_Covered_by_Benefit_Plan")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstDateCoveredByBenefitPlan;
    @XmlElement(name = "First_Date_Covered_by_Benefit_Provider")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstDateCoveredByBenefitProvider;
    @XmlElement(name = "Provider_ID")
    protected String providerID;
    @XmlElement(name = "COBRA_Eligibility_Data")
    protected List<COBRAEligibilityDataType> cobraEligibilityData;

    /**
     * Gets the value of the dependentReference property.
     * 
     * @return
     *     possible object is
     *     {@link DependentObjectType }
     *     
     */
    public DependentObjectType getDependentReference() {
        return dependentReference;
    }

    /**
     * Sets the value of the dependentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DependentObjectType }
     *     
     */
    public void setDependentReference(DependentObjectType value) {
        this.dependentReference = value;
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
     * Gets the value of the firstDateCoveredByBenefitPlan property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstDateCoveredByBenefitPlan() {
        return firstDateCoveredByBenefitPlan;
    }

    /**
     * Sets the value of the firstDateCoveredByBenefitPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstDateCoveredByBenefitPlan(XMLGregorianCalendar value) {
        this.firstDateCoveredByBenefitPlan = value;
    }

    /**
     * Gets the value of the firstDateCoveredByBenefitProvider property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstDateCoveredByBenefitProvider() {
        return firstDateCoveredByBenefitProvider;
    }

    /**
     * Sets the value of the firstDateCoveredByBenefitProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstDateCoveredByBenefitProvider(XMLGregorianCalendar value) {
        this.firstDateCoveredByBenefitProvider = value;
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
     * Gets the value of the cobraEligibilityData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cobraEligibilityData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOBRAEligibilityData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COBRAEligibilityDataType }
     * 
     * 
     */
    public List<COBRAEligibilityDataType> getCOBRAEligibilityData() {
        if (cobraEligibilityData == null) {
            cobraEligibilityData = new ArrayList<COBRAEligibilityDataType>();
        }
        return this.cobraEligibilityData;
    }

}
