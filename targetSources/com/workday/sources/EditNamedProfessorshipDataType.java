
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Wrapper Element for Named Professorship Data
 * 
 * <p>Java class for Edit_Named_Professorship_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Edit_Named_Professorship_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Named_Professorship_Reference" type="{urn:com.workday/bsvc}Named_ProfessorshipObjectType"/>
 *         &lt;element name="Effective_Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Reason_Reference" type="{urn:com.workday/bsvc}General_Event_SubcategoryObjectType"/>
 *         &lt;element name="Include_Code_in_Display_Name" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Initially_Available_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="On_Hold_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Discontinued_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Named_Professorship_Snapshot_Data" type="{urn:com.workday/bsvc}Named_Professorship_Snapshot_DataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Edit_Named_Professorship_DataType", propOrder = {
    "namedProfessorshipReference",
    "effectiveDate",
    "reasonReference",
    "includeCodeInDisplayName",
    "initiallyAvailableDate",
    "onHoldDate",
    "discontinuedDate",
    "namedProfessorshipSnapshotData"
})
public class EditNamedProfessorshipDataType {

    @XmlElement(name = "Named_Professorship_Reference", required = true)
    protected NamedProfessorshipObjectType namedProfessorshipReference;
    @XmlElement(name = "Effective_Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "Reason_Reference", required = true)
    protected GeneralEventSubcategoryObjectType reasonReference;
    @XmlElement(name = "Include_Code_in_Display_Name")
    protected Boolean includeCodeInDisplayName;
    @XmlElement(name = "Initially_Available_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar initiallyAvailableDate;
    @XmlElement(name = "On_Hold_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar onHoldDate;
    @XmlElement(name = "Discontinued_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar discontinuedDate;
    @XmlElement(name = "Named_Professorship_Snapshot_Data", required = true)
    protected NamedProfessorshipSnapshotDataType namedProfessorshipSnapshotData;

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
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the reasonReference property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralEventSubcategoryObjectType }
     *     
     */
    public GeneralEventSubcategoryObjectType getReasonReference() {
        return reasonReference;
    }

    /**
     * Sets the value of the reasonReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralEventSubcategoryObjectType }
     *     
     */
    public void setReasonReference(GeneralEventSubcategoryObjectType value) {
        this.reasonReference = value;
    }

    /**
     * Gets the value of the includeCodeInDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeCodeInDisplayName() {
        return includeCodeInDisplayName;
    }

    /**
     * Sets the value of the includeCodeInDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeCodeInDisplayName(Boolean value) {
        this.includeCodeInDisplayName = value;
    }

    /**
     * Gets the value of the initiallyAvailableDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInitiallyAvailableDate() {
        return initiallyAvailableDate;
    }

    /**
     * Sets the value of the initiallyAvailableDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInitiallyAvailableDate(XMLGregorianCalendar value) {
        this.initiallyAvailableDate = value;
    }

    /**
     * Gets the value of the onHoldDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOnHoldDate() {
        return onHoldDate;
    }

    /**
     * Sets the value of the onHoldDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOnHoldDate(XMLGregorianCalendar value) {
        this.onHoldDate = value;
    }

    /**
     * Gets the value of the discontinuedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDiscontinuedDate() {
        return discontinuedDate;
    }

    /**
     * Sets the value of the discontinuedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDiscontinuedDate(XMLGregorianCalendar value) {
        this.discontinuedDate = value;
    }

    /**
     * Gets the value of the namedProfessorshipSnapshotData property.
     * 
     * @return
     *     possible object is
     *     {@link NamedProfessorshipSnapshotDataType }
     *     
     */
    public NamedProfessorshipSnapshotDataType getNamedProfessorshipSnapshotData() {
        return namedProfessorshipSnapshotData;
    }

    /**
     * Sets the value of the namedProfessorshipSnapshotData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedProfessorshipSnapshotDataType }
     *     
     */
    public void setNamedProfessorshipSnapshotData(NamedProfessorshipSnapshotDataType value) {
        this.namedProfessorshipSnapshotData = value;
    }

}
