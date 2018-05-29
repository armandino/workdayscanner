
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element to hold the data for the emergency contacts of a person
 * 
 * <p>Java class for Change_Emergency_Contacts_Business_Process_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Change_Emergency_Contacts_Business_Process_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Person_Reference" type="{urn:com.workday/bsvc}RoleObjectType"/>
 *         &lt;element name="Replace_All" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Emergency_Contacts_Reference_Data" type="{urn:com.workday/bsvc}Change_Emergency_Contacts_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Change_Emergency_Contacts_Business_Process_DataType", propOrder = {
    "personReference",
    "replaceAll",
    "emergencyContactsReferenceData"
})
public class ChangeEmergencyContactsBusinessProcessDataType {

    @XmlElement(name = "Person_Reference", required = true)
    protected RoleObjectType personReference;
    @XmlElement(name = "Replace_All")
    protected Boolean replaceAll;
    @XmlElement(name = "Emergency_Contacts_Reference_Data")
    protected List<ChangeEmergencyContactsDataType> emergencyContactsReferenceData;

    /**
     * Gets the value of the personReference property.
     * 
     * @return
     *     possible object is
     *     {@link RoleObjectType }
     *     
     */
    public RoleObjectType getPersonReference() {
        return personReference;
    }

    /**
     * Sets the value of the personReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleObjectType }
     *     
     */
    public void setPersonReference(RoleObjectType value) {
        this.personReference = value;
    }

    /**
     * Gets the value of the replaceAll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReplaceAll() {
        return replaceAll;
    }

    /**
     * Sets the value of the replaceAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReplaceAll(Boolean value) {
        this.replaceAll = value;
    }

    /**
     * Gets the value of the emergencyContactsReferenceData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emergencyContactsReferenceData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmergencyContactsReferenceData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeEmergencyContactsDataType }
     * 
     * 
     */
    public List<ChangeEmergencyContactsDataType> getEmergencyContactsReferenceData() {
        if (emergencyContactsReferenceData == null) {
            emergencyContactsReferenceData = new ArrayList<ChangeEmergencyContactsDataType>();
        }
        return this.emergencyContactsReferenceData;
    }

}
