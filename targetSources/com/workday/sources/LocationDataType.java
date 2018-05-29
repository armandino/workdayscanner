
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing all Location data.
 * 
 * <p>Java class for Location_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Location_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Integration_ID_Data" type="{urn:com.workday/bsvc}External_Integration_ID_DataType" minOccurs="0"/>
 *         &lt;element name="Location_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Time_Profile_Reference_Data" type="{urn:com.workday/bsvc}Time_Profile_Reference_DataType" minOccurs="0"/>
 *         &lt;element name="Location_Type_Reference_Data" type="{urn:com.workday/bsvc}Location_Type_Reference_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Default_Currency_Reference" type="{urn:com.workday/bsvc}CurrencyObjectType" minOccurs="0"/>
 *         &lt;element name="Trade_Name" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Worksite_ID_Code" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="21"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Contact_Data" type="{urn:com.workday/bsvc}Contact_DataType" minOccurs="0"/>
 *         &lt;element name="Container_Organization_Reference_Data" type="{urn:com.workday/bsvc}Container_Organization_Reference_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Inactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location_DataType", propOrder = {
    "integrationIDData",
    "locationName",
    "timeProfileReferenceData",
    "locationTypeReferenceData",
    "defaultCurrencyReference",
    "tradeName",
    "worksiteIDCode",
    "contactData",
    "containerOrganizationReferenceData",
    "inactive"
})
public class LocationDataType {

    @XmlElement(name = "Integration_ID_Data")
    protected ExternalIntegrationIDDataType integrationIDData;
    @XmlElement(name = "Location_Name")
    protected String locationName;
    @XmlElement(name = "Time_Profile_Reference_Data")
    protected TimeProfileReferenceDataType timeProfileReferenceData;
    @XmlElement(name = "Location_Type_Reference_Data")
    protected List<LocationTypeReferenceDataType> locationTypeReferenceData;
    @XmlElement(name = "Default_Currency_Reference")
    protected CurrencyObjectType defaultCurrencyReference;
    @XmlElement(name = "Trade_Name")
    protected String tradeName;
    @XmlElement(name = "Worksite_ID_Code")
    protected String worksiteIDCode;
    @XmlElement(name = "Contact_Data")
    protected ContactDataType contactData;
    @XmlElement(name = "Container_Organization_Reference_Data")
    protected List<ContainerOrganizationReferenceDataType> containerOrganizationReferenceData;
    @XmlElement(name = "Inactive")
    protected Boolean inactive;

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
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationName(String value) {
        this.locationName = value;
    }

    /**
     * Gets the value of the timeProfileReferenceData property.
     * 
     * @return
     *     possible object is
     *     {@link TimeProfileReferenceDataType }
     *     
     */
    public TimeProfileReferenceDataType getTimeProfileReferenceData() {
        return timeProfileReferenceData;
    }

    /**
     * Sets the value of the timeProfileReferenceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeProfileReferenceDataType }
     *     
     */
    public void setTimeProfileReferenceData(TimeProfileReferenceDataType value) {
        this.timeProfileReferenceData = value;
    }

    /**
     * Gets the value of the locationTypeReferenceData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationTypeReferenceData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationTypeReferenceData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationTypeReferenceDataType }
     * 
     * 
     */
    public List<LocationTypeReferenceDataType> getLocationTypeReferenceData() {
        if (locationTypeReferenceData == null) {
            locationTypeReferenceData = new ArrayList<LocationTypeReferenceDataType>();
        }
        return this.locationTypeReferenceData;
    }

    /**
     * Gets the value of the defaultCurrencyReference property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyObjectType }
     *     
     */
    public CurrencyObjectType getDefaultCurrencyReference() {
        return defaultCurrencyReference;
    }

    /**
     * Sets the value of the defaultCurrencyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyObjectType }
     *     
     */
    public void setDefaultCurrencyReference(CurrencyObjectType value) {
        this.defaultCurrencyReference = value;
    }

    /**
     * Gets the value of the tradeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeName() {
        return tradeName;
    }

    /**
     * Sets the value of the tradeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeName(String value) {
        this.tradeName = value;
    }

    /**
     * Gets the value of the worksiteIDCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorksiteIDCode() {
        return worksiteIDCode;
    }

    /**
     * Sets the value of the worksiteIDCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorksiteIDCode(String value) {
        this.worksiteIDCode = value;
    }

    /**
     * Gets the value of the contactData property.
     * 
     * @return
     *     possible object is
     *     {@link ContactDataType }
     *     
     */
    public ContactDataType getContactData() {
        return contactData;
    }

    /**
     * Sets the value of the contactData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDataType }
     *     
     */
    public void setContactData(ContactDataType value) {
        this.contactData = value;
    }

    /**
     * Gets the value of the containerOrganizationReferenceData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containerOrganizationReferenceData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainerOrganizationReferenceData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContainerOrganizationReferenceDataType }
     * 
     * 
     */
    public List<ContainerOrganizationReferenceDataType> getContainerOrganizationReferenceData() {
        if (containerOrganizationReferenceData == null) {
            containerOrganizationReferenceData = new ArrayList<ContainerOrganizationReferenceDataType>();
        }
        return this.containerOrganizationReferenceData;
    }

    /**
     * Gets the value of the inactive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInactive() {
        return inactive;
    }

    /**
     * Sets the value of the inactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInactive(Boolean value) {
        this.inactive = value;
    }

}
