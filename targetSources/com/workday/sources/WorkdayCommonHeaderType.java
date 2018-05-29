
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Workday_Common_HeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Workday_Common_HeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Include_Reference_Descriptors_In_Response" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Workday_Common_HeaderType", propOrder = {
    "includeReferenceDescriptorsInResponse"
})
public class WorkdayCommonHeaderType {

    @XmlElement(name = "Include_Reference_Descriptors_In_Response")
    protected Boolean includeReferenceDescriptorsInResponse;

    /**
     * Gets the value of the includeReferenceDescriptorsInResponse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeReferenceDescriptorsInResponse() {
        return includeReferenceDescriptorsInResponse;
    }

    /**
     * Sets the value of the includeReferenceDescriptorsInResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeReferenceDescriptorsInResponse(Boolean value) {
        this.includeReferenceDescriptorsInResponse = value;
    }

}
