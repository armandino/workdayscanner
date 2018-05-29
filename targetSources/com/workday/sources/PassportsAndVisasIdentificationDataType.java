
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper for Passports and Visas Identification Data. Includes Passport Identifiers and Visa Identifiers
 * 
 * <p>Java class for Passports_and_Visas_Identification_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Passports_and_Visas_Identification_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Passport_ID" type="{urn:com.workday/bsvc}Passport_IDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Visa_ID" type="{urn:com.workday/bsvc}Visa_IDType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Replace_All" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Passports_and_Visas_Identification_DataType", propOrder = {
    "passportID",
    "visaID"
})
public class PassportsAndVisasIdentificationDataType {

    @XmlElement(name = "Passport_ID")
    protected List<PassportIDType> passportID;
    @XmlElement(name = "Visa_ID")
    protected List<VisaIDType> visaID;
    @XmlAttribute(name = "Replace_All", namespace = "urn:com.workday/bsvc")
    protected Boolean replaceAll;

    /**
     * Gets the value of the passportID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passportID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassportID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassportIDType }
     * 
     * 
     */
    public List<PassportIDType> getPassportID() {
        if (passportID == null) {
            passportID = new ArrayList<PassportIDType>();
        }
        return this.passportID;
    }

    /**
     * Gets the value of the visaID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the visaID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVisaID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VisaIDType }
     * 
     * 
     */
    public List<VisaIDType> getVisaID() {
        if (visaID == null) {
            visaID = new ArrayList<VisaIDType>();
        }
        return this.visaID;
    }

    /**
     * Gets the value of the replaceAll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReplaceAll() {
        return replaceAll;
    }

    /**
     * Sets the value of the replaceAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReplaceAll(Boolean value) {
        this.replaceAll = value;
    }

}
