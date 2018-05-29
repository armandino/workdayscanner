
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing all Personal Information for a Person.
 * 
 * <p>Java class for Personal_Info_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Personal_Info_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Business_Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Person_Data" type="{urn:com.workday/bsvc}Person_DataType" minOccurs="0"/>
 *         &lt;element name="Qualification_Data" type="{urn:com.workday/bsvc}Qualification_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Personal_Info_DataType", propOrder = {
    "businessTitle",
    "personData",
    "qualificationData"
})
public class PersonalInfoDataType {

    @XmlElement(name = "Business_Title")
    protected String businessTitle;
    @XmlElement(name = "Person_Data")
    protected PersonDataType personData;
    @XmlElement(name = "Qualification_Data")
    protected QualificationDataType qualificationData;

    /**
     * Gets the value of the businessTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessTitle() {
        return businessTitle;
    }

    /**
     * Sets the value of the businessTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessTitle(String value) {
        this.businessTitle = value;
    }

    /**
     * Gets the value of the personData property.
     * 
     * @return
     *     possible object is
     *     {@link PersonDataType }
     *     
     */
    public PersonDataType getPersonData() {
        return personData;
    }

    /**
     * Sets the value of the personData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonDataType }
     *     
     */
    public void setPersonData(PersonDataType value) {
        this.personData = value;
    }

    /**
     * Gets the value of the qualificationData property.
     * 
     * @return
     *     possible object is
     *     {@link QualificationDataType }
     *     
     */
    public QualificationDataType getQualificationData() {
        return qualificationData;
    }

    /**
     * Sets the value of the qualificationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualificationDataType }
     *     
     */
    public void setQualificationData(QualificationDataType value) {
        this.qualificationData = value;
    }

}
