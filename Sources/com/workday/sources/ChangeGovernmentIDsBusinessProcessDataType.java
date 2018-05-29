
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element for the Government Identifier data.
 * 
 * <p>Java class for Change_Government_IDs_Business_Process_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Change_Government_IDs_Business_Process_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Person_Reference" type="{urn:com.workday/bsvc}RoleObjectType" minOccurs="0"/>
 *         &lt;element name="Universal_ID_Reference" type="{urn:com.workday/bsvc}Universal_IdentifierObjectType" minOccurs="0"/>
 *         &lt;element name="Government_Identification_data" type="{urn:com.workday/bsvc}Government_Identification_DataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Change_Government_IDs_Business_Process_DataType", propOrder = {
    "personReference",
    "universalIDReference",
    "governmentIdentificationData"
})
public class ChangeGovernmentIDsBusinessProcessDataType {

    @XmlElement(name = "Person_Reference")
    protected RoleObjectType personReference;
    @XmlElement(name = "Universal_ID_Reference")
    protected UniversalIdentifierObjectType universalIDReference;
    @XmlElement(name = "Government_Identification_data", required = true)
    protected GovernmentIdentificationDataType governmentIdentificationData;

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
     * Gets the value of the governmentIdentificationData property.
     * 
     * @return
     *     possible object is
     *     {@link GovernmentIdentificationDataType }
     *     
     */
    public GovernmentIdentificationDataType getGovernmentIdentificationData() {
        return governmentIdentificationData;
    }

    /**
     * Sets the value of the governmentIdentificationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GovernmentIdentificationDataType }
     *     
     */
    public void setGovernmentIdentificationData(GovernmentIdentificationDataType value) {
        this.governmentIdentificationData = value;
    }

}
