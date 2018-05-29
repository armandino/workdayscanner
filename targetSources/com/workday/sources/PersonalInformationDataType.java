
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
 * Wrapper element for Personal Data.
 * 
 * <p>Java class for Personal_Information_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Personal_Information_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Universal_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name_Data" type="{urn:com.workday/bsvc}Person_Name_DataType" minOccurs="0"/>
 *         &lt;element name="Gender_Reference" type="{urn:com.workday/bsvc}GenderObjectType" minOccurs="0"/>
 *         &lt;element name="Birth_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Date_of_Death" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Country_of_Birth_Reference" type="{urn:com.workday/bsvc}CountryObjectType" minOccurs="0"/>
 *         &lt;element name="Region_of_Birth_Reference" type="{urn:com.workday/bsvc}Country_RegionObjectType" minOccurs="0"/>
 *         &lt;element name="Region_of_Birth_Descriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City_of_Birth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Marital_Status_Reference" type="{urn:com.workday/bsvc}Marital_StatusObjectType" minOccurs="0"/>
 *         &lt;element name="Marital_Status_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Religion_Reference" type="{urn:com.workday/bsvc}ReligionObjectType" minOccurs="0"/>
 *         &lt;element name="Disability_Status_Data" type="{urn:com.workday/bsvc}Person_Disability_Status_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Ethnicity_Reference" type="{urn:com.workday/bsvc}EthnicityObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Hispanic_or_Latino" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Citizenship_Status_Reference" type="{urn:com.workday/bsvc}Citizenship_StatusObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Primary_Nationality_Reference" type="{urn:com.workday/bsvc}CountryObjectType" minOccurs="0"/>
 *         &lt;element name="Additional_Nationality_Reference" type="{urn:com.workday/bsvc}CountryObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Hukou_Region_Reference" type="{urn:com.workday/bsvc}Country_RegionObjectType" minOccurs="0"/>
 *         &lt;element name="Hukou_Subregion_Reference" type="{urn:com.workday/bsvc}Country_SubregionObjectType" minOccurs="0"/>
 *         &lt;element name="Hukou_Locality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hukou_Postal_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hukou_Type_Reference" type="{urn:com.workday/bsvc}Hukou_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Local_Hukou" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Native_Region_Reference" type="{urn:com.workday/bsvc}Country_RegionObjectType" minOccurs="0"/>
 *         &lt;element name="Native_Region_Descriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Personnel_File_Agency_for_Person" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Last_Medical_Exam_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Last_Medical_Exam_Valid_To" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Medical_Exam_Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Blood_Type_Reference" type="{urn:com.workday/bsvc}Blood_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Military_Service_Data" type="{urn:com.workday/bsvc}Person_Military_Service_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Identification_Data" type="{urn:com.workday/bsvc}Person_Identification_DataType" minOccurs="0"/>
 *         &lt;element name="Contact_Data" type="{urn:com.workday/bsvc}Contact_Information_DataType" minOccurs="0"/>
 *         &lt;element name="Tobacco_Use" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Political_Affiliation_Reference" type="{urn:com.workday/bsvc}Political_AffiliationObjectType" minOccurs="0"/>
 *         &lt;element name="Social_Benefits_Locality_Reference" type="{urn:com.workday/bsvc}Social_Benefits_LocalityObjectType" minOccurs="0"/>
 *         &lt;element name="Relative_Name_Information_Data" type="{urn:com.workday/bsvc}Relative_Name_Information_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Personal_Information_DataType", propOrder = {
    "universalID",
    "nameData",
    "genderReference",
    "birthDate",
    "dateOfDeath",
    "countryOfBirthReference",
    "regionOfBirthReference",
    "regionOfBirthDescriptor",
    "cityOfBirth",
    "maritalStatusReference",
    "maritalStatusDate",
    "religionReference",
    "disabilityStatusData",
    "ethnicityReference",
    "hispanicOrLatino",
    "citizenshipStatusReference",
    "primaryNationalityReference",
    "additionalNationalityReference",
    "hukouRegionReference",
    "hukouSubregionReference",
    "hukouLocality",
    "hukouPostalCode",
    "hukouTypeReference",
    "localHukou",
    "nativeRegionReference",
    "nativeRegionDescriptor",
    "personnelFileAgencyForPerson",
    "lastMedicalExamDate",
    "lastMedicalExamValidTo",
    "medicalExamNotes",
    "bloodTypeReference",
    "militaryServiceData",
    "identificationData",
    "contactData",
    "tobaccoUse",
    "politicalAffiliationReference",
    "socialBenefitsLocalityReference",
    "relativeNameInformationData"
})
public class PersonalInformationDataType {

    @XmlElement(name = "Universal_ID")
    protected String universalID;
    @XmlElement(name = "Name_Data")
    protected PersonNameDataType nameData;
    @XmlElement(name = "Gender_Reference")
    protected GenderObjectType genderReference;
    @XmlElement(name = "Birth_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    @XmlElement(name = "Date_of_Death")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfDeath;
    @XmlElement(name = "Country_of_Birth_Reference")
    protected CountryObjectType countryOfBirthReference;
    @XmlElement(name = "Region_of_Birth_Reference")
    protected CountryRegionObjectType regionOfBirthReference;
    @XmlElement(name = "Region_of_Birth_Descriptor")
    protected String regionOfBirthDescriptor;
    @XmlElement(name = "City_of_Birth")
    protected String cityOfBirth;
    @XmlElement(name = "Marital_Status_Reference")
    protected MaritalStatusObjectType maritalStatusReference;
    @XmlElement(name = "Marital_Status_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar maritalStatusDate;
    @XmlElement(name = "Religion_Reference")
    protected ReligionObjectType religionReference;
    @XmlElement(name = "Disability_Status_Data")
    protected List<PersonDisabilityStatusDataType> disabilityStatusData;
    @XmlElement(name = "Ethnicity_Reference")
    protected List<EthnicityObjectType> ethnicityReference;
    @XmlElement(name = "Hispanic_or_Latino")
    protected Boolean hispanicOrLatino;
    @XmlElement(name = "Citizenship_Status_Reference")
    protected List<CitizenshipStatusObjectType> citizenshipStatusReference;
    @XmlElement(name = "Primary_Nationality_Reference")
    protected CountryObjectType primaryNationalityReference;
    @XmlElement(name = "Additional_Nationality_Reference")
    protected List<CountryObjectType> additionalNationalityReference;
    @XmlElement(name = "Hukou_Region_Reference")
    protected CountryRegionObjectType hukouRegionReference;
    @XmlElement(name = "Hukou_Subregion_Reference")
    protected CountrySubregionObjectType hukouSubregionReference;
    @XmlElement(name = "Hukou_Locality")
    protected String hukouLocality;
    @XmlElement(name = "Hukou_Postal_Code")
    protected String hukouPostalCode;
    @XmlElement(name = "Hukou_Type_Reference")
    protected HukouTypeObjectType hukouTypeReference;
    @XmlElement(name = "Local_Hukou")
    protected Boolean localHukou;
    @XmlElement(name = "Native_Region_Reference")
    protected CountryRegionObjectType nativeRegionReference;
    @XmlElement(name = "Native_Region_Descriptor")
    protected String nativeRegionDescriptor;
    @XmlElement(name = "Personnel_File_Agency_for_Person")
    protected String personnelFileAgencyForPerson;
    @XmlElement(name = "Last_Medical_Exam_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastMedicalExamDate;
    @XmlElement(name = "Last_Medical_Exam_Valid_To")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastMedicalExamValidTo;
    @XmlElement(name = "Medical_Exam_Notes")
    protected String medicalExamNotes;
    @XmlElement(name = "Blood_Type_Reference")
    protected BloodTypeObjectType bloodTypeReference;
    @XmlElement(name = "Military_Service_Data")
    protected List<PersonMilitaryServiceDataType> militaryServiceData;
    @XmlElement(name = "Identification_Data")
    protected PersonIdentificationDataType identificationData;
    @XmlElement(name = "Contact_Data")
    protected ContactInformationDataType contactData;
    @XmlElement(name = "Tobacco_Use")
    protected Boolean tobaccoUse;
    @XmlElement(name = "Political_Affiliation_Reference")
    protected PoliticalAffiliationObjectType politicalAffiliationReference;
    @XmlElement(name = "Social_Benefits_Locality_Reference")
    protected SocialBenefitsLocalityObjectType socialBenefitsLocalityReference;
    @XmlElement(name = "Relative_Name_Information_Data")
    protected RelativeNameInformationDataType relativeNameInformationData;

    /**
     * Gets the value of the universalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversalID() {
        return universalID;
    }

    /**
     * Sets the value of the universalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversalID(String value) {
        this.universalID = value;
    }

    /**
     * Gets the value of the nameData property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameDataType }
     *     
     */
    public PersonNameDataType getNameData() {
        return nameData;
    }

    /**
     * Sets the value of the nameData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameDataType }
     *     
     */
    public void setNameData(PersonNameDataType value) {
        this.nameData = value;
    }

    /**
     * Gets the value of the genderReference property.
     * 
     * @return
     *     possible object is
     *     {@link GenderObjectType }
     *     
     */
    public GenderObjectType getGenderReference() {
        return genderReference;
    }

    /**
     * Sets the value of the genderReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderObjectType }
     *     
     */
    public void setGenderReference(GenderObjectType value) {
        this.genderReference = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the dateOfDeath property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfDeath() {
        return dateOfDeath;
    }

    /**
     * Sets the value of the dateOfDeath property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfDeath(XMLGregorianCalendar value) {
        this.dateOfDeath = value;
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
     * Gets the value of the regionOfBirthDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionOfBirthDescriptor() {
        return regionOfBirthDescriptor;
    }

    /**
     * Sets the value of the regionOfBirthDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionOfBirthDescriptor(String value) {
        this.regionOfBirthDescriptor = value;
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
     * Gets the value of the maritalStatusReference property.
     * 
     * @return
     *     possible object is
     *     {@link MaritalStatusObjectType }
     *     
     */
    public MaritalStatusObjectType getMaritalStatusReference() {
        return maritalStatusReference;
    }

    /**
     * Sets the value of the maritalStatusReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaritalStatusObjectType }
     *     
     */
    public void setMaritalStatusReference(MaritalStatusObjectType value) {
        this.maritalStatusReference = value;
    }

    /**
     * Gets the value of the maritalStatusDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaritalStatusDate() {
        return maritalStatusDate;
    }

    /**
     * Sets the value of the maritalStatusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaritalStatusDate(XMLGregorianCalendar value) {
        this.maritalStatusDate = value;
    }

    /**
     * Gets the value of the religionReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReligionObjectType }
     *     
     */
    public ReligionObjectType getReligionReference() {
        return religionReference;
    }

    /**
     * Sets the value of the religionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReligionObjectType }
     *     
     */
    public void setReligionReference(ReligionObjectType value) {
        this.religionReference = value;
    }

    /**
     * Gets the value of the disabilityStatusData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disabilityStatusData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisabilityStatusData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonDisabilityStatusDataType }
     * 
     * 
     */
    public List<PersonDisabilityStatusDataType> getDisabilityStatusData() {
        if (disabilityStatusData == null) {
            disabilityStatusData = new ArrayList<PersonDisabilityStatusDataType>();
        }
        return this.disabilityStatusData;
    }

    /**
     * Gets the value of the ethnicityReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ethnicityReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEthnicityReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EthnicityObjectType }
     * 
     * 
     */
    public List<EthnicityObjectType> getEthnicityReference() {
        if (ethnicityReference == null) {
            ethnicityReference = new ArrayList<EthnicityObjectType>();
        }
        return this.ethnicityReference;
    }

    /**
     * Gets the value of the hispanicOrLatino property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHispanicOrLatino() {
        return hispanicOrLatino;
    }

    /**
     * Sets the value of the hispanicOrLatino property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHispanicOrLatino(Boolean value) {
        this.hispanicOrLatino = value;
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
     * Gets the value of the primaryNationalityReference property.
     * 
     * @return
     *     possible object is
     *     {@link CountryObjectType }
     *     
     */
    public CountryObjectType getPrimaryNationalityReference() {
        return primaryNationalityReference;
    }

    /**
     * Sets the value of the primaryNationalityReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryObjectType }
     *     
     */
    public void setPrimaryNationalityReference(CountryObjectType value) {
        this.primaryNationalityReference = value;
    }

    /**
     * Gets the value of the additionalNationalityReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalNationalityReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalNationalityReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryObjectType }
     * 
     * 
     */
    public List<CountryObjectType> getAdditionalNationalityReference() {
        if (additionalNationalityReference == null) {
            additionalNationalityReference = new ArrayList<CountryObjectType>();
        }
        return this.additionalNationalityReference;
    }

    /**
     * Gets the value of the hukouRegionReference property.
     * 
     * @return
     *     possible object is
     *     {@link CountryRegionObjectType }
     *     
     */
    public CountryRegionObjectType getHukouRegionReference() {
        return hukouRegionReference;
    }

    /**
     * Sets the value of the hukouRegionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryRegionObjectType }
     *     
     */
    public void setHukouRegionReference(CountryRegionObjectType value) {
        this.hukouRegionReference = value;
    }

    /**
     * Gets the value of the hukouSubregionReference property.
     * 
     * @return
     *     possible object is
     *     {@link CountrySubregionObjectType }
     *     
     */
    public CountrySubregionObjectType getHukouSubregionReference() {
        return hukouSubregionReference;
    }

    /**
     * Sets the value of the hukouSubregionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountrySubregionObjectType }
     *     
     */
    public void setHukouSubregionReference(CountrySubregionObjectType value) {
        this.hukouSubregionReference = value;
    }

    /**
     * Gets the value of the hukouLocality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHukouLocality() {
        return hukouLocality;
    }

    /**
     * Sets the value of the hukouLocality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHukouLocality(String value) {
        this.hukouLocality = value;
    }

    /**
     * Gets the value of the hukouPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHukouPostalCode() {
        return hukouPostalCode;
    }

    /**
     * Sets the value of the hukouPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHukouPostalCode(String value) {
        this.hukouPostalCode = value;
    }

    /**
     * Gets the value of the hukouTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link HukouTypeObjectType }
     *     
     */
    public HukouTypeObjectType getHukouTypeReference() {
        return hukouTypeReference;
    }

    /**
     * Sets the value of the hukouTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link HukouTypeObjectType }
     *     
     */
    public void setHukouTypeReference(HukouTypeObjectType value) {
        this.hukouTypeReference = value;
    }

    /**
     * Gets the value of the localHukou property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalHukou() {
        return localHukou;
    }

    /**
     * Sets the value of the localHukou property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalHukou(Boolean value) {
        this.localHukou = value;
    }

    /**
     * Gets the value of the nativeRegionReference property.
     * 
     * @return
     *     possible object is
     *     {@link CountryRegionObjectType }
     *     
     */
    public CountryRegionObjectType getNativeRegionReference() {
        return nativeRegionReference;
    }

    /**
     * Sets the value of the nativeRegionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryRegionObjectType }
     *     
     */
    public void setNativeRegionReference(CountryRegionObjectType value) {
        this.nativeRegionReference = value;
    }

    /**
     * Gets the value of the nativeRegionDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeRegionDescriptor() {
        return nativeRegionDescriptor;
    }

    /**
     * Sets the value of the nativeRegionDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativeRegionDescriptor(String value) {
        this.nativeRegionDescriptor = value;
    }

    /**
     * Gets the value of the personnelFileAgencyForPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonnelFileAgencyForPerson() {
        return personnelFileAgencyForPerson;
    }

    /**
     * Sets the value of the personnelFileAgencyForPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonnelFileAgencyForPerson(String value) {
        this.personnelFileAgencyForPerson = value;
    }

    /**
     * Gets the value of the lastMedicalExamDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastMedicalExamDate() {
        return lastMedicalExamDate;
    }

    /**
     * Sets the value of the lastMedicalExamDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastMedicalExamDate(XMLGregorianCalendar value) {
        this.lastMedicalExamDate = value;
    }

    /**
     * Gets the value of the lastMedicalExamValidTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastMedicalExamValidTo() {
        return lastMedicalExamValidTo;
    }

    /**
     * Sets the value of the lastMedicalExamValidTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastMedicalExamValidTo(XMLGregorianCalendar value) {
        this.lastMedicalExamValidTo = value;
    }

    /**
     * Gets the value of the medicalExamNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicalExamNotes() {
        return medicalExamNotes;
    }

    /**
     * Sets the value of the medicalExamNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicalExamNotes(String value) {
        this.medicalExamNotes = value;
    }

    /**
     * Gets the value of the bloodTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link BloodTypeObjectType }
     *     
     */
    public BloodTypeObjectType getBloodTypeReference() {
        return bloodTypeReference;
    }

    /**
     * Sets the value of the bloodTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BloodTypeObjectType }
     *     
     */
    public void setBloodTypeReference(BloodTypeObjectType value) {
        this.bloodTypeReference = value;
    }

    /**
     * Gets the value of the militaryServiceData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the militaryServiceData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMilitaryServiceData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonMilitaryServiceDataType }
     * 
     * 
     */
    public List<PersonMilitaryServiceDataType> getMilitaryServiceData() {
        if (militaryServiceData == null) {
            militaryServiceData = new ArrayList<PersonMilitaryServiceDataType>();
        }
        return this.militaryServiceData;
    }

    /**
     * Gets the value of the identificationData property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdentificationDataType }
     *     
     */
    public PersonIdentificationDataType getIdentificationData() {
        return identificationData;
    }

    /**
     * Sets the value of the identificationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdentificationDataType }
     *     
     */
    public void setIdentificationData(PersonIdentificationDataType value) {
        this.identificationData = value;
    }

    /**
     * Gets the value of the contactData property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformationDataType }
     *     
     */
    public ContactInformationDataType getContactData() {
        return contactData;
    }

    /**
     * Sets the value of the contactData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformationDataType }
     *     
     */
    public void setContactData(ContactInformationDataType value) {
        this.contactData = value;
    }

    /**
     * Gets the value of the tobaccoUse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTobaccoUse() {
        return tobaccoUse;
    }

    /**
     * Sets the value of the tobaccoUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTobaccoUse(Boolean value) {
        this.tobaccoUse = value;
    }

    /**
     * Gets the value of the politicalAffiliationReference property.
     * 
     * @return
     *     possible object is
     *     {@link PoliticalAffiliationObjectType }
     *     
     */
    public PoliticalAffiliationObjectType getPoliticalAffiliationReference() {
        return politicalAffiliationReference;
    }

    /**
     * Sets the value of the politicalAffiliationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoliticalAffiliationObjectType }
     *     
     */
    public void setPoliticalAffiliationReference(PoliticalAffiliationObjectType value) {
        this.politicalAffiliationReference = value;
    }

    /**
     * Gets the value of the socialBenefitsLocalityReference property.
     * 
     * @return
     *     possible object is
     *     {@link SocialBenefitsLocalityObjectType }
     *     
     */
    public SocialBenefitsLocalityObjectType getSocialBenefitsLocalityReference() {
        return socialBenefitsLocalityReference;
    }

    /**
     * Sets the value of the socialBenefitsLocalityReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SocialBenefitsLocalityObjectType }
     *     
     */
    public void setSocialBenefitsLocalityReference(SocialBenefitsLocalityObjectType value) {
        this.socialBenefitsLocalityReference = value;
    }

    /**
     * Gets the value of the relativeNameInformationData property.
     * 
     * @return
     *     possible object is
     *     {@link RelativeNameInformationDataType }
     *     
     */
    public RelativeNameInformationDataType getRelativeNameInformationData() {
        return relativeNameInformationData;
    }

    /**
     * Sets the value of the relativeNameInformationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeNameInformationDataType }
     *     
     */
    public void setRelativeNameInformationData(RelativeNameInformationDataType value) {
        this.relativeNameInformationData = value;
    }

}
