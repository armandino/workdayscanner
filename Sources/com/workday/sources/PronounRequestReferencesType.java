
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference to the Pronoun of the person.
 * 
 * <p>Java class for Pronoun_Request_ReferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pronoun_Request_ReferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pronoun_Reference" type="{urn:com.workday/bsvc}PronounObjectType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pronoun_Request_ReferencesType", propOrder = {
    "pronounReference"
})
public class PronounRequestReferencesType {

    @XmlElement(name = "Pronoun_Reference", required = true)
    protected List<PronounObjectType> pronounReference;

    /**
     * Gets the value of the pronounReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pronounReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPronounReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PronounObjectType }
     * 
     * 
     */
    public List<PronounObjectType> getPronounReference() {
        if (pronounReference == null) {
            pronounReference = new ArrayList<PronounObjectType>();
        }
        return this.pronounReference;
    }

}
