
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element containing all company insider type data.
 * 
 * <p>Java class for Company_Insider_Type_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Company_Insider_Type_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Company_Insider_Type_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Company_Insider_Type_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Company_Insider_Type_Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Company_Insider_Type_DataType", propOrder = {
    "companyInsiderTypeID",
    "companyInsiderTypeName",
    "companyInsiderTypeDescription",
    "inactive"
})
public class CompanyInsiderTypeDataType {

    @XmlElement(name = "Company_Insider_Type_ID")
    protected String companyInsiderTypeID;
    @XmlElement(name = "Company_Insider_Type_Name")
    protected String companyInsiderTypeName;
    @XmlElement(name = "Company_Insider_Type_Description")
    protected String companyInsiderTypeDescription;
    @XmlElement(name = "Inactive")
    protected Boolean inactive;

    /**
     * Gets the value of the companyInsiderTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyInsiderTypeID() {
        return companyInsiderTypeID;
    }

    /**
     * Sets the value of the companyInsiderTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyInsiderTypeID(String value) {
        this.companyInsiderTypeID = value;
    }

    /**
     * Gets the value of the companyInsiderTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyInsiderTypeName() {
        return companyInsiderTypeName;
    }

    /**
     * Sets the value of the companyInsiderTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyInsiderTypeName(String value) {
        this.companyInsiderTypeName = value;
    }

    /**
     * Gets the value of the companyInsiderTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyInsiderTypeDescription() {
        return companyInsiderTypeDescription;
    }

    /**
     * Sets the value of the companyInsiderTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyInsiderTypeDescription(String value) {
        this.companyInsiderTypeDescription = value;
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
