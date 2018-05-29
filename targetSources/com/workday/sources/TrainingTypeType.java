
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Training Type Response Data
 * 
 * <p>Java class for Training_TypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Training_TypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Training_Type_Reference" type="{urn:com.workday/bsvc}Training_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Training_Type_Data" type="{urn:com.workday/bsvc}Training_Type_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Training_TypeType", propOrder = {
    "trainingTypeReference",
    "trainingTypeData"
})
public class TrainingTypeType {

    @XmlElement(name = "Training_Type_Reference")
    protected TrainingTypeObjectType trainingTypeReference;
    @XmlElement(name = "Training_Type_Data")
    protected List<TrainingTypeDataType> trainingTypeData;

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
     * Gets the value of the trainingTypeData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trainingTypeData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrainingTypeData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrainingTypeDataType }
     * 
     * 
     */
    public List<TrainingTypeDataType> getTrainingTypeData() {
        if (trainingTypeData == null) {
            trainingTypeData = new ArrayList<TrainingTypeDataType>();
        }
        return this.trainingTypeData;
    }

}
