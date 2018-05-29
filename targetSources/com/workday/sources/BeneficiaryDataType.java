
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Contains the details about the beneficiary.
 * 
 * <p>Java class for Beneficiary_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Beneficiary_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Beneficiary_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Irrevocable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Inactive_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Court_Order" type="{urn:com.workday/bsvc}Qualified_Domestic_Relations_Order_Replacement_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Beneficiary_DataType", propOrder = {
    "beneficiaryID",
    "irrevocable",
    "inactiveDate",
    "courtOrder"
})
public class BeneficiaryDataType {

    @XmlElement(name = "Beneficiary_ID")
    protected String beneficiaryID;
    @XmlElement(name = "Irrevocable")
    protected Boolean irrevocable;
    @XmlElement(name = "Inactive_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar inactiveDate;
    @XmlElement(name = "Court_Order")
    protected List<QualifiedDomesticRelationsOrderReplacementDataType> courtOrder;

    /**
     * Gets the value of the beneficiaryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryID() {
        return beneficiaryID;
    }

    /**
     * Sets the value of the beneficiaryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryID(String value) {
        this.beneficiaryID = value;
    }

    /**
     * Gets the value of the irrevocable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIrrevocable() {
        return irrevocable;
    }

    /**
     * Sets the value of the irrevocable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIrrevocable(Boolean value) {
        this.irrevocable = value;
    }

    /**
     * Gets the value of the inactiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInactiveDate() {
        return inactiveDate;
    }

    /**
     * Sets the value of the inactiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInactiveDate(XMLGregorianCalendar value) {
        this.inactiveDate = value;
    }

    /**
     * Gets the value of the courtOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the courtOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCourtOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedDomesticRelationsOrderReplacementDataType }
     * 
     * 
     */
    public List<QualifiedDomesticRelationsOrderReplacementDataType> getCourtOrder() {
        if (courtOrder == null) {
            courtOrder = new ArrayList<QualifiedDomesticRelationsOrderReplacementDataType>();
        }
        return this.courtOrder;
    }

}
