
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request element for Put External Disability Self-Identification Record
 * 
 * <p>Java class for Put_External_Disability_Self_Identification_Record_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_External_Disability_Self_Identification_Record_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="External_Disability_Self_Identification_Record_Reference" type="{urn:com.workday/bsvc}External_Disability_Self-Identification_RecordObjectType" minOccurs="0"/>
 *         &lt;element name="External_Disability_Self_Identification_Record_Data" type="{urn:com.workday/bsvc}External_Disability_Self-Identification_Record_DataType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Delete" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute ref="{urn:com.workday/bsvc}version"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Put_External_Disability_Self_Identification_Record_RequestType", propOrder = {
    "externalDisabilitySelfIdentificationRecordReference",
    "externalDisabilitySelfIdentificationRecordData"
})
public class PutExternalDisabilitySelfIdentificationRecordRequestType {

    @XmlElement(name = "External_Disability_Self_Identification_Record_Reference")
    protected ExternalDisabilitySelfIdentificationRecordObjectType externalDisabilitySelfIdentificationRecordReference;
    @XmlElement(name = "External_Disability_Self_Identification_Record_Data", required = true)
    protected ExternalDisabilitySelfIdentificationRecordDataType externalDisabilitySelfIdentificationRecordData;
    @XmlAttribute(name = "Delete", namespace = "urn:com.workday/bsvc")
    protected Boolean delete;
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

    /**
     * Gets the value of the delete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelete() {
        return delete;
    }

    /**
     * Sets the value of the delete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelete(Boolean value) {
        this.delete = value;
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
