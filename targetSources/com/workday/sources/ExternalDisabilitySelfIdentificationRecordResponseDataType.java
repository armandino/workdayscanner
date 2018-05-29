
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing all External Disability Self-Identification Record data.
 * 
 * <p>Java class for External_Disability_Self-Identification_Record_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="External_Disability_Self-Identification_Record_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="External_Disability_Self_Identification_Record" type="{urn:com.workday/bsvc}External_Disability_Self-Identification_RecordType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "External_Disability_Self-Identification_Record_Response_DataType", propOrder = {
    "externalDisabilitySelfIdentificationRecord"
})
public class ExternalDisabilitySelfIdentificationRecordResponseDataType {

    @XmlElement(name = "External_Disability_Self_Identification_Record")
    protected List<ExternalDisabilitySelfIdentificationRecordType> externalDisabilitySelfIdentificationRecord;

    /**
     * Gets the value of the externalDisabilitySelfIdentificationRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalDisabilitySelfIdentificationRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalDisabilitySelfIdentificationRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalDisabilitySelfIdentificationRecordType }
     * 
     * 
     */
    public List<ExternalDisabilitySelfIdentificationRecordType> getExternalDisabilitySelfIdentificationRecord() {
        if (externalDisabilitySelfIdentificationRecord == null) {
            externalDisabilitySelfIdentificationRecord = new ArrayList<ExternalDisabilitySelfIdentificationRecordType>();
        }
        return this.externalDisabilitySelfIdentificationRecord;
    }

}
