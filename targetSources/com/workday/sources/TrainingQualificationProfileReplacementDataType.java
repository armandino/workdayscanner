
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Replacement element containing Training Qualifications for the Job Profile
 * When updating a Job Profile, all Training Qualifications for the Job Profile will be replaced by the submitted data. If no data is submitted, then the existing Training Qualifications are not changed.
 * 
 * <p>Java class for Training_Qualification_Profile_Replacement_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Training_Qualification_Profile_Replacement_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Training_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Training_Type_Reference" type="{urn:com.workday/bsvc}Training_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Required" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Training_Qualification_Profile_Replacement_DataType", propOrder = {
    "trainingName",
    "description",
    "trainingTypeReference",
    "required"
})
public class TrainingQualificationProfileReplacementDataType {

    @XmlElement(name = "Training_Name")
    protected String trainingName;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Training_Type_Reference")
    protected TrainingTypeObjectType trainingTypeReference;
    @XmlElement(name = "Required")
    protected Boolean required;

    /**
     * Gets the value of the trainingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainingName() {
        return trainingName;
    }

    /**
     * Sets the value of the trainingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainingName(String value) {
        this.trainingName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the trainingTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link TrainingTypeObjectType }
     *     
     */
    public TrainingTypeObjectType getTrainingTypeReference() {
        return trainingTypeReference;
    }

    /**
     * Sets the value of the trainingTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainingTypeObjectType }
     *     
     */
    public void setTrainingTypeReference(TrainingTypeObjectType value) {
        this.trainingTypeReference = value;
    }

    /**
     * Gets the value of the required property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequired(Boolean value) {
        this.required = value;
    }

}
