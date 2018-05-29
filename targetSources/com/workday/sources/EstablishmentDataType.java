
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
 * Establishment Data wrapper
 * 
 * <p>Java class for Establishment_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Establishment_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Establishment_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country_Reference" type="{urn:com.workday/bsvc}CountryObjectType" minOccurs="0"/>
 *         &lt;element name="Effective_Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Establishment_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Inactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Location_Reference" type="{urn:com.workday/bsvc}LocationObjectType" maxOccurs="unbounded"/>
 *         &lt;element name="Establishment_Legal_Entity_Reference" type="{urn:com.workday/bsvc}Establishment_Legal_EntityObjectType" maxOccurs="unbounded"/>
 *         &lt;element name="DUNS_Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EEO_Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Industry_Code_Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SIRET_Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VETS_Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Establishment_Headquarters" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Establishment_DataType", propOrder = {
    "establishmentNumber",
    "id",
    "countryReference",
    "effectiveDate",
    "establishmentName",
    "inactive",
    "locationReference",
    "establishmentLegalEntityReference",
    "dunsText",
    "eeoText",
    "industryCodeText",
    "siretText",
    "vetsText",
    "establishmentHeadquarters"
})
public class EstablishmentDataType {

    @XmlElement(name = "Establishment_Number")
    protected String establishmentNumber;
    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "Country_Reference")
    protected CountryObjectType countryReference;
    @XmlElement(name = "Effective_Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "Establishment_Name")
    protected String establishmentName;
    @XmlElement(name = "Inactive")
    protected Boolean inactive;
    @XmlElement(name = "Location_Reference", required = true)
    protected List<LocationObjectType> locationReference;
    @XmlElement(name = "Establishment_Legal_Entity_Reference", required = true)
    protected List<EstablishmentLegalEntityObjectType> establishmentLegalEntityReference;
    @XmlElement(name = "DUNS_Text")
    protected String dunsText;
    @XmlElement(name = "EEO_Text")
    protected String eeoText;
    @XmlElement(name = "Industry_Code_Text")
    protected String industryCodeText;
    @XmlElement(name = "SIRET_Text")
    protected String siretText;
    @XmlElement(name = "VETS_Text")
    protected String vetsText;
    @XmlElement(name = "Establishment_Headquarters")
    protected Boolean establishmentHeadquarters;

    /**
     * Gets the value of the establishmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstablishmentNumber() {
        return establishmentNumber;
    }

    /**
     * Sets the value of the establishmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstablishmentNumber(String value) {
        this.establishmentNumber = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the countryReference property.
     * 
     * @return
     *     possible object is
     *     {@link CountryObjectType }
     *     
     */
    public CountryObjectType getCountryReference() {
        return countryReference;
    }

    /**
     * Sets the value of the countryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryObjectType }
     *     
     */
    public void setCountryReference(CountryObjectType value) {
        this.countryReference = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the establishmentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstablishmentName() {
        return establishmentName;
    }

    /**
     * Sets the value of the establishmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstablishmentName(String value) {
        this.establishmentName = value;
    }

    /**
     * Gets the value of the inactive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInactive() {
        return inactive;
    }

    /**
     * Sets the value of the inactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInactive(Boolean value) {
        this.inactive = value;
    }

    /**
     * Gets the value of the locationReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationObjectType }
     * 
     * 
     */
    public List<LocationObjectType> getLocationReference() {
        if (locationReference == null) {
            locationReference = new ArrayList<LocationObjectType>();
        }
        return this.locationReference;
    }

    /**
     * Gets the value of the establishmentLegalEntityReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the establishmentLegalEntityReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstablishmentLegalEntityReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstablishmentLegalEntityObjectType }
     * 
     * 
     */
    public List<EstablishmentLegalEntityObjectType> getEstablishmentLegalEntityReference() {
        if (establishmentLegalEntityReference == null) {
            establishmentLegalEntityReference = new ArrayList<EstablishmentLegalEntityObjectType>();
        }
        return this.establishmentLegalEntityReference;
    }

    /**
     * Gets the value of the dunsText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUNSText() {
        return dunsText;
    }

    /**
     * Sets the value of the dunsText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUNSText(String value) {
        this.dunsText = value;
    }

    /**
     * Gets the value of the eeoText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEEOText() {
        return eeoText;
    }

    /**
     * Sets the value of the eeoText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEEOText(String value) {
        this.eeoText = value;
    }

    /**
     * Gets the value of the industryCodeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryCodeText() {
        return industryCodeText;
    }

    /**
     * Sets the value of the industryCodeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryCodeText(String value) {
        this.industryCodeText = value;
    }

    /**
     * Gets the value of the siretText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIRETText() {
        return siretText;
    }

    /**
     * Sets the value of the siretText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIRETText(String value) {
        this.siretText = value;
    }

    /**
     * Gets the value of the vetsText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVETSText() {
        return vetsText;
    }

    /**
     * Sets the value of the vetsText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVETSText(String value) {
        this.vetsText = value;
    }

    /**
     * Gets the value of the establishmentHeadquarters property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEstablishmentHeadquarters() {
        return establishmentHeadquarters;
    }

    /**
     * Sets the value of the establishmentHeadquarters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEstablishmentHeadquarters(Boolean value) {
        this.establishmentHeadquarters = value;
    }

}
