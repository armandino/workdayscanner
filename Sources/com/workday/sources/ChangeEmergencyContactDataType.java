
package com.workday.sources;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for the emergency contact
 * 
 * <p>Java class for Change_Emergency_Contact_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Change_Emergency_Contact_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Emergency_Contact_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Primary" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Priority">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="12"/>
 *               &lt;fractionDigits value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Related_Person_Relationship_Reference" type="{urn:com.workday/bsvc}Related_Person_RelationshipObjectType" maxOccurs="unbounded"/>
 *         &lt;element name="Language_Reference" type="{urn:com.workday/bsvc}LanguageObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Emergency_Contact_Personal_Information_Data" type="{urn:com.workday/bsvc}Emergency_Contact_Personal_Information_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Change_Emergency_Contact_DataType", propOrder = {
    "emergencyContactID",
    "primary",
    "priority",
    "relatedPersonRelationshipReference",
    "languageReference",
    "emergencyContactPersonalInformationData"
})
public class ChangeEmergencyContactDataType {

    @XmlElement(name = "Emergency_Contact_ID")
    protected String emergencyContactID;
    @XmlElement(name = "Primary")
    protected Boolean primary;
    @XmlElement(name = "Priority", required = true)
    protected BigDecimal priority;
    @XmlElement(name = "Related_Person_Relationship_Reference", required = true)
    protected List<RelatedPersonRelationshipObjectType> relatedPersonRelationshipReference;
    @XmlElement(name = "Language_Reference")
    protected List<LanguageObjectType> languageReference;
    @XmlElement(name = "Emergency_Contact_Personal_Information_Data")
    protected EmergencyContactPersonalInformationDataType emergencyContactPersonalInformationData;

    /**
     * Gets the value of the emergencyContactID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyContactID() {
        return emergencyContactID;
    }

    /**
     * Sets the value of the emergencyContactID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyContactID(String value) {
        this.emergencyContactID = value;
    }

    /**
     * Gets the value of the primary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimary() {
        return primary;
    }

    /**
     * Sets the value of the primary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimary(Boolean value) {
        this.primary = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriority(BigDecimal value) {
        this.priority = value;
    }

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
     * {@link LanguageObjectType }
     * 
     * 
     */
    public List<LanguageObjectType> getLanguageReference() {
        if (languageReference == null) {
            languageReference = new ArrayList<LanguageObjectType>();
        }
        return this.languageReference;
    }

    /**
     * Gets the value of the emergencyContactPersonalInformationData property.
     * 
     * @return
     *     possible object is
     *     {@link EmergencyContactPersonalInformationDataType }
     *     
     */
    public EmergencyContactPersonalInformationDataType getEmergencyContactPersonalInformationData() {
        return emergencyContactPersonalInformationData;
    }

    /**
     * Sets the value of the emergencyContactPersonalInformationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmergencyContactPersonalInformationDataType }
     *     
     */
    public void setEmergencyContactPersonalInformationData(EmergencyContactPersonalInformationDataType value) {
        this.emergencyContactPersonalInformationData = value;
    }

}
