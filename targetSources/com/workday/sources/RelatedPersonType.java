
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing all Related Person data.
 * 
 * <p>Java class for Related_PersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Related_PersonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Related_Person_Relationship_Reference" type="{urn:com.workday/bsvc}Related_Person_RelationshipObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Person_Reference" type="{urn:com.workday/bsvc}Unique_IdentifierObjectType" minOccurs="0"/>
 *         &lt;element name="Personal_Data" type="{urn:com.workday/bsvc}Personal_Information_DataType" minOccurs="0"/>
 *         &lt;element name="Dependent" type="{urn:com.workday/bsvc}DependentType" minOccurs="0"/>
 *         &lt;element name="Beneficiary" type="{urn:com.workday/bsvc}BeneficiaryType" minOccurs="0"/>
 *         &lt;element name="Emergency_Contact" type="{urn:com.workday/bsvc}Old_Emergency_ContactType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Related_PersonType", propOrder = {
    "relatedPersonRelationshipReference",
    "personReference",
    "personalData",
    "dependent",
    "beneficiary",
    "emergencyContact"
})
public class RelatedPersonType {

    @XmlElement(name = "Related_Person_Relationship_Reference")
    protected List<RelatedPersonRelationshipObjectType> relatedPersonRelationshipReference;
    @XmlElement(name = "Person_Reference")
    protected UniqueIdentifierObjectType personReference;
    @XmlElement(name = "Personal_Data")
    protected PersonalInformationDataType personalData;
    @XmlElement(name = "Dependent")
    protected DependentType dependent;
    @XmlElement(name = "Beneficiary")
    protected BeneficiaryType beneficiary;
    @XmlElement(name = "Emergency_Contact")
    protected OldEmergencyContactType emergencyContact;

    /**
     * Gets the value of the relatedPersonRelationshipReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedPersonRelationshipReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedPersonRelationshipReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedPersonRelationshipObjectType }
     * 
     * 
     */
    public List<RelatedPersonRelationshipObjectType> getRelatedPersonRelationshipReference() {
        if (relatedPersonRelationshipReference == null) {
            relatedPersonRelationshipReference = new ArrayList<RelatedPersonRelationshipObjectType>();
        }
        return this.relatedPersonRelationshipReference;
    }

    /**
     * Gets the value of the personReference property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public UniqueIdentifierObjectType getPersonReference() {
        return personReference;
    }

    /**
     * Sets the value of the personReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public void setPersonReference(UniqueIdentifierObjectType value) {
        this.personReference = value;
    }

    /**
     * Gets the value of the personalData property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalInformationDataType }
     *     
     */
    public PersonalInformationDataType getPersonalData() {
        return personalData;
    }

    /**
     * Sets the value of the personalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalInformationDataType }
     *     
     */
    public void setPersonalData(PersonalInformationDataType value) {
        this.personalData = value;
    }

    /**
     * Gets the value of the dependent property.
     * 
     * @return
     *     possible object is
     *     {@link DependentType }
     *     
     */
    public DependentType getDependent() {
        return dependent;
    }

    /**
     * Sets the value of the dependent property.
     * 
     * @param value
     *     allowed object is
     *     {@link DependentType }
     *     
     */
    public void setDependent(DependentType value) {
        this.dependent = value;
    }

    /**
     * Gets the value of the beneficiary property.
     * 
     * @return
     *     possible object is
     *     {@link BeneficiaryType }
     *     
     */
    public BeneficiaryType getBeneficiary() {
        return beneficiary;
    }

    /**
     * Sets the value of the beneficiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficiaryType }
     *     
     */
    public void setBeneficiary(BeneficiaryType value) {
        this.beneficiary = value;
    }

    /**
     * Gets the value of the emergencyContact property.
     * 
     * @return
     *     possible object is
     *     {@link OldEmergencyContactType }
     *     
     */
    public OldEmergencyContactType getEmergencyContact() {
        return emergencyContact;
    }

    /**
     * Sets the value of the emergencyContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link OldEmergencyContactType }
     *     
     */
    public void setEmergencyContact(OldEmergencyContactType value) {
        this.emergencyContact = value;
    }

}
