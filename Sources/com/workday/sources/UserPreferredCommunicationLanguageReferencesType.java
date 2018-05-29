
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * User Preferred Communication Language References
 * 
 * <p>Java class for User_Preferred_Communication_Language_ReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="User_Preferred_Communication_Language_ReferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Country_Reference" type="{urn:com.workday/bsvc}CountryObjectType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User_Preferred_Communication_Language_ReferencesType", propOrder = {
    "countryReference"
})
public class UserPreferredCommunicationLanguageReferencesType {

    @XmlElement(name = "Country_Reference", required = true)
    protected List<CountryObjectType> countryReference;

    /**
     * Gets the value of the countryReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryObjectType }
     * 
     * 
     */
    public List<CountryObjectType> getCountryReference() {
        if (countryReference == null) {
            countryReference = new ArrayList<CountryObjectType>();
        }
        return this.countryReference;
    }

}
