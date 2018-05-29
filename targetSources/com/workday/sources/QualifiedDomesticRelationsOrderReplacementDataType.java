
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Court Order Details. NOTE: You must pass in the entire set of court orders. Any existing court orders that are not submitted will be removed.
 * 
 * <p>Java class for Qualified_Domestic_Relations_Order_Replacement_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Qualified_Domestic_Relations_Order_Replacement_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Benefit_Coverage_Type_Reference" type="{urn:com.workday/bsvc}Benefit_Coverage_TypeObjectType"/>
 *         &lt;element name="Start_Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="End_Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Qualified_Domestic_Relations_Order_Replacement_DataType", propOrder = {
    "benefitCoverageTypeReference",
    "startDate",
    "endDate"
})
public class QualifiedDomesticRelationsOrderReplacementDataType {

    @XmlElement(name = "Benefit_Coverage_Type_Reference", required = true)
    protected BenefitCoverageTypeObjectType benefitCoverageTypeReference;
    @XmlElement(name = "Start_Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "End_Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;

    /**
     * Gets the value of the benefitCoverageTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link BenefitCoverageTypeObjectType }
     *     
     */
    public BenefitCoverageTypeObjectType getBenefitCoverageTypeReference() {
        return benefitCoverageTypeReference;
    }

    /**
     * Sets the value of the benefitCoverageTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenefitCoverageTypeObjectType }
     *     
     */
    public void setBenefitCoverageTypeReference(BenefitCoverageTypeObjectType value) {
        this.benefitCoverageTypeReference = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

}
