
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Wrapper element for Training information.
 * 
 * <p>Java class for Training_Achievement_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Training_Achievement_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Training_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remove_Training" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Training" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Training_Type_Reference" type="{urn:com.workday/bsvc}Training_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Completion_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Training_Duration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Training_Achievement_DataType", propOrder = {
    "trainingID",
    "removeTraining",
    "training",
    "description",
    "trainingTypeReference",
    "completionDate",
    "trainingDuration"
})
public class TrainingAchievementDataType {

    @XmlElement(name = "Training_ID")
    protected String trainingID;
    @XmlElement(name = "Remove_Training")
    protected Boolean removeTraining;
    @XmlElement(name = "Training")
    protected String training;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Training_Type_Reference")
    protected TrainingTypeObjectType trainingTypeReference;
    @XmlElement(name = "Completion_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar completionDate;
    @XmlElement(name = "Training_Duration")
    protected String trainingDuration;

    /**
     * Gets the value of the trainingID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainingID() {
        return trainingID;
    }

    /**
     * Sets the value of the trainingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainingID(String value) {
        this.trainingID = value;
    }

    /**
     * Gets the value of the removeTraining property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoveTraining() {
        return removeTraining;
    }

    /**
     * Sets the value of the removeTraining property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoveTraining(Boolean value) {
        this.removeTraining = value;
    }

    /**
     * Gets the value of the training property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraining() {
        return training;
    }

    /**
     * Sets the value of the training property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraining(String value) {
        this.training = value;
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
     * Gets the value of the completionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompletionDate() {
        return completionDate;
    }

    /**
     * Sets the value of the completionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompletionDate(XMLGregorianCalendar value) {
        this.completionDate = value;
    }

    /**
     * Gets the value of the trainingDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainingDuration() {
        return trainingDuration;
    }

    /**
     * Sets the value of the trainingDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainingDuration(String value) {
        this.trainingDuration = value;
    }

}
