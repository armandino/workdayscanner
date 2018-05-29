
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference element representing a unique instance of External Disability Self-Identification Record
 * 
 * <p>Java class for External_Disability_Self-Identification_RecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="External_Disability_Self-Identification_RecordType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="External_Disability_Self_Identification_Record_Reference" type="{urn:com.workday/bsvc}External_Disability_Self-Identification_RecordObjectType" minOccurs="0"/>
 *         &lt;element name="External_Disability_Self_Identification_Record_Data" type="{urn:com.workday/bsvc}External_Disability_Self-Identification_Record_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "External_Disability_Self-Identification_RecordType", propOrder = {
    "externalDisabilitySelfIdentificationRecordReference",
    "externalDisabilitySelfIdentificationRecordData"
})
public class ExternalDisabilitySelfIdentificationRecordType {

    @XmlElement(name = "External_Disability_Self_Identification_Record_Reference")
    protected ExternalDisabilitySelfIdentificationRecordObjectType externalDisabilitySelfIdentificationRecordReference;
    @XmlElement(name = "External_Disability_Self_Identification_Record_Data")
    protected ExternalDisabilitySelfIdentificationRecordDataType externalDisabilitySelfIdentificationRecordData;

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
     * Gets the value of the externalDisabilitySelfIdentificationRecordData property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalDisabilitySelfIdentificationRecordDataType }
     *     
     */
    public ExternalDisabilitySelfIdentificationRecordDataType getExternalDisabilitySelfIdentificationRecordData() {
        return externalDisabilitySelfIdentificationRecordData;
    }

    /**
     * Sets the value of the externalDisabilitySelfIdentificationRecordData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalDisabilitySelfIdentificationRecordDataType }
     *     
     */
    public void setExternalDisabilitySelfIdentificationRecordData(ExternalDisabilitySelfIdentificationRecordDataType value) {
        this.externalDisabilitySelfIdentificationRecordData = value;
    }

}
