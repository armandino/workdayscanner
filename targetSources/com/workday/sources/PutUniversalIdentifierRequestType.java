
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Put Request for Universal Identifiers. It's required to put a Person Reference in either Person Reference. Either place a manual Universal ID or no Universal ID, if no Universal ID is supplied it will use the Universal ID generator.
 * 
 * <p>Java class for Put_Universal_Identifier_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Universal_Identifier_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Person_Reference" type="{urn:com.workday/bsvc}RoleObjectType" minOccurs="0"/>
 *         &lt;element name="Universal_Identifier_Data" type="{urn:com.workday/bsvc}Universal_Identifier_DataType"/>
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
@XmlType(name = "Put_Universal_Identifier_RequestType", propOrder = {
    "personReference",
    "universalIdentifierData"
})
public class PutUniversalIdentifierRequestType {

    @XmlElement(name = "Person_Reference")
    protected RoleObjectType personReference;
    @XmlElement(name = "Universal_Identifier_Data", required = true)
    protected UniversalIdentifierDataType universalIdentifierData;
    @XmlAttribute(name = "Add_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean addOnly;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

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
     * Gets the value of the universalIdentifierData property.
     * 
     * @return
     *     possible object is
     *     {@link UniversalIdentifierDataType }
     *     
     */
    public UniversalIdentifierDataType getUniversalIdentifierData() {
        return universalIdentifierData;
    }

    /**
     * Sets the value of the universalIdentifierData property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniversalIdentifierDataType }
     *     
     */
    public void setUniversalIdentifierData(UniversalIdentifierDataType value) {
        this.universalIdentifierData = value;
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
