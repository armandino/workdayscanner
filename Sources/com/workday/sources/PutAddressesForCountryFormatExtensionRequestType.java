
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request element containing Address update information.
 * 
 * <p>Java class for Put_Addresses_for_Country_Format_Extension_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Addresses_for_Country_Format_Extension_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address_Reference" type="{urn:com.workday/bsvc}Unique_IdentifierObjectType"/>
 *         &lt;element name="Address_Data" type="{urn:com.workday/bsvc}Global_Address_DataType" maxOccurs="unbounded"/>
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
@XmlType(name = "Put_Addresses_for_Country_Format_Extension_RequestType", propOrder = {
    "addressReference",
    "addressData"
})
public class PutAddressesForCountryFormatExtensionRequestType {

    @XmlElement(name = "Address_Reference", required = true)
    protected UniqueIdentifierObjectType addressReference;
    @XmlElement(name = "Address_Data", required = true)
    protected List<GlobalAddressDataType> addressData;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the addressReference property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public UniqueIdentifierObjectType getAddressReference() {
        return addressReference;
    }

    /**
     * Sets the value of the addressReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public void setAddressReference(UniqueIdentifierObjectType value) {
        this.addressReference = value;
    }

    /**
     * Gets the value of the addressData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlobalAddressDataType }
     * 
     * 
     */
    public List<GlobalAddressDataType> getAddressData() {
        if (addressData == null) {
            addressData = new ArrayList<GlobalAddressDataType>();
        }
        return this.addressData;
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
