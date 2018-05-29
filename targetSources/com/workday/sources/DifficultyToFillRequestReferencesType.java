
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * References to Difficulty to Fill
 * 
 * <p>Java class for Difficulty_to_Fill_Request_ReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Difficulty_to_Fill_Request_ReferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Difficulty_to_Fill_Reference" type="{urn:com.workday/bsvc}Difficulty_to_FillObjectType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Difficulty_to_Fill_Request_ReferencesType", propOrder = {
    "difficultyToFillReference"
})
public class DifficultyToFillRequestReferencesType {

    @XmlElement(name = "Difficulty_to_Fill_Reference", required = true)
    protected List<DifficultyToFillObjectType> difficultyToFillReference;

    /**
     * Gets the value of the difficultyToFillReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the difficultyToFillReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDifficultyToFillReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DifficultyToFillObjectType }
     * 
     * 
     */
    public List<DifficultyToFillObjectType> getDifficultyToFillReference() {
        if (difficultyToFillReference == null) {
            difficultyToFillReference = new ArrayList<DifficultyToFillObjectType>();
        }
        return this.difficultyToFillReference;
    }

}
