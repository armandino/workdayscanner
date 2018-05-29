
package com.workday.sources;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Wrapper element for the disability status information for the person.
 * 
 * <p>Java class for Person_Disability_Status_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Person_Disability_Status_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Disability_Reference" type="{urn:com.workday/bsvc}DisabilityObjectType"/>
 *         &lt;element name="Disability_Status_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Disability_Date_Known" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Disability_End_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Disability_Grade_Reference" type="{urn:com.workday/bsvc}Disability_GradeObjectType" minOccurs="0"/>
 *         &lt;element name="Disability_Degree" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="8"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Disability_Remaining_Capacity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="8"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;choice>
 *           &lt;element name="Disability_Certification_Authority_Reference" type="{urn:com.workday/bsvc}Disability_Certification_AuthorityObjectType" minOccurs="0"/>
 *           &lt;element name="Disability_Certification_Authority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="Disability_Certified_At" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Disability_Certification_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Disability_Certification_Basis_Reference" type="{urn:com.workday/bsvc}Disability_Certification_BasisObjectType" minOccurs="0"/>
 *         &lt;element name="Disability_Severity_Recognition_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Disability_FTE_Toward_Quota" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="13"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Disability_Work_Restrictions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Disability_Accommodations_Requested" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Disability_Accommodations_Provided" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Disability_Rehabilitation_Requested" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Disability_Rehabilitation_Provided" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Worker_Document_Reference" type="{urn:com.workday/bsvc}Worker_DocumentObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Disability_Status_Reference" type="{urn:com.workday/bsvc}Disability_Status_ReferenceObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person_Disability_Status_DataType", propOrder = {
    "disabilityReference",
    "disabilityStatusDate",
    "disabilityDateKnown",
    "disabilityEndDate",
    "disabilityGradeReference",
    "disabilityDegree",
    "disabilityRemainingCapacity",
    "disabilityCertificationAuthorityReference",
    "disabilityCertificationAuthority",
    "disabilityCertifiedAt",
    "disabilityCertificationID",
    "disabilityCertificationBasisReference",
    "disabilitySeverityRecognitionDate",
    "disabilityFTETowardQuota",
    "disabilityWorkRestrictions",
    "disabilityAccommodationsRequested",
    "disabilityAccommodationsProvided",
    "disabilityRehabilitationRequested",
    "disabilityRehabilitationProvided",
    "note",
    "workerDocumentReference",
    "disabilityStatusReference"
})
public class PersonDisabilityStatusDataType {

    @XmlElement(name = "Disability_Reference", required = true)
    protected DisabilityObjectType disabilityReference;
    @XmlElement(name = "Disability_Status_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar disabilityStatusDate;
    @XmlElement(name = "Disability_Date_Known")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar disabilityDateKnown;
    @XmlElement(name = "Disability_End_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar disabilityEndDate;
    @XmlElement(name = "Disability_Grade_Reference")
    protected DisabilityGradeObjectType disabilityGradeReference;
    @XmlElement(name = "Disability_Degree")
    protected BigDecimal disabilityDegree;
    @XmlElement(name = "Disability_Remaining_Capacity")
    protected BigDecimal disabilityRemainingCapacity;
    @XmlElement(name = "Disability_Certification_Authority_Reference")
    protected DisabilityCertificationAuthorityObjectType disabilityCertificationAuthorityReference;
    @XmlElement(name = "Disability_Certification_Authority")
    protected String disabilityCertificationAuthority;
    @XmlElement(name = "Disability_Certified_At")
    protected String disabilityCertifiedAt;
    @XmlElement(name = "Disability_Certification_ID")
    protected String disabilityCertificationID;
    @XmlElement(name = "Disability_Certification_Basis_Reference")
    protected DisabilityCertificationBasisObjectType disabilityCertificationBasisReference;
    @XmlElement(name = "Disability_Severity_Recognition_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar disabilitySeverityRecognitionDate;
    @XmlElement(name = "Disability_FTE_Toward_Quota")
    protected BigDecimal disabilityFTETowardQuota;
    @XmlElement(name = "Disability_Work_Restrictions")
    protected String disabilityWorkRestrictions;
    @XmlElement(name = "Disability_Accommodations_Requested")
    protected String disabilityAccommodationsRequested;
    @XmlElement(name = "Disability_Accommodations_Provided")
    protected String disabilityAccommodationsProvided;
    @XmlElement(name = "Disability_Rehabilitation_Requested")
    protected String disabilityRehabilitationRequested;
    @XmlElement(name = "Disability_Rehabilitation_Provided")
    protected String disabilityRehabilitationProvided;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "Worker_Document_Reference")
    protected List<WorkerDocumentObjectType> workerDocumentReference;
    @XmlElement(name = "Disability_Status_Reference")
    protected DisabilityStatusReferenceObjectType disabilityStatusReference;

    /**
     * Gets the value of the disabilityReference property.
     * 
     * @return
     *     possible object is
     *     {@link DisabilityObjectType }
     *     
     */
    public DisabilityObjectType getDisabilityReference() {
        return disabilityReference;
    }

    /**
     * Sets the value of the disabilityReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisabilityObjectType }
     *     
     */
    public void setDisabilityReference(DisabilityObjectType value) {
        this.disabilityReference = value;
    }

    /**
     * Gets the value of the disabilityStatusDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDisabilityStatusDate() {
        return disabilityStatusDate;
    }

    /**
     * Sets the value of the disabilityStatusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDisabilityStatusDate(XMLGregorianCalendar value) {
        this.disabilityStatusDate = value;
    }

    /**
     * Gets the value of the disabilityDateKnown property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDisabilityDateKnown() {
        return disabilityDateKnown;
    }

    /**
     * Sets the value of the disabilityDateKnown property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDisabilityDateKnown(XMLGregorianCalendar value) {
        this.disabilityDateKnown = value;
    }

    /**
     * Gets the value of the disabilityEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDisabilityEndDate() {
        return disabilityEndDate;
    }

    /**
     * Sets the value of the disabilityEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDisabilityEndDate(XMLGregorianCalendar value) {
        this.disabilityEndDate = value;
    }

    /**
     * Gets the value of the disabilityGradeReference property.
     * 
     * @return
     *     possible object is
     *     {@link DisabilityGradeObjectType }
     *     
     */
    public DisabilityGradeObjectType getDisabilityGradeReference() {
        return disabilityGradeReference;
    }

    /**
     * Sets the value of the disabilityGradeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisabilityGradeObjectType }
     *     
     */
    public void setDisabilityGradeReference(DisabilityGradeObjectType value) {
        this.disabilityGradeReference = value;
    }

    /**
     * Gets the value of the disabilityDegree property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDisabilityDegree() {
        return disabilityDegree;
    }

    /**
     * Sets the value of the disabilityDegree property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDisabilityDegree(BigDecimal value) {
        this.disabilityDegree = value;
    }

    /**
     * Gets the value of the disabilityRemainingCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDisabilityRemainingCapacity() {
        return disabilityRemainingCapacity;
    }

    /**
     * Sets the value of the disabilityRemainingCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDisabilityRemainingCapacity(BigDecimal value) {
        this.disabilityRemainingCapacity = value;
    }

    /**
     * Gets the value of the disabilityCertificationAuthorityReference property.
     * 
     * @return
     *     possible object is
     *     {@link DisabilityCertificationAuthorityObjectType }
     *     
     */
    public DisabilityCertificationAuthorityObjectType getDisabilityCertificationAuthorityReference() {
        return disabilityCertificationAuthorityReference;
    }

    /**
     * Sets the value of the disabilityCertificationAuthorityReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisabilityCertificationAuthorityObjectType }
     *     
     */
    public void setDisabilityCertificationAuthorityReference(DisabilityCertificationAuthorityObjectType value) {
        this.disabilityCertificationAuthorityReference = value;
    }

    /**
     * Gets the value of the disabilityCertificationAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisabilityCertificationAuthority() {
        return disabilityCertificationAuthority;
    }

    /**
     * Sets the value of the disabilityCertificationAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisabilityCertificationAuthority(String value) {
        this.disabilityCertificationAuthority = value;
    }

    /**
     * Gets the value of the disabilityCertifiedAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisabilityCertifiedAt() {
        return disabilityCertifiedAt;
    }

    /**
     * Sets the value of the disabilityCertifiedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisabilityCertifiedAt(String value) {
        this.disabilityCertifiedAt = value;
    }

    /**
     * Gets the value of the disabilityCertificationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisabilityCertificationID() {
        return disabilityCertificationID;
    }

    /**
     * Sets the value of the disabilityCertificationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisabilityCertificationID(String value) {
        this.disabilityCertificationID = value;
    }

    /**
     * Gets the value of the disabilityCertificationBasisReference property.
     * 
     * @return
     *     possible object is
     *     {@link DisabilityCertificationBasisObjectType }
     *     
     */
    public DisabilityCertificationBasisObjectType getDisabilityCertificationBasisReference() {
        return disabilityCertificationBasisReference;
    }

    /**
     * Sets the value of the disabilityCertificationBasisReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisabilityCertificationBasisObjectType }
     *     
     */
    public void setDisabilityCertificationBasisReference(DisabilityCertificationBasisObjectType value) {
        this.disabilityCertificationBasisReference = value;
    }

    /**
     * Gets the value of the disabilitySeverityRecognitionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDisabilitySeverityRecognitionDate() {
        return disabilitySeverityRecognitionDate;
    }

    /**
     * Sets the value of the disabilitySeverityRecognitionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDisabilitySeverityRecognitionDate(XMLGregorianCalendar value) {
        this.disabilitySeverityRecognitionDate = value;
    }

    /**
     * Gets the value of the disabilityFTETowardQuota property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDisabilityFTETowardQuota() {
        return disabilityFTETowardQuota;
    }

    /**
     * Sets the value of the disabilityFTETowardQuota property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDisabilityFTETowardQuota(BigDecimal value) {
        this.disabilityFTETowardQuota = value;
    }

    /**
     * Gets the value of the disabilityWorkRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisabilityWorkRestrictions() {
        return disabilityWorkRestrictions;
    }

    /**
     * Sets the value of the disabilityWorkRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisabilityWorkRestrictions(String value) {
        this.disabilityWorkRestrictions = value;
    }

    /**
     * Gets the value of the disabilityAccommodationsRequested property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisabilityAccommodationsRequested() {
        return disabilityAccommodationsRequested;
    }

    /**
     * Sets the value of the disabilityAccommodationsRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisabilityAccommodationsRequested(String value) {
        this.disabilityAccommodationsRequested = value;
    }

    /**
     * Gets the value of the disabilityAccommodationsProvided property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisabilityAccommodationsProvided() {
        return disabilityAccommodationsProvided;
    }

    /**
     * Sets the value of the disabilityAccommodationsProvided property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisabilityAccommodationsProvided(String value) {
        this.disabilityAccommodationsProvided = value;
    }

    /**
     * Gets the value of the disabilityRehabilitationRequested property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisabilityRehabilitationRequested() {
        return disabilityRehabilitationRequested;
    }

    /**
     * Sets the value of the disabilityRehabilitationRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisabilityRehabilitationRequested(String value) {
        this.disabilityRehabilitationRequested = value;
    }

    /**
     * Gets the value of the disabilityRehabilitationProvided property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisabilityRehabilitationProvided() {
        return disabilityRehabilitationProvided;
    }

    /**
     * Sets the value of the disabilityRehabilitationProvided property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisabilityRehabilitationProvided(String value) {
        this.disabilityRehabilitationProvided = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the workerDocumentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workerDocumentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkerDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkerDocumentObjectType }
     * 
     * 
     */
    public List<WorkerDocumentObjectType> getWorkerDocumentReference() {
        if (workerDocumentReference == null) {
            workerDocumentReference = new ArrayList<WorkerDocumentObjectType>();
        }
        return this.workerDocumentReference;
    }

    /**
     * Gets the value of the disabilityStatusReference property.
     * 
     * @return
     *     possible object is
     *     {@link DisabilityStatusReferenceObjectType }
     *     
     */
    public DisabilityStatusReferenceObjectType getDisabilityStatusReference() {
        return disabilityStatusReference;
    }

    /**
     * Sets the value of the disabilityStatusReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisabilityStatusReferenceObjectType }
     *     
     */
    public void setDisabilityStatusReference(DisabilityStatusReferenceObjectType value) {
        this.disabilityStatusReference = value;
    }

}
