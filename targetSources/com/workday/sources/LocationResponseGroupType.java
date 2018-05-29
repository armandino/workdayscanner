
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The response group allows for the response data to be tailored to only included elements that the user is looking for.  If no response group is provided in the request, then all groups will be returned.
 * 
 * <p>Java class for Location_Response_GroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Location_Response_GroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Include_Reference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Include_Location_Data" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location_Response_GroupType", propOrder = {
    "includeReference",
    "includeLocationData"
})
public class LocationResponseGroupType {

    @XmlElement(name = "Include_Reference")
    protected Boolean includeReference;
    @XmlElement(name = "Include_Location_Data")
    protected Boolean includeLocationData;

    /**
     * Gets the value of the includeReference property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeReference() {
        return includeReference;
    }

    /**
     * Sets the value of the includeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeReference(Boolean value) {
        this.includeReference = value;
    }

    /**
     * Gets the value of the includeLocationData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeLocationData() {
        return includeLocationData;
    }

    /**
     * Sets the value of the includeLocationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeLocationData(Boolean value) {
        this.includeLocationData = value;
    }

}
