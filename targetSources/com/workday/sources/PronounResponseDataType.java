
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The pronoun response data.
 * 
 * <p>Java class for Pronoun_Response_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pronoun_Response_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pronoun" type="{urn:com.workday/bsvc}PronounType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pronoun_Response_DataType", propOrder = {
    "pronoun"
})
public class PronounResponseDataType {

    @XmlElement(name = "Pronoun")
    protected List<PronounType> pronoun;

    /**
     * Gets the value of the pronoun property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pronoun property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPronoun().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PronounType }
     * 
     * 
     */
    public List<PronounType> getPronoun() {
        if (pronoun == null) {
            pronoun = new ArrayList<PronounType>();
        }
        return this.pronoun;
    }

}
