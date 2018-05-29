
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Wrapper element for Competency Data.
 * 
 * <p>Java class for Competency_Achievement_Data__v10_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Competency_Achievement_Data__v10_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Competency_Level_Behavior_Reference" type="{urn:com.workday/bsvc}Proficiency_Rating_BehaviorObjectType" minOccurs="0"/>
 *         &lt;element name="Competency_Level_Behavior_Descriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Assessment_Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Assessed_On" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Assessed_By_Person_Reference" type="{urn:com.workday/bsvc}RoleObjectType" minOccurs="0"/>
 *         &lt;element name="Assessed_By_Worker_Descriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Competency_Reference" type="{urn:com.workday/bsvc}CompetencyObjectType"/>
 *         &lt;element name="Competency_Descriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Competency_Achievement_Data__v10_Type", propOrder = {
    "competencyLevelBehaviorReference",
    "competencyLevelBehaviorDescriptor",
    "assessmentComment",
    "assessedOn",
    "assessedByPersonReference",
    "assessedByWorkerDescriptor",
    "competencyReference",
    "competencyDescriptor"
})
public class CompetencyAchievementDataV10Type {

    @XmlElement(name = "Competency_Level_Behavior_Reference")
    protected ProficiencyRatingBehaviorObjectType competencyLevelBehaviorReference;
    @XmlElement(name = "Competency_Level_Behavior_Descriptor")
    protected String competencyLevelBehaviorDescriptor;
    @XmlElement(name = "Assessment_Comment")
    protected String assessmentComment;
    @XmlElement(name = "Assessed_On")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar assessedOn;
    @XmlElement(name = "Assessed_By_Person_Reference")
    protected RoleObjectType assessedByPersonReference;
    @XmlElement(name = "Assessed_By_Worker_Descriptor")
    protected String assessedByWorkerDescriptor;
    @XmlElement(name = "Competency_Reference", required = true)
    protected CompetencyObjectType competencyReference;
    @XmlElement(name = "Competency_Descriptor")
    protected String competencyDescriptor;

    /**
     * Gets the value of the competencyLevelBehaviorReference property.
     * 
     * @return
     *     possible object is
     *     {@link ProficiencyRatingBehaviorObjectType }
     *     
     */
    public ProficiencyRatingBehaviorObjectType getCompetencyLevelBehaviorReference() {
        return competencyLevelBehaviorReference;
    }

    /**
     * Sets the value of the competencyLevelBehaviorReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProficiencyRatingBehaviorObjectType }
     *     
     */
    public void setCompetencyLevelBehaviorReference(ProficiencyRatingBehaviorObjectType value) {
        this.competencyLevelBehaviorReference = value;
    }

    /**
     * Gets the value of the competencyLevelBehaviorDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompetencyLevelBehaviorDescriptor() {
        return competencyLevelBehaviorDescriptor;
    }

    /**
     * Sets the value of the competencyLevelBehaviorDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompetencyLevelBehaviorDescriptor(String value) {
        this.competencyLevelBehaviorDescriptor = value;
    }

    /**
     * Gets the value of the assessmentComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentComment() {
        return assessmentComment;
    }

    /**
     * Sets the value of the assessmentComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentComment(String value) {
        this.assessmentComment = value;
    }

    /**
     * Gets the value of the assessedOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAssessedOn() {
        return assessedOn;
    }

    /**
     * Sets the value of the assessedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAssessedOn(XMLGregorianCalendar value) {
        this.assessedOn = value;
    }

    /**
     * Gets the value of the assessedByPersonReference property.
     * 
     * @return
     *     possible object is
     *     {@link RoleObjectType }
     *     
     */
    public RoleObjectType getAssessedByPersonReference() {
        return assessedByPersonReference;
    }

    /**
     * Sets the value of the assessedByPersonReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleObjectType }
     *     
     */
    public void setAssessedByPersonReference(RoleObjectType value) {
        this.assessedByPersonReference = value;
    }

    /**
     * Gets the value of the assessedByWorkerDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessedByWorkerDescriptor() {
        return assessedByWorkerDescriptor;
    }

    /**
     * Sets the value of the assessedByWorkerDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessedByWorkerDescriptor(String value) {
        this.assessedByWorkerDescriptor = value;
    }

    /**
     * Gets the value of the competencyReference property.
     * 
     * @return
     *     possible object is
     *     {@link CompetencyObjectType }
     *     
     */
    public CompetencyObjectType getCompetencyReference() {
        return competencyReference;
    }

    /**
     * Sets the value of the competencyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompetencyObjectType }
     *     
     */
    public void setCompetencyReference(CompetencyObjectType value) {
        this.competencyReference = value;
    }

    /**
     * Gets the value of the competencyDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompetencyDescriptor() {
        return competencyDescriptor;
    }

    /**
     * Sets the value of the competencyDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompetencyDescriptor(String value) {
        this.competencyDescriptor = value;
    }

}
