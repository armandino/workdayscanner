
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Utilize the Request Criteria to search for a specific instance(s) of a Workers' Compensation Code
 * 
 * <p>Java class for Workers_Compensation_Code_Request_CriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Workers_Compensation_Code_Request_CriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Country_Reference" type="{urn:com.workday/bsvc}CountryObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Country_Subregion_Reference" type="{urn:com.workday/bsvc}Country_RegionObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Location_Reference" type="{urn:com.workday/bsvc}LocationObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Workers_Compensation_Code_Request_CriteriaType", propOrder = {
    "countryReference",
    "countrySubregionReference",
    "locationReference"
})
public class WorkersCompensationCodeRequestCriteriaType {

    @XmlElement(name = "Country_Reference")
    protected List<CountryObjectType> countryReference;
    @XmlElement(name = "Country_Subregion_Reference")
    protected List<CountryRegionObjectType> countrySubregionReference;
    @XmlElement(name = "Location_Reference")
    protected List<LocationObjectType> locationReference;

    /**
     * Gets the value of the countryReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryObjectType }
     * 
     * 
     */
    public List<CountryObjectType> getCountryReference() {
        if (countryReference == null) {
            countryReference = new ArrayList<CountryObjectType>();
        }
        return this.countryReference;
    }

    /**
     * Gets the value of the countrySubregionReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countrySubregionReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountrySubregionReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryRegionObjectType }
     * 
     * 
     */
    public List<CountryRegionObjectType> getCountrySubregionReference() {
        if (countrySubregionReference == null) {
            countrySubregionReference = new ArrayList<CountryRegionObjectType>();
        }
        return this.countrySubregionReference;
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

}
