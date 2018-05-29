
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element that contains basic information of worker's international assignment if any.
 * 
 * <p>Java class for International_Assignment_Summary_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="International_Assignment_Summary_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Has_International_Assignment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Host_Countries_Reference" type="{urn:com.workday/bsvc}CountryObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Home_Country_Reference" type="{urn:com.workday/bsvc}CountryObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "International_Assignment_Summary_DataType", propOrder = {
    "hasInternationalAssignment",
    "hostCountriesReference",
    "homeCountryReference"
})
public class InternationalAssignmentSummaryDataType {

    @XmlElement(name = "Has_International_Assignment")
    protected Boolean hasInternationalAssignment;
    @XmlElement(name = "Host_Countries_Reference")
    protected List<CountryObjectType> hostCountriesReference;
    @XmlElement(name = "Home_Country_Reference")
    protected CountryObjectType homeCountryReference;

    /**
     * Gets the value of the hasInternationalAssignment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasInternationalAssignment() {
        return hasInternationalAssignment;
    }

    /**
     * Sets the value of the hasInternationalAssignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasInternationalAssignment(Boolean value) {
        this.hasInternationalAssignment = value;
    }

    /**
     * Gets the value of the hostCountriesReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostCountriesReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostCountriesReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryObjectType }
     * 
     * 
     */
    public List<CountryObjectType> getHostCountriesReference() {
        if (hostCountriesReference == null) {
            hostCountriesReference = new ArrayList<CountryObjectType>();
        }
        return this.hostCountriesReference;
    }

    /**
     * Gets the value of the homeCountryReference property.
     * 
     * @return
     *     possible object is
     *     {@link CountryObjectType }
     *     
     */
    public CountryObjectType getHomeCountryReference() {
        return homeCountryReference;
    }

    /**
     * Sets the value of the homeCountryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryObjectType }
     *     
     */
    public void setHomeCountryReference(CountryObjectType value) {
        this.homeCountryReference = value;
    }

}
