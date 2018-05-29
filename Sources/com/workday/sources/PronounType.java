
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The pronoun for a worker.
 * 
 * <p>Java class for PronounType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PronounType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pronoun_Reference" type="{urn:com.workday/bsvc}PronounObjectType" minOccurs="0"/>
 *         &lt;element name="Pronoun_Data" type="{urn:com.workday/bsvc}Pronoun_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PronounType", propOrder = {
    "pronounReference",
    "pronounData"
})
public class PronounType {

    @XmlElement(name = "Pronoun_Reference")
    protected PronounObjectType pronounReference;
    @XmlElement(name = "Pronoun_Data")
    protected List<PronounDataType> pronounData;

    /**
     * Gets the value of the pronounReference property.
     * 
     * @return
     *     possible object is
     *     {@link PronounObjectType }
     *     
     */
    public PronounObjectType getPronounReference() {
        return pronounReference;
    }

    /**
     * Sets the value of the pronounReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PronounObjectType }
     *     
     */
    public void setPronounReference(PronounObjectType value) {
        this.pronounReference = value;
    }

    /**
     * Gets the value of the pronounData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pronounData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPronounData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PronounDataType }
     * 
     * 
     */
    public List<PronounDataType> getPronounData() {
        if (pronounData == null) {
            pronounData = new ArrayList<PronounDataType>();
        }
        return this.pronounData;
    }

}
