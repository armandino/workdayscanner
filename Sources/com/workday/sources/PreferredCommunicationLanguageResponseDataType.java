
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Preferred Communication Language Response Data
 * 
 * <p>Java class for Preferred_Communication_Language_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Preferred_Communication_Language_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Preferred_Communication_Languages" type="{urn:com.workday/bsvc}Preferred_Communication_LanguagesType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Preferred_Communication_Language_Response_DataType", propOrder = {
    "preferredCommunicationLanguages"
})
public class PreferredCommunicationLanguageResponseDataType {

    @XmlElement(name = "Preferred_Communication_Languages")
    protected List<PreferredCommunicationLanguagesType> preferredCommunicationLanguages;

    /**
     * Gets the value of the preferredCommunicationLanguages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preferredCommunicationLanguages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreferredCommunicationLanguages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreferredCommunicationLanguagesType }
     * 
     * 
     */
    public List<PreferredCommunicationLanguagesType> getPreferredCommunicationLanguages() {
        if (preferredCommunicationLanguages == null) {
            preferredCommunicationLanguages = new ArrayList<PreferredCommunicationLanguagesType>();
        }
        return this.preferredCommunicationLanguages;
    }

}
