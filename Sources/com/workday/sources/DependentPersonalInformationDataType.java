
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Wrapper element for this dependent's personal information.
 * 
 * <p>Java class for Dependent_Personal_Information_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dependent_Personal_Information_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Person_Name_Data" type="{urn:com.workday/bsvc}Person_Name_DataType" minOccurs="0"/>
 *         &lt;element name="Contact_Information_Data" type="{urn:com.workday/bsvc}Contact_Information_DataType" minOccurs="0"/>
 *         &lt;element name="Person_Identification_Data" type="{urn:com.workday/bsvc}Person_Identification_DataType" minOccurs="0"/>
 *         &lt;element name="Date_of_Birth" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Date_of_Death" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Gender_Reference" type="{urn:com.workday/bsvc}GenderObjectType" minOccurs="0"/>
 *         &lt;element name="Uses_Tobacco" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Full-Time_Student" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Student_Status_Start_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Student_Status_End_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Disabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Inactive_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dependent_Personal_Information_DataType", propOrder = {
    "personNameData",
    "contactInformationData",
    "personIdentificationData",
    "dateOfBirth",
    "dateOfDeath",
    "genderReference",
    "usesTobacco",
    "fullTimeStudent",
    "studentStatusStartDate",
    "studentStatusEndDate",
    "disabled",
    "inactiveDate"
})
public class DependentPersonalInformationDataType {

    @XmlElement(name = "Person_Name_Data")
    protected PersonNameDataType personNameData;
    @XmlElement(name = "Contact_Information_Data")
    protected ContactInformationDataType contactInformationData;
    @XmlElement(name = "Person_Identification_Data")
    protected PersonIdentificationDataType personIdentificationData;
    @XmlElement(name = "Date_of_Birth")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElement(name = "Date_of_Death")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfDeath;
    @XmlElement(name = "Gender_Reference")
    protected GenderObjectType genderReference;
    @XmlElement(name = "Uses_Tobacco")
    protected Boolean usesTobacco;
    @XmlElement(name = "Full-Time_Student")
    protected Boolean fullTimeStudent;
    @XmlElement(name = "Student_Status_Start_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar studentStatusStartDate;
    @XmlElement(name = "Student_Status_End_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar studentStatusEndDate;
    @XmlElement(name = "Disabled")
    protected Boolean disabled;
    @XmlElement(name = "Inactive_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar inactiveDate;

    /**
     * Gets the value of the personNameData property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameDataType }
     *     
     */
    public PersonNameDataType getPersonNameData() {
        return personNameData;
    }

    /**
     * Sets the value of the personNameData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameDataType }
     *     
     */
    public void setPersonNameData(PersonNameDataType value) {
        this.personNameData = value;
    }

    /**
     * Gets the value of the contactInformationData property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformationDataType }
     *     
     */
    public ContactInformationDataType getContactInformationData() {
        return contactInformationData;
    }

    /**
     * Sets the value of the contactInformationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformationDataType }
     *     
     */
    public void setContactInformationData(ContactInformationDataType value) {
        this.contactInformationData = value;
    }

    /**
     * Gets the value of the personIdentificationData property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdentificationDataType }
     *     
     */
    public PersonIdentificationDataType getPersonIdentificationData() {
        return personIdentificationData;
    }

    /**
     * Sets the value of the personIdentificationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdentificationDataType }
     *     
     */
    public void setPersonIdentificationData(PersonIdentificationDataType value) {
        this.personIdentificationData = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the dateOfDeath property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfDeath() {
        return dateOfDeath;
    }

    /**
     * Sets the value of the dateOfDeath property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfDeath(XMLGregorianCalendar value) {
        this.dateOfDeath = value;
    }

    /**
     * Gets the value of the genderReference property.
     * 
     * @return
     *     possible object is
     *     {@link GenderObjectType }
     *     
     */
    public GenderObjectType getGenderReference() {
        return genderReference;
    }

    /**
     * Sets the value of the genderReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderObjectType }
     *     
     */
    public void setGenderReference(GenderObjectType value) {
        this.genderReference = value;
    }

    /**
     * Gets the value of the usesTobacco property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsesTobacco() {
        return usesTobacco;
    }

    /**
     * Sets the value of the usesTobacco property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsesTobacco(Boolean value) {
        this.usesTobacco = value;
    }

    /**
     * Gets the value of the fullTimeStudent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFullTimeStudent() {
        return fullTimeStudent;
    }

    /**
     * Sets the value of the fullTimeStudent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFullTimeStudent(Boolean value) {
        this.fullTimeStudent = value;
    }

    /**
     * Gets the value of the studentStatusStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStudentStatusStartDate() {
        return studentStatusStartDate;
    }

    /**
     * Sets the value of the studentStatusStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStudentStatusStartDate(XMLGregorianCalendar value) {
        this.studentStatusStartDate = value;
    }

    /**
     * Gets the value of the studentStatusEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStudentStatusEndDate() {
        return studentStatusEndDate;
    }

    /**
     * Sets the value of the studentStatusEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStudentStatusEndDate(XMLGregorianCalendar value) {
        this.studentStatusEndDate = value;
    }

    /**
     * Gets the value of the disabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisabled() {
        return disabled;
    }

    /**
     * Sets the value of the disabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisabled(Boolean value) {
        this.disabled = value;
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

}
