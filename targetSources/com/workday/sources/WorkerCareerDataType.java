
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the current career information for an employee. This includes the travel and relocation preferences, job profiles the employee is interested in, and their career interests
 * 
 * <p>Java class for Worker_Career_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Worker_Career_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Relocation_Data" type="{urn:com.workday/bsvc}Relocation_Preference_DataType" minOccurs="0"/>
 *         &lt;element name="Travel_Data" type="{urn:com.workday/bsvc}Travel_Preference_DataType" minOccurs="0"/>
 *         &lt;element name="Job_Interests_Data" type="{urn:com.workday/bsvc}Job_Interests_DataType" minOccurs="0"/>
 *         &lt;element name="Career_Interests_Data" type="{urn:com.workday/bsvc}Career_Preferences_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Worker_Career_DataType", propOrder = {
    "relocationData",
    "travelData",
    "jobInterestsData",
    "careerInterestsData"
})
public class WorkerCareerDataType {

    @XmlElement(name = "Relocation_Data")
    protected RelocationPreferenceDataType relocationData;
    @XmlElement(name = "Travel_Data")
    protected TravelPreferenceDataType travelData;
    @XmlElement(name = "Job_Interests_Data")
    protected JobInterestsDataType jobInterestsData;
    @XmlElement(name = "Career_Interests_Data")
    protected CareerPreferencesDataType careerInterestsData;

    /**
     * Gets the value of the relocationData property.
     * 
     * @return
     *     possible object is
     *     {@link RelocationPreferenceDataType }
     *     
     */
    public RelocationPreferenceDataType getRelocationData() {
        return relocationData;
    }

    /**
     * Sets the value of the relocationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelocationPreferenceDataType }
     *     
     */
    public void setRelocationData(RelocationPreferenceDataType value) {
        this.relocationData = value;
    }

    /**
     * Gets the value of the travelData property.
     * 
     * @return
     *     possible object is
     *     {@link TravelPreferenceDataType }
     *     
     */
    public TravelPreferenceDataType getTravelData() {
        return travelData;
    }

    /**
     * Sets the value of the travelData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelPreferenceDataType }
     *     
     */
    public void setTravelData(TravelPreferenceDataType value) {
        this.travelData = value;
    }

    /**
     * Gets the value of the jobInterestsData property.
     * 
     * @return
     *     possible object is
     *     {@link JobInterestsDataType }
     *     
     */
    public JobInterestsDataType getJobInterestsData() {
        return jobInterestsData;
    }

    /**
     * Sets the value of the jobInterestsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobInterestsDataType }
     *     
     */
    public void setJobInterestsData(JobInterestsDataType value) {
        this.jobInterestsData = value;
    }

    /**
     * Gets the value of the careerInterestsData property.
     * 
     * @return
     *     possible object is
     *     {@link CareerPreferencesDataType }
     *     
     */
    public CareerPreferencesDataType getCareerInterestsData() {
        return careerInterestsData;
    }

    /**
     * Sets the value of the careerInterestsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CareerPreferencesDataType }
     *     
     */
    public void setCareerInterestsData(CareerPreferencesDataType value) {
        this.careerInterestsData = value;
    }

}
