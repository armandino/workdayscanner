
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper Element that includes Search Settings Data
 * 
 * <p>Java class for Search_SettingsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Search_SettingsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Search_Settings_Data" type="{urn:com.workday/bsvc}Search_Settings_DataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Search_SettingsType", propOrder = {
    "searchSettingsData"
})
public class SearchSettingsType {

    @XmlElement(name = "Search_Settings_Data")
    protected SearchSettingsDataType searchSettingsData;

    /**
     * Gets the value of the searchSettingsData property.
     * 
     * @return
     *     possible object is
     *     {@link SearchSettingsDataType }
     *     
     */
    public SearchSettingsDataType getSearchSettingsData() {
        return searchSettingsData;
    }

    /**
     * Sets the value of the searchSettingsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchSettingsDataType }
     *     
     */
    public void setSearchSettingsData(SearchSettingsDataType value) {
        this.searchSettingsData = value;
    }

}
