
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference element representing a unique instance of Government ID Type.
 * 
 * <p>Java class for Government_ID_Type_ReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Government_ID_Type_ReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Government_ID_Type_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Government_ID_Type_ReferenceType", propOrder = {
    "governmentIDTypeName"
})
public class GovernmentIDTypeReferenceType {

    @XmlElement(name = "Government_ID_Type_Name", required = true)
    protected String governmentIDTypeName;

    /**
     * Gets the value of the governmentIDTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovernmentIDTypeName() {
        return governmentIDTypeName;
    }

    /**
     * Sets the value of the governmentIDTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovernmentIDTypeName(String value) {
        this.governmentIDTypeName = value;
    }

}
