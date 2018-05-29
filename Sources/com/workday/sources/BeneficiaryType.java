
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing all Beneficiary data.
 * 
 * <p>Java class for BeneficiaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BeneficiaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Beneficiary_Reference" type="{urn:com.workday/bsvc}BeneficiaryObjectType"/>
 *         &lt;element name="Beneficiary_Data" type="{urn:com.workday/bsvc}Beneficiary_DataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BeneficiaryType", propOrder = {
    "beneficiaryReference",
    "beneficiaryData"
})
public class BeneficiaryType {

    @XmlElement(name = "Beneficiary_Reference", required = true)
    protected BeneficiaryObjectType beneficiaryReference;
    @XmlElement(name = "Beneficiary_Data", required = true)
    protected BeneficiaryDataType beneficiaryData;

    /**
     * Gets the value of the beneficiaryReference property.
     * 
     * @return
     *     possible object is
     *     {@link BeneficiaryObjectType }
     *     
     */
    public BeneficiaryObjectType getBeneficiaryReference() {
        return beneficiaryReference;
    }

    /**
     * Sets the value of the beneficiaryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficiaryObjectType }
     *     
     */
    public void setBeneficiaryReference(BeneficiaryObjectType value) {
        this.beneficiaryReference = value;
    }

    /**
     * Gets the value of the beneficiaryData property.
     * 
     * @return
     *     possible object is
     *     {@link BeneficiaryDataType }
     *     
     */
    public BeneficiaryDataType getBeneficiaryData() {
        return beneficiaryData;
    }

    /**
     * Sets the value of the beneficiaryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficiaryDataType }
     *     
     */
    public void setBeneficiaryData(BeneficiaryDataType value) {
        this.beneficiaryData = value;
    }

}
