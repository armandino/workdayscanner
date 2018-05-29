
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Wrapper element for the Home Contact Change business process web service
 * 
 * <p>Java class for Change_Home_Contact_Information_Business_Process_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Change_Home_Contact_Information_Business_Process_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Person_Reference" type="{urn:com.workday/bsvc}RoleObjectType" minOccurs="0"/>
 *         &lt;element name="Universal_ID_Reference" type="{urn:com.workday/bsvc}Universal_IdentifierObjectType" minOccurs="0"/>
 *         &lt;element name="Event_Effective_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Person_Contact_Information_Data" type="{urn:com.workday/bsvc}Person_Contact_Information_DataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Change_Home_Contact_Information_Business_Process_DataType", propOrder = {
    "personReference",
    "universalIDReference",
    "eventEffectiveDate",
    "personContactInformationData"
})
public class ChangeHomeContactInformationBusinessProcessDataType {

    @XmlElement(name = "Person_Reference")
    protected RoleObjectType personReference;
    @XmlElement(name = "Universal_ID_Reference")
    protected UniversalIdentifierObjectType universalIDReference;
    @XmlElement(name = "Event_Effective_Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eventEffectiveDate;
    @XmlElement(name = "Person_Contact_Information_Data", required = true)
    protected PersonContactInformationDataType personContactInformationData;

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
     * Gets the value of the universalIDReference property.
     * 
     * @return
     *     possible object is
     *     {@link UniversalIdentifierObjectType }
     *     
     */
    public UniversalIdentifierObjectType getUniversalIDReference() {
        return universalIDReference;
    }

    /**
     * Sets the value of the universalIDReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniversalIdentifierObjectType }
     *     
     */
    public void setUniversalIDReference(UniversalIdentifierObjectType value) {
        this.universalIDReference = value;
    }

    /**
     * Gets the value of the eventEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventEffectiveDate() {
        return eventEffectiveDate;
    }

    /**
     * Sets the value of the eventEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventEffectiveDate(XMLGregorianCalendar value) {
        this.eventEffectiveDate = value;
    }

    /**
     * Gets the value of the personContactInformationData property.
     * 
     * @return
     *     possible object is
     *     {@link PersonContactInformationDataType }
     *     
     */
    public PersonContactInformationDataType getPersonContactInformationData() {
        return personContactInformationData;
    }

    /**
     * Sets the value of the personContactInformationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonContactInformationDataType }
     *     
     */
    public void setPersonContactInformationData(PersonContactInformationDataType value) {
        this.personContactInformationData = value;
    }

}
