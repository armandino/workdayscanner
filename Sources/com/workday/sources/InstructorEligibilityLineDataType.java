
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains Instructor Eligibility Line Data
 * 
 * <p>Java class for Instructor_Eligibility_Line_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Instructor_Eligibility_Line_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Academic_Unit_Reference" type="{urn:com.workday/bsvc}Academic_UnitObjectType" minOccurs="0"/>
 *         &lt;element name="Academic_Level_Reference" type="{urn:com.workday/bsvc}Academic_LevelObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Course_Subject_Reference" type="{urn:com.workday/bsvc}Course_SubjectObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Course_Reference" type="{urn:com.workday/bsvc}Course_DefinitionObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Delivery_Mode_Reference" type="{urn:com.workday/bsvc}Delivery_ModeObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Course_Tag_Reference" type="{urn:com.workday/bsvc}Student_Course_TagObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Location_Reference" type="{urn:com.workday/bsvc}LocationObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Educational_Taxonomy_Code_Reference" type="{urn:com.workday/bsvc}Educational_Taxonomy_CodeObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Instructor_Eligibility_Line_DataType", propOrder = {
    "academicUnitReference",
    "academicLevelReference",
    "courseSubjectReference",
    "courseReference",
    "deliveryModeReference",
    "courseTagReference",
    "locationReference",
    "educationalTaxonomyCodeReference"
})
public class InstructorEligibilityLineDataType {

    @XmlElement(name = "Academic_Unit_Reference")
    protected AcademicUnitObjectType academicUnitReference;
    @XmlElement(name = "Academic_Level_Reference")
    protected List<AcademicLevelObjectType> academicLevelReference;
    @XmlElement(name = "Course_Subject_Reference")
    protected List<CourseSubjectObjectType> courseSubjectReference;
    @XmlElement(name = "Course_Reference")
    protected List<CourseDefinitionObjectType> courseReference;
    @XmlElement(name = "Delivery_Mode_Reference")
    protected List<DeliveryModeObjectType> deliveryModeReference;
    @XmlElement(name = "Course_Tag_Reference")
    protected List<StudentCourseTagObjectType> courseTagReference;
    @XmlElement(name = "Location_Reference")
    protected List<LocationObjectType> locationReference;
    @XmlElement(name = "Educational_Taxonomy_Code_Reference")
    protected List<EducationalTaxonomyCodeObjectType> educationalTaxonomyCodeReference;

    /**
     * Gets the value of the academicUnitReference property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicUnitObjectType }
     *     
     */
    public AcademicUnitObjectType getAcademicUnitReference() {
        return academicUnitReference;
    }

    /**
     * Sets the value of the academicUnitReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicUnitObjectType }
     *     
     */
    public void setAcademicUnitReference(AcademicUnitObjectType value) {
        this.academicUnitReference = value;
    }

    /**
     * Gets the value of the academicLevelReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the academicLevelReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcademicLevelReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcademicLevelObjectType }
     * 
     * 
     */
    public List<AcademicLevelObjectType> getAcademicLevelReference() {
        if (academicLevelReference == null) {
            academicLevelReference = new ArrayList<AcademicLevelObjectType>();
        }
        return this.academicLevelReference;
    }

    /**
     * Gets the value of the courseSubjectReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the courseSubjectReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCourseSubjectReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CourseSubjectObjectType }
     * 
     * 
     */
    public List<CourseSubjectObjectType> getCourseSubjectReference() {
        if (courseSubjectReference == null) {
            courseSubjectReference = new ArrayList<CourseSubjectObjectType>();
        }
        return this.courseSubjectReference;
    }

    /**
     * Gets the value of the courseReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the courseReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCourseReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CourseDefinitionObjectType }
     * 
     * 
     */
    public List<CourseDefinitionObjectType> getCourseReference() {
        if (courseReference == null) {
            courseReference = new ArrayList<CourseDefinitionObjectType>();
        }
        return this.courseReference;
    }

    /**
     * Gets the value of the deliveryModeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryModeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryModeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryModeObjectType }
     * 
     * 
     */
    public List<DeliveryModeObjectType> getDeliveryModeReference() {
        if (deliveryModeReference == null) {
            deliveryModeReference = new ArrayList<DeliveryModeObjectType>();
        }
        return this.deliveryModeReference;
    }

    /**
     * Gets the value of the courseTagReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the courseTagReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCourseTagReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StudentCourseTagObjectType }
     * 
     * 
     */
    public List<StudentCourseTagObjectType> getCourseTagReference() {
        if (courseTagReference == null) {
            courseTagReference = new ArrayList<StudentCourseTagObjectType>();
        }
        return this.courseTagReference;
    }

    /**
     * Gets the value of the locationReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationObjectType }
     * 
     * 
     */
    public List<LocationObjectType> getLocationReference() {
        if (locationReference == null) {
            locationReference = new ArrayList<LocationObjectType>();
        }
        return this.locationReference;
    }

    /**
     * Gets the value of the educationalTaxonomyCodeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the educationalTaxonomyCodeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEducationalTaxonomyCodeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EducationalTaxonomyCodeObjectType }
     * 
     * 
     */
    public List<EducationalTaxonomyCodeObjectType> getEducationalTaxonomyCodeReference() {
        if (educationalTaxonomyCodeReference == null) {
            educationalTaxonomyCodeReference = new ArrayList<EducationalTaxonomyCodeObjectType>();
        }
        return this.educationalTaxonomyCodeReference;
    }

}
