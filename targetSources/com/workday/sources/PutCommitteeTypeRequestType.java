
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the instructions for adding or updating a committee type.
 * 
 * <p>Java class for Put_Committee_Type_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Committee_Type_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Committee_Type_Reference" type="{urn:com.workday/bsvc}Committee_TypeObjectType" minOccurs="0"/>
 *         &lt;element name="Committee_Type_Data" type="{urn:com.workday/bsvc}Committee_Type_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Add_Only" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute ref="{urn:com.workday/bsvc}version"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Put_Committee_Type_RequestType", propOrder = {
    "committeeTypeReference",
    "committeeTypeData"
})
public class PutCommitteeTypeRequestType {

    @XmlElement(name = "Committee_Type_Reference")
    protected CommitteeTypeObjectType committeeTypeReference;
    @XmlElement(name = "Committee_Type_Data")
    protected CommitteeTypeDataType committeeTypeData;
    @XmlAttribute(name = "Add_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean addOnly;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the committeeTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeTypeObjectType }
     *     
     */
    public CommitteeTypeObjectType getCommitteeTypeReference() {
        return committeeTypeReference;
    }

    /**
     * Sets the value of the committeeTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeTypeObjectType }
     *     
     */
    public void setCommitteeTypeReference(CommitteeTypeObjectType value) {
        this.committeeTypeReference = value;
    }

    /**
     * Gets the value of the committeeTypeData property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeTypeDataType }
     *     
     */
    public CommitteeTypeDataType getCommitteeTypeData() {
        return committeeTypeData;
    }

    /**
     * Sets the value of the committeeTypeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeTypeDataType }
     *     
     */
    public void setCommitteeTypeData(CommitteeTypeDataType value) {
        this.committeeTypeData = value;
    }

    /**
     * Gets the value of the addOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddOnly() {
        return addOnly;
    }

    /**
     * Sets the value of the addOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddOnly(Boolean value) {
        this.addOnly = value;
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
