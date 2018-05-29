
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Service Center Representative Data
 * 
 * <p>Java class for Service_Center_Representative_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Service_Center_Representative_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Service_Center_Reference" type="{urn:com.workday/bsvc}Service_CenterObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Inactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Name_Data" type="{urn:com.workday/bsvc}Legal_Name_DataType" minOccurs="0"/>
 *         &lt;element name="Contact_Information_Data" type="{urn:com.workday/bsvc}Contact_Information_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Service_Center_Representative_DataType", propOrder = {
    "serviceCenterReference",
    "inactive",
    "nameData",
    "contactInformationData"
})
public class ServiceCenterRepresentativeDataType {

    @XmlElement(name = "Service_Center_Reference")
    protected List<ServiceCenterObjectType> serviceCenterReference;
    @XmlElement(name = "Inactive")
    protected Boolean inactive;
    @XmlElement(name = "Name_Data")
    protected LegalNameDataType nameData;
    @XmlElement(name = "Contact_Information_Data")
    protected ContactInformationDataType contactInformationData;
    @XmlAttribute(name = "ID", namespace = "urn:com.workday/bsvc")
    protected String id;

    /**
     * Gets the value of the serviceCenterReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceCenterReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceCenterReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceCenterObjectType }
     * 
     * 
     */
    public List<ServiceCenterObjectType> getServiceCenterReference() {
        if (serviceCenterReference == null) {
            serviceCenterReference = new ArrayList<ServiceCenterObjectType>();
        }
        return this.serviceCenterReference;
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

    /**
     * Gets the value of the nameData property.
     * 
     * @return
     *     possible object is
     *     {@link LegalNameDataType }
     *     
     */
    public LegalNameDataType getNameData() {
        return nameData;
    }

    /**
     * Sets the value of the nameData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalNameDataType }
     *     
     */
    public void setNameData(LegalNameDataType value) {
        this.nameData = value;
    }

    /**
     * Gets the value of the contactInformationData property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformationDataType }
     *     
     */
    public ContactInformationDataType getContactInformationData() {
        return contactInformationData;
    }

    /**
     * Sets the value of the contactInformationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformationDataType }
     *     
     */
    public void setContactInformationData(ContactInformationDataType value) {
        this.contactInformationData = value;
    }

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

}
