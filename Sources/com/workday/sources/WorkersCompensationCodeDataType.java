
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element containing Workers' Compensation Code data
 * 
 * <p>Java class for Workers_Compensation_Code_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Workers_Compensation_Code_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Workers_Compensation_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Workers_Compensation_Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Workers_Compensation_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Country_Reference" type="{urn:com.workday/bsvc}CountryObjectType"/>
 *         &lt;element name="Country_Region_Reference" type="{urn:com.workday/bsvc}Country_RegionObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Location_Reference" type="{urn:com.workday/bsvc}LocationObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Inactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Workers_Compensation_Code_DataType", propOrder = {
    "workersCompensationID",
    "workersCompensationCode",
    "workersCompensationName",
    "countryReference",
    "countryRegionReference",
    "locationReference",
    "inactive"
})
public class WorkersCompensationCodeDataType {

    @XmlElement(name = "Workers_Compensation_ID")
    protected String workersCompensationID;
    @XmlElement(name = "Workers_Compensation_Code", required = true)
    protected String workersCompensationCode;
    @XmlElement(name = "Workers_Compensation_Name", required = true)
    protected String workersCompensationName;
    @XmlElement(name = "Country_Reference", required = true)
    protected CountryObjectType countryReference;
    @XmlElement(name = "Country_Region_Reference")
    protected List<CountryRegionObjectType> countryRegionReference;
    @XmlElement(name = "Location_Reference")
    protected List<LocationObjectType> locationReference;
    @XmlElement(name = "Inactive")
    protected Boolean inactive;

    /**
     * Gets the value of the workersCompensationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkersCompensationID() {
        return workersCompensationID;
    }

    /**
     * Sets the value of the workersCompensationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkersCompensationID(String value) {
        this.workersCompensationID = value;
    }

    /**
     * Gets the value of the workersCompensationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkersCompensationCode() {
        return workersCompensationCode;
    }

    /**
     * Sets the value of the workersCompensationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkersCompensationCode(String value) {
        this.workersCompensationCode = value;
    }

    /**
     * Gets the value of the workersCompensationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkersCompensationName() {
        return workersCompensationName;
    }

    /**
     * Sets the value of the workersCompensationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkersCompensationName(String value) {
        this.workersCompensationName = value;
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
     * Gets the value of the countryRegionReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryRegionReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryRegionReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryRegionObjectType }
     * 
     * 
     */
    public List<CountryRegionObjectType> getCountryRegionReference() {
        if (countryRegionReference == null) {
            countryRegionReference = new ArrayList<CountryRegionObjectType>();
        }
        return this.countryRegionReference;
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

}
