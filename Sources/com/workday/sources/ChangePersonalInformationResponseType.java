
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Responds with the Event ID for the Personal Information Change Event.
 * 
 * <p>Java class for Change_Personal_Information_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Change_Personal_Information_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Personal_Information_Change_Event_Reference" type="{urn:com.workday/bsvc}Unique_IdentifierObjectType" minOccurs="0"/>
 *         &lt;element name="Personal_Information_Data" type="{urn:com.workday/bsvc}Change_Personal_Information_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{urn:com.workday/bsvc}version"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Change_Personal_Information_ResponseType", propOrder = {
    "personalInformationChangeEventReference",
    "personalInformationData"
})
public class ChangePersonalInformationResponseType {

    @XmlElement(name = "Personal_Information_Change_Event_Reference")
    protected UniqueIdentifierObjectType personalInformationChangeEventReference;
    @XmlElement(name = "Personal_Information_Data")
    protected ChangePersonalInformationDataType personalInformationData;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the personalInformationChangeEventReference property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public UniqueIdentifierObjectType getPersonalInformationChangeEventReference() {
        return personalInformationChangeEventReference;
    }

    /**
     * Sets the value of the personalInformationChangeEventReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public void setPersonalInformationChangeEventReference(UniqueIdentifierObjectType value) {
        this.personalInformationChangeEventReference = value;
    }

    /**
     * Gets the value of the personalInformationData property.
     * 
     * @return
     *     possible object is
     *     {@link ChangePersonalInformationDataType }
     *     
     */
    public ChangePersonalInformationDataType getPersonalInformationData() {
        return personalInformationData;
    }

    /**
     * Sets the value of the personalInformationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangePersonalInformationDataType }
     *     
     */
    public void setPersonalInformationData(ChangePersonalInformationDataType value) {
        this.personalInformationData = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
