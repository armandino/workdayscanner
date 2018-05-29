
package com.workday.sources;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Element containing the specifics for the academic appointment being  added or updated. An academic appointment tracks an academic worker’s time at a university or college.
 * 
 * <p>Java class for Academic_Appointment_Snapshot_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Academic_Appointment_Snapshot_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Academic_Appointment_Track_Reference" type="{urn:com.workday/bsvc}Academic_Appointment_TrackObjectType" minOccurs="0"/>
 *         &lt;element name="Appointment_Track_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Track_Type_Reference" type="{urn:com.workday/bsvc}Academic_Track_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Appointment_Identifier_Reference" type="{urn:com.workday/bsvc}Academic_Appointment_IdentifierObjectType"/>
 *         &lt;element name="Position_Reference" type="{urn:com.workday/bsvc}Position_ElementObjectType" minOccurs="0"/>
 *         &lt;element name="Academic_Unit_Reference" type="{urn:com.workday/bsvc}Academic_UnitObjectType"/>
 *         &lt;element name="Roster_Percent" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="7"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Appointment_Start_Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Appointment_End_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Track_Start_Date_Override" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Rank_Reference" type="{urn:com.workday/bsvc}Academic_RankObjectType" minOccurs="0"/>
 *         &lt;element name="Named_Professorship_Reference" type="{urn:com.workday/bsvc}Named_ProfessorshipObjectType" minOccurs="0"/>
 *         &lt;element name="Appointment_Specialty_Reference" type="{urn:com.workday/bsvc}Appointment_SpecialtyObjectType" minOccurs="0"/>
 *         &lt;element name="Constructed_Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Appointment_Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Adjusted_Title_Start_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Academic_Review_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Related_Academic_Unit_Reference" type="{urn:com.workday/bsvc}Academic_UnitObjectType" minOccurs="0"/>
 *         &lt;element name="Tenure_Home_Reference" type="{urn:com.workday/bsvc}Academic_UnitObjectType" minOccurs="0"/>
 *         &lt;element name="Tenure_Status_Reference" type="{urn:com.workday/bsvc}Academic_Tenure_StatusObjectType" minOccurs="0"/>
 *         &lt;element name="Probationary_End_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Tenure_Award_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Academic_Appointment_Snapshot_DataType", propOrder = {
    "academicAppointmentTrackReference",
    "appointmentTrackID",
    "trackTypeReference",
    "appointmentIdentifierReference",
    "positionReference",
    "academicUnitReference",
    "rosterPercent",
    "appointmentStartDate",
    "appointmentEndDate",
    "trackStartDateOverride",
    "rankReference",
    "namedProfessorshipReference",
    "appointmentSpecialtyReference",
    "constructedTitle",
    "appointmentTitle",
    "adjustedTitleStartDate",
    "academicReviewDate",
    "relatedAcademicUnitReference",
    "tenureHomeReference",
    "tenureStatusReference",
    "probationaryEndDate",
    "tenureAwardDate"
})
public class AcademicAppointmentSnapshotDataType {

    @XmlElement(name = "Academic_Appointment_Track_Reference")
    protected AcademicAppointmentTrackObjectType academicAppointmentTrackReference;
    @XmlElement(name = "Appointment_Track_ID")
    protected String appointmentTrackID;
    @XmlElement(name = "Track_Type_Reference")
    protected AcademicTrackTypeObjectType trackTypeReference;
    @XmlElement(name = "Appointment_Identifier_Reference", required = true)
    protected AcademicAppointmentIdentifierObjectType appointmentIdentifierReference;
    @XmlElement(name = "Position_Reference")
    protected PositionElementObjectType positionReference;
    @XmlElement(name = "Academic_Unit_Reference", required = true)
    protected AcademicUnitObjectType academicUnitReference;
    @XmlElement(name = "Roster_Percent")
    protected BigDecimal rosterPercent;
    @XmlElement(name = "Appointment_Start_Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar appointmentStartDate;
    @XmlElement(name = "Appointment_End_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar appointmentEndDate;
    @XmlElement(name = "Track_Start_Date_Override")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar trackStartDateOverride;
    @XmlElement(name = "Rank_Reference")
    protected AcademicRankObjectType rankReference;
    @XmlElement(name = "Named_Professorship_Reference")
    protected NamedProfessorshipObjectType namedProfessorshipReference;
    @XmlElement(name = "Appointment_Specialty_Reference")
    protected AppointmentSpecialtyObjectType appointmentSpecialtyReference;
    @XmlElement(name = "Constructed_Title")
    protected String constructedTitle;
    @XmlElement(name = "Appointment_Title", required = true)
    protected String appointmentTitle;
    @XmlElement(name = "Adjusted_Title_Start_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar adjustedTitleStartDate;
    @XmlElement(name = "Academic_Review_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar academicReviewDate;
    @XmlElement(name = "Related_Academic_Unit_Reference")
    protected AcademicUnitObjectType relatedAcademicUnitReference;
    @XmlElement(name = "Tenure_Home_Reference")
    protected AcademicUnitObjectType tenureHomeReference;
    @XmlElement(name = "Tenure_Status_Reference")
    protected AcademicTenureStatusObjectType tenureStatusReference;
    @XmlElement(name = "Probationary_End_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar probationaryEndDate;
    @XmlElement(name = "Tenure_Award_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tenureAwardDate;

    /**
     * Gets the value of the academicAppointmentTrackReference property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicAppointmentTrackObjectType }
     *     
     */
    public AcademicAppointmentTrackObjectType getAcademicAppointmentTrackReference() {
        return academicAppointmentTrackReference;
    }

    /**
     * Sets the value of the academicAppointmentTrackReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicAppointmentTrackObjectType }
     *     
     */
    public void setAcademicAppointmentTrackReference(AcademicAppointmentTrackObjectType value) {
        this.academicAppointmentTrackReference = value;
    }

    /**
     * Gets the value of the appointmentTrackID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointmentTrackID() {
        return appointmentTrackID;
    }

    /**
     * Sets the value of the appointmentTrackID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointmentTrackID(String value) {
        this.appointmentTrackID = value;
    }

    /**
     * Gets the value of the trackTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicTrackTypeObjectType }
     *     
     */
    public AcademicTrackTypeObjectType getTrackTypeReference() {
        return trackTypeReference;
    }

    /**
     * Sets the value of the trackTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicTrackTypeObjectType }
     *     
     */
    public void setTrackTypeReference(AcademicTrackTypeObjectType value) {
        this.trackTypeReference = value;
    }

    /**
     * Gets the value of the appointmentIdentifierReference property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicAppointmentIdentifierObjectType }
     *     
     */
    public AcademicAppointmentIdentifierObjectType getAppointmentIdentifierReference() {
        return appointmentIdentifierReference;
    }

    /**
     * Sets the value of the appointmentIdentifierReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicAppointmentIdentifierObjectType }
     *     
     */
    public void setAppointmentIdentifierReference(AcademicAppointmentIdentifierObjectType value) {
        this.appointmentIdentifierReference = value;
    }

    /**
     * Gets the value of the positionReference property.
     * 
     * @return
     *     possible object is
     *     {@link PositionElementObjectType }
     *     
     */
    public PositionElementObjectType getPositionReference() {
        return positionReference;
    }

    /**
     * Sets the value of the positionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionElementObjectType }
     *     
     */
    public void setPositionReference(PositionElementObjectType value) {
        this.positionReference = value;
    }

    /**
     * Gets the value of the academicUnitReference property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicUnitObjectType }
     *     
     */
    public AcademicUnitObjectType getAcademicUnitReference() {
        return academicUnitReference;
    }

    /**
     * Sets the value of the academicUnitReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicUnitObjectType }
     *     
     */
    public void setAcademicUnitReference(AcademicUnitObjectType value) {
        this.academicUnitReference = value;
    }

    /**
     * Gets the value of the rosterPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRosterPercent() {
        return rosterPercent;
    }

    /**
     * Sets the value of the rosterPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRosterPercent(BigDecimal value) {
        this.rosterPercent = value;
    }

    /**
     * Gets the value of the appointmentStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAppointmentStartDate() {
        return appointmentStartDate;
    }

    /**
     * Sets the value of the appointmentStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAppointmentStartDate(XMLGregorianCalendar value) {
        this.appointmentStartDate = value;
    }

    /**
     * Gets the value of the appointmentEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAppointmentEndDate() {
        return appointmentEndDate;
    }

    /**
     * Sets the value of the appointmentEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAppointmentEndDate(XMLGregorianCalendar value) {
        this.appointmentEndDate = value;
    }

    /**
     * Gets the value of the trackStartDateOverride property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTrackStartDateOverride() {
        return trackStartDateOverride;
    }

    /**
     * Sets the value of the trackStartDateOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTrackStartDateOverride(XMLGregorianCalendar value) {
        this.trackStartDateOverride = value;
    }

    /**
     * Gets the value of the rankReference property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicRankObjectType }
     *     
     */
    public AcademicRankObjectType getRankReference() {
        return rankReference;
    }

    /**
     * Sets the value of the rankReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicRankObjectType }
     *     
     */
    public void setRankReference(AcademicRankObjectType value) {
        this.rankReference = value;
    }

    /**
     * Gets the value of the namedProfessorshipReference property.
     * 
     * @return
     *     possible object is
     *     {@link NamedProfessorshipObjectType }
     *     
     */
    public NamedProfessorshipObjectType getNamedProfessorshipReference() {
        return namedProfessorshipReference;
    }

    /**
     * Sets the value of the namedProfessorshipReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedProfessorshipObjectType }
     *     
     */
    public void setNamedProfessorshipReference(NamedProfessorshipObjectType value) {
        this.namedProfessorshipReference = value;
    }

    /**
     * Gets the value of the appointmentSpecialtyReference property.
     * 
     * @return
     *     possible object is
     *     {@link AppointmentSpecialtyObjectType }
     *     
     */
    public AppointmentSpecialtyObjectType getAppointmentSpecialtyReference() {
        return appointmentSpecialtyReference;
    }

    /**
     * Sets the value of the appointmentSpecialtyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppointmentSpecialtyObjectType }
     *     
     */
    public void setAppointmentSpecialtyReference(AppointmentSpecialtyObjectType value) {
        this.appointmentSpecialtyReference = value;
    }

    /**
     * Gets the value of the constructedTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstructedTitle() {
        return constructedTitle;
    }

    /**
     * Sets the value of the constructedTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstructedTitle(String value) {
        this.constructedTitle = value;
    }

    /**
     * Gets the value of the appointmentTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointmentTitle() {
        return appointmentTitle;
    }

    /**
     * Sets the value of the appointmentTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointmentTitle(String value) {
        this.appointmentTitle = value;
    }

    /**
     * Gets the value of the adjustedTitleStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAdjustedTitleStartDate() {
        return adjustedTitleStartDate;
    }

    /**
     * Sets the value of the adjustedTitleStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAdjustedTitleStartDate(XMLGregorianCalendar value) {
        this.adjustedTitleStartDate = value;
    }

    /**
     * Gets the value of the academicReviewDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcademicReviewDate() {
        return academicReviewDate;
    }

    /**
     * Sets the value of the academicReviewDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcademicReviewDate(XMLGregorianCalendar value) {
        this.academicReviewDate = value;
    }

    /**
     * Gets the value of the relatedAcademicUnitReference property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicUnitObjectType }
     *     
     */
    public AcademicUnitObjectType getRelatedAcademicUnitReference() {
        return relatedAcademicUnitReference;
    }

    /**
     * Sets the value of the relatedAcademicUnitReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicUnitObjectType }
     *     
     */
    public void setRelatedAcademicUnitReference(AcademicUnitObjectType value) {
        this.relatedAcademicUnitReference = value;
    }

    /**
     * Gets the value of the tenureHomeReference property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicUnitObjectType }
     *     
     */
    public AcademicUnitObjectType getTenureHomeReference() {
        return tenureHomeReference;
    }

    /**
     * Sets the value of the tenureHomeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicUnitObjectType }
     *     
     */
    public void setTenureHomeReference(AcademicUnitObjectType value) {
        this.tenureHomeReference = value;
    }

    /**
     * Gets the value of the tenureStatusReference property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicTenureStatusObjectType }
     *     
     */
    public AcademicTenureStatusObjectType getTenureStatusReference() {
        return tenureStatusReference;
    }

    /**
     * Sets the value of the tenureStatusReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicTenureStatusObjectType }
     *     
     */
    public void setTenureStatusReference(AcademicTenureStatusObjectType value) {
        this.tenureStatusReference = value;
    }

    /**
     * Gets the value of the probationaryEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProbationaryEndDate() {
        return probationaryEndDate;
    }

    /**
     * Sets the value of the probationaryEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProbationaryEndDate(XMLGregorianCalendar value) {
        this.probationaryEndDate = value;
    }

    /**
     * Gets the value of the tenureAwardDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTenureAwardDate() {
        return tenureAwardDate;
    }

    /**
     * Sets the value of the tenureAwardDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTenureAwardDate(XMLGregorianCalendar value) {
        this.tenureAwardDate = value;
    }

}
