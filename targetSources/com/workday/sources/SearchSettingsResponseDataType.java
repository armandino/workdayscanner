
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper element that includes Search Settings data
 * 
 * <p>Java class for Search_Settings_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Search_Settings_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Search_Settings" type="{urn:com.workday/bsvc}Search_SettingsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Search_Settings_Response_DataType", propOrder = {
    "searchSettings"
})
public class SearchSettingsResponseDataType {

    @XmlElement(name = "Search_Settings")
    protected SearchSettingsType searchSettings;

    /**
     * Gets the value of the searchSettings property.
     * 
     * @return
     *     possible object is
     *     {@link SearchSettingsType }
     *     
     */
    public SearchSettingsType getSearchSettings() {
        return searchSettings;
    }

    /**
     * Sets the value of the searchSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchSettingsType }
     *     
     */
    public void setSearchSettings(SearchSettingsType value) {
        this.searchSettings = value;
    }

}
