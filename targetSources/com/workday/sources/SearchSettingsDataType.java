
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Search Settings Data
 * 
 * <p>Java class for Search_Settings_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Search_Settings_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Object_Type_to_Suppress_from_Search_Reference" type="{urn:com.workday/bsvc}Unique_IdentifierObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Synonyms" type="{urn:com.workday/bsvc}Synonym_Webservice_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Search_Settings_DataType", propOrder = {
    "objectTypeToSuppressFromSearchReference",
    "synonyms"
})
public class SearchSettingsDataType {

    @XmlElement(name = "Object_Type_to_Suppress_from_Search_Reference")
    protected List<UniqueIdentifierObjectType> objectTypeToSuppressFromSearchReference;
    @XmlElement(name = "Synonyms")
    protected List<SynonymWebserviceDataType> synonyms;

    /**
     * Gets the value of the objectTypeToSuppressFromSearchReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectTypeToSuppressFromSearchReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectTypeToSuppressFromSearchReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UniqueIdentifierObjectType }
     * 
     * 
     */
    public List<UniqueIdentifierObjectType> getObjectTypeToSuppressFromSearchReference() {
        if (objectTypeToSuppressFromSearchReference == null) {
            objectTypeToSuppressFromSearchReference = new ArrayList<UniqueIdentifierObjectType>();
        }
        return this.objectTypeToSuppressFromSearchReference;
    }

    /**
     * Gets the value of the synonyms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the synonyms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSynonyms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SynonymWebserviceDataType }
     * 
     * 
     */
    public List<SynonymWebserviceDataType> getSynonyms() {
        if (synonyms == null) {
            synonyms = new ArrayList<SynonymWebserviceDataType>();
        }
        return this.synonyms;
    }

}
