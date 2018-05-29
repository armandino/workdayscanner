
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the information about the employee's potential.
 * 
 * <p>Java class for Employee_Talent_Assessment_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employee_Talent_Assessment_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Potential_Reference" type="{urn:com.workday/bsvc}PotentialObjectType" minOccurs="0"/>
 *         &lt;element name="Achievable_Level_Reference" type="{urn:com.workday/bsvc}Achievable_LevelObjectType" minOccurs="0"/>
 *         &lt;element name="Retention_Risk_Reference" type="{urn:com.workday/bsvc}RetentionObjectType" minOccurs="0"/>
 *         &lt;element name="Loss_Impact_Risk_Reference" type="{urn:com.workday/bsvc}Loss_ImpactObjectType" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employee_Talent_Assessment_DataType", propOrder = {
    "potentialReference",
    "achievableLevelReference",
    "retentionRiskReference",
    "lossImpactRiskReference",
    "notes"
})
public class EmployeeTalentAssessmentDataType {

    @XmlElement(name = "Potential_Reference")
    protected PotentialObjectType potentialReference;
    @XmlElement(name = "Achievable_Level_Reference")
    protected AchievableLevelObjectType achievableLevelReference;
    @XmlElement(name = "Retention_Risk_Reference")
    protected RetentionObjectType retentionRiskReference;
    @XmlElement(name = "Loss_Impact_Risk_Reference")
    protected LossImpactObjectType lossImpactRiskReference;
    @XmlElement(name = "Notes")
    protected String notes;

    /**
     * Gets the value of the potentialReference property.
     * 
     * @return
     *     possible object is
     *     {@link PotentialObjectType }
     *     
     */
    public PotentialObjectType getPotentialReference() {
        return potentialReference;
    }

    /**
     * Sets the value of the potentialReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PotentialObjectType }
     *     
     */
    public void setPotentialReference(PotentialObjectType value) {
        this.potentialReference = value;
    }

    /**
     * Gets the value of the achievableLevelReference property.
     * 
     * @return
     *     possible object is
     *     {@link AchievableLevelObjectType }
     *     
     */
    public AchievableLevelObjectType getAchievableLevelReference() {
        return achievableLevelReference;
    }

    /**
     * Sets the value of the achievableLevelReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AchievableLevelObjectType }
     *     
     */
    public void setAchievableLevelReference(AchievableLevelObjectType value) {
        this.achievableLevelReference = value;
    }

    /**
     * Gets the value of the retentionRiskReference property.
     * 
     * @return
     *     possible object is
     *     {@link RetentionObjectType }
     *     
     */
    public RetentionObjectType getRetentionRiskReference() {
        return retentionRiskReference;
    }

    /**
     * Sets the value of the retentionRiskReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetentionObjectType }
     *     
     */
    public void setRetentionRiskReference(RetentionObjectType value) {
        this.retentionRiskReference = value;
    }

    /**
     * Gets the value of the lossImpactRiskReference property.
     * 
     * @return
     *     possible object is
     *     {@link LossImpactObjectType }
     *     
     */
    public LossImpactObjectType getLossImpactRiskReference() {
        return lossImpactRiskReference;
    }

    /**
     * Sets the value of the lossImpactRiskReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LossImpactObjectType }
     *     
     */
    public void setLossImpactRiskReference(LossImpactObjectType value) {
        this.lossImpactRiskReference = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

}
