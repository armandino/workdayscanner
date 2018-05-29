
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Container for the difficulty to fill data.
 * 
 * <p>Java class for Difficulty_to_Fill_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Difficulty_to_Fill_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Difficulty_to_Fill" type="{urn:com.workday/bsvc}Difficulty_to_FillType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Difficulty_to_Fill_Response_DataType", propOrder = {
    "difficultyToFill"
})
public class DifficultyToFillResponseDataType {

    @XmlElement(name = "Difficulty_to_Fill")
    protected List<DifficultyToFillType> difficultyToFill;

    /**
     * Gets the value of the difficultyToFill property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the difficultyToFill property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDifficultyToFill().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DifficultyToFillType }
     * 
     * 
     */
    public List<DifficultyToFillType> getDifficultyToFill() {
        if (difficultyToFill == null) {
            difficultyToFill = new ArrayList<DifficultyToFillType>();
        }
        return this.difficultyToFill;
    }

}
