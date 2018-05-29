
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Container for the difficulty to fill data.
 * 
 * <p>Java class for Difficulty_to_Fill_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Difficulty_to_Fill_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Difficulty_to_Fill_Sort_Order" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Difficulty_to_Fill_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Difficulty_to_Fill_Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Difficulty_to_Fill_Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Difficulty_to_Fill_Inactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Difficulty_to_Fill_DataType", propOrder = {
    "difficultyToFillSortOrder",
    "difficultyToFillName",
    "difficultyToFillCode",
    "difficultyToFillDescription",
    "difficultyToFillInactive"
})
public class DifficultyToFillDataType {

    @XmlElement(name = "Difficulty_to_Fill_Sort_Order", required = true)
    protected String difficultyToFillSortOrder;
    @XmlElement(name = "Difficulty_to_Fill_Name", required = true)
    protected String difficultyToFillName;
    @XmlElement(name = "Difficulty_to_Fill_Code", required = true)
    protected String difficultyToFillCode;
    @XmlElement(name = "Difficulty_to_Fill_Description")
    protected String difficultyToFillDescription;
    @XmlElement(name = "Difficulty_to_Fill_Inactive")
    protected Boolean difficultyToFillInactive;

    /**
     * Gets the value of the difficultyToFillSortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDifficultyToFillSortOrder() {
        return difficultyToFillSortOrder;
    }

    /**
     * Sets the value of the difficultyToFillSortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDifficultyToFillSortOrder(String value) {
        this.difficultyToFillSortOrder = value;
    }

    /**
     * Gets the value of the difficultyToFillName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDifficultyToFillName() {
        return difficultyToFillName;
    }

    /**
     * Sets the value of the difficultyToFillName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDifficultyToFillName(String value) {
        this.difficultyToFillName = value;
    }

    /**
     * Gets the value of the difficultyToFillCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDifficultyToFillCode() {
        return difficultyToFillCode;
    }

    /**
     * Sets the value of the difficultyToFillCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDifficultyToFillCode(String value) {
        this.difficultyToFillCode = value;
    }

    /**
     * Gets the value of the difficultyToFillDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDifficultyToFillDescription() {
        return difficultyToFillDescription;
    }

    /**
     * Sets the value of the difficultyToFillDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDifficultyToFillDescription(String value) {
        this.difficultyToFillDescription = value;
    }

    /**
     * Gets the value of the difficultyToFillInactive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDifficultyToFillInactive() {
        return difficultyToFillInactive;
    }

    /**
     * Sets the value of the difficultyToFillInactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDifficultyToFillInactive(Boolean value) {
        this.difficultyToFillInactive = value;
    }

}
