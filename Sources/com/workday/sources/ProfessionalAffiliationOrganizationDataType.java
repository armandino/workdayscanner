
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
 * Wrapper element for the Organization Professional Affiliation information.
 * 
 * <p>Java class for Professional_Affiliation_Organization_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Professional_Affiliation_Organization_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Professional_Affiliation_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remove_Professional_Affiliation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Professional_Affiliation_Reference" type="{urn:com.workday/bsvc}Professional_Affiliation_ReferenceObjectType" minOccurs="0"/>
 *         &lt;element name="Professional_Affiliation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Professional_Affiliation_Type_Reference" type="{urn:com.workday/bsvc}Professional_Affiliation_Type__All_ObjectType" minOccurs="0"/>
 *         &lt;element name="Affiliation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Professional_Affiliation_Relationship_Type_Reference" type="{urn:com.workday/bsvc}Professional_Affiliation_Relationship_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Begin_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="End_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Contact_Information_Data" type="{urn:com.workday/bsvc}Contact_Information_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Professional_Affiliation_Organization_DataType", propOrder = {
    "professionalAffiliationID",
    "removeProfessionalAffiliation",
    "professionalAffiliationReference",
    "professionalAffiliation",
    "professionalAffiliationTypeReference",
    "affiliation",
    "professionalAffiliationRelationshipTypeReference",
    "beginDate",
    "endDate",
    "contactInformationData"
})
public class ProfessionalAffiliationOrganizationDataType {

    @XmlElement(name = "Professional_Affiliation_ID")
    protected String professionalAffiliationID;
    @XmlElement(name = "Remove_Professional_Affiliation")
    protected Boolean removeProfessionalAffiliation;
    @XmlElement(name = "Professional_Affiliation_Reference")
    protected ProfessionalAffiliationReferenceObjectType professionalAffiliationReference;
    @XmlElement(name = "Professional_Affiliation")
    protected String professionalAffiliation;
    @XmlElement(name = "Professional_Affiliation_Type_Reference")
    protected ProfessionalAffiliationTypeAllObjectType professionalAffiliationTypeReference;
    @XmlElement(name = "Affiliation")
    protected String affiliation;
    @XmlElement(name = "Professional_Affiliation_Relationship_Type_Reference")
    protected ProfessionalAffiliationRelationshipTypeObjectType professionalAffiliationRelationshipTypeReference;
    @XmlElement(name = "Begin_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar beginDate;
    @XmlElement(name = "End_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "Contact_Information_Data")
    protected List<ContactInformationDataType> contactInformationData;

    /**
     * Gets the value of the professionalAffiliationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessionalAffiliationID() {
        return professionalAffiliationID;
    }

    /**
     * Sets the value of the professionalAffiliationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessionalAffiliationID(String value) {
        this.professionalAffiliationID = value;
    }

    /**
     * Gets the value of the removeProfessionalAffiliation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoveProfessionalAffiliation() {
        return removeProfessionalAffiliation;
    }

    /**
     * Sets the value of the removeProfessionalAffiliation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoveProfessionalAffiliation(Boolean value) {
        this.removeProfessionalAffiliation = value;
    }

    /**
     * Gets the value of the professionalAffiliationReference property.
     * 
     * @return
     *     possible object is
     *     {@link ProfessionalAffiliationReferenceObjectType }
     *     
     */
    public ProfessionalAffiliationReferenceObjectType getProfessionalAffiliationReference() {
        return professionalAffiliationReference;
    }

    /**
     * Sets the value of the professionalAffiliationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfessionalAffiliationReferenceObjectType }
     *     
     */
    public void setProfessionalAffiliationReference(ProfessionalAffiliationReferenceObjectType value) {
        this.professionalAffiliationReference = value;
    }

    /**
     * Gets the value of the professionalAffiliation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessionalAffiliation() {
        return professionalAffiliation;
    }

    /**
     * Sets the value of the professionalAffiliation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessionalAffiliation(String value) {
        this.professionalAffiliation = value;
    }

    /**
     * Gets the value of the professionalAffiliationTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link ProfessionalAffiliationTypeAllObjectType }
     *     
     */
    public ProfessionalAffiliationTypeAllObjectType getProfessionalAffiliationTypeReference() {
        return professionalAffiliationTypeReference;
    }

    /**
     * Sets the value of the professionalAffiliationTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfessionalAffiliationTypeAllObjectType }
     *     
     */
    public void setProfessionalAffiliationTypeReference(ProfessionalAffiliationTypeAllObjectType value) {
        this.professionalAffiliationTypeReference = value;
    }

    /**
     * Gets the value of the affiliation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffiliation() {
        return affiliation;
    }

    /**
     * Sets the value of the affiliation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffiliation(String value) {
        this.affiliation = value;
    }

    /**
     * Gets the value of the professionalAffiliationRelationshipTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link ProfessionalAffiliationRelationshipTypeObjectType }
     *     
     */
    public ProfessionalAffiliationRelationshipTypeObjectType getProfessionalAffiliationRelationshipTypeReference() {
        return professionalAffiliationRelationshipTypeReference;
    }

    /**
     * Sets the value of the professionalAffiliationRelationshipTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfessionalAffiliationRelationshipTypeObjectType }
     *     
     */
    public void setProfessionalAffiliationRelationshipTypeReference(ProfessionalAffiliationRelationshipTypeObjectType value) {
        this.professionalAffiliationRelationshipTypeReference = value;
    }

    /**
     * Gets the value of the beginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginDate() {
        return beginDate;
    }

    /**
     * Sets the value of the beginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginDate(XMLGregorianCalendar value) {
        this.beginDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the contactInformationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactInformationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactInformationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInformationDataType }
     * 
     * 
     */
    public List<ContactInformationDataType> getContactInformationData() {
        if (contactInformationData == null) {
            contactInformationData = new ArrayList<ContactInformationDataType>();
        }
        return this.contactInformationData;
    }

}
