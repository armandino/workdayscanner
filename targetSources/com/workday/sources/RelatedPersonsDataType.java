
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulating element containing all Related Persons data.
 * 
 * <p>Java class for Related_Persons_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Related_Persons_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Related_Person_Data" type="{urn:com.workday/bsvc}Related_Person_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Related_Persons_DataType", propOrder = {
    "relatedPersonData"
})
public class RelatedPersonsDataType {

    @XmlElement(name = "Related_Person_Data")
    protected List<RelatedPersonDataType> relatedPersonData;

    /**
     * Gets the value of the relatedPersonData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedPersonData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedPersonData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedPersonDataType }
     * 
     * 
     */
    public List<RelatedPersonDataType> getRelatedPersonData() {
        if (relatedPersonData == null) {
            relatedPersonData = new ArrayList<RelatedPersonDataType>();
        }
        return this.relatedPersonData;
    }

}
