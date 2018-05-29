
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element for all Demographic data (e.g. Marital Status, Ethnicity, etc.) associated with a person.
 * 
 * <p>Java class for Demographic_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Demographic_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Marital_Status_Reference" type="{urn:com.workday/bsvc}Marital_Status_ReferenceType" minOccurs="0"/>
 *         &lt;element name="Hispanic_or_Latino" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Ethnicity_Reference" type="{urn:com.workday/bsvc}Ethnicity_ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Citizenship_Status_Reference" type="{urn:com.workday/bsvc}Citizenship_Status_ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Nationality_Reference" type="{urn:com.workday/bsvc}CountryObjectType" minOccurs="0"/>
 *         &lt;element name="Hukou_Region_Reference" type="{urn:com.workday/bsvc}Country_RegionObjectType" minOccurs="0"/>
 *         &lt;element name="Hukou_Subregion_Reference" type="{urn:com.workday/bsvc}Country_SubregionObjectType" minOccurs="0"/>
 *         &lt;element name="Hukou_Locality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hukou_Postal_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hukou_Type_Reference" type="{urn:com.workday/bsvc}Hukou_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Native_Region_Reference" type="{urn:com.workday/bsvc}Country_RegionObjectType" minOccurs="0"/>
 *         &lt;element name="Personnel_File_Agency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Military_Service_Data" type="{urn:com.workday/bsvc}Military_Service_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Demographic_DataType", propOrder = {
    "maritalStatusReference",
    "hispanicOrLatino",
    "ethnicityReference",
    "citizenshipStatusReference",
    "nationalityReference",
    "hukouRegionReference",
    "hukouSubregionReference",
    "hukouLocality",
    "hukouPostalCode",
    "hukouTypeReference",
    "nativeRegionReference",
    "personnelFileAgency",
    "militaryServiceData"
})
public class DemographicDataType {

    @XmlElement(name = "Marital_Status_Reference")
    protected MaritalStatusReferenceType maritalStatusReference;
    @XmlElement(name = "Hispanic_or_Latino")
    protected Boolean hispanicOrLatino;
    @XmlElement(name = "Ethnicity_Reference")
    protected List<EthnicityReferenceType> ethnicityReference;
    @XmlElement(name = "Citizenship_Status_Reference")
    protected List<CitizenshipStatusReferenceType> citizenshipStatusReference;
    @XmlElement(name = "Nationality_Reference")
    protected CountryObjectType nationalityReference;
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
    @XmlElement(name = "Military_Service_Data")
    protected List<MilitaryServiceDataType> militaryServiceData;

    /**
     * Gets the value of the maritalStatusReference property.
     * 
     * @return
     *     possible object is
     *     {@link MaritalStatusReferenceType }
     *     
     */
    public MaritalStatusReferenceType getMaritalStatusReference() {
        return maritalStatusReference;
    }

    /**
     * Sets the value of the maritalStatusReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaritalStatusReferenceType }
     *     
     */
    public void setMaritalStatusReference(MaritalStatusReferenceType value) {
        this.maritalStatusReference = value;
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
     * {@link EthnicityReferenceType }
     * 
     * 
     */
    public List<EthnicityReferenceType> getEthnicityReference() {
        if (ethnicityReference == null) {
            ethnicityReference = new ArrayList<EthnicityReferenceType>();
        }
        return this.ethnicityReference;
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
     * {@link CitizenshipStatusReferenceType }
     * 
     * 
     */
    public List<CitizenshipStatusReferenceType> getCitizenshipStatusReference() {
        if (citizenshipStatusReference == null) {
            citizenshipStatusReference = new ArrayList<CitizenshipStatusReferenceType>();
        }
        return this.citizenshipStatusReference;
    }

    /**
     * Gets the value of the nationalityReference property.
     * 
     * @return
     *     possible object is
     *     {@link CountryObjectType }
     *     
     */
    public CountryObjectType getNationalityReference() {
        return nationalityReference;
    }

    /**
     * Sets the value of the nationalityReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryObjectType }
     *     
     */
    public void setNationalityReference(CountryObjectType value) {
        this.nationalityReference = value;
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
     * {@link MilitaryServiceDataType }
     * 
     * 
     */
    public List<MilitaryServiceDataType> getMilitaryServiceData() {
        if (militaryServiceData == null) {
            militaryServiceData = new ArrayList<MilitaryServiceDataType>();
        }
        return this.militaryServiceData;
    }

}
