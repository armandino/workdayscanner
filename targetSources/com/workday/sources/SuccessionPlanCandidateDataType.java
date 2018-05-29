
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains information about the succession plan candidacy for the employee.
 * 
 * <p>Java class for Succession_Plan_Candidate_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Succession_Plan_Candidate_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Position_Element_Reference" type="{urn:com.workday/bsvc}Position_ElementObjectType" minOccurs="0"/>
 *         &lt;element name="Succession_Readiness_Reference" type="{urn:com.workday/bsvc}Succession_ReadinessObjectType" minOccurs="0"/>
 *         &lt;element name="Top_Candidate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:com.workday/bsvc}RichText" minOccurs="0"/>
 *         &lt;element name="Last_Updated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Succession_Plan_Candidate_DataType", propOrder = {
    "positionElementReference",
    "successionReadinessReference",
    "topCandidate",
    "notes",
    "lastUpdated"
})
public class SuccessionPlanCandidateDataType {

    @XmlElement(name = "Position_Element_Reference")
    protected PositionElementObjectType positionElementReference;
    @XmlElement(name = "Succession_Readiness_Reference")
    protected SuccessionReadinessObjectType successionReadinessReference;
    @XmlElement(name = "Top_Candidate")
    protected Boolean topCandidate;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "Last_Updated")
    protected String lastUpdated;

    /**
     * Gets the value of the positionElementReference property.
     * 
     * @return
     *     possible object is
     *     {@link PositionElementObjectType }
     *     
     */
    public PositionElementObjectType getPositionElementReference() {
        return positionElementReference;
    }

    /**
     * Sets the value of the positionElementReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionElementObjectType }
     *     
     */
    public void setPositionElementReference(PositionElementObjectType value) {
        this.positionElementReference = value;
    }

    /**
     * Gets the value of the successionReadinessReference property.
     * 
     * @return
     *     possible object is
     *     {@link SuccessionReadinessObjectType }
     *     
     */
    public SuccessionReadinessObjectType getSuccessionReadinessReference() {
        return successionReadinessReference;
    }

    /**
     * Sets the value of the successionReadinessReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuccessionReadinessObjectType }
     *     
     */
    public void setSuccessionReadinessReference(SuccessionReadinessObjectType value) {
        this.successionReadinessReference = value;
    }

    /**
     * Gets the value of the topCandidate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTopCandidate() {
        return topCandidate;
    }

    /**
     * Sets the value of the topCandidate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTopCandidate(Boolean value) {
        this.topCandidate = value;
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

    /**
     * Gets the value of the lastUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Sets the value of the lastUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdated(String value) {
        this.lastUpdated = value;
    }

}
