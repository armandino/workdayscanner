
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * All the data needed to create a Committee Membership Service Event
 * 
 * <p>Java class for Create_External_Committee_Member_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Create_External_Committee_Member_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Person_Name_Data" type="{urn:com.workday/bsvc}Person_Name_DataType"/>
 *         &lt;element name="Contact_Information_Data" type="{urn:com.workday/bsvc}Contact_Information_DataType"/>
 *         &lt;element name="Personal_Information_Data" type="{urn:com.workday/bsvc}Generic_Personal_Information_DataType" minOccurs="0"/>
 *         &lt;element name="Person_Identification_Data" type="{urn:com.workday/bsvc}Person_Identification_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Person_Photo_Data" type="{urn:com.workday/bsvc}Person_Photo_DataType" minOccurs="0"/>
 *         &lt;element name="Location_Contexts_Reference" type="{urn:com.workday/bsvc}Location_ContextObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Create_External_Committee_Member_DataType", propOrder = {
    "personNameData",
    "contactInformationData",
    "personalInformationData",
    "personIdentificationData",
    "personPhotoData",
    "locationContextsReference"
})
public class CreateExternalCommitteeMemberDataType {

    @XmlElement(name = "Person_Name_Data", required = true)
    protected PersonNameDataType personNameData;
    @XmlElement(name = "Contact_Information_Data", required = true)
    protected ContactInformationDataType contactInformationData;
    @XmlElement(name = "Personal_Information_Data")
    protected GenericPersonalInformationDataType personalInformationData;
    @XmlElement(name = "Person_Identification_Data")
    protected List<PersonIdentificationDataType> personIdentificationData;
    @XmlElement(name = "Person_Photo_Data")
    protected PersonPhotoDataType personPhotoData;
    @XmlElement(name = "Location_Contexts_Reference")
    protected List<LocationContextObjectType> locationContextsReference;

    /**
     * Gets the value of the personNameData property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameDataType }
     *     
     */
    public PersonNameDataType getPersonNameData() {
        return personNameData;
    }

    /**
     * Sets the value of the personNameData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameDataType }
     *     
     */
    public void setPersonNameData(PersonNameDataType value) {
        this.personNameData = value;
    }

    /**
     * Gets the value of the contactInformationData property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformationDataType }
     *     
     */
    public ContactInformationDataType getContactInformationData() {
        return contactInformationData;
    }

    /**
     * Sets the value of the contactInformationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformationDataType }
     *     
     */
    public void setContactInformationData(ContactInformationDataType value) {
        this.contactInformationData = value;
    }

    /**
     * Gets the value of the personalInformationData property.
     * 
     * @return
     *     possible object is
     *     {@link GenericPersonalInformationDataType }
     *     
     */
    public GenericPersonalInformationDataType getPersonalInformationData() {
        return personalInformationData;
    }

    /**
     * Sets the value of the personalInformationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericPersonalInformationDataType }
     *     
     */
    public void setPersonalInformationData(GenericPersonalInformationDataType value) {
        this.personalInformationData = value;
    }

    /**
     * Gets the value of the personIdentificationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personIdentificationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonIdentificationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonIdentificationDataType }
     * 
     * 
     */
    public List<PersonIdentificationDataType> getPersonIdentificationData() {
        if (personIdentificationData == null) {
            personIdentificationData = new ArrayList<PersonIdentificationDataType>();
        }
        return this.personIdentificationData;
    }

    /**
     * Gets the value of the personPhotoData property.
     * 
     * @return
     *     possible object is
     *     {@link PersonPhotoDataType }
     *     
     */
    public PersonPhotoDataType getPersonPhotoData() {
        return personPhotoData;
    }

    /**
     * Sets the value of the personPhotoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonPhotoDataType }
     *     
     */
    public void setPersonPhotoData(PersonPhotoDataType value) {
        this.personPhotoData = value;
    }

    /**
     * Gets the value of the locationContextsReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationContextsReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationContextsReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationContextObjectType }
     * 
     * 
     */
    public List<LocationContextObjectType> getLocationContextsReference() {
        if (locationContextsReference == null) {
            locationContextsReference = new ArrayList<LocationContextObjectType>();
        }
        return this.locationContextsReference;
    }

}
