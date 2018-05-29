
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
 * Contains the detailed information for a dependent.
 * 
 * <p>Java class for Dependent_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dependent_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dependent_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Full-time_Student" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Student_Status_Start_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Student_Status_End_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Disabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Inactive_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Dependent_for_Payroll_Purposes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Citizenship_Status_Reference" type="{urn:com.workday/bsvc}Citizenship_StatusObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Country_of_Nationality_Reference" type="{urn:com.workday/bsvc}CountryObjectType" minOccurs="0"/>
 *         &lt;element name="Country_of_Birth_Reference" type="{urn:com.workday/bsvc}CountryObjectType" minOccurs="0"/>
 *         &lt;element name="Region_of_Birth_Reference" type="{urn:com.workday/bsvc}Country_RegionObjectType" minOccurs="0"/>
 *         &lt;element name="City_of_Birth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Court_Order" type="{urn:com.workday/bsvc}Qualified_Domestic_Relations_Order_Replacement_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Lives_With_Worker_Data" type="{urn:com.workday/bsvc}Lives_With_Worker_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Has_Health_Insurance_Data" type="{urn:com.workday/bsvc}Has_Health_Insurance_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Allowed_for_Tax_Deduction_Data" type="{urn:com.workday/bsvc}Allowed_for_Tax_Deduction_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Annual_Income_Data" type="{urn:com.workday/bsvc}Annual_Income_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Occupation_Data" type="{urn:com.workday/bsvc}Occupation_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Disability_Data" type="{urn:com.workday/bsvc}Disability_Information_Data_for_Related_PersonType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dependent_DataType", propOrder = {
    "dependentID",
    "fullTimeStudent",
    "studentStatusStartDate",
    "studentStatusEndDate",
    "disabled",
    "inactiveDate",
    "dependentForPayrollPurposes",
    "citizenshipStatusReference",
    "countryOfNationalityReference",
    "countryOfBirthReference",
    "regionOfBirthReference",
    "cityOfBirth",
    "courtOrder",
    "livesWithWorkerData",
    "hasHealthInsuranceData",
    "allowedForTaxDeductionData",
    "annualIncomeData",
    "occupationData",
    "disabilityData"
})
public class DependentDataType {

    @XmlElement(name = "Dependent_ID")
    protected String dependentID;
    @XmlElement(name = "Full-time_Student")
    protected Boolean fullTimeStudent;
    @XmlElement(name = "Student_Status_Start_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar studentStatusStartDate;
    @XmlElement(name = "Student_Status_End_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar studentStatusEndDate;
    @XmlElement(name = "Disabled")
    protected Boolean disabled;
    @XmlElement(name = "Inactive_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar inactiveDate;
    @XmlElement(name = "Dependent_for_Payroll_Purposes")
    protected Boolean dependentForPayrollPurposes;
    @XmlElement(name = "Citizenship_Status_Reference")
    protected List<CitizenshipStatusObjectType> citizenshipStatusReference;
    @XmlElement(name = "Country_of_Nationality_Reference")
    protected CountryObjectType countryOfNationalityReference;
    @XmlElement(name = "Country_of_Birth_Reference")
    protected CountryObjectType countryOfBirthReference;
    @XmlElement(name = "Region_of_Birth_Reference")
    protected CountryRegionObjectType regionOfBirthReference;
    @XmlElement(name = "City_of_Birth")
    protected String cityOfBirth;
    @XmlElement(name = "Court_Order")
    protected List<QualifiedDomesticRelationsOrderReplacementDataType> courtOrder;
    @XmlElement(name = "Lives_With_Worker_Data")
    protected List<LivesWithWorkerDataType> livesWithWorkerData;
    @XmlElement(name = "Has_Health_Insurance_Data")
    protected List<HasHealthInsuranceDataType> hasHealthInsuranceData;
    @XmlElement(name = "Allowed_for_Tax_Deduction_Data")
    protected List<AllowedForTaxDeductionDataType> allowedForTaxDeductionData;
    @XmlElement(name = "Annual_Income_Data")
    protected List<AnnualIncomeDataType> annualIncomeData;
    @XmlElement(name = "Occupation_Data")
    protected List<OccupationDataType> occupationData;
    @XmlElement(name = "Disability_Data")
    protected List<DisabilityInformationDataForRelatedPersonType> disabilityData;

    /**
     * Gets the value of the dependentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDependentID() {
        return dependentID;
    }

    /**
     * Sets the value of the dependentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDependentID(String value) {
        this.dependentID = value;
    }

    /**
     * Gets the value of the fullTimeStudent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFullTimeStudent() {
        return fullTimeStudent;
    }

    /**
     * Sets the value of the fullTimeStudent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFullTimeStudent(Boolean value) {
        this.fullTimeStudent = value;
    }

    /**
     * Gets the value of the studentStatusStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStudentStatusStartDate() {
        return studentStatusStartDate;
    }

    /**
     * Sets the value of the studentStatusStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStudentStatusStartDate(XMLGregorianCalendar value) {
        this.studentStatusStartDate = value;
    }

    /**
     * Gets the value of the studentStatusEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStudentStatusEndDate() {
        return studentStatusEndDate;
    }

    /**
     * Sets the value of the studentStatusEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStudentStatusEndDate(XMLGregorianCalendar value) {
        this.studentStatusEndDate = value;
    }

    /**
     * Gets the value of the disabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisabled() {
        return disabled;
    }

    /**
     * Sets the value of the disabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisabled(Boolean value) {
        this.disabled = value;
    }

    /**
     * Gets the value of the inactiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInactiveDate() {
        return inactiveDate;
    }

    /**
     * Sets the value of the inactiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInactiveDate(XMLGregorianCalendar value) {
        this.inactiveDate = value;
    }

    /**
     * Gets the value of the dependentForPayrollPurposes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDependentForPayrollPurposes() {
        return dependentForPayrollPurposes;
    }

    /**
     * Sets the value of the dependentForPayrollPurposes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDependentForPayrollPurposes(Boolean value) {
        this.dependentForPayrollPurposes = value;
    }

    /**
     * Gets the value of the citizenshipStatusReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the citizenshipStatusReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCitizenshipStatusReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CitizenshipStatusObjectType }
     * 
     * 
     */
    public List<CitizenshipStatusObjectType> getCitizenshipStatusReference() {
        if (citizenshipStatusReference == null) {
            citizenshipStatusReference = new ArrayList<CitizenshipStatusObjectType>();
        }
        return this.citizenshipStatusReference;
    }

    /**
     * Gets the value of the countryOfNationalityReference property.
     * 
     * @return
     *     possible object is
     *     {@link CountryObjectType }
     *     
     */
    public CountryObjectType getCountryOfNationalityReference() {
        return countryOfNationalityReference;
    }

    /**
     * Sets the value of the countryOfNationalityReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryObjectType }
     *     
     */
    public void setCountryOfNationalityReference(CountryObjectType value) {
        this.countryOfNationalityReference = value;
    }

    /**
     * Gets the value of the countryOfBirthReference property.
     * 
     * @return
     *     possible object is
     *     {@link CountryObjectType }
     *     
     */
    public CountryObjectType getCountryOfBirthReference() {
        return countryOfBirthReference;
    }

    /**
     * Sets the value of the countryOfBirthReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryObjectType }
     *     
     */
    public void setCountryOfBirthReference(CountryObjectType value) {
        this.countryOfBirthReference = value;
    }

    /**
     * Gets the value of the regionOfBirthReference property.
     * 
     * @return
     *     possible object is
     *     {@link CountryRegionObjectType }
     *     
     */
    public CountryRegionObjectType getRegionOfBirthReference() {
        return regionOfBirthReference;
    }

    /**
     * Sets the value of the regionOfBirthReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryRegionObjectType }
     *     
     */
    public void setRegionOfBirthReference(CountryRegionObjectType value) {
        this.regionOfBirthReference = value;
    }

    /**
     * Gets the value of the cityOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityOfBirth() {
        return cityOfBirth;
    }

    /**
     * Sets the value of the cityOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityOfBirth(String value) {
        this.cityOfBirth = value;
    }

    /**
     * Gets the value of the courtOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the courtOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCourtOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedDomesticRelationsOrderReplacementDataType }
     * 
     * 
     */
    public List<QualifiedDomesticRelationsOrderReplacementDataType> getCourtOrder() {
        if (courtOrder == null) {
            courtOrder = new ArrayList<QualifiedDomesticRelationsOrderReplacementDataType>();
        }
        return this.courtOrder;
    }

    /**
     * Gets the value of the livesWithWorkerData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the livesWithWorkerData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLivesWithWorkerData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LivesWithWorkerDataType }
     * 
     * 
     */
    public List<LivesWithWorkerDataType> getLivesWithWorkerData() {
        if (livesWithWorkerData == null) {
            livesWithWorkerData = new ArrayList<LivesWithWorkerDataType>();
        }
        return this.livesWithWorkerData;
    }

    /**
     * Gets the value of the hasHealthInsuranceData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hasHealthInsuranceData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHasHealthInsuranceData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HasHealthInsuranceDataType }
     * 
     * 
     */
    public List<HasHealthInsuranceDataType> getHasHealthInsuranceData() {
        if (hasHealthInsuranceData == null) {
            hasHealthInsuranceData = new ArrayList<HasHealthInsuranceDataType>();
        }
        return this.hasHealthInsuranceData;
    }

    /**
     * Gets the value of the allowedForTaxDeductionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedForTaxDeductionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedForTaxDeductionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowedForTaxDeductionDataType }
     * 
     * 
     */
    public List<AllowedForTaxDeductionDataType> getAllowedForTaxDeductionData() {
        if (allowedForTaxDeductionData == null) {
            allowedForTaxDeductionData = new ArrayList<AllowedForTaxDeductionDataType>();
        }
        return this.allowedForTaxDeductionData;
    }

    /**
     * Gets the value of the annualIncomeData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annualIncomeData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnualIncomeData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnnualIncomeDataType }
     * 
     * 
     */
    public List<AnnualIncomeDataType> getAnnualIncomeData() {
        if (annualIncomeData == null) {
            annualIncomeData = new ArrayList<AnnualIncomeDataType>();
        }
        return this.annualIncomeData;
    }

    /**
     * Gets the value of the occupationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the occupationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOccupationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OccupationDataType }
     * 
     * 
     */
    public List<OccupationDataType> getOccupationData() {
        if (occupationData == null) {
            occupationData = new ArrayList<OccupationDataType>();
        }
        return this.occupationData;
    }

    /**
     * Gets the value of the disabilityData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disabilityData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisabilityData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisabilityInformationDataForRelatedPersonType }
     * 
     * 
     */
    public List<DisabilityInformationDataForRelatedPersonType> getDisabilityData() {
        if (disabilityData == null) {
            disabilityData = new ArrayList<DisabilityInformationDataForRelatedPersonType>();
        }
        return this.disabilityData;
    }

}
