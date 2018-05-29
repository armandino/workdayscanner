
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains data for adding or updating a Company Insider Type
 * 
 * <p>Java class for Put_Company_Insider_Type_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Company_Insider_Type_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Company_Insider_Type_Reference" type="{urn:com.workday/bsvc}Company_Insider_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Company_Insider_Type_Data" type="{urn:com.workday/bsvc}Company_Insider_Type_DataType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Add_Only" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute ref="{urn:com.workday/bsvc}version"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Put_Company_Insider_Type_RequestType", propOrder = {
    "companyInsiderTypeReference",
    "companyInsiderTypeData"
})
public class PutCompanyInsiderTypeRequestType {

    @XmlElement(name = "Company_Insider_Type_Reference")
    protected CompanyInsiderTypeObjectType companyInsiderTypeReference;
    @XmlElement(name = "Company_Insider_Type_Data", required = true)
    protected CompanyInsiderTypeDataType companyInsiderTypeData;
    @XmlAttribute(name = "Add_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean addOnly;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the companyInsiderTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyInsiderTypeObjectType }
     *     
     */
    public CompanyInsiderTypeObjectType getCompanyInsiderTypeReference() {
        return companyInsiderTypeReference;
    }

    /**
     * Sets the value of the companyInsiderTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyInsiderTypeObjectType }
     *     
     */
    public void setCompanyInsiderTypeReference(CompanyInsiderTypeObjectType value) {
        this.companyInsiderTypeReference = value;
    }

    /**
     * Gets the value of the companyInsiderTypeData property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyInsiderTypeDataType }
     *     
     */
    public CompanyInsiderTypeDataType getCompanyInsiderTypeData() {
        return companyInsiderTypeData;
    }

    /**
     * Sets the value of the companyInsiderTypeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyInsiderTypeDataType }
     *     
     */
    public void setCompanyInsiderTypeData(CompanyInsiderTypeDataType value) {
        this.companyInsiderTypeData = value;
    }

    /**
     * Gets the value of the addOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddOnly() {
        return addOnly;
    }

    /**
     * Sets the value of the addOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddOnly(Boolean value) {
        this.addOnly = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
