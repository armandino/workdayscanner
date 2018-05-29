
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The request component of the Put Difficulty to Fill web service task.
 * 
 * <p>Java class for Put_Difficulty_to_Fill_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Difficulty_to_Fill_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Difficulty_to_Fill_Reference" type="{urn:com.workday/bsvc}Difficulty_to_FillObjectType" minOccurs="0"/>
 *         &lt;element name="Difficulty_to_Fill_Data" type="{urn:com.workday/bsvc}Difficulty_to_Fill_DataType"/>
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
@XmlType(name = "Put_Difficulty_to_Fill_RequestType", propOrder = {
    "difficultyToFillReference",
    "difficultyToFillData"
})
public class PutDifficultyToFillRequestType {

    @XmlElement(name = "Difficulty_to_Fill_Reference")
    protected DifficultyToFillObjectType difficultyToFillReference;
    @XmlElement(name = "Difficulty_to_Fill_Data", required = true)
    protected DifficultyToFillDataType difficultyToFillData;
    @XmlAttribute(name = "Add_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean addOnly;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

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
