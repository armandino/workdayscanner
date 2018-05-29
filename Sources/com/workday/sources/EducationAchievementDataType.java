
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Wrapper element for Education information.
 * 
 * <p>Java class for Education_Achievement_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Education_Achievement_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Education_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remove_Education" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Country_Reference" type="{urn:com.workday/bsvc}CountryObjectType" minOccurs="0"/>
 *         &lt;element name="School_Reference" type="{urn:com.workday/bsvc}SchoolObjectType" minOccurs="0"/>
 *         &lt;element name="School_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="School_Type_Reference" type="{urn:com.workday/bsvc}School_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Degree_Reference" type="{urn:com.workday/bsvc}DegreeObjectType" minOccurs="0"/>
 *         &lt;element name="Degree_Completed_Reference" type="{urn:com.workday/bsvc}Degree_CompletedObjectType" minOccurs="0"/>
 *         &lt;element name="Date_Degree_Received" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Field_Of_Study_Reference" type="{urn:com.workday/bsvc}Field_of_StudyObjectType" minOccurs="0"/>
 *         &lt;element name="Grade_Average" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="First_Year_Attended" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Last_Year_Attended" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Is_Highest_Level_of_Education" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="First_Day_Attended" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Last_Day_Attended" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Education_Achievement_DataType", propOrder = {
    "educationID",
    "removeEducation",
    "countryReference",
    "schoolReference",
    "schoolName",
    "schoolTypeReference",
    "location",
    "degreeReference",
    "degreeCompletedReference",
    "dateDegreeReceived",
    "fieldOfStudyReference",
    "gradeAverage",
    "firstYearAttended",
    "lastYearAttended",
    "isHighestLevelOfEducation",
    "firstDayAttended",
    "lastDayAttended"
})
public class EducationAchievementDataType {

    @XmlElement(name = "Education_ID")
    protected String educationID;
    @XmlElement(name = "Remove_Education")
    protected Boolean removeEducation;
    @XmlElement(name = "Country_Reference")
    protected CountryObjectType countryReference;
    @XmlElement(name = "School_Reference")
    protected SchoolObjectType schoolReference;
    @XmlElement(name = "School_Name")
    protected String schoolName;
    @XmlElement(name = "School_Type_Reference")
    protected SchoolTypeObjectType schoolTypeReference;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "Degree_Reference")
    protected DegreeObjectType degreeReference;
    @XmlElement(name = "Degree_Completed_Reference")
    protected DegreeCompletedObjectType degreeCompletedReference;
    @XmlElement(name = "Date_Degree_Received")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateDegreeReceived;
    @XmlElement(name = "Field_Of_Study_Reference")
    protected FieldOfStudyObjectType fieldOfStudyReference;
    @XmlElement(name = "Grade_Average")
    protected String gradeAverage;
    @XmlElement(name = "First_Year_Attended")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstYearAttended;
    @XmlElement(name = "Last_Year_Attended")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastYearAttended;
    @XmlElement(name = "Is_Highest_Level_of_Education")
    protected Boolean isHighestLevelOfEducation;
    @XmlElement(name = "First_Day_Attended")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstDayAttended;
    @XmlElement(name = "Last_Day_Attended")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastDayAttended;

    /**
     * Gets the value of the educationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationID() {
        return educationID;
    }

    /**
     * Sets the value of the educationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationID(String value) {
        this.educationID = value;
    }

    /**
     * Gets the value of the removeEducation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoveEducation() {
        return removeEducation;
    }

    /**
     * Sets the value of the removeEducation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoveEducation(Boolean value) {
        this.removeEducation = value;
    }

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
     * Gets the value of the schoolName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolName() {
        return schoolName;
    }

    /**
     * Sets the value of the schoolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolName(String value) {
        this.schoolName = value;
    }

    /**
     * Gets the value of the schoolTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link SchoolTypeObjectType }
     *     
     */
    public SchoolTypeObjectType getSchoolTypeReference() {
        return schoolTypeReference;
    }

    /**
     * Sets the value of the schoolTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchoolTypeObjectType }
     *     
     */
    public void setSchoolTypeReference(SchoolTypeObjectType value) {
        this.schoolTypeReference = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the degreeReference property.
     * 
     * @return
     *     possible object is
     *     {@link DegreeObjectType }
     *     
     */
    public DegreeObjectType getDegreeReference() {
        return degreeReference;
    }

    /**
     * Sets the value of the degreeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DegreeObjectType }
     *     
     */
    public void setDegreeReference(DegreeObjectType value) {
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
     * Gets the value of the dateDegreeReceived property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateDegreeReceived() {
        return dateDegreeReceived;
    }

    /**
     * Sets the value of the dateDegreeReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateDegreeReceived(XMLGregorianCalendar value) {
        this.dateDegreeReceived = value;
    }

    /**
     * Gets the value of the fieldOfStudyReference property.
     * 
     * @return
     *     possible object is
     *     {@link FieldOfStudyObjectType }
     *     
     */
    public FieldOfStudyObjectType getFieldOfStudyReference() {
        return fieldOfStudyReference;
    }

    /**
     * Sets the value of the fieldOfStudyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldOfStudyObjectType }
     *     
     */
    public void setFieldOfStudyReference(FieldOfStudyObjectType value) {
        this.fieldOfStudyReference = value;
    }

    /**
     * Gets the value of the gradeAverage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGradeAverage() {
        return gradeAverage;
    }

    /**
     * Sets the value of the gradeAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGradeAverage(String value) {
        this.gradeAverage = value;
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

    /**
     * Gets the value of the isHighestLevelOfEducation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsHighestLevelOfEducation() {
        return isHighestLevelOfEducation;
    }

    /**
     * Sets the value of the isHighestLevelOfEducation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsHighestLevelOfEducation(Boolean value) {
        this.isHighestLevelOfEducation = value;
    }

    /**
     * Gets the value of the firstDayAttended property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstDayAttended() {
        return firstDayAttended;
    }

    /**
     * Sets the value of the firstDayAttended property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstDayAttended(XMLGregorianCalendar value) {
        this.firstDayAttended = value;
    }

    /**
     * Gets the value of the lastDayAttended property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastDayAttended() {
        return lastDayAttended;
    }

    /**
     * Sets the value of the lastDayAttended property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastDayAttended(XMLGregorianCalendar value) {
        this.lastDayAttended = value;
    }

}
