
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A synonym which maps a single workday term to one or more custom terms
 * 
 * <p>Java class for Synonym_Webservice_DataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Synonym_Webservice_DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Workday_Term" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Custom_Terms" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Synonym_Webservice_DataType", propOrder = {
    "workdayTerm",
    "customTerms"
})
public class SynonymWebserviceDataType {

    @XmlElement(name = "Workday_Term", required = true)
    protected String workdayTerm;
    @XmlElement(name = "Custom_Terms", required = true)
    protected String customTerms;

    /**
     * Gets the value of the workdayTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkdayTerm() {
        return workdayTerm;
    }

    /**
     * Sets the value of the workdayTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkdayTerm(String value) {
        this.workdayTerm = value;
    }

    /**
     * Gets the value of the customTerms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomTerms() {
        return customTerms;
    }

    /**
     * Sets the value of the customTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomTerms(String value) {
        this.customTerms = value;
    }

}
