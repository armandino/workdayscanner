
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
 * Container for the data changed in the Change Personal Information business process.
 * 
 * <p>Java class for Change_Personal_Information_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Change_Personal_Information_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Date_of_Birth" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Birth_Country_Reference" type="{urn:com.workday/bsvc}CountryObjectType" minOccurs="0"/>
 *         &lt;element name="Birth_Region_Reference" type="{urn:com.workday/bsvc}Country_RegionObjectType" minOccurs="0"/>
 *         &lt;element name="Gender_Reference" type="{urn:com.workday/bsvc}GenderObjectType" minOccurs="0"/>
 *         &lt;element name="Disability_Information_Data" type="{urn:com.workday/bsvc}Disability_Information_DataType" minOccurs="0"/>
 *         &lt;element name="Marital_Status_Reference" type="{urn:com.workday/bsvc}Marital_StatusObjectType" minOccurs="0"/>
 *         &lt;element name="Citizenship_Reference" type="{urn:com.workday/bsvc}Citizenship_StatusObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Primary_Nationality_Reference" type="{urn:com.workday/bsvc}CountryObjectType" minOccurs="0"/>
 *         &lt;element name="Additional_Nationality_Reference" type="{urn:com.workday/bsvc}CountryObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Ethnicity_Reference" type="{urn:com.workday/bsvc}EthnicityObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Hispanic_or_Latino" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Visual_Survey_Ethnicity_Reference" type="{urn:com.workday/bsvc}EthnicityObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Hispanic_or_Latino_for_Visual_Survey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Religion_Reference" type="{urn:com.workday/bsvc}ReligionObjectType" minOccurs="0"/>
 *         &lt;element name="Hukou_Region_Reference" type="{urn:com.workday/bsvc}Country_RegionObjectType" minOccurs="0"/>
 *         &lt;element name="Hukou_Subregion_Reference" type="{urn:com.workday/bsvc}Country_SubregionObjectType" minOccurs="0"/>
 *         &lt;element name="Hukou_Locality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hukou_Postal_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hukou_Type_Reference" type="{urn:com.workday/bsvc}Hukou_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Native_Region_Reference" type="{urn:com.workday/bsvc}Country_RegionObjectType" minOccurs="0"/>
 *         &lt;element name="Personnel_File_Agency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Military_Information_Data" type="{urn:com.workday/bsvc}Military_Information_DataType" minOccurs="0"/>
 *         &lt;element name="Political_Affiliation_Reference" type="{urn:com.workday/bsvc}Political_AffiliationObjectType" minOccurs="0"/>
 *         &lt;element name="Date_of_Death" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="City_of_Birth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Marital_Status_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Last_Medical_Exam_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Last_Medical_Exam_Valid_To" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Medical_Exam_Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Blood_Type_Reference" type="{urn:com.workday/bsvc}Blood_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Uses_Tobacco" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Social_Benefits_Locality_Reference" type="{urn:com.workday/bsvc}Social_Benefits_LocalityObjectType" minOccurs="0"/>
 *         &lt;element name="LGBT_Identification_Reference" type="{urn:com.workday/bsvc}LGBT_IdentificationObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Sexual_Orientation_Reference" type="{urn:com.workday/bsvc}Sexual_OrientationObjectType" minOccurs="0"/>
 *         &lt;element name="Gender_Identity_Reference" type="{urn:com.workday/bsvc}Gender_IdentityObjectType" minOccurs="0"/>
 *         &lt;element name="Pronoun_Reference" type="{urn:com.workday/bsvc}PronounObjectType" minOccurs="0"/>
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
@XmlType(name = "Change_Personal_Information_DataType", propOrder = {
    "dateOfBirth",
    "birthCountryReference",
    "birthRegionReference",
    "genderReference",
    "disabilityInformationData",
    "maritalStatusReference",
    "citizenshipReference",
    "primaryNationalityReference",
    "additionalNationalityReference",
    "ethnicityReference",
    "hispanicOrLatino",
    "visualSurveyEthnicityReference",
    "hispanicOrLatinoForVisualSurvey",
    "religionReference",
    "hukouRegionReference",
    "hukouSubregionReference",
    "hukouLocality",
    "hukouPostalCode",
    "hukouTypeReference",
    "nativeRegionReference",
    "personnelFileAgency",
    "militaryInformationData",
    "politicalAffiliationReference",
    "dateOfDeath",
    "cityOfBirth",
    "maritalStatusDate",
    "lastMedicalExamDate",
    "lastMedicalExamValidTo",
    "medicalExamNotes",
    "bloodTypeReference",
    "usesTobacco",
    "socialBenefitsLocalityReference",
    "lgbtIdentificationReference",
    "sexualOrientationReference",
    "genderIdentityReference",
    "pronounReference",
    "relativeNameInformationData"
})
public class ChangePersonalInformationDataType {

    @XmlElement(name = "Date_of_Birth")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElement(name = "Birth_Country_Reference")
    protected CountryObjectType birthCountryReference;
    @XmlElement(name = "Birth_Region_Reference")
    protected CountryRegionObjectType birthRegionReference;
    @XmlElement(name = "Gender_Reference")
    protected GenderObjectType genderReference;
    @XmlElement(name = "Disability_Information_Data")
    protected DisabilityInformationDataType disabilityInformationData;
    @XmlElement(name = "Marital_Status_Reference")
    protected MaritalStatusObjectType maritalStatusReference;
    @XmlElement(name = "Citizenship_Reference")
    protected List<CitizenshipStatusObjectType> citizenshipReference;
    @XmlElement(name = "Primary_Nationality_Reference")
    protected CountryObjectType primaryNationalityReference;
    @XmlElement(name = "Additional_Nationality_Reference")
    protected List<CountryObjectType> additionalNationalityReference;
    @XmlElement(name = "Ethnicity_Reference")
    protected List<EthnicityObjectType> ethnicityReference;
    @XmlElement(name = "Hispanic_or_Latino")
    protected Boolean hispanicOrLatino;
    @XmlElement(name = "Visual_Survey_Ethnicity_Reference")
    protected List<EthnicityObjectType> visualSurveyEthnicityReference;
    @XmlElement(name = "Hispanic_or_Latino_for_Visual_Survey")
    protected Boolean hispanicOrLatinoForVisualSurvey;
    @XmlElement(name = "Religion_Reference")
    protected ReligionObjectType religionReference;
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
    @XmlElement(name = "Native_Region_Reference")
    protected CountryRegionObjectType nativeRegionReference;
    @XmlElement(name = "Personnel_File_Agency")
    protected String personnelFileAgency;
    @XmlElement(name = "Military_Information_Data")
    protected MilitaryInformationDataType militaryInformationData;
    @XmlElement(name = "Political_Affiliation_Reference")
    protected PoliticalAffiliationObjectType politicalAffiliationReference;
    @XmlElement(name = "Date_of_Death")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfDeath;
    @XmlElement(name = "City_of_Birth")
    protected String cityOfBirth;
    @XmlElement(name = "Marital_Status_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar maritalStatusDate;
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
    @XmlElement(name = "Uses_Tobacco")
    protected Boolean usesTobacco;
    @XmlElement(name = "Social_Benefits_Locality_Reference")
    protected SocialBenefitsLocalityObjectType socialBenefitsLocalityReference;
    @XmlElement(name = "LGBT_Identification_Reference")
    protected List<LGBTIdentificationObjectType> lgbtIdentificationReference;
    @XmlElement(name = "Sexual_Orientation_Reference")
    protected SexualOrientationObjectType sexualOrientationReference;
    @XmlElement(name = "Gender_Identity_Reference")
    protected GenderIdentityObjectType genderIdentityReference;
    @XmlElement(name = "Pronoun_Reference")
    protected PronounObjectType pronounReference;
    @XmlElement(name = "Relative_Name_Information_Data")
    protected RelativeNameInformationDataType relativeNameInformationData;

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the birthCountryReference property.
     * 
     * @return
     *     possible object is
     *     {@link CountryObjectType }
     *     
     */
    public CountryObjectType getBirthCountryReference() {
        return birthCountryReference;
    }

    /**
     * Sets the value of the birthCountryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryObjectType }
     *     
     */
    public void setBirthCountryReference(CountryObjectType value) {
        this.birthCountryReference = value;
    }

    /**
     * Gets the value of the birthRegionReference property.
     * 
     * @return
     *     possible object is
     *     {@link CountryRegionObjectType }
     *     
     */
    public CountryRegionObjectType getBirthRegionReference() {
        return birthRegionReference;
    }

    /**
     * Sets the value of the birthRegionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryRegionObjectType }
     *     
     */
    public void setBirthRegionReference(CountryRegionObjectType value) {
        this.birthRegionReference = value;
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
     * Gets the value of the disabilityInformationData property.
     * 
     * @return
     *     possible object is
     *     {@link DisabilityInformationDataType }
     *     
     */
    public DisabilityInformationDataType getDisabilityInformationData() {
        return disabilityInformationData;
    }

    /**
     * Sets the value of the disabilityInformationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisabilityInformationDataType }
     *     
     */
    public void setDisabilityInformationData(DisabilityInformationDataType value) {
        this.disabilityInformationData = value;
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
     * Gets the value of the citizenshipReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the citizenshipReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCitizenshipReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CitizenshipStatusObjectType }
     * 
     * 
     */
    public List<CitizenshipStatusObjectType> getCitizenshipReference() {
        if (citizenshipReference == null) {
            citizenshipReference = new ArrayList<CitizenshipStatusObjectType>();
        }
        return this.citizenshipReference;
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
     * Gets the value of the visualSurveyEthnicityReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the visualSurveyEthnicityReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVisualSurveyEthnicityReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EthnicityObjectType }
     * 
     * 
     */
    public List<EthnicityObjectType> getVisualSurveyEthnicityReference() {
        if (visualSurveyEthnicityReference == null) {
            visualSurveyEthnicityReference = new ArrayList<EthnicityObjectType>();
        }
        return this.visualSurveyEthnicityReference;
    }

    /**
     * Gets the value of the hispanicOrLatinoForVisualSurvey property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHispanicOrLatinoForVisualSurvey() {
        return hispanicOrLatinoForVisualSurvey;
    }

    /**
     * Sets the value of the hispanicOrLatinoForVisualSurvey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHispanicOrLatinoForVisualSurvey(Boolean value) {
        this.hispanicOrLatinoForVisualSurvey = value;
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
     * Gets the value of the personnelFileAgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonnelFileAgency() {
        return personnelFileAgency;
    }

    /**
     * Sets the value of the personnelFileAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonnelFileAgency(String value) {
        this.personnelFileAgency = value;
    }

    /**
     * Gets the value of the militaryInformationData property.
     * 
     * @return
     *     possible object is
     *     {@link MilitaryInformationDataType }
     *     
     */
    public MilitaryInformationDataType getMilitaryInformationData() {
        return militaryInformationData;
    }

    /**
     * Sets the value of the militaryInformationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MilitaryInformationDataType }
     *     
     */
    public void setMilitaryInformationData(MilitaryInformationDataType value) {
        this.militaryInformationData = value;
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
     * Gets the value of the usesTobacco property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsesTobacco() {
        return usesTobacco;
    }

    /**
     * Sets the value of the usesTobacco property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsesTobacco(Boolean value) {
        this.usesTobacco = value;
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
     * Gets the value of the lgbtIdentificationReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lgbtIdentificationReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLGBTIdentificationReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LGBTIdentificationObjectType }
     * 
     * 
     */
    public List<LGBTIdentificationObjectType> getLGBTIdentificationReference() {
        if (lgbtIdentificationReference == null) {
            lgbtIdentificationReference = new ArrayList<LGBTIdentificationObjectType>();
        }
        return this.lgbtIdentificationReference;
    }

    /**
     * Gets the value of the sexualOrientationReference property.
     * 
     * @return
     *     possible object is
     *     {@link SexualOrientationObjectType }
     *     
     */
    public SexualOrientationObjectType getSexualOrientationReference() {
        return sexualOrientationReference;
    }

    /**
     * Sets the value of the sexualOrientationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SexualOrientationObjectType }
     *     
     */
    public void setSexualOrientationReference(SexualOrientationObjectType value) {
        this.sexualOrientationReference = value;
    }

    /**
     * Gets the value of the genderIdentityReference property.
     * 
     * @return
     *     possible object is
     *     {@link GenderIdentityObjectType }
     *     
     */
    public GenderIdentityObjectType getGenderIdentityReference() {
        return genderIdentityReference;
    }

    /**
     * Sets the value of the genderIdentityReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderIdentityObjectType }
     *     
     */
    public void setGenderIdentityReference(GenderIdentityObjectType value) {
        this.genderIdentityReference = value;
    }

    /**
     * Gets the value of the pronounReference property.
     * 
     * @return
     *     possible object is
     *     {@link PronounObjectType }
     *     
     */
    public PronounObjectType getPronounReference() {
        return pronounReference;
    }

    /**
     * Sets the value of the pronounReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PronounObjectType }
     *     
     */
    public void setPronounReference(PronounObjectType value) {
        this.pronounReference = value;
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
