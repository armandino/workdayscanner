
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element containing the Company Insider Type data for a job profile.
 * 
 * <p>Java class for Company_Insider_Job_Profile_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Company_Insider_Job_Profile_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Company_Insider_Type_Reference" type="{urn:com.workday/bsvc}Company_Insider_TypeObjectType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Delete" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Company_Insider_Job_Profile_DataType", propOrder = {
    "companyInsiderTypeReference"
})
public class CompanyInsiderJobProfileDataType {

    @XmlElement(name = "Company_Insider_Type_Reference", required = true)
    protected CompanyInsiderTypeObjectType companyInsiderTypeReference;
    @XmlAttribute(name = "Delete", namespace = "urn:com.workday/bsvc")
    protected Boolean delete;

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
     * Gets the value of the delete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelete() {
        return delete;
    }

    /**
     * Sets the value of the delete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelete(Boolean value) {
        this.delete = value;
    }

}
