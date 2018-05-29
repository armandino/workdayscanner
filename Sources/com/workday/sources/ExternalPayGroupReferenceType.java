
package com.workday.sources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference element representing a unique instance of External Pay Group.
 * 
 * <p>Java class for External_Pay_Group_ReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="External_Pay_Group_ReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pay_Group_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "External_Pay_Group_ReferenceType", propOrder = {
    "payGroupID"
})
public class ExternalPayGroupReferenceType {

    @XmlElement(name = "Pay_Group_ID", required = true)
    protected String payGroupID;

    /**
     * Gets the value of the payGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayGroupID() {
        return payGroupID;
    }

    /**
     * Sets the value of the payGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayGroupID(String value) {
        this.payGroupID = value;
    }

}
