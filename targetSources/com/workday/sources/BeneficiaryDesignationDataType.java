
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Contains the beneficiary that the coverage allocation is for and the details about the allocation.
 * 
 * <p>Java class for Beneficiary_Designation_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Beneficiary_Designation_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Beneficiary_Reference" type="{urn:com.workday/bsvc}BeneficiaryObjectType"/>
 *         &lt;element name="Original_Coverage_Begin_Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Coverage_End_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Beneficiary_Allocation_Data" type="{urn:com.workday/bsvc}Beneficiary_Allocation_DataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Beneficiary_Designation_DataType", propOrder = {
    "beneficiaryReference",
    "originalCoverageBeginDate",
    "coverageEndDate",
    "beneficiaryAllocationData"
})
public class BeneficiaryDesignationDataType {

    @XmlElement(name = "Beneficiary_Reference", required = true)
    protected BeneficiaryObjectType beneficiaryReference;
    @XmlElement(name = "Original_Coverage_Begin_Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar originalCoverageBeginDate;
    @XmlElement(name = "Coverage_End_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar coverageEndDate;
    @XmlElement(name = "Beneficiary_Allocation_Data", required = true)
    protected BeneficiaryAllocationDataType beneficiaryAllocationData;

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
     * Gets the value of the originalCoverageBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginalCoverageBeginDate() {
        return originalCoverageBeginDate;
    }

    /**
     * Sets the value of the originalCoverageBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginalCoverageBeginDate(XMLGregorianCalendar value) {
        this.originalCoverageBeginDate = value;
    }

    /**
     * Gets the value of the coverageEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCoverageEndDate() {
        return coverageEndDate;
    }

    /**
     * Sets the value of the coverageEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCoverageEndDate(XMLGregorianCalendar value) {
        this.coverageEndDate = value;
    }

    /**
     * Gets the value of the beneficiaryAllocationData property.
     * 
     * @return
     *     possible object is
     *     {@link BeneficiaryAllocationDataType }
     *     
     */
    public BeneficiaryAllocationDataType getBeneficiaryAllocationData() {
        return beneficiaryAllocationData;
    }

    /**
     * Sets the value of the beneficiaryAllocationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficiaryAllocationDataType }
     *     
     */
    public void setBeneficiaryAllocationData(BeneficiaryAllocationDataType value) {
        this.beneficiaryAllocationData = value;
    }

}
