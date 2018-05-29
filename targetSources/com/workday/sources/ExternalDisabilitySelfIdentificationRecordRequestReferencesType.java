
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Utilize the Request References element to retrieve a specific instance(s) of a Record and its data
 * 
 * <p>Java class for External_Disability_Self-Identification_Record_Request_ReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="External_Disability_Self-Identification_Record_Request_ReferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="External_Disability_Self_Identification_Record_Reference" type="{urn:com.workday/bsvc}External_Disability_Self-Identification_RecordObjectType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "External_Disability_Self-Identification_Record_Request_ReferencesType", propOrder = {
    "externalDisabilitySelfIdentificationRecordReference"
})
public class ExternalDisabilitySelfIdentificationRecordRequestReferencesType {

    @XmlElement(name = "External_Disability_Self_Identification_Record_Reference", required = true)
    protected List<ExternalDisabilitySelfIdentificationRecordObjectType> externalDisabilitySelfIdentificationRecordReference;

    /**
     * Gets the value of the externalDisabilitySelfIdentificationRecordReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalDisabilitySelfIdentificationRecordReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalDisabilitySelfIdentificationRecordReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalDisabilitySelfIdentificationRecordObjectType }
     * 
     * 
     */
    public List<ExternalDisabilitySelfIdentificationRecordObjectType> getExternalDisabilitySelfIdentificationRecordReference() {
        if (externalDisabilitySelfIdentificationRecordReference == null) {
            externalDisabilitySelfIdentificationRecordReference = new ArrayList<ExternalDisabilitySelfIdentificationRecordObjectType>();
        }
        return this.externalDisabilitySelfIdentificationRecordReference;
    }

}
