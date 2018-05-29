
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing all Related Person data.
 * 
 * <p>Java class for Related_Person_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Related_Person_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Related_Person_Descriptor_Data" type="{urn:com.workday/bsvc}Related_Person_Descriptor_DataType" minOccurs="0"/>
 *         &lt;element name="Person_Data" type="{urn:com.workday/bsvc}Person_DataType"/>
 *         &lt;element name="External_Contact_Data" type="{urn:com.workday/bsvc}External_Contact_DataType" minOccurs="0"/>
 *         &lt;element name="Emergency_Contact_Data" type="{urn:com.workday/bsvc}Emergency_Contact_Data_WWSType" minOccurs="0"/>
 *         &lt;element name="Beneficiary_Data" type="{urn:com.workday/bsvc}Beneficiary_Data_WWSType" minOccurs="0"/>
 *         &lt;element name="Dependent_Data" type="{urn:com.workday/bsvc}Dependent_Data_WWSType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Related_Person_DataType", propOrder = {
    "relatedPersonDescriptorData",
    "personData",
    "externalContactData",
    "emergencyContactData",
    "beneficiaryData",
    "dependentData"
})
public class RelatedPersonDataType {

    @XmlElement(name = "Related_Person_Descriptor_Data")
    protected RelatedPersonDescriptorDataType relatedPersonDescriptorData;
    @XmlElement(name = "Person_Data", required = true)
    protected PersonDataType personData;
    @XmlElement(name = "External_Contact_Data")
    protected ExternalContactDataType externalContactData;
    @XmlElement(name = "Emergency_Contact_Data")
    protected EmergencyContactDataWWSType emergencyContactData;
    @XmlElement(name = "Beneficiary_Data")
    protected BeneficiaryDataWWSType beneficiaryData;
    @XmlElement(name = "Dependent_Data")
    protected DependentDataWWSType dependentData;

    /**
     * Gets the value of the relatedPersonDescriptorData property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedPersonDescriptorDataType }
     *     
     */
    public RelatedPersonDescriptorDataType getRelatedPersonDescriptorData() {
        return relatedPersonDescriptorData;
    }

    /**
     * Sets the value of the relatedPersonDescriptorData property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedPersonDescriptorDataType }
     *     
     */
    public void setRelatedPersonDescriptorData(RelatedPersonDescriptorDataType value) {
        this.relatedPersonDescriptorData = value;
    }

    /**
     * Gets the value of the personData property.
     * 
     * @return
     *     possible object is
     *     {@link PersonDataType }
     *     
     */
    public PersonDataType getPersonData() {
        return personData;
    }

    /**
     * Sets the value of the personData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonDataType }
     *     
     */
    public void setPersonData(PersonDataType value) {
        this.personData = value;
    }

    /**
     * Gets the value of the externalContactData property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalContactDataType }
     *     
     */
    public ExternalContactDataType getExternalContactData() {
        return externalContactData;
    }

    /**
     * Sets the value of the externalContactData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalContactDataType }
     *     
     */
    public void setExternalContactData(ExternalContactDataType value) {
        this.externalContactData = value;
    }

    /**
     * Gets the value of the emergencyContactData property.
     * 
     * @return
     *     possible object is
     *     {@link EmergencyContactDataWWSType }
     *     
     */
    public EmergencyContactDataWWSType getEmergencyContactData() {
        return emergencyContactData;
    }

    /**
     * Sets the value of the emergencyContactData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmergencyContactDataWWSType }
     *     
     */
    public void setEmergencyContactData(EmergencyContactDataWWSType value) {
        this.emergencyContactData = value;
    }

    /**
     * Gets the value of the beneficiaryData property.
     * 
     * @return
     *     possible object is
     *     {@link BeneficiaryDataWWSType }
     *     
     */
    public BeneficiaryDataWWSType getBeneficiaryData() {
        return beneficiaryData;
    }

    /**
     * Sets the value of the beneficiaryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficiaryDataWWSType }
     *     
     */
    public void setBeneficiaryData(BeneficiaryDataWWSType value) {
        this.beneficiaryData = value;
    }

    /**
     * Gets the value of the dependentData property.
     * 
     * @return
     *     possible object is
     *     {@link DependentDataWWSType }
     *     
     */
    public DependentDataWWSType getDependentData() {
        return dependentData;
    }

    /**
     * Sets the value of the dependentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DependentDataWWSType }
     *     
     */
    public void setDependentData(DependentDataWWSType value) {
        this.dependentData = value;
    }

}
