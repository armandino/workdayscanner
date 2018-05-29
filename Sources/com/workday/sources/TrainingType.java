
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for Training information.
 * 
 * <p>Java class for TrainingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrainingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Training_Reference" type="{urn:com.workday/bsvc}TrainingObjectType" minOccurs="0"/>
 *         &lt;element name="Training_Data" type="{urn:com.workday/bsvc}Training_Achievement_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainingType", propOrder = {
    "trainingReference",
    "trainingData"
})
public class TrainingType {

    @XmlElement(name = "Training_Reference")
    protected TrainingObjectType trainingReference;
    @XmlElement(name = "Training_Data")
    protected List<TrainingAchievementDataType> trainingData;

    /**
     * Gets the value of the trainingReference property.
     * 
     * @return
     *     possible object is
     *     {@link TrainingObjectType }
     *     
     */
    public TrainingObjectType getTrainingReference() {
        return trainingReference;
    }

    /**
     * Sets the value of the trainingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainingObjectType }
     *     
     */
    public void setTrainingReference(TrainingObjectType value) {
        this.trainingReference = value;
    }

    /**
     * Gets the value of the trainingData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trainingData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrainingData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrainingAchievementDataType }
     * 
     * 
     */
    public List<TrainingAchievementDataType> getTrainingData() {
        if (trainingData == null) {
            trainingData = new ArrayList<TrainingAchievementDataType>();
        }
        return this.trainingData;
    }

}
