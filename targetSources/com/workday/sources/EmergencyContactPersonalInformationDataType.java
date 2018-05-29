
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element to hold the name and contact information of the emergency contact
 * 
 * <p>Java class for Emergency_Contact_Personal_Information_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Emergency_Contact_Personal_Information_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Person_Name_Data" type="{urn:com.workday/bsvc}Person_Name_DataType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Emergency_Contact_Personal_Information_DataType", propOrder = {
    "personNameData",
    "contactInformationData"
})
public class EmergencyContactPersonalInformationDataType {

    @XmlElement(name = "Person_Name_Data")
    protected List<PersonNameDataType> personNameData;
    @XmlElement(name = "Contact_Information_Data")
    protected List<ContactInformationDataType> contactInformationData;

    /**
     * Gets the value of the personNameData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personNameData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonNameData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonNameDataType }
     * 
     * 
     */
    public List<PersonNameDataType> getPersonNameData() {
        if (personNameData == null) {
            personNameData = new ArrayList<PersonNameDataType>();
        }
        return this.personNameData;
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
