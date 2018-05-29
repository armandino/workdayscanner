
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element containing company insider type reference and data.
 * 
 * <p>Java class for Company_Insider_TypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Company_Insider_TypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Company_Insider_Type_Reference" type="{urn:com.workday/bsvc}Company_Insider_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Company_Insider_Type_Data" type="{urn:com.workday/bsvc}Company_Insider_Type_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Company_Insider_TypeType", propOrder = {
    "companyInsiderTypeReference",
    "companyInsiderTypeData"
})
public class CompanyInsiderTypeType {

    @XmlElement(name = "Company_Insider_Type_Reference")
    protected CompanyInsiderTypeObjectType companyInsiderTypeReference;
    @XmlElement(name = "Company_Insider_Type_Data")
    protected List<CompanyInsiderTypeDataType> companyInsiderTypeData;

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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the companyInsiderTypeData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompanyInsiderTypeData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyInsiderTypeDataType }
     * 
     * 
     */
    public List<CompanyInsiderTypeDataType> getCompanyInsiderTypeData() {
        if (companyInsiderTypeData == null) {
            companyInsiderTypeData = new ArrayList<CompanyInsiderTypeDataType>();
        }
        return this.companyInsiderTypeData;
    }

}
