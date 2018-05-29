
package com.workday.sources;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for the Named Professorship Snapshot.
 * 
 * <p>Java class for Named_Professorship_Snapshot_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Named_Professorship_Snapshot_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Gift_Reference" type="{urn:com.workday/bsvc}GiftObjectType"/>
 *         &lt;element name="Professorship_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Named_Professorship_Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Academic_Unit_for_Named_Professorship_Reference" type="{urn:com.workday/bsvc}Academic_UnitObjectType"/>
 *         &lt;element name="Term_Limits" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="12"/>
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Appointment_Restrictions" type="{urn:com.workday/bsvc}RichText" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Named_Professorship_Snapshot_DataType", propOrder = {
    "giftReference",
    "professorshipName",
    "namedProfessorshipTitle",
    "academicUnitForNamedProfessorshipReference",
    "termLimits",
    "appointmentRestrictions"
})
public class NamedProfessorshipSnapshotDataType {

    @XmlElement(name = "Gift_Reference", required = true)
    protected GiftObjectType giftReference;
    @XmlElement(name = "Professorship_Name", required = true)
    protected String professorshipName;
    @XmlElement(name = "Named_Professorship_Title", required = true)
    protected String namedProfessorshipTitle;
    @XmlElement(name = "Academic_Unit_for_Named_Professorship_Reference", required = true)
    protected AcademicUnitObjectType academicUnitForNamedProfessorshipReference;
    @XmlElement(name = "Term_Limits")
    protected BigDecimal termLimits;
    @XmlElement(name = "Appointment_Restrictions")
    protected String appointmentRestrictions;

    /**
     * Gets the value of the giftReference property.
     * 
     * @return
     *     possible object is
     *     {@link GiftObjectType }
     *     
     */
    public GiftObjectType getGiftReference() {
        return giftReference;
    }

    /**
     * Sets the value of the giftReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link GiftObjectType }
     *     
     */
    public void setGiftReference(GiftObjectType value) {
        this.giftReference = value;
    }

    /**
     * Gets the value of the professorshipName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessorshipName() {
        return professorshipName;
    }

    /**
     * Sets the value of the professorshipName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessorshipName(String value) {
        this.professorshipName = value;
    }

    /**
     * Gets the value of the namedProfessorshipTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamedProfessorshipTitle() {
        return namedProfessorshipTitle;
    }

    /**
     * Sets the value of the namedProfessorshipTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamedProfessorshipTitle(String value) {
        this.namedProfessorshipTitle = value;
    }

    /**
     * Gets the value of the academicUnitForNamedProfessorshipReference property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicUnitObjectType }
     *     
     */
    public AcademicUnitObjectType getAcademicUnitForNamedProfessorshipReference() {
        return academicUnitForNamedProfessorshipReference;
    }

    /**
     * Sets the value of the academicUnitForNamedProfessorshipReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicUnitObjectType }
     *     
     */
    public void setAcademicUnitForNamedProfessorshipReference(AcademicUnitObjectType value) {
        this.academicUnitForNamedProfessorshipReference = value;
    }

    /**
     * Gets the value of the termLimits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTermLimits() {
        return termLimits;
    }

    /**
     * Sets the value of the termLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTermLimits(BigDecimal value) {
        this.termLimits = value;
    }

    /**
     * Gets the value of the appointmentRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointmentRestrictions() {
        return appointmentRestrictions;
    }

    /**
     * Sets the value of the appointmentRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointmentRestrictions(String value) {
        this.appointmentRestrictions = value;
    }

}
