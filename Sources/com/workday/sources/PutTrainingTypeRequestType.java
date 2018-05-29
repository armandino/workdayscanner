
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request element for Put Training
 * 
 * <p>Java class for Put_Training_Type_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Training_Type_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Training_Type_Reference" type="{urn:com.workday/bsvc}Training_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Training_Type_Data" type="{urn:com.workday/bsvc}Training_Type_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Add_Only" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute ref="{urn:com.workday/bsvc}version"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Put_Training_Type_RequestType", propOrder = {
    "trainingTypeReference",
    "trainingTypeData"
})
public class PutTrainingTypeRequestType {

    @XmlElement(name = "Training_Type_Reference")
    protected TrainingTypeObjectType trainingTypeReference;
    @XmlElement(name = "Training_Type_Data")
    protected TrainingTypeDataType trainingTypeData;
    @XmlAttribute(name = "Add_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean addOnly;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

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
     * @return
     *     possible object is
     *     {@link TrainingTypeDataType }
     *     
     */
    public TrainingTypeDataType getTrainingTypeData() {
        return trainingTypeData;
    }

    /**
     * Sets the value of the trainingTypeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainingTypeDataType }
     *     
     */
    public void setTrainingTypeData(TrainingTypeDataType value) {
        this.trainingTypeData = value;
    }

    /**
     * Gets the value of the addOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddOnly() {
        return addOnly;
    }

    /**
     * Sets the value of the addOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddOnly(Boolean value) {
        this.addOnly = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
