
package com.workday.sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the legal, preferred, and additional names for a person.
 * 
 * <p>Java class for Person_Name_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Person_Name_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Legal_Name_Data" type="{urn:com.workday/bsvc}Legal_Name_DataType" minOccurs="0"/>
 *         &lt;element name="Preferred_Name_Data" type="{urn:com.workday/bsvc}Preferred_Name_DataType" minOccurs="0"/>
 *         &lt;element name="Additional_Name_Data" type="{urn:com.workday/bsvc}Additional_Name_DataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person_Name_DataType", propOrder = {
    "legalNameData",
    "preferredNameData",
    "additionalNameData"
})
public class PersonNameDataType {

    @XmlElement(name = "Legal_Name_Data")
    protected LegalNameDataType legalNameData;
    @XmlElement(name = "Preferred_Name_Data")
    protected PreferredNameDataType preferredNameData;
    @XmlElement(name = "Additional_Name_Data")
    protected List<AdditionalNameDataType> additionalNameData;

    /**
     * Gets the value of the legalNameData property.
     * 
     * @return
     *     possible object is
     *     {@link LegalNameDataType }
     *     
     */
    public LegalNameDataType getLegalNameData() {
        return legalNameData;
    }

    /**
     * Sets the value of the legalNameData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalNameDataType }
     *     
     */
    public void setLegalNameData(LegalNameDataType value) {
        this.legalNameData = value;
    }

    /**
     * Gets the value of the preferredNameData property.
     * 
     * @return
     *     possible object is
     *     {@link PreferredNameDataType }
     *     
     */
    public PreferredNameDataType getPreferredNameData() {
        return preferredNameData;
    }

    /**
     * Sets the value of the preferredNameData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferredNameDataType }
     *     
     */
    public void setPreferredNameData(PreferredNameDataType value) {
        this.preferredNameData = value;
    }

    /**
     * Gets the value of the additionalNameData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalNameData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalNameData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalNameDataType }
     * 
     * 
     */
    public List<AdditionalNameDataType> getAdditionalNameData() {
        if (additionalNameData == null) {
            additionalNameData = new ArrayList<AdditionalNameDataType>();
        }
        return this.additionalNameData;
    }

}
