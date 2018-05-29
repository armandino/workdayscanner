
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contingent Worker Tax Authority Form Information
 * 
 * <p>Java class for Contingent_Worker_Tax_Authority_Form_Information_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contingent_Worker_Tax_Authority_Form_Information_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tax_Authority_Form_Type_Reference" type="{urn:com.workday/bsvc}Tax_Authority_Form_TypeObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contingent_Worker_Tax_Authority_Form_Information_DataType", propOrder = {
    "taxAuthorityFormTypeReference"
})
public class ContingentWorkerTaxAuthorityFormInformationDataType {

    @XmlElement(name = "Tax_Authority_Form_Type_Reference")
    protected TaxAuthorityFormTypeObjectType taxAuthorityFormTypeReference;

    /**
     * Gets the value of the taxAuthorityFormTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link TaxAuthorityFormTypeObjectType }
     *     
     */
    public TaxAuthorityFormTypeObjectType getTaxAuthorityFormTypeReference() {
        return taxAuthorityFormTypeReference;
    }

    /**
     * Sets the value of the taxAuthorityFormTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAuthorityFormTypeObjectType }
     *     
     */
    public void setTaxAuthorityFormTypeReference(TaxAuthorityFormTypeObjectType value) {
        this.taxAuthorityFormTypeReference = value;
    }

}
