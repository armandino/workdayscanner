
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the instructions for adding or updating a committee definition.
 * 
 * <p>Java class for Maintain_Committee_Definition_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Maintain_Committee_Definition_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Committee_Definition_Reference" type="{urn:com.workday/bsvc}CommitteeObjectType" minOccurs="0"/>
 *         &lt;element name="Committee_Definition_Data" type="{urn:com.workday/bsvc}Committee_Definition_DataType"/>
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
@XmlType(name = "Maintain_Committee_Definition_RequestType", propOrder = {
    "committeeDefinitionReference",
    "committeeDefinitionData"
})
public class MaintainCommitteeDefinitionRequestType {

    @XmlElement(name = "Committee_Definition_Reference")
    protected CommitteeObjectType committeeDefinitionReference;
    @XmlElement(name = "Committee_Definition_Data", required = true)
    protected CommitteeDefinitionDataType committeeDefinitionData;
    @XmlAttribute(name = "Add_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean addOnly;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the committeeDefinitionReference property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeObjectType }
     *     
     */
    public CommitteeObjectType getCommitteeDefinitionReference() {
        return committeeDefinitionReference;
    }

    /**
     * Sets the value of the committeeDefinitionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeObjectType }
     *     
     */
    public void setCommitteeDefinitionReference(CommitteeObjectType value) {
        this.committeeDefinitionReference = value;
    }

    /**
     * Gets the value of the committeeDefinitionData property.
     * 
     * @return
     *     possible object is
     *     {@link CommitteeDefinitionDataType }
     *     
     */
    public CommitteeDefinitionDataType getCommitteeDefinitionData() {
        return committeeDefinitionData;
    }

    /**
     * Sets the value of the committeeDefinitionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitteeDefinitionDataType }
     *     
     */
    public void setCommitteeDefinitionData(CommitteeDefinitionDataType value) {
        this.committeeDefinitionData = value;
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
