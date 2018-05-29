
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Encapsulating element containing all Education data.
 * 
 * <p>Java class for Education_History_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Education_History_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Country_Reference" type="{urn:com.workday/bsvc}CountryObjectType" minOccurs="0"/>
 *         &lt;element name="School_Reference" type="{urn:com.workday/bsvc}SchoolObjectType" minOccurs="0"/>
 *         &lt;element name="Education_Institution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Educational_Institution_Type_Reference" type="{urn:com.workday/bsvc}School_Type_ReferenceType" minOccurs="0"/>
 *         &lt;element name="Degree_Reference" type="{urn:com.workday/bsvc}Degree_ReferenceType"/>
 *         &lt;element name="Degree_Completed_Reference" type="{urn:com.workday/bsvc}Degree_CompletedObjectType" minOccurs="0"/>
 *         &lt;element name="Field_Of_Study_Reference" type="{urn:com.workday/bsvc}Field_Of_Study_ReferenceType" minOccurs="0"/>
 *         &lt;element name="Education_Institution_Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Education_Grade_Average" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="First_Year_Attended" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Last_Year_Attended" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Education_History_DataType", propOrder = {
    "countryReference",
    "schoolReference",
    "educationInstitution",
    "educationalInstitutionTypeReference",
    "degreeReference",
    "degreeCompletedReference",
    "fieldOfStudyReference",
    "educationInstitutionLocation",
    "educationGradeAverage",
    "firstYearAttended",
    "lastYearAttended"
})
public class EducationHistoryDataType {

    @XmlElement(name = "Country_Reference")
    protected CountryObjectType countryReference;
    @XmlElement(name = "School_Reference")
    protected SchoolObjectType schoolReference;
    @XmlElement(name = "Education_Institution")
    protected String educationInstitution;
    @XmlElement(name = "Educational_Institution_Type_Reference")
    protected SchoolTypeReferenceType educationalInstitutionTypeReference;
    @XmlElement(name = "Degree_Reference", required = true)
    protected DegreeReferenceType degreeReference;
    @XmlElement(name = "Degree_Completed_Reference")
    protected DegreeCompletedObjectType degreeCompletedReference;
    @XmlElement(name = "Field_Of_Study_Reference")
    protected FieldOfStudyReferenceType fieldOfStudyReference;
    @XmlElement(name = "Education_Institution_Location")
    protected String educationInstitutionLocation;
    @XmlElement(name = "Education_Grade_Average")
    protected String educationGradeAverage;
    @XmlElement(name = "First_Year_Attended")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstYearAttended;
    @XmlElement(name = "Last_Year_Attended")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastYearAttended;

    /**
     * Gets the value of the countryReference property.
     * 
     * @return
     *     possible object is
     *     {@link CountryObjectType }
     *     
     */
    public CountryObjectType getCountryReference() {
        return countryReference;
    }

    /**
     * Sets the value of the countryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryObjectType }
     *     
     */
    public void setCountryReference(CountryObjectType value) {
        this.countryReference = value;
    }

    /**
     * Gets the value of the schoolReference property.
     * 
     * @return
     *     possible object is
     *     {@link SchoolObjectType }
     *     
     */
    public SchoolObjectType getSchoolReference() {
        return schoolReference;
    }

    /**
     * Sets the value of the schoolReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchoolObjectType }
     *     
     */
    public void setSchoolReference(SchoolObjectType value) {
        this.schoolReference = value;
    }

    /**
     * Gets the value of the educationInstitution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationInstitution() {
        return educationInstitution;
    }

    /**
     * Sets the value of the educationInstitution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationInstitution(String value) {
        this.educationInstitution = value;
    }

    /**
     * Gets the value of the educationalInstitutionTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link SchoolTypeReferenceType }
     *     
     */
    public SchoolTypeReferenceType getEducationalInstitutionTypeReference() {
        return educationalInstitutionTypeReference;
    }

    /**
     * Sets the value of the educationalInstitutionTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchoolTypeReferenceType }
     *     
     */
    public void setEducationalInstitutionTypeReference(SchoolTypeReferenceType value) {
        this.educationalInstitutionTypeReference = value;
    }

    /**
     * Gets the value of the degreeReference property.
     * 
     * @return
     *     possible object is
     *     {@link DegreeReferenceType }
     *     
     */
    public DegreeReferenceType getDegreeReference() {
        return degreeReference;
    }

    /**
     * Sets the value of the degreeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DegreeReferenceType }
     *     
     */
    public void setDegreeReference(DegreeReferenceType value) {
        this.degreeReference = value;
    }

    /**
     * Gets the value of the degreeCompletedReference property.
     * 
     * @return
     *     possible object is
     *     {@link DegreeCompletedObjectType }
     *     
     */
    public DegreeCompletedObjectType getDegreeCompletedReference() {
        return degreeCompletedReference;
    }

    /**
     * Sets the value of the degreeCompletedReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DegreeCompletedObjectType }
     *     
     */
    public void setDegreeCompletedReference(DegreeCompletedObjectType value) {
        this.degreeCompletedReference = value;
    }

    /**
     * Gets the value of the fieldOfStudyReference property.
     * 
     * @return
     *     possible object is
     *     {@link FieldOfStudyReferenceType }
     *     
     */
    public FieldOfStudyReferenceType getFieldOfStudyReference() {
        return fieldOfStudyReference;
    }

    /**
     * Sets the value of the fieldOfStudyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldOfStudyReferenceType }
     *     
     */
    public void setFieldOfStudyReference(FieldOfStudyReferenceType value) {
        this.fieldOfStudyReference = value;
    }

    /**
     * Gets the value of the educationInstitutionLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationInstitutionLocation() {
        return educationInstitutionLocation;
    }

    /**
     * Sets the value of the educationInstitutionLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationInstitutionLocation(String value) {
        this.educationInstitutionLocation = value;
    }

    /**
     * Gets the value of the educationGradeAverage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationGradeAverage() {
        return educationGradeAverage;
    }

    /**
     * Sets the value of the educationGradeAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationGradeAverage(String value) {
        this.educationGradeAverage = value;
    }

    /**
     * Gets the value of the firstYearAttended property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstYearAttended() {
        return firstYearAttended;
    }

    /**
     * Sets the value of the firstYearAttended property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstYearAttended(XMLGregorianCalendar value) {
        this.firstYearAttended = value;
    }

    /**
     * Gets the value of the lastYearAttended property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastYearAttended() {
        return lastYearAttended;
    }

    /**
     * Sets the value of the lastYearAttended property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastYearAttended(XMLGregorianCalendar value) {
        this.lastYearAttended = value;
    }

}
