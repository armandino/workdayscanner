
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing all Qualification data.
 * 
 * <p>Java class for Qualification_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Qualification_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Education_Data" type="{urn:com.workday/bsvc}Education_History_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Professional_Experience_Data" type="{urn:com.workday/bsvc}Professional_Experience_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Qualification_DataType", propOrder = {
    "educationData",
    "professionalExperienceData"
})
public class QualificationDataType {

    @XmlElement(name = "Education_Data")
    protected List<EducationHistoryDataType> educationData;
    @XmlElement(name = "Professional_Experience_Data")
    protected List<ProfessionalExperienceDataType> professionalExperienceData;

    /**
     * Gets the value of the educationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the educationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEducationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EducationHistoryDataType }
     * 
     * 
     */
    public List<EducationHistoryDataType> getEducationData() {
        if (educationData == null) {
            educationData = new ArrayList<EducationHistoryDataType>();
        }
        return this.educationData;
    }

    /**
     * Gets the value of the professionalExperienceData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the professionalExperienceData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfessionalExperienceData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfessionalExperienceDataType }
     * 
     * 
     */
    public List<ProfessionalExperienceDataType> getProfessionalExperienceData() {
        if (professionalExperienceData == null) {
            professionalExperienceData = new ArrayList<ProfessionalExperienceDataType>();
        }
        return this.professionalExperienceData;
    }

}
