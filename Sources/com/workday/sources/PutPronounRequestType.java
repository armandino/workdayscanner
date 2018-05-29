
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The request to edit pronoun data for a worker.
 * 
 * <p>Java class for Put_Pronoun_RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Put_Pronoun_RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pronoun_Reference" type="{urn:com.workday/bsvc}PronounObjectType" minOccurs="0"/>
 *         &lt;element name="Pronoun_Data" type="{urn:com.workday/bsvc}Pronoun_DataType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Add_Only" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute ref="{urn:com.workday/bsvc}version"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Put_Pronoun_RequestType", propOrder = {
    "pronounReference",
    "pronounData"
})
public class PutPronounRequestType {

    @XmlElement(name = "Pronoun_Reference")
    protected PronounObjectType pronounReference;
    @XmlElement(name = "Pronoun_Data", required = true)
    protected PronounDataType pronounData;
    @XmlAttribute(name = "Add_Only", namespace = "urn:com.workday/bsvc")
    protected Boolean addOnly;
    @XmlAttribute(name = "version", namespace = "urn:com.workday/bsvc")
    protected String version;

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
     * @return
     *     possible object is
     *     {@link PronounDataType }
     *     
     */
    public PronounDataType getPronounData() {
        return pronounData;
    }

    /**
     * Sets the value of the pronounData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PronounDataType }
     *     
     */
    public void setPronounData(PronounDataType value) {
        this.pronounData = value;
    }

    /**
     * Gets the value of the addOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddOnly() {
        return addOnly;
    }

    /**
     * Sets the value of the addOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddOnly(Boolean value) {
        this.addOnly = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
