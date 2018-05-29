
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The response group allows for the response data to be tailored to only included elements that the user is looking for.  If no response group is provided in the request then only the following elements will be returned:  Reference and Former Worker Data.
 * 
 * <p>Java class for Former_Worker_Response_GroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Former_Worker_Response_GroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Include_Former_Worker_Attachments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Former_Worker_Response_GroupType", propOrder = {
    "includeFormerWorkerAttachments"
})
public class FormerWorkerResponseGroupType {

    @XmlElement(name = "Include_Former_Worker_Attachments")
    protected Boolean includeFormerWorkerAttachments;

    /**
     * Gets the value of the includeFormerWorkerAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeFormerWorkerAttachments() {
        return includeFormerWorkerAttachments;
    }

    /**
     * Sets the value of the includeFormerWorkerAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeFormerWorkerAttachments(Boolean value) {
        this.includeFormerWorkerAttachments = value;
    }

}
