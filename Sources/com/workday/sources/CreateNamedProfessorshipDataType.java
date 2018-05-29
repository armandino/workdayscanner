
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Wrapper element for the Create Named Professorship business process.
 * 
 * <p>Java class for Create_Named_Professorship_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Create_Named_Professorship_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Reason_Reference" type="{urn:com.workday/bsvc}General_Event_SubcategoryObjectType"/>
 *         &lt;element name="Named_Professorship_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Initially_Established_Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Initially_Available_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Include_Code_in_Display_Name" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "Create_Named_Professorship_DataType", propOrder = {
    "reasonReference",
    "namedProfessorshipID",
    "initiallyEstablishedDate",
    "initiallyAvailableDate",
    "includeCodeInDisplayName",
    "namedProfessorshipSnapshotData"
})
public class CreateNamedProfessorshipDataType {

    @XmlElement(name = "Reason_Reference", required = true)
    protected GeneralEventSubcategoryObjectType reasonReference;
    @XmlElement(name = "Named_Professorship_ID")
    protected String namedProfessorshipID;
    @XmlElement(name = "Initially_Established_Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar initiallyEstablishedDate;
    @XmlElement(name = "Initially_Available_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar initiallyAvailableDate;
    @XmlElement(name = "Include_Code_in_Display_Name")
    protected Boolean includeCodeInDisplayName;
    @XmlElement(name = "Named_Professorship_Snapshot_Data", required = true)
    protected NamedProfessorshipSnapshotDataType namedProfessorshipSnapshotData;

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
     * Gets the value of the namedProfessorshipID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamedProfessorshipID() {
        return namedProfessorshipID;
    }

    /**
     * Sets the value of the namedProfessorshipID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamedProfessorshipID(String value) {
        this.namedProfessorshipID = value;
    }

    /**
     * Gets the value of the initiallyEstablishedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInitiallyEstablishedDate() {
        return initiallyEstablishedDate;
    }

    /**
     * Sets the value of the initiallyEstablishedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInitiallyEstablishedDate(XMLGregorianCalendar value) {
        this.initiallyEstablishedDate = value;
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
