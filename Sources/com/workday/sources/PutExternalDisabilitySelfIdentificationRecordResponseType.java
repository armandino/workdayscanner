
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response element for the Put External Disability Self-Identification Record operation.
 * 
 * <p>Java class for Put_External_Disability_Self_Identification_Record_ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_External_Disability_Self_Identification_Record_ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="External_Disability_Self_Identification_Record_Reference" type="{urn:com.workday/bsvc}External_Disability_Self-Identification_RecordObjectType" minOccurs="0"/>
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
@XmlType(name = "Put_External_Disability_Self_Identification_Record_ResponseType", propOrder = {
    "externalDisabilitySelfIdentificationRecordReference"
})
public class PutExternalDisabilitySelfIdentificationRecordResponseType {

    @XmlElement(name = "External_Disability_Self_Identification_Record_Reference")
    protected ExternalDisabilitySelfIdentificationRecordObjectType externalDisabilitySelfIdentificationRecordReference;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

    /**
     * Gets the value of the externalDisabilitySelfIdentificationRecordReference property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalDisabilitySelfIdentificationRecordObjectType }
     *     
     */
    public ExternalDisabilitySelfIdentificationRecordObjectType getExternalDisabilitySelfIdentificationRecordReference() {
        return externalDisabilitySelfIdentificationRecordReference;
    }

    /**
     * Sets the value of the externalDisabilitySelfIdentificationRecordReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalDisabilitySelfIdentificationRecordObjectType }
     *     
     */
    public void setExternalDisabilitySelfIdentificationRecordReference(ExternalDisabilitySelfIdentificationRecordObjectType value) {
        this.externalDisabilitySelfIdentificationRecordReference = value;
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
