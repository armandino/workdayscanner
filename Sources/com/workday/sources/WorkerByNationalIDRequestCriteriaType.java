
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * National Id request criteria.
 * 
 * <p>Java class for Worker_by_National_ID_Request_CriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_by_National_ID_Request_CriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identifier_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;choice>
 *           &lt;element name="National_ID_Type_Reference" type="{urn:com.workday/bsvc}National_ID_TypeObjectType"/>
 *           &lt;element name="Country_Reference" type="{urn:com.workday/bsvc}CountryObjectType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_by_National_ID_Request_CriteriaType", propOrder = {
    "identifierID",
    "nationalIDTypeReference",
    "countryReference"
})
public class WorkerByNationalIDRequestCriteriaType {

    @XmlElement(name = "Identifier_ID", required = true)
    protected String identifierID;
    @XmlElement(name = "National_ID_Type_Reference")
    protected NationalIDTypeObjectType nationalIDTypeReference;
    @XmlElement(name = "Country_Reference")
    protected CountryObjectType countryReference;

    /**
     * Gets the value of the identifierID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifierID() {
        return identifierID;
    }

    /**
     * Sets the value of the identifierID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifierID(String value) {
        this.identifierID = value;
    }

    /**
     * Gets the value of the nationalIDTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link NationalIDTypeObjectType }
     *     
     */
    public NationalIDTypeObjectType getNationalIDTypeReference() {
        return nationalIDTypeReference;
    }

    /**
     * Sets the value of the nationalIDTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link NationalIDTypeObjectType }
     *     
     */
    public void setNationalIDTypeReference(NationalIDTypeObjectType value) {
        this.nationalIDTypeReference = value;
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

}
