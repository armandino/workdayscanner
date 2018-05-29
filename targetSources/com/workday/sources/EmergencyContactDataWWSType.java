
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing all Emergency Contact data.
 * 
 * <p>Java class for Emergency_Contact_Data_WWSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Emergency_Contact_Data_WWSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Integration_ID_Data" type="{urn:com.workday/bsvc}External_Integration_ID_DataType" minOccurs="0"/>
 *         &lt;element name="Language_Reference" type="{urn:com.workday/bsvc}Language_ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Emergency_Contact_Priority_Reference" type="{urn:com.workday/bsvc}Emergency_Contact_Priority_ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Emergency_Contact_Data_WWSType", propOrder = {
    "integrationIDData",
    "languageReference",
    "emergencyContactPriorityReference"
})
public class EmergencyContactDataWWSType {

    @XmlElement(name = "Integration_ID_Data")
    protected ExternalIntegrationIDDataType integrationIDData;
    @XmlElement(name = "Language_Reference")
    protected List<LanguageReferenceType> languageReference;
    @XmlElement(name = "Emergency_Contact_Priority_Reference")
    protected List<EmergencyContactPriorityReferenceType> emergencyContactPriorityReference;

    /**
     * Gets the value of the integrationIDData property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalIntegrationIDDataType }
     *     
     */
    public ExternalIntegrationIDDataType getIntegrationIDData() {
        return integrationIDData;
    }

    /**
     * Sets the value of the integrationIDData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalIntegrationIDDataType }
     *     
     */
    public void setIntegrationIDData(ExternalIntegrationIDDataType value) {
        this.integrationIDData = value;
    }

    /**
     * Gets the value of the languageReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languageReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguageReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageReferenceType }
     * 
     * 
     */
    public List<LanguageReferenceType> getLanguageReference() {
        if (languageReference == null) {
            languageReference = new ArrayList<LanguageReferenceType>();
        }
        return this.languageReference;
    }

    /**
     * Gets the value of the emergencyContactPriorityReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emergencyContactPriorityReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmergencyContactPriorityReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmergencyContactPriorityReferenceType }
     * 
     * 
     */
    public List<EmergencyContactPriorityReferenceType> getEmergencyContactPriorityReference() {
        if (emergencyContactPriorityReference == null) {
            emergencyContactPriorityReference = new ArrayList<EmergencyContactPriorityReferenceType>();
        }
        return this.emergencyContactPriorityReference;
    }

}
