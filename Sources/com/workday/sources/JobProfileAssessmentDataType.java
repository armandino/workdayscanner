
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The inline recruiting assessment test and default Recruiting assessment tests for the job profile.
 * 
 * <p>Java class for Job_Profile_Assessment_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job_Profile_Assessment_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Inline_Recruiting_Assessment_Test_Reference" type="{urn:com.workday/bsvc}Recruiting_Assessment_TestObjectType" minOccurs="0"/>
 *         &lt;element name="Default_Recruiting_Assessment_Tests_Reference" type="{urn:com.workday/bsvc}Recruiting_Assessment_TestObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job_Profile_Assessment_DataType", propOrder = {
    "inlineRecruitingAssessmentTestReference",
    "defaultRecruitingAssessmentTestsReference"
})
public class JobProfileAssessmentDataType {

    @XmlElement(name = "Inline_Recruiting_Assessment_Test_Reference")
    protected RecruitingAssessmentTestObjectType inlineRecruitingAssessmentTestReference;
    @XmlElement(name = "Default_Recruiting_Assessment_Tests_Reference")
    protected List<RecruitingAssessmentTestObjectType> defaultRecruitingAssessmentTestsReference;

    /**
     * Gets the value of the inlineRecruitingAssessmentTestReference property.
     * 
     * @return
     *     possible object is
     *     {@link RecruitingAssessmentTestObjectType }
     *     
     */
    public RecruitingAssessmentTestObjectType getInlineRecruitingAssessmentTestReference() {
        return inlineRecruitingAssessmentTestReference;
    }

    /**
     * Sets the value of the inlineRecruitingAssessmentTestReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecruitingAssessmentTestObjectType }
     *     
     */
    public void setInlineRecruitingAssessmentTestReference(RecruitingAssessmentTestObjectType value) {
        this.inlineRecruitingAssessmentTestReference = value;
    }

    /**
     * Gets the value of the defaultRecruitingAssessmentTestsReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defaultRecruitingAssessmentTestsReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefaultRecruitingAssessmentTestsReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecruitingAssessmentTestObjectType }
     * 
     * 
     */
    public List<RecruitingAssessmentTestObjectType> getDefaultRecruitingAssessmentTestsReference() {
        if (defaultRecruitingAssessmentTestsReference == null) {
            defaultRecruitingAssessmentTestsReference = new ArrayList<RecruitingAssessmentTestObjectType>();
        }
        return this.defaultRecruitingAssessmentTestsReference;
    }

}
