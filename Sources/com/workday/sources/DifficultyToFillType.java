
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Difficulty to Fill
 * 
 * <p>Java class for Difficulty_to_FillType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Difficulty_to_FillType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Difficulty_to_Fill_Reference" type="{urn:com.workday/bsvc}Difficulty_to_FillObjectType" minOccurs="0"/>
 *         &lt;element name="Difficulty_to_Fill_Data" type="{urn:com.workday/bsvc}Difficulty_to_Fill_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Difficulty_to_FillType", propOrder = {
    "difficultyToFillReference",
    "difficultyToFillData"
})
public class DifficultyToFillType {

    @XmlElement(name = "Difficulty_to_Fill_Reference")
    protected DifficultyToFillObjectType difficultyToFillReference;
    @XmlElement(name = "Difficulty_to_Fill_Data")
    protected DifficultyToFillDataType difficultyToFillData;

    /**
     * Gets the value of the difficultyToFillReference property.
     * 
     * @return
     *     possible object is
     *     {@link DifficultyToFillObjectType }
     *     
     */
    public DifficultyToFillObjectType getDifficultyToFillReference() {
        return difficultyToFillReference;
    }

    /**
     * Sets the value of the difficultyToFillReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DifficultyToFillObjectType }
     *     
     */
    public void setDifficultyToFillReference(DifficultyToFillObjectType value) {
        this.difficultyToFillReference = value;
    }

    /**
     * Gets the value of the difficultyToFillData property.
     * 
     * @return
     *     possible object is
     *     {@link DifficultyToFillDataType }
     *     
     */
    public DifficultyToFillDataType getDifficultyToFillData() {
        return difficultyToFillData;
    }

    /**
     * Sets the value of the difficultyToFillData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DifficultyToFillDataType }
     *     
     */
    public void setDifficultyToFillData(DifficultyToFillDataType value) {
        this.difficultyToFillData = value;
    }

}
