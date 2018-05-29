
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Provides selection for filtering the response
 * 
 * <p>Java class for Person_Type_CriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Person_Type_CriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Include_Academic_Affiliates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_External_Committee_Members" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_External_Student_Records" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Student_Prospect_Records" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Student_Records" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Workers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person_Type_CriteriaType", propOrder = {
    "includeAcademicAffiliates",
    "includeExternalCommitteeMembers",
    "includeExternalStudentRecords",
    "includeStudentProspectRecords",
    "includeStudentRecords",
    "includeWorkers"
})
public class PersonTypeCriteriaType {

    @XmlElement(name = "Include_Academic_Affiliates")
    protected Boolean includeAcademicAffiliates;
    @XmlElement(name = "Include_External_Committee_Members")
    protected Boolean includeExternalCommitteeMembers;
    @XmlElement(name = "Include_External_Student_Records")
    protected Boolean includeExternalStudentRecords;
    @XmlElement(name = "Include_Student_Prospect_Records")
    protected Boolean includeStudentProspectRecords;
    @XmlElement(name = "Include_Student_Records")
    protected Boolean includeStudentRecords;
    @XmlElement(name = "Include_Workers")
    protected Boolean includeWorkers;

    /**
     * Gets the value of the includeAcademicAffiliates property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeAcademicAffiliates() {
        return includeAcademicAffiliates;
    }

    /**
     * Sets the value of the includeAcademicAffiliates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeAcademicAffiliates(Boolean value) {
        this.includeAcademicAffiliates = value;
    }

    /**
     * Gets the value of the includeExternalCommitteeMembers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeExternalCommitteeMembers() {
        return includeExternalCommitteeMembers;
    }

    /**
     * Sets the value of the includeExternalCommitteeMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeExternalCommitteeMembers(Boolean value) {
        this.includeExternalCommitteeMembers = value;
    }

    /**
     * Gets the value of the includeExternalStudentRecords property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeExternalStudentRecords() {
        return includeExternalStudentRecords;
    }

    /**
     * Sets the value of the includeExternalStudentRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeExternalStudentRecords(Boolean value) {
        this.includeExternalStudentRecords = value;
    }

    /**
     * Gets the value of the includeStudentProspectRecords property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeStudentProspectRecords() {
        return includeStudentProspectRecords;
    }

    /**
     * Sets the value of the includeStudentProspectRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeStudentProspectRecords(Boolean value) {
        this.includeStudentProspectRecords = value;
    }

    /**
     * Gets the value of the includeStudentRecords property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeStudentRecords() {
        return includeStudentRecords;
    }

    /**
     * Sets the value of the includeStudentRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeStudentRecords(Boolean value) {
        this.includeStudentRecords = value;
    }

    /**
     * Gets the value of the includeWorkers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeWorkers() {
        return includeWorkers;
    }

    /**
     * Sets the value of the includeWorkers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeWorkers(Boolean value) {
        this.includeWorkers = value;
    }

}
