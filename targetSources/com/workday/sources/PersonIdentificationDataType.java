
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper for Person Identification Data. Includes National Identifiers, Government Identifiers, Visa Identifiers, Passport Identifiers, License Identifiers and Custom Identifiers.
 * 
 * <p>Java class for Person_Identification_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Person_Identification_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="National_ID" type="{urn:com.workday/bsvc}National_IDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Government_ID" type="{urn:com.workday/bsvc}Government_IDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Visa_ID" type="{urn:com.workday/bsvc}Visa_IDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Passport_ID" type="{urn:com.workday/bsvc}Passport_IDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="License_ID" type="{urn:com.workday/bsvc}License_IDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Custom_ID" type="{urn:com.workday/bsvc}Custom_IDType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person_Identification_DataType", propOrder = {
    "nationalID",
    "governmentID",
    "visaID",
    "passportID",
    "licenseID",
    "customID"
})
public class PersonIdentificationDataType {

    @XmlElement(name = "National_ID")
    protected List<NationalIDType> nationalID;
    @XmlElement(name = "Government_ID")
    protected List<GovernmentIDType> governmentID;
    @XmlElement(name = "Visa_ID")
    protected List<VisaIDType> visaID;
    @XmlElement(name = "Passport_ID")
    protected List<PassportIDType> passportID;
    @XmlElement(name = "License_ID")
    protected List<LicenseIDType> licenseID;
    @XmlElement(name = "Custom_ID")
    protected List<CustomIDType> customID;

    /**
     * Gets the value of the nationalID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nationalID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNationalID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NationalIDType }
     * 
     * 
     */
    public List<NationalIDType> getNationalID() {
        if (nationalID == null) {
            nationalID = new ArrayList<NationalIDType>();
        }
        return this.nationalID;
    }

    /**
     * Gets the value of the governmentID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the governmentID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGovernmentID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GovernmentIDType }
     * 
     * 
     */
    public List<GovernmentIDType> getGovernmentID() {
        if (governmentID == null) {
            governmentID = new ArrayList<GovernmentIDType>();
        }
        return this.governmentID;
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
     * Gets the value of the licenseID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the licenseID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLicenseID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LicenseIDType }
     * 
     * 
     */
    public List<LicenseIDType> getLicenseID() {
        if (licenseID == null) {
            licenseID = new ArrayList<LicenseIDType>();
        }
        return this.licenseID;
    }

    /**
     * Gets the value of the customID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomIDType }
     * 
     * 
     */
    public List<CustomIDType> getCustomID() {
        if (customID == null) {
            customID = new ArrayList<CustomIDType>();
        }
        return this.customID;
    }

}
