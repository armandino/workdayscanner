
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the detailed information about an Ethnicity.
 * 
 * <p>Java class for Ethnicity_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ethnicity_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location_Reference" type="{urn:com.workday/bsvc}Location_ContextObjectType" minOccurs="0"/>
 *         &lt;element name="Ethnicity_Mapping_Reference" type="{urn:com.workday/bsvc}Global_Setup_Data_MappingObjectType" minOccurs="0"/>
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
@XmlType(name = "Ethnicity_DataType", propOrder = {
    "id",
    "name",
    "code",
    "description",
    "locationReference",
    "ethnicityMappingReference",
    "inactive"
})
public class EthnicityDataType {

    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Location_Reference")
    protected LocationContextObjectType locationReference;
    @XmlElement(name = "Ethnicity_Mapping_Reference")
    protected GlobalSetupDataMappingObjectType ethnicityMappingReference;
    @XmlElement(name = "Inactive")
    protected Boolean inactive;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the locationReference property.
     * 
     * @return
     *     possible object is
     *     {@link LocationContextObjectType }
     *     
     */
    public LocationContextObjectType getLocationReference() {
        return locationReference;
    }

    /**
     * Sets the value of the locationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationContextObjectType }
     *     
     */
    public void setLocationReference(LocationContextObjectType value) {
        this.locationReference = value;
    }

    /**
     * Gets the value of the ethnicityMappingReference property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalSetupDataMappingObjectType }
     *     
     */
    public GlobalSetupDataMappingObjectType getEthnicityMappingReference() {
        return ethnicityMappingReference;
    }

    /**
     * Sets the value of the ethnicityMappingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalSetupDataMappingObjectType }
     *     
     */
    public void setEthnicityMappingReference(GlobalSetupDataMappingObjectType value) {
        this.ethnicityMappingReference = value;
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
