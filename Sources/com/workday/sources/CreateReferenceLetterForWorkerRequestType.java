
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Create Reference Letter for Worker Request Element
 * 
 * <p>Java class for Create_Reference_Letter_for_Worker_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Create_Reference_Letter_for_Worker_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Business_Process_Parameters" type="{urn:com.workday/bsvc}Business_Process_ParametersType" minOccurs="0"/>
 *         &lt;element name="Reference_Letter_Event_Data" type="{urn:com.workday/bsvc}Reference_Letter_Event_DataType" minOccurs="0"/>
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
@XmlType(name = "Create_Reference_Letter_for_Worker_RequestType", propOrder = {
    "businessProcessParameters",
    "referenceLetterEventData"
})
public class CreateReferenceLetterForWorkerRequestType {

    @XmlElement(name = "Business_Process_Parameters")
    protected BusinessProcessParametersType businessProcessParameters;
    @XmlElement(name = "Reference_Letter_Event_Data")
    protected ReferenceLetterEventDataType referenceLetterEventData;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the businessProcessParameters property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessProcessParametersType }
     *     
     */
    public BusinessProcessParametersType getBusinessProcessParameters() {
        return businessProcessParameters;
    }

    /**
     * Sets the value of the businessProcessParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessProcessParametersType }
     *     
     */
    public void setBusinessProcessParameters(BusinessProcessParametersType value) {
        this.businessProcessParameters = value;
    }

    /**
     * Gets the value of the referenceLetterEventData property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceLetterEventDataType }
     *     
     */
    public ReferenceLetterEventDataType getReferenceLetterEventData() {
        return referenceLetterEventData;
    }

    /**
     * Sets the value of the referenceLetterEventData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceLetterEventDataType }
     *     
     */
    public void setReferenceLetterEventData(ReferenceLetterEventDataType value) {
        this.referenceLetterEventData = value;
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
