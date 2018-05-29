
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response for the Assign Collective Agreement Event
 * 
 * <p>Java class for Assign_Employee_Collective_Agreement_Event_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Assign_Employee_Collective_Agreement_Event_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Assign_Employee_Collective_Agreement_Event_Reference" type="{urn:com.workday/bsvc}Unique_IdentifierObjectType" minOccurs="0"/>
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
@XmlType(name = "Assign_Employee_Collective_Agreement_Event_ResponseType", propOrder = {
    "assignEmployeeCollectiveAgreementEventReference"
})
public class AssignEmployeeCollectiveAgreementEventResponseType {

    @XmlElement(name = "Assign_Employee_Collective_Agreement_Event_Reference")
    protected UniqueIdentifierObjectType assignEmployeeCollectiveAgreementEventReference;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the assignEmployeeCollectiveAgreementEventReference property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public UniqueIdentifierObjectType getAssignEmployeeCollectiveAgreementEventReference() {
        return assignEmployeeCollectiveAgreementEventReference;
    }

    /**
     * Sets the value of the assignEmployeeCollectiveAgreementEventReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIdentifierObjectType }
     *     
     */
    public void setAssignEmployeeCollectiveAgreementEventReference(UniqueIdentifierObjectType value) {
        this.assignEmployeeCollectiveAgreementEventReference = value;
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
