
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference element representing a unique instance of Compensation Element.
 * 
 * <p>Java class for Compensation_Element_ReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Compensation_Element_ReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Compensation_Element_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Compensation_Element_ReferenceType", propOrder = {
    "compensationElementName"
})
public class CompensationElementReferenceType {

    @XmlElement(name = "Compensation_Element_Name", required = true)
    protected String compensationElementName;

    /**
     * Gets the value of the compensationElementName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompensationElementName() {
        return compensationElementName;
    }

    /**
     * Sets the value of the compensationElementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompensationElementName(String value) {
        this.compensationElementName = value;
    }

}
