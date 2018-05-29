
package com.workday.sources;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the details about an emergency contact.
 * 
 * <p>Java class for Emergency_Contact_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Emergency_Contact_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Emergency_Contact_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Language_Reference" type="{urn:com.workday/bsvc}LanguageObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Emergency_Contact_Priority_Reference" type="{urn:com.workday/bsvc}Emergency_Contact_PriorityObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Primary" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Priority">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;totalDigits value="12"/>
 *             &lt;fractionDigits value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Emergency_Contact_DataType", propOrder = {
    "emergencyContactID",
    "languageReference",
    "emergencyContactPriorityReference"
})
public class EmergencyContactDataType {

    @XmlElement(name = "Emergency_Contact_ID")
    protected String emergencyContactID;
    @XmlElement(name = "Language_Reference")
    protected List<LanguageObjectType> languageReference;
    @XmlElement(name = "Emergency_Contact_Priority_Reference")
    protected EmergencyContactPriorityObjectType emergencyContactPriorityReference;
    @XmlAttribute(name = "Primary", namespace = "urn:com.workday/bsvc")
    protected Boolean primary;
    @XmlAttribute(name = "Priority", namespace = "urn:com.workday/bsvc")
    protected BigDecimal priority;

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
     * Gets the value of the emergencyContactPriorityReference property.
     * 
     * @return
     *     possible object is
     *     {@link EmergencyContactPriorityObjectType }
     *     
     */
    public EmergencyContactPriorityObjectType getEmergencyContactPriorityReference() {
        return emergencyContactPriorityReference;
    }

    /**
     * Sets the value of the emergencyContactPriorityReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmergencyContactPriorityObjectType }
     *     
     */
    public void setEmergencyContactPriorityReference(EmergencyContactPriorityObjectType value) {
        this.emergencyContactPriorityReference = value;
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

}
