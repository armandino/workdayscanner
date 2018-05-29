
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference element representing a unique instance of Company Insider Type.
 * 
 * <p>Java class for Company_Insider_Type_ReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Company_Insider_Type_ReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Company_Insider_Type_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Company_Insider_Type_ReferenceType", propOrder = {
    "companyInsiderTypeName"
})
public class CompanyInsiderTypeReferenceType {

    @XmlElement(name = "Company_Insider_Type_Name", required = true)
    protected String companyInsiderTypeName;

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

}
