
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Wrapper element for Language Achievement information
 * 
 * <p>Java class for Language_Achievement_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Language_Achievement_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Language_Reference" type="{urn:com.workday/bsvc}LanguageObjectType"/>
 *         &lt;element name="Remove_Language" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Native_Language" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Language_Ability" type="{urn:com.workday/bsvc}Language_AbilityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Assessed_On" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Assessed_by_Worker_Reference" type="{urn:com.workday/bsvc}RoleObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Language_Achievement_DataType", propOrder = {
    "languageReference",
    "removeLanguage",
    "nativeLanguage",
    "languageAbility",
    "assessedOn",
    "note",
    "assessedByWorkerReference"
})
public class LanguageAchievementDataType {

    @XmlElement(name = "Language_Reference", required = true)
    protected LanguageObjectType languageReference;
    @XmlElement(name = "Remove_Language")
    protected Boolean removeLanguage;
    @XmlElement(name = "Native_Language")
    protected Boolean nativeLanguage;
    @XmlElement(name = "Language_Ability")
    protected List<LanguageAbilityType> languageAbility;
    @XmlElement(name = "Assessed_On")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar assessedOn;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "Assessed_by_Worker_Reference")
    protected RoleObjectType assessedByWorkerReference;

    /**
     * Gets the value of the languageReference property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageObjectType }
     *     
     */
    public LanguageObjectType getLanguageReference() {
        return languageReference;
    }

    /**
     * Sets the value of the languageReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageObjectType }
     *     
     */
    public void setLanguageReference(LanguageObjectType value) {
        this.languageReference = value;
    }

    /**
     * Gets the value of the removeLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoveLanguage() {
        return removeLanguage;
    }

    /**
     * Sets the value of the removeLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoveLanguage(Boolean value) {
        this.removeLanguage = value;
    }

    /**
     * Gets the value of the nativeLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNativeLanguage() {
        return nativeLanguage;
    }

    /**
     * Sets the value of the nativeLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNativeLanguage(Boolean value) {
        this.nativeLanguage = value;
    }

    /**
     * Gets the value of the languageAbility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languageAbility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguageAbility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageAbilityType }
     * 
     * 
     */
    public List<LanguageAbilityType> getLanguageAbility() {
        if (languageAbility == null) {
            languageAbility = new ArrayList<LanguageAbilityType>();
        }
        return this.languageAbility;
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
     * Gets the value of the assessedByWorkerReference property.
     * 
     * @return
     *     possible object is
     *     {@link RoleObjectType }
     *     
     */
    public RoleObjectType getAssessedByWorkerReference() {
        return assessedByWorkerReference;
    }

    /**
     * Sets the value of the assessedByWorkerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleObjectType }
     *     
     */
    public void setAssessedByWorkerReference(RoleObjectType value) {
        this.assessedByWorkerReference = value;
    }

}
